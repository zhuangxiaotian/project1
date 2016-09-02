<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <title>修改密码</title>
  <script type="text/javascript">
  	function check(){
  	  	var mail = document.getElementById('mail').value;
  		var passold = document.getElementById('loginOldPassword').value;
		var passnew1 = document.getElementById('loginNewPassword1').value;
		var passnew2 = document.getElementById('loginNewPassword2').value;
		var userName = document.getElementById('issueUserName').value;
	 	var myreg = /^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
		if(mail =='' && passold == '' && passnew1 == '' && passnew2 == '' && userName == '') {
			alert('至少输入一项后提交');	
			return false;
		}
		if(passold == '') {
			if(passnew1 != '' || passnew2 != '') {
				alert('请输入原始密码');
				return false;
			}
		}else{
			if(passnew1 == '' || passnew2 == '' ){
				alert('请输入两次新密码');
				return false;
			}
			if(passnew1 != passnew2) {
				alert('两次输入的新密码不一致');
				return false;
			}
		}

		if(!myreg.test(mail)){
  	  	 	alert("请输入正确的邮箱地址")
			return false;
		}
  	 	
		return true;
  	}
  </script>
</head>
<body>
    	<s:form method="post" validate="true" onsubmit="return check()">
    	<s:hidden name="issueUserId"></s:hidden>
        <div class="mainContent">
            <div class="title">
                用户密码修改</div>
            <table width="100%" border="0" cellspacing="0" cellpadding="0" class="tableForm">
            	<tr>
                    <td width="15%">当前登录用户</td>
                    <td width="35%"><s:property value="issueLoginUser.getLoginUser().getLoginName()"></s:property></td>
                </tr>
                <tr class="odd">
                    <td width="15%">请输入当前登录密码(仅修改密码时需要填写)</td>
                    <td width="35%"><s:password id="loginOldPassword" name="loginOldPassword"></s:password></td>
                    <td class="errorMessage"><s:fielderror><s:param>loginOldPassword</s:param></s:fielderror> </td>
                </tr>
                <tr class="odd">
                    <td width="15%">请输入新密码</td>
                    <td width="35%"><s:password id="loginNewPassword1" name="loginNewPassword1"></s:password></td>
                    <td class="errorMessage"><s:fielderror><s:param>loginNewPassword1</s:param></s:fielderror> </td>
                </tr>
                <tr>
                    <td width="15%">请重复输入新密码</td>
                    <td width="35%"><s:password id="loginNewPassword2" name="loginNewPassword2"></s:password></td>
                    <td class="errorMessage"><s:fielderror><s:param>loginNewPassword1</s:param></s:fielderror> </td>
                </tr>
                <tr></tr>
                <tr class="odd">
                    <td width="15%">姓名</td>
                    <td width="35%"><s:textfield name="user.issueUserName" id="issueUserName"   cssStyle="width:138px"></s:textfield></td>
                    <td class="errorMessage"><s:fielderror><s:param>user.issueUserName</s:param></s:fielderror> </td>
                </tr>
                <tr class="odd">
                    <td width="15%">邮箱*</td>
                    <td width="35%"><s:textfield name="user.userEmail" id="mail"   cssStyle="width:138px"></s:textfield></td>
                    <td class="errorMessage"><s:fielderror><s:param>user.userEmail</s:param></s:fielderror> </td>
                </tr>
            	<tr><td>
            		<s:submit cssClass="btnStyle1" type="input" value="修改" method="save"></s:submit>
            		<s:fielderror><s:param>button</s:param></s:fielderror>
            	</td>
            	</tr>
            	</table>
        </s:form>
        
      </body>
</html>