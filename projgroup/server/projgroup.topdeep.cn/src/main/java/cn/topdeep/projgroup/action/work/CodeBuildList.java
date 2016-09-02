package cn.topdeep.projgroup.action.work;

import cn.topdeep.projgroup.action.PageAction;
import cn.topdeep.projgroup.entity.db.CodeBuild;
import cn.topdeep.projgroup.entity.Privilege;
import cn.topdeep.projgroup.entity.base.PageImpl;
import cn.topdeep.projgroup.entity.db.CodeBuildExample;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.*;

import common.cache2.CacheException;
import common.privilege.PrivilegeOperate;

/**
 * @author niexin
 *
 */
public class CodeBuildList extends PageAction {
        
        private int parentBuildId = 0;
        
    	public String execute() throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException, CacheException{
    		if(!hasPrivilege(Privilege.FUNC_FUNC_BUILD_MANAGE, PrivilegeOperate.Read)){
    			return NO_PRIVILEGES;
    		}
    		if(searchTag){
    			CodeBuildExample condition = new CodeBuildExample();
    			condition.or().andBuildNameLike("%"+ condition +"%");
    			condition.setPage(new PageImpl(getPageIndex(), getRowsOfPage()));
    			condition.setOrderByClause("BUILD_ID asc");
    			codeBuild = projectBiz.codeBuildSelectObjects(condition);
    			if(codeBuild.size() <= 0 ){
    				message = "无符合搜索条件项，请重新输入搜索条件！";
    			}
    			
    		}else {
    			CodeBuildExample condition = new CodeBuildExample();
    			condition.or().andParentBuildIdEqualTo(parentBuildId);
    			condition.setPage(new PageImpl(getPageIndex(), getRowsOfPage()));
    			condition.setOrderByClause("BUILD_ID asc");
    			codeBuild = projectBiz.codeBuildSelectObjects(condition);
    		}
    		return SUCCESS;
    	}

        public String search() throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException, CacheException {
    		if(!hasPrivilege(Privilege.FUNC_FUNC_BUILD_MANAGE, PrivilegeOperate.Read)){
    			return NO_PRIVILEGES;
    		}
        		setPageIndex(0);
        		searchTag = true;
        		return execute();
        }

        public String ajaxQueryCodeBuildList() throws SQLException{
    		if(!hasPrivilege(Privilege.FUNC_FUNC_BUILD_MANAGE, PrivilegeOperate.Read)){
    			return NO_PRIVILEGES;
    		}
                List<CodeBuild> list = null;
                try {
                   list = systemBiz.codeBuildSelectObjectsByParentId(parentBuildId);
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
		            	CodeBuildExample condition1 = new CodeBuildExample();
		            	condition1.or().andParentBuildIdEqualTo(parentBuildId);
		                rowsCount=projectBiz.codeBuildQuerySelectObjectsCount(condition1);
		            }else{
		            	CodeBuildExample condition1 = new CodeBuildExample();
		            	condition1.or().andBuildNameLike("%"+ condition +"%");
		            	rowsCount=projectBiz.codeBuildQuerySelectObjectsCount(condition1);
		            }
               } catch (CacheException e) {
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
