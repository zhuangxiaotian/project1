/**
 * $Id$
 */
package cn.topdeep.projgroup.action.example;

import cn.topdeep.projgroup.action.BaseAction;
import cn.topdeep.projgroup.converter.Json;
import cn.topdeep.projgroup.converter.JsonDateProcessor;
import cn.topdeep.projgroup.entity.DbException;
import cn.topdeep.projgroup.entity.Project;
import cn.topdeep.projgroup.entity.Task;

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
public class GanttTest extends BaseAction {
	private String projData;

	private int projId = 21;//default test
	
	public String getProjData() throws DbException, SQLException, CacheException {
		if(projData == null){
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
			
			List<Task> taskList = getProjectBiz().taskSelectObjectsByTaskProjectId(projId);
			int k= 1;
			List taskMap = new ArrayList();
			for(Task item : taskList){
				Map<String, Object> itemMap = new HashMap<String, Object>();
				itemMap.put("UID", item.getTaskId());
				itemMap.put("Duration", 28);
				itemMap.put("Start", item.getTaskPlanStartDate());
				itemMap.put("PercentComplete", 0);
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
				taskMap.add(itemMap);
			}
			projMap.put("Tasks", taskMap);
			/*
			 {"UID":1,"Duration":28,"Start":new Date(1167609600000),"PercentComplete":0,"ProjectUID":52,"Milestone":0,"Finish":new Date(1167883200000),"Summary":1,"ConstraintType":0,"DurationFormat":21,"Type":1,"OutlineLevel":1,"Critical":1,"Notes":"","CreateDate":new Date(1161909600000),"Name":"项目范围规划","ID":1,"OutlineNumber":"1","ConstraintDate":{},"Estimated":0,"HyperlinkAddress":"","Hyperlink":"","Priority":500}
			 * */
			
			
			
			Map testMap = new HashMap<String, Object>();
			testMap.put("testDate", new Date());
			projData = Json.encode(testMap);
			
			
			
			Map result = new HashMap();
			result.put("error", 0);
			result.put("result", projMap);
			projData = Json.encode(result);
		}
		return projData;
	}

//	public String getProjData() throws IOException {
//		if(projData == null){
//			FileInputStream fis = new FileInputStream("R:/Tomcat 6.0/webapps/oa/project.txt");
//			InputStreamReader isr = new InputStreamReader(fis,"utf-8");
//			BufferedReader br = new BufferedReader(isr);
//			projData = br.readLine();
//			br.close();
//			isr.close();
//			fis.close();
//		}
//		return projData;
//	}
	
	
}
