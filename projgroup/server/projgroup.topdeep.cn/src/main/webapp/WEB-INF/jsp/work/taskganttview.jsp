<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <title>角色管理</title>
  <link href="js/edo/res/default/css/core.css" rel="stylesheet" type="text/css" />
  <script type="text/javascript" src="js/edo/edo.js" ></script>
  <script type="text/javascript" >
  Edo.util.Dom.on(window, 'domload', function(e){    
    Edo.create({
        id: 'project',
        type: 'ganttview',        
        width: 860,
        height: 600,
        readOnly: true,
        render: document.getElementById("gantt")
    });
    
    Edo.managers.ResizeManager.reg({
        target: project        
    });
    var json = Edo.util.Json.decode('<s:property escape="false" value="projData"/>');
    var data = new Edo.data.DataProject(json.result);
    project.set('data', data);
  /* 
    Edo.util.Ajax.request({
        url: 'project.txt',
        defer: 200,
        onSuccess: function(text){
            var json = Edo.util.Json.decode(text);
            var data = new Edo.data.DataProject(json.result);
            project.set('data', data);
        },
        onFail: function(err){
            alert("加载xml数据失败,错误码:"+err);
        }
    });
  */
    
    //创建操作甘特图数据的工具箱
    /*
    project.addChildAt(0, {
        type: 'box',
        width: '100%',
        layout: 'horizontal',                
        cls: 'e-toolbar e-toolbar-over',
        horizontalGap: 2,        
        children: [
            {
                type: 'button',
                icon: 'e-refresh',
                text: '刷新',
                onclick: function(e){
                    //使用Ajax加载项目数据
                        
                }
            },{                        
                type: 'button',
                icon: 'e-save',
                text: '保存',
                onclick: function(e){
                    //使用Ajax, 将甘特图数据,保存到服务端                    
                    var json = project.data.toJson();
                    ProjectService.set({
                        project: json
                    },function(text){
                        //更新成功,则将返回的ProjectUID设置给project.data
                        project.data.ProjectUID = parseInt(text);
                        alert("更新成功");
                    }, function(msg, code){
                        alert(msg);
                    });
                }
            },{                        
                type: 'button',                        
                icon: 'e-print',                
                text: '打印',
                onclick: function(e){
                    project.print("EdoService/", '../edo/res/default/css/core.css');
                }
            },{
                type: 'split'
            },
            {
                type: 'button',                        
                icon: 'e-upgrade',
                text: '升级',
                onclick: function(e){
                   var r = project.getSelected();
                   if(r){
                        project.data.upgrade(r);
                   }
                }
            },{
                type: 'button',
                icon: 'e-downgrade',
                text: '降级',
                onclick: function(e){
                   var r = project.getSelected();
                   if(r){
                        project.data.downgrade(r);
                   }
                }
            },
            {
                type: 'split'
            },{
                type: 'button',                        
                icon: 'e-new',
                text: '新增',
                onclick: function(e){
                    //弹出"任务面板",填写任务数据,按"确定"按钮, 新增任务数据
                    var r = project.getSelected();
                    Edo.project.Project.getTaskWindow('new', r, project.data);
                }
            },{
                type: 'button',                        
                icon: 'e-edit',
                text: '修改',
                onclick: function(e){
                    var r = project.getSelected();
                    if(r){                    
                        Edo.project.Project.getTaskWindow('edit', r, project.data);
                    }else{
                        alert("请先选择一个任务");
                    }
                }
            },
            {
                type: 'button',                        
                icon: 'e-delete',
                text: '删除',
                onclick: function (e){
                    var r = project.getSelected();
                    if(r){
                        if(confirm("确认删除 \""+r.Name+"\" 任务吗?")){            
                            project.data.Tasks.remove(r);
                        }
                    }else{
                        alert("请先选择一个任务");
                    }
                }
            },
            {
                type: 'space',
                width: '100%'
            },{
                type: 'button',                        
                icon: 'e-download',
                text: '下载甘特图',
                onclick: function(){
                    window.open('gantt.rar');
                }
            },{
                type: 'button',                        
                icon: 'e-help',
                text: '帮助',
                onclick: function(){
                    
                }
            }
        ]
    }); 
    */
});
  </script>
 </head>
<body>
 		<s:form method="post">
        <div class="mainContent">
            <div class="top">
                <a href="#">角色管理</a>  
            </div>
            <div id="gantt">
            
            </div>
        </div>
        </s:form>
 </body>
</html>