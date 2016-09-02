package cn.topdeep.projgroup.entity.utils;

import java.util.Comparator;
import cn.topdeep.projgroup.entity.*;

public class TaskComparator implements Comparator<Task> {

	public int compare(Task task1, Task task2) {
		if(task1.getTaskId() == task2.getTaskId()){
			return 0;
		}else if(task1.getTaskLevel() < task2.getTaskLevel()){
			return -1;
		}else if(task1.getTaskLevel() > task2.getTaskLevel()){
			return 1;
		}else if(task1.getOrderField() == null || task2.getOrderField() == null){
			return 1;
		}else if(task1.getOrderField().getTime() < task2.getOrderField().getTime()){
			return -1; 
		}else{
			return 1;
		}
	}

}
