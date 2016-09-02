/**
 * 
 */
package cn.topdeep.projgroup.entity.request;

/**
 * @author niexin
 *
 */
public class IndexRequest extends BaseRequest {
	private String queryType;

	private boolean forceRefresh = false;

	/**
	 * @return the queryType
	 */
	public String getQueryType() {
		return queryType;
	}

	/**
	 * @param queryType the queryType to set
	 */
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	/**
	 * @return the forceRefresh
	 */
	public boolean isForceRefresh() {
		return forceRefresh;
	}

	/**
	 * @param forceRefresh the forceRefresh to set
	 */
	public void setForceRefresh(boolean forceRefresh) {
		this.forceRefresh = forceRefresh;
	}
}
