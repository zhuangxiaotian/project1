package cn.topdeep.projgroup.biz;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import cn.topdeep.projgroup.dao.ProjgroupDao;
import cn.topdeep.projgroup.entity.data.LoginUser;
import cn.topdeep.projgroup.entity.db.BusinessLogicManage;

import common.cache2.CacheException;
import common.util.MD5;

public class BaseBiz extends cn.topdeep.projgroup.entity.db.BaseBiz {

	protected Config config;

	protected LoginUser loginUser;

	protected UrlManage urlManage;

	public LoginUser getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(LoginUser loginUser) {
		this.loginUser = loginUser;
	}

	public String getMd5Password(String password) {
		MD5 md5 = new MD5(password);
		return md5.getMd5String();
	}

	@Autowired
	@Qualifier("projgroupDao")
	private ProjgroupDao projgroupDao;

	@Override
	public BusinessLogicManage getDao() {
		return projgroupDao;
	}

	public ProjgroupDao getProjgroupDao() {
		return projgroupDao;
	}

	public void setProjgroupDao(ProjgroupDao projgroupDao) {
		this.projgroupDao = projgroupDao;
	}

	public void beginTransaction() throws SQLException {
		// getDao().getDataVisit().beginTransaction();
	}

	public void rollBackTransaction() throws SQLException {
		// getDao().getDataVisit().rollBackTransaction();
	}

	public void commitTransaction() throws SQLException {
		// getDao().getDataVisit().commitTransaction();
	}

	public UrlManage getUrlManage() {
		return urlManage;
	}

	public void setUrlManage(UrlManage urlManage) {
		this.urlManage = urlManage;
	}

	// @Override
	// protected boolean needCache(String tableName) throws SQLException,
	// DbException, CacheException {
	// return false;
	// }

	public Config getConfig() {
		return config;
	}

	public void setConfig(Config config) {
		this.config = config;
	}

	public String getIdentityCode(String tableName) throws SQLException, CacheException {
		return "";// pGetIdentity(tableName, 121, 3, "");
	}

	public <T> T selectSingleObject(List<T> tlist) {
		if (tlist != null && tlist.size() > 0) {
			return tlist.get(0);
		}
		return null;
	}

}
