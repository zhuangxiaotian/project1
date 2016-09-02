package cn.topdeep.projgroup.biz.jira;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cn.topdeep.projgroup.dao.jira.JiraDao;
import cn.topdeep.projgroup.entity.jiradb.BusinessLogicManage;
import cn.topdeep.projgroup.entity.jiradb.ViewTopdeepBean;
import cn.topdeep.projgroup.entity.jiradb.ViewTopdeepBeanExample;

@Service("jiraBiz")
public class JiraBiz extends cn.topdeep.projgroup.entity.jiradb.BaseBiz {

	@Autowired
	@Qualifier("jiraDao")
	private JiraDao jiraDao;

	@Override
	public BusinessLogicManage getDao() {
		return jiraDao;
	}

	@Override
	protected Boolean needCache(String tableName) {
		return false;
	}

	public List<ViewTopdeepBean> viewTopdeepBeanSelectObjectsSumByExample(ViewTopdeepBeanExample condition) {
		return jiraDao.viewTopdeepBeanSelectObjectsSumByExample(condition);
	}

	public <T> T selectSingleObject(List<T> tlist) {
		if (tlist != null && tlist.size() > 0) {
			return tlist.get(0);
		}
		return null;
	}

}
