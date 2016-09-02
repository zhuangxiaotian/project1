/**
 * $Id$
 */
package cn.topdeep.projgroup.action.system;

import cn.topdeep.projgroup.action.BaseAction;
import cn.topdeep.projgroup.entity.*;

import java.sql.SQLException;
import java.util.*;

import common.cache2.CacheException;

/**
 * @author niexin
 *
 */
public class SystemAction extends BaseAction {
	
	private String operateResult;
	
	public String rebuildTaskOutline() throws DbException, SQLException, CacheException{
		//重建所有的项目的大纲视图
		//查出所有的项目，一个一个项目的处理
		List<Project> projectList = getProjectBiz().projectSelectObjects();
		for(Project item : projectList){
			rebuildTaskOutline(item.getProjId());
		}
		return SUCCESS;
	}
	
	private void rebuildTaskOutline(int projId) throws DbException, SQLException, CacheException{
		//查出所有的任务，第一级任务分别为1，2，顺序下来
		rebuildTaskOutline(projId, null);
	}
	
	private void rebuildTaskOutline(int projId, Task parentTask) throws DbException, SQLException, CacheException{
		List<Task> taskList;
		if(parentTask == null){
			taskList = getProjectBiz().taskSelectObjects(" where task_project_id = "+projId+" and task_parent_id is null order by order_field asc");
		}else{
			taskList = getProjectBiz().taskSelectObjects(" where task_project_id = "+projId+" and task_parent_id = "+parentTask.getTaskId()+" order by order_field asc");
		}
		int k = 1;
		for(Task item : taskList){
			if(parentTask == null){
				item.setTaskLevel(0);
				item.setTaskOutline(""+k);
				k++;
			}else{
				item.setTaskLevel(parentTask.getTaskLevel()+1);
				item.setTaskOutline(parentTask.getTaskOutline()+"."+k);
				k++;
			}
			getProjectBiz().taskUpdate(item);
			rebuildTaskOutline(projId, item);
		}
	}

	public String getOperateResult() {
		return operateResult;
	}
}
