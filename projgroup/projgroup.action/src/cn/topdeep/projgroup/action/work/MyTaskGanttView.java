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
public class MyTaskGanttView extends BaseAction {
	private String projData;

	public String getProjData() throws DbException, SQLException, CacheException {
		if(projData == null){
			//Project project = getProjectBiz().projectSelectByProjId(projId);
			//生成模拟项目
			Map<String, Object> projMap = new HashMap<String, Object>();
			projMap.put("UID", 1);
			projMap.put("Name", "待完成工作列表");
			projMap.put("StartDate", new java.util.Date());
			projMap.put("FinishDate", new java.util.Date());
			projMap.put("CreationDate", new java.util.Date());
			projMap.put("LastSaved", new java.util.Date());
			projMap.put("CalendarUID", 1);
			projMap.put("WeekStartDay", 0);
			//projMap.put("DefaultStartTime", "");
			//projMap.put("DefaultFinishTime", "");
			projMap.put("MinutesPerDay", 480);
			projMap.put("MinutesPerWeek", 2400);
			projMap.put("DaysPerMonth", 20);
			
			//projMap.put("Resources", getResourceList());
			//projMap.put("Assignments", getAssignmentList());
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
		//List<VTaskPreviousTask> prevList = getProjectBiz().vTaskPreviousTaskSelectObjects(new VTaskPreviousTaskQueryCondition(), 0, Integer.MAX_VALUE, "TASK_OUTLINE", "asc");
		List<VUserTask> taskList = getProjectBiz().vUserTaskSelectObjects(new VUserTaskQueryCondition().setUserIdCondition(getLoginUser().getLoginUser().getUserId()), 0, Integer.MAX_VALUE, "TASK_OUTLINE", "asc");
		
		int k= 1;
		List taskMap = new ArrayList();
		for(VUserTask item : taskList){
			Map<String, Object> itemMap = new HashMap<String, Object>();
			itemMap.put("UID", item.getTaskId());
			itemMap.put("Duration", item.getEstimateWorkTime() / 8);
			itemMap.put("Start", item.getTaskPlanStartDate());
			itemMap.put("PercentComplete", 0);
			itemMap.put("ProjectUID", item.getTaskProjectId());
			itemMap.put("Milestone", 0);
			itemMap.put("Finish", item.getTaskPlanEndDate());
			itemMap.put("Summary", 1);
			itemMap.put("ConstraintType", 0);
			itemMap.put("DurationFormat", 21);
			itemMap.put("Type", 1);
			itemMap.put("OutlineLevel", 1);
			itemMap.put("Critical", 1);
			itemMap.put("Notes", "");
			itemMap.put("CreateDate", item.getTaskPlanStartDate());
			itemMap.put("Name", item.getTaskName());
			itemMap.put("ID", ""+k);
			itemMap.put("OutlineNumber", ""+k);
			k++;
			//itemMap.put("ConstraintDate", "");
			itemMap.put("Estimated", 0);
			itemMap.put("HyperlinkAddress", "");
			itemMap.put("Hyperlink", "");
			itemMap.put("Priority", 500);
			taskMap.add(itemMap);
		}
		return taskMap;
	}

}
