<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/topdeep-web-tags" %>
<%
String path = request.getContextPath();
if(path.equals("/")){
	path = "";
}
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html >
<head>
  <title>请假单</title>
  		<link rel="stylesheet" type="text/css"
			href="topdeep/js/jquery/plugins/jquery.ui/themes/base/ui.all.css" />
		<script type="text/javascript"
			src="topdeep/js/jquery/plugins/jquery.ui/ui/ui.core.js"></script>
		<link rel="stylesheet" type="text/css"
			href="topdeep/js/jquery/plugins/jquery.datepick.package-3.7.2/redmond.datepick.css" />
		<script type="text/javascript"
			src="topdeep/js/jquery/plugins/jquery.datepick.package-3.7.2/jquery.datepick.pack.js"></script>
		<script type="text/javascript"
			src="topdeep/js/jquery/plugins/jquery.datepick.package-3.7.2/jquery.datepick-zh-CN.js"></script>
		<SCRIPT type="text/javascript">
			$(function(){
				$(".dateInput").datepick();
			});
		</SCRIPT>
</head>
<body>
    	<s:form method="post" validate="true">
    	<s:hidden name="taskId"></s:hidden>
        <div class="mainContent">
            <div class="title">请假单信息</div>
            <table width="100%" border="0" cellspacing="0" cellpadding="0" class="tableForm">
            	 <tr >
                    <td width="10%">请假原因</td>
                    <td>
                    	<s:select name="leave.leaveType" list="leaveTypeList"></s:select>
                    </td>
                    <td style="color:red" class="errorMessage"><s:fielderror><s:param>leave.leaveType</s:param></s:fielderror> </td>
                </tr>
                <tr>
                    <td>请假理由</td>
                    <td>
                    	<s:textfield name="leave.leaveReason"></s:textfield>
                    </td>
                    <td style="color:red"><s:fielderror><s:param>leave.leaveReason</s:param></s:fielderror></td>
                </tr>
                 <tr>
                    <td>开始时间</td>
                    <td>
                    	<s:textfield cssClass="dateInput" name="leave.leaveStartTime" value="%{getLeaveShowTime(leave.leaveStartTime)}" readonly="true"></s:textfield>
                    </td>
                    <td style="color:red"><s:fielderror><s:param>leave.leaveStartTime</s:param></s:fielderror></td>
                </tr>
                 <tr>
                    <td>结束时间</td>
                    <td>
                    	<s:textfield cssClass="dateInput" name="leave.leaveEndTime" value="%{getLeaveShowTime(leave.leaveEndTime)}" readonly="true"></s:textfield>
                    </td>
                    <td style="color:red"><s:fielderror><s:param>leave.leaveEndTime</s:param></s:fielderror></td>
                </tr>
            </table>
            <div class="controlBtn">
            		<s:submit cssClass="btnStyle1"  value="申请" method="confirm"></s:submit>
            		<s:submit cssClass="btnStyle1"  value="放弃" method="cancel"></s:submit>
            </div>
        </div>
        </s:form>
        
      </body>
</html>