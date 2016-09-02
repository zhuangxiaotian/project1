/**
 * 
 */
package cn.topdeep.projgroup.entity.response;

import cn.topdeep.projgroup.entity.view.PageView;
/**
 * @author niexin
 *
 */
public class PageResponse extends BaseResponse {
	private PageView pageData = new PageView();

	/**
	 * @return the pageData
	 */
	public PageView getPageData() {
		return pageData;
	}

}
