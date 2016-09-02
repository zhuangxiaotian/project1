/**
 * 
 */
package cn.topdeep.projgroup.entity.view;

/**
 * @author niexin
 *
 */
public class PageView {
	private int pageIndex;
	private int totalCount;
	private int totalPage;
	private String prevUrl;
	private String nextUrl;

	public void setPageInfo(int pageIndex, int rowsOfPage, int totalCount) {
		this.pageIndex = pageIndex;
		this.totalCount = totalCount;
		if (rowsOfPage == 0) {
			rowsOfPage = 10;
		}
		this.totalPage = (totalCount + rowsOfPage - 1) / rowsOfPage;
	}

	/**
	 * @return the pageIndex
	 */
	public int getPageIndex() {
		return pageIndex;
	}

	/**
	 * @return the totalCount
	 */
	public int getTotalCount() {
		return totalCount;
	}

	/**
	 * @return the totalPage
	 */
	public int getTotalPage() {
		return totalPage;
	}

	public int getPageNo() {
		return pageIndex + 1;
	}

	/**
	 * @return the prevUrl
	 */
	public String getPrevUrl() {
		return prevUrl;
	}

	/**
	 * @param prevUrl the prevUrl to set
	 */
	public void setPrevUrl(String prevUrl) {
		this.prevUrl = prevUrl;
	}

	/**
	 * @return the nextUrl
	 */
	public String getNextUrl() {
		return nextUrl;
	}

	/**
	 * @param nextUrl the nextUrl to set
	 */
	public void setNextUrl(String nextUrl) {
		this.nextUrl = nextUrl;
	}
}
