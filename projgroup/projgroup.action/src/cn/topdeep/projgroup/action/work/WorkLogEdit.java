package cn.topdeep.projgroup.action.work;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import common.privilege.PrivilegeOperate;
import common.util.StringUtils;

import cn.topdeep.projgroup.action.BaseAction;
import cn.topdeep.projgroup.action.work.*;
import cn.topdeep.projgroup.dao.ProjgroupDao;
import cn.topdeep.projgroup.entity.DbException;
import cn.topdeep.projgroup.entity.WorkLog;
import cn.topdeep.projgroup.entity.WorkLogQueryCondition;
import cn.topdeep.projgroup.entity.view.LogTaskView;
import cn.topdeep.projgroup.entity.view.ProjUserView;

public class WorkLogEdit extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6661910070228641154L;

	private String currentScore;
	
	
	public String execute() throws DbException, SQLException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException{
		if(getLogId()>0){
			return SUCCESS;
		}
		
		else return INPUT;
	}
	
	public boolean isOwnerLog() throws DbException, SQLException{
		return getWorkLog().getWorkUserId() == getLoginUserId();
	}
	//private ProjgroupDao projgdao;
	
	public void validateSave() throws DbException, SQLException {
		if(getWorkLog().getWorkDay() == null) {
			addFieldError("workLog.workDay", "请选择当前工作日");
		}
		if(StringUtils.isNullOrEmpty(getWorkLog().getWorkContent())) {
			addFieldError("error", "请输入日志内容");
		}
		
		List<WorkLog> logList = getSystemBiz().workLogSelectObjects(new WorkLogQueryCondition().setWorkUserIdCondition(getLoginUserId()).setWorkDayCondition(getWorkLog().getWorkDay()));
		if(logList.size() > 0){
			WorkLog qWorkLog = logList.get(0);
			if(qWorkLog.getWorkLogId() != getWorkLog().getWorkLogId()){
				addFieldError("workLog.workDay", "重复的工作日");
			}
		}
		
		Date limitDay = getWorkLog().getWorkDay();
		limitDay = StringUtils.getDate(limitDay, 3);
		if(limitDay.getTime() < new Date().getTime()){
			addFieldError("workLog.workDay", "不能写早于1天的工作日志");
		}
		
	}
	
	
	
	public String save() throws Exception{
		if(this.relationtask!=null){
			if(relationtask.length == 1 && relationtask[0].equals("false")){
				getProjectBiz().saveWorkLog(this.workLog,null);
			}else{
				int[] ids = new int[relationtask.length];
				for(int i=0;i<relationtask.length;i++){
					ids[i] = Integer.parseInt(relationtask[i]);
				}
				getProjectBiz().saveWorkLog(this.workLog,ids);
			}
		}
		else{
			getProjectBiz().saveWorkLog(this.workLog,null);
		}
		
		return SUCCESS;
	}
	
	private WorkLog workLog; 
	
	private int logId;
	
	/*
	 * 为了将登陆名与日志作者名进行比较，需要将登陆名拿出来。
	 */
	private List logRelationTaskList;
	private String[] relationtask;
	private List myTaskListAllRelation;
	
	public List getMyTaskListAllRelation() {
		return myTaskListAllRelation;
	}

	public void setMyTaskListAllRelation(List myTaskListAllRelation) {
		this.myTaskListAllRelation = myTaskListAllRelation;
	}

	public WorkLog getWorkLog() throws DbException, SQLException {
		if(workLog == null){
			if(logId > 0){
				this.workLog = getProjectBiz().getWorkLog(logId);
				if(this.workLog.getWorkContent() == null){
					this.workLog.setWorkContent("");
				}
				this.workLog.setWorkContent(this.workLog.getWorkContent().replaceAll("\r\n", "").replaceAll("\r", "").replaceAll("\n", ""));
			}
		}else{
			if(workLog != null) {
				return workLog;
			}
		}
//System.out.println(getLoginUser().HasPrivilege(18, PrivilegeOperate.Delete));
//System.out.println(getLoginUser().HasPrivilege(18, PrivilegeOperate.Read));
//System.out.println(getLoginUser().HasPrivilege(18, PrivilegeOperate.Write));
		return workLog;
	}

	public void setWorkLog(WorkLog workLog) {
		this.workLog = workLog;
	}

	public int getLogId() {
		return logId;
	}

	public void setLogId(int logId) throws DbException, SQLException {
		this.logId = logId;
	}
	public String change() throws DbException, SQLException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException{
		this.logRelationTaskList=getLogRelationTaskList();
		this.myTaskListAllRelation=getProjectBiz().getmyTaskListAllRelation(getLoginUser().getLoginUser().getUserId());
		return INPUT;
	}

	public int getLoginUserId() {
		return getLoginUser().getLoginUser().getUserId();
	}

	public List<LogTaskView> getLogRelationTaskList() throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		
			if(logRelationTaskList == null){
				logRelationTaskList = getProjectBiz().getLogRelationTaskList(logId,getLoginUser().getLoginUser().getUserId());
			}
			return logRelationTaskList;
		
	}

	public void setLogRelationTaskList(List logRelationTaskList) {
		this.logRelationTaskList = logRelationTaskList;
	}

	public void setrelationtask(String[] relationtask) {
		this.relationtask = relationtask;
	}
	
	
	private Integer logscore;
	private String workevaluationcontent;
	
	public Integer getLogscore() {
		return logscore;
	}

	public void setLogscore(Integer logscore) {
		this.logscore = logscore;
	}


	public String getWorkevaluationcontent() {
		return workevaluationcontent;
	}

	public void setWorkevaluationcontent(String workevaluationcontent) {
		this.workevaluationcontent = workevaluationcontent;
	}

	public String scoresave() throws Exception {
		WorkLog newlog = getProjectBiz().getWorkLog(logId);
		if(newlog != null ) {
			if(!StringUtils.isNullOrEmpty(workevaluationcontent)) {
				newlog.setWorkEvaluationContent(workevaluationcontent);
//System.out.println(getLoginUser().HasPrivilege(12, PrivilegeOperate.Delete));
//System.out.println(getLoginUser().HasPrivilege(12, PrivilegeOperate.Read));
//System.out.println(getLoginUser().HasPrivilege(12, PrivilegeOperate.Write));
			}
			newlog.setWorkEvaluationScore(logscore);
			getProjectBiz().saveWorkLog(newlog);
		} 
		return execute();
	}

	/**
	 * @return the currentScore
	 */
	public String getCurrentScore() throws SQLException {
		if(currentScore == null){
			java.util.Date now = new java.util.Date();
			Calendar calendar = Calendar.getInstance();   
		    calendar.set(Calendar.DAY_OF_MONTH, calendar   
		            .getActualMinimum(Calendar.DAY_OF_MONTH)); 
			java.util.Date firstDate = calendar.getTime();
			int totalDay = 0;
			int diff = StringUtils.getDateDiff(firstDate, now);
			for(int i=0;i<diff;i++){
				java.util.Date day = StringUtils.getDate(firstDate, i);
				calendar.setTime(day);
				if(!(calendar.get(Calendar.DAY_OF_WEEK) == 7)){
					totalDay++;
				}
			}
			//ok get totalday
			if(totalDay > 0){
				int year = Integer.parseInt(StringUtils.dateTimeToString(firstDate, "yyyy"));
				int month = Integer.parseInt(StringUtils.dateTimeToString(firstDate, "MM"));
				double totalScore = getProjectBiz().queryUserScoreByMonth(year, month, getLoginUserId());
				totalScore = totalScore / totalDay;
				currentScore = new DecimalFormat("#.##").format(totalScore);
			}else{
				currentScore = "";
			}
		}
		return currentScore;
	}

}
