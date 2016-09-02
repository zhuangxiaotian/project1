package cn.topdeep.projgroup.entity.bugtracker;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import java.sql.*;
/**
 * 基本的逻辑应用层代码，可扩展
 */
public abstract class BusinessLogicManage {
	
	/**
	 * 插入一个对象Sessions到数据库中
	 * @param Sessions 需要插入的新对象
	 */
	public void sessionsInsert(Sessions ASessions) throws SQLException, DbException {
		Sessions.insert(this.getDataVisit(), ASessions);
		String kvalue = "";
		this.OperatesLogSimpleAdd("SESSIONS", "插入", "", kvalue, ASessions);
	}
	
	/**
	 * 更新一个对象Sessions到数据库中
	 * @param Sessions 需要更新的对象
	 */
	public int sessionsUpdate(Sessions ASessions) throws SQLException, DbException {
		int ret = Sessions.update(this.getDataVisit(), ASessions);
		String kvalue = "";
		this.OperatesLogSimpleAdd("SESSIONS", "更新", "", kvalue, ASessions);
		return ret;
	}
	
	/**
	 * 更新一个对象Sessions到数据库中
	 * @param Sessions 需要更新的对象
	 */
	public int sessionsUpdate(Sessions ASessions, String appendConditionSql) throws SQLException, DbException {
		int ret = Sessions.update(this.getDataVisit(), ASessions, appendConditionSql);
		String kvalue = "";
		this.OperatesLogSimpleAdd("SESSIONS", "更新", "", kvalue, ASessions);
		return ret;
	}
	
	public abstract IDataVisit2 getDataVisit();
	
	/**
	 * 查询数据集
	 * @param AppendSql 附加的Sql语句
	 * @returns 查询结果
	 */
	public List<Sessions> SessionsselectObjects(String AppendSql) throws SQLException, DbException {
		return Sessions.selectObjects(this.getDataVisit(), AppendSql);
	}
	
	/**
	 * 查询数据集
	 * @return 查询结果
	 */
	public List<Sessions> SessionsselectObjects() throws SQLException, DbException {
		return Sessions.selectObjects(this.getDataVisit());
	}
	
	/**
	 * 查询数据集
	 * @param AppendSql 附加的Sql语句
	 * @returns 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public List<Sessions> SessionsselectObjects(String AppendSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return Sessions.selectObjects(this.getDataVisit(), AppendSql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 查询数据集
	 * @return 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public List<Sessions> SessionsselectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return Sessions.selectObjects(this.getDataVisit(), pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 插入一个对象Categories到数据库中
	 * @param Categories 需要插入的新对象
	 */
	public void categoriesInsert(Categories ACategories) throws SQLException, DbException {
		Categories.insert(this.getDataVisit(), ACategories);
		String kvalue = "";
		kvalue = ("" + ACategories.getCtId());
		this.OperatesLogSimpleAdd("CATEGORIES", "插入", "CT_ID", kvalue, ACategories);
	}
	
	/**
	 * 更新一个对象Categories到数据库中
	 * @param Categories 需要更新的对象
	 */
	public int categoriesUpdate(Categories ACategories) throws SQLException, DbException {
		int ret = Categories.update(this.getDataVisit(), ACategories);
		String kvalue = "";
		kvalue = ("" + ACategories.getCtId());
		this.OperatesLogSimpleAdd("CATEGORIES", "更新", "CT_ID", kvalue, ACategories);
		return ret;
	}
	
	/**
	 * 更新一个对象Categories到数据库中
	 * @param Categories 需要更新的对象
	 */
	public int categoriesUpdate(Categories ACategories, String appendConditionSql) throws SQLException, DbException {
		int ret = Categories.update(this.getDataVisit(), ACategories, appendConditionSql);
		String kvalue = "";
		kvalue = ("" + ACategories.getCtId());
		this.OperatesLogSimpleAdd("CATEGORIES", "更新", "CT_ID", kvalue, ACategories);
		return ret;
	}
	
	/**
	 * 从数据库中删除一个对象Categories
	 * @param Int32  
	 * @param appendSql 附加的条件语句
	 */
	public void categoriesDeleteByCtId(int ACtId, String appendSql) throws SQLException, DbException {
		String sql;
		Categories.deleteByCtId(this.getDataVisit(), ACtId, appendSql);
		String kvalue = "";
		kvalue = ("" + ACtId);
		this.OperatesLogSimpleAdd("CATEGORIES", "删除", "CT_ID", kvalue, null);
	}
	
	/**
	 * 从数据库中删除一个对象Categories
	 * @param Int32  
	 */
	public void categoriesDeleteByCtId(int ACtId) throws SQLException, DbException {
		this.categoriesDeleteByCtId(ACtId, "");
	}
	
	/**
	 * 根据对象的唯一索引从数据库中查询一个对象
	 * @param Int32 
	 */
	public Categories CategoriesSelectByCtId(int ACtId) throws SQLException, DbException {
		return Categories.SelectByCtId(this.getDataVisit(), ACtId);
	}
	
	/**
	 * 查询数据集
	 * @param AppendSql 附加的Sql语句
	 * @returns 查询结果
	 */
	public List<Categories> CategoriesselectObjects(String AppendSql) throws SQLException, DbException {
		return Categories.selectObjects(this.getDataVisit(), AppendSql);
	}
	
	/**
	 * 查询数据集
	 * @return 查询结果
	 */
	public List<Categories> CategoriesselectObjects() throws SQLException, DbException {
		return Categories.selectObjects(this.getDataVisit());
	}
	
	/**
	 * 查询数据集
	 * @param AppendSql 附加的Sql语句
	 * @returns 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public List<Categories> CategoriesselectObjects(String AppendSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return Categories.selectObjects(this.getDataVisit(), AppendSql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 查询数据集
	 * @return 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public List<Categories> CategoriesselectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return Categories.selectObjects(this.getDataVisit(), pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 插入一个对象Projects到数据库中
	 * @param Projects 需要插入的新对象
	 */
	public void projectsInsert(Projects AProjects) throws SQLException, DbException {
		Projects.insert(this.getDataVisit(), AProjects);
		String kvalue = "";
		kvalue = ("" + AProjects.getPjId());
		this.OperatesLogSimpleAdd("PROJECTS", "插入", "PJ_ID", kvalue, AProjects);
	}
	
	/**
	 * 更新一个对象Projects到数据库中
	 * @param Projects 需要更新的对象
	 */
	public int projectsUpdate(Projects AProjects) throws SQLException, DbException {
		int ret = Projects.update(this.getDataVisit(), AProjects);
		String kvalue = "";
		kvalue = ("" + AProjects.getPjId());
		this.OperatesLogSimpleAdd("PROJECTS", "更新", "PJ_ID", kvalue, AProjects);
		return ret;
	}
	
	/**
	 * 更新一个对象Projects到数据库中
	 * @param Projects 需要更新的对象
	 */
	public int projectsUpdate(Projects AProjects, String appendConditionSql) throws SQLException, DbException {
		int ret = Projects.update(this.getDataVisit(), AProjects, appendConditionSql);
		String kvalue = "";
		kvalue = ("" + AProjects.getPjId());
		this.OperatesLogSimpleAdd("PROJECTS", "更新", "PJ_ID", kvalue, AProjects);
		return ret;
	}
	
