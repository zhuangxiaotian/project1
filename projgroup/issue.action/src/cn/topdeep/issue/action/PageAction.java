

package cn.topdeep.issue.action;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import cn.topdeep.projgroup.biz.*;
import cn.topdeep.projgroup.entity.view.PageNumberView;

public abstract class PageAction extends BaseAction implements IPageManage {
	/**
	 * pageIndex 页面索引
	 */
	private int pageIndex;
	
	/**
	 * jumpPageIndex 跳至
	 */
	private int jumpPageIndex;
	
	/**
	 * getRowsCount 总行数
	 */
	public abstract int getRowsCount();
	
	public int getRowsOfPage() {
		return 10;
	}

	public void setPageIndex(int currentPageIndex) {
		pageIndex = currentPageIndex;
	}
	
	public int getPageIndex(){
		return pageIndex;
	}
	/**
	 * pageCount 总页数
	 */
	private int pageCount = Integer.MIN_VALUE;

	//order method start
	
	public String orderBySelect() throws Exception{
		return execute();
	}
	
	
	public String execute() throws Exception{
		//this.pageIndex = 0;
		super.execute();
		return SUCCESS;
	}
	
	public int getPageCount(){
		if(pageCount == Integer.MIN_VALUE){
			pageCount = (getRowsCount() + getRowsOfPage() - 1) / getRowsOfPage(); 
		}
		return pageCount;
	}
	
	/**
	 * checkPageIndex 检查页面索引是否超出范围
	 */
	private void checkPageIndex(){
		if(pageIndex < 0){
			pageIndex = 0;
		}else if(pageIndex >= getPageCount()){
			pageIndex = getPageCount() - 1;
		}
	}
	
	/**
	 * browsePrev 跳至
	 * @return
	 * @throws Exception
	 */
	public String browsePrev() throws Exception{
		if(pageIndex > 0){
			pageIndex--;
		}
		checkPageIndex();
		return execute();
	}
	
	/**
	 * browseNext 跳至下页
	 * @return
	 * @throws Exception
	 */
	public String browseNext() throws Exception{
		if(pageIndex < getPageCount() - 1){
			pageIndex++;
		}
		checkPageIndex();
		return execute();
	}
	
	/**
	 * browseFirst 跳至首页
	 * @return
	 * @throws Exception
	 */
	public String browseFirst() throws Exception{
		pageIndex = 0;
		return execute();
	}
	
	/**
	 * browseFirst 跳至尾页
	 * @return
	 * @throws Exception
	 */
	public String browseLast() throws Exception{
		pageIndex = getPageCount()-1;
		checkPageIndex();
		return execute();
	}

	public String jumpPage() throws Exception{
		pageIndex = jumpPageIndex - 1;
		checkPageIndex();
		return execute();
	}
	
	public List<PageNumberView> getPageNumberList(){
		List<PageNumberView> list = new ArrayList<PageNumberView>();
		//insert first
		if(getPageCount() > 0){
			PageNumberView numView = new PageNumberView();
			numView.setNav(true);
			numView.setNavNumber(1);
			numView.setCurrent(0 == getPageIndex());
			list.add(numView);
		}
		
		//calc middle startpage
		int startPage = getPageIndex();
		startPage -= 4;
		if(startPage > getPageCount() - 9){
			startPage = getPageCount() - 9;
		}
		if(startPage <= 1){
			startPage = 1;
		}
		if(startPage > 1){
			PageNumberView numView = new PageNumberView();
			numView.setNav(false);
			numView.setNavNumber(0);
			list.add(numView);
		}
		int k=0;
		while((startPage < getPageCount()-1) && (k++ < 9)){
			PageNumberView numView = new PageNumberView();
			numView.setNav(true);
			numView.setNavNumber(startPage+1);
			numView.setCurrent(startPage == getPageIndex());
			list.add(numView);
			startPage++;
		}
		if(startPage < getPageCount() - 1){
			PageNumberView numView = new PageNumberView();
			numView.setNav(false);
			numView.setNavNumber(0);
			list.add(numView);
		}
		//insert last
		if(getPageCount() > 1){
			PageNumberView numView = new PageNumberView();
			numView.setNav(true);
			numView.setNavNumber(getPageCount());
			numView.setCurrent(getPageCount() - 1 == getPageIndex());
			list.add(numView);
		}
		return list;
	}
	
	public int getPageNumber() {
		return pageIndex +1;
	}

	public void setPageNumber(int pageNumber) {
		this.pageIndex = pageNumber - 1;
		checkPageIndex();
	}


	/**
	 * @return the jumpPageIndex
	 */
	public int getJumpPageIndex() {
		return jumpPageIndex;
	}

	/**
	 * @param jumpPageIndex the jumpPageIndex to set
	 */
	public void setJumpPageIndex(int jumpPageIndex) {
		this.jumpPageIndex = jumpPageIndex;
	}

}
