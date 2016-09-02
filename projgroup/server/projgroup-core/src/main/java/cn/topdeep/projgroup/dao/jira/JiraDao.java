/**
 * 
 */
package cn.topdeep.projgroup.dao.jira;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import cn.topdeep.projgroup.entity.base.BaseMapper;
import cn.topdeep.projgroup.entity.jiradb.BusinessLogicManage;
import cn.topdeep.projgroup.entity.jiradb.ViewTopdeepBean;
import cn.topdeep.projgroup.entity.jiradb.ViewTopdeepBeanExample;
import cn.topdeep.projgroup.entity.jiraview.ViewTopdeepBeanExMapper;

/**
 * @author niexin
 *
 */
@Repository("jiraDao")
public class JiraDao extends BusinessLogicManage {

	@Autowired
	@Qualifier("jiraSqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	@Autowired(required = false)
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}

	public Long getNextSequValue(String sequName) {
		BaseMapper mapperImpl = (BaseMapper) getSqlSession().getMapper(BaseMapper.class);
		return mapperImpl.getNextSequValue(sequName);
	}

	public int getLastInsertValue() {
		BaseMapper mapperImpl = (BaseMapper) getSqlSession().getMapper(BaseMapper.class);
		Long id = mapperImpl.getLastInsertValue();
		if (id == null) {
			return 0;
		}
		return id.intValue();
	}

	public void checkDatabase() {
		BaseMapper mapperImpl = (BaseMapper) getSqlSession().getMapper(BaseMapper.class);
		mapperImpl.checkDatabase();
	}

	public int queryCount(String sql) {
		BaseMapper mapperImpl = (BaseMapper) getSqlSession().getMapper(BaseMapper.class);
		Long count = mapperImpl.queryCount(sql);
		if (count == null) {
			return 0;
		}
		return count.intValue();
	}

	public Object queryScalar(String sql) {
		BaseMapper mapperImpl = (BaseMapper) getSqlSession().getMapper(BaseMapper.class);
		Object obj = mapperImpl.queryScalar(sql);
		return obj;
	}

	protected String getPageSql(String sql, int beginRow, int endRow, String order) {
		return "select * from (" + sql + ") TTT___ order by " + order + " limit " + beginRow + "," + (endRow - beginRow);
	}

	public List<ViewTopdeepBean> viewTopdeepBeanSelectObjectsSumByExample(ViewTopdeepBeanExample condition) {
		ViewTopdeepBeanExMapper mapperImpl = (ViewTopdeepBeanExMapper) getSqlSession().getMapper(ViewTopdeepBeanExMapper.class);
		return mapperImpl.selectSumByExample(condition);
	}

	private static Hashtable<Class, Hashtable<String, Method>> objMetaList = new Hashtable<Class, Hashtable<String, Method>>();

	private Method getObjSetMethod(Class type, String fieldName) {
		Hashtable<String, Method> methodList = objMetaList.get(type);
		if (methodList == null) {
			synchronized (objMetaList) {
				methodList = objMetaList.get(type);
				if (methodList == null) {
					methodList = new Hashtable<String, Method>();
					// create
					Method[] methods = type.getMethods();
					for (Method method : methods) {
						if (method.getName().startsWith("set") && (method.getParameterTypes().length == 1)) {
							String key = method.getName().toLowerCase().substring(3);
							if (!methodList.containsKey(key)) {
								methodList.put(key, method);
							}
							// if(method.getParameterTypes()[0] == boolean.class){
							//
							// }
						}
					}
					objMetaList.put(type, methodList);
				}
			}
		}
		String fieldKey = fieldName.toLowerCase().replaceAll("_", "");
		if (methodList.containsKey(fieldKey)) {
			return methodList.get(fieldKey);
		} else {
			if (fieldKey.startsWith("is")) {
				fieldKey = fieldKey.substring(2);
				if (methodList.containsKey(fieldKey)) {
					return methodList.get(fieldKey);
				}
			}
			return null;
		}
	}

	private void readObj(Object obj, Map<String, Object> data) {
		for (String key : data.keySet()) {
			String fieldName = key;
			Method method = getObjSetMethod(obj.getClass(), fieldName);
			if (method != null) {
				try {
					method.invoke(obj, data.get(key));
				} catch (Exception e) {
					logger.error(e.getMessage(), e);
				}
			} else {
				logger.warn("can't read " + fieldName + " value");
			}
		}

	}

	public <T> List<T> queryEntity(Class<T> type, String sql) throws SQLException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException {
		// sql = "SHOW VARIABLES LIKE 'CHAR%';";
		BaseMapper mapperImpl = (BaseMapper) getSqlSession().getMapper(BaseMapper.class);
		List<Map<String, Object>> resultList = mapperImpl.queryResult(sql);
		List<T> list = new ArrayList<T>();
		for (Map<String, Object> item : resultList) {
			T obj = type.newInstance();
			readObj(obj, item);
			list.add(obj);
		}
		return list;
	}

	public <T> List<T> queryEntity(Class<T> type, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// return getDataVisit().queryEntity(type, sql, pageIndex, rowsOfPage, orderField, order);
		int beginRow = pageIndex * rowsOfPage;
		int endRow = beginRow + rowsOfPage;
		return queryEntity(type, getPageSql(sql, beginRow, endRow, orderField + " " + order));
	}

	public <T> T querySingleEntity(Class<T> type, String sql) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException,
			InvocationTargetException {
		List<T> list = queryEntity(type, sql);
		if (list.size() > 0) {
			return list.get(0);
		} else {
			return null;
		}
	}

}
