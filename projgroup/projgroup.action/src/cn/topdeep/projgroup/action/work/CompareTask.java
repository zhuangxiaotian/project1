package cn.topdeep.projgroup.action.work;

import java.sql.SQLException;
import java.util.Comparator;
import java.util.Date;

import cn.topdeep.projgroup.action.BaseAction;
import cn.topdeep.projgroup.action.PageAction;
import cn.topdeep.projgroup.dao.ProjgroupDao;
import cn.topdeep.projgroup.entity.DbException;
import cn.topdeep.projgroup.entity.Task;


import cn.topdeep.projgroup.biz.*;

public class CompareTask extends BaseAction implements Comparator<Task>{
	
	private Task task;
	public int compare(Task task1, Task task2) {
		// TODO Auto-generated method stub
	 
		  //如果两个任务同级，那么判断他们是不是0级任务
		      //如果都是0级任务，那么比较他们的计划开始时间决定先后关系
		      //如果他们不是0级任务，那么要得出他们的父任务，此时
		          //如果他们的父任务相同，那么比较他们的计划开始时间决定先后关系
		          //如果他们的父任务不同，那么继续本层次的迭代，知道两个祖先任务是0任务或者相同为止，然后这两个祖先任务的比较结果就是原先两个任务的比较结果
		  //如果两个任务不同级，那么将低级别的任务设为A，高级别的任务设为B，迭代判断A的上层祖先任务和B的先后关系，能判断出结果的就返回，不能的，迭代到B和A的祖先同级为止，再按照上述描述执行。
			
		if(task1.getTaskLevel()==task2.getTaskLevel())
		{
			if(task1.getTaskLevel()==0){
				return compareTime(task1.getTaskActualStartDate(), task2.getTaskActualStartDate());
				
			}
			else if(task1.getTaskParentId()==task2.getTaskParentId()){
				return compareTime(task1.getTaskActualStartDate(), task2.getTaskActualStartDate());
			}else{
				try {
					return compare(getProjectBiz().getTask(task1.getTaskParentId()),getProjectBiz().getTask(task2.getTaskParentId()));
				} catch (DbException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				
			
		}
		else{
			if(task1.getTaskLevel()>task2.getTaskLevel()){
				
				try {
					task = getProjectBiz().getTask(task1.getTaskParentId());
				} catch (DbException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				while(task.getTaskLevel()>task2.getTaskLevel()){
					try {
						task=getProjectBiz().getTask(task1.getTaskParentId());
					} catch (DbException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				return compare(task,task2);
			}else{
				
				try {
					task = getProjectBiz().getTask(task2.getTaskParentId());
				} catch (DbException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				while(task.getTaskLevel()>task1.getTaskLevel()){
					try {
						task=getProjectBiz().getTask(task2.getTaskParentId());
					} catch (DbException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				return compare(task1,task);
			}
			
		}
	
		return 0;
	}
	
	public int compareTime(Date date1,Date date2){
		if(date1.getTime()<date2.getTime()) return -1;
		else if(date1.getTime()>date2.getTime()) return 1;
			else return 0;
		
						
	}

}
