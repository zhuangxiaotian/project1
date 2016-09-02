package cn.topdeep.issue.action;

public interface IPageManage {
	void setPageIndex(int currentPageIndex);
	int getRowsCount();  //总共有多少行数据
	int getRowsOfPage(); //每页显示的数据
}
