package cn.topdeep.projgroup.entity.db;
import java.util.*;
import common.util.*;
import java.sql.*;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import common.cache2.*;
/**
 * 基本的商业应用层代码，可扩展
 */
public abstract class BaseBiz {
	
	public abstract BusinessLogicManage getDao();
	
	/**
	 * 插入一个对象CheckDevice到数据库中
	 * <param name="checkDevice">需要插入的新对象</param>
	 */
	public int checkDeviceInsert(CheckDevice checkDevice) {
		int ret = this.getDao().checkDeviceInsert(checkDevice);
		String kvalue = "";
		kvalue = (kvalue + checkDevice.getId());
		this.operatesLogSimpleAdd("T_CHECK_DEVICE", "插入", "ID", kvalue, checkDevice, ret);
		return ret;
	}
	
	/**
	 * <param name="checkDevice">从数据库中删除一个对象CheckDevice</param>
	 * <param name="AId">PK</param>
	 */
	public int checkDeviceDeleteByPrimaryKey(String AId) {
		int ret = this.getDao().checkDeviceDeleteByPrimaryKey(AId);
		String kvalue = "";
		kvalue = (kvalue + AId);
		this.operatesLogSimpleAdd("T_CHECK_DEVICE", "删除", "ID", kvalue, AId, ret);
		return ret;
	}
	
