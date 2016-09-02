package cn.topdeep.projgroup.entity.request;

public class PageRequest extends BaseRequest{
	/** 页码 **/
	private int pageIndex;
	
	/** 跳转页面 **/
	private int jumpPageIndex;
    
	/** 一页几行 **/
    private int rowsOfPage = 10;
    private int rowsOfPageImage = 12;
    /** 页数 **/
    private int pageCount;
    
    /** 总数 **/
    private int totalCount;
    
    private String searchKeyword;
    
    public int getRowsOfPageImage() {
		return rowsOfPageImage;
	}

	public void setRowsOfPageImage(int rowsOfPageImage) {
		this.rowsOfPageImage = rowsOfPageImage;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getJumpPageIndex() {
		return jumpPageIndex;
	}

	public void setJumpPageIndex(int jumpPageIndex) {
		this.jumpPageIndex = jumpPageIndex;
	}

	public int getRowsOfPage() {
		return rowsOfPage;
	}

	public void setRowsOfPage(int rowsOfPage) {
		this.rowsOfPage = rowsOfPage;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}


}
