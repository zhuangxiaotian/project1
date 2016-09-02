package cn.topdeep.projgroup.action.work;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import common.cache2.CacheException;
import common.privilege.PrivilegeOperate;
import cn.topdeep.projgroup.action.PageAction;
import cn.topdeep.projgroup.dao.ProjgroupDao;
import cn.topdeep.projgroup.entity.DbException;
import cn.topdeep.projgroup.entity.Privilege;
import cn.topdeep.projgroup.entity.db.*;
import cn.topdeep.projgroup.entity.data.OaQueryCondition;

public class WorkLogView extends PageAction {

	private Integer rowsCount;
	
	private int logId;
	private int logScore;
	
	@Override
	public int getRowsCount() {
		if(rowsCount == null){
			try {
				rowsCount = getProjectBiz().queryWorkLogListByConditionCount(condition);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return rowsCount;
	}
	
	public String execute() throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException{
		return SUCCESS;
	}
	
	private List<cn.topdeep.projgroup.entity.view.WorkLogView> logList;
	
	public List<cn.topdeep.projgroup.entity.view.WorkLogView> getLogList() throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException, CacheException {
		if(logList == null){
			logList = getProjectBiz().getWorkLogListByCondition(condition ,getPageIndex(), getRowsOfPage(), "WORK_DAY", "desc");
			UserExample condition = new UserExample();
			condition.or().andUserStateEqualTo(1);
			List<User> uList = getProjectBiz().userSelectObjects(condition);
			Map<Integer, String> uNameMap = new HashMap<Integer, String>();
			for(User item : uList){
				if(!uNameMap.containsKey(item.getUserId())){
					uNameMap.put(item.getUserId(), item.getRealName());
				}
			}
			for(cn.topdeep.projgroup.entity.view.WorkLogView item : logList){
				if(uNameMap.containsKey(item.getWorkUserId())){
					item.setWorkerName(uNameMap.get(item.getWorkUserId()));
				}
			}
		}
		return logList;
	}
	
	public String search() throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		setPageIndex(0);
		return execute();
	}
	
	
	private List<User>  userList;
	private OaQueryCondition condition;

	public OaQueryCondition getCondition() {
		if(condition == null) {
			condition = new OaQueryCondition();
		}
		return condition;
	}

	public void setCondition(OaQueryCondition condition) {
		this.condition = condition;
	}

	public List<User> getUserList() throws DbException, SQLException, CacheException {
		if(userList == null) {
			UserExample condition = new UserExample();
			condition.or().andUserStateEqualTo(1);
			userList = getProjectBiz().userSelectObjects(condition);
		}
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	
	public String ajaxSetLogScore(){
		HashMap<String, Object> map = new HashMap<String, Object>();
		try {
			if(getLoginUser().hasPrivilege(Privilege.FUNC_SCORE_MANAGE, PrivilegeOperate.Execute)){
				if(logId > 0){
					WorkLog log = getProjectBiz().workLogSelectByPrimaryKey(logId);
					if(log != null){
						log.setWorkEvaluationScore(logScore);
						getProjectBiz().workLogUpdate(log);
						map.put("result", true);
						map.put("msg", "设置成功");
					}
				}
			}
		} catch (Exception e) {
			LOG.debug(e.getMessage(), e);
		}
		if(map.size() == 0){
			map.put("result", false);
			map.put("msg", "设置失败");
		}
		jsonObj = map;
		return AJAX;
	}

	/**
	 * @return the logId
	 */
	public int getLogId() {
		return logId;
	}

	/**
	 * @param logId the logId to set
	 */
	public void setLogId(int logId) {
		this.logId = logId;
	}

	/**
	 * @return the logScore
	 */
	public int getLogScore() {
		return logScore;
	}

	/**
	 * @param logScore the logScore to set
	 */
	public void setLogScore(int logScore) {
		this.logScore = logScore;
	}
	
	


}
