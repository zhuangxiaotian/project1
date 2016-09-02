package cn.topdeep.projgroup.action.work;

import cn.topdeep.projgroup.action.PageAction;
import cn.topdeep.projgroup.entity.CodeBuild;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.*;

/**
 * @author niexin
 *
 */
public class CodeBuildList extends PageAction {
        
        private int parentBuildId = 0;
        
    	public String execute() throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException{
    		if(searchTag){
    			codeBuild = projectBiz.codeBuildSelectObjects(" where BUILD_NAME like '%"+ condition +"%'",getPageIndex(), getRowsOfPage(), "BUILD_ID", "asc");
    			if(codeBuild.size() <= 0 ){
    				message = "无符合搜索条件项，请重新输入搜索条件！";
    			}
    			
    		}else {
    			codeBuild = projectBiz.codeBuildSelectObjects(" where parent_build_id = " + parentBuildId,	getPageIndex(), getRowsOfPage(), "BUILD_ID", "asc");
    		}
    		return SUCCESS;
    	}

        public String search() throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
        		setPageIndex(0);
        		searchTag = true;
        		return execute();
        }

        public String ajaxQueryCodeBuildList() throws SQLException{
                List<CodeBuild> list = null;
                try {
                   list = projectBiz.codeBuildSelectObjects(" where parent_build_id = " + parentBuildId);
                } catch (Exception e) {

                }
                HashMap<String, Object> map = new HashMap<String, Object>();
                map.put("pageIndex", getPageIndex());
                map.put("rowsCount", getRowsCount());
                map.put("pageCount", getPageCount());
                map.put("data", list);
                jsonObj = map;
                return AJAX;
        }

        
        @Override
        public int getRowsCount() {
              // TODO Auto-generated method stub
             try {
		            if(!isSearchTag()){
		                rowsCount=projectBiz.codeBuildQuerySelectObjectsCount(" where parent_build_id = " + parentBuildId);
		            }else{
		            	rowsCount=projectBiz.codeBuildQuerySelectObjectsCount(" where BUILD_NAME like '%"+ condition +"%'");
		            }
               } catch (SQLException e) {
                   // TODO Auto-generated catch block
                   e.printStackTrace();
               }
            return rowsCount;
        }
        
        public String getCondition() {
            return condition;
        }
        
        private String condition;
        
        private List<CodeBuild> codeBuild;
        
        private boolean searchTag;
        
        private int rowsCount;
        
        private String message;
        
        
        
        public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public void setCondition(String condition) {
            this.condition = condition;
        }

		public List<CodeBuild> getCodeBuild() {
			return codeBuild;
		}

        public void setCodeBuild(List<CodeBuild> codeBuild) {
            this.codeBuild = codeBuild;
        }
        
    	public boolean isSearchTag() {
    		return searchTag;
    	}

    	public void setSearchTag(boolean searchTag) {
    		this.searchTag = searchTag;
    	}
        /**
         * @return the parentBuildId
         */
        public int getParentBuildId() {
                return parentBuildId;
        }

        /**
         * @param parentBuildId the parentBuildId to set
         */
        public void setParentBuildId(String parentBuildId) {
                this.parentBuildId =Integer.parseInt(parentBuildId);
        }

}
