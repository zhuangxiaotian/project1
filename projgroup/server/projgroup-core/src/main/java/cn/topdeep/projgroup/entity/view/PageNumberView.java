/**
 * 
 */
package cn.topdeep.projgroup.entity.view;

/**
 * @author niexin
 *
 */
public class PageNumberView {
	private int navNumber;
	private boolean isNav;
	private boolean isCurrent;
	/**
	 * @return the navNumber
	 */
	public int getNavNumber() {
		return navNumber;
	}
	/**
	 * @param navNumber the navNumber to set
	 */
	public void setNavNumber(int navNumber) {
		this.navNumber = navNumber;
	}
	/**
	 * @return the isNav
	 */
	public boolean isNav() {
		return isNav;
	}
	/**
	 * @param isNav the isNav to set
	 */
	public void setNav(boolean isNav) {
		this.isNav = isNav;
	}
	/**
	 * @return the isCurrent
	 */
	public boolean isCurrent() {
		return isCurrent;
	}
	/**
	 * @param isCurrent the isCurrent to set
	 */
	public void setCurrent(boolean isCurrent) {
		this.isCurrent = isCurrent;
	}
}
