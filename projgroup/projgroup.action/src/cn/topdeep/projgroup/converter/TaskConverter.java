package cn.topdeep.projgroup.converter;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import cn.topdeep.projgroup.entity.User;
import cn.topdeep.projgroup.entity.Task;

public class TaskConverter extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String convertToString(Map context, Object o) {
		if(o == null)return "";
		return ""+((Task)o).getTaskId();
	}

}