	/**
	 * 从数据库中删除一个对象Projects
	 * @param Int32  
	 * @param appendSql 附加的条件语句
	 */
	public void projectsDeleteByPjId(int APjId, String appendSql) throws SQLException, DbException {
		String sql;
		Projects.deleteByPjId(this.getDataVisit(), APjId, appendSql);
		String kvalue = "";
		kvalue = ("" + APjId);
		this.OperatesLogSimpleAdd("PROJECTS", "删除", "PJ_ID", kvalue, null);
	}
	
	/**
	 * 从数据库中删除一个对象Projects
	 * @param Int32  
	 */
	public void projectsDeleteByPjId(int APjId) throws SQLException, DbException {
		this.projectsDeleteByPjId(APjId, "");
	}
	
	/**
	 * 根据对象的唯一索引从数据库中查询一个对象
	 * @param Int32 
	 */
	public Projects ProjectsSelectByPjId(int APjId) throws SQLException, DbException {
		return Projects.SelectByPjId(this.getDataVisit(), APjId);
	}
	
	/**
	 * 查询数据集
	 * @param AppendSql 附加的Sql语句
	 * @returns 查询结果
	 */
	public List<Projects> ProjectsselectObjects(String AppendSql) throws SQLException, DbException {
		return Projects.selectObjects(this.getDataVisit(), AppendSql);
	}
	
	/**
	 * 查询数据集
	 * @return 查询结果
	 */
	public List<Projects> ProjectsselectObjects() throws SQLException, DbException {
		return Projects.selectObjects(this.getDataVisit());
	}
	
	/**
	 * 查询数据集
	 * @param AppendSql 附加的Sql语句
	 * @returns 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public List<Projects> ProjectsselectObjects(String AppendSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return Projects.selectObjects(this.getDataVisit(), AppendSql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 查询数据集
	 * @return 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public List<Projects> ProjectsselectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return Projects.selectObjects(this.getDataVisit(), pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 插入一个对象Bugs到数据库中
	 * @param Bugs 需要插入的新对象
	 */
	public void bugsInsert(Bugs ABugs) throws SQLException, DbException {
		Bugs.insert(this.getDataVisit(), ABugs);
		String kvalue = "";
		kvalue = ("" + ABugs.getBgId());
		this.OperatesLogSimpleAdd("BUGS", "插入", "BG_ID", kvalue, ABugs);
	}
	
	/**
	 * 更新一个对象Bugs到数据库中
	 * @param Bugs 需要更新的对象
	 */
	public int bugsUpdate(Bugs ABugs) throws SQLException, DbException {
		int ret = Bugs.update(this.getDataVisit(), ABugs);
		String kvalue = "";
		kvalue = ("" + ABugs.getBgId());
		this.OperatesLogSimpleAdd("BUGS", "更新", "BG_ID", kvalue, ABugs);
		return ret;
	}
	
	/**
	 * 更新一个对象Bugs到数据库中
	 * @param Bugs 需要更新的对象
	 */
	public int bugsUpdate(Bugs ABugs, String appendConditionSql) throws SQLException, DbException {
		int ret = Bugs.update(this.getDataVisit(), ABugs, appendConditionSql);
		String kvalue = "";
		kvalue = ("" + ABugs.getBgId());
		this.OperatesLogSimpleAdd("BUGS", "更新", "BG_ID", kvalue, ABugs);
		return ret;
	}
	
	/**
	 * 从数据库中删除一个对象Bugs
	 * @param Int32  
	 * @param appendSql 附加的条件语句
	 */
	public void bugsDeleteByBgId(int ABgId, String appendSql) throws SQLException, DbException {
		String sql;
		Bugs.deleteByBgId(this.getDataVisit(), ABgId, appendSql);
		String kvalue = "";
		kvalue = ("" + ABgId);
		this.OperatesLogSimpleAdd("BUGS", "删除", "BG_ID", kvalue, null);
	}
	
	/**
	 * 从数据库中删除一个对象Bugs
	 * @param Int32  
	 */
	public void bugsDeleteByBgId(int ABgId) throws SQLException, DbException {
		this.bugsDeleteByBgId(ABgId, "");
	}
	
	/**
	 * 根据对象的唯一索引从数据库中查询一个对象
	 * @param Int32 
	 */
	public Bugs BugsSelectByBgId(int ABgId) throws SQLException, DbException {
		return Bugs.SelectByBgId(this.getDataVisit(), ABgId);
	}
	
	/**
	 * 查询数据集
	 * @param AppendSql 附加的Sql语句
	 * @returns 查询结果
	 */
	public List<Bugs> BugsselectObjects(String AppendSql) throws SQLException, DbException {
		return Bugs.selectObjects(this.getDataVisit(), AppendSql);
	}
	
	/**
	 * 查询数据集
	 * @return 查询结果
	 */
	public List<Bugs> BugsselectObjects() throws SQLException, DbException {
		return Bugs.selectObjects(this.getDataVisit());
	}
	
	/**
	 * 查询数据集
	 * @param AppendSql 附加的Sql语句
	 * @returns 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public List<Bugs> BugsselectObjects(String AppendSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return Bugs.selectObjects(this.getDataVisit(), AppendSql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 查询数据集
	 * @return 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public List<Bugs> BugsselectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return Bugs.selectObjects(this.getDataVisit(), pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 插入一个对象BugPosts到数据库中
	 * @param BugPosts 需要插入的新对象
	 */
	public void bugPostsInsert(BugPosts ABugPosts) throws SQLException, DbException {
		BugPosts.insert(this.getDataVisit(), ABugPosts);
		String kvalue = "";
		kvalue = ("" + ABugPosts.getBpId());
		this.OperatesLogSimpleAdd("BUG_POSTS", "插入", "BP_ID", kvalue, ABugPosts);
	}
	
	/**
	 * 更新一个对象BugPosts到数据库中
	 * @param BugPosts 需要更新的对象
	 */
	public int bugPostsUpdate(BugPosts ABugPosts) throws SQLException, DbException {
		int ret = BugPosts.update(this.getDataVisit(), ABugPosts);
		String kvalue = "";
		kvalue = ("" + ABugPosts.getBpId());
		this.OperatesLogSimpleAdd("BUG_POSTS", "更新", "BP_ID", kvalue, ABugPosts);
		return ret;
	}
	
	/**
	 * 更新一个对象BugPosts到数据库中
	 * @param BugPosts 需要更新的对象
	 */
	public int bugPostsUpdate(BugPosts ABugPosts, String appendConditionSql) throws SQLException, DbException {
		int ret = BugPosts.update(this.getDataVisit(), ABugPosts, appendConditionSql);
		String kvalue = "";
		kvalue = ("" + ABugPosts.getBpId());
		this.OperatesLogSimpleAdd("BUG_POSTS", "更新", "BP_ID", kvalue, ABugPosts);
		return ret;
	}
	
	/**
	 * 从数据库中删除一个对象BugPosts
	 * @param Int32  
	 * @param appendSql 附加的条件语句
	 */
	public void bugPostsDeleteByBpId(int ABpId, String appendSql) throws SQLException, DbException {
		String sql;
		BugPosts.deleteByBpId(this.getDataVisit(), ABpId, appendSql);
		String kvalue = "";
		kvalue = ("" + ABpId);
		this.OperatesLogSimpleAdd("BUG_POSTS", "删除", "BP_ID", kvalue, null);
	}
	
	/**
	 * 从数据库中删除一个对象BugPosts
	 * @param Int32  
	 */
	public void bugPostsDeleteByBpId(int ABpId) throws SQLException, DbException {
		this.bugPostsDeleteByBpId(ABpId, "");
	}
	
