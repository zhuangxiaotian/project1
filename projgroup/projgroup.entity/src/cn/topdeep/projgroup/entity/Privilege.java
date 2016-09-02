package cn.topdeep.projgroup.entity;

import common.privilege.PrivilegeAttribute;
import common.privilege.PrivilegeFlag;
import common.privilege.PrivilegeOperate;

@PrivilegeFlag
public class Privilege {
	@PrivilegeAttribute(Name = "项目管理", GroupName = "项目管理", Operate = PrivilegeOperate.ReadWriteDelete)
	public static final int FUNC_PROJECT_MANAGE = 10;
	
	@PrivilegeAttribute(Name = "任务管理", GroupName = "项目管理", Operate = PrivilegeOperate.ReadWriteDelete)
	public static final int FUNC_TASK_MANAGE = 11;
	
	@PrivilegeAttribute(Name = "工作汇报查看", GroupName = "工作管理", Operate = PrivilegeOperate.Read)
	public static final int FUNC_WORKLOG_MANAGE = 12;
	
	@PrivilegeAttribute(Name = "日志评分", GroupName = "工作管理", Operate = PrivilegeOperate.Execute)
	public static final int FUNC_SCORE_MANAGE = 13;
	
	@PrivilegeAttribute(Name = "请假审批", GroupName = "工作管理", Operate = PrivilegeOperate.Execute)
	public static final int FUNC_LEAVE_AUDIT = 14;
	
}
