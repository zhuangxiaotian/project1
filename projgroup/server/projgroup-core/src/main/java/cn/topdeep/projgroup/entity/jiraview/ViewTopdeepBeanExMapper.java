package cn.topdeep.projgroup.entity.jiraview;

import java.util.List;

import cn.topdeep.projgroup.entity.jiradb.ViewTopdeepBean;
import cn.topdeep.projgroup.entity.jiradb.ViewTopdeepBeanExample;

public interface ViewTopdeepBeanExMapper {

	List<ViewTopdeepBean> selectSumByExample(ViewTopdeepBeanExample example);

}