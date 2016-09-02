/**
 * $Id$
 */
package cn.topdeep.projgroup.action.work;

import cn.topdeep.projgroup.action.BaseAction;
import cn.topdeep.projgroup.converter.Json;
import cn.topdeep.projgroup.entity.*;

import java.io.*;
import java.util.*;
import java.sql.SQLException;
import java.sql.Timestamp;

import common.cache2.CacheException;

import net.sf.json.*;


/**
 * @author niexin
 *
 */
public class TaskGanttView extends BaseAction {
	private String projData;

	private int projId;//default test
	
	public String getProjData() throws DbException, SQLException, CacheException {
		if(projData == null && projId > 0){
			Project project = getProjectBiz().projectSelectByProjId(projId);
			Map<String, Object> projMap = new HashMap<String, Object>();
			projMap.put("UID", project.getProjId());
			projMap.put("Name", project.getProjectName());
			projMap.put("StartDate", project.getProjectPlanStartDate());
			projMap.put("FinishDate", project.getProjectPlanEndDate());
			projMap.put("CreationDate", project.getProjectPlanStartDate());
			projMap.put("LastSaved", project.getProjectPlanStartDate());
			projMap.put("CalendarUID", 1);
			projMap.put("WeekStartDay", 0);
			//projMap.put("DefaultStartTime", "");
			//projMap.put("DefaultFinishTime", "");
			projMap.put("MinutesPerDay", 480);
			projMap.put("MinutesPerWeek", 2400);
			projMap.put("DaysPerMonth", 20);
			
			projMap.put("Resources", getResourceList());
			projMap.put("Assignments", getAssignmentList());
			projMap.put("Tasks", getTaskList());
			/*
			 {"UID":1,"Duration":28,"Start":new Date(1167609600000),"PercentComplete":0,"ProjectUID":52,"Milestone":0,"Finish":new Date(1167883200000),"Summary":1,"ConstraintType":0,"DurationFormat":21,"Type":1,"OutlineLevel":1,"Critical":1,"Notes":"","CreateDate":new Date(1161909600000),"Name":"项目范围规划","ID":1,"OutlineNumber":"1","ConstraintDate":{},"Estimated":0,"HyperlinkAddress":"","Hyperlink":"","Priority":500}
			 * */
			
			Map result = new HashMap();
			result.put("error", 0);
			result.put("result", projMap);
			projData = Json.encode(result);
		}
		return projData;
	}
	
	private List getTaskList() throws DbException, SQLException, CacheException{
		List<VTaskPreviousTask> prevList = getProjectBiz().vTaskPreviousTaskSelectObjects(new VTaskPreviousTaskQueryCondition().setTaskProjectIdCondition(projId), 0, Integer.MAX_VALUE, "TASK_OUTLINE", "asc");
		List<Task> taskList = getProjectBiz().taskSelectObjectsByTaskProjectId(projId);
		int k= 1;
		List taskMap = new ArrayList();
		for(Task item : taskList){
			Map<String, Object> itemMap = new HashMap<String, Object>();
			itemMap.put("UID", item.getTaskId());
			itemMap.put("Duration", item.getEstimateWorkTime());
			itemMap.put("Start", item.getTaskPlanStartDate());
			itemMap.put("PercentComplete", item.getTaskComplete());
			itemMap.put("ProjectUID", item.getTaskProjectId());
			itemMap.put("Milestone", 0);
			itemMap.put("Finish", item.getTaskPlanEndDate());
			itemMap.put("Summary", 1);
			itemMap.put("ConstraintType", 0);
			itemMap.put("DurationFormat", 21);
			itemMap.put("Type", 1);
			itemMap.put("OutlineLevel", item.getTaskLevel()+1);
			itemMap.put("Critical", 1);
			itemMap.put("Notes", "");
			itemMap.put("CreateDate", item.getTaskPlanStartDate());
			itemMap.put("Name", item.getTaskName());
			itemMap.put("ID", ""+k);
			k++;
			itemMap.put("OutlineNumber", item.getTaskOutline());
			//itemMap.put("ConstraintDate", "");
			itemMap.put("Estimated", 0);
			itemMap.put("HyperlinkAddress", "");
			itemMap.put("Hyperlink", "");
			itemMap.put("Priority", 500);
			//设置前置任务
			List prevTaskMap = new ArrayList();
			for(VTaskPreviousTask prevItem : prevList){
				if(prevItem.getTaskId() == item.getTaskId()){
					Map<String, Object> prevItemMap = new HashMap<String, Object>();
					//"PredecessorLink":[{"TaskUID":3,"LinkLag":0,"ProjectUID":52,"Type":1,"LagFormat":7,"PredecessorUID":2}]
					prevItemMap.put("TaskUID",item.getTaskId());
					prevItemMap.put("LinkLag",0);
					prevItemMap.put("ProjectUID",projId);
					prevItemMap.put("Type",1);
					prevItemMap.put("LagFormat",7);
					prevItemMap.put("PredecessorUID",prevItem.getPreviousTaskId());
					prevTaskMap.add(prevItemMap);
				}
			}
			if(prevTaskMap.size() > 0){
				itemMap.put("PredecessorLink", prevTaskMap);
			}
			taskMap.add(itemMap);
		}
		return taskMap;
	}

	private List getResourceList() throws DbException, SQLException, CacheException{
		List<VProjectUser> userList = getProjectBiz().vProjectUserSelectObjects(new VProjectUserQueryCondition().setProjectIdCondition(projId));
		List listMap = new ArrayList();
		//{"Name":"管理人员","ProjectUID":52,"UID":1,"Type":1},{"Name":"项目经理","ProjectUID":52,"UID":2,"Type":1},{"Name":"分析人员","ProjectUID":52,"UID":3,"Type":1},{"Name":"开发人员","ProjectUID":52,"UID":4,"Type":1}
//		List<VProjectTaskUser>
		for(VProjectUser item : userList){
			Map<String, Object> itemMap = new HashMap<String, Object>();
			itemMap.put("Name", item.getRealName());
			itemMap.put("ProjectUID", projId);
			itemMap.put("UID", item.getUserId());
			itemMap.put("Type", 1);
			listMap.add(itemMap);
		}
		return listMap;
	}
	
	private List getAssignmentList() throws DbException, SQLException, CacheException{
		List<VProjectTaskUser> taskUserList = getProjectBiz().vProjectTaskUserSelectObjects(new VProjectTaskUserQueryCondition().setProjectIdCondition(projId).setSelectedCondition(true));
		List listMap = new ArrayList();
		for(VProjectTaskUser item : taskUserList){
			Map<String, Object> itemMap = new HashMap<String, Object>();
			itemMap.put("ResourceUID", item.getUserId());
			itemMap.put("TaskUID", item.getTaskId());
			itemMap.put("ProjectUID", projId);
			itemMap.put("UID", item.getTaskUserId());
			listMap.add(itemMap);
		}
		return listMap;
		//"Assignments":[{"ResourceUID":1,"TaskUID":2,"ProjectUID":52,"UID":87}
	}
	
	
	public int getProjId() {
		return projId;
	}

	public void setProjId(int projId) {
		this.projId = projId;
	}
	
}