	/**
	 * 根据对象的唯一索引从数据库中查询一个对象
	 * @param Int32 
	 */
	public BugPosts BugPostsSelectByBpId(int ABpId) throws SQLException, DbException {
		return BugPosts.SelectByBpId(this.getDataVisit(), ABpId);
	}
	
	/**
	 * 查询数据集
	 * @param AppendSql 附加的Sql语句
	 * @returns 查询结果
	 */
	public List<BugPosts> BugPostsselectObjects(String AppendSql) throws SQLException, DbException {
		return BugPosts.selectObjects(this.getDataVisit(), AppendSql);
	}
	
	/**
	 * 查询数据集
	 * @return 查询结果
	 */
	public List<BugPosts> BugPostsselectObjects() throws SQLException, DbException {
		return BugPosts.selectObjects(this.getDataVisit());
	}
	
	/**
	 * 查询数据集
	 * @param AppendSql 附加的Sql语句
	 * @returns 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public List<BugPosts> BugPostsselectObjects(String AppendSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return BugPosts.selectObjects(this.getDataVisit(), AppendSql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 查询数据集
	 * @return 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public List<BugPosts> BugPostsselectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return BugPosts.selectObjects(this.getDataVisit(), pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 插入一个对象BugSubscriptions到数据库中
	 * @param BugSubscriptions 需要插入的新对象
	 */
	public void bugSubscriptionsInsert(BugSubscriptions ABugSubscriptions) throws SQLException, DbException {
		BugSubscriptions.insert(this.getDataVisit(), ABugSubscriptions);
		String kvalue = "";
		kvalue = ("" + ABugSubscriptions.getBsId());
		this.OperatesLogSimpleAdd("BUG_SUBSCRIPTIONS", "插入", "BS_ID", kvalue, ABugSubscriptions);
	}
	
	/**
	 * 更新一个对象BugSubscriptions到数据库中
	 * @param BugSubscriptions 需要更新的对象
	 */
	public int bugSubscriptionsUpdate(BugSubscriptions ABugSubscriptions) throws SQLException, DbException {
		int ret = BugSubscriptions.update(this.getDataVisit(), ABugSubscriptions);
		String kvalue = "";
		kvalue = ("" + ABugSubscriptions.getBsId());
		this.OperatesLogSimpleAdd("BUG_SUBSCRIPTIONS", "更新", "BS_ID", kvalue, ABugSubscriptions);
		return ret;
	}
	
	/**
	 * 更新一个对象BugSubscriptions到数据库中
	 * @param BugSubscriptions 需要更新的对象
	 */
	public int bugSubscriptionsUpdate(BugSubscriptions ABugSubscriptions, String appendConditionSql) throws SQLException, DbException {
		int ret = BugSubscriptions.update(this.getDataVisit(), ABugSubscriptions, appendConditionSql);
		String kvalue = "";
		kvalue = ("" + ABugSubscriptions.getBsId());
		this.OperatesLogSimpleAdd("BUG_SUBSCRIPTIONS", "更新", "BS_ID", kvalue, ABugSubscriptions);
		return ret;
	}
	
	/**
	 * 从数据库中删除一个对象BugSubscriptions
	 * @param Int32  
	 * @param appendSql 附加的条件语句
	 */
	public void bugSubscriptionsDeleteByBsId(int ABsId, String appendSql) throws SQLException, DbException {
		String sql;
		BugSubscriptions.deleteByBsId(this.getDataVisit(), ABsId, appendSql);
		String kvalue = "";
		kvalue = ("" + ABsId);
		this.OperatesLogSimpleAdd("BUG_SUBSCRIPTIONS", "删除", "BS_ID", kvalue, null);
	}
	
	/**
	 * 从数据库中删除一个对象BugSubscriptions
	 * @param Int32  
	 */
	public void bugSubscriptionsDeleteByBsId(int ABsId) throws SQLException, DbException {
		this.bugSubscriptionsDeleteByBsId(ABsId, "");
	}
	
	/**
	 * 根据对象的唯一索引从数据库中查询一个对象
	 * @param Int32 
	 */
	public BugSubscriptions BugSubscriptionsSelectByBsId(int ABsId) throws SQLException, DbException {
		return BugSubscriptions.SelectByBsId(this.getDataVisit(), ABsId);
	}
	
	/**
	 * 查询数据集
	 * @param AppendSql 附加的Sql语句
	 * @returns 查询结果
	 */
	public List<BugSubscriptions> BugSubscriptionsselectObjects(String AppendSql) throws SQLException, DbException {
		return BugSubscriptions.selectObjects(this.getDataVisit(), AppendSql);
	}
	
	/**
	 * 查询数据集
	 * @return 查询结果
	 */
	public List<BugSubscriptions> BugSubscriptionsselectObjects() throws SQLException, DbException {
		return BugSubscriptions.selectObjects(this.getDataVisit());
	}
	
	/**
	 * 查询数据集
	 * @param AppendSql 附加的Sql语句
	 * @returns 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public List<BugSubscriptions> BugSubscriptionsselectObjects(String AppendSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return BugSubscriptions.selectObjects(this.getDataVisit(), AppendSql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 查询数据集
	 * @return 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public List<BugSubscriptions> BugSubscriptionsselectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return BugSubscriptions.selectObjects(this.getDataVisit(), pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 插入一个对象BugRelationships到数据库中
	 * @param BugRelationships 需要插入的新对象
	 */
	public void bugRelationshipsInsert(BugRelationships ABugRelationships) throws SQLException, DbException {
		BugRelationships.insert(this.getDataVisit(), ABugRelationships);
		String kvalue = "";
		kvalue = ("" + ABugRelationships.getReId());
		this.OperatesLogSimpleAdd("BUG_RELATIONSHIPS", "插入", "RE_ID", kvalue, ABugRelationships);
	}
	
	/**
	 * 更新一个对象BugRelationships到数据库中
	 * @param BugRelationships 需要更新的对象
	 */
	public int bugRelationshipsUpdate(BugRelationships ABugRelationships) throws SQLException, DbException {
		int ret = BugRelationships.update(this.getDataVisit(), ABugRelationships);
		String kvalue = "";
		kvalue = ("" + ABugRelationships.getReId());
		this.OperatesLogSimpleAdd("BUG_RELATIONSHIPS", "更新", "RE_ID", kvalue, ABugRelationships);
		return ret;
	}
	
	/**
	 * 更新一个对象BugRelationships到数据库中
	 * @param BugRelationships 需要更新的对象
	 */
	public int bugRelationshipsUpdate(BugRelationships ABugRelationships, String appendConditionSql) throws SQLException, DbException {
		int ret = BugRelationships.update(this.getDataVisit(), ABugRelationships, appendConditionSql);
		String kvalue = "";
		kvalue = ("" + ABugRelationships.getReId());
		this.OperatesLogSimpleAdd("BUG_RELATIONSHIPS", "更新", "RE_ID", kvalue, ABugRelationships);
		return ret;
	}
	
	/**
	 * 从数据库中删除一个对象BugRelationships
	 * @param Int32  
	 * @param appendSql 附加的条件语句
	 */
	public void bugRelationshipsDeleteByReId(int AReId, String appendSql) throws SQLException, DbException {
		String sql;
		BugRelationships.deleteByReId(this.getDataVisit(), AReId, appendSql);
		String kvalue = "";
		kvalue = ("" + AReId);
		this.OperatesLogSimpleAdd("BUG_RELATIONSHIPS", "删除", "RE_ID", kvalue, null);
	}
	
