package cn.topdeep.projgroup.action.work;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

import cn.topdeep.projgroup.action.BaseAction;
import cn.topdeep.projgroup.action.PageAction;
import cn.topdeep.projgroup.biz.FuncProjectBiz;
import cn.topdeep.projgroup.entity.DbException;
import cn.topdeep.projgroup.entity.FuncProject;
import cn.topdeep.projgroup.entity.view.ProjectListView;

public class ProjCodeBuildEdit extends  PageAction{

		FuncProjectBiz funcProjectBiz;
		
		public FuncProjectBiz getFuncProjectBiz() {
			return funcProjectBiz;
		}

		public void setFuncProjectBiz(FuncProjectBiz funcProjectBiz) {
			this.funcProjectBiz = funcProjectBiz;
		}

		public String execute(){
			return SUCCESS;
		}
		/*
		 * list
		 */
		public String list() throws DbException, SQLException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException{
			getFuncProjectListView();
			return SUCCESS;
		}

		
		private List<FuncProject> funcProjectListView;

		public List<FuncProject> getFuncProjectListView() throws DbException, IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
			if(funcProjectListView == null) {
				funcProjectListView = funcProjectBiz.funcProjectSelectObjects(getPageIndex(), getRowsOfPage(), "FUNC_PROJECT_ID", "asc");
			}
			return funcProjectListView;
		}
		public void setProjectListView(List<FuncProject> funcProjectListView) {
			this.funcProjectListView = funcProjectListView;
		}
		
		private int rowsCount = -1;
		@Override
		public int getRowsCount() {
			if(rowsCount < 0) {
				try {
					rowsCount = funcProjectBiz.funcProjectQuerySelectObjectsCount("");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return rowsCount;
		}

	}

