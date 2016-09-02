

package cn.topdeep.projgroup.action;
import java.sql.SQLException;

import cn.topdeep.projgroup.biz.*;

public abstract class PageAction extends BaseAction implements IPageManage {

	private ProjectBiz projectbiz;
	private int pageIndex;
	private int pageNumber;
	private int jumpPageIndex;
	private int rowsOfPage = 10;
	private String order;
	private String orderField;
	
	public void setJumpPageIndex(int jumpPageIndex) {
		this.jumpPageIndex = jumpPageIndex;
	}

	public abstract int getRowsCount();
	
	public String jumpPage() throws Exception{
		if(jumpPageIndex <= getPageCount()&& jumpPageIndex > 0){
			pageIndex=jumpPageIndex-1;
		}
		checkPageIndex();
		return execute();
	}
	
	public void setPageIndex(int currentPageIndex) {
		pageIndex = currentPageIndex;
	}
	
	public int getPageIndex(){
		return pageIndex;
	}
	
	private int pageCount = Integer.MIN_VALUE;
	
	public int getPageCount() throws SQLException{
		if(pageCount == Integer.MIN_VALUE){
			pageCount = (getRowsCount() + getRowsOfPage() - 1) / getRowsOfPage(); 
		}
		return pageCount;
	}
	
	protected void checkPageIndex() throws SQLException{
		if(pageIndex < 0){
			pageIndex = 0;
		}else if(pageIndex >= getPageCount()){
			pageIndex = getPageCount() - 1;
		}
	}
	
	public String browsePrev() throws Exception{
		if(pageIndex > 0){
			pageIndex--;
		}
		checkPageIndex();
		return execute();
	}
	
	public String browseNext() throws Exception{
		/*if(pageIndex < getPageCount() - 1){
			pageIndex++;
		}
		*/
		if(pageIndex < getPageCount() - 1){
			pageIndex++;
		}
		checkPageIndex();
		return execute();
		
	}
	
	public String browseFirst() throws Exception{
		pageIndex = 0;
		return execute();
	}
	
	public String browseLast() throws Exception{
		pageIndex = getPageCount()-1;
		checkPageIndex();
		return execute();
	}

	public int getPageNumber() {
		return pageIndex +1;
	}

	public void setPageNumber(int pageNumber) throws SQLException {
		this.pageIndex = pageNumber - 1;
		checkPageIndex();
	}

	/**
	 * @return the rowsOfPage
	 */
	public int getRowsOfPage() {
		return rowsOfPage;
	}

	/**
	 * @param rowsOfPage the rowsOfPage to set
	 */
	public void setRowsOfPage(int rowsOfPage) {
		this.rowsOfPage = rowsOfPage;
	}

	/**
	 * @return the order
	 */
	public String getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(String order) {
		this.order = order;
	}

	/**
	 * @return the orderField
	 */
	public String getOrderField() {
		return orderField;
	}

	/**
	 * @param orderField the orderField to set
	 */
	public void setOrderField(String orderField) {
		this.orderField = orderField;
	}


	


}