	/**
	 * 从数据库中删除一个对象BugRelationships
	 * @param Int32  
	 */
	public void bugRelationshipsDeleteByReId(int AReId) throws SQLException, DbException {
		this.bugRelationshipsDeleteByReId(AReId, "");
	}
	
	/**
	 * 从数据库中删除一个对象BugRelationships
	 * @param Int32  
	 * @param Int32  
	 * @param appendSql 附加的条件语句
	 */
	public void bugRelationshipsDeleteByReBug1ReBug2(int AReBug1, int AReBug2, String appendSql) throws SQLException, DbException {
		String sql;
		BugRelationships.deleteByReBug1ReBug2(this.getDataVisit(), AReBug1, AReBug2, appendSql);
		String kvalue = "";
		kvalue = ("" + AReBug1);
		kvalue = (kvalue + ",");
		kvalue = (kvalue + AReBug2);
		this.OperatesLogSimpleAdd("BUG_RELATIONSHIPS", "删除", "RE_BUG1,RE_BUG2", kvalue, null);
	}
	
	/**
	 * 从数据库中删除一个对象BugRelationships
	 * @param Int32  
	 * @param Int32  
	 */
	public void bugRelationshipsDeleteByReBug1ReBug2(int AReBug1, int AReBug2) throws SQLException, DbException {
		this.bugRelationshipsDeleteByReBug1ReBug2(AReBug1, AReBug2, "");
	}
	
	/**
	 * 从数据库中删除一个对象BugRelationships
	 * @param Int32  
	 * @param Int32  
	 * @param appendSql 附加的条件语句
	 */
	public void bugRelationshipsDeleteByReBug2ReBug1(int AReBug2, int AReBug1, String appendSql) throws SQLException, DbException {
		String sql;
		BugRelationships.deleteByReBug2ReBug1(this.getDataVisit(), AReBug2, AReBug1, appendSql);
		String kvalue = "";
		kvalue = ("" + AReBug2);
		kvalue = (kvalue + ",");
		kvalue = (kvalue + AReBug1);
		this.OperatesLogSimpleAdd("BUG_RELATIONSHIPS", "删除", "RE_BUG2,RE_BUG1", kvalue, null);
	}
	
	/**
	 * 从数据库中删除一个对象BugRelationships
	 * @param Int32  
	 * @param Int32  
	 */
	public void bugRelationshipsDeleteByReBug2ReBug1(int AReBug2, int AReBug1) throws SQLException, DbException {
		this.bugRelationshipsDeleteByReBug2ReBug1(AReBug2, AReBug1, "");
	}
	
	/**
	 * 根据对象的唯一索引从数据库中查询一个对象
	 * @param Int32 
	 */
	public BugRelationships BugRelationshipsSelectByReId(int AReId) throws SQLException, DbException {
		return BugRelationships.SelectByReId(this.getDataVisit(), AReId);
	}
	
	/**
	 * 根据对象的唯一索引从数据库中查询一个对象
	 * @param Int32 
	 * @param Int32 
	 */
	public BugRelationships BugRelationshipsSelectByReBug1ReBug2(int AReBug1, int AReBug2) throws SQLException, DbException {
		return BugRelationships.SelectByReBug1ReBug2(this.getDataVisit(), AReBug1, AReBug2);
	}
	
	/**
	 * 根据对象的唯一索引从数据库中查询一个对象
	 * @param Int32 
	 * @param Int32 
	 */
	public BugRelationships BugRelationshipsSelectByReBug2ReBug1(int AReBug2, int AReBug1) throws SQLException, DbException {
		return BugRelationships.SelectByReBug2ReBug1(this.getDataVisit(), AReBug2, AReBug1);
	}
	
	/**
	 * 查询数据集
	 * @param AppendSql 附加的Sql语句
	 * @returns 查询结果
	 */
	public List<BugRelationships> BugRelationshipsselectObjects(String AppendSql) throws SQLException, DbException {
		return BugRelationships.selectObjects(this.getDataVisit(), AppendSql);
	}
	
	/**
	 * 查询数据集
	 * @return 查询结果
	 */
	public List<BugRelationships> BugRelationshipsselectObjects() throws SQLException, DbException {
		return BugRelationships.selectObjects(this.getDataVisit());
	}
	
	/**
	 * 查询数据集
	 * @param AppendSql 附加的Sql语句
	 * @returns 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public List<BugRelationships> BugRelationshipsselectObjects(String AppendSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return BugRelationships.selectObjects(this.getDataVisit(), AppendSql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 查询数据集
	 * @return 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public List<BugRelationships> BugRelationshipsselectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return BugRelationships.selectObjects(this.getDataVisit(), pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 插入一个对象ProjectUserXref到数据库中
	 * @param ProjectUserXref 需要插入的新对象
	 */
	public void projectUserXrefInsert(ProjectUserXref AProjectUserXref) throws SQLException, DbException {
		ProjectUserXref.insert(this.getDataVisit(), AProjectUserXref);
		String kvalue = "";
		kvalue = ("" + AProjectUserXref.getPuId());
		this.OperatesLogSimpleAdd("PROJECT_USER_XREF", "插入", "PU_ID", kvalue, AProjectUserXref);
	}
	
	/**
	 * 更新一个对象ProjectUserXref到数据库中
	 * @param ProjectUserXref 需要更新的对象
	 */
	public int projectUserXrefUpdate(ProjectUserXref AProjectUserXref) throws SQLException, DbException {
		int ret = ProjectUserXref.update(this.getDataVisit(), AProjectUserXref);
		String kvalue = "";
		kvalue = ("" + AProjectUserXref.getPuId());
		this.OperatesLogSimpleAdd("PROJECT_USER_XREF", "更新", "PU_ID", kvalue, AProjectUserXref);
		return ret;
	}
	
	/**
	 * 更新一个对象ProjectUserXref到数据库中
	 * @param ProjectUserXref 需要更新的对象
	 */
	public int projectUserXrefUpdate(ProjectUserXref AProjectUserXref, String appendConditionSql) throws SQLException, DbException {
		int ret = ProjectUserXref.update(this.getDataVisit(), AProjectUserXref, appendConditionSql);
		String kvalue = "";
		kvalue = ("" + AProjectUserXref.getPuId());
		this.OperatesLogSimpleAdd("PROJECT_USER_XREF", "更新", "PU_ID", kvalue, AProjectUserXref);
		return ret;
	}
	
	/**
	 * 从数据库中删除一个对象ProjectUserXref
	 * @param Int32  
	 * @param appendSql 附加的条件语句
	 */
	public void projectUserXrefDeleteByPuId(int APuId, String appendSql) throws SQLException, DbException {
		String sql;
		ProjectUserXref.deleteByPuId(this.getDataVisit(), APuId, appendSql);
		String kvalue = "";
		kvalue = ("" + APuId);
		this.OperatesLogSimpleAdd("PROJECT_USER_XREF", "删除", "PU_ID", kvalue, null);
	}
	
	/**
	 * 从数据库中删除一个对象ProjectUserXref
	 * @param Int32  
	 */
	public void projectUserXrefDeleteByPuId(int APuId) throws SQLException, DbException {
		this.projectUserXrefDeleteByPuId(APuId, "");
	}
	
	/**
	 * 从数据库中删除一个对象ProjectUserXref
	 * @param Int32  
	 * @param Int32  
	 * @param appendSql 附加的条件语句
	 */
	public void projectUserXrefDeleteByPuProjectPuUser(int APuProject, int APuUser, String appendSql) throws SQLException, DbException {
		String sql;
		ProjectUserXref.deleteByPuProjectPuUser(this.getDataVisit(), APuProject, APuUser, appendSql);
		String kvalue = "";
		kvalue = ("" + APuProject);
		kvalue = (kvalue + ",");
		kvalue = (kvalue + APuUser);
		this.OperatesLogSimpleAdd("PROJECT_USER_XREF", "删除", "PU_PROJECT,PU_USER", kvalue, null);
	}
	
	/**
	 * 从数据库中删除一个对象ProjectUserXref
	 * @param Int32  
	 * @param Int32  
	 */
	public void projectUserXrefDeleteByPuProjectPuUser(int APuProject, int APuUser) throws SQLException, DbException {
		this.projectUserXrefDeleteByPuProjectPuUser(APuProject, APuUser, "");
	}
	
	/**
	 * 从数据库中删除一个对象ProjectUserXref
	 * @param Int32  
	 * @param Int32  
	 * @param appendSql 附加的条件语句
	 */
	public void projectUserXrefDeleteByPuUserPuProject(int APuUser, int APuProject, String appendSql) throws SQLException, DbException {
		String sql;
		ProjectUserXref.deleteByPuUserPuProject(this.getDataVisit(), APuUser, APuProject, appendSql);
		String kvalue = "";
		kvalue = ("" + APuUser);
		kvalue = (kvalue + ",");
		kvalue = (kvalue + APuProject);
		this.OperatesLogSimpleAdd("PROJECT_USER_XREF", "删除", "PU_USER,PU_PROJECT", kvalue, null);
	}
	
	/**
	 * 从数据库中删除一个对象ProjectUserXref
	 * @param Int32  
	 * @param Int32  
	 */
	public void projectUserXrefDeleteByPuUserPuProject(int APuUser, int APuProject) throws SQLException, DbException {
		this.projectUserXrefDeleteByPuUserPuProject(APuUser, APuProject, "");
	}
	
	/**
	 * 根据对象的唯一索引从数据库中查询一个对象
	 * @param Int32 
	 */
	public ProjectUserXref ProjectUserXrefSelectByPuId(int APuId) throws SQLException, DbException {
		return ProjectUserXref.SelectByPuId(this.getDataVisit(), APuId);
	}
	
	/**
	 * 根据对象的唯一索引从数据库中查询一个对象
	 * @param Int32 
	 * @param Int32 
	 */
	public ProjectUserXref ProjectUserXrefSelectByPuProjectPuUser(int APuProject, int APuUser) throws SQLException, DbException {
		return ProjectUserXref.SelectByPuProjectPuUser(this.getDataVisit(), APuProject, APuUser);
	}
	
	/**
	 * 根据对象的唯一索引从数据库中查询一个对象
	 * @param Int32 
	 * @param Int32 
	 */
	public ProjectUserXref ProjectUserXrefSelectByPuUserPuProject(int APuUser, int APuProject) throws SQLException, DbException {
		return ProjectUserXref.SelectByPuUserPuProject(this.getDataVisit(), APuUser, APuProject);
	}
	
	/**
	 * 查询数据集
	 * @param AppendSql 附加的Sql语句
	 * @returns 查询结果
	 */
	public List<ProjectUserXref> ProjectUserXrefselectObjects(String AppendSql) throws SQLException, DbException {
		return ProjectUserXref.selectObjects(this.getDataVisit(), AppendSql);
	}
	
	/**
	 * 查询数据集
	 * @return 查询结果
	 */
	public List<ProjectUserXref> ProjectUserXrefselectObjects() throws SQLException, DbException {
		return ProjectUserXref.selectObjects(this.getDataVisit());
	}
	
	/**
	 * 查询数据集
	 * @param AppendSql 附加的Sql语句
	 * @returns 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public List<ProjectUserXref> ProjectUserXrefselectObjects(String AppendSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return ProjectUserXref.selectObjects(this.getDataVisit(), AppendSql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 查询数据集
	 * @return 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public List<ProjectUserXref> ProjectUserXrefselectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return ProjectUserXref.selectObjects(this.getDataVisit(), pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 插入一个对象UserDefinedAttribute到数据库中
	 * @param UserDefinedAttribute 需要插入的新对象
	 */
	public void userDefinedAttributeInsert(UserDefinedAttribute AUserDefinedAttribute) throws SQLException, DbException {
		UserDefinedAttribute.insert(this.getDataVisit(), AUserDefinedAttribute);
		String kvalue = "";
		kvalue = ("" + AUserDefinedAttribute.getUdfId());
		this.OperatesLogSimpleAdd("USER_DEFINED_ATTRIBUTE", "插入", "UDF_ID", kvalue, AUserDefinedAttribute);
	}
	
	/**
	 * 更新一个对象UserDefinedAttribute到数据库中
	 * @param UserDefinedAttribute 需要更新的对象
	 */
	public int userDefinedAttributeUpdate(UserDefinedAttribute AUserDefinedAttribute) throws SQLException, DbException {
		int ret = UserDefinedAttribute.update(this.getDataVisit(), AUserDefinedAttribute);
		String kvalue = "";
		kvalue = ("" + AUserDefinedAttribute.getUdfId());
		this.OperatesLogSimpleAdd("USER_DEFINED_ATTRIBUTE", "更新", "UDF_ID", kvalue, AUserDefinedAttribute);
		return ret;
	}
	
	/**
	 * 更新一个对象UserDefinedAttribute到数据库中
	 * @param UserDefinedAttribute 需要更新的对象
	 */
	public int userDefinedAttributeUpdate(UserDefinedAttribute AUserDefinedAttribute, String appendConditionSql) throws SQLException, DbException {
		int ret = UserDefinedAttribute.update(this.getDataVisit(), AUserDefinedAttribute, appendConditionSql);
		String kvalue = "";
		kvalue = ("" + AUserDefinedAttribute.getUdfId());
		this.OperatesLogSimpleAdd("USER_DEFINED_ATTRIBUTE", "更新", "UDF_ID", kvalue, AUserDefinedAttribute);
		return ret;
	}
	
	/**
	 * 从数据库中删除一个对象UserDefinedAttribute
	 * @param Int32  
	 * @param appendSql 附加的条件语句
	 */
	public void userDefinedAttributeDeleteByUdfId(int AUdfId, String appendSql) throws SQLException, DbException {
		String sql;
		UserDefinedAttribute.deleteByUdfId(this.getDataVisit(), AUdfId, appendSql);
		String kvalue = "";
		kvalue = ("" + AUdfId);
		this.OperatesLogSimpleAdd("USER_DEFINED_ATTRIBUTE", "删除", "UDF_ID", kvalue, null);
	}
	
	/**
	 * 从数据库中删除一个对象UserDefinedAttribute
	 * @param Int32  
	 */
	public void userDefinedAttributeDeleteByUdfId(int AUdfId) throws SQLException, DbException {
		this.userDefinedAttributeDeleteByUdfId(AUdfId, "");
	}
	
	/**
	 * 根据对象的唯一索引从数据库中查询一个对象
	 * @param Int32 
	 */
	public UserDefinedAttribute UserDefinedAttributeSelectByUdfId(int AUdfId) throws SQLException, DbException {
		return UserDefinedAttribute.SelectByUdfId(this.getDataVisit(), AUdfId);
	}
	
	/**
	 * 查询数据集
	 * @param AppendSql 附加的Sql语句
	 * @returns 查询结果
	 */
	public List<UserDefinedAttribute> UserDefinedAttributeselectObjects(String AppendSql) throws SQLException, DbException {
		return UserDefinedAttribute.selectObjects(this.getDataVisit(), AppendSql);
	}
	
	/**
	 * 查询数据集
	 * @return 查询结果
	 */
	public List<UserDefinedAttribute> UserDefinedAttributeselectObjects() throws SQLException, DbException {
		return UserDefinedAttribute.selectObjects(this.getDataVisit());
	}
	
	/**
	 * 查询数据集
	 * @param AppendSql 附加的Sql语句
	 * @returns 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public List<UserDefinedAttribute> UserDefinedAttributeselectObjects(String AppendSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return UserDefinedAttribute.selectObjects(this.getDataVisit(), AppendSql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 查询数据集
	 * @return 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public List<UserDefinedAttribute> UserDefinedAttributeselectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return UserDefinedAttribute.selectObjects(this.getDataVisit(), pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 插入一个对象Statuses到数据库中
	 * @param Statuses 需要插入的新对象
	 */
	public void statusesInsert(Statuses AStatuses) throws SQLException, DbException {
		Statuses.insert(this.getDataVisit(), AStatuses);
		String kvalue = "";
		kvalue = ("" + AStatuses.getStId());
		this.OperatesLogSimpleAdd("STATUSES", "插入", "ST_ID", kvalue, AStatuses);
	}
	
	/**
	 * 更新一个对象Statuses到数据库中
	 * @param Statuses 需要更新的对象
	 */
	public int statusesUpdate(Statuses AStatuses) throws SQLException, DbException {
		int ret = Statuses.update(this.getDataVisit(), AStatuses);
		String kvalue = "";
		kvalue = ("" + AStatuses.getStId());
		this.OperatesLogSimpleAdd("STATUSES", "更新", "ST_ID", kvalue, AStatuses);
		return ret;
	}
	
	/**
	 * 更新一个对象Statuses到数据库中
	 * @param Statuses 需要更新的对象
	 */
	public int statusesUpdate(Statuses AStatuses, String appendConditionSql) throws SQLException, DbException {
		int ret = Statuses.update(this.getDataVisit(), AStatuses, appendConditionSql);
		String kvalue = "";
		kvalue = ("" + AStatuses.getStId());
		this.OperatesLogSimpleAdd("STATUSES", "更新", "ST_ID", kvalue, AStatuses);
		return ret;
	}
	
	/**
	 * 从数据库中删除一个对象Statuses
	 * @param Int32  
	 * @param appendSql 附加的条件语句
	 */
	public void statusesDeleteByStId(int AStId, String appendSql) throws SQLException, DbException {
		String sql;
		Statuses.deleteByStId(this.getDataVisit(), AStId, appendSql);
		String kvalue = "";
		kvalue = ("" + AStId);
		this.OperatesLogSimpleAdd("STATUSES", "删除", "ST_ID", kvalue, null);
	}
	
	/**
	 * 从数据库中删除一个对象Statuses
	 * @param Int32  
	 */
	public void statusesDeleteByStId(int AStId) throws SQLException, DbException {
		this.statusesDeleteByStId(AStId, "");
	}
	
	/**
	 * 根据对象的唯一索引从数据库中查询一个对象
	 * @param Int32 
	 */
	public Statuses StatusesSelectByStId(int AStId) throws SQLException, DbException {
		return Statuses.SelectByStId(this.getDataVisit(), AStId);
	}
	
	/**
	 * 查询数据集
	 * @param AppendSql 附加的Sql语句
	 * @returns 查询结果
	 */
	public List<Statuses> StatusesselectObjects(String AppendSql) throws SQLException, DbException {
		return Statuses.selectObjects(this.getDataVisit(), AppendSql);
	}
	
	/**
	 * 查询数据集
	 * @return 查询结果
	 */
	public List<Statuses> StatusesselectObjects() throws SQLException, DbException {
		return Statuses.selectObjects(this.getDataVisit());
	}
	
	/**
	 * 查询数据集
	 * @param AppendSql 附加的Sql语句
	 * @returns 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public List<Statuses> StatusesselectObjects(String AppendSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return Statuses.selectObjects(this.getDataVisit(), AppendSql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 查询数据集
	 * @return 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public List<Statuses> StatusesselectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return Statuses.selectObjects(this.getDataVisit(), pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 插入一个对象Priorities到数据库中
	 * @param Priorities 需要插入的新对象
	 */
	public void prioritiesInsert(Priorities APriorities) throws SQLException, DbException {
		Priorities.insert(this.getDataVisit(), APriorities);
		String kvalue = "";
		kvalue = ("" + APriorities.getPrId());
		this.OperatesLogSimpleAdd("PRIORITIES", "插入", "PR_ID", kvalue, APriorities);
	}
	
	/**
	 * 更新一个对象Priorities到数据库中
	 * @param Priorities 需要更新的对象
	 */
	public int prioritiesUpdate(Priorities APriorities) throws SQLException, DbException {
		int ret = Priorities.update(this.getDataVisit(), APriorities);
		String kvalue = "";
		kvalue = ("" + APriorities.getPrId());
		this.OperatesLogSimpleAdd("PRIORITIES", "更新", "PR_ID", kvalue, APriorities);
		return ret;
	}
	
	/**
	 * 更新一个对象Priorities到数据库中
	 * @param Priorities 需要更新的对象
	 */
	public int prioritiesUpdate(Priorities APriorities, String appendConditionSql) throws SQLException, DbException {
		int ret = Priorities.update(this.getDataVisit(), APriorities, appendConditionSql);
		String kvalue = "";
		kvalue = ("" + APriorities.getPrId());
		this.OperatesLogSimpleAdd("PRIORITIES", "更新", "PR_ID", kvalue, APriorities);
		return ret;
	}
	
	/**
	 * 从数据库中删除一个对象Priorities
	 * @param Int32  
	 * @param appendSql 附加的条件语句
	 */
	public void prioritiesDeleteByPrId(int APrId, String appendSql) throws SQLException, DbException {
		String sql;
		Priorities.deleteByPrId(this.getDataVisit(), APrId, appendSql);
		String kvalue = "";
		kvalue = ("" + APrId);
		this.OperatesLogSimpleAdd("PRIORITIES", "删除", "PR_ID", kvalue, null);
	}
	
	/**
	 * 从数据库中删除一个对象Priorities
	 * @param Int32  
	 */
	public void prioritiesDeleteByPrId(int APrId) throws SQLException, DbException {
		this.prioritiesDeleteByPrId(APrId, "");
	}
	
	/**
	 * 根据对象的唯一索引从数据库中查询一个对象
	 * @param Int32 
	 */
	public Priorities PrioritiesSelectByPrId(int APrId) throws SQLException, DbException {
		return Priorities.SelectByPrId(this.getDataVisit(), APrId);
	}
	
	/**
	 * 查询数据集
	 * @param AppendSql 附加的Sql语句
	 * @returns 查询结果
	 */
	public List<Priorities> PrioritiesselectObjects(String AppendSql) throws SQLException, DbException {
		return Priorities.selectObjects(this.getDataVisit(), AppendSql);
	}
	
	/**
	 * 查询数据集
	 * @return 查询结果
	 */
	public List<Priorities> PrioritiesselectObjects() throws SQLException, DbException {
		return Priorities.selectObjects(this.getDataVisit());
	}
	
	/**
	 * 查询数据集
	 * @param AppendSql 附加的Sql语句
	 * @returns 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public List<Priorities> PrioritiesselectObjects(String AppendSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return Priorities.selectObjects(this.getDataVisit(), AppendSql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 查询数据集
	 * @return 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public List<Priorities> PrioritiesselectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return Priorities.selectObjects(this.getDataVisit(), pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 插入一个对象CustomColMetadata到数据库中
	 * @param CustomColMetadata 需要插入的新对象
	 */
	public void customColMetadataInsert(CustomColMetadata ACustomColMetadata) throws SQLException, DbException {
		CustomColMetadata.insert(this.getDataVisit(), ACustomColMetadata);
		String kvalue = "";
		this.OperatesLogSimpleAdd("CUSTOM_COL_METADATA", "插入", "", kvalue, ACustomColMetadata);
	}
	
	/**
	 * 更新一个对象CustomColMetadata到数据库中
	 * @param CustomColMetadata 需要更新的对象
	 */
	public int customColMetadataUpdate(CustomColMetadata ACustomColMetadata) throws SQLException, DbException {
		int ret = CustomColMetadata.update(this.getDataVisit(), ACustomColMetadata);
		String kvalue = "";
		this.OperatesLogSimpleAdd("CUSTOM_COL_METADATA", "更新", "", kvalue, ACustomColMetadata);
		return ret;
	}
	
	/**
	 * 更新一个对象CustomColMetadata到数据库中
	 * @param CustomColMetadata 需要更新的对象
	 */
	public int customColMetadataUpdate(CustomColMetadata ACustomColMetadata, String appendConditionSql) throws SQLException, DbException {
		int ret = CustomColMetadata.update(this.getDataVisit(), ACustomColMetadata, appendConditionSql);
		String kvalue = "";
		this.OperatesLogSimpleAdd("CUSTOM_COL_METADATA", "更新", "", kvalue, ACustomColMetadata);
		return ret;
	}
	
	/**
	 * 从数据库中删除一个对象CustomColMetadata
	 * @param Int32  
	 * @param appendSql 附加的条件语句
	 */
	public void customColMetadataDeleteByCcmColorder(int ACcmColorder, String appendSql) throws SQLException, DbException {
		String sql;
		CustomColMetadata.deleteByCcmColorder(this.getDataVisit(), ACcmColorder, appendSql);
		String kvalue = "";
		kvalue = ("" + ACcmColorder);
		this.OperatesLogSimpleAdd("CUSTOM_COL_METADATA", "删除", "CCM_COLORDER", kvalue, null);
	}
	
	/**
	 * 从数据库中删除一个对象CustomColMetadata
	 * @param Int32  
	 */
	public void customColMetadataDeleteByCcmColorder(int ACcmColorder) throws SQLException, DbException {
		this.customColMetadataDeleteByCcmColorder(ACcmColorder, "");
	}
	
	/**
	 * 根据对象的唯一索引从数据库中查询一个对象
	 * @param Int32 
	 */
	public CustomColMetadata CustomColMetadataSelectByCcmColorder(int ACcmColorder) throws SQLException, DbException {
		return CustomColMetadata.SelectByCcmColorder(this.getDataVisit(), ACcmColorder);
	}
	
	/**
	 * 查询数据集
	 * @param AppendSql 附加的Sql语句
	 * @returns 查询结果
	 */
	public List<CustomColMetadata> CustomColMetadataselectObjects(String AppendSql) throws SQLException, DbException {
		return CustomColMetadata.selectObjects(this.getDataVisit(), AppendSql);
	}
	
	/**
	 * 查询数据集
	 * @return 查询结果
	 */
	public List<CustomColMetadata> CustomColMetadataselectObjects() throws SQLException, DbException {
		return CustomColMetadata.selectObjects(this.getDataVisit());
	}
	
	/**
	 * 查询数据集
	 * @param AppendSql 附加的Sql语句
	 * @returns 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public List<CustomColMetadata> CustomColMetadataselectObjects(String AppendSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return CustomColMetadata.selectObjects(this.getDataVisit(), AppendSql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 查询数据集
	 * @return 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public List<CustomColMetadata> CustomColMetadataselectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return CustomColMetadata.selectObjects(this.getDataVisit(), pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 插入一个对象Reports到数据库中
	 * @param Reports 需要插入的新对象
	 */
	public void reportsInsert(Reports AReports) throws SQLException, DbException {
		Reports.insert(this.getDataVisit(), AReports);
		String kvalue = "";
		kvalue = ("" + AReports.getRpId());
		this.OperatesLogSimpleAdd("REPORTS", "插入", "RP_ID", kvalue, AReports);
	}
	
	/**
	 * 更新一个对象Reports到数据库中
	 * @param Reports 需要更新的对象
	 */
	public int reportsUpdate(Reports AReports) throws SQLException, DbException {
		int ret = Reports.update(this.getDataVisit(), AReports);
		String kvalue = "";
		kvalue = ("" + AReports.getRpId());
		this.OperatesLogSimpleAdd("REPORTS", "更新", "RP_ID", kvalue, AReports);
		return ret;
	}
	
	/**
	 * 更新一个对象Reports到数据库中
	 * @param Reports 需要更新的对象
	 */
	public int reportsUpdate(Reports AReports, String appendConditionSql) throws SQLException, DbException {
		int ret = Reports.update(this.getDataVisit(), AReports, appendConditionSql);
		String kvalue = "";
		kvalue = ("" + AReports.getRpId());
		this.OperatesLogSimpleAdd("REPORTS", "更新", "RP_ID", kvalue, AReports);
		return ret;
	}
	
	/**
	 * 从数据库中删除一个对象Reports
	 * @param Int32  
	 * @param appendSql 附加的条件语句
	 */
	public void reportsDeleteByRpId(int ARpId, String appendSql) throws SQLException, DbException {
		String sql;
		Reports.deleteByRpId(this.getDataVisit(), ARpId, appendSql);
		String kvalue = "";
		kvalue = ("" + ARpId);
		this.OperatesLogSimpleAdd("REPORTS", "删除", "RP_ID", kvalue, null);
	}
	
	/**
	 * 从数据库中删除一个对象Reports
	 * @param Int32  
	 */
	public void reportsDeleteByRpId(int ARpId) throws SQLException, DbException {
		this.reportsDeleteByRpId(ARpId, "");
	}
	
	/**
	 * 根据对象的唯一索引从数据库中查询一个对象
	 * @param Int32 
	 */
	public Reports ReportsSelectByRpId(int ARpId) throws SQLException, DbException {
		return Reports.SelectByRpId(this.getDataVisit(), ARpId);
	}
	
	/**
	 * 查询数据集
	 * @param AppendSql 附加的Sql语句
	 * @returns 查询结果
	 */
	public List<Reports> ReportsselectObjects(String AppendSql) throws SQLException, DbException {
		return Reports.selectObjects(this.getDataVisit(), AppendSql);
	}
	
	/**
	 * 查询数据集
	 * @return 查询结果
	 */
	public List<Reports> ReportsselectObjects() throws SQLException, DbException {
		return Reports.selectObjects(this.getDataVisit());
	}
	
	/**
	 * 查询数据集
	 * @param AppendSql 附加的Sql语句
	 * @returns 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public List<Reports> ReportsselectObjects(String AppendSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return Reports.selectObjects(this.getDataVisit(), AppendSql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 查询数据集
	 * @return 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public List<Reports> ReportsselectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return Reports.selectObjects(this.getDataVisit(), pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 插入一个对象Queries到数据库中
	 * @param Queries 需要插入的新对象
	 */
	public void queriesInsert(Queries AQueries) throws SQLException, DbException {
		Queries.insert(this.getDataVisit(), AQueries);
		String kvalue = "";
		kvalue = ("" + AQueries.getQuId());
		this.OperatesLogSimpleAdd("QUERIES", "插入", "QU_ID", kvalue, AQueries);
	}
	
	/**
	 * 更新一个对象Queries到数据库中
	 * @param Queries 需要更新的对象
	 */
	public int queriesUpdate(Queries AQueries) throws SQLException, DbException {
		int ret = Queries.update(this.getDataVisit(), AQueries);
		String kvalue = "";
		kvalue = ("" + AQueries.getQuId());
		this.OperatesLogSimpleAdd("QUERIES", "更新", "QU_ID", kvalue, AQueries);
		return ret;
	}
	
	/**
	 * 更新一个对象Queries到数据库中
	 * @param Queries 需要更新的对象
	 */
	public int queriesUpdate(Queries AQueries, String appendConditionSql) throws SQLException, DbException {
		int ret = Queries.update(this.getDataVisit(), AQueries, appendConditionSql);
		String kvalue = "";
		kvalue = ("" + AQueries.getQuId());
		this.OperatesLogSimpleAdd("QUERIES", "更新", "QU_ID", kvalue, AQueries);
		return ret;
	}
	
	/**
	 * 从数据库中删除一个对象Queries
	 * @param Int32  
	 * @param appendSql 附加的条件语句
	 */
	public void queriesDeleteByQuId(int AQuId, String appendSql) throws SQLException, DbException {
		String sql;
		Queries.deleteByQuId(this.getDataVisit(), AQuId, appendSql);
		String kvalue = "";
		kvalue = ("" + AQuId);
		this.OperatesLogSimpleAdd("QUERIES", "删除", "QU_ID", kvalue, null);
	}
	
	/**
	 * 从数据库中删除一个对象Queries
	 * @param Int32  
	 */
	public void queriesDeleteByQuId(int AQuId) throws SQLException, DbException {
		this.queriesDeleteByQuId(AQuId, "");
	}
	
	/**
	 * 根据对象的唯一索引从数据库中查询一个对象
	 * @param Int32 
	 */
	public Queries QueriesSelectByQuId(int AQuId) throws SQLException, DbException {
		return Queries.SelectByQuId(this.getDataVisit(), AQuId);
	}
	
	/**
	 * 查询数据集
	 * @param AppendSql 附加的Sql语句
	 * @returns 查询结果
	 */
	public List<Queries> QueriesselectObjects(String AppendSql) throws SQLException, DbException {
		return Queries.selectObjects(this.getDataVisit(), AppendSql);
	}
	
	/**
	 * 查询数据集
	 * @return 查询结果
	 */
	public List<Queries> QueriesselectObjects() throws SQLException, DbException {
		return Queries.selectObjects(this.getDataVisit());
	}
	
	/**
	 * 查询数据集
	 * @param AppendSql 附加的Sql语句
	 * @returns 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public List<Queries> QueriesselectObjects(String AppendSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return Queries.selectObjects(this.getDataVisit(), AppendSql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 查询数据集
	 * @return 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public List<Queries> QueriesselectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return Queries.selectObjects(this.getDataVisit(), pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 插入一个对象Users到数据库中
	 * @param Users 需要插入的新对象
	 */
	public void usersInsert(Users AUsers) throws SQLException, DbException {
		Users.insert(this.getDataVisit(), AUsers);
		String kvalue = "";
		kvalue = ("" + AUsers.getUsId());
		this.OperatesLogSimpleAdd("USERS", "插入", "US_ID", kvalue, AUsers);
	}
	
	/**
	 * 更新一个对象Users到数据库中
	 * @param Users 需要更新的对象
	 */
	public int usersUpdate(Users AUsers) throws SQLException, DbException {
		int ret = Users.update(this.getDataVisit(), AUsers);
		String kvalue = "";
		kvalue = ("" + AUsers.getUsId());
		this.OperatesLogSimpleAdd("USERS", "更新", "US_ID", kvalue, AUsers);
		return ret;
	}
	
	/**
	 * 更新一个对象Users到数据库中
	 * @param Users 需要更新的对象
	 */
	public int usersUpdate(Users AUsers, String appendConditionSql) throws SQLException, DbException {
		int ret = Users.update(this.getDataVisit(), AUsers, appendConditionSql);
		String kvalue = "";
		kvalue = ("" + AUsers.getUsId());
		this.OperatesLogSimpleAdd("USERS", "更新", "US_ID", kvalue, AUsers);
		return ret;
	}
	
	/**
	 * 从数据库中删除一个对象Users
	 * @param Int32  
	 * @param appendSql 附加的条件语句
	 */
	public void usersDeleteByUsId(int AUsId, String appendSql) throws SQLException, DbException {
		String sql;
		Users.deleteByUsId(this.getDataVisit(), AUsId, appendSql);
		String kvalue = "";
		kvalue = ("" + AUsId);
		this.OperatesLogSimpleAdd("USERS", "删除", "US_ID", kvalue, null);
	}
	
	/**
	 * 从数据库中删除一个对象Users
	 * @param Int32  
	 */
	public void usersDeleteByUsId(int AUsId) throws SQLException, DbException {
		this.usersDeleteByUsId(AUsId, "");
	}
	
	/**
	 * 根据对象的唯一索引从数据库中查询一个对象
	 * @param Int32 
	 */
	public Users UsersSelectByUsId(int AUsId) throws SQLException, DbException {
		return Users.SelectByUsId(this.getDataVisit(), AUsId);
	}
	
	/**
	 * 查询数据集
	 * @param AppendSql 附加的Sql语句
	 * @returns 查询结果
	 */
	public List<Users> UsersselectObjects(String AppendSql) throws SQLException, DbException {
		return Users.selectObjects(this.getDataVisit(), AppendSql);
	}
	
	/**
	 * 查询数据集
	 * @return 查询结果
	 */
	public List<Users> UsersselectObjects() throws SQLException, DbException {
		return Users.selectObjects(this.getDataVisit());
	}
	
	/**
	 * 查询数据集
	 * @param AppendSql 附加的Sql语句
	 * @returns 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public List<Users> UsersselectObjects(String AppendSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return Users.selectObjects(this.getDataVisit(), AppendSql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 查询数据集
	 * @return 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public List<Users> UsersselectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return Users.selectObjects(this.getDataVisit(), pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 简单的日志接口,无任何实现
	 */
	public void OperatesLogSimpleAdd(String ATableName, String AOperateName, String AKeyFieldName, String AKeyFieldValue, Object AParam) {
	}
	
	/**
	 * 获得格式化的错误提示信息
	 * @param APrimaryTable 被删除的表对象
	 * @param AForkeyTable 被引用的表对象
	 */
	public String GetDeleteCheckForKeyErrorInfo(String APrimaryTable, String AForkeyTable) {
		return ("无法删除表" 
					+ (APrimaryTable 
					+ (",因为表被外键表" 
					+ (AForkeyTable + "引用"))));
	}
}