	/**
	 * <param name="checkDevice">从数据库中删除一个对象CheckDevice</param>
	 */
	public int checkDeviceDeleteByCondition(CheckDeviceExample checkDeviceQueryCondition) {
		int ret = this.getDao().checkDeviceDeleteByCondition(checkDeviceQueryCondition);
		String kvalue = this.getCheckDeviceExampleConditionSql(checkDeviceQueryCondition);
		this.operatesLogSimpleAdd("T_CHECK_DEVICE", "条件删除", "conditionSql", kvalue, checkDeviceQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象CheckDevice到数据库中
	 * <param name="checkDevice">需要更新的CheckDevice</param>
	 */
	public int checkDeviceUpdate(CheckDevice checkDevice) {
		int ret = this.getDao().checkDeviceUpdate(checkDevice);
		String kvalue = "";
		kvalue = (kvalue + checkDevice.getId());
		this.operatesLogSimpleAdd("T_CHECK_DEVICE", "更新", "ID", kvalue, checkDevice, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性CheckDevice到数据库中
	 * <param name="checkDevice">需要更新的CheckDevice</param>
	 */
	public int checkDeviceUpdateSelective(CheckDevice checkDevice) {
		int ret = this.getDao().checkDeviceUpdateSelective(checkDevice);
		String kvalue = "";
		kvalue = (kvalue + checkDevice.getId());
		this.operatesLogSimpleAdd("T_CHECK_DEVICE", "部分更新", "ID", kvalue, checkDevice, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象CheckDevice到数据库中
	 * <param name="checkDeviceQueryCondition">附加的条件</param>
	 * <param name="checkDevice">需要更新的CheckDevice</param>
	 */
	public int checkDeviceUpdateByCondition(CheckDevice checkDevice, CheckDeviceExample checkDeviceQueryCondition) {
		int ret = this.getDao().checkDeviceUpdateByCondition(checkDevice, checkDeviceQueryCondition);
		String kvalue = this.getCheckDeviceExampleConditionSql(checkDeviceQueryCondition);
		this.operatesLogSimpleAdd("T_CHECK_DEVICE", "条件更新", "conditionSql", kvalue, checkDevice, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象CheckDevice到数据库中
	 * <param name="checkDeviceQueryCondition">附加的条件</param>
	 * <param name="checkDevice">需要更新的CheckDevice</param>
	 */
	public int checkDeviceUpdateSelectiveByCondition(CheckDevice checkDevice, CheckDeviceExample checkDeviceQueryCondition) {
		int ret = this.getDao().checkDeviceUpdateSelectiveByCondition(checkDevice, checkDeviceQueryCondition);
		String kvalue = this.getCheckDeviceExampleConditionSql(checkDeviceQueryCondition);
		this.operatesLogSimpleAdd("T_CHECK_DEVICE", "批量部分更新", "conditionSql", kvalue, checkDevice, ret);
		return ret;
	}
	
	public String getCheckDeviceExampleConditionSql(CheckDeviceExample checkDeviceQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < checkDeviceQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			CheckDeviceExample.Criteria item = checkDeviceQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					CheckDeviceExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="checkDevice">从数据库中查询一个对象CheckDevice</param>
	 * <param name="AId">PK</param>
	 */
	public CheckDevice checkDeviceSelectByPrimaryKey(String AId) throws CacheException {
		return this.getDao().checkDeviceSelectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="checkDeviceQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<CheckDevice> checkDeviceSelectObjects(CheckDeviceExample checkDeviceQueryCondition) throws CacheException {
		return this.getDao().checkDeviceSelectObjects(checkDeviceQueryCondition);
	}
	
	/**
	 * <param name="checkDeviceQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int checkDeviceQuerySelectObjectsCount(CheckDeviceExample checkDeviceQueryCondition) throws CacheException {
		return this.getDao().checkDeviceQuerySelectObjectsCount(checkDeviceQueryCondition);
	}
	
	/**
	 * 插入一个对象ClientActivation到数据库中
	 * <param name="clientActivation">需要插入的新对象</param>
	 */
	public int clientActivationInsert(ClientActivation clientActivation) {
		int ret = this.getDao().clientActivationInsert(clientActivation);
		String kvalue = "";
		kvalue = (kvalue + clientActivation.getId());
		this.operatesLogSimpleAdd("T_CLIENT_ACTIVATION", "插入", "ID", kvalue, clientActivation, ret);
		return ret;
	}
	
	/**
	 * <param name="clientActivation">从数据库中删除一个对象ClientActivation</param>
	 * <param name="AId">PK</param>
	 */
	public int clientActivationDeleteByPrimaryKey(String AId) {
		int ret = this.getDao().clientActivationDeleteByPrimaryKey(AId);
		String kvalue = "";
		kvalue = (kvalue + AId);
		this.operatesLogSimpleAdd("T_CLIENT_ACTIVATION", "删除", "ID", kvalue, AId, ret);
		return ret;
	}
	
	/**
	 * <param name="clientActivation">从数据库中删除一个对象ClientActivation</param>
	 */
	public int clientActivationDeleteByCondition(ClientActivationExample clientActivationQueryCondition) {
		int ret = this.getDao().clientActivationDeleteByCondition(clientActivationQueryCondition);
		String kvalue = this.getClientActivationExampleConditionSql(clientActivationQueryCondition);
		this.operatesLogSimpleAdd("T_CLIENT_ACTIVATION", "条件删除", "conditionSql", kvalue, clientActivationQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象ClientActivation到数据库中
	 * <param name="clientActivation">需要更新的ClientActivation</param>
	 */
	public int clientActivationUpdate(ClientActivation clientActivation) {
		int ret = this.getDao().clientActivationUpdate(clientActivation);
		String kvalue = "";
		kvalue = (kvalue + clientActivation.getId());
		this.operatesLogSimpleAdd("T_CLIENT_ACTIVATION", "更新", "ID", kvalue, clientActivation, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性ClientActivation到数据库中
	 * <param name="clientActivation">需要更新的ClientActivation</param>
	 */
	public int clientActivationUpdateSelective(ClientActivation clientActivation) {
		int ret = this.getDao().clientActivationUpdateSelective(clientActivation);
		String kvalue = "";
		kvalue = (kvalue + clientActivation.getId());
		this.operatesLogSimpleAdd("T_CLIENT_ACTIVATION", "部分更新", "ID", kvalue, clientActivation, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象ClientActivation到数据库中
	 * <param name="clientActivationQueryCondition">附加的条件</param>
	 * <param name="clientActivation">需要更新的ClientActivation</param>
	 */
	public int clientActivationUpdateByCondition(ClientActivation clientActivation, ClientActivationExample clientActivationQueryCondition) {
		int ret = this.getDao().clientActivationUpdateByCondition(clientActivation, clientActivationQueryCondition);
		String kvalue = this.getClientActivationExampleConditionSql(clientActivationQueryCondition);
		this.operatesLogSimpleAdd("T_CLIENT_ACTIVATION", "条件更新", "conditionSql", kvalue, clientActivation, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象ClientActivation到数据库中
	 * <param name="clientActivationQueryCondition">附加的条件</param>
	 * <param name="clientActivation">需要更新的ClientActivation</param>
	 */
	public int clientActivationUpdateSelectiveByCondition(ClientActivation clientActivation, ClientActivationExample clientActivationQueryCondition) {
		int ret = this.getDao().clientActivationUpdateSelectiveByCondition(clientActivation, clientActivationQueryCondition);
		String kvalue = this.getClientActivationExampleConditionSql(clientActivationQueryCondition);
		this.operatesLogSimpleAdd("T_CLIENT_ACTIVATION", "批量部分更新", "conditionSql", kvalue, clientActivation, ret);
		return ret;
	}
	
	public String getClientActivationExampleConditionSql(ClientActivationExample clientActivationQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < clientActivationQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			ClientActivationExample.Criteria item = clientActivationQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					ClientActivationExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="clientActivation">从数据库中查询一个对象ClientActivation</param>
	 * <param name="AId">PK</param>
	 */
	public ClientActivation clientActivationSelectByPrimaryKey(String AId) throws CacheException {
		return this.getDao().clientActivationSelectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="clientActivationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<ClientActivation> clientActivationSelectObjects(ClientActivationExample clientActivationQueryCondition) throws CacheException {
		return this.getDao().clientActivationSelectObjects(clientActivationQueryCondition);
	}
	
	/**
	 * <param name="clientActivationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int clientActivationQuerySelectObjectsCount(ClientActivationExample clientActivationQueryCondition) throws CacheException {
		return this.getDao().clientActivationQuerySelectObjectsCount(clientActivationQueryCondition);
	}
	
	/**
	 * 插入一个对象CodeBuild到数据库中
	 * <param name="codeBuild">需要插入的新对象</param>
	 */
	public int codeBuildInsert(CodeBuild codeBuild) {
		int ret = this.getDao().codeBuildInsert(codeBuild);
		String kvalue = "";
		kvalue = (kvalue + codeBuild.getBuildId());
		this.operatesLogSimpleAdd("T_CODE_BUILD", "插入", "BUILD_ID", kvalue, codeBuild, ret);
		return ret;
	}
	
	/**
	 * <param name="codeBuild">从数据库中删除一个对象CodeBuild</param>
	 * <param name="ABuildId">¹¹½¨±êÊ¶</param>
	 */
	public int codeBuildDeleteByPrimaryKey(int ABuildId) {
		int ret = this.getDao().codeBuildDeleteByPrimaryKey(ABuildId);
		String kvalue = "";
		kvalue = (kvalue + ABuildId);
		this.operatesLogSimpleAdd("T_CODE_BUILD", "删除", "BUILD_ID", kvalue, ABuildId, ret);
		return ret;
	}
	
	/**
	 * <param name="codeBuild">从数据库中删除一个对象CodeBuild</param>
	 */
	public int codeBuildDeleteByCondition(CodeBuildExample codeBuildQueryCondition) {
		int ret = this.getDao().codeBuildDeleteByCondition(codeBuildQueryCondition);
		String kvalue = this.getCodeBuildExampleConditionSql(codeBuildQueryCondition);
		this.operatesLogSimpleAdd("T_CODE_BUILD", "条件删除", "conditionSql", kvalue, codeBuildQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象CodeBuild到数据库中
	 * <param name="codeBuild">需要更新的CodeBuild</param>
	 */
	public int codeBuildUpdate(CodeBuild codeBuild) {
		int ret = this.getDao().codeBuildUpdate(codeBuild);
		String kvalue = "";
		kvalue = (kvalue + codeBuild.getBuildId());
		this.operatesLogSimpleAdd("T_CODE_BUILD", "更新", "BUILD_ID", kvalue, codeBuild, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性CodeBuild到数据库中
	 * <param name="codeBuild">需要更新的CodeBuild</param>
	 */
	public int codeBuildUpdateSelective(CodeBuild codeBuild) {
		int ret = this.getDao().codeBuildUpdateSelective(codeBuild);
		String kvalue = "";
		kvalue = (kvalue + codeBuild.getBuildId());
		this.operatesLogSimpleAdd("T_CODE_BUILD", "部分更新", "BUILD_ID", kvalue, codeBuild, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象CodeBuild到数据库中
	 * <param name="codeBuildQueryCondition">附加的条件</param>
	 * <param name="codeBuild">需要更新的CodeBuild</param>
	 */
	public int codeBuildUpdateByCondition(CodeBuild codeBuild, CodeBuildExample codeBuildQueryCondition) {
		int ret = this.getDao().codeBuildUpdateByCondition(codeBuild, codeBuildQueryCondition);
		String kvalue = this.getCodeBuildExampleConditionSql(codeBuildQueryCondition);
		this.operatesLogSimpleAdd("T_CODE_BUILD", "条件更新", "conditionSql", kvalue, codeBuild, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象CodeBuild到数据库中
	 * <param name="codeBuildQueryCondition">附加的条件</param>
	 * <param name="codeBuild">需要更新的CodeBuild</param>
	 */
	public int codeBuildUpdateSelectiveByCondition(CodeBuild codeBuild, CodeBuildExample codeBuildQueryCondition) {
		int ret = this.getDao().codeBuildUpdateSelectiveByCondition(codeBuild, codeBuildQueryCondition);
		String kvalue = this.getCodeBuildExampleConditionSql(codeBuildQueryCondition);
		this.operatesLogSimpleAdd("T_CODE_BUILD", "批量部分更新", "conditionSql", kvalue, codeBuild, ret);
		return ret;
	}
	
	public String getCodeBuildExampleConditionSql(CodeBuildExample codeBuildQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < codeBuildQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			CodeBuildExample.Criteria item = codeBuildQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					CodeBuildExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="codeBuild">从数据库中查询一个对象CodeBuild</param>
	 * <param name="ABuildId">¹¹½¨±êÊ¶</param>
	 */
	public CodeBuild codeBuildSelectByPrimaryKey(int ABuildId) throws CacheException {
		return this.getDao().codeBuildSelectByPrimaryKey(ABuildId);
	}
	
	/**
	 * <param name="codeBuildQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<CodeBuild> codeBuildSelectObjects(CodeBuildExample codeBuildQueryCondition) throws CacheException {
		return this.getDao().codeBuildSelectObjects(codeBuildQueryCondition);
	}
	
	/**
	 * <param name="codeBuildQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int codeBuildQuerySelectObjectsCount(CodeBuildExample codeBuildQueryCondition) throws CacheException {
		return this.getDao().codeBuildQuerySelectObjectsCount(codeBuildQueryCondition);
	}
	
	/**
	 * 插入一个对象CodeBuildLog到数据库中
	 * <param name="codeBuildLog">需要插入的新对象</param>
	 */
	public int codeBuildLogInsert(CodeBuildLog codeBuildLog) {
		int ret = this.getDao().codeBuildLogInsert(codeBuildLog);
		String kvalue = "";
		kvalue = (kvalue + codeBuildLog.getBuildLogId());
		this.operatesLogSimpleAdd("T_CODE_BUILD_LOG", "插入", "BUILD_LOG_ID", kvalue, codeBuildLog, ret);
		return ret;
	}
	
	/**
	 * <param name="codeBuildLog">从数据库中删除一个对象CodeBuildLog</param>
	 * <param name="ABuildLogId">¹¹½¨±êÊ¶</param>
	 */
	public int codeBuildLogDeleteByPrimaryKey(int ABuildLogId) {
		int ret = this.getDao().codeBuildLogDeleteByPrimaryKey(ABuildLogId);
		String kvalue = "";
		kvalue = (kvalue + ABuildLogId);
		this.operatesLogSimpleAdd("T_CODE_BUILD_LOG", "删除", "BUILD_LOG_ID", kvalue, ABuildLogId, ret);
		return ret;
	}
	
	/**
	 * <param name="codeBuildLog">从数据库中删除一个对象CodeBuildLog</param>
	 */
	public int codeBuildLogDeleteByCondition(CodeBuildLogExample codeBuildLogQueryCondition) {
		int ret = this.getDao().codeBuildLogDeleteByCondition(codeBuildLogQueryCondition);
		String kvalue = this.getCodeBuildLogExampleConditionSql(codeBuildLogQueryCondition);
		this.operatesLogSimpleAdd("T_CODE_BUILD_LOG", "条件删除", "conditionSql", kvalue, codeBuildLogQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象CodeBuildLog到数据库中
	 * <param name="codeBuildLog">需要更新的CodeBuildLog</param>
	 */
	public int codeBuildLogUpdate(CodeBuildLog codeBuildLog) {
		int ret = this.getDao().codeBuildLogUpdate(codeBuildLog);
		String kvalue = "";
		kvalue = (kvalue + codeBuildLog.getBuildLogId());
		this.operatesLogSimpleAdd("T_CODE_BUILD_LOG", "更新", "BUILD_LOG_ID", kvalue, codeBuildLog, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性CodeBuildLog到数据库中
	 * <param name="codeBuildLog">需要更新的CodeBuildLog</param>
	 */
	public int codeBuildLogUpdateSelective(CodeBuildLog codeBuildLog) {
		int ret = this.getDao().codeBuildLogUpdateSelective(codeBuildLog);
		String kvalue = "";
		kvalue = (kvalue + codeBuildLog.getBuildLogId());
		this.operatesLogSimpleAdd("T_CODE_BUILD_LOG", "部分更新", "BUILD_LOG_ID", kvalue, codeBuildLog, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象CodeBuildLog到数据库中
	 * <param name="codeBuildLogQueryCondition">附加的条件</param>
	 * <param name="codeBuildLog">需要更新的CodeBuildLog</param>
	 */
	public int codeBuildLogUpdateByCondition(CodeBuildLog codeBuildLog, CodeBuildLogExample codeBuildLogQueryCondition) {
		int ret = this.getDao().codeBuildLogUpdateByCondition(codeBuildLog, codeBuildLogQueryCondition);
		String kvalue = this.getCodeBuildLogExampleConditionSql(codeBuildLogQueryCondition);
		this.operatesLogSimpleAdd("T_CODE_BUILD_LOG", "条件更新", "conditionSql", kvalue, codeBuildLog, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象CodeBuildLog到数据库中
	 * <param name="codeBuildLogQueryCondition">附加的条件</param>
	 * <param name="codeBuildLog">需要更新的CodeBuildLog</param>
	 */
	public int codeBuildLogUpdateSelectiveByCondition(CodeBuildLog codeBuildLog, CodeBuildLogExample codeBuildLogQueryCondition) {
		int ret = this.getDao().codeBuildLogUpdateSelectiveByCondition(codeBuildLog, codeBuildLogQueryCondition);
		String kvalue = this.getCodeBuildLogExampleConditionSql(codeBuildLogQueryCondition);
		this.operatesLogSimpleAdd("T_CODE_BUILD_LOG", "批量部分更新", "conditionSql", kvalue, codeBuildLog, ret);
		return ret;
	}
	
	public String getCodeBuildLogExampleConditionSql(CodeBuildLogExample codeBuildLogQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < codeBuildLogQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			CodeBuildLogExample.Criteria item = codeBuildLogQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					CodeBuildLogExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="codeBuildLog">从数据库中查询一个对象CodeBuildLog</param>
	 * <param name="ABuildLogId">¹¹½¨±êÊ¶</param>
	 */
	public CodeBuildLog codeBuildLogSelectByPrimaryKey(int ABuildLogId) throws CacheException {
		return this.getDao().codeBuildLogSelectByPrimaryKey(ABuildLogId);
	}
	
	/**
	 * <param name="codeBuildLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<CodeBuildLog> codeBuildLogSelectObjects(CodeBuildLogExample codeBuildLogQueryCondition) throws CacheException {
		return this.getDao().codeBuildLogSelectObjects(codeBuildLogQueryCondition);
	}
	
	/**
	 * <param name="codeBuildLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int codeBuildLogQuerySelectObjectsCount(CodeBuildLogExample codeBuildLogQueryCondition) throws CacheException {
		return this.getDao().codeBuildLogQuerySelectObjectsCount(codeBuildLogQueryCondition);
	}
	
	/**
	 * 插入一个对象CodeBuildProcedure到数据库中
	 * <param name="codeBuildProcedure">需要插入的新对象</param>
	 */
	public int codeBuildProcedureInsert(CodeBuildProcedure codeBuildProcedure) {
		int ret = this.getDao().codeBuildProcedureInsert(codeBuildProcedure);
		String kvalue = "";
		kvalue = (kvalue + codeBuildProcedure.getBuildProcedureId());
		this.operatesLogSimpleAdd("T_CODE_BUILD_PROCEDURE", "插入", "BUILD_PROCEDURE_ID", kvalue, codeBuildProcedure, ret);
		return ret;
	}
	
	/**
	 * <param name="codeBuildProcedure">从数据库中删除一个对象CodeBuildProcedure</param>
	 * <param name="ABuildProcedureId">¹¹½¨¹ý³Ì±êÊ¶</param>
	 */
	public int codeBuildProcedureDeleteByPrimaryKey(int ABuildProcedureId) {
		int ret = this.getDao().codeBuildProcedureDeleteByPrimaryKey(ABuildProcedureId);
		String kvalue = "";
		kvalue = (kvalue + ABuildProcedureId);
		this.operatesLogSimpleAdd("T_CODE_BUILD_PROCEDURE", "删除", "BUILD_PROCEDURE_ID", kvalue, ABuildProcedureId, ret);
		return ret;
	}
	
	/**
	 * <param name="codeBuildProcedure">从数据库中删除一个对象CodeBuildProcedure</param>
	 */
	public int codeBuildProcedureDeleteByCondition(CodeBuildProcedureExample codeBuildProcedureQueryCondition) {
		int ret = this.getDao().codeBuildProcedureDeleteByCondition(codeBuildProcedureQueryCondition);
		String kvalue = this.getCodeBuildProcedureExampleConditionSql(codeBuildProcedureQueryCondition);
		this.operatesLogSimpleAdd("T_CODE_BUILD_PROCEDURE", "条件删除", "conditionSql", kvalue, codeBuildProcedureQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象CodeBuildProcedure到数据库中
	 * <param name="codeBuildProcedure">需要更新的CodeBuildProcedure</param>
	 */
	public int codeBuildProcedureUpdate(CodeBuildProcedure codeBuildProcedure) {
		int ret = this.getDao().codeBuildProcedureUpdate(codeBuildProcedure);
		String kvalue = "";
		kvalue = (kvalue + codeBuildProcedure.getBuildProcedureId());
		this.operatesLogSimpleAdd("T_CODE_BUILD_PROCEDURE", "更新", "BUILD_PROCEDURE_ID", kvalue, codeBuildProcedure, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性CodeBuildProcedure到数据库中
	 * <param name="codeBuildProcedure">需要更新的CodeBuildProcedure</param>
	 */
	public int codeBuildProcedureUpdateSelective(CodeBuildProcedure codeBuildProcedure) {
		int ret = this.getDao().codeBuildProcedureUpdateSelective(codeBuildProcedure);
		String kvalue = "";
		kvalue = (kvalue + codeBuildProcedure.getBuildProcedureId());
		this.operatesLogSimpleAdd("T_CODE_BUILD_PROCEDURE", "部分更新", "BUILD_PROCEDURE_ID", kvalue, codeBuildProcedure, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象CodeBuildProcedure到数据库中
	 * <param name="codeBuildProcedureQueryCondition">附加的条件</param>
	 * <param name="codeBuildProcedure">需要更新的CodeBuildProcedure</param>
	 */
	public int codeBuildProcedureUpdateByCondition(CodeBuildProcedure codeBuildProcedure, CodeBuildProcedureExample codeBuildProcedureQueryCondition) {
		int ret = this.getDao().codeBuildProcedureUpdateByCondition(codeBuildProcedure, codeBuildProcedureQueryCondition);
		String kvalue = this.getCodeBuildProcedureExampleConditionSql(codeBuildProcedureQueryCondition);
		this.operatesLogSimpleAdd("T_CODE_BUILD_PROCEDURE", "条件更新", "conditionSql", kvalue, codeBuildProcedure, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象CodeBuildProcedure到数据库中
	 * <param name="codeBuildProcedureQueryCondition">附加的条件</param>
	 * <param name="codeBuildProcedure">需要更新的CodeBuildProcedure</param>
	 */
	public int codeBuildProcedureUpdateSelectiveByCondition(CodeBuildProcedure codeBuildProcedure, CodeBuildProcedureExample codeBuildProcedureQueryCondition) {
		int ret = this.getDao().codeBuildProcedureUpdateSelectiveByCondition(codeBuildProcedure, codeBuildProcedureQueryCondition);
		String kvalue = this.getCodeBuildProcedureExampleConditionSql(codeBuildProcedureQueryCondition);
		this.operatesLogSimpleAdd("T_CODE_BUILD_PROCEDURE", "批量部分更新", "conditionSql", kvalue, codeBuildProcedure, ret);
		return ret;
	}
	
	public String getCodeBuildProcedureExampleConditionSql(CodeBuildProcedureExample codeBuildProcedureQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < codeBuildProcedureQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			CodeBuildProcedureExample.Criteria item = codeBuildProcedureQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					CodeBuildProcedureExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="codeBuildProcedure">从数据库中查询一个对象CodeBuildProcedure</param>
	 * <param name="ABuildProcedureId">¹¹½¨¹ý³Ì±êÊ¶</param>
	 */
	public CodeBuildProcedure codeBuildProcedureSelectByPrimaryKey(int ABuildProcedureId) throws CacheException {
		return this.getDao().codeBuildProcedureSelectByPrimaryKey(ABuildProcedureId);
	}
	
	/**
	 * <param name="codeBuildProcedureQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<CodeBuildProcedure> codeBuildProcedureSelectObjects(CodeBuildProcedureExample codeBuildProcedureQueryCondition) throws CacheException {
		return this.getDao().codeBuildProcedureSelectObjects(codeBuildProcedureQueryCondition);
	}
	
	/**
	 * <param name="codeBuildProcedureQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int codeBuildProcedureQuerySelectObjectsCount(CodeBuildProcedureExample codeBuildProcedureQueryCondition) throws CacheException {
		return this.getDao().codeBuildProcedureQuerySelectObjectsCount(codeBuildProcedureQueryCondition);
	}
	
	/**
	 * 插入一个对象CodeBuildProperty到数据库中
	 * <param name="codeBuildProperty">需要插入的新对象</param>
	 */
	public int codeBuildPropertyInsert(CodeBuildProperty codeBuildProperty) {
		int ret = this.getDao().codeBuildPropertyInsert(codeBuildProperty);
		String kvalue = "";
		kvalue = (kvalue + codeBuildProperty.getBuildPropertyId());
		this.operatesLogSimpleAdd("T_CODE_BUILD_PROPERTY", "插入", "BUILD_PROPERTY_ID", kvalue, codeBuildProperty, ret);
		return ret;
	}
	
	/**
	 * <param name="codeBuildProperty">从数据库中删除一个对象CodeBuildProperty</param>
	 * <param name="ABuildPropertyId">ÊôÐÔ±êÊ¶</param>
	 */
	public int codeBuildPropertyDeleteByPrimaryKey(int ABuildPropertyId) {
		int ret = this.getDao().codeBuildPropertyDeleteByPrimaryKey(ABuildPropertyId);
		String kvalue = "";
		kvalue = (kvalue + ABuildPropertyId);
		this.operatesLogSimpleAdd("T_CODE_BUILD_PROPERTY", "删除", "BUILD_PROPERTY_ID", kvalue, ABuildPropertyId, ret);
		return ret;
	}
	
	/**
	 * <param name="codeBuildProperty">从数据库中删除一个对象CodeBuildProperty</param>
	 */
	public int codeBuildPropertyDeleteByCondition(CodeBuildPropertyExample codeBuildPropertyQueryCondition) {
		int ret = this.getDao().codeBuildPropertyDeleteByCondition(codeBuildPropertyQueryCondition);
		String kvalue = this.getCodeBuildPropertyExampleConditionSql(codeBuildPropertyQueryCondition);
		this.operatesLogSimpleAdd("T_CODE_BUILD_PROPERTY", "条件删除", "conditionSql", kvalue, codeBuildPropertyQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象CodeBuildProperty到数据库中
	 * <param name="codeBuildProperty">需要更新的CodeBuildProperty</param>
	 */
	public int codeBuildPropertyUpdate(CodeBuildProperty codeBuildProperty) {
		int ret = this.getDao().codeBuildPropertyUpdate(codeBuildProperty);
		String kvalue = "";
		kvalue = (kvalue + codeBuildProperty.getBuildPropertyId());
		this.operatesLogSimpleAdd("T_CODE_BUILD_PROPERTY", "更新", "BUILD_PROPERTY_ID", kvalue, codeBuildProperty, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性CodeBuildProperty到数据库中
	 * <param name="codeBuildProperty">需要更新的CodeBuildProperty</param>
	 */
	public int codeBuildPropertyUpdateSelective(CodeBuildProperty codeBuildProperty) {
		int ret = this.getDao().codeBuildPropertyUpdateSelective(codeBuildProperty);
		String kvalue = "";
		kvalue = (kvalue + codeBuildProperty.getBuildPropertyId());
		this.operatesLogSimpleAdd("T_CODE_BUILD_PROPERTY", "部分更新", "BUILD_PROPERTY_ID", kvalue, codeBuildProperty, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象CodeBuildProperty到数据库中
	 * <param name="codeBuildPropertyQueryCondition">附加的条件</param>
	 * <param name="codeBuildProperty">需要更新的CodeBuildProperty</param>
	 */
	public int codeBuildPropertyUpdateByCondition(CodeBuildProperty codeBuildProperty, CodeBuildPropertyExample codeBuildPropertyQueryCondition) {
		int ret = this.getDao().codeBuildPropertyUpdateByCondition(codeBuildProperty, codeBuildPropertyQueryCondition);
		String kvalue = this.getCodeBuildPropertyExampleConditionSql(codeBuildPropertyQueryCondition);
		this.operatesLogSimpleAdd("T_CODE_BUILD_PROPERTY", "条件更新", "conditionSql", kvalue, codeBuildProperty, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象CodeBuildProperty到数据库中
	 * <param name="codeBuildPropertyQueryCondition">附加的条件</param>
	 * <param name="codeBuildProperty">需要更新的CodeBuildProperty</param>
	 */
	public int codeBuildPropertyUpdateSelectiveByCondition(CodeBuildProperty codeBuildProperty, CodeBuildPropertyExample codeBuildPropertyQueryCondition) {
		int ret = this.getDao().codeBuildPropertyUpdateSelectiveByCondition(codeBuildProperty, codeBuildPropertyQueryCondition);
		String kvalue = this.getCodeBuildPropertyExampleConditionSql(codeBuildPropertyQueryCondition);
		this.operatesLogSimpleAdd("T_CODE_BUILD_PROPERTY", "批量部分更新", "conditionSql", kvalue, codeBuildProperty, ret);
		return ret;
	}
	
	public String getCodeBuildPropertyExampleConditionSql(CodeBuildPropertyExample codeBuildPropertyQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < codeBuildPropertyQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			CodeBuildPropertyExample.Criteria item = codeBuildPropertyQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					CodeBuildPropertyExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="codeBuildProperty">从数据库中查询一个对象CodeBuildProperty</param>
	 * <param name="ABuildPropertyId">ÊôÐÔ±êÊ¶</param>
	 */
	public CodeBuildProperty codeBuildPropertySelectByPrimaryKey(int ABuildPropertyId) throws CacheException {
		return this.getDao().codeBuildPropertySelectByPrimaryKey(ABuildPropertyId);
	}
	
	/**
	 * <param name="codeBuildPropertyQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<CodeBuildProperty> codeBuildPropertySelectObjects(CodeBuildPropertyExample codeBuildPropertyQueryCondition) throws CacheException {
		return this.getDao().codeBuildPropertySelectObjects(codeBuildPropertyQueryCondition);
	}
	
	/**
	 * <param name="codeBuildPropertyQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int codeBuildPropertyQuerySelectObjectsCount(CodeBuildPropertyExample codeBuildPropertyQueryCondition) throws CacheException {
		return this.getDao().codeBuildPropertyQuerySelectObjectsCount(codeBuildPropertyQueryCondition);
	}
	
	/**
	 * 插入一个对象DepartMent到数据库中
	 * <param name="departMent">需要插入的新对象</param>
	 */
	public int departMentInsert(DepartMent departMent) {
		int ret = this.getDao().departMentInsert(departMent);
		String kvalue = "";
		kvalue = (kvalue + departMent.getDepartMentId());
		this.operatesLogSimpleAdd("T_DEPART_MENT", "插入", "DEPART_MENT_ID", kvalue, departMent, ret);
		return ret;
	}
	
	/**
	 * <param name="departMent">从数据库中删除一个对象DepartMent</param>
	 * <param name="ADepartMentId">²¿ÃÅID</param>
	 */
	public int departMentDeleteByPrimaryKey(int ADepartMentId) {
		int ret = this.getDao().departMentDeleteByPrimaryKey(ADepartMentId);
		String kvalue = "";
		kvalue = (kvalue + ADepartMentId);
		this.operatesLogSimpleAdd("T_DEPART_MENT", "删除", "DEPART_MENT_ID", kvalue, ADepartMentId, ret);
		return ret;
	}
	
	/**
	 * <param name="departMent">从数据库中删除一个对象DepartMent</param>
	 */
	public int departMentDeleteByCondition(DepartMentExample departMentQueryCondition) {
		int ret = this.getDao().departMentDeleteByCondition(departMentQueryCondition);
		String kvalue = this.getDepartMentExampleConditionSql(departMentQueryCondition);
		this.operatesLogSimpleAdd("T_DEPART_MENT", "条件删除", "conditionSql", kvalue, departMentQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象DepartMent到数据库中
	 * <param name="departMent">需要更新的DepartMent</param>
	 */
	public int departMentUpdate(DepartMent departMent) {
		int ret = this.getDao().departMentUpdate(departMent);
		String kvalue = "";
		kvalue = (kvalue + departMent.getDepartMentId());
		this.operatesLogSimpleAdd("T_DEPART_MENT", "更新", "DEPART_MENT_ID", kvalue, departMent, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性DepartMent到数据库中
	 * <param name="departMent">需要更新的DepartMent</param>
	 */
	public int departMentUpdateSelective(DepartMent departMent) {
		int ret = this.getDao().departMentUpdateSelective(departMent);
		String kvalue = "";
		kvalue = (kvalue + departMent.getDepartMentId());
		this.operatesLogSimpleAdd("T_DEPART_MENT", "部分更新", "DEPART_MENT_ID", kvalue, departMent, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象DepartMent到数据库中
	 * <param name="departMentQueryCondition">附加的条件</param>
	 * <param name="departMent">需要更新的DepartMent</param>
	 */
	public int departMentUpdateByCondition(DepartMent departMent, DepartMentExample departMentQueryCondition) {
		int ret = this.getDao().departMentUpdateByCondition(departMent, departMentQueryCondition);
		String kvalue = this.getDepartMentExampleConditionSql(departMentQueryCondition);
		this.operatesLogSimpleAdd("T_DEPART_MENT", "条件更新", "conditionSql", kvalue, departMent, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象DepartMent到数据库中
	 * <param name="departMentQueryCondition">附加的条件</param>
	 * <param name="departMent">需要更新的DepartMent</param>
	 */
	public int departMentUpdateSelectiveByCondition(DepartMent departMent, DepartMentExample departMentQueryCondition) {
		int ret = this.getDao().departMentUpdateSelectiveByCondition(departMent, departMentQueryCondition);
		String kvalue = this.getDepartMentExampleConditionSql(departMentQueryCondition);
		this.operatesLogSimpleAdd("T_DEPART_MENT", "批量部分更新", "conditionSql", kvalue, departMent, ret);
		return ret;
	}
	
	public String getDepartMentExampleConditionSql(DepartMentExample departMentQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < departMentQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			DepartMentExample.Criteria item = departMentQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					DepartMentExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="departMent">从数据库中查询一个对象DepartMent</param>
	 * <param name="ADepartMentId">²¿ÃÅID</param>
	 */
	public DepartMent departMentSelectByPrimaryKey(int ADepartMentId) throws CacheException {
		return this.getDao().departMentSelectByPrimaryKey(ADepartMentId);
	}
	
	/**
	 * <param name="departMentQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<DepartMent> departMentSelectObjects(DepartMentExample departMentQueryCondition) throws CacheException {
		return this.getDao().departMentSelectObjects(departMentQueryCondition);
	}
	
	/**
	 * <param name="departMentQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int departMentQuerySelectObjectsCount(DepartMentExample departMentQueryCondition) throws CacheException {
		return this.getDao().departMentQuerySelectObjectsCount(departMentQueryCondition);
	}
	
	/**
	 * 插入一个对象DepartMentUser到数据库中
	 * <param name="departMentUser">需要插入的新对象</param>
	 */
	public int departMentUserInsert(DepartMentUserKey departMentUser) {
		int ret = this.getDao().departMentUserInsert(departMentUser);
		String kvalue = "";
		kvalue = (kvalue + departMentUser.getDepartMentId());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + departMentUser.getUserId());
		this.operatesLogSimpleAdd("T_DEPART_MENT_USER", "插入", "DEPART_MENT_ID,USER_ID", kvalue, departMentUser, ret);
		return ret;
	}
	
	/**
	 * <param name="departMentUser">从数据库中删除一个对象DepartMentUser</param>
	 * <param name="ADepartMentUserKey"> 主键类</param>
	 */
	public int departMentUserDeleteByPrimaryKey(DepartMentUserKey ADepartMentUserKey) {
		int ret = this.getDao().departMentUserDeleteByPrimaryKey(ADepartMentUserKey);
		String kvalue = "";
		kvalue = (kvalue + ADepartMentUserKey.getDepartMentId());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + ADepartMentUserKey.getUserId());
		this.operatesLogSimpleAdd("T_DEPART_MENT_USER", "删除", "DEPART_MENT_ID,USER_ID", kvalue, ADepartMentUserKey, ret);
		return ret;
	}
	
	/**
	 * <param name="departMentUser">从数据库中删除一个对象DepartMentUser</param>
	 */
	public int departMentUserDeleteByCondition(DepartMentUserExample departMentUserQueryCondition) {
		int ret = this.getDao().departMentUserDeleteByCondition(departMentUserQueryCondition);
		String kvalue = this.getDepartMentUserExampleConditionSql(departMentUserQueryCondition);
		this.operatesLogSimpleAdd("T_DEPART_MENT_USER", "条件删除", "conditionSql", kvalue, departMentUserQueryCondition, ret);
		return ret;
	}
	
	public String getDepartMentUserExampleConditionSql(DepartMentUserExample departMentUserQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < departMentUserQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			DepartMentUserExample.Criteria item = departMentUserQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					DepartMentUserExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="departMentUserQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<DepartMentUserKey> departMentUserSelectObjects(DepartMentUserExample departMentUserQueryCondition) throws CacheException {
		return this.getDao().departMentUserSelectObjects(departMentUserQueryCondition);
	}
	
	/**
	 * <param name="departMentUserQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int departMentUserQuerySelectObjectsCount(DepartMentUserExample departMentUserQueryCondition) throws CacheException {
		return this.getDao().departMentUserQuerySelectObjectsCount(departMentUserQueryCondition);
	}
	
	/**
	 * 插入一个对象FuncParams到数据库中
	 * <param name="funcParams">需要插入的新对象</param>
	 */
	public int funcParamsInsert(FuncParams funcParams) {
		int ret = this.getDao().funcParamsInsert(funcParams);
		String kvalue = "";
		kvalue = (kvalue + funcParams.getParamId());
		this.operatesLogSimpleAdd("T_FUNC_PARAMS", "插入", "PARAM_ID", kvalue, funcParams, ret);
		return ret;
	}
	
	/**
	 * <param name="funcParams">从数据库中删除一个对象FuncParams</param>
	 * <param name="AParamId">²ÎÊý±êÊ¶</param>
	 */
	public int funcParamsDeleteByPrimaryKey(int AParamId) {
		int ret = this.getDao().funcParamsDeleteByPrimaryKey(AParamId);
		String kvalue = "";
		kvalue = (kvalue + AParamId);
		this.operatesLogSimpleAdd("T_FUNC_PARAMS", "删除", "PARAM_ID", kvalue, AParamId, ret);
		return ret;
	}
	
	/**
	 * <param name="funcParams">从数据库中删除一个对象FuncParams</param>
	 */
	public int funcParamsDeleteByCondition(FuncParamsExample funcParamsQueryCondition) {
		int ret = this.getDao().funcParamsDeleteByCondition(funcParamsQueryCondition);
		String kvalue = this.getFuncParamsExampleConditionSql(funcParamsQueryCondition);
		this.operatesLogSimpleAdd("T_FUNC_PARAMS", "条件删除", "conditionSql", kvalue, funcParamsQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象FuncParams到数据库中
	 * <param name="funcParams">需要更新的FuncParams</param>
	 */
	public int funcParamsUpdate(FuncParams funcParams) {
		int ret = this.getDao().funcParamsUpdate(funcParams);
		String kvalue = "";
		kvalue = (kvalue + funcParams.getParamId());
		this.operatesLogSimpleAdd("T_FUNC_PARAMS", "更新", "PARAM_ID", kvalue, funcParams, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性FuncParams到数据库中
	 * <param name="funcParams">需要更新的FuncParams</param>
	 */
	public int funcParamsUpdateSelective(FuncParams funcParams) {
		int ret = this.getDao().funcParamsUpdateSelective(funcParams);
		String kvalue = "";
		kvalue = (kvalue + funcParams.getParamId());
		this.operatesLogSimpleAdd("T_FUNC_PARAMS", "部分更新", "PARAM_ID", kvalue, funcParams, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象FuncParams到数据库中
	 * <param name="funcParamsQueryCondition">附加的条件</param>
	 * <param name="funcParams">需要更新的FuncParams</param>
	 */
	public int funcParamsUpdateByCondition(FuncParams funcParams, FuncParamsExample funcParamsQueryCondition) {
		int ret = this.getDao().funcParamsUpdateByCondition(funcParams, funcParamsQueryCondition);
		String kvalue = this.getFuncParamsExampleConditionSql(funcParamsQueryCondition);
		this.operatesLogSimpleAdd("T_FUNC_PARAMS", "条件更新", "conditionSql", kvalue, funcParams, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象FuncParams到数据库中
	 * <param name="funcParamsQueryCondition">附加的条件</param>
	 * <param name="funcParams">需要更新的FuncParams</param>
	 */
	public int funcParamsUpdateSelectiveByCondition(FuncParams funcParams, FuncParamsExample funcParamsQueryCondition) {
		int ret = this.getDao().funcParamsUpdateSelectiveByCondition(funcParams, funcParamsQueryCondition);
		String kvalue = this.getFuncParamsExampleConditionSql(funcParamsQueryCondition);
		this.operatesLogSimpleAdd("T_FUNC_PARAMS", "批量部分更新", "conditionSql", kvalue, funcParams, ret);
		return ret;
	}
	
	public String getFuncParamsExampleConditionSql(FuncParamsExample funcParamsQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < funcParamsQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			FuncParamsExample.Criteria item = funcParamsQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					FuncParamsExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="funcParams">从数据库中查询一个对象FuncParams</param>
	 * <param name="AParamId">²ÎÊý±êÊ¶</param>
	 */
	public FuncParams funcParamsSelectByPrimaryKey(int AParamId) throws CacheException {
		return this.getDao().funcParamsSelectByPrimaryKey(AParamId);
	}
	
	/**
	 * <param name="funcParamsQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<FuncParams> funcParamsSelectObjects(FuncParamsExample funcParamsQueryCondition) throws CacheException {
		return this.getDao().funcParamsSelectObjects(funcParamsQueryCondition);
	}
	
	/**
	 * <param name="funcParamsQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int funcParamsQuerySelectObjectsCount(FuncParamsExample funcParamsQueryCondition) throws CacheException {
		return this.getDao().funcParamsQuerySelectObjectsCount(funcParamsQueryCondition);
	}
	
	/**
	 * 插入一个对象FuncProcedure到数据库中
	 * <param name="funcProcedure">需要插入的新对象</param>
	 */
	public int funcProcedureInsert(FuncProcedure funcProcedure) {
		int ret = this.getDao().funcProcedureInsert(funcProcedure);
		String kvalue = "";
		kvalue = (kvalue + funcProcedure.getFuncProcedureId());
		this.operatesLogSimpleAdd("T_FUNC_PROCEDURE", "插入", "FUNC_PROCEDURE_ID", kvalue, funcProcedure, ret);
		return ret;
	}
	
	/**
	 * <param name="funcProcedure">从数据库中删除一个对象FuncProcedure</param>
	 * <param name="AFuncProcedureId">º¯Êý¹ý³Ì±êÊ¶</param>
	 */
	public int funcProcedureDeleteByPrimaryKey(int AFuncProcedureId) {
		int ret = this.getDao().funcProcedureDeleteByPrimaryKey(AFuncProcedureId);
		String kvalue = "";
		kvalue = (kvalue + AFuncProcedureId);
		this.operatesLogSimpleAdd("T_FUNC_PROCEDURE", "删除", "FUNC_PROCEDURE_ID", kvalue, AFuncProcedureId, ret);
		return ret;
	}
	
	/**
	 * <param name="funcProcedure">从数据库中删除一个对象FuncProcedure</param>
	 */
	public int funcProcedureDeleteByCondition(FuncProcedureExample funcProcedureQueryCondition) {
		int ret = this.getDao().funcProcedureDeleteByCondition(funcProcedureQueryCondition);
		String kvalue = this.getFuncProcedureExampleConditionSql(funcProcedureQueryCondition);
		this.operatesLogSimpleAdd("T_FUNC_PROCEDURE", "条件删除", "conditionSql", kvalue, funcProcedureQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象FuncProcedure到数据库中
	 * <param name="funcProcedure">需要更新的FuncProcedure</param>
	 */
	public int funcProcedureUpdate(FuncProcedure funcProcedure) {
		int ret = this.getDao().funcProcedureUpdate(funcProcedure);
		String kvalue = "";
		kvalue = (kvalue + funcProcedure.getFuncProcedureId());
		this.operatesLogSimpleAdd("T_FUNC_PROCEDURE", "更新", "FUNC_PROCEDURE_ID", kvalue, funcProcedure, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性FuncProcedure到数据库中
	 * <param name="funcProcedure">需要更新的FuncProcedure</param>
	 */
	public int funcProcedureUpdateSelective(FuncProcedure funcProcedure) {
		int ret = this.getDao().funcProcedureUpdateSelective(funcProcedure);
		String kvalue = "";
		kvalue = (kvalue + funcProcedure.getFuncProcedureId());
		this.operatesLogSimpleAdd("T_FUNC_PROCEDURE", "部分更新", "FUNC_PROCEDURE_ID", kvalue, funcProcedure, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象FuncProcedure到数据库中
	 * <param name="funcProcedureQueryCondition">附加的条件</param>
	 * <param name="funcProcedure">需要更新的FuncProcedure</param>
	 */
	public int funcProcedureUpdateByCondition(FuncProcedure funcProcedure, FuncProcedureExample funcProcedureQueryCondition) {
		int ret = this.getDao().funcProcedureUpdateByCondition(funcProcedure, funcProcedureQueryCondition);
		String kvalue = this.getFuncProcedureExampleConditionSql(funcProcedureQueryCondition);
		this.operatesLogSimpleAdd("T_FUNC_PROCEDURE", "条件更新", "conditionSql", kvalue, funcProcedure, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象FuncProcedure到数据库中
	 * <param name="funcProcedureQueryCondition">附加的条件</param>
	 * <param name="funcProcedure">需要更新的FuncProcedure</param>
	 */
	public int funcProcedureUpdateSelectiveByCondition(FuncProcedure funcProcedure, FuncProcedureExample funcProcedureQueryCondition) {
		int ret = this.getDao().funcProcedureUpdateSelectiveByCondition(funcProcedure, funcProcedureQueryCondition);
		String kvalue = this.getFuncProcedureExampleConditionSql(funcProcedureQueryCondition);
		this.operatesLogSimpleAdd("T_FUNC_PROCEDURE", "批量部分更新", "conditionSql", kvalue, funcProcedure, ret);
		return ret;
	}
	
	public String getFuncProcedureExampleConditionSql(FuncProcedureExample funcProcedureQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < funcProcedureQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			FuncProcedureExample.Criteria item = funcProcedureQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					FuncProcedureExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="funcProcedure">从数据库中查询一个对象FuncProcedure</param>
	 * <param name="AFuncProcedureId">º¯Êý¹ý³Ì±êÊ¶</param>
	 */
	public FuncProcedure funcProcedureSelectByPrimaryKey(int AFuncProcedureId) throws CacheException {
		return this.getDao().funcProcedureSelectByPrimaryKey(AFuncProcedureId);
	}
	
	/**
	 * <param name="funcProcedureQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<FuncProcedure> funcProcedureSelectObjects(FuncProcedureExample funcProcedureQueryCondition) throws CacheException {
		return this.getDao().funcProcedureSelectObjects(funcProcedureQueryCondition);
	}
	
	/**
	 * <param name="funcProcedureQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int funcProcedureQuerySelectObjectsCount(FuncProcedureExample funcProcedureQueryCondition) throws CacheException {
		return this.getDao().funcProcedureQuerySelectObjectsCount(funcProcedureQueryCondition);
	}
	
	/**
	 * 插入一个对象FuncProject到数据库中
	 * <param name="funcProject">需要插入的新对象</param>
	 */
	public int funcProjectInsert(FuncProject funcProject) {
		int ret = this.getDao().funcProjectInsert(funcProject);
		String kvalue = "";
		kvalue = (kvalue + funcProject.getFuncProjectId());
		this.operatesLogSimpleAdd("T_FUNC_PROJECT", "插入", "FUNC_PROJECT_ID", kvalue, funcProject, ret);
		return ret;
	}
	
	/**
	 * <param name="funcProject">从数据库中删除一个对象FuncProject</param>
	 * <param name="AFuncProjectId">º¯ÊýÏîÄ¿±êÊ¶</param>
	 */
	public int funcProjectDeleteByPrimaryKey(int AFuncProjectId) {
		int ret = this.getDao().funcProjectDeleteByPrimaryKey(AFuncProjectId);
		String kvalue = "";
		kvalue = (kvalue + AFuncProjectId);
		this.operatesLogSimpleAdd("T_FUNC_PROJECT", "删除", "FUNC_PROJECT_ID", kvalue, AFuncProjectId, ret);
		return ret;
	}
	
	/**
	 * <param name="funcProject">从数据库中删除一个对象FuncProject</param>
	 */
	public int funcProjectDeleteByCondition(FuncProjectExample funcProjectQueryCondition) {
		int ret = this.getDao().funcProjectDeleteByCondition(funcProjectQueryCondition);
		String kvalue = this.getFuncProjectExampleConditionSql(funcProjectQueryCondition);
		this.operatesLogSimpleAdd("T_FUNC_PROJECT", "条件删除", "conditionSql", kvalue, funcProjectQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象FuncProject到数据库中
	 * <param name="funcProject">需要更新的FuncProject</param>
	 */
	public int funcProjectUpdate(FuncProject funcProject) {
		int ret = this.getDao().funcProjectUpdate(funcProject);
		String kvalue = "";
		kvalue = (kvalue + funcProject.getFuncProjectId());
		this.operatesLogSimpleAdd("T_FUNC_PROJECT", "更新", "FUNC_PROJECT_ID", kvalue, funcProject, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性FuncProject到数据库中
	 * <param name="funcProject">需要更新的FuncProject</param>
	 */
	public int funcProjectUpdateSelective(FuncProject funcProject) {
		int ret = this.getDao().funcProjectUpdateSelective(funcProject);
		String kvalue = "";
		kvalue = (kvalue + funcProject.getFuncProjectId());
		this.operatesLogSimpleAdd("T_FUNC_PROJECT", "部分更新", "FUNC_PROJECT_ID", kvalue, funcProject, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象FuncProject到数据库中
	 * <param name="funcProjectQueryCondition">附加的条件</param>
	 * <param name="funcProject">需要更新的FuncProject</param>
	 */
	public int funcProjectUpdateByCondition(FuncProject funcProject, FuncProjectExample funcProjectQueryCondition) {
		int ret = this.getDao().funcProjectUpdateByCondition(funcProject, funcProjectQueryCondition);
		String kvalue = this.getFuncProjectExampleConditionSql(funcProjectQueryCondition);
		this.operatesLogSimpleAdd("T_FUNC_PROJECT", "条件更新", "conditionSql", kvalue, funcProject, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象FuncProject到数据库中
	 * <param name="funcProjectQueryCondition">附加的条件</param>
	 * <param name="funcProject">需要更新的FuncProject</param>
	 */
	public int funcProjectUpdateSelectiveByCondition(FuncProject funcProject, FuncProjectExample funcProjectQueryCondition) {
		int ret = this.getDao().funcProjectUpdateSelectiveByCondition(funcProject, funcProjectQueryCondition);
		String kvalue = this.getFuncProjectExampleConditionSql(funcProjectQueryCondition);
		this.operatesLogSimpleAdd("T_FUNC_PROJECT", "批量部分更新", "conditionSql", kvalue, funcProject, ret);
		return ret;
	}
	
	public String getFuncProjectExampleConditionSql(FuncProjectExample funcProjectQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < funcProjectQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			FuncProjectExample.Criteria item = funcProjectQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					FuncProjectExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="funcProject">从数据库中查询一个对象FuncProject</param>
	 * <param name="AFuncProjectId">º¯ÊýÏîÄ¿±êÊ¶</param>
	 */
	public FuncProject funcProjectSelectByPrimaryKey(int AFuncProjectId) throws CacheException {
		return this.getDao().funcProjectSelectByPrimaryKey(AFuncProjectId);
	}
	
	/**
	 * <param name="funcProjectQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<FuncProject> funcProjectSelectObjects(FuncProjectExample funcProjectQueryCondition) throws CacheException {
		return this.getDao().funcProjectSelectObjects(funcProjectQueryCondition);
	}
	
	/**
	 * <param name="funcProjectQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int funcProjectQuerySelectObjectsCount(FuncProjectExample funcProjectQueryCondition) throws CacheException {
		return this.getDao().funcProjectQuerySelectObjectsCount(funcProjectQueryCondition);
	}
	
	/**
	 * 插入一个对象FuncTest到数据库中
	 * <param name="funcTest">需要插入的新对象</param>
	 */
	public int funcTestInsert(FuncTest funcTest) {
		int ret = this.getDao().funcTestInsert(funcTest);
		String kvalue = "";
		kvalue = (kvalue + funcTest.getBuildId());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + funcTest.getParamId());
		this.operatesLogSimpleAdd("T_FUNC_TEST", "插入", "BUILD_ID,PARAM_ID", kvalue, funcTest, ret);
		return ret;
	}
	
	/**
	 * <param name="funcTest">从数据库中删除一个对象FuncTest</param>
	 * <param name="AFuncTestKey">º¯Êý²âÊÔ 主键类</param>
	 */
	public int funcTestDeleteByPrimaryKey(FuncTestKey AFuncTestKey) {
		int ret = this.getDao().funcTestDeleteByPrimaryKey(AFuncTestKey);
		String kvalue = "";
		kvalue = (kvalue + AFuncTestKey.getBuildId());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + AFuncTestKey.getParamId());
		this.operatesLogSimpleAdd("T_FUNC_TEST", "删除", "BUILD_ID,PARAM_ID", kvalue, AFuncTestKey, ret);
		return ret;
	}
	
	/**
	 * <param name="funcTest">从数据库中删除一个对象FuncTest</param>
	 */
	public int funcTestDeleteByCondition(FuncTestExample funcTestQueryCondition) {
		int ret = this.getDao().funcTestDeleteByCondition(funcTestQueryCondition);
		String kvalue = this.getFuncTestExampleConditionSql(funcTestQueryCondition);
		this.operatesLogSimpleAdd("T_FUNC_TEST", "条件删除", "conditionSql", kvalue, funcTestQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象FuncTest到数据库中
	 * <param name="funcTest">需要更新的FuncTest</param>
	 */
	public int funcTestUpdate(FuncTest funcTest) {
		int ret = this.getDao().funcTestUpdate(funcTest);
		String kvalue = "";
		kvalue = (kvalue + funcTest.getBuildId());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + funcTest.getParamId());
		this.operatesLogSimpleAdd("T_FUNC_TEST", "更新", "BUILD_ID,PARAM_ID", kvalue, funcTest, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性FuncTest到数据库中
	 * <param name="funcTest">需要更新的FuncTest</param>
	 */
	public int funcTestUpdateSelective(FuncTest funcTest) {
		int ret = this.getDao().funcTestUpdateSelective(funcTest);
		String kvalue = "";
		kvalue = (kvalue + funcTest.getBuildId());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + funcTest.getParamId());
		this.operatesLogSimpleAdd("T_FUNC_TEST", "部分更新", "BUILD_ID,PARAM_ID", kvalue, funcTest, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象FuncTest到数据库中
	 * <param name="funcTestQueryCondition">附加的条件</param>
	 * <param name="funcTest">需要更新的FuncTest</param>
	 */
	public int funcTestUpdateByCondition(FuncTest funcTest, FuncTestExample funcTestQueryCondition) {
		int ret = this.getDao().funcTestUpdateByCondition(funcTest, funcTestQueryCondition);
		String kvalue = this.getFuncTestExampleConditionSql(funcTestQueryCondition);
		this.operatesLogSimpleAdd("T_FUNC_TEST", "条件更新", "conditionSql", kvalue, funcTest, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象FuncTest到数据库中
	 * <param name="funcTestQueryCondition">附加的条件</param>
	 * <param name="funcTest">需要更新的FuncTest</param>
	 */
	public int funcTestUpdateSelectiveByCondition(FuncTest funcTest, FuncTestExample funcTestQueryCondition) {
		int ret = this.getDao().funcTestUpdateSelectiveByCondition(funcTest, funcTestQueryCondition);
		String kvalue = this.getFuncTestExampleConditionSql(funcTestQueryCondition);
		this.operatesLogSimpleAdd("T_FUNC_TEST", "批量部分更新", "conditionSql", kvalue, funcTest, ret);
		return ret;
	}
	
	public String getFuncTestExampleConditionSql(FuncTestExample funcTestQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < funcTestQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			FuncTestExample.Criteria item = funcTestQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					FuncTestExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="funcTest">从数据库中查询一个对象FuncTest</param>
	 * <param name="AFuncTestKey">º¯Êý²âÊÔ 主键类</param>
	 */
	public FuncTest funcTestSelectByPrimaryKey(FuncTestKey AFuncTestKey) throws CacheException {
		return this.getDao().funcTestSelectByPrimaryKey(AFuncTestKey);
	}
	
	/**
	 * <param name="funcTestQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<FuncTest> funcTestSelectObjects(FuncTestExample funcTestQueryCondition) throws CacheException {
		return this.getDao().funcTestSelectObjects(funcTestQueryCondition);
	}
	
	/**
	 * <param name="funcTestQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int funcTestQuerySelectObjectsCount(FuncTestExample funcTestQueryCondition) throws CacheException {
		return this.getDao().funcTestQuerySelectObjectsCount(funcTestQueryCondition);
	}
	
	/**
	 * 插入一个对象Identity到数据库中
	 * <param name="identity">需要插入的新对象</param>
	 */
	public int identityInsert(Identity identity) {
		int ret = this.getDao().identityInsert(identity);
		String kvalue = "";
		kvalue = (kvalue + identity.getTabName());
		this.operatesLogSimpleAdd("T_IDENTITY", "插入", "TAB_NAME", kvalue, identity, ret);
		return ret;
	}
	
	/**
	 * <param name="identity">从数据库中删除一个对象Identity</param>
	 * <param name="ATabName"></param>
	 */
	public int identityDeleteByPrimaryKey(String ATabName) {
		int ret = this.getDao().identityDeleteByPrimaryKey(ATabName);
		String kvalue = "";
		kvalue = (kvalue + ATabName);
		this.operatesLogSimpleAdd("T_IDENTITY", "删除", "TAB_NAME", kvalue, ATabName, ret);
		return ret;
	}
	
	/**
	 * <param name="identity">从数据库中删除一个对象Identity</param>
	 */
	public int identityDeleteByCondition(IdentityExample identityQueryCondition) {
		int ret = this.getDao().identityDeleteByCondition(identityQueryCondition);
		String kvalue = this.getIdentityExampleConditionSql(identityQueryCondition);
		this.operatesLogSimpleAdd("T_IDENTITY", "条件删除", "conditionSql", kvalue, identityQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象Identity到数据库中
	 * <param name="identity">需要更新的Identity</param>
	 */
	public int identityUpdate(Identity identity) {
		int ret = this.getDao().identityUpdate(identity);
		String kvalue = "";
		kvalue = (kvalue + identity.getTabName());
		this.operatesLogSimpleAdd("T_IDENTITY", "更新", "TAB_NAME", kvalue, identity, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性Identity到数据库中
	 * <param name="identity">需要更新的Identity</param>
	 */
	public int identityUpdateSelective(Identity identity) {
		int ret = this.getDao().identityUpdateSelective(identity);
		String kvalue = "";
		kvalue = (kvalue + identity.getTabName());
		this.operatesLogSimpleAdd("T_IDENTITY", "部分更新", "TAB_NAME", kvalue, identity, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象Identity到数据库中
	 * <param name="identityQueryCondition">附加的条件</param>
	 * <param name="identity">需要更新的Identity</param>
	 */
	public int identityUpdateByCondition(Identity identity, IdentityExample identityQueryCondition) {
		int ret = this.getDao().identityUpdateByCondition(identity, identityQueryCondition);
		String kvalue = this.getIdentityExampleConditionSql(identityQueryCondition);
		this.operatesLogSimpleAdd("T_IDENTITY", "条件更新", "conditionSql", kvalue, identity, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象Identity到数据库中
	 * <param name="identityQueryCondition">附加的条件</param>
	 * <param name="identity">需要更新的Identity</param>
	 */
	public int identityUpdateSelectiveByCondition(Identity identity, IdentityExample identityQueryCondition) {
		int ret = this.getDao().identityUpdateSelectiveByCondition(identity, identityQueryCondition);
		String kvalue = this.getIdentityExampleConditionSql(identityQueryCondition);
		this.operatesLogSimpleAdd("T_IDENTITY", "批量部分更新", "conditionSql", kvalue, identity, ret);
		return ret;
	}
	
	public String getIdentityExampleConditionSql(IdentityExample identityQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < identityQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			IdentityExample.Criteria item = identityQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					IdentityExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="identity">从数据库中查询一个对象Identity</param>
	 * <param name="ATabName"></param>
	 */
	public Identity identitySelectByPrimaryKey(String ATabName) throws CacheException {
		return this.getDao().identitySelectByPrimaryKey(ATabName);
	}
	
	/**
	 * <param name="identityQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Identity> identitySelectObjects(IdentityExample identityQueryCondition) throws CacheException {
		return this.getDao().identitySelectObjects(identityQueryCondition);
	}
	
	/**
	 * <param name="identityQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int identityQuerySelectObjectsCount(IdentityExample identityQueryCondition) throws CacheException {
		return this.getDao().identityQuerySelectObjectsCount(identityQueryCondition);
	}
	
	/**
	 * 插入一个对象OrmappingProject到数据库中
	 * <param name="ormappingProject">需要插入的新对象</param>
	 */
	public int ormappingProjectInsert(OrmappingProject ormappingProject) {
		int ret = this.getDao().ormappingProjectInsert(ormappingProject);
		String kvalue = "";
		kvalue = (kvalue + ormappingProject.getProjId());
		this.operatesLogSimpleAdd("T_ORMAPPING_PROJECT", "插入", "PROJ_ID", kvalue, ormappingProject, ret);
		return ret;
	}
	
	/**
	 * <param name="ormappingProject">从数据库中删除一个对象OrmappingProject</param>
	 * <param name="AProjId">¹¤³ÌºÅ</param>
	 */
	public int ormappingProjectDeleteByPrimaryKey(int AProjId) {
		int ret = this.getDao().ormappingProjectDeleteByPrimaryKey(AProjId);
		String kvalue = "";
		kvalue = (kvalue + AProjId);
		this.operatesLogSimpleAdd("T_ORMAPPING_PROJECT", "删除", "PROJ_ID", kvalue, AProjId, ret);
		return ret;
	}
	
	/**
	 * <param name="ormappingProject">从数据库中删除一个对象OrmappingProject</param>
	 */
	public int ormappingProjectDeleteByCondition(OrmappingProjectExample ormappingProjectQueryCondition) {
		int ret = this.getDao().ormappingProjectDeleteByCondition(ormappingProjectQueryCondition);
		String kvalue = this.getOrmappingProjectExampleConditionSql(ormappingProjectQueryCondition);
		this.operatesLogSimpleAdd("T_ORMAPPING_PROJECT", "条件删除", "conditionSql", kvalue, ormappingProjectQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象OrmappingProject到数据库中
	 * <param name="ormappingProject">需要更新的OrmappingProject</param>
	 */
	public int ormappingProjectUpdate(OrmappingProject ormappingProject) {
		int ret = this.getDao().ormappingProjectUpdate(ormappingProject);
		String kvalue = "";
		kvalue = (kvalue + ormappingProject.getProjId());
		this.operatesLogSimpleAdd("T_ORMAPPING_PROJECT", "更新", "PROJ_ID", kvalue, ormappingProject, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性OrmappingProject到数据库中
	 * <param name="ormappingProject">需要更新的OrmappingProject</param>
	 */
	public int ormappingProjectUpdateSelective(OrmappingProject ormappingProject) {
		int ret = this.getDao().ormappingProjectUpdateSelective(ormappingProject);
		String kvalue = "";
		kvalue = (kvalue + ormappingProject.getProjId());
		this.operatesLogSimpleAdd("T_ORMAPPING_PROJECT", "部分更新", "PROJ_ID", kvalue, ormappingProject, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象OrmappingProject到数据库中
	 * <param name="ormappingProjectQueryCondition">附加的条件</param>
	 * <param name="ormappingProject">需要更新的OrmappingProject</param>
	 */
	public int ormappingProjectUpdateByCondition(OrmappingProject ormappingProject, OrmappingProjectExample ormappingProjectQueryCondition) {
		int ret = this.getDao().ormappingProjectUpdateByCondition(ormappingProject, ormappingProjectQueryCondition);
		String kvalue = this.getOrmappingProjectExampleConditionSql(ormappingProjectQueryCondition);
		this.operatesLogSimpleAdd("T_ORMAPPING_PROJECT", "条件更新", "conditionSql", kvalue, ormappingProject, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象OrmappingProject到数据库中
	 * <param name="ormappingProjectQueryCondition">附加的条件</param>
	 * <param name="ormappingProject">需要更新的OrmappingProject</param>
	 */
	public int ormappingProjectUpdateSelectiveByCondition(OrmappingProject ormappingProject, OrmappingProjectExample ormappingProjectQueryCondition) {
		int ret = this.getDao().ormappingProjectUpdateSelectiveByCondition(ormappingProject, ormappingProjectQueryCondition);
		String kvalue = this.getOrmappingProjectExampleConditionSql(ormappingProjectQueryCondition);
		this.operatesLogSimpleAdd("T_ORMAPPING_PROJECT", "批量部分更新", "conditionSql", kvalue, ormappingProject, ret);
		return ret;
	}
	
	public String getOrmappingProjectExampleConditionSql(OrmappingProjectExample ormappingProjectQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < ormappingProjectQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			OrmappingProjectExample.Criteria item = ormappingProjectQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					OrmappingProjectExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="ormappingProject">从数据库中查询一个对象OrmappingProject</param>
	 * <param name="AProjId">¹¤³ÌºÅ</param>
	 */
	public OrmappingProject ormappingProjectSelectByPrimaryKey(int AProjId) throws CacheException {
		return this.getDao().ormappingProjectSelectByPrimaryKey(AProjId);
	}
	
	/**
	 * <param name="ormappingProjectQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<OrmappingProject> ormappingProjectSelectObjects(OrmappingProjectExample ormappingProjectQueryCondition) throws CacheException {
		return this.getDao().ormappingProjectSelectObjects(ormappingProjectQueryCondition);
	}
	
	/**
	 * <param name="ormappingProjectQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int ormappingProjectQuerySelectObjectsCount(OrmappingProjectExample ormappingProjectQueryCondition) throws CacheException {
		return this.getDao().ormappingProjectQuerySelectObjectsCount(ormappingProjectQueryCondition);
	}
	
	/**
	 * 插入一个对象Project到数据库中
	 * <param name="project">需要插入的新对象</param>
	 */
	public int projectInsert(Project project) {
		int ret = this.getDao().projectInsert(project);
		String kvalue = "";
		kvalue = (kvalue + project.getProjId());
		this.operatesLogSimpleAdd("T_PROJECT", "插入", "PROJ_ID", kvalue, project, ret);
		return ret;
	}
	
	/**
	 * <param name="project">从数据库中删除一个对象Project</param>
	 * <param name="AProjId">¹¤³ÌºÅ</param>
	 */
	public int projectDeleteByPrimaryKey(int AProjId) {
		int ret = this.getDao().projectDeleteByPrimaryKey(AProjId);
		String kvalue = "";
		kvalue = (kvalue + AProjId);
		this.operatesLogSimpleAdd("T_PROJECT", "删除", "PROJ_ID", kvalue, AProjId, ret);
		return ret;
	}
	
	/**
	 * <param name="project">从数据库中删除一个对象Project</param>
	 */
	public int projectDeleteByCondition(ProjectExample projectQueryCondition) {
		int ret = this.getDao().projectDeleteByCondition(projectQueryCondition);
		String kvalue = this.getProjectExampleConditionSql(projectQueryCondition);
		this.operatesLogSimpleAdd("T_PROJECT", "条件删除", "conditionSql", kvalue, projectQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象Project到数据库中
	 * <param name="project">需要更新的Project</param>
	 */
	public int projectUpdate(Project project) {
		int ret = this.getDao().projectUpdate(project);
		String kvalue = "";
		kvalue = (kvalue + project.getProjId());
		this.operatesLogSimpleAdd("T_PROJECT", "更新", "PROJ_ID", kvalue, project, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性Project到数据库中
	 * <param name="project">需要更新的Project</param>
	 */
	public int projectUpdateSelective(Project project) {
		int ret = this.getDao().projectUpdateSelective(project);
		String kvalue = "";
		kvalue = (kvalue + project.getProjId());
		this.operatesLogSimpleAdd("T_PROJECT", "部分更新", "PROJ_ID", kvalue, project, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象Project到数据库中
	 * <param name="projectQueryCondition">附加的条件</param>
	 * <param name="project">需要更新的Project</param>
	 */
	public int projectUpdateByCondition(Project project, ProjectExample projectQueryCondition) {
		int ret = this.getDao().projectUpdateByCondition(project, projectQueryCondition);
		String kvalue = this.getProjectExampleConditionSql(projectQueryCondition);
		this.operatesLogSimpleAdd("T_PROJECT", "条件更新", "conditionSql", kvalue, project, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象Project到数据库中
	 * <param name="projectQueryCondition">附加的条件</param>
	 * <param name="project">需要更新的Project</param>
	 */
	public int projectUpdateSelectiveByCondition(Project project, ProjectExample projectQueryCondition) {
		int ret = this.getDao().projectUpdateSelectiveByCondition(project, projectQueryCondition);
		String kvalue = this.getProjectExampleConditionSql(projectQueryCondition);
		this.operatesLogSimpleAdd("T_PROJECT", "批量部分更新", "conditionSql", kvalue, project, ret);
		return ret;
	}
	
	public String getProjectExampleConditionSql(ProjectExample projectQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < projectQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			ProjectExample.Criteria item = projectQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					ProjectExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="project">从数据库中查询一个对象Project</param>
	 * <param name="AProjId">¹¤³ÌºÅ</param>
	 */
	public Project projectSelectByPrimaryKey(int AProjId) throws CacheException {
		return this.getDao().projectSelectByPrimaryKey(AProjId);
	}
	
	/**
	 * <param name="projectQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Project> projectSelectObjects(ProjectExample projectQueryCondition) throws CacheException {
		return this.getDao().projectSelectObjects(projectQueryCondition);
	}
	
	/**
	 * <param name="projectQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int projectQuerySelectObjectsCount(ProjectExample projectQueryCondition) throws CacheException {
		return this.getDao().projectQuerySelectObjectsCount(projectQueryCondition);
	}
	
	/**
	 * 插入一个对象ProjectJoinUser到数据库中
	 * <param name="projectJoinUser">需要插入的新对象</param>
	 */
	public int projectJoinUserInsert(ProjectJoinUserKey projectJoinUser) {
		int ret = this.getDao().projectJoinUserInsert(projectJoinUser);
		String kvalue = "";
		kvalue = (kvalue + projectJoinUser.getProjectId());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + projectJoinUser.getUserId());
		this.operatesLogSimpleAdd("T_PROJECT_JOIN_USER", "插入", "PROJECT_ID,USER_ID", kvalue, projectJoinUser, ret);
		return ret;
	}
	
	/**
	 * <param name="projectJoinUser">从数据库中删除一个对象ProjectJoinUser</param>
	 * <param name="AProjectJoinUserKey">¹¤³Ì¡ª¡ªÓÃ»§±í 主键类</param>
	 */
	public int projectJoinUserDeleteByPrimaryKey(ProjectJoinUserKey AProjectJoinUserKey) {
		int ret = this.getDao().projectJoinUserDeleteByPrimaryKey(AProjectJoinUserKey);
		String kvalue = "";
		kvalue = (kvalue + AProjectJoinUserKey.getProjectId());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + AProjectJoinUserKey.getUserId());
		this.operatesLogSimpleAdd("T_PROJECT_JOIN_USER", "删除", "PROJECT_ID,USER_ID", kvalue, AProjectJoinUserKey, ret);
		return ret;
	}
	
	/**
	 * <param name="projectJoinUser">从数据库中删除一个对象ProjectJoinUser</param>
	 */
	public int projectJoinUserDeleteByCondition(ProjectJoinUserExample projectJoinUserQueryCondition) {
		int ret = this.getDao().projectJoinUserDeleteByCondition(projectJoinUserQueryCondition);
		String kvalue = this.getProjectJoinUserExampleConditionSql(projectJoinUserQueryCondition);
		this.operatesLogSimpleAdd("T_PROJECT_JOIN_USER", "条件删除", "conditionSql", kvalue, projectJoinUserQueryCondition, ret);
		return ret;
	}
	
	public String getProjectJoinUserExampleConditionSql(ProjectJoinUserExample projectJoinUserQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < projectJoinUserQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			ProjectJoinUserExample.Criteria item = projectJoinUserQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					ProjectJoinUserExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="projectJoinUserQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<ProjectJoinUserKey> projectJoinUserSelectObjects(ProjectJoinUserExample projectJoinUserQueryCondition) throws CacheException {
		return this.getDao().projectJoinUserSelectObjects(projectJoinUserQueryCondition);
	}
	
	/**
	 * <param name="projectJoinUserQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int projectJoinUserQuerySelectObjectsCount(ProjectJoinUserExample projectJoinUserQueryCondition) throws CacheException {
		return this.getDao().projectJoinUserQuerySelectObjectsCount(projectJoinUserQueryCondition);
	}
	
	/**
	 * 插入一个对象Role到数据库中
	 * <param name="role">需要插入的新对象</param>
	 */
	public int roleInsert(Role role) {
		int ret = this.getDao().roleInsert(role);
		String kvalue = "";
		kvalue = (kvalue + role.getRoleId());
		this.operatesLogSimpleAdd("T_ROLE", "插入", "ROLE_ID", kvalue, role, ret);
		return ret;
	}
	
	/**
	 * <param name="role">从数据库中删除一个对象Role</param>
	 * <param name="ARoleId">½ÇÉ«´úºÅ</param>
	 */
	public int roleDeleteByPrimaryKey(int ARoleId) {
		int ret = this.getDao().roleDeleteByPrimaryKey(ARoleId);
		String kvalue = "";
		kvalue = (kvalue + ARoleId);
		this.operatesLogSimpleAdd("T_ROLE", "删除", "ROLE_ID", kvalue, ARoleId, ret);
		return ret;
	}
	
	/**
	 * <param name="role">从数据库中删除一个对象Role</param>
	 */
	public int roleDeleteByCondition(RoleExample roleQueryCondition) {
		int ret = this.getDao().roleDeleteByCondition(roleQueryCondition);
		String kvalue = this.getRoleExampleConditionSql(roleQueryCondition);
		this.operatesLogSimpleAdd("T_ROLE", "条件删除", "conditionSql", kvalue, roleQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象Role到数据库中
	 * <param name="role">需要更新的Role</param>
	 */
	public int roleUpdate(Role role) {
		int ret = this.getDao().roleUpdate(role);
		String kvalue = "";
		kvalue = (kvalue + role.getRoleId());
		this.operatesLogSimpleAdd("T_ROLE", "更新", "ROLE_ID", kvalue, role, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性Role到数据库中
	 * <param name="role">需要更新的Role</param>
	 */
	public int roleUpdateSelective(Role role) {
		int ret = this.getDao().roleUpdateSelective(role);
		String kvalue = "";
		kvalue = (kvalue + role.getRoleId());
		this.operatesLogSimpleAdd("T_ROLE", "部分更新", "ROLE_ID", kvalue, role, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象Role到数据库中
	 * <param name="roleQueryCondition">附加的条件</param>
	 * <param name="role">需要更新的Role</param>
	 */
	public int roleUpdateByCondition(Role role, RoleExample roleQueryCondition) {
		int ret = this.getDao().roleUpdateByCondition(role, roleQueryCondition);
		String kvalue = this.getRoleExampleConditionSql(roleQueryCondition);
		this.operatesLogSimpleAdd("T_ROLE", "条件更新", "conditionSql", kvalue, role, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象Role到数据库中
	 * <param name="roleQueryCondition">附加的条件</param>
	 * <param name="role">需要更新的Role</param>
	 */
	public int roleUpdateSelectiveByCondition(Role role, RoleExample roleQueryCondition) {
		int ret = this.getDao().roleUpdateSelectiveByCondition(role, roleQueryCondition);
		String kvalue = this.getRoleExampleConditionSql(roleQueryCondition);
		this.operatesLogSimpleAdd("T_ROLE", "批量部分更新", "conditionSql", kvalue, role, ret);
		return ret;
	}
	
	public String getRoleExampleConditionSql(RoleExample roleQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < roleQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			RoleExample.Criteria item = roleQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					RoleExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="role">从数据库中查询一个对象Role</param>
	 * <param name="ARoleId">½ÇÉ«´úºÅ</param>
	 */
	public Role roleSelectByPrimaryKey(int ARoleId) throws CacheException {
		return this.getDao().roleSelectByPrimaryKey(ARoleId);
	}
	
	/**
	 * <param name="roleQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Role> roleSelectObjects(RoleExample roleQueryCondition) throws CacheException {
		return this.getDao().roleSelectObjects(roleQueryCondition);
	}
	
	/**
	 * <param name="roleQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int roleQuerySelectObjectsCount(RoleExample roleQueryCondition) throws CacheException {
		return this.getDao().roleQuerySelectObjectsCount(roleQueryCondition);
	}
	
	/**
	 * 插入一个对象SystemParam到数据库中
	 * <param name="systemParam">需要插入的新对象</param>
	 */
	public int systemParamInsert(SystemParam systemParam) {
		int ret = this.getDao().systemParamInsert(systemParam);
		String kvalue = "";
		kvalue = (kvalue + systemParam.getSystemParamCategory());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + systemParam.getSystemParamCode());
		this.operatesLogSimpleAdd("T_SYSTEM_PARAM", "插入", "SYSTEM_PARAM_CATEGORY,SYSTEM_PARAM_CODE", kvalue, systemParam, ret);
		return ret;
	}
	
	/**
	 * <param name="systemParam">从数据库中删除一个对象SystemParam</param>
	 * <param name="ASystemParamKey">系统参数表 主键类</param>
	 */
	public int systemParamDeleteByPrimaryKey(SystemParamKey ASystemParamKey) {
		int ret = this.getDao().systemParamDeleteByPrimaryKey(ASystemParamKey);
		String kvalue = "";
		kvalue = (kvalue + ASystemParamKey.getSystemParamCategory());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + ASystemParamKey.getSystemParamCode());
		this.operatesLogSimpleAdd("T_SYSTEM_PARAM", "删除", "SYSTEM_PARAM_CATEGORY,SYSTEM_PARAM_CODE", kvalue, ASystemParamKey, ret);
		return ret;
	}
	
	/**
	 * <param name="systemParam">从数据库中删除一个对象SystemParam</param>
	 */
	public int systemParamDeleteByCondition(SystemParamExample systemParamQueryCondition) {
		int ret = this.getDao().systemParamDeleteByCondition(systemParamQueryCondition);
		String kvalue = this.getSystemParamExampleConditionSql(systemParamQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_PARAM", "条件删除", "conditionSql", kvalue, systemParamQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemParam到数据库中
	 * <param name="systemParam">需要更新的SystemParam</param>
	 */
	public int systemParamUpdate(SystemParam systemParam) {
		int ret = this.getDao().systemParamUpdate(systemParam);
		String kvalue = "";
		kvalue = (kvalue + systemParam.getSystemParamCategory());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + systemParam.getSystemParamCode());
		this.operatesLogSimpleAdd("T_SYSTEM_PARAM", "更新", "SYSTEM_PARAM_CATEGORY,SYSTEM_PARAM_CODE", kvalue, systemParam, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性SystemParam到数据库中
	 * <param name="systemParam">需要更新的SystemParam</param>
	 */
	public int systemParamUpdateSelective(SystemParam systemParam) {
		int ret = this.getDao().systemParamUpdateSelective(systemParam);
		String kvalue = "";
		kvalue = (kvalue + systemParam.getSystemParamCategory());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + systemParam.getSystemParamCode());
		this.operatesLogSimpleAdd("T_SYSTEM_PARAM", "部分更新", "SYSTEM_PARAM_CATEGORY,SYSTEM_PARAM_CODE", kvalue, systemParam, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemParam到数据库中
	 * <param name="systemParamQueryCondition">附加的条件</param>
	 * <param name="systemParam">需要更新的SystemParam</param>
	 */
	public int systemParamUpdateByCondition(SystemParam systemParam, SystemParamExample systemParamQueryCondition) {
		int ret = this.getDao().systemParamUpdateByCondition(systemParam, systemParamQueryCondition);
		String kvalue = this.getSystemParamExampleConditionSql(systemParamQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_PARAM", "条件更新", "conditionSql", kvalue, systemParam, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象SystemParam到数据库中
	 * <param name="systemParamQueryCondition">附加的条件</param>
	 * <param name="systemParam">需要更新的SystemParam</param>
	 */
	public int systemParamUpdateSelectiveByCondition(SystemParam systemParam, SystemParamExample systemParamQueryCondition) {
		int ret = this.getDao().systemParamUpdateSelectiveByCondition(systemParam, systemParamQueryCondition);
		String kvalue = this.getSystemParamExampleConditionSql(systemParamQueryCondition);
		this.operatesLogSimpleAdd("T_SYSTEM_PARAM", "批量部分更新", "conditionSql", kvalue, systemParam, ret);
		return ret;
	}
	
	public String getSystemParamExampleConditionSql(SystemParamExample systemParamQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < systemParamQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			SystemParamExample.Criteria item = systemParamQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					SystemParamExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="systemParam">从数据库中查询一个对象SystemParam</param>
	 * <param name="ASystemParamKey">系统参数表 主键类</param>
	 */
	public SystemParam systemParamSelectByPrimaryKey(SystemParamKey ASystemParamKey) throws CacheException {
		return this.getDao().systemParamSelectByPrimaryKey(ASystemParamKey);
	}
	
	/**
	 * <param name="systemParamQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemParam> systemParamSelectObjects(SystemParamExample systemParamQueryCondition) throws CacheException {
		return this.getDao().systemParamSelectObjects(systemParamQueryCondition);
	}
	
	/**
	 * <param name="systemParamQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int systemParamQuerySelectObjectsCount(SystemParamExample systemParamQueryCondition) throws CacheException {
		return this.getDao().systemParamQuerySelectObjectsCount(systemParamQueryCondition);
	}
	
	/**
	 * 插入一个对象TestParamValue到数据库中
	 * <param name="testParamValue">需要插入的新对象</param>
	 */
	public int testParamValueInsert(TestParamValue testParamValue) {
		int ret = this.getDao().testParamValueInsert(testParamValue);
		String kvalue = "";
		kvalue = (kvalue + testParamValue.getParamId());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + testParamValue.getTestProcedureId());
		this.operatesLogSimpleAdd("T_TEST_PARAM_VALUE", "插入", "PARAM_ID,TEST_PROCEDURE_ID", kvalue, testParamValue, ret);
		return ret;
	}
	
	/**
	 * <param name="testParamValue">从数据库中删除一个对象TestParamValue</param>
	 * <param name="ATestParamValueKey">º¯Êý²âÊÔ²ÎÊý±í 主键类</param>
	 */
	public int testParamValueDeleteByPrimaryKey(TestParamValueKey ATestParamValueKey) {
		int ret = this.getDao().testParamValueDeleteByPrimaryKey(ATestParamValueKey);
		String kvalue = "";
		kvalue = (kvalue + ATestParamValueKey.getParamId());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + ATestParamValueKey.getTestProcedureId());
		this.operatesLogSimpleAdd("T_TEST_PARAM_VALUE", "删除", "PARAM_ID,TEST_PROCEDURE_ID", kvalue, ATestParamValueKey, ret);
		return ret;
	}
	
	/**
	 * <param name="testParamValue">从数据库中删除一个对象TestParamValue</param>
	 */
	public int testParamValueDeleteByCondition(TestParamValueExample testParamValueQueryCondition) {
		int ret = this.getDao().testParamValueDeleteByCondition(testParamValueQueryCondition);
		String kvalue = this.getTestParamValueExampleConditionSql(testParamValueQueryCondition);
		this.operatesLogSimpleAdd("T_TEST_PARAM_VALUE", "条件删除", "conditionSql", kvalue, testParamValueQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象TestParamValue到数据库中
	 * <param name="testParamValue">需要更新的TestParamValue</param>
	 */
	public int testParamValueUpdate(TestParamValue testParamValue) {
		int ret = this.getDao().testParamValueUpdate(testParamValue);
		String kvalue = "";
		kvalue = (kvalue + testParamValue.getParamId());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + testParamValue.getTestProcedureId());
		this.operatesLogSimpleAdd("T_TEST_PARAM_VALUE", "更新", "PARAM_ID,TEST_PROCEDURE_ID", kvalue, testParamValue, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性TestParamValue到数据库中
	 * <param name="testParamValue">需要更新的TestParamValue</param>
	 */
	public int testParamValueUpdateSelective(TestParamValue testParamValue) {
		int ret = this.getDao().testParamValueUpdateSelective(testParamValue);
		String kvalue = "";
		kvalue = (kvalue + testParamValue.getParamId());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + testParamValue.getTestProcedureId());
		this.operatesLogSimpleAdd("T_TEST_PARAM_VALUE", "部分更新", "PARAM_ID,TEST_PROCEDURE_ID", kvalue, testParamValue, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象TestParamValue到数据库中
	 * <param name="testParamValueQueryCondition">附加的条件</param>
	 * <param name="testParamValue">需要更新的TestParamValue</param>
	 */
	public int testParamValueUpdateByCondition(TestParamValue testParamValue, TestParamValueExample testParamValueQueryCondition) {
		int ret = this.getDao().testParamValueUpdateByCondition(testParamValue, testParamValueQueryCondition);
		String kvalue = this.getTestParamValueExampleConditionSql(testParamValueQueryCondition);
		this.operatesLogSimpleAdd("T_TEST_PARAM_VALUE", "条件更新", "conditionSql", kvalue, testParamValue, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象TestParamValue到数据库中
	 * <param name="testParamValueQueryCondition">附加的条件</param>
	 * <param name="testParamValue">需要更新的TestParamValue</param>
	 */
	public int testParamValueUpdateSelectiveByCondition(TestParamValue testParamValue, TestParamValueExample testParamValueQueryCondition) {
		int ret = this.getDao().testParamValueUpdateSelectiveByCondition(testParamValue, testParamValueQueryCondition);
		String kvalue = this.getTestParamValueExampleConditionSql(testParamValueQueryCondition);
		this.operatesLogSimpleAdd("T_TEST_PARAM_VALUE", "批量部分更新", "conditionSql", kvalue, testParamValue, ret);
		return ret;
	}
	
	public String getTestParamValueExampleConditionSql(TestParamValueExample testParamValueQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < testParamValueQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			TestParamValueExample.Criteria item = testParamValueQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					TestParamValueExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="testParamValue">从数据库中查询一个对象TestParamValue</param>
	 * <param name="ATestParamValueKey">º¯Êý²âÊÔ²ÎÊý±í 主键类</param>
	 */
	public TestParamValue testParamValueSelectByPrimaryKey(TestParamValueKey ATestParamValueKey) throws CacheException {
		return this.getDao().testParamValueSelectByPrimaryKey(ATestParamValueKey);
	}
	
	/**
	 * <param name="testParamValueQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<TestParamValue> testParamValueSelectObjects(TestParamValueExample testParamValueQueryCondition) throws CacheException {
		return this.getDao().testParamValueSelectObjects(testParamValueQueryCondition);
	}
	
	/**
	 * <param name="testParamValueQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int testParamValueQuerySelectObjectsCount(TestParamValueExample testParamValueQueryCondition) throws CacheException {
		return this.getDao().testParamValueQuerySelectObjectsCount(testParamValueQueryCondition);
	}
	
	/**
	 * 插入一个对象TestProcedure到数据库中
	 * <param name="testProcedure">需要插入的新对象</param>
	 */
	public int testProcedureInsert(TestProcedure testProcedure) {
		int ret = this.getDao().testProcedureInsert(testProcedure);
		String kvalue = "";
		kvalue = (kvalue + testProcedure.getTestProcedureId());
		this.operatesLogSimpleAdd("T_TEST_PROCEDURE", "插入", "TEST_PROCEDURE_ID", kvalue, testProcedure, ret);
		return ret;
	}
	
	/**
	 * <param name="testProcedure">从数据库中删除一个对象TestProcedure</param>
	 * <param name="ATestProcedureId">²âÊÔ¹ý³Ì±êÊ¶</param>
	 */
	public int testProcedureDeleteByPrimaryKey(int ATestProcedureId) {
		int ret = this.getDao().testProcedureDeleteByPrimaryKey(ATestProcedureId);
		String kvalue = "";
		kvalue = (kvalue + ATestProcedureId);
		this.operatesLogSimpleAdd("T_TEST_PROCEDURE", "删除", "TEST_PROCEDURE_ID", kvalue, ATestProcedureId, ret);
		return ret;
	}
	
	/**
	 * <param name="testProcedure">从数据库中删除一个对象TestProcedure</param>
	 */
	public int testProcedureDeleteByCondition(TestProcedureExample testProcedureQueryCondition) {
		int ret = this.getDao().testProcedureDeleteByCondition(testProcedureQueryCondition);
		String kvalue = this.getTestProcedureExampleConditionSql(testProcedureQueryCondition);
		this.operatesLogSimpleAdd("T_TEST_PROCEDURE", "条件删除", "conditionSql", kvalue, testProcedureQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象TestProcedure到数据库中
	 * <param name="testProcedure">需要更新的TestProcedure</param>
	 */
	public int testProcedureUpdate(TestProcedure testProcedure) {
		int ret = this.getDao().testProcedureUpdate(testProcedure);
		String kvalue = "";
		kvalue = (kvalue + testProcedure.getTestProcedureId());
		this.operatesLogSimpleAdd("T_TEST_PROCEDURE", "更新", "TEST_PROCEDURE_ID", kvalue, testProcedure, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性TestProcedure到数据库中
	 * <param name="testProcedure">需要更新的TestProcedure</param>
	 */
	public int testProcedureUpdateSelective(TestProcedure testProcedure) {
		int ret = this.getDao().testProcedureUpdateSelective(testProcedure);
		String kvalue = "";
		kvalue = (kvalue + testProcedure.getTestProcedureId());
		this.operatesLogSimpleAdd("T_TEST_PROCEDURE", "部分更新", "TEST_PROCEDURE_ID", kvalue, testProcedure, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象TestProcedure到数据库中
	 * <param name="testProcedureQueryCondition">附加的条件</param>
	 * <param name="testProcedure">需要更新的TestProcedure</param>
	 */
	public int testProcedureUpdateByCondition(TestProcedure testProcedure, TestProcedureExample testProcedureQueryCondition) {
		int ret = this.getDao().testProcedureUpdateByCondition(testProcedure, testProcedureQueryCondition);
		String kvalue = this.getTestProcedureExampleConditionSql(testProcedureQueryCondition);
		this.operatesLogSimpleAdd("T_TEST_PROCEDURE", "条件更新", "conditionSql", kvalue, testProcedure, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象TestProcedure到数据库中
	 * <param name="testProcedureQueryCondition">附加的条件</param>
	 * <param name="testProcedure">需要更新的TestProcedure</param>
	 */
	public int testProcedureUpdateSelectiveByCondition(TestProcedure testProcedure, TestProcedureExample testProcedureQueryCondition) {
		int ret = this.getDao().testProcedureUpdateSelectiveByCondition(testProcedure, testProcedureQueryCondition);
		String kvalue = this.getTestProcedureExampleConditionSql(testProcedureQueryCondition);
		this.operatesLogSimpleAdd("T_TEST_PROCEDURE", "批量部分更新", "conditionSql", kvalue, testProcedure, ret);
		return ret;
	}
	
	public String getTestProcedureExampleConditionSql(TestProcedureExample testProcedureQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < testProcedureQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			TestProcedureExample.Criteria item = testProcedureQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					TestProcedureExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="testProcedure">从数据库中查询一个对象TestProcedure</param>
	 * <param name="ATestProcedureId">²âÊÔ¹ý³Ì±êÊ¶</param>
	 */
	public TestProcedure testProcedureSelectByPrimaryKey(int ATestProcedureId) throws CacheException {
		return this.getDao().testProcedureSelectByPrimaryKey(ATestProcedureId);
	}
	
	/**
	 * <param name="testProcedureQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<TestProcedure> testProcedureSelectObjects(TestProcedureExample testProcedureQueryCondition) throws CacheException {
		return this.getDao().testProcedureSelectObjects(testProcedureQueryCondition);
	}
	
	/**
	 * <param name="testProcedureQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int testProcedureQuerySelectObjectsCount(TestProcedureExample testProcedureQueryCondition) throws CacheException {
		return this.getDao().testProcedureQuerySelectObjectsCount(testProcedureQueryCondition);
	}
	
	/**
	 * 插入一个对象User到数据库中
	 * <param name="user">需要插入的新对象</param>
	 */
	public int userInsert(User user) {
		int ret = this.getDao().userInsert(user);
		String kvalue = "";
		kvalue = (kvalue + user.getUserId());
		this.operatesLogSimpleAdd("T_USER", "插入", "USER_ID", kvalue, user, ret);
		return ret;
	}
	
	/**
	 * <param name="user">从数据库中删除一个对象User</param>
	 * <param name="AUserId">ÓÃ»§´úºÅ</param>
	 */
	public int userDeleteByPrimaryKey(int AUserId) {
		int ret = this.getDao().userDeleteByPrimaryKey(AUserId);
		String kvalue = "";
		kvalue = (kvalue + AUserId);
		this.operatesLogSimpleAdd("T_USER", "删除", "USER_ID", kvalue, AUserId, ret);
		return ret;
	}
	
	/**
	 * <param name="user">从数据库中删除一个对象User</param>
	 */
	public int userDeleteByCondition(UserExample userQueryCondition) {
		int ret = this.getDao().userDeleteByCondition(userQueryCondition);
		String kvalue = this.getUserExampleConditionSql(userQueryCondition);
		this.operatesLogSimpleAdd("T_USER", "条件删除", "conditionSql", kvalue, userQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象User到数据库中
	 * <param name="user">需要更新的User</param>
	 */
	public int userUpdate(User user) {
		int ret = this.getDao().userUpdate(user);
		String kvalue = "";
		kvalue = (kvalue + user.getUserId());
		this.operatesLogSimpleAdd("T_USER", "更新", "USER_ID", kvalue, user, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性User到数据库中
	 * <param name="user">需要更新的User</param>
	 */
	public int userUpdateSelective(User user) {
		int ret = this.getDao().userUpdateSelective(user);
		String kvalue = "";
		kvalue = (kvalue + user.getUserId());
		this.operatesLogSimpleAdd("T_USER", "部分更新", "USER_ID", kvalue, user, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象User到数据库中
	 * <param name="userQueryCondition">附加的条件</param>
	 * <param name="user">需要更新的User</param>
	 */
	public int userUpdateByCondition(User user, UserExample userQueryCondition) {
		int ret = this.getDao().userUpdateByCondition(user, userQueryCondition);
		String kvalue = this.getUserExampleConditionSql(userQueryCondition);
		this.operatesLogSimpleAdd("T_USER", "条件更新", "conditionSql", kvalue, user, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象User到数据库中
	 * <param name="userQueryCondition">附加的条件</param>
	 * <param name="user">需要更新的User</param>
	 */
	public int userUpdateSelectiveByCondition(User user, UserExample userQueryCondition) {
		int ret = this.getDao().userUpdateSelectiveByCondition(user, userQueryCondition);
		String kvalue = this.getUserExampleConditionSql(userQueryCondition);
		this.operatesLogSimpleAdd("T_USER", "批量部分更新", "conditionSql", kvalue, user, ret);
		return ret;
	}
	
	public String getUserExampleConditionSql(UserExample userQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < userQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			UserExample.Criteria item = userQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					UserExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="user">从数据库中查询一个对象User</param>
	 * <param name="AUserId">ÓÃ»§´úºÅ</param>
	 */
	public User userSelectByPrimaryKey(int AUserId) throws CacheException {
		return this.getDao().userSelectByPrimaryKey(AUserId);
	}
	
	/**
	 * <param name="userQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<User> userSelectObjects(UserExample userQueryCondition) throws CacheException {
		return this.getDao().userSelectObjects(userQueryCondition);
	}
	
	/**
	 * <param name="userQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int userQuerySelectObjectsCount(UserExample userQueryCondition) throws CacheException {
		return this.getDao().userQuerySelectObjectsCount(userQueryCondition);
	}
	
	/**
	 * 插入一个对象UserCheckIn到数据库中
	 * <param name="userCheckIn">需要插入的新对象</param>
	 */
	public int userCheckInInsert(UserCheckIn userCheckIn) {
		int ret = this.getDao().userCheckInInsert(userCheckIn);
		String kvalue = "";
		kvalue = (kvalue + userCheckIn.getId());
		this.operatesLogSimpleAdd("T_USER_CHECK_IN", "插入", "ID", kvalue, userCheckIn, ret);
		return ret;
	}
	
	/**
	 * <param name="userCheckIn">从数据库中删除一个对象UserCheckIn</param>
	 * <param name="AId"></param>
	 */
	public int userCheckInDeleteByPrimaryKey(String AId) {
		int ret = this.getDao().userCheckInDeleteByPrimaryKey(AId);
		String kvalue = "";
		kvalue = (kvalue + AId);
		this.operatesLogSimpleAdd("T_USER_CHECK_IN", "删除", "ID", kvalue, AId, ret);
		return ret;
	}
	
	/**
	 * <param name="userCheckIn">从数据库中删除一个对象UserCheckIn</param>
	 */
	public int userCheckInDeleteByCondition(UserCheckInExample userCheckInQueryCondition) {
		int ret = this.getDao().userCheckInDeleteByCondition(userCheckInQueryCondition);
		String kvalue = this.getUserCheckInExampleConditionSql(userCheckInQueryCondition);
		this.operatesLogSimpleAdd("T_USER_CHECK_IN", "条件删除", "conditionSql", kvalue, userCheckInQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象UserCheckIn到数据库中
	 * <param name="userCheckIn">需要更新的UserCheckIn</param>
	 */
	public int userCheckInUpdate(UserCheckIn userCheckIn) {
		int ret = this.getDao().userCheckInUpdate(userCheckIn);
		String kvalue = "";
		kvalue = (kvalue + userCheckIn.getId());
		this.operatesLogSimpleAdd("T_USER_CHECK_IN", "更新", "ID", kvalue, userCheckIn, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性UserCheckIn到数据库中
	 * <param name="userCheckIn">需要更新的UserCheckIn</param>
	 */
	public int userCheckInUpdateSelective(UserCheckIn userCheckIn) {
		int ret = this.getDao().userCheckInUpdateSelective(userCheckIn);
		String kvalue = "";
		kvalue = (kvalue + userCheckIn.getId());
		this.operatesLogSimpleAdd("T_USER_CHECK_IN", "部分更新", "ID", kvalue, userCheckIn, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象UserCheckIn到数据库中
	 * <param name="userCheckInQueryCondition">附加的条件</param>
	 * <param name="userCheckIn">需要更新的UserCheckIn</param>
	 */
	public int userCheckInUpdateByCondition(UserCheckIn userCheckIn, UserCheckInExample userCheckInQueryCondition) {
		int ret = this.getDao().userCheckInUpdateByCondition(userCheckIn, userCheckInQueryCondition);
		String kvalue = this.getUserCheckInExampleConditionSql(userCheckInQueryCondition);
		this.operatesLogSimpleAdd("T_USER_CHECK_IN", "条件更新", "conditionSql", kvalue, userCheckIn, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象UserCheckIn到数据库中
	 * <param name="userCheckInQueryCondition">附加的条件</param>
	 * <param name="userCheckIn">需要更新的UserCheckIn</param>
	 */
	public int userCheckInUpdateSelectiveByCondition(UserCheckIn userCheckIn, UserCheckInExample userCheckInQueryCondition) {
		int ret = this.getDao().userCheckInUpdateSelectiveByCondition(userCheckIn, userCheckInQueryCondition);
		String kvalue = this.getUserCheckInExampleConditionSql(userCheckInQueryCondition);
		this.operatesLogSimpleAdd("T_USER_CHECK_IN", "批量部分更新", "conditionSql", kvalue, userCheckIn, ret);
		return ret;
	}
	
	public String getUserCheckInExampleConditionSql(UserCheckInExample userCheckInQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < userCheckInQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			UserCheckInExample.Criteria item = userCheckInQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					UserCheckInExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="userCheckIn">从数据库中查询一个对象UserCheckIn</param>
	 * <param name="AId"></param>
	 */
	public UserCheckIn userCheckInSelectByPrimaryKey(String AId) throws CacheException {
		return this.getDao().userCheckInSelectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="userCheckInQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<UserCheckIn> userCheckInSelectObjects(UserCheckInExample userCheckInQueryCondition) throws CacheException {
		return this.getDao().userCheckInSelectObjects(userCheckInQueryCondition);
	}
	
	/**
	 * <param name="userCheckInQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int userCheckInQuerySelectObjectsCount(UserCheckInExample userCheckInQueryCondition) throws CacheException {
		return this.getDao().userCheckInQuerySelectObjectsCount(userCheckInQueryCondition);
	}
	
	/**
	 * 插入一个对象WorkLog到数据库中
	 * <param name="workLog">需要插入的新对象</param>
	 */
	public int workLogInsert(WorkLog workLog) {
		int ret = this.getDao().workLogInsert(workLog);
		String kvalue = "";
		kvalue = (kvalue + workLog.getWorkLogId());
		this.operatesLogSimpleAdd("T_WORK_LOG", "插入", "WORK_LOG_ID", kvalue, workLog, ret);
		return ret;
	}
	
	/**
	 * <param name="workLog">从数据库中删除一个对象WorkLog</param>
	 * <param name="AWorkLogId">¹¤×÷ÈÕÖ¾´úºÅ</param>
	 */
	public int workLogDeleteByPrimaryKey(int AWorkLogId) {
		int ret = this.getDao().workLogDeleteByPrimaryKey(AWorkLogId);
		String kvalue = "";
		kvalue = (kvalue + AWorkLogId);
		this.operatesLogSimpleAdd("T_WORK_LOG", "删除", "WORK_LOG_ID", kvalue, AWorkLogId, ret);
		return ret;
	}
	
	/**
	 * <param name="workLog">从数据库中删除一个对象WorkLog</param>
	 */
	public int workLogDeleteByCondition(WorkLogExample workLogQueryCondition) {
		int ret = this.getDao().workLogDeleteByCondition(workLogQueryCondition);
		String kvalue = this.getWorkLogExampleConditionSql(workLogQueryCondition);
		this.operatesLogSimpleAdd("T_WORK_LOG", "条件删除", "conditionSql", kvalue, workLogQueryCondition, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象WorkLog到数据库中
	 * <param name="workLog">需要更新的WorkLog</param>
	 */
	public int workLogUpdate(WorkLog workLog) {
		int ret = this.getDao().workLogUpdate(workLog);
		String kvalue = "";
		kvalue = (kvalue + workLog.getWorkLogId());
		this.operatesLogSimpleAdd("T_WORK_LOG", "更新", "WORK_LOG_ID", kvalue, workLog, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象的部分属性WorkLog到数据库中
	 * <param name="workLog">需要更新的WorkLog</param>
	 */
	public int workLogUpdateSelective(WorkLog workLog) {
		int ret = this.getDao().workLogUpdateSelective(workLog);
		String kvalue = "";
		kvalue = (kvalue + workLog.getWorkLogId());
		this.operatesLogSimpleAdd("T_WORK_LOG", "部分更新", "WORK_LOG_ID", kvalue, workLog, ret);
		return ret;
	}
	
	/**
	 * 更新一个对象，含Blob字段WorkLog到数据库中
	 * <param name="workLog">需要更新的WorkLog</param>
	 */
	public int workLogUpdateWithBlobs(WorkLog workLog) {
		int ret = this.getDao().workLogUpdateWithBlobs(workLog);
		String kvalue = "";
		kvalue = (kvalue + workLog.getWorkLogId());
		this.operatesLogSimpleAdd("T_WORK_LOG", "更新含Blob", "WORK_LOG_ID", kvalue, workLog, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象WorkLog到数据库中
	 * <param name="workLogQueryCondition">附加的条件</param>
	 * <param name="workLog">需要更新的WorkLog</param>
	 */
	public int workLogUpdateByCondition(WorkLog workLog, WorkLogExample workLogQueryCondition) {
		int ret = this.getDao().workLogUpdateByCondition(workLog, workLogQueryCondition);
		String kvalue = this.getWorkLogExampleConditionSql(workLogQueryCondition);
		this.operatesLogSimpleAdd("T_WORK_LOG", "条件更新", "conditionSql", kvalue, workLog, ret);
		return ret;
	}
	
	/**
	 * 更新一批对象WorkLog到数据库中
	 * <param name="workLogQueryCondition">附加的条件</param>
	 * <param name="workLog">需要更新的WorkLog</param>
	 */
	public int workLogUpdateSelectiveByCondition(WorkLog workLog, WorkLogExample workLogQueryCondition) {
		int ret = this.getDao().workLogUpdateSelectiveByCondition(workLog, workLogQueryCondition);
		String kvalue = this.getWorkLogExampleConditionSql(workLogQueryCondition);
		this.operatesLogSimpleAdd("T_WORK_LOG", "批量部分更新", "conditionSql", kvalue, workLog, ret);
		return ret;
	}
	
	public String getWorkLogExampleConditionSql(WorkLogExample workLogQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < workLogQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			WorkLogExample.Criteria item = workLogQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					WorkLogExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="workLog">从数据库中查询一个对象WorkLog</param>
	 * <param name="AWorkLogId">¹¤×÷ÈÕÖ¾´úºÅ</param>
	 */
	public WorkLog workLogSelectByPrimaryKey(int AWorkLogId) throws CacheException {
		return this.getDao().workLogSelectByPrimaryKey(AWorkLogId);
	}
	
	/**
	 * <param name="workLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<WorkLog> workLogSelectObjects(WorkLogExample workLogQueryCondition) throws CacheException {
		return this.getDao().workLogSelectObjects(workLogQueryCondition);
	}
	
	/**
	 * <param name="workLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<WorkLog> workLogSelectObjectsWithBLOBs(WorkLogExample workLogQueryCondition) throws CacheException {
		return this.getDao().workLogSelectObjectsWithBLOBs(workLogQueryCondition);
	}
	
	/**
	 * <param name="workLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int workLogQuerySelectObjectsCount(WorkLogExample workLogQueryCondition) throws CacheException {
		return this.getDao().workLogQuerySelectObjectsCount(workLogQueryCondition);
	}
	
	/**
	 * 插入一个对象WorkLogRelationshipTask到数据库中
	 * <param name="workLogRelationshipTask">需要插入的新对象</param>
	 */
	public int workLogRelationshipTaskInsert(WorkLogRelationshipTaskKey workLogRelationshipTask) {
		int ret = this.getDao().workLogRelationshipTaskInsert(workLogRelationshipTask);
		String kvalue = "";
		kvalue = (kvalue + workLogRelationshipTask.getTaskId());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + workLogRelationshipTask.getWorkLogId());
		this.operatesLogSimpleAdd("T_WORK_LOG_RELATIONSHIP_TASK", "插入", "TASK_ID,WORK_LOG_ID", kvalue, workLogRelationshipTask, ret);
		return ret;
	}
	
	/**
	 * <param name="workLogRelationshipTask">从数据库中删除一个对象WorkLogRelationshipTask</param>
	 * <param name="AWorkLogRelationshipTaskKey">¹¤×÷ÈÕÖ¾¡ª¡ª¹ØÏµ¡ª¡ªÈÎÎñ±í 主键类</param>
	 */
	public int workLogRelationshipTaskDeleteByPrimaryKey(WorkLogRelationshipTaskKey AWorkLogRelationshipTaskKey) {
		int ret = this.getDao().workLogRelationshipTaskDeleteByPrimaryKey(AWorkLogRelationshipTaskKey);
		String kvalue = "";
		kvalue = (kvalue + AWorkLogRelationshipTaskKey.getTaskId());
		kvalue = (kvalue + ",");
		kvalue = (kvalue + AWorkLogRelationshipTaskKey.getWorkLogId());
		this.operatesLogSimpleAdd("T_WORK_LOG_RELATIONSHIP_TASK", "删除", "TASK_ID,WORK_LOG_ID", kvalue, AWorkLogRelationshipTaskKey, ret);
		return ret;
	}
	
	/**
	 * <param name="workLogRelationshipTask">从数据库中删除一个对象WorkLogRelationshipTask</param>
	 */
	public int workLogRelationshipTaskDeleteByCondition(WorkLogRelationshipTaskExample workLogRelationshipTaskQueryCondition) {
		int ret = this.getDao().workLogRelationshipTaskDeleteByCondition(workLogRelationshipTaskQueryCondition);
		String kvalue = this.getWorkLogRelationshipTaskExampleConditionSql(workLogRelationshipTaskQueryCondition);
		this.operatesLogSimpleAdd("T_WORK_LOG_RELATIONSHIP_TASK", "条件删除", "conditionSql", kvalue, workLogRelationshipTaskQueryCondition, ret);
		return ret;
	}
	
	public String getWorkLogRelationshipTaskExampleConditionSql(WorkLogRelationshipTaskExample workLogRelationshipTaskQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < workLogRelationshipTaskQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			WorkLogRelationshipTaskExample.Criteria item = workLogRelationshipTaskQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					WorkLogRelationshipTaskExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="workLogRelationshipTaskQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<WorkLogRelationshipTaskKey> workLogRelationshipTaskSelectObjects(WorkLogRelationshipTaskExample workLogRelationshipTaskQueryCondition) throws CacheException {
		return this.getDao().workLogRelationshipTaskSelectObjects(workLogRelationshipTaskQueryCondition);
	}
	
	/**
	 * <param name="workLogRelationshipTaskQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int workLogRelationshipTaskQuerySelectObjectsCount(WorkLogRelationshipTaskExample workLogRelationshipTaskQueryCondition) throws CacheException {
		return this.getDao().workLogRelationshipTaskQuerySelectObjectsCount(workLogRelationshipTaskQueryCondition);
	}
	
	public String getVWorkLogViewExampleConditionSql(VWorkLogViewExample vWorkLogViewQueryCondition) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; (i < vWorkLogViewQueryCondition.getOredCriteria().size()); i = (i + 1)) {
			VWorkLogViewExample.Criteria item = vWorkLogViewQueryCondition.getOredCriteria().get(i);
			if (item.isValid()) {
				if ((sb.length() > 0)) {
					sb.append(" or ");
				}
				sb.append(" ((1 = 1) ");
				for (int j = 0; (j < item.getCriteria().size()); j = (j + 1)) {
					VWorkLogViewExample.Criterion item1 = item.getCriteria().get(j);
					if (item1.isNoValue()) {
						sb.append(" and (");
						sb.append(item1.getCondition());
						sb.append(")");
					}
					else {
						if (item1.isSingleValue()) {
							sb.append(" and (");
							sb.append(item1.getCondition());
							sb.append(item1.getValue());
							sb.append(")");
						}
						else {
							if (item1.isBetweenValue()) {
								sb.append(" and (");
								sb.append(item1.getCondition());
								sb.append(item1.getValue());
								sb.append(" and ");
								sb.append(item1.getSecondValue());
								sb.append(")");
							}
							else {
								if (item1.isListValue()) {
									sb.append(" and (");
									sb.append(item1.getCondition());
									sb.append("(");
									Collection coll = ((Collection)(item1.getValue()));
									boolean first = true;
									for (Iterator it = coll.iterator(); it.hasNext(); ) {
										if (first) {
											first = false;
										}
										else {
											sb.append(",");
										}
										sb.append(it.next());
									}
									sb.append(")");
									sb.append(")");
								}
							}
						}
					}
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}
	
	/**
	 * <param name="vWorkLogViewQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<VWorkLogView> vWorkLogViewSelectObjects(VWorkLogViewExample vWorkLogViewQueryCondition) throws CacheException {
		return this.getDao().vWorkLogViewSelectObjects(vWorkLogViewQueryCondition);
	}
	
	/**
	 * <param name="vWorkLogViewQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int vWorkLogViewQuerySelectObjectsCount(VWorkLogViewExample vWorkLogViewQueryCondition) throws CacheException {
		return this.getDao().vWorkLogViewQuerySelectObjectsCount(vWorkLogViewQueryCondition);
	}
	
	/**
	 * 简单的日志接口,调用Dao
	 * <param name="tableName">表名称</param>
	 * <param name="operateName">操作名称</param>
	 * <param name="keyFieldName">主键字段名</param>
	 * <param name="keyFieldValue">主键字段值</param>
	 * <param name="param">附加参数</param>
	 * <param name="updateCount">更新数量</param>
	 */
	public void operatesLogSimpleAdd(String tableName, String operateName, String keyFieldName, String keyFieldValue, Object param, int updateCount) {
		this.getDao().operatesLogSimpleAdd(tableName, operateName, keyFieldName, keyFieldValue, param, updateCount);
	}
}
