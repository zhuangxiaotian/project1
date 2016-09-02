package cn.topdeep.projgroup.entity.jiradb;
import java.util.*;
import common.util.*;
import java.sql.*;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import common.cache2.*;
/**
 * 基本的逻辑应用层代码，可扩展
 */
public abstract class BusinessLogicManage extends SqlSessionDaoSupport {
	
	/**
	 * 插入一个对象Ao563aeeActivityEntity到数据库中
	 * <param name="Ao563aeeActivityEntity">需要插入的Ao563aeeActivityEntity</param>
	 */
	protected int ao563aeeActivityEntityInsert(Ao563aeeActivityEntity ao563aeeActivityEntity) {
		Ao563aeeActivityEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeActivityEntityMapper.class);
		return mapperImpl.insertSelective(ao563aeeActivityEntity);
	}
	
	/**
	 * 更新一个对象Ao563aeeActivityEntity到数据库中
	 * <param name="ao563aeeActivityEntity">需要更新的Ao563aeeActivityEntity</param>
	 */
	protected int ao563aeeActivityEntityUpdate(Ao563aeeActivityEntity ao563aeeActivityEntity) {
		Ao563aeeActivityEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeActivityEntityMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(ao563aeeActivityEntity);
		return ret;
	}
	
	/**
	 * 更新一个对象Ao563aeeActivityEntity到数据库中
	 * <param name="ao563aeeActivityEntity">需要更新的Ao563aeeActivityEntity</param>
	 */
	protected int ao563aeeActivityEntityUpdateSelective(Ao563aeeActivityEntity ao563aeeActivityEntity) {
		Ao563aeeActivityEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeActivityEntityMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(ao563aeeActivityEntity);
		return ret;
	}
	
	/**
	 * 更新一个对象Ao563aeeActivityEntity到数据库中
	 * <param name="ao563aeeActivityEntity">需要更新的Ao563aeeActivityEntity</param>
	 */
	public int ao563aeeActivityEntityUpdateWithBlobs(Ao563aeeActivityEntity ao563aeeActivityEntity) {
		Ao563aeeActivityEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeActivityEntityMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(ao563aeeActivityEntity);
	}
	
	/**
	 * 根据条件更新一批对象Ao563aeeActivityEntity到数据库中
	 * <param name="ao563aeeActivityEntity">需要更新的Ao563aeeActivityEntity</param>
	 * <param name="ao563aeeActivityEntityQueryCondition">附加的条件</param>
	 */
	protected int ao563aeeActivityEntityUpdateByCondition(Ao563aeeActivityEntity ao563aeeActivityEntity, Ao563aeeActivityEntityExample ao563aeeActivityEntityQueryCondition) {
		Ao563aeeActivityEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeActivityEntityMapper.class);
		int ret = mapperImpl.updateByExample(ao563aeeActivityEntity, ao563aeeActivityEntityQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Ao563aeeActivityEntity到数据库中
	 * <param name="ao563aeeActivityEntity">需要更新的Ao563aeeActivityEntity</param>
	 * <param name="ao563aeeActivityEntityQueryCondition">附加的条件</param>
	 */
	protected int ao563aeeActivityEntityUpdateSelectiveByCondition(Ao563aeeActivityEntity ao563aeeActivityEntity, Ao563aeeActivityEntityExample ao563aeeActivityEntityQueryCondition) {
		Ao563aeeActivityEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeActivityEntityMapper.class);
		int ret = mapperImpl.updateByExampleSelective(ao563aeeActivityEntity, ao563aeeActivityEntityQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="ao563aeeActivityEntity">从数据库中删除一个对象Ao563aeeActivityEntity</param>
	 * <param name="AActivityId"></param>
	 */
	protected int ao563aeeActivityEntityDeleteByPrimaryKey(long AActivityId) {
		Ao563aeeActivityEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeActivityEntityMapper.class);
		return mapperImpl.deleteByPrimaryKey(AActivityId);
	}
	
	/**
	 * <param name="ao563aeeActivityEntity">从数据库中删除一个对象Ao563aeeActivityEntity</param>
	 */
	protected int ao563aeeActivityEntityDeleteByCondition(Ao563aeeActivityEntityExample ao563aeeActivityEntityQueryCondition) {
		Ao563aeeActivityEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeActivityEntityMapper.class);
		return mapperImpl.deleteByExample(ao563aeeActivityEntityQueryCondition);
	}
	
	/**
	 * <param name="ao563aeeActivityEntity">从数据库中查询一个对象Ao563aeeActivityEntity</param>
	 * <param name="AActivityId"></param>
	 */
	protected Ao563aeeActivityEntity ao563aeeActivityEntitySelectByPrimaryKey(long AActivityId) {
		Ao563aeeActivityEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeActivityEntityMapper.class);
		return mapperImpl.selectByPrimaryKey(AActivityId);
	}
	
	/**
	 * <param name="ao563aeeActivityEntityQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Ao563aeeActivityEntity> ao563aeeActivityEntitySelectObjects(Ao563aeeActivityEntityExample ao563aeeActivityEntityQueryCondition) {
		Ao563aeeActivityEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeActivityEntityMapper.class);
		return mapperImpl.selectByExample(ao563aeeActivityEntityQueryCondition);
	}
	
	/**
	 * <param name="ao563aeeActivityEntityQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Ao563aeeActivityEntity> ao563aeeActivityEntitySelectObjectsWithBLOBs(Ao563aeeActivityEntityExample ao563aeeActivityEntityQueryCondition) {
		Ao563aeeActivityEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeActivityEntityMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(ao563aeeActivityEntityQueryCondition);
	}
	
	/**
	 * <param name="ao563aeeActivityEntityQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int ao563aeeActivityEntityQuerySelectObjectsCount(Ao563aeeActivityEntityExample ao563aeeActivityEntityQueryCondition) {
		Ao563aeeActivityEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeActivityEntityMapper.class);
		return mapperImpl.countByExample(ao563aeeActivityEntityQueryCondition);
	}
	
	/**
	 * 插入一个对象Ao563aeeActorEntity到数据库中
	 * <param name="Ao563aeeActorEntity">需要插入的Ao563aeeActorEntity</param>
	 */
	protected int ao563aeeActorEntityInsert(Ao563aeeActorEntity ao563aeeActorEntity) {
		Ao563aeeActorEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeActorEntityMapper.class);
		return mapperImpl.insertSelective(ao563aeeActorEntity);
	}
	
	/**
	 * 更新一个对象Ao563aeeActorEntity到数据库中
	 * <param name="ao563aeeActorEntity">需要更新的Ao563aeeActorEntity</param>
	 */
	protected int ao563aeeActorEntityUpdate(Ao563aeeActorEntity ao563aeeActorEntity) {
		Ao563aeeActorEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeActorEntityMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(ao563aeeActorEntity);
		return ret;
	}
	
	/**
	 * 更新一个对象Ao563aeeActorEntity到数据库中
	 * <param name="ao563aeeActorEntity">需要更新的Ao563aeeActorEntity</param>
	 */
	protected int ao563aeeActorEntityUpdateSelective(Ao563aeeActorEntity ao563aeeActorEntity) {
		Ao563aeeActorEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeActorEntityMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(ao563aeeActorEntity);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Ao563aeeActorEntity到数据库中
	 * <param name="ao563aeeActorEntity">需要更新的Ao563aeeActorEntity</param>
	 * <param name="ao563aeeActorEntityQueryCondition">附加的条件</param>
	 */
	protected int ao563aeeActorEntityUpdateByCondition(Ao563aeeActorEntity ao563aeeActorEntity, Ao563aeeActorEntityExample ao563aeeActorEntityQueryCondition) {
		Ao563aeeActorEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeActorEntityMapper.class);
		int ret = mapperImpl.updateByExample(ao563aeeActorEntity, ao563aeeActorEntityQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Ao563aeeActorEntity到数据库中
	 * <param name="ao563aeeActorEntity">需要更新的Ao563aeeActorEntity</param>
	 * <param name="ao563aeeActorEntityQueryCondition">附加的条件</param>
	 */
	protected int ao563aeeActorEntityUpdateSelectiveByCondition(Ao563aeeActorEntity ao563aeeActorEntity, Ao563aeeActorEntityExample ao563aeeActorEntityQueryCondition) {
		Ao563aeeActorEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeActorEntityMapper.class);
		int ret = mapperImpl.updateByExampleSelective(ao563aeeActorEntity, ao563aeeActorEntityQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="ao563aeeActorEntity">从数据库中删除一个对象Ao563aeeActorEntity</param>
	 * <param name="AId"></param>
	 */
	protected int ao563aeeActorEntityDeleteByPrimaryKey(int AId) {
		Ao563aeeActorEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeActorEntityMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="ao563aeeActorEntity">从数据库中删除一个对象Ao563aeeActorEntity</param>
	 */
	protected int ao563aeeActorEntityDeleteByCondition(Ao563aeeActorEntityExample ao563aeeActorEntityQueryCondition) {
		Ao563aeeActorEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeActorEntityMapper.class);
		return mapperImpl.deleteByExample(ao563aeeActorEntityQueryCondition);
	}
	
	/**
	 * <param name="ao563aeeActorEntity">从数据库中查询一个对象Ao563aeeActorEntity</param>
	 * <param name="AId"></param>
	 */
	protected Ao563aeeActorEntity ao563aeeActorEntitySelectByPrimaryKey(int AId) {
		Ao563aeeActorEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeActorEntityMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="ao563aeeActorEntityQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Ao563aeeActorEntity> ao563aeeActorEntitySelectObjects(Ao563aeeActorEntityExample ao563aeeActorEntityQueryCondition) {
		Ao563aeeActorEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeActorEntityMapper.class);
		return mapperImpl.selectByExample(ao563aeeActorEntityQueryCondition);
	}
	
	/**
	 * <param name="ao563aeeActorEntityQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int ao563aeeActorEntityQuerySelectObjectsCount(Ao563aeeActorEntityExample ao563aeeActorEntityQueryCondition) {
		Ao563aeeActorEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeActorEntityMapper.class);
		return mapperImpl.countByExample(ao563aeeActorEntityQueryCondition);
	}
	
	/**
	 * 插入一个对象Ao563aeeMediaLinkEntity到数据库中
	 * <param name="Ao563aeeMediaLinkEntity">需要插入的Ao563aeeMediaLinkEntity</param>
	 */
	protected int ao563aeeMediaLinkEntityInsert(Ao563aeeMediaLinkEntity ao563aeeMediaLinkEntity) {
		Ao563aeeMediaLinkEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeMediaLinkEntityMapper.class);
		return mapperImpl.insertSelective(ao563aeeMediaLinkEntity);
	}
	
	/**
	 * 更新一个对象Ao563aeeMediaLinkEntity到数据库中
	 * <param name="ao563aeeMediaLinkEntity">需要更新的Ao563aeeMediaLinkEntity</param>
	 */
	protected int ao563aeeMediaLinkEntityUpdate(Ao563aeeMediaLinkEntity ao563aeeMediaLinkEntity) {
		Ao563aeeMediaLinkEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeMediaLinkEntityMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(ao563aeeMediaLinkEntity);
		return ret;
	}
	
	/**
	 * 更新一个对象Ao563aeeMediaLinkEntity到数据库中
	 * <param name="ao563aeeMediaLinkEntity">需要更新的Ao563aeeMediaLinkEntity</param>
	 */
	protected int ao563aeeMediaLinkEntityUpdateSelective(Ao563aeeMediaLinkEntity ao563aeeMediaLinkEntity) {
		Ao563aeeMediaLinkEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeMediaLinkEntityMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(ao563aeeMediaLinkEntity);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Ao563aeeMediaLinkEntity到数据库中
	 * <param name="ao563aeeMediaLinkEntity">需要更新的Ao563aeeMediaLinkEntity</param>
	 * <param name="ao563aeeMediaLinkEntityQueryCondition">附加的条件</param>
	 */
	protected int ao563aeeMediaLinkEntityUpdateByCondition(Ao563aeeMediaLinkEntity ao563aeeMediaLinkEntity, Ao563aeeMediaLinkEntityExample ao563aeeMediaLinkEntityQueryCondition) {
		Ao563aeeMediaLinkEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeMediaLinkEntityMapper.class);
		int ret = mapperImpl.updateByExample(ao563aeeMediaLinkEntity, ao563aeeMediaLinkEntityQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Ao563aeeMediaLinkEntity到数据库中
	 * <param name="ao563aeeMediaLinkEntity">需要更新的Ao563aeeMediaLinkEntity</param>
	 * <param name="ao563aeeMediaLinkEntityQueryCondition">附加的条件</param>
	 */
	protected int ao563aeeMediaLinkEntityUpdateSelectiveByCondition(Ao563aeeMediaLinkEntity ao563aeeMediaLinkEntity, Ao563aeeMediaLinkEntityExample ao563aeeMediaLinkEntityQueryCondition) {
		Ao563aeeMediaLinkEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeMediaLinkEntityMapper.class);
		int ret = mapperImpl.updateByExampleSelective(ao563aeeMediaLinkEntity, ao563aeeMediaLinkEntityQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="ao563aeeMediaLinkEntity">从数据库中删除一个对象Ao563aeeMediaLinkEntity</param>
	 * <param name="AId"></param>
	 */
	protected int ao563aeeMediaLinkEntityDeleteByPrimaryKey(int AId) {
		Ao563aeeMediaLinkEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeMediaLinkEntityMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="ao563aeeMediaLinkEntity">从数据库中删除一个对象Ao563aeeMediaLinkEntity</param>
	 */
	protected int ao563aeeMediaLinkEntityDeleteByCondition(Ao563aeeMediaLinkEntityExample ao563aeeMediaLinkEntityQueryCondition) {
		Ao563aeeMediaLinkEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeMediaLinkEntityMapper.class);
		return mapperImpl.deleteByExample(ao563aeeMediaLinkEntityQueryCondition);
	}
	
	/**
	 * <param name="ao563aeeMediaLinkEntity">从数据库中查询一个对象Ao563aeeMediaLinkEntity</param>
	 * <param name="AId"></param>
	 */
	protected Ao563aeeMediaLinkEntity ao563aeeMediaLinkEntitySelectByPrimaryKey(int AId) {
		Ao563aeeMediaLinkEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeMediaLinkEntityMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="ao563aeeMediaLinkEntityQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Ao563aeeMediaLinkEntity> ao563aeeMediaLinkEntitySelectObjects(Ao563aeeMediaLinkEntityExample ao563aeeMediaLinkEntityQueryCondition) {
		Ao563aeeMediaLinkEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeMediaLinkEntityMapper.class);
		return mapperImpl.selectByExample(ao563aeeMediaLinkEntityQueryCondition);
	}
	
	/**
	 * <param name="ao563aeeMediaLinkEntityQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int ao563aeeMediaLinkEntityQuerySelectObjectsCount(Ao563aeeMediaLinkEntityExample ao563aeeMediaLinkEntityQueryCondition) {
		Ao563aeeMediaLinkEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeMediaLinkEntityMapper.class);
		return mapperImpl.countByExample(ao563aeeMediaLinkEntityQueryCondition);
	}
	
	/**
	 * 插入一个对象Ao563aeeObjectEntity到数据库中
	 * <param name="Ao563aeeObjectEntity">需要插入的Ao563aeeObjectEntity</param>
	 */
	protected int ao563aeeObjectEntityInsert(Ao563aeeObjectEntity ao563aeeObjectEntity) {
		Ao563aeeObjectEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeObjectEntityMapper.class);
		return mapperImpl.insertSelective(ao563aeeObjectEntity);
	}
	
	/**
	 * 更新一个对象Ao563aeeObjectEntity到数据库中
	 * <param name="ao563aeeObjectEntity">需要更新的Ao563aeeObjectEntity</param>
	 */
	protected int ao563aeeObjectEntityUpdate(Ao563aeeObjectEntity ao563aeeObjectEntity) {
		Ao563aeeObjectEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeObjectEntityMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(ao563aeeObjectEntity);
		return ret;
	}
	
	/**
	 * 更新一个对象Ao563aeeObjectEntity到数据库中
	 * <param name="ao563aeeObjectEntity">需要更新的Ao563aeeObjectEntity</param>
	 */
	protected int ao563aeeObjectEntityUpdateSelective(Ao563aeeObjectEntity ao563aeeObjectEntity) {
		Ao563aeeObjectEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeObjectEntityMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(ao563aeeObjectEntity);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Ao563aeeObjectEntity到数据库中
	 * <param name="ao563aeeObjectEntity">需要更新的Ao563aeeObjectEntity</param>
	 * <param name="ao563aeeObjectEntityQueryCondition">附加的条件</param>
	 */
	protected int ao563aeeObjectEntityUpdateByCondition(Ao563aeeObjectEntity ao563aeeObjectEntity, Ao563aeeObjectEntityExample ao563aeeObjectEntityQueryCondition) {
		Ao563aeeObjectEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeObjectEntityMapper.class);
		int ret = mapperImpl.updateByExample(ao563aeeObjectEntity, ao563aeeObjectEntityQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Ao563aeeObjectEntity到数据库中
	 * <param name="ao563aeeObjectEntity">需要更新的Ao563aeeObjectEntity</param>
	 * <param name="ao563aeeObjectEntityQueryCondition">附加的条件</param>
	 */
	protected int ao563aeeObjectEntityUpdateSelectiveByCondition(Ao563aeeObjectEntity ao563aeeObjectEntity, Ao563aeeObjectEntityExample ao563aeeObjectEntityQueryCondition) {
		Ao563aeeObjectEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeObjectEntityMapper.class);
		int ret = mapperImpl.updateByExampleSelective(ao563aeeObjectEntity, ao563aeeObjectEntityQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="ao563aeeObjectEntity">从数据库中删除一个对象Ao563aeeObjectEntity</param>
	 * <param name="AId"></param>
	 */
	protected int ao563aeeObjectEntityDeleteByPrimaryKey(int AId) {
		Ao563aeeObjectEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeObjectEntityMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="ao563aeeObjectEntity">从数据库中删除一个对象Ao563aeeObjectEntity</param>
	 */
	protected int ao563aeeObjectEntityDeleteByCondition(Ao563aeeObjectEntityExample ao563aeeObjectEntityQueryCondition) {
		Ao563aeeObjectEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeObjectEntityMapper.class);
		return mapperImpl.deleteByExample(ao563aeeObjectEntityQueryCondition);
	}
	
	/**
	 * <param name="ao563aeeObjectEntity">从数据库中查询一个对象Ao563aeeObjectEntity</param>
	 * <param name="AId"></param>
	 */
	protected Ao563aeeObjectEntity ao563aeeObjectEntitySelectByPrimaryKey(int AId) {
		Ao563aeeObjectEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeObjectEntityMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="ao563aeeObjectEntityQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Ao563aeeObjectEntity> ao563aeeObjectEntitySelectObjects(Ao563aeeObjectEntityExample ao563aeeObjectEntityQueryCondition) {
		Ao563aeeObjectEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeObjectEntityMapper.class);
		return mapperImpl.selectByExample(ao563aeeObjectEntityQueryCondition);
	}
	
	/**
	 * <param name="ao563aeeObjectEntityQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int ao563aeeObjectEntityQuerySelectObjectsCount(Ao563aeeObjectEntityExample ao563aeeObjectEntityQueryCondition) {
		Ao563aeeObjectEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeObjectEntityMapper.class);
		return mapperImpl.countByExample(ao563aeeObjectEntityQueryCondition);
	}
	
	/**
	 * 插入一个对象Ao563aeeTargetEntity到数据库中
	 * <param name="Ao563aeeTargetEntity">需要插入的Ao563aeeTargetEntity</param>
	 */
	protected int ao563aeeTargetEntityInsert(Ao563aeeTargetEntity ao563aeeTargetEntity) {
		Ao563aeeTargetEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeTargetEntityMapper.class);
		return mapperImpl.insertSelective(ao563aeeTargetEntity);
	}
	
	/**
	 * 更新一个对象Ao563aeeTargetEntity到数据库中
	 * <param name="ao563aeeTargetEntity">需要更新的Ao563aeeTargetEntity</param>
	 */
	protected int ao563aeeTargetEntityUpdate(Ao563aeeTargetEntity ao563aeeTargetEntity) {
		Ao563aeeTargetEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeTargetEntityMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(ao563aeeTargetEntity);
		return ret;
	}
	
	/**
	 * 更新一个对象Ao563aeeTargetEntity到数据库中
	 * <param name="ao563aeeTargetEntity">需要更新的Ao563aeeTargetEntity</param>
	 */
	protected int ao563aeeTargetEntityUpdateSelective(Ao563aeeTargetEntity ao563aeeTargetEntity) {
		Ao563aeeTargetEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeTargetEntityMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(ao563aeeTargetEntity);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Ao563aeeTargetEntity到数据库中
	 * <param name="ao563aeeTargetEntity">需要更新的Ao563aeeTargetEntity</param>
	 * <param name="ao563aeeTargetEntityQueryCondition">附加的条件</param>
	 */
	protected int ao563aeeTargetEntityUpdateByCondition(Ao563aeeTargetEntity ao563aeeTargetEntity, Ao563aeeTargetEntityExample ao563aeeTargetEntityQueryCondition) {
		Ao563aeeTargetEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeTargetEntityMapper.class);
		int ret = mapperImpl.updateByExample(ao563aeeTargetEntity, ao563aeeTargetEntityQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Ao563aeeTargetEntity到数据库中
	 * <param name="ao563aeeTargetEntity">需要更新的Ao563aeeTargetEntity</param>
	 * <param name="ao563aeeTargetEntityQueryCondition">附加的条件</param>
	 */
	protected int ao563aeeTargetEntityUpdateSelectiveByCondition(Ao563aeeTargetEntity ao563aeeTargetEntity, Ao563aeeTargetEntityExample ao563aeeTargetEntityQueryCondition) {
		Ao563aeeTargetEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeTargetEntityMapper.class);
		int ret = mapperImpl.updateByExampleSelective(ao563aeeTargetEntity, ao563aeeTargetEntityQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="ao563aeeTargetEntity">从数据库中删除一个对象Ao563aeeTargetEntity</param>
	 * <param name="AId"></param>
	 */
	protected int ao563aeeTargetEntityDeleteByPrimaryKey(int AId) {
		Ao563aeeTargetEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeTargetEntityMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="ao563aeeTargetEntity">从数据库中删除一个对象Ao563aeeTargetEntity</param>
	 */
	protected int ao563aeeTargetEntityDeleteByCondition(Ao563aeeTargetEntityExample ao563aeeTargetEntityQueryCondition) {
		Ao563aeeTargetEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeTargetEntityMapper.class);
		return mapperImpl.deleteByExample(ao563aeeTargetEntityQueryCondition);
	}
	
	/**
	 * <param name="ao563aeeTargetEntity">从数据库中查询一个对象Ao563aeeTargetEntity</param>
	 * <param name="AId"></param>
	 */
	protected Ao563aeeTargetEntity ao563aeeTargetEntitySelectByPrimaryKey(int AId) {
		Ao563aeeTargetEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeTargetEntityMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="ao563aeeTargetEntityQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Ao563aeeTargetEntity> ao563aeeTargetEntitySelectObjects(Ao563aeeTargetEntityExample ao563aeeTargetEntityQueryCondition) {
		Ao563aeeTargetEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeTargetEntityMapper.class);
		return mapperImpl.selectByExample(ao563aeeTargetEntityQueryCondition);
	}
	
	/**
	 * <param name="ao563aeeTargetEntityQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int ao563aeeTargetEntityQuerySelectObjectsCount(Ao563aeeTargetEntityExample ao563aeeTargetEntityQueryCondition) {
		Ao563aeeTargetEntityMapper mapperImpl = this.getSqlSession().getMapper(Ao563aeeTargetEntityMapper.class);
		return mapperImpl.countByExample(ao563aeeTargetEntityQueryCondition);
	}
	
	/**
	 * 插入一个对象Ao854ed6Configuration到数据库中
	 * <param name="Ao854ed6Configuration">需要插入的Ao854ed6Configuration</param>
	 */
	protected int ao854ed6ConfigurationInsert(Ao854ed6Configuration ao854ed6Configuration) {
		Ao854ed6ConfigurationMapper mapperImpl = this.getSqlSession().getMapper(Ao854ed6ConfigurationMapper.class);
		return mapperImpl.insertSelective(ao854ed6Configuration);
	}
	
	/**
	 * 更新一个对象Ao854ed6Configuration到数据库中
	 * <param name="ao854ed6Configuration">需要更新的Ao854ed6Configuration</param>
	 */
	protected int ao854ed6ConfigurationUpdate(Ao854ed6Configuration ao854ed6Configuration) {
		Ao854ed6ConfigurationMapper mapperImpl = this.getSqlSession().getMapper(Ao854ed6ConfigurationMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(ao854ed6Configuration);
		return ret;
	}
	
	/**
	 * 更新一个对象Ao854ed6Configuration到数据库中
	 * <param name="ao854ed6Configuration">需要更新的Ao854ed6Configuration</param>
	 */
	protected int ao854ed6ConfigurationUpdateSelective(Ao854ed6Configuration ao854ed6Configuration) {
		Ao854ed6ConfigurationMapper mapperImpl = this.getSqlSession().getMapper(Ao854ed6ConfigurationMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(ao854ed6Configuration);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Ao854ed6Configuration到数据库中
	 * <param name="ao854ed6Configuration">需要更新的Ao854ed6Configuration</param>
	 * <param name="ao854ed6ConfigurationQueryCondition">附加的条件</param>
	 */
	protected int ao854ed6ConfigurationUpdateByCondition(Ao854ed6Configuration ao854ed6Configuration, Ao854ed6ConfigurationExample ao854ed6ConfigurationQueryCondition) {
		Ao854ed6ConfigurationMapper mapperImpl = this.getSqlSession().getMapper(Ao854ed6ConfigurationMapper.class);
		int ret = mapperImpl.updateByExample(ao854ed6Configuration, ao854ed6ConfigurationQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Ao854ed6Configuration到数据库中
	 * <param name="ao854ed6Configuration">需要更新的Ao854ed6Configuration</param>
	 * <param name="ao854ed6ConfigurationQueryCondition">附加的条件</param>
	 */
	protected int ao854ed6ConfigurationUpdateSelectiveByCondition(Ao854ed6Configuration ao854ed6Configuration, Ao854ed6ConfigurationExample ao854ed6ConfigurationQueryCondition) {
		Ao854ed6ConfigurationMapper mapperImpl = this.getSqlSession().getMapper(Ao854ed6ConfigurationMapper.class);
		int ret = mapperImpl.updateByExampleSelective(ao854ed6Configuration, ao854ed6ConfigurationQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="ao854ed6Configuration">从数据库中删除一个对象Ao854ed6Configuration</param>
	 * <param name="AId"></param>
	 */
	protected int ao854ed6ConfigurationDeleteByPrimaryKey(int AId) {
		Ao854ed6ConfigurationMapper mapperImpl = this.getSqlSession().getMapper(Ao854ed6ConfigurationMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="ao854ed6Configuration">从数据库中删除一个对象Ao854ed6Configuration</param>
	 */
	protected int ao854ed6ConfigurationDeleteByCondition(Ao854ed6ConfigurationExample ao854ed6ConfigurationQueryCondition) {
		Ao854ed6ConfigurationMapper mapperImpl = this.getSqlSession().getMapper(Ao854ed6ConfigurationMapper.class);
		return mapperImpl.deleteByExample(ao854ed6ConfigurationQueryCondition);
	}
	
	/**
	 * <param name="ao854ed6Configuration">从数据库中查询一个对象Ao854ed6Configuration</param>
	 * <param name="AId"></param>
	 */
	protected Ao854ed6Configuration ao854ed6ConfigurationSelectByPrimaryKey(int AId) {
		Ao854ed6ConfigurationMapper mapperImpl = this.getSqlSession().getMapper(Ao854ed6ConfigurationMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="ao854ed6ConfigurationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Ao854ed6Configuration> ao854ed6ConfigurationSelectObjects(Ao854ed6ConfigurationExample ao854ed6ConfigurationQueryCondition) {
		Ao854ed6ConfigurationMapper mapperImpl = this.getSqlSession().getMapper(Ao854ed6ConfigurationMapper.class);
		return mapperImpl.selectByExample(ao854ed6ConfigurationQueryCondition);
	}
	
	/**
	 * <param name="ao854ed6ConfigurationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int ao854ed6ConfigurationQuerySelectObjectsCount(Ao854ed6ConfigurationExample ao854ed6ConfigurationQueryCondition) {
		Ao854ed6ConfigurationMapper mapperImpl = this.getSqlSession().getMapper(Ao854ed6ConfigurationMapper.class);
		return mapperImpl.countByExample(ao854ed6ConfigurationQueryCondition);
	}
	
	/**
	 * 插入一个对象Ao854ed6StartDate到数据库中
	 * <param name="Ao854ed6StartDate">需要插入的Ao854ed6StartDate</param>
	 */
	protected int ao854ed6StartDateInsert(Ao854ed6StartDate ao854ed6StartDate) {
		Ao854ed6StartDateMapper mapperImpl = this.getSqlSession().getMapper(Ao854ed6StartDateMapper.class);
		return mapperImpl.insertSelective(ao854ed6StartDate);
	}
	
	/**
	 * 更新一个对象Ao854ed6StartDate到数据库中
	 * <param name="ao854ed6StartDate">需要更新的Ao854ed6StartDate</param>
	 */
	protected int ao854ed6StartDateUpdate(Ao854ed6StartDate ao854ed6StartDate) {
		Ao854ed6StartDateMapper mapperImpl = this.getSqlSession().getMapper(Ao854ed6StartDateMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(ao854ed6StartDate);
		return ret;
	}
	
	/**
	 * 更新一个对象Ao854ed6StartDate到数据库中
	 * <param name="ao854ed6StartDate">需要更新的Ao854ed6StartDate</param>
	 */
	protected int ao854ed6StartDateUpdateSelective(Ao854ed6StartDate ao854ed6StartDate) {
		Ao854ed6StartDateMapper mapperImpl = this.getSqlSession().getMapper(Ao854ed6StartDateMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(ao854ed6StartDate);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Ao854ed6StartDate到数据库中
	 * <param name="ao854ed6StartDate">需要更新的Ao854ed6StartDate</param>
	 * <param name="ao854ed6StartDateQueryCondition">附加的条件</param>
	 */
	protected int ao854ed6StartDateUpdateByCondition(Ao854ed6StartDate ao854ed6StartDate, Ao854ed6StartDateExample ao854ed6StartDateQueryCondition) {
		Ao854ed6StartDateMapper mapperImpl = this.getSqlSession().getMapper(Ao854ed6StartDateMapper.class);
		int ret = mapperImpl.updateByExample(ao854ed6StartDate, ao854ed6StartDateQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Ao854ed6StartDate到数据库中
	 * <param name="ao854ed6StartDate">需要更新的Ao854ed6StartDate</param>
	 * <param name="ao854ed6StartDateQueryCondition">附加的条件</param>
	 */
	protected int ao854ed6StartDateUpdateSelectiveByCondition(Ao854ed6StartDate ao854ed6StartDate, Ao854ed6StartDateExample ao854ed6StartDateQueryCondition) {
		Ao854ed6StartDateMapper mapperImpl = this.getSqlSession().getMapper(Ao854ed6StartDateMapper.class);
		int ret = mapperImpl.updateByExampleSelective(ao854ed6StartDate, ao854ed6StartDateQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="ao854ed6StartDate">从数据库中删除一个对象Ao854ed6StartDate</param>
	 * <param name="AId"></param>
	 */
	protected int ao854ed6StartDateDeleteByPrimaryKey(int AId) {
		Ao854ed6StartDateMapper mapperImpl = this.getSqlSession().getMapper(Ao854ed6StartDateMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="ao854ed6StartDate">从数据库中删除一个对象Ao854ed6StartDate</param>
	 */
	protected int ao854ed6StartDateDeleteByCondition(Ao854ed6StartDateExample ao854ed6StartDateQueryCondition) {
		Ao854ed6StartDateMapper mapperImpl = this.getSqlSession().getMapper(Ao854ed6StartDateMapper.class);
		return mapperImpl.deleteByExample(ao854ed6StartDateQueryCondition);
	}
	
	/**
	 * <param name="ao854ed6StartDate">从数据库中查询一个对象Ao854ed6StartDate</param>
	 * <param name="AId"></param>
	 */
	protected Ao854ed6StartDate ao854ed6StartDateSelectByPrimaryKey(int AId) {
		Ao854ed6StartDateMapper mapperImpl = this.getSqlSession().getMapper(Ao854ed6StartDateMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="ao854ed6StartDateQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Ao854ed6StartDate> ao854ed6StartDateSelectObjects(Ao854ed6StartDateExample ao854ed6StartDateQueryCondition) {
		Ao854ed6StartDateMapper mapperImpl = this.getSqlSession().getMapper(Ao854ed6StartDateMapper.class);
		return mapperImpl.selectByExample(ao854ed6StartDateQueryCondition);
	}
	
	/**
	 * <param name="ao854ed6StartDateQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int ao854ed6StartDateQuerySelectObjectsCount(Ao854ed6StartDateExample ao854ed6StartDateQueryCondition) {
		Ao854ed6StartDateMapper mapperImpl = this.getSqlSession().getMapper(Ao854ed6StartDateMapper.class);
		return mapperImpl.countByExample(ao854ed6StartDateQueryCondition);
	}
	
	/**
	 * 插入一个对象AoD5e466Calendar到数据库中
	 * <param name="AoD5e466Calendar">需要插入的AoD5e466Calendar</param>
	 */
	protected int aoD5e466CalendarInsert(AoD5e466Calendar aoD5e466Calendar) {
		AoD5e466CalendarMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466CalendarMapper.class);
		return mapperImpl.insertSelective(aoD5e466Calendar);
	}
	
	/**
	 * 更新一个对象AoD5e466Calendar到数据库中
	 * <param name="aoD5e466Calendar">需要更新的AoD5e466Calendar</param>
	 */
	protected int aoD5e466CalendarUpdate(AoD5e466Calendar aoD5e466Calendar) {
		AoD5e466CalendarMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466CalendarMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(aoD5e466Calendar);
		return ret;
	}
	
	/**
	 * 更新一个对象AoD5e466Calendar到数据库中
	 * <param name="aoD5e466Calendar">需要更新的AoD5e466Calendar</param>
	 */
	protected int aoD5e466CalendarUpdateSelective(AoD5e466Calendar aoD5e466Calendar) {
		AoD5e466CalendarMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466CalendarMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(aoD5e466Calendar);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象AoD5e466Calendar到数据库中
	 * <param name="aoD5e466Calendar">需要更新的AoD5e466Calendar</param>
	 * <param name="aoD5e466CalendarQueryCondition">附加的条件</param>
	 */
	protected int aoD5e466CalendarUpdateByCondition(AoD5e466Calendar aoD5e466Calendar, AoD5e466CalendarExample aoD5e466CalendarQueryCondition) {
		AoD5e466CalendarMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466CalendarMapper.class);
		int ret = mapperImpl.updateByExample(aoD5e466Calendar, aoD5e466CalendarQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息AoD5e466Calendar到数据库中
	 * <param name="aoD5e466Calendar">需要更新的AoD5e466Calendar</param>
	 * <param name="aoD5e466CalendarQueryCondition">附加的条件</param>
	 */
	protected int aoD5e466CalendarUpdateSelectiveByCondition(AoD5e466Calendar aoD5e466Calendar, AoD5e466CalendarExample aoD5e466CalendarQueryCondition) {
		AoD5e466CalendarMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466CalendarMapper.class);
		int ret = mapperImpl.updateByExampleSelective(aoD5e466Calendar, aoD5e466CalendarQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="aoD5e466Calendar">从数据库中删除一个对象AoD5e466Calendar</param>
	 * <param name="AId"></param>
	 */
	protected int aoD5e466CalendarDeleteByPrimaryKey(int AId) {
		AoD5e466CalendarMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466CalendarMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="aoD5e466Calendar">从数据库中删除一个对象AoD5e466Calendar</param>
	 */
	protected int aoD5e466CalendarDeleteByCondition(AoD5e466CalendarExample aoD5e466CalendarQueryCondition) {
		AoD5e466CalendarMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466CalendarMapper.class);
		return mapperImpl.deleteByExample(aoD5e466CalendarQueryCondition);
	}
	
	/**
	 * <param name="aoD5e466Calendar">从数据库中查询一个对象AoD5e466Calendar</param>
	 * <param name="AId"></param>
	 */
	protected AoD5e466Calendar aoD5e466CalendarSelectByPrimaryKey(int AId) {
		AoD5e466CalendarMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466CalendarMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="aoD5e466CalendarQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<AoD5e466Calendar> aoD5e466CalendarSelectObjects(AoD5e466CalendarExample aoD5e466CalendarQueryCondition) {
		AoD5e466CalendarMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466CalendarMapper.class);
		return mapperImpl.selectByExample(aoD5e466CalendarQueryCondition);
	}
	
	/**
	 * <param name="aoD5e466CalendarQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int aoD5e466CalendarQuerySelectObjectsCount(AoD5e466CalendarExample aoD5e466CalendarQueryCondition) {
		AoD5e466CalendarMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466CalendarMapper.class);
		return mapperImpl.countByExample(aoD5e466CalendarQueryCondition);
	}
	
	/**
	 * 插入一个对象AoD5e466CalendarYear到数据库中
	 * <param name="AoD5e466CalendarYear">需要插入的AoD5e466CalendarYear</param>
	 */
	protected int aoD5e466CalendarYearInsert(AoD5e466CalendarYear aoD5e466CalendarYear) {
		AoD5e466CalendarYearMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466CalendarYearMapper.class);
		return mapperImpl.insertSelective(aoD5e466CalendarYear);
	}
	
	/**
	 * 更新一个对象AoD5e466CalendarYear到数据库中
	 * <param name="aoD5e466CalendarYear">需要更新的AoD5e466CalendarYear</param>
	 */
	protected int aoD5e466CalendarYearUpdate(AoD5e466CalendarYear aoD5e466CalendarYear) {
		AoD5e466CalendarYearMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466CalendarYearMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(aoD5e466CalendarYear);
		return ret;
	}
	
	/**
	 * 更新一个对象AoD5e466CalendarYear到数据库中
	 * <param name="aoD5e466CalendarYear">需要更新的AoD5e466CalendarYear</param>
	 */
	protected int aoD5e466CalendarYearUpdateSelective(AoD5e466CalendarYear aoD5e466CalendarYear) {
		AoD5e466CalendarYearMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466CalendarYearMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(aoD5e466CalendarYear);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象AoD5e466CalendarYear到数据库中
	 * <param name="aoD5e466CalendarYear">需要更新的AoD5e466CalendarYear</param>
	 * <param name="aoD5e466CalendarYearQueryCondition">附加的条件</param>
	 */
	protected int aoD5e466CalendarYearUpdateByCondition(AoD5e466CalendarYear aoD5e466CalendarYear, AoD5e466CalendarYearExample aoD5e466CalendarYearQueryCondition) {
		AoD5e466CalendarYearMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466CalendarYearMapper.class);
		int ret = mapperImpl.updateByExample(aoD5e466CalendarYear, aoD5e466CalendarYearQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息AoD5e466CalendarYear到数据库中
	 * <param name="aoD5e466CalendarYear">需要更新的AoD5e466CalendarYear</param>
	 * <param name="aoD5e466CalendarYearQueryCondition">附加的条件</param>
	 */
	protected int aoD5e466CalendarYearUpdateSelectiveByCondition(AoD5e466CalendarYear aoD5e466CalendarYear, AoD5e466CalendarYearExample aoD5e466CalendarYearQueryCondition) {
		AoD5e466CalendarYearMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466CalendarYearMapper.class);
		int ret = mapperImpl.updateByExampleSelective(aoD5e466CalendarYear, aoD5e466CalendarYearQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="aoD5e466CalendarYear">从数据库中删除一个对象AoD5e466CalendarYear</param>
	 * <param name="AId"></param>
	 */
	protected int aoD5e466CalendarYearDeleteByPrimaryKey(int AId) {
		AoD5e466CalendarYearMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466CalendarYearMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="aoD5e466CalendarYear">从数据库中删除一个对象AoD5e466CalendarYear</param>
	 */
	protected int aoD5e466CalendarYearDeleteByCondition(AoD5e466CalendarYearExample aoD5e466CalendarYearQueryCondition) {
		AoD5e466CalendarYearMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466CalendarYearMapper.class);
		return mapperImpl.deleteByExample(aoD5e466CalendarYearQueryCondition);
	}
	
	/**
	 * <param name="aoD5e466CalendarYear">从数据库中查询一个对象AoD5e466CalendarYear</param>
	 * <param name="AId"></param>
	 */
	protected AoD5e466CalendarYear aoD5e466CalendarYearSelectByPrimaryKey(int AId) {
		AoD5e466CalendarYearMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466CalendarYearMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="aoD5e466CalendarYearQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<AoD5e466CalendarYear> aoD5e466CalendarYearSelectObjects(AoD5e466CalendarYearExample aoD5e466CalendarYearQueryCondition) {
		AoD5e466CalendarYearMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466CalendarYearMapper.class);
		return mapperImpl.selectByExample(aoD5e466CalendarYearQueryCondition);
	}
	
	/**
	 * <param name="aoD5e466CalendarYearQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int aoD5e466CalendarYearQuerySelectObjectsCount(AoD5e466CalendarYearExample aoD5e466CalendarYearQueryCondition) {
		AoD5e466CalendarYearMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466CalendarYearMapper.class);
		return mapperImpl.countByExample(aoD5e466CalendarYearQueryCondition);
	}
	
	/**
	 * 插入一个对象AoD5e466Configuration到数据库中
	 * <param name="AoD5e466Configuration">需要插入的AoD5e466Configuration</param>
	 */
	protected int aoD5e466ConfigurationInsert(AoD5e466Configuration aoD5e466Configuration) {
		AoD5e466ConfigurationMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466ConfigurationMapper.class);
		return mapperImpl.insertSelective(aoD5e466Configuration);
	}
	
	/**
	 * 更新一个对象AoD5e466Configuration到数据库中
	 * <param name="aoD5e466Configuration">需要更新的AoD5e466Configuration</param>
	 */
	protected int aoD5e466ConfigurationUpdate(AoD5e466Configuration aoD5e466Configuration) {
		AoD5e466ConfigurationMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466ConfigurationMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(aoD5e466Configuration);
		return ret;
	}
	
	/**
	 * 更新一个对象AoD5e466Configuration到数据库中
	 * <param name="aoD5e466Configuration">需要更新的AoD5e466Configuration</param>
	 */
	protected int aoD5e466ConfigurationUpdateSelective(AoD5e466Configuration aoD5e466Configuration) {
		AoD5e466ConfigurationMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466ConfigurationMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(aoD5e466Configuration);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象AoD5e466Configuration到数据库中
	 * <param name="aoD5e466Configuration">需要更新的AoD5e466Configuration</param>
	 * <param name="aoD5e466ConfigurationQueryCondition">附加的条件</param>
	 */
	protected int aoD5e466ConfigurationUpdateByCondition(AoD5e466Configuration aoD5e466Configuration, AoD5e466ConfigurationExample aoD5e466ConfigurationQueryCondition) {
		AoD5e466ConfigurationMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466ConfigurationMapper.class);
		int ret = mapperImpl.updateByExample(aoD5e466Configuration, aoD5e466ConfigurationQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息AoD5e466Configuration到数据库中
	 * <param name="aoD5e466Configuration">需要更新的AoD5e466Configuration</param>
	 * <param name="aoD5e466ConfigurationQueryCondition">附加的条件</param>
	 */
	protected int aoD5e466ConfigurationUpdateSelectiveByCondition(AoD5e466Configuration aoD5e466Configuration, AoD5e466ConfigurationExample aoD5e466ConfigurationQueryCondition) {
		AoD5e466ConfigurationMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466ConfigurationMapper.class);
		int ret = mapperImpl.updateByExampleSelective(aoD5e466Configuration, aoD5e466ConfigurationQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="aoD5e466Configuration">从数据库中删除一个对象AoD5e466Configuration</param>
	 * <param name="AId"></param>
	 */
	protected int aoD5e466ConfigurationDeleteByPrimaryKey(int AId) {
		AoD5e466ConfigurationMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466ConfigurationMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="aoD5e466Configuration">从数据库中删除一个对象AoD5e466Configuration</param>
	 */
	protected int aoD5e466ConfigurationDeleteByCondition(AoD5e466ConfigurationExample aoD5e466ConfigurationQueryCondition) {
		AoD5e466ConfigurationMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466ConfigurationMapper.class);
		return mapperImpl.deleteByExample(aoD5e466ConfigurationQueryCondition);
	}
	
	/**
	 * <param name="aoD5e466Configuration">从数据库中查询一个对象AoD5e466Configuration</param>
	 * <param name="AId"></param>
	 */
	protected AoD5e466Configuration aoD5e466ConfigurationSelectByPrimaryKey(int AId) {
		AoD5e466ConfigurationMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466ConfigurationMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="aoD5e466ConfigurationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<AoD5e466Configuration> aoD5e466ConfigurationSelectObjects(AoD5e466ConfigurationExample aoD5e466ConfigurationQueryCondition) {
		AoD5e466ConfigurationMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466ConfigurationMapper.class);
		return mapperImpl.selectByExample(aoD5e466ConfigurationQueryCondition);
	}
	
	/**
	 * <param name="aoD5e466ConfigurationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int aoD5e466ConfigurationQuerySelectObjectsCount(AoD5e466ConfigurationExample aoD5e466ConfigurationQueryCondition) {
		AoD5e466ConfigurationMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466ConfigurationMapper.class);
		return mapperImpl.countByExample(aoD5e466ConfigurationQueryCondition);
	}
	
	/**
	 * 插入一个对象AoD5e466Element到数据库中
	 * <param name="AoD5e466Element">需要插入的AoD5e466Element</param>
	 */
	protected int aoD5e466ElementInsert(AoD5e466Element aoD5e466Element) {
		AoD5e466ElementMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466ElementMapper.class);
		return mapperImpl.insertSelective(aoD5e466Element);
	}
	
	/**
	 * 更新一个对象AoD5e466Element到数据库中
	 * <param name="aoD5e466Element">需要更新的AoD5e466Element</param>
	 */
	protected int aoD5e466ElementUpdate(AoD5e466Element aoD5e466Element) {
		AoD5e466ElementMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466ElementMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(aoD5e466Element);
		return ret;
	}
	
	/**
	 * 更新一个对象AoD5e466Element到数据库中
	 * <param name="aoD5e466Element">需要更新的AoD5e466Element</param>
	 */
	protected int aoD5e466ElementUpdateSelective(AoD5e466Element aoD5e466Element) {
		AoD5e466ElementMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466ElementMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(aoD5e466Element);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象AoD5e466Element到数据库中
	 * <param name="aoD5e466Element">需要更新的AoD5e466Element</param>
	 * <param name="aoD5e466ElementQueryCondition">附加的条件</param>
	 */
	protected int aoD5e466ElementUpdateByCondition(AoD5e466Element aoD5e466Element, AoD5e466ElementExample aoD5e466ElementQueryCondition) {
		AoD5e466ElementMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466ElementMapper.class);
		int ret = mapperImpl.updateByExample(aoD5e466Element, aoD5e466ElementQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息AoD5e466Element到数据库中
	 * <param name="aoD5e466Element">需要更新的AoD5e466Element</param>
	 * <param name="aoD5e466ElementQueryCondition">附加的条件</param>
	 */
	protected int aoD5e466ElementUpdateSelectiveByCondition(AoD5e466Element aoD5e466Element, AoD5e466ElementExample aoD5e466ElementQueryCondition) {
		AoD5e466ElementMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466ElementMapper.class);
		int ret = mapperImpl.updateByExampleSelective(aoD5e466Element, aoD5e466ElementQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="aoD5e466Element">从数据库中删除一个对象AoD5e466Element</param>
	 * <param name="AId"></param>
	 */
	protected int aoD5e466ElementDeleteByPrimaryKey(int AId) {
		AoD5e466ElementMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466ElementMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="aoD5e466Element">从数据库中删除一个对象AoD5e466Element</param>
	 */
	protected int aoD5e466ElementDeleteByCondition(AoD5e466ElementExample aoD5e466ElementQueryCondition) {
		AoD5e466ElementMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466ElementMapper.class);
		return mapperImpl.deleteByExample(aoD5e466ElementQueryCondition);
	}
	
	/**
	 * <param name="aoD5e466Element">从数据库中查询一个对象AoD5e466Element</param>
	 * <param name="AId"></param>
	 */
	protected AoD5e466Element aoD5e466ElementSelectByPrimaryKey(int AId) {
		AoD5e466ElementMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466ElementMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="aoD5e466ElementQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<AoD5e466Element> aoD5e466ElementSelectObjects(AoD5e466ElementExample aoD5e466ElementQueryCondition) {
		AoD5e466ElementMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466ElementMapper.class);
		return mapperImpl.selectByExample(aoD5e466ElementQueryCondition);
	}
	
	/**
	 * <param name="aoD5e466ElementQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int aoD5e466ElementQuerySelectObjectsCount(AoD5e466ElementExample aoD5e466ElementQueryCondition) {
		AoD5e466ElementMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466ElementMapper.class);
		return mapperImpl.countByExample(aoD5e466ElementQueryCondition);
	}
	
	/**
	 * 插入一个对象AoD5e466FestiveDay到数据库中
	 * <param name="AoD5e466FestiveDay">需要插入的AoD5e466FestiveDay</param>
	 */
	protected int aoD5e466FestiveDayInsert(AoD5e466FestiveDay aoD5e466FestiveDay) {
		AoD5e466FestiveDayMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466FestiveDayMapper.class);
		return mapperImpl.insertSelective(aoD5e466FestiveDay);
	}
	
	/**
	 * 更新一个对象AoD5e466FestiveDay到数据库中
	 * <param name="aoD5e466FestiveDay">需要更新的AoD5e466FestiveDay</param>
	 */
	protected int aoD5e466FestiveDayUpdate(AoD5e466FestiveDay aoD5e466FestiveDay) {
		AoD5e466FestiveDayMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466FestiveDayMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(aoD5e466FestiveDay);
		return ret;
	}
	
	/**
	 * 更新一个对象AoD5e466FestiveDay到数据库中
	 * <param name="aoD5e466FestiveDay">需要更新的AoD5e466FestiveDay</param>
	 */
	protected int aoD5e466FestiveDayUpdateSelective(AoD5e466FestiveDay aoD5e466FestiveDay) {
		AoD5e466FestiveDayMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466FestiveDayMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(aoD5e466FestiveDay);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象AoD5e466FestiveDay到数据库中
	 * <param name="aoD5e466FestiveDay">需要更新的AoD5e466FestiveDay</param>
	 * <param name="aoD5e466FestiveDayQueryCondition">附加的条件</param>
	 */
	protected int aoD5e466FestiveDayUpdateByCondition(AoD5e466FestiveDay aoD5e466FestiveDay, AoD5e466FestiveDayExample aoD5e466FestiveDayQueryCondition) {
		AoD5e466FestiveDayMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466FestiveDayMapper.class);
		int ret = mapperImpl.updateByExample(aoD5e466FestiveDay, aoD5e466FestiveDayQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息AoD5e466FestiveDay到数据库中
	 * <param name="aoD5e466FestiveDay">需要更新的AoD5e466FestiveDay</param>
	 * <param name="aoD5e466FestiveDayQueryCondition">附加的条件</param>
	 */
	protected int aoD5e466FestiveDayUpdateSelectiveByCondition(AoD5e466FestiveDay aoD5e466FestiveDay, AoD5e466FestiveDayExample aoD5e466FestiveDayQueryCondition) {
		AoD5e466FestiveDayMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466FestiveDayMapper.class);
		int ret = mapperImpl.updateByExampleSelective(aoD5e466FestiveDay, aoD5e466FestiveDayQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="aoD5e466FestiveDay">从数据库中删除一个对象AoD5e466FestiveDay</param>
	 * <param name="AId"></param>
	 */
	protected int aoD5e466FestiveDayDeleteByPrimaryKey(int AId) {
		AoD5e466FestiveDayMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466FestiveDayMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="aoD5e466FestiveDay">从数据库中删除一个对象AoD5e466FestiveDay</param>
	 */
	protected int aoD5e466FestiveDayDeleteByCondition(AoD5e466FestiveDayExample aoD5e466FestiveDayQueryCondition) {
		AoD5e466FestiveDayMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466FestiveDayMapper.class);
		return mapperImpl.deleteByExample(aoD5e466FestiveDayQueryCondition);
	}
	
	/**
	 * <param name="aoD5e466FestiveDay">从数据库中查询一个对象AoD5e466FestiveDay</param>
	 * <param name="AId"></param>
	 */
	protected AoD5e466FestiveDay aoD5e466FestiveDaySelectByPrimaryKey(int AId) {
		AoD5e466FestiveDayMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466FestiveDayMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="aoD5e466FestiveDayQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<AoD5e466FestiveDay> aoD5e466FestiveDaySelectObjects(AoD5e466FestiveDayExample aoD5e466FestiveDayQueryCondition) {
		AoD5e466FestiveDayMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466FestiveDayMapper.class);
		return mapperImpl.selectByExample(aoD5e466FestiveDayQueryCondition);
	}
	
	/**
	 * <param name="aoD5e466FestiveDayQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int aoD5e466FestiveDayQuerySelectObjectsCount(AoD5e466FestiveDayExample aoD5e466FestiveDayQueryCondition) {
		AoD5e466FestiveDayMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466FestiveDayMapper.class);
		return mapperImpl.countByExample(aoD5e466FestiveDayQueryCondition);
	}
	
	/**
	 * 插入一个对象AoD5e466FestiveYear到数据库中
	 * <param name="AoD5e466FestiveYear">需要插入的AoD5e466FestiveYear</param>
	 */
	protected int aoD5e466FestiveYearInsert(AoD5e466FestiveYear aoD5e466FestiveYear) {
		AoD5e466FestiveYearMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466FestiveYearMapper.class);
		return mapperImpl.insertSelective(aoD5e466FestiveYear);
	}
	
	/**
	 * 更新一个对象AoD5e466FestiveYear到数据库中
	 * <param name="aoD5e466FestiveYear">需要更新的AoD5e466FestiveYear</param>
	 */
	protected int aoD5e466FestiveYearUpdate(AoD5e466FestiveYear aoD5e466FestiveYear) {
		AoD5e466FestiveYearMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466FestiveYearMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(aoD5e466FestiveYear);
		return ret;
	}
	
	/**
	 * 更新一个对象AoD5e466FestiveYear到数据库中
	 * <param name="aoD5e466FestiveYear">需要更新的AoD5e466FestiveYear</param>
	 */
	protected int aoD5e466FestiveYearUpdateSelective(AoD5e466FestiveYear aoD5e466FestiveYear) {
		AoD5e466FestiveYearMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466FestiveYearMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(aoD5e466FestiveYear);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象AoD5e466FestiveYear到数据库中
	 * <param name="aoD5e466FestiveYear">需要更新的AoD5e466FestiveYear</param>
	 * <param name="aoD5e466FestiveYearQueryCondition">附加的条件</param>
	 */
	protected int aoD5e466FestiveYearUpdateByCondition(AoD5e466FestiveYear aoD5e466FestiveYear, AoD5e466FestiveYearExample aoD5e466FestiveYearQueryCondition) {
		AoD5e466FestiveYearMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466FestiveYearMapper.class);
		int ret = mapperImpl.updateByExample(aoD5e466FestiveYear, aoD5e466FestiveYearQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息AoD5e466FestiveYear到数据库中
	 * <param name="aoD5e466FestiveYear">需要更新的AoD5e466FestiveYear</param>
	 * <param name="aoD5e466FestiveYearQueryCondition">附加的条件</param>
	 */
	protected int aoD5e466FestiveYearUpdateSelectiveByCondition(AoD5e466FestiveYear aoD5e466FestiveYear, AoD5e466FestiveYearExample aoD5e466FestiveYearQueryCondition) {
		AoD5e466FestiveYearMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466FestiveYearMapper.class);
		int ret = mapperImpl.updateByExampleSelective(aoD5e466FestiveYear, aoD5e466FestiveYearQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="aoD5e466FestiveYear">从数据库中删除一个对象AoD5e466FestiveYear</param>
	 * <param name="AId"></param>
	 */
	protected int aoD5e466FestiveYearDeleteByPrimaryKey(int AId) {
		AoD5e466FestiveYearMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466FestiveYearMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="aoD5e466FestiveYear">从数据库中删除一个对象AoD5e466FestiveYear</param>
	 */
	protected int aoD5e466FestiveYearDeleteByCondition(AoD5e466FestiveYearExample aoD5e466FestiveYearQueryCondition) {
		AoD5e466FestiveYearMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466FestiveYearMapper.class);
		return mapperImpl.deleteByExample(aoD5e466FestiveYearQueryCondition);
	}
	
	/**
	 * <param name="aoD5e466FestiveYear">从数据库中查询一个对象AoD5e466FestiveYear</param>
	 * <param name="AId"></param>
	 */
	protected AoD5e466FestiveYear aoD5e466FestiveYearSelectByPrimaryKey(int AId) {
		AoD5e466FestiveYearMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466FestiveYearMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="aoD5e466FestiveYearQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<AoD5e466FestiveYear> aoD5e466FestiveYearSelectObjects(AoD5e466FestiveYearExample aoD5e466FestiveYearQueryCondition) {
		AoD5e466FestiveYearMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466FestiveYearMapper.class);
		return mapperImpl.selectByExample(aoD5e466FestiveYearQueryCondition);
	}
	
	/**
	 * <param name="aoD5e466FestiveYearQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int aoD5e466FestiveYearQuerySelectObjectsCount(AoD5e466FestiveYearExample aoD5e466FestiveYearQueryCondition) {
		AoD5e466FestiveYearMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466FestiveYearMapper.class);
		return mapperImpl.countByExample(aoD5e466FestiveYearQueryCondition);
	}
	
	/**
	 * 插入一个对象AoD5e466Holiday到数据库中
	 * <param name="AoD5e466Holiday">需要插入的AoD5e466Holiday</param>
	 */
	protected int aoD5e466HolidayInsert(AoD5e466Holiday aoD5e466Holiday) {
		AoD5e466HolidayMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466HolidayMapper.class);
		return mapperImpl.insertSelective(aoD5e466Holiday);
	}
	
	/**
	 * 更新一个对象AoD5e466Holiday到数据库中
	 * <param name="aoD5e466Holiday">需要更新的AoD5e466Holiday</param>
	 */
	protected int aoD5e466HolidayUpdate(AoD5e466Holiday aoD5e466Holiday) {
		AoD5e466HolidayMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466HolidayMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(aoD5e466Holiday);
		return ret;
	}
	
	/**
	 * 更新一个对象AoD5e466Holiday到数据库中
	 * <param name="aoD5e466Holiday">需要更新的AoD5e466Holiday</param>
	 */
	protected int aoD5e466HolidayUpdateSelective(AoD5e466Holiday aoD5e466Holiday) {
		AoD5e466HolidayMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466HolidayMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(aoD5e466Holiday);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象AoD5e466Holiday到数据库中
	 * <param name="aoD5e466Holiday">需要更新的AoD5e466Holiday</param>
	 * <param name="aoD5e466HolidayQueryCondition">附加的条件</param>
	 */
	protected int aoD5e466HolidayUpdateByCondition(AoD5e466Holiday aoD5e466Holiday, AoD5e466HolidayExample aoD5e466HolidayQueryCondition) {
		AoD5e466HolidayMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466HolidayMapper.class);
		int ret = mapperImpl.updateByExample(aoD5e466Holiday, aoD5e466HolidayQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息AoD5e466Holiday到数据库中
	 * <param name="aoD5e466Holiday">需要更新的AoD5e466Holiday</param>
	 * <param name="aoD5e466HolidayQueryCondition">附加的条件</param>
	 */
	protected int aoD5e466HolidayUpdateSelectiveByCondition(AoD5e466Holiday aoD5e466Holiday, AoD5e466HolidayExample aoD5e466HolidayQueryCondition) {
		AoD5e466HolidayMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466HolidayMapper.class);
		int ret = mapperImpl.updateByExampleSelective(aoD5e466Holiday, aoD5e466HolidayQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="aoD5e466Holiday">从数据库中删除一个对象AoD5e466Holiday</param>
	 * <param name="AId"></param>
	 */
	protected int aoD5e466HolidayDeleteByPrimaryKey(int AId) {
		AoD5e466HolidayMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466HolidayMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="aoD5e466Holiday">从数据库中删除一个对象AoD5e466Holiday</param>
	 */
	protected int aoD5e466HolidayDeleteByCondition(AoD5e466HolidayExample aoD5e466HolidayQueryCondition) {
		AoD5e466HolidayMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466HolidayMapper.class);
		return mapperImpl.deleteByExample(aoD5e466HolidayQueryCondition);
	}
	
	/**
	 * <param name="aoD5e466Holiday">从数据库中查询一个对象AoD5e466Holiday</param>
	 * <param name="AId"></param>
	 */
	protected AoD5e466Holiday aoD5e466HolidaySelectByPrimaryKey(int AId) {
		AoD5e466HolidayMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466HolidayMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="aoD5e466HolidayQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<AoD5e466Holiday> aoD5e466HolidaySelectObjects(AoD5e466HolidayExample aoD5e466HolidayQueryCondition) {
		AoD5e466HolidayMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466HolidayMapper.class);
		return mapperImpl.selectByExample(aoD5e466HolidayQueryCondition);
	}
	
	/**
	 * <param name="aoD5e466HolidayQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int aoD5e466HolidayQuerySelectObjectsCount(AoD5e466HolidayExample aoD5e466HolidayQueryCondition) {
		AoD5e466HolidayMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466HolidayMapper.class);
		return mapperImpl.countByExample(aoD5e466HolidayQueryCondition);
	}
	
	/**
	 * 插入一个对象AoD5e466Period到数据库中
	 * <param name="AoD5e466Period">需要插入的AoD5e466Period</param>
	 */
	protected int aoD5e466PeriodInsert(AoD5e466Period aoD5e466Period) {
		AoD5e466PeriodMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466PeriodMapper.class);
		return mapperImpl.insertSelective(aoD5e466Period);
	}
	
	/**
	 * 更新一个对象AoD5e466Period到数据库中
	 * <param name="aoD5e466Period">需要更新的AoD5e466Period</param>
	 */
	protected int aoD5e466PeriodUpdate(AoD5e466Period aoD5e466Period) {
		AoD5e466PeriodMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466PeriodMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(aoD5e466Period);
		return ret;
	}
	
	/**
	 * 更新一个对象AoD5e466Period到数据库中
	 * <param name="aoD5e466Period">需要更新的AoD5e466Period</param>
	 */
	protected int aoD5e466PeriodUpdateSelective(AoD5e466Period aoD5e466Period) {
		AoD5e466PeriodMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466PeriodMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(aoD5e466Period);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象AoD5e466Period到数据库中
	 * <param name="aoD5e466Period">需要更新的AoD5e466Period</param>
	 * <param name="aoD5e466PeriodQueryCondition">附加的条件</param>
	 */
	protected int aoD5e466PeriodUpdateByCondition(AoD5e466Period aoD5e466Period, AoD5e466PeriodExample aoD5e466PeriodQueryCondition) {
		AoD5e466PeriodMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466PeriodMapper.class);
		int ret = mapperImpl.updateByExample(aoD5e466Period, aoD5e466PeriodQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息AoD5e466Period到数据库中
	 * <param name="aoD5e466Period">需要更新的AoD5e466Period</param>
	 * <param name="aoD5e466PeriodQueryCondition">附加的条件</param>
	 */
	protected int aoD5e466PeriodUpdateSelectiveByCondition(AoD5e466Period aoD5e466Period, AoD5e466PeriodExample aoD5e466PeriodQueryCondition) {
		AoD5e466PeriodMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466PeriodMapper.class);
		int ret = mapperImpl.updateByExampleSelective(aoD5e466Period, aoD5e466PeriodQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="aoD5e466Period">从数据库中删除一个对象AoD5e466Period</param>
	 * <param name="AId"></param>
	 */
	protected int aoD5e466PeriodDeleteByPrimaryKey(int AId) {
		AoD5e466PeriodMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466PeriodMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="aoD5e466Period">从数据库中删除一个对象AoD5e466Period</param>
	 */
	protected int aoD5e466PeriodDeleteByCondition(AoD5e466PeriodExample aoD5e466PeriodQueryCondition) {
		AoD5e466PeriodMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466PeriodMapper.class);
		return mapperImpl.deleteByExample(aoD5e466PeriodQueryCondition);
	}
	
	/**
	 * <param name="aoD5e466Period">从数据库中查询一个对象AoD5e466Period</param>
	 * <param name="AId"></param>
	 */
	protected AoD5e466Period aoD5e466PeriodSelectByPrimaryKey(int AId) {
		AoD5e466PeriodMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466PeriodMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="aoD5e466PeriodQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<AoD5e466Period> aoD5e466PeriodSelectObjects(AoD5e466PeriodExample aoD5e466PeriodQueryCondition) {
		AoD5e466PeriodMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466PeriodMapper.class);
		return mapperImpl.selectByExample(aoD5e466PeriodQueryCondition);
	}
	
	/**
	 * <param name="aoD5e466PeriodQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int aoD5e466PeriodQuerySelectObjectsCount(AoD5e466PeriodExample aoD5e466PeriodQueryCondition) {
		AoD5e466PeriodMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466PeriodMapper.class);
		return mapperImpl.countByExample(aoD5e466PeriodQueryCondition);
	}
	
	/**
	 * 插入一个对象AoD5e466WorkingDay到数据库中
	 * <param name="AoD5e466WorkingDay">需要插入的AoD5e466WorkingDay</param>
	 */
	protected int aoD5e466WorkingDayInsert(AoD5e466WorkingDay aoD5e466WorkingDay) {
		AoD5e466WorkingDayMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466WorkingDayMapper.class);
		return mapperImpl.insertSelective(aoD5e466WorkingDay);
	}
	
	/**
	 * 更新一个对象AoD5e466WorkingDay到数据库中
	 * <param name="aoD5e466WorkingDay">需要更新的AoD5e466WorkingDay</param>
	 */
	protected int aoD5e466WorkingDayUpdate(AoD5e466WorkingDay aoD5e466WorkingDay) {
		AoD5e466WorkingDayMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466WorkingDayMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(aoD5e466WorkingDay);
		return ret;
	}
	
	/**
	 * 更新一个对象AoD5e466WorkingDay到数据库中
	 * <param name="aoD5e466WorkingDay">需要更新的AoD5e466WorkingDay</param>
	 */
	protected int aoD5e466WorkingDayUpdateSelective(AoD5e466WorkingDay aoD5e466WorkingDay) {
		AoD5e466WorkingDayMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466WorkingDayMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(aoD5e466WorkingDay);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象AoD5e466WorkingDay到数据库中
	 * <param name="aoD5e466WorkingDay">需要更新的AoD5e466WorkingDay</param>
	 * <param name="aoD5e466WorkingDayQueryCondition">附加的条件</param>
	 */
	protected int aoD5e466WorkingDayUpdateByCondition(AoD5e466WorkingDay aoD5e466WorkingDay, AoD5e466WorkingDayExample aoD5e466WorkingDayQueryCondition) {
		AoD5e466WorkingDayMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466WorkingDayMapper.class);
		int ret = mapperImpl.updateByExample(aoD5e466WorkingDay, aoD5e466WorkingDayQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息AoD5e466WorkingDay到数据库中
	 * <param name="aoD5e466WorkingDay">需要更新的AoD5e466WorkingDay</param>
	 * <param name="aoD5e466WorkingDayQueryCondition">附加的条件</param>
	 */
	protected int aoD5e466WorkingDayUpdateSelectiveByCondition(AoD5e466WorkingDay aoD5e466WorkingDay, AoD5e466WorkingDayExample aoD5e466WorkingDayQueryCondition) {
		AoD5e466WorkingDayMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466WorkingDayMapper.class);
		int ret = mapperImpl.updateByExampleSelective(aoD5e466WorkingDay, aoD5e466WorkingDayQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="aoD5e466WorkingDay">从数据库中删除一个对象AoD5e466WorkingDay</param>
	 * <param name="AId"></param>
	 */
	protected int aoD5e466WorkingDayDeleteByPrimaryKey(int AId) {
		AoD5e466WorkingDayMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466WorkingDayMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="aoD5e466WorkingDay">从数据库中删除一个对象AoD5e466WorkingDay</param>
	 */
	protected int aoD5e466WorkingDayDeleteByCondition(AoD5e466WorkingDayExample aoD5e466WorkingDayQueryCondition) {
		AoD5e466WorkingDayMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466WorkingDayMapper.class);
		return mapperImpl.deleteByExample(aoD5e466WorkingDayQueryCondition);
	}
	
	/**
	 * <param name="aoD5e466WorkingDay">从数据库中查询一个对象AoD5e466WorkingDay</param>
	 * <param name="AId"></param>
	 */
	protected AoD5e466WorkingDay aoD5e466WorkingDaySelectByPrimaryKey(int AId) {
		AoD5e466WorkingDayMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466WorkingDayMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="aoD5e466WorkingDayQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<AoD5e466WorkingDay> aoD5e466WorkingDaySelectObjects(AoD5e466WorkingDayExample aoD5e466WorkingDayQueryCondition) {
		AoD5e466WorkingDayMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466WorkingDayMapper.class);
		return mapperImpl.selectByExample(aoD5e466WorkingDayQueryCondition);
	}
	
	/**
	 * <param name="aoD5e466WorkingDayQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int aoD5e466WorkingDayQuerySelectObjectsCount(AoD5e466WorkingDayExample aoD5e466WorkingDayQueryCondition) {
		AoD5e466WorkingDayMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466WorkingDayMapper.class);
		return mapperImpl.countByExample(aoD5e466WorkingDayQueryCondition);
	}
	
	/**
	 * 插入一个对象AoD5e466WorkingDayPeriod到数据库中
	 * <param name="AoD5e466WorkingDayPeriod">需要插入的AoD5e466WorkingDayPeriod</param>
	 */
	protected int aoD5e466WorkingDayPeriodInsert(AoD5e466WorkingDayPeriod aoD5e466WorkingDayPeriod) {
		AoD5e466WorkingDayPeriodMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466WorkingDayPeriodMapper.class);
		return mapperImpl.insertSelective(aoD5e466WorkingDayPeriod);
	}
	
	/**
	 * 更新一个对象AoD5e466WorkingDayPeriod到数据库中
	 * <param name="aoD5e466WorkingDayPeriod">需要更新的AoD5e466WorkingDayPeriod</param>
	 */
	protected int aoD5e466WorkingDayPeriodUpdate(AoD5e466WorkingDayPeriod aoD5e466WorkingDayPeriod) {
		AoD5e466WorkingDayPeriodMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466WorkingDayPeriodMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(aoD5e466WorkingDayPeriod);
		return ret;
	}
	
	/**
	 * 更新一个对象AoD5e466WorkingDayPeriod到数据库中
	 * <param name="aoD5e466WorkingDayPeriod">需要更新的AoD5e466WorkingDayPeriod</param>
	 */
	protected int aoD5e466WorkingDayPeriodUpdateSelective(AoD5e466WorkingDayPeriod aoD5e466WorkingDayPeriod) {
		AoD5e466WorkingDayPeriodMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466WorkingDayPeriodMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(aoD5e466WorkingDayPeriod);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象AoD5e466WorkingDayPeriod到数据库中
	 * <param name="aoD5e466WorkingDayPeriod">需要更新的AoD5e466WorkingDayPeriod</param>
	 * <param name="aoD5e466WorkingDayPeriodQueryCondition">附加的条件</param>
	 */
	protected int aoD5e466WorkingDayPeriodUpdateByCondition(AoD5e466WorkingDayPeriod aoD5e466WorkingDayPeriod, AoD5e466WorkingDayPeriodExample aoD5e466WorkingDayPeriodQueryCondition) {
		AoD5e466WorkingDayPeriodMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466WorkingDayPeriodMapper.class);
		int ret = mapperImpl.updateByExample(aoD5e466WorkingDayPeriod, aoD5e466WorkingDayPeriodQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息AoD5e466WorkingDayPeriod到数据库中
	 * <param name="aoD5e466WorkingDayPeriod">需要更新的AoD5e466WorkingDayPeriod</param>
	 * <param name="aoD5e466WorkingDayPeriodQueryCondition">附加的条件</param>
	 */
	protected int aoD5e466WorkingDayPeriodUpdateSelectiveByCondition(AoD5e466WorkingDayPeriod aoD5e466WorkingDayPeriod, AoD5e466WorkingDayPeriodExample aoD5e466WorkingDayPeriodQueryCondition) {
		AoD5e466WorkingDayPeriodMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466WorkingDayPeriodMapper.class);
		int ret = mapperImpl.updateByExampleSelective(aoD5e466WorkingDayPeriod, aoD5e466WorkingDayPeriodQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="aoD5e466WorkingDayPeriod">从数据库中删除一个对象AoD5e466WorkingDayPeriod</param>
	 * <param name="AId"></param>
	 */
	protected int aoD5e466WorkingDayPeriodDeleteByPrimaryKey(int AId) {
		AoD5e466WorkingDayPeriodMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466WorkingDayPeriodMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="aoD5e466WorkingDayPeriod">从数据库中删除一个对象AoD5e466WorkingDayPeriod</param>
	 */
	protected int aoD5e466WorkingDayPeriodDeleteByCondition(AoD5e466WorkingDayPeriodExample aoD5e466WorkingDayPeriodQueryCondition) {
		AoD5e466WorkingDayPeriodMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466WorkingDayPeriodMapper.class);
		return mapperImpl.deleteByExample(aoD5e466WorkingDayPeriodQueryCondition);
	}
	
	/**
	 * <param name="aoD5e466WorkingDayPeriod">从数据库中查询一个对象AoD5e466WorkingDayPeriod</param>
	 * <param name="AId"></param>
	 */
	protected AoD5e466WorkingDayPeriod aoD5e466WorkingDayPeriodSelectByPrimaryKey(int AId) {
		AoD5e466WorkingDayPeriodMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466WorkingDayPeriodMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="aoD5e466WorkingDayPeriodQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<AoD5e466WorkingDayPeriod> aoD5e466WorkingDayPeriodSelectObjects(AoD5e466WorkingDayPeriodExample aoD5e466WorkingDayPeriodQueryCondition) {
		AoD5e466WorkingDayPeriodMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466WorkingDayPeriodMapper.class);
		return mapperImpl.selectByExample(aoD5e466WorkingDayPeriodQueryCondition);
	}
	
	/**
	 * <param name="aoD5e466WorkingDayPeriodQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int aoD5e466WorkingDayPeriodQuerySelectObjectsCount(AoD5e466WorkingDayPeriodExample aoD5e466WorkingDayPeriodQueryCondition) {
		AoD5e466WorkingDayPeriodMapper mapperImpl = this.getSqlSession().getMapper(AoD5e466WorkingDayPeriodMapper.class);
		return mapperImpl.countByExample(aoD5e466WorkingDayPeriodQueryCondition);
	}
	
	/**
	 * 插入一个对象AoDc78d7HudsonAssociation到数据库中
	 * <param name="AoDc78d7HudsonAssociation">需要插入的AoDc78d7HudsonAssociation</param>
	 */
	protected int aoDc78d7HudsonAssociationInsert(AoDc78d7HudsonAssociation aoDc78d7HudsonAssociation) {
		AoDc78d7HudsonAssociationMapper mapperImpl = this.getSqlSession().getMapper(AoDc78d7HudsonAssociationMapper.class);
		return mapperImpl.insertSelective(aoDc78d7HudsonAssociation);
	}
	
	/**
	 * 更新一个对象AoDc78d7HudsonAssociation到数据库中
	 * <param name="aoDc78d7HudsonAssociation">需要更新的AoDc78d7HudsonAssociation</param>
	 */
	protected int aoDc78d7HudsonAssociationUpdate(AoDc78d7HudsonAssociation aoDc78d7HudsonAssociation) {
		AoDc78d7HudsonAssociationMapper mapperImpl = this.getSqlSession().getMapper(AoDc78d7HudsonAssociationMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(aoDc78d7HudsonAssociation);
		return ret;
	}
	
	/**
	 * 更新一个对象AoDc78d7HudsonAssociation到数据库中
	 * <param name="aoDc78d7HudsonAssociation">需要更新的AoDc78d7HudsonAssociation</param>
	 */
	protected int aoDc78d7HudsonAssociationUpdateSelective(AoDc78d7HudsonAssociation aoDc78d7HudsonAssociation) {
		AoDc78d7HudsonAssociationMapper mapperImpl = this.getSqlSession().getMapper(AoDc78d7HudsonAssociationMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(aoDc78d7HudsonAssociation);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象AoDc78d7HudsonAssociation到数据库中
	 * <param name="aoDc78d7HudsonAssociation">需要更新的AoDc78d7HudsonAssociation</param>
	 * <param name="aoDc78d7HudsonAssociationQueryCondition">附加的条件</param>
	 */
	protected int aoDc78d7HudsonAssociationUpdateByCondition(AoDc78d7HudsonAssociation aoDc78d7HudsonAssociation, AoDc78d7HudsonAssociationExample aoDc78d7HudsonAssociationQueryCondition) {
		AoDc78d7HudsonAssociationMapper mapperImpl = this.getSqlSession().getMapper(AoDc78d7HudsonAssociationMapper.class);
		int ret = mapperImpl.updateByExample(aoDc78d7HudsonAssociation, aoDc78d7HudsonAssociationQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息AoDc78d7HudsonAssociation到数据库中
	 * <param name="aoDc78d7HudsonAssociation">需要更新的AoDc78d7HudsonAssociation</param>
	 * <param name="aoDc78d7HudsonAssociationQueryCondition">附加的条件</param>
	 */
	protected int aoDc78d7HudsonAssociationUpdateSelectiveByCondition(AoDc78d7HudsonAssociation aoDc78d7HudsonAssociation, AoDc78d7HudsonAssociationExample aoDc78d7HudsonAssociationQueryCondition) {
		AoDc78d7HudsonAssociationMapper mapperImpl = this.getSqlSession().getMapper(AoDc78d7HudsonAssociationMapper.class);
		int ret = mapperImpl.updateByExampleSelective(aoDc78d7HudsonAssociation, aoDc78d7HudsonAssociationQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="aoDc78d7HudsonAssociation">从数据库中删除一个对象AoDc78d7HudsonAssociation</param>
	 * <param name="AId"></param>
	 */
	protected int aoDc78d7HudsonAssociationDeleteByPrimaryKey(int AId) {
		AoDc78d7HudsonAssociationMapper mapperImpl = this.getSqlSession().getMapper(AoDc78d7HudsonAssociationMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="aoDc78d7HudsonAssociation">从数据库中删除一个对象AoDc78d7HudsonAssociation</param>
	 */
	protected int aoDc78d7HudsonAssociationDeleteByCondition(AoDc78d7HudsonAssociationExample aoDc78d7HudsonAssociationQueryCondition) {
		AoDc78d7HudsonAssociationMapper mapperImpl = this.getSqlSession().getMapper(AoDc78d7HudsonAssociationMapper.class);
		return mapperImpl.deleteByExample(aoDc78d7HudsonAssociationQueryCondition);
	}
	
	/**
	 * <param name="aoDc78d7HudsonAssociation">从数据库中查询一个对象AoDc78d7HudsonAssociation</param>
	 * <param name="AId"></param>
	 */
	protected AoDc78d7HudsonAssociation aoDc78d7HudsonAssociationSelectByPrimaryKey(int AId) {
		AoDc78d7HudsonAssociationMapper mapperImpl = this.getSqlSession().getMapper(AoDc78d7HudsonAssociationMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="aoDc78d7HudsonAssociationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<AoDc78d7HudsonAssociation> aoDc78d7HudsonAssociationSelectObjects(AoDc78d7HudsonAssociationExample aoDc78d7HudsonAssociationQueryCondition) {
		AoDc78d7HudsonAssociationMapper mapperImpl = this.getSqlSession().getMapper(AoDc78d7HudsonAssociationMapper.class);
		return mapperImpl.selectByExample(aoDc78d7HudsonAssociationQueryCondition);
	}
	
	/**
	 * <param name="aoDc78d7HudsonAssociationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int aoDc78d7HudsonAssociationQuerySelectObjectsCount(AoDc78d7HudsonAssociationExample aoDc78d7HudsonAssociationQueryCondition) {
		AoDc78d7HudsonAssociationMapper mapperImpl = this.getSqlSession().getMapper(AoDc78d7HudsonAssociationMapper.class);
		return mapperImpl.countByExample(aoDc78d7HudsonAssociationQueryCondition);
	}
	
	/**
	 * 插入一个对象AoDc78d7HudsonServer到数据库中
	 * <param name="AoDc78d7HudsonServer">需要插入的AoDc78d7HudsonServer</param>
	 */
	protected int aoDc78d7HudsonServerInsert(AoDc78d7HudsonServer aoDc78d7HudsonServer) {
		AoDc78d7HudsonServerMapper mapperImpl = this.getSqlSession().getMapper(AoDc78d7HudsonServerMapper.class);
		return mapperImpl.insertSelective(aoDc78d7HudsonServer);
	}
	
	/**
	 * 更新一个对象AoDc78d7HudsonServer到数据库中
	 * <param name="aoDc78d7HudsonServer">需要更新的AoDc78d7HudsonServer</param>
	 */
	protected int aoDc78d7HudsonServerUpdate(AoDc78d7HudsonServer aoDc78d7HudsonServer) {
		AoDc78d7HudsonServerMapper mapperImpl = this.getSqlSession().getMapper(AoDc78d7HudsonServerMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(aoDc78d7HudsonServer);
		return ret;
	}
	
	/**
	 * 更新一个对象AoDc78d7HudsonServer到数据库中
	 * <param name="aoDc78d7HudsonServer">需要更新的AoDc78d7HudsonServer</param>
	 */
	protected int aoDc78d7HudsonServerUpdateSelective(AoDc78d7HudsonServer aoDc78d7HudsonServer) {
		AoDc78d7HudsonServerMapper mapperImpl = this.getSqlSession().getMapper(AoDc78d7HudsonServerMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(aoDc78d7HudsonServer);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象AoDc78d7HudsonServer到数据库中
	 * <param name="aoDc78d7HudsonServer">需要更新的AoDc78d7HudsonServer</param>
	 * <param name="aoDc78d7HudsonServerQueryCondition">附加的条件</param>
	 */
	protected int aoDc78d7HudsonServerUpdateByCondition(AoDc78d7HudsonServer aoDc78d7HudsonServer, AoDc78d7HudsonServerExample aoDc78d7HudsonServerQueryCondition) {
		AoDc78d7HudsonServerMapper mapperImpl = this.getSqlSession().getMapper(AoDc78d7HudsonServerMapper.class);
		int ret = mapperImpl.updateByExample(aoDc78d7HudsonServer, aoDc78d7HudsonServerQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息AoDc78d7HudsonServer到数据库中
	 * <param name="aoDc78d7HudsonServer">需要更新的AoDc78d7HudsonServer</param>
	 * <param name="aoDc78d7HudsonServerQueryCondition">附加的条件</param>
	 */
	protected int aoDc78d7HudsonServerUpdateSelectiveByCondition(AoDc78d7HudsonServer aoDc78d7HudsonServer, AoDc78d7HudsonServerExample aoDc78d7HudsonServerQueryCondition) {
		AoDc78d7HudsonServerMapper mapperImpl = this.getSqlSession().getMapper(AoDc78d7HudsonServerMapper.class);
		int ret = mapperImpl.updateByExampleSelective(aoDc78d7HudsonServer, aoDc78d7HudsonServerQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="aoDc78d7HudsonServer">从数据库中删除一个对象AoDc78d7HudsonServer</param>
	 * <param name="AId"></param>
	 */
	protected int aoDc78d7HudsonServerDeleteByPrimaryKey(int AId) {
		AoDc78d7HudsonServerMapper mapperImpl = this.getSqlSession().getMapper(AoDc78d7HudsonServerMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="aoDc78d7HudsonServer">从数据库中删除一个对象AoDc78d7HudsonServer</param>
	 */
	protected int aoDc78d7HudsonServerDeleteByCondition(AoDc78d7HudsonServerExample aoDc78d7HudsonServerQueryCondition) {
		AoDc78d7HudsonServerMapper mapperImpl = this.getSqlSession().getMapper(AoDc78d7HudsonServerMapper.class);
		return mapperImpl.deleteByExample(aoDc78d7HudsonServerQueryCondition);
	}
	
	/**
	 * <param name="aoDc78d7HudsonServer">从数据库中查询一个对象AoDc78d7HudsonServer</param>
	 * <param name="AId"></param>
	 */
	protected AoDc78d7HudsonServer aoDc78d7HudsonServerSelectByPrimaryKey(int AId) {
		AoDc78d7HudsonServerMapper mapperImpl = this.getSqlSession().getMapper(AoDc78d7HudsonServerMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="aoDc78d7HudsonServerQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<AoDc78d7HudsonServer> aoDc78d7HudsonServerSelectObjects(AoDc78d7HudsonServerExample aoDc78d7HudsonServerQueryCondition) {
		AoDc78d7HudsonServerMapper mapperImpl = this.getSqlSession().getMapper(AoDc78d7HudsonServerMapper.class);
		return mapperImpl.selectByExample(aoDc78d7HudsonServerQueryCondition);
	}
	
	/**
	 * <param name="aoDc78d7HudsonServerQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int aoDc78d7HudsonServerQuerySelectObjectsCount(AoDc78d7HudsonServerExample aoDc78d7HudsonServerQueryCondition) {
		AoDc78d7HudsonServerMapper mapperImpl = this.getSqlSession().getMapper(AoDc78d7HudsonServerMapper.class);
		return mapperImpl.countByExample(aoDc78d7HudsonServerQueryCondition);
	}
	
	/**
	 * 插入一个对象Avatar到数据库中
	 * <param name="Avatar">需要插入的Avatar</param>
	 */
	protected int avatarInsert(Avatar avatar) {
		AvatarMapper mapperImpl = this.getSqlSession().getMapper(AvatarMapper.class);
		return mapperImpl.insertSelective(avatar);
	}
	
	/**
	 * 更新一个对象Avatar到数据库中
	 * <param name="avatar">需要更新的Avatar</param>
	 */
	protected int avatarUpdate(Avatar avatar) {
		AvatarMapper mapperImpl = this.getSqlSession().getMapper(AvatarMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(avatar);
		return ret;
	}
	
	/**
	 * 更新一个对象Avatar到数据库中
	 * <param name="avatar">需要更新的Avatar</param>
	 */
	protected int avatarUpdateSelective(Avatar avatar) {
		AvatarMapper mapperImpl = this.getSqlSession().getMapper(AvatarMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(avatar);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Avatar到数据库中
	 * <param name="avatar">需要更新的Avatar</param>
	 * <param name="avatarQueryCondition">附加的条件</param>
	 */
	protected int avatarUpdateByCondition(Avatar avatar, AvatarExample avatarQueryCondition) {
		AvatarMapper mapperImpl = this.getSqlSession().getMapper(AvatarMapper.class);
		int ret = mapperImpl.updateByExample(avatar, avatarQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Avatar到数据库中
	 * <param name="avatar">需要更新的Avatar</param>
	 * <param name="avatarQueryCondition">附加的条件</param>
	 */
	protected int avatarUpdateSelectiveByCondition(Avatar avatar, AvatarExample avatarQueryCondition) {
		AvatarMapper mapperImpl = this.getSqlSession().getMapper(AvatarMapper.class);
		int ret = mapperImpl.updateByExampleSelective(avatar, avatarQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="avatar">从数据库中删除一个对象Avatar</param>
	 * <param name="AId"></param>
	 */
	protected int avatarDeleteByPrimaryKey(long AId) {
		AvatarMapper mapperImpl = this.getSqlSession().getMapper(AvatarMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="avatar">从数据库中删除一个对象Avatar</param>
	 */
	protected int avatarDeleteByCondition(AvatarExample avatarQueryCondition) {
		AvatarMapper mapperImpl = this.getSqlSession().getMapper(AvatarMapper.class);
		return mapperImpl.deleteByExample(avatarQueryCondition);
	}
	
	/**
	 * <param name="avatar">从数据库中查询一个对象Avatar</param>
	 * <param name="AId"></param>
	 */
	protected Avatar avatarSelectByPrimaryKey(long AId) {
		AvatarMapper mapperImpl = this.getSqlSession().getMapper(AvatarMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="avatarQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Avatar> avatarSelectObjects(AvatarExample avatarQueryCondition) {
		AvatarMapper mapperImpl = this.getSqlSession().getMapper(AvatarMapper.class);
		return mapperImpl.selectByExample(avatarQueryCondition);
	}
	
	/**
	 * <param name="avatarQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int avatarQuerySelectObjectsCount(AvatarExample avatarQueryCondition) {
		AvatarMapper mapperImpl = this.getSqlSession().getMapper(AvatarMapper.class);
		return mapperImpl.countByExample(avatarQueryCondition);
	}
	
	/**
	 * 插入一个对象Changegroup到数据库中
	 * <param name="Changegroup">需要插入的Changegroup</param>
	 */
	protected int changegroupInsert(Changegroup changegroup) {
		ChangegroupMapper mapperImpl = this.getSqlSession().getMapper(ChangegroupMapper.class);
		return mapperImpl.insertSelective(changegroup);
	}
	
	/**
	 * 更新一个对象Changegroup到数据库中
	 * <param name="changegroup">需要更新的Changegroup</param>
	 */
	protected int changegroupUpdate(Changegroup changegroup) {
		ChangegroupMapper mapperImpl = this.getSqlSession().getMapper(ChangegroupMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(changegroup);
		return ret;
	}
	
	/**
	 * 更新一个对象Changegroup到数据库中
	 * <param name="changegroup">需要更新的Changegroup</param>
	 */
	protected int changegroupUpdateSelective(Changegroup changegroup) {
		ChangegroupMapper mapperImpl = this.getSqlSession().getMapper(ChangegroupMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(changegroup);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Changegroup到数据库中
	 * <param name="changegroup">需要更新的Changegroup</param>
	 * <param name="changegroupQueryCondition">附加的条件</param>
	 */
	protected int changegroupUpdateByCondition(Changegroup changegroup, ChangegroupExample changegroupQueryCondition) {
		ChangegroupMapper mapperImpl = this.getSqlSession().getMapper(ChangegroupMapper.class);
		int ret = mapperImpl.updateByExample(changegroup, changegroupQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Changegroup到数据库中
	 * <param name="changegroup">需要更新的Changegroup</param>
	 * <param name="changegroupQueryCondition">附加的条件</param>
	 */
	protected int changegroupUpdateSelectiveByCondition(Changegroup changegroup, ChangegroupExample changegroupQueryCondition) {
		ChangegroupMapper mapperImpl = this.getSqlSession().getMapper(ChangegroupMapper.class);
		int ret = mapperImpl.updateByExampleSelective(changegroup, changegroupQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="changegroup">从数据库中删除一个对象Changegroup</param>
	 * <param name="AId"></param>
	 */
	protected int changegroupDeleteByPrimaryKey(long AId) {
		ChangegroupMapper mapperImpl = this.getSqlSession().getMapper(ChangegroupMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="changegroup">从数据库中删除一个对象Changegroup</param>
	 */
	protected int changegroupDeleteByCondition(ChangegroupExample changegroupQueryCondition) {
		ChangegroupMapper mapperImpl = this.getSqlSession().getMapper(ChangegroupMapper.class);
		return mapperImpl.deleteByExample(changegroupQueryCondition);
	}
	
	/**
	 * <param name="changegroup">从数据库中查询一个对象Changegroup</param>
	 * <param name="AId"></param>
	 */
	protected Changegroup changegroupSelectByPrimaryKey(long AId) {
		ChangegroupMapper mapperImpl = this.getSqlSession().getMapper(ChangegroupMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="changegroupQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Changegroup> changegroupSelectObjects(ChangegroupExample changegroupQueryCondition) {
		ChangegroupMapper mapperImpl = this.getSqlSession().getMapper(ChangegroupMapper.class);
		return mapperImpl.selectByExample(changegroupQueryCondition);
	}
	
	/**
	 * <param name="changegroupQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int changegroupQuerySelectObjectsCount(ChangegroupExample changegroupQueryCondition) {
		ChangegroupMapper mapperImpl = this.getSqlSession().getMapper(ChangegroupMapper.class);
		return mapperImpl.countByExample(changegroupQueryCondition);
	}
	
	/**
	 * 插入一个对象ChangeitemWithBLOBs到数据库中
	 * <param name="ChangeitemWithBLOBs">需要插入的ChangeitemWithBLOBs</param>
	 */
	protected int changeitemInsert(ChangeitemWithBLOBs changeitem) {
		ChangeitemMapper mapperImpl = this.getSqlSession().getMapper(ChangeitemMapper.class);
		return mapperImpl.insertSelective(changeitem);
	}
	
	/**
	 * 更新一个对象Changeitem到数据库中
	 * <param name="changeitem">需要更新的Changeitem</param>
	 */
	protected int changeitemUpdate(Changeitem changeitem) {
		ChangeitemMapper mapperImpl = this.getSqlSession().getMapper(ChangeitemMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(changeitem);
		return ret;
	}
	
	/**
	 * 更新一个对象Changeitem到数据库中
	 * <param name="changeitem">需要更新的Changeitem</param>
	 */
	protected int changeitemUpdateSelective(ChangeitemWithBLOBs changeitem) {
		ChangeitemMapper mapperImpl = this.getSqlSession().getMapper(ChangeitemMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(changeitem);
		return ret;
	}
	
	/**
	 * 更新一个对象ChangeitemWithBLOBs到数据库中
	 * <param name="changeitem">需要更新的Changeitem</param>
	 */
	public int changeitemUpdateWithBlobs(ChangeitemWithBLOBs changeitem) {
		ChangeitemMapper mapperImpl = this.getSqlSession().getMapper(ChangeitemMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(changeitem);
	}
	
	/**
	 * 根据条件更新一批对象Changeitem到数据库中
	 * <param name="changeitem">需要更新的Changeitem</param>
	 * <param name="changeitemQueryCondition">附加的条件</param>
	 */
	protected int changeitemUpdateByCondition(Changeitem changeitem, ChangeitemExample changeitemQueryCondition) {
		ChangeitemMapper mapperImpl = this.getSqlSession().getMapper(ChangeitemMapper.class);
		int ret = mapperImpl.updateByExample(changeitem, changeitemQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Changeitem到数据库中
	 * <param name="changeitem">需要更新的Changeitem</param>
	 * <param name="changeitemQueryCondition">附加的条件</param>
	 */
	protected int changeitemUpdateSelectiveByCondition(ChangeitemWithBLOBs changeitem, ChangeitemExample changeitemQueryCondition) {
		ChangeitemMapper mapperImpl = this.getSqlSession().getMapper(ChangeitemMapper.class);
		int ret = mapperImpl.updateByExampleSelective(changeitem, changeitemQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="changeitem">从数据库中删除一个对象Changeitem</param>
	 * <param name="AId"></param>
	 */
	protected int changeitemDeleteByPrimaryKey(long AId) {
		ChangeitemMapper mapperImpl = this.getSqlSession().getMapper(ChangeitemMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="changeitem">从数据库中删除一个对象Changeitem</param>
	 */
	protected int changeitemDeleteByCondition(ChangeitemExample changeitemQueryCondition) {
		ChangeitemMapper mapperImpl = this.getSqlSession().getMapper(ChangeitemMapper.class);
		return mapperImpl.deleteByExample(changeitemQueryCondition);
	}
	
	/**
	 * <param name="changeitem">从数据库中查询一个对象ChangeitemWithBLOBs</param>
	 * <param name="AId"></param>
	 */
	protected ChangeitemWithBLOBs changeitemSelectByPrimaryKey(long AId) {
		ChangeitemMapper mapperImpl = this.getSqlSession().getMapper(ChangeitemMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="changeitemQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Changeitem> changeitemSelectObjects(ChangeitemExample changeitemQueryCondition) {
		ChangeitemMapper mapperImpl = this.getSqlSession().getMapper(ChangeitemMapper.class);
		return mapperImpl.selectByExample(changeitemQueryCondition);
	}
	
	/**
	 * <param name="changeitemQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<ChangeitemWithBLOBs> changeitemSelectObjectsWithBLOBs(ChangeitemExample changeitemQueryCondition) {
		ChangeitemMapper mapperImpl = this.getSqlSession().getMapper(ChangeitemMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(changeitemQueryCondition);
	}
	
	/**
	 * <param name="changeitemQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int changeitemQuerySelectObjectsCount(ChangeitemExample changeitemQueryCondition) {
		ChangeitemMapper mapperImpl = this.getSqlSession().getMapper(ChangeitemMapper.class);
		return mapperImpl.countByExample(changeitemQueryCondition);
	}
	
	/**
	 * 插入一个对象Columnlayout到数据库中
	 * <param name="Columnlayout">需要插入的Columnlayout</param>
	 */
	protected int columnlayoutInsert(Columnlayout columnlayout) {
		ColumnlayoutMapper mapperImpl = this.getSqlSession().getMapper(ColumnlayoutMapper.class);
		return mapperImpl.insertSelective(columnlayout);
	}
	
	/**
	 * 更新一个对象Columnlayout到数据库中
	 * <param name="columnlayout">需要更新的Columnlayout</param>
	 */
	protected int columnlayoutUpdate(Columnlayout columnlayout) {
		ColumnlayoutMapper mapperImpl = this.getSqlSession().getMapper(ColumnlayoutMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(columnlayout);
		return ret;
	}
	
	/**
	 * 更新一个对象Columnlayout到数据库中
	 * <param name="columnlayout">需要更新的Columnlayout</param>
	 */
	protected int columnlayoutUpdateSelective(Columnlayout columnlayout) {
		ColumnlayoutMapper mapperImpl = this.getSqlSession().getMapper(ColumnlayoutMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(columnlayout);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Columnlayout到数据库中
	 * <param name="columnlayout">需要更新的Columnlayout</param>
	 * <param name="columnlayoutQueryCondition">附加的条件</param>
	 */
	protected int columnlayoutUpdateByCondition(Columnlayout columnlayout, ColumnlayoutExample columnlayoutQueryCondition) {
		ColumnlayoutMapper mapperImpl = this.getSqlSession().getMapper(ColumnlayoutMapper.class);
		int ret = mapperImpl.updateByExample(columnlayout, columnlayoutQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Columnlayout到数据库中
	 * <param name="columnlayout">需要更新的Columnlayout</param>
	 * <param name="columnlayoutQueryCondition">附加的条件</param>
	 */
	protected int columnlayoutUpdateSelectiveByCondition(Columnlayout columnlayout, ColumnlayoutExample columnlayoutQueryCondition) {
		ColumnlayoutMapper mapperImpl = this.getSqlSession().getMapper(ColumnlayoutMapper.class);
		int ret = mapperImpl.updateByExampleSelective(columnlayout, columnlayoutQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="columnlayout">从数据库中删除一个对象Columnlayout</param>
	 * <param name="AId"></param>
	 */
	protected int columnlayoutDeleteByPrimaryKey(long AId) {
		ColumnlayoutMapper mapperImpl = this.getSqlSession().getMapper(ColumnlayoutMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="columnlayout">从数据库中删除一个对象Columnlayout</param>
	 */
	protected int columnlayoutDeleteByCondition(ColumnlayoutExample columnlayoutQueryCondition) {
		ColumnlayoutMapper mapperImpl = this.getSqlSession().getMapper(ColumnlayoutMapper.class);
		return mapperImpl.deleteByExample(columnlayoutQueryCondition);
	}
	
	/**
	 * <param name="columnlayout">从数据库中查询一个对象Columnlayout</param>
	 * <param name="AId"></param>
	 */
	protected Columnlayout columnlayoutSelectByPrimaryKey(long AId) {
		ColumnlayoutMapper mapperImpl = this.getSqlSession().getMapper(ColumnlayoutMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="columnlayoutQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Columnlayout> columnlayoutSelectObjects(ColumnlayoutExample columnlayoutQueryCondition) {
		ColumnlayoutMapper mapperImpl = this.getSqlSession().getMapper(ColumnlayoutMapper.class);
		return mapperImpl.selectByExample(columnlayoutQueryCondition);
	}
	
	/**
	 * <param name="columnlayoutQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int columnlayoutQuerySelectObjectsCount(ColumnlayoutExample columnlayoutQueryCondition) {
		ColumnlayoutMapper mapperImpl = this.getSqlSession().getMapper(ColumnlayoutMapper.class);
		return mapperImpl.countByExample(columnlayoutQueryCondition);
	}
	
	/**
	 * 插入一个对象Columnlayoutitem到数据库中
	 * <param name="Columnlayoutitem">需要插入的Columnlayoutitem</param>
	 */
	protected int columnlayoutitemInsert(Columnlayoutitem columnlayoutitem) {
		ColumnlayoutitemMapper mapperImpl = this.getSqlSession().getMapper(ColumnlayoutitemMapper.class);
		return mapperImpl.insertSelective(columnlayoutitem);
	}
	
	/**
	 * 更新一个对象Columnlayoutitem到数据库中
	 * <param name="columnlayoutitem">需要更新的Columnlayoutitem</param>
	 */
	protected int columnlayoutitemUpdate(Columnlayoutitem columnlayoutitem) {
		ColumnlayoutitemMapper mapperImpl = this.getSqlSession().getMapper(ColumnlayoutitemMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(columnlayoutitem);
		return ret;
	}
	
	/**
	 * 更新一个对象Columnlayoutitem到数据库中
	 * <param name="columnlayoutitem">需要更新的Columnlayoutitem</param>
	 */
	protected int columnlayoutitemUpdateSelective(Columnlayoutitem columnlayoutitem) {
		ColumnlayoutitemMapper mapperImpl = this.getSqlSession().getMapper(ColumnlayoutitemMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(columnlayoutitem);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Columnlayoutitem到数据库中
	 * <param name="columnlayoutitem">需要更新的Columnlayoutitem</param>
	 * <param name="columnlayoutitemQueryCondition">附加的条件</param>
	 */
	protected int columnlayoutitemUpdateByCondition(Columnlayoutitem columnlayoutitem, ColumnlayoutitemExample columnlayoutitemQueryCondition) {
		ColumnlayoutitemMapper mapperImpl = this.getSqlSession().getMapper(ColumnlayoutitemMapper.class);
		int ret = mapperImpl.updateByExample(columnlayoutitem, columnlayoutitemQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Columnlayoutitem到数据库中
	 * <param name="columnlayoutitem">需要更新的Columnlayoutitem</param>
	 * <param name="columnlayoutitemQueryCondition">附加的条件</param>
	 */
	protected int columnlayoutitemUpdateSelectiveByCondition(Columnlayoutitem columnlayoutitem, ColumnlayoutitemExample columnlayoutitemQueryCondition) {
		ColumnlayoutitemMapper mapperImpl = this.getSqlSession().getMapper(ColumnlayoutitemMapper.class);
		int ret = mapperImpl.updateByExampleSelective(columnlayoutitem, columnlayoutitemQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="columnlayoutitem">从数据库中删除一个对象Columnlayoutitem</param>
	 * <param name="AId"></param>
	 */
	protected int columnlayoutitemDeleteByPrimaryKey(long AId) {
		ColumnlayoutitemMapper mapperImpl = this.getSqlSession().getMapper(ColumnlayoutitemMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="columnlayoutitem">从数据库中删除一个对象Columnlayoutitem</param>
	 */
	protected int columnlayoutitemDeleteByCondition(ColumnlayoutitemExample columnlayoutitemQueryCondition) {
		ColumnlayoutitemMapper mapperImpl = this.getSqlSession().getMapper(ColumnlayoutitemMapper.class);
		return mapperImpl.deleteByExample(columnlayoutitemQueryCondition);
	}
	
	/**
	 * <param name="columnlayoutitem">从数据库中查询一个对象Columnlayoutitem</param>
	 * <param name="AId"></param>
	 */
	protected Columnlayoutitem columnlayoutitemSelectByPrimaryKey(long AId) {
		ColumnlayoutitemMapper mapperImpl = this.getSqlSession().getMapper(ColumnlayoutitemMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="columnlayoutitemQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Columnlayoutitem> columnlayoutitemSelectObjects(ColumnlayoutitemExample columnlayoutitemQueryCondition) {
		ColumnlayoutitemMapper mapperImpl = this.getSqlSession().getMapper(ColumnlayoutitemMapper.class);
		return mapperImpl.selectByExample(columnlayoutitemQueryCondition);
	}
	
	/**
	 * <param name="columnlayoutitemQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int columnlayoutitemQuerySelectObjectsCount(ColumnlayoutitemExample columnlayoutitemQueryCondition) {
		ColumnlayoutitemMapper mapperImpl = this.getSqlSession().getMapper(ColumnlayoutitemMapper.class);
		return mapperImpl.countByExample(columnlayoutitemQueryCondition);
	}
	
	/**
	 * 插入一个对象Component到数据库中
	 * <param name="Component">需要插入的Component</param>
	 */
	protected int componentInsert(Component component) {
		ComponentMapper mapperImpl = this.getSqlSession().getMapper(ComponentMapper.class);
		return mapperImpl.insertSelective(component);
	}
	
	/**
	 * 更新一个对象Component到数据库中
	 * <param name="component">需要更新的Component</param>
	 */
	protected int componentUpdate(Component component) {
		ComponentMapper mapperImpl = this.getSqlSession().getMapper(ComponentMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(component);
		return ret;
	}
	
	/**
	 * 更新一个对象Component到数据库中
	 * <param name="component">需要更新的Component</param>
	 */
	protected int componentUpdateSelective(Component component) {
		ComponentMapper mapperImpl = this.getSqlSession().getMapper(ComponentMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(component);
		return ret;
	}
	
	/**
	 * 更新一个对象Component到数据库中
	 * <param name="component">需要更新的Component</param>
	 */
	public int componentUpdateWithBlobs(Component component) {
		ComponentMapper mapperImpl = this.getSqlSession().getMapper(ComponentMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(component);
	}
	
	/**
	 * 根据条件更新一批对象Component到数据库中
	 * <param name="component">需要更新的Component</param>
	 * <param name="componentQueryCondition">附加的条件</param>
	 */
	protected int componentUpdateByCondition(Component component, ComponentExample componentQueryCondition) {
		ComponentMapper mapperImpl = this.getSqlSession().getMapper(ComponentMapper.class);
		int ret = mapperImpl.updateByExample(component, componentQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Component到数据库中
	 * <param name="component">需要更新的Component</param>
	 * <param name="componentQueryCondition">附加的条件</param>
	 */
	protected int componentUpdateSelectiveByCondition(Component component, ComponentExample componentQueryCondition) {
		ComponentMapper mapperImpl = this.getSqlSession().getMapper(ComponentMapper.class);
		int ret = mapperImpl.updateByExampleSelective(component, componentQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="component">从数据库中删除一个对象Component</param>
	 * <param name="AId"></param>
	 */
	protected int componentDeleteByPrimaryKey(long AId) {
		ComponentMapper mapperImpl = this.getSqlSession().getMapper(ComponentMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="component">从数据库中删除一个对象Component</param>
	 */
	protected int componentDeleteByCondition(ComponentExample componentQueryCondition) {
		ComponentMapper mapperImpl = this.getSqlSession().getMapper(ComponentMapper.class);
		return mapperImpl.deleteByExample(componentQueryCondition);
	}
	
	/**
	 * <param name="component">从数据库中查询一个对象Component</param>
	 * <param name="AId"></param>
	 */
	protected Component componentSelectByPrimaryKey(long AId) {
		ComponentMapper mapperImpl = this.getSqlSession().getMapper(ComponentMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="componentQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Component> componentSelectObjects(ComponentExample componentQueryCondition) {
		ComponentMapper mapperImpl = this.getSqlSession().getMapper(ComponentMapper.class);
		return mapperImpl.selectByExample(componentQueryCondition);
	}
	
	/**
	 * <param name="componentQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Component> componentSelectObjectsWithBLOBs(ComponentExample componentQueryCondition) {
		ComponentMapper mapperImpl = this.getSqlSession().getMapper(ComponentMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(componentQueryCondition);
	}
	
	/**
	 * <param name="componentQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int componentQuerySelectObjectsCount(ComponentExample componentQueryCondition) {
		ComponentMapper mapperImpl = this.getSqlSession().getMapper(ComponentMapper.class);
		return mapperImpl.countByExample(componentQueryCondition);
	}
	
	/**
	 * 插入一个对象Configurationcontext到数据库中
	 * <param name="Configurationcontext">需要插入的Configurationcontext</param>
	 */
	protected int configurationcontextInsert(Configurationcontext configurationcontext) {
		ConfigurationcontextMapper mapperImpl = this.getSqlSession().getMapper(ConfigurationcontextMapper.class);
		return mapperImpl.insertSelective(configurationcontext);
	}
	
	/**
	 * 更新一个对象Configurationcontext到数据库中
	 * <param name="configurationcontext">需要更新的Configurationcontext</param>
	 */
	protected int configurationcontextUpdate(Configurationcontext configurationcontext) {
		ConfigurationcontextMapper mapperImpl = this.getSqlSession().getMapper(ConfigurationcontextMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(configurationcontext);
		return ret;
	}
	
	/**
	 * 更新一个对象Configurationcontext到数据库中
	 * <param name="configurationcontext">需要更新的Configurationcontext</param>
	 */
	protected int configurationcontextUpdateSelective(Configurationcontext configurationcontext) {
		ConfigurationcontextMapper mapperImpl = this.getSqlSession().getMapper(ConfigurationcontextMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(configurationcontext);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Configurationcontext到数据库中
	 * <param name="configurationcontext">需要更新的Configurationcontext</param>
	 * <param name="configurationcontextQueryCondition">附加的条件</param>
	 */
	protected int configurationcontextUpdateByCondition(Configurationcontext configurationcontext, ConfigurationcontextExample configurationcontextQueryCondition) {
		ConfigurationcontextMapper mapperImpl = this.getSqlSession().getMapper(ConfigurationcontextMapper.class);
		int ret = mapperImpl.updateByExample(configurationcontext, configurationcontextQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Configurationcontext到数据库中
	 * <param name="configurationcontext">需要更新的Configurationcontext</param>
	 * <param name="configurationcontextQueryCondition">附加的条件</param>
	 */
	protected int configurationcontextUpdateSelectiveByCondition(Configurationcontext configurationcontext, ConfigurationcontextExample configurationcontextQueryCondition) {
		ConfigurationcontextMapper mapperImpl = this.getSqlSession().getMapper(ConfigurationcontextMapper.class);
		int ret = mapperImpl.updateByExampleSelective(configurationcontext, configurationcontextQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="configurationcontext">从数据库中删除一个对象Configurationcontext</param>
	 * <param name="AId"></param>
	 */
	protected int configurationcontextDeleteByPrimaryKey(long AId) {
		ConfigurationcontextMapper mapperImpl = this.getSqlSession().getMapper(ConfigurationcontextMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="configurationcontext">从数据库中删除一个对象Configurationcontext</param>
	 */
	protected int configurationcontextDeleteByCondition(ConfigurationcontextExample configurationcontextQueryCondition) {
		ConfigurationcontextMapper mapperImpl = this.getSqlSession().getMapper(ConfigurationcontextMapper.class);
		return mapperImpl.deleteByExample(configurationcontextQueryCondition);
	}
	
	/**
	 * <param name="configurationcontext">从数据库中查询一个对象Configurationcontext</param>
	 * <param name="AId"></param>
	 */
	protected Configurationcontext configurationcontextSelectByPrimaryKey(long AId) {
		ConfigurationcontextMapper mapperImpl = this.getSqlSession().getMapper(ConfigurationcontextMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="configurationcontextQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Configurationcontext> configurationcontextSelectObjects(ConfigurationcontextExample configurationcontextQueryCondition) {
		ConfigurationcontextMapper mapperImpl = this.getSqlSession().getMapper(ConfigurationcontextMapper.class);
		return mapperImpl.selectByExample(configurationcontextQueryCondition);
	}
	
	/**
	 * <param name="configurationcontextQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int configurationcontextQuerySelectObjectsCount(ConfigurationcontextExample configurationcontextQueryCondition) {
		ConfigurationcontextMapper mapperImpl = this.getSqlSession().getMapper(ConfigurationcontextMapper.class);
		return mapperImpl.countByExample(configurationcontextQueryCondition);
	}
	
	/**
	 * 插入一个对象Customfield到数据库中
	 * <param name="Customfield">需要插入的Customfield</param>
	 */
	protected int customfieldInsert(Customfield customfield) {
		CustomfieldMapper mapperImpl = this.getSqlSession().getMapper(CustomfieldMapper.class);
		return mapperImpl.insertSelective(customfield);
	}
	
	/**
	 * 更新一个对象Customfield到数据库中
	 * <param name="customfield">需要更新的Customfield</param>
	 */
	protected int customfieldUpdate(Customfield customfield) {
		CustomfieldMapper mapperImpl = this.getSqlSession().getMapper(CustomfieldMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(customfield);
		return ret;
	}
	
	/**
	 * 更新一个对象Customfield到数据库中
	 * <param name="customfield">需要更新的Customfield</param>
	 */
	protected int customfieldUpdateSelective(Customfield customfield) {
		CustomfieldMapper mapperImpl = this.getSqlSession().getMapper(CustomfieldMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(customfield);
		return ret;
	}
	
	/**
	 * 更新一个对象Customfield到数据库中
	 * <param name="customfield">需要更新的Customfield</param>
	 */
	public int customfieldUpdateWithBlobs(Customfield customfield) {
		CustomfieldMapper mapperImpl = this.getSqlSession().getMapper(CustomfieldMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(customfield);
	}
	
	/**
	 * 根据条件更新一批对象Customfield到数据库中
	 * <param name="customfield">需要更新的Customfield</param>
	 * <param name="customfieldQueryCondition">附加的条件</param>
	 */
	protected int customfieldUpdateByCondition(Customfield customfield, CustomfieldExample customfieldQueryCondition) {
		CustomfieldMapper mapperImpl = this.getSqlSession().getMapper(CustomfieldMapper.class);
		int ret = mapperImpl.updateByExample(customfield, customfieldQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Customfield到数据库中
	 * <param name="customfield">需要更新的Customfield</param>
	 * <param name="customfieldQueryCondition">附加的条件</param>
	 */
	protected int customfieldUpdateSelectiveByCondition(Customfield customfield, CustomfieldExample customfieldQueryCondition) {
		CustomfieldMapper mapperImpl = this.getSqlSession().getMapper(CustomfieldMapper.class);
		int ret = mapperImpl.updateByExampleSelective(customfield, customfieldQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="customfield">从数据库中删除一个对象Customfield</param>
	 * <param name="AId"></param>
	 */
	protected int customfieldDeleteByPrimaryKey(long AId) {
		CustomfieldMapper mapperImpl = this.getSqlSession().getMapper(CustomfieldMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="customfield">从数据库中删除一个对象Customfield</param>
	 */
	protected int customfieldDeleteByCondition(CustomfieldExample customfieldQueryCondition) {
		CustomfieldMapper mapperImpl = this.getSqlSession().getMapper(CustomfieldMapper.class);
		return mapperImpl.deleteByExample(customfieldQueryCondition);
	}
	
	/**
	 * <param name="customfield">从数据库中查询一个对象Customfield</param>
	 * <param name="AId"></param>
	 */
	protected Customfield customfieldSelectByPrimaryKey(long AId) {
		CustomfieldMapper mapperImpl = this.getSqlSession().getMapper(CustomfieldMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="customfieldQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Customfield> customfieldSelectObjects(CustomfieldExample customfieldQueryCondition) {
		CustomfieldMapper mapperImpl = this.getSqlSession().getMapper(CustomfieldMapper.class);
		return mapperImpl.selectByExample(customfieldQueryCondition);
	}
	
	/**
	 * <param name="customfieldQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Customfield> customfieldSelectObjectsWithBLOBs(CustomfieldExample customfieldQueryCondition) {
		CustomfieldMapper mapperImpl = this.getSqlSession().getMapper(CustomfieldMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(customfieldQueryCondition);
	}
	
	/**
	 * <param name="customfieldQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int customfieldQuerySelectObjectsCount(CustomfieldExample customfieldQueryCondition) {
		CustomfieldMapper mapperImpl = this.getSqlSession().getMapper(CustomfieldMapper.class);
		return mapperImpl.countByExample(customfieldQueryCondition);
	}
	
	/**
	 * 插入一个对象Customfieldoption到数据库中
	 * <param name="Customfieldoption">需要插入的Customfieldoption</param>
	 */
	protected int customfieldoptionInsert(Customfieldoption customfieldoption) {
		CustomfieldoptionMapper mapperImpl = this.getSqlSession().getMapper(CustomfieldoptionMapper.class);
		return mapperImpl.insertSelective(customfieldoption);
	}
	
	/**
	 * 更新一个对象Customfieldoption到数据库中
	 * <param name="customfieldoption">需要更新的Customfieldoption</param>
	 */
	protected int customfieldoptionUpdate(Customfieldoption customfieldoption) {
		CustomfieldoptionMapper mapperImpl = this.getSqlSession().getMapper(CustomfieldoptionMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(customfieldoption);
		return ret;
	}
	
	/**
	 * 更新一个对象Customfieldoption到数据库中
	 * <param name="customfieldoption">需要更新的Customfieldoption</param>
	 */
	protected int customfieldoptionUpdateSelective(Customfieldoption customfieldoption) {
		CustomfieldoptionMapper mapperImpl = this.getSqlSession().getMapper(CustomfieldoptionMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(customfieldoption);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Customfieldoption到数据库中
	 * <param name="customfieldoption">需要更新的Customfieldoption</param>
	 * <param name="customfieldoptionQueryCondition">附加的条件</param>
	 */
	protected int customfieldoptionUpdateByCondition(Customfieldoption customfieldoption, CustomfieldoptionExample customfieldoptionQueryCondition) {
		CustomfieldoptionMapper mapperImpl = this.getSqlSession().getMapper(CustomfieldoptionMapper.class);
		int ret = mapperImpl.updateByExample(customfieldoption, customfieldoptionQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Customfieldoption到数据库中
	 * <param name="customfieldoption">需要更新的Customfieldoption</param>
	 * <param name="customfieldoptionQueryCondition">附加的条件</param>
	 */
	protected int customfieldoptionUpdateSelectiveByCondition(Customfieldoption customfieldoption, CustomfieldoptionExample customfieldoptionQueryCondition) {
		CustomfieldoptionMapper mapperImpl = this.getSqlSession().getMapper(CustomfieldoptionMapper.class);
		int ret = mapperImpl.updateByExampleSelective(customfieldoption, customfieldoptionQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="customfieldoption">从数据库中删除一个对象Customfieldoption</param>
	 * <param name="AId"></param>
	 */
	protected int customfieldoptionDeleteByPrimaryKey(long AId) {
		CustomfieldoptionMapper mapperImpl = this.getSqlSession().getMapper(CustomfieldoptionMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="customfieldoption">从数据库中删除一个对象Customfieldoption</param>
	 */
	protected int customfieldoptionDeleteByCondition(CustomfieldoptionExample customfieldoptionQueryCondition) {
		CustomfieldoptionMapper mapperImpl = this.getSqlSession().getMapper(CustomfieldoptionMapper.class);
		return mapperImpl.deleteByExample(customfieldoptionQueryCondition);
	}
	
	/**
	 * <param name="customfieldoption">从数据库中查询一个对象Customfieldoption</param>
	 * <param name="AId"></param>
	 */
	protected Customfieldoption customfieldoptionSelectByPrimaryKey(long AId) {
		CustomfieldoptionMapper mapperImpl = this.getSqlSession().getMapper(CustomfieldoptionMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="customfieldoptionQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Customfieldoption> customfieldoptionSelectObjects(CustomfieldoptionExample customfieldoptionQueryCondition) {
		CustomfieldoptionMapper mapperImpl = this.getSqlSession().getMapper(CustomfieldoptionMapper.class);
		return mapperImpl.selectByExample(customfieldoptionQueryCondition);
	}
	
	/**
	 * <param name="customfieldoptionQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int customfieldoptionQuerySelectObjectsCount(CustomfieldoptionExample customfieldoptionQueryCondition) {
		CustomfieldoptionMapper mapperImpl = this.getSqlSession().getMapper(CustomfieldoptionMapper.class);
		return mapperImpl.countByExample(customfieldoptionQueryCondition);
	}
	
	/**
	 * 插入一个对象Customfieldvalue到数据库中
	 * <param name="Customfieldvalue">需要插入的Customfieldvalue</param>
	 */
	protected int customfieldvalueInsert(Customfieldvalue customfieldvalue) {
		CustomfieldvalueMapper mapperImpl = this.getSqlSession().getMapper(CustomfieldvalueMapper.class);
		return mapperImpl.insertSelective(customfieldvalue);
	}
	
	/**
	 * 更新一个对象Customfieldvalue到数据库中
	 * <param name="customfieldvalue">需要更新的Customfieldvalue</param>
	 */
	protected int customfieldvalueUpdate(Customfieldvalue customfieldvalue) {
		CustomfieldvalueMapper mapperImpl = this.getSqlSession().getMapper(CustomfieldvalueMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(customfieldvalue);
		return ret;
	}
	
	/**
	 * 更新一个对象Customfieldvalue到数据库中
	 * <param name="customfieldvalue">需要更新的Customfieldvalue</param>
	 */
	protected int customfieldvalueUpdateSelective(Customfieldvalue customfieldvalue) {
		CustomfieldvalueMapper mapperImpl = this.getSqlSession().getMapper(CustomfieldvalueMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(customfieldvalue);
		return ret;
	}
	
	/**
	 * 更新一个对象Customfieldvalue到数据库中
	 * <param name="customfieldvalue">需要更新的Customfieldvalue</param>
	 */
	public int customfieldvalueUpdateWithBlobs(Customfieldvalue customfieldvalue) {
		CustomfieldvalueMapper mapperImpl = this.getSqlSession().getMapper(CustomfieldvalueMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(customfieldvalue);
	}
	
	/**
	 * 根据条件更新一批对象Customfieldvalue到数据库中
	 * <param name="customfieldvalue">需要更新的Customfieldvalue</param>
	 * <param name="customfieldvalueQueryCondition">附加的条件</param>
	 */
	protected int customfieldvalueUpdateByCondition(Customfieldvalue customfieldvalue, CustomfieldvalueExample customfieldvalueQueryCondition) {
		CustomfieldvalueMapper mapperImpl = this.getSqlSession().getMapper(CustomfieldvalueMapper.class);
		int ret = mapperImpl.updateByExample(customfieldvalue, customfieldvalueQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Customfieldvalue到数据库中
	 * <param name="customfieldvalue">需要更新的Customfieldvalue</param>
	 * <param name="customfieldvalueQueryCondition">附加的条件</param>
	 */
	protected int customfieldvalueUpdateSelectiveByCondition(Customfieldvalue customfieldvalue, CustomfieldvalueExample customfieldvalueQueryCondition) {
		CustomfieldvalueMapper mapperImpl = this.getSqlSession().getMapper(CustomfieldvalueMapper.class);
		int ret = mapperImpl.updateByExampleSelective(customfieldvalue, customfieldvalueQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="customfieldvalue">从数据库中删除一个对象Customfieldvalue</param>
	 * <param name="AId"></param>
	 */
	protected int customfieldvalueDeleteByPrimaryKey(long AId) {
		CustomfieldvalueMapper mapperImpl = this.getSqlSession().getMapper(CustomfieldvalueMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="customfieldvalue">从数据库中删除一个对象Customfieldvalue</param>
	 */
	protected int customfieldvalueDeleteByCondition(CustomfieldvalueExample customfieldvalueQueryCondition) {
		CustomfieldvalueMapper mapperImpl = this.getSqlSession().getMapper(CustomfieldvalueMapper.class);
		return mapperImpl.deleteByExample(customfieldvalueQueryCondition);
	}
	
	/**
	 * <param name="customfieldvalue">从数据库中查询一个对象Customfieldvalue</param>
	 * <param name="AId"></param>
	 */
	protected Customfieldvalue customfieldvalueSelectByPrimaryKey(long AId) {
		CustomfieldvalueMapper mapperImpl = this.getSqlSession().getMapper(CustomfieldvalueMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="customfieldvalueQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Customfieldvalue> customfieldvalueSelectObjects(CustomfieldvalueExample customfieldvalueQueryCondition) {
		CustomfieldvalueMapper mapperImpl = this.getSqlSession().getMapper(CustomfieldvalueMapper.class);
		return mapperImpl.selectByExample(customfieldvalueQueryCondition);
	}
	
	/**
	 * <param name="customfieldvalueQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Customfieldvalue> customfieldvalueSelectObjectsWithBLOBs(CustomfieldvalueExample customfieldvalueQueryCondition) {
		CustomfieldvalueMapper mapperImpl = this.getSqlSession().getMapper(CustomfieldvalueMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(customfieldvalueQueryCondition);
	}
	
	/**
	 * <param name="customfieldvalueQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int customfieldvalueQuerySelectObjectsCount(CustomfieldvalueExample customfieldvalueQueryCondition) {
		CustomfieldvalueMapper mapperImpl = this.getSqlSession().getMapper(CustomfieldvalueMapper.class);
		return mapperImpl.countByExample(customfieldvalueQueryCondition);
	}
	
	/**
	 * 插入一个对象CwdApplication到数据库中
	 * <param name="CwdApplication">需要插入的CwdApplication</param>
	 */
	protected int cwdApplicationInsert(CwdApplication cwdApplication) {
		CwdApplicationMapper mapperImpl = this.getSqlSession().getMapper(CwdApplicationMapper.class);
		return mapperImpl.insertSelective(cwdApplication);
	}
	
	/**
	 * 更新一个对象CwdApplication到数据库中
	 * <param name="cwdApplication">需要更新的CwdApplication</param>
	 */
	protected int cwdApplicationUpdate(CwdApplication cwdApplication) {
		CwdApplicationMapper mapperImpl = this.getSqlSession().getMapper(CwdApplicationMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(cwdApplication);
		return ret;
	}
	
	/**
	 * 更新一个对象CwdApplication到数据库中
	 * <param name="cwdApplication">需要更新的CwdApplication</param>
	 */
	protected int cwdApplicationUpdateSelective(CwdApplication cwdApplication) {
		CwdApplicationMapper mapperImpl = this.getSqlSession().getMapper(CwdApplicationMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(cwdApplication);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象CwdApplication到数据库中
	 * <param name="cwdApplication">需要更新的CwdApplication</param>
	 * <param name="cwdApplicationQueryCondition">附加的条件</param>
	 */
	protected int cwdApplicationUpdateByCondition(CwdApplication cwdApplication, CwdApplicationExample cwdApplicationQueryCondition) {
		CwdApplicationMapper mapperImpl = this.getSqlSession().getMapper(CwdApplicationMapper.class);
		int ret = mapperImpl.updateByExample(cwdApplication, cwdApplicationQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息CwdApplication到数据库中
	 * <param name="cwdApplication">需要更新的CwdApplication</param>
	 * <param name="cwdApplicationQueryCondition">附加的条件</param>
	 */
	protected int cwdApplicationUpdateSelectiveByCondition(CwdApplication cwdApplication, CwdApplicationExample cwdApplicationQueryCondition) {
		CwdApplicationMapper mapperImpl = this.getSqlSession().getMapper(CwdApplicationMapper.class);
		int ret = mapperImpl.updateByExampleSelective(cwdApplication, cwdApplicationQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="cwdApplication">从数据库中删除一个对象CwdApplication</param>
	 * <param name="AId"></param>
	 */
	protected int cwdApplicationDeleteByPrimaryKey(long AId) {
		CwdApplicationMapper mapperImpl = this.getSqlSession().getMapper(CwdApplicationMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="cwdApplication">从数据库中删除一个对象CwdApplication</param>
	 */
	protected int cwdApplicationDeleteByCondition(CwdApplicationExample cwdApplicationQueryCondition) {
		CwdApplicationMapper mapperImpl = this.getSqlSession().getMapper(CwdApplicationMapper.class);
		return mapperImpl.deleteByExample(cwdApplicationQueryCondition);
	}
	
	/**
	 * <param name="cwdApplication">从数据库中查询一个对象CwdApplication</param>
	 * <param name="AId"></param>
	 */
	protected CwdApplication cwdApplicationSelectByPrimaryKey(long AId) {
		CwdApplicationMapper mapperImpl = this.getSqlSession().getMapper(CwdApplicationMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="cwdApplicationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<CwdApplication> cwdApplicationSelectObjects(CwdApplicationExample cwdApplicationQueryCondition) {
		CwdApplicationMapper mapperImpl = this.getSqlSession().getMapper(CwdApplicationMapper.class);
		return mapperImpl.selectByExample(cwdApplicationQueryCondition);
	}
	
	/**
	 * <param name="cwdApplicationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int cwdApplicationQuerySelectObjectsCount(CwdApplicationExample cwdApplicationQueryCondition) {
		CwdApplicationMapper mapperImpl = this.getSqlSession().getMapper(CwdApplicationMapper.class);
		return mapperImpl.countByExample(cwdApplicationQueryCondition);
	}
	
	/**
	 * 插入一个对象CwdApplicationAddress到数据库中
	 * <param name="CwdApplicationAddress">需要插入的CwdApplicationAddress</param>
	 */
	protected int cwdApplicationAddressInsert(CwdApplicationAddress cwdApplicationAddress) {
		CwdApplicationAddressMapper mapperImpl = this.getSqlSession().getMapper(CwdApplicationAddressMapper.class);
		return mapperImpl.insertSelective(cwdApplicationAddress);
	}
	
	/**
	 * 更新一个对象CwdApplicationAddress到数据库中
	 * <param name="cwdApplicationAddress">需要更新的CwdApplicationAddress</param>
	 */
	protected int cwdApplicationAddressUpdate(CwdApplicationAddress cwdApplicationAddress) {
		CwdApplicationAddressMapper mapperImpl = this.getSqlSession().getMapper(CwdApplicationAddressMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(cwdApplicationAddress);
		return ret;
	}
	
	/**
	 * 更新一个对象CwdApplicationAddress到数据库中
	 * <param name="cwdApplicationAddress">需要更新的CwdApplicationAddress</param>
	 */
	protected int cwdApplicationAddressUpdateSelective(CwdApplicationAddress cwdApplicationAddress) {
		CwdApplicationAddressMapper mapperImpl = this.getSqlSession().getMapper(CwdApplicationAddressMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(cwdApplicationAddress);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象CwdApplicationAddress到数据库中
	 * <param name="cwdApplicationAddress">需要更新的CwdApplicationAddress</param>
	 * <param name="cwdApplicationAddressQueryCondition">附加的条件</param>
	 */
	protected int cwdApplicationAddressUpdateByCondition(CwdApplicationAddress cwdApplicationAddress, CwdApplicationAddressExample cwdApplicationAddressQueryCondition) {
		CwdApplicationAddressMapper mapperImpl = this.getSqlSession().getMapper(CwdApplicationAddressMapper.class);
		int ret = mapperImpl.updateByExample(cwdApplicationAddress, cwdApplicationAddressQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息CwdApplicationAddress到数据库中
	 * <param name="cwdApplicationAddress">需要更新的CwdApplicationAddress</param>
	 * <param name="cwdApplicationAddressQueryCondition">附加的条件</param>
	 */
	protected int cwdApplicationAddressUpdateSelectiveByCondition(CwdApplicationAddress cwdApplicationAddress, CwdApplicationAddressExample cwdApplicationAddressQueryCondition) {
		CwdApplicationAddressMapper mapperImpl = this.getSqlSession().getMapper(CwdApplicationAddressMapper.class);
		int ret = mapperImpl.updateByExampleSelective(cwdApplicationAddress, cwdApplicationAddressQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="cwdApplicationAddress">从数据库中删除一个对象CwdApplicationAddress</param>
	 * <param name="ACwdApplicationAddressKey"> 主键类</param>
	 */
	protected int cwdApplicationAddressDeleteByPrimaryKey(CwdApplicationAddressKey ACwdApplicationAddressKey) {
		CwdApplicationAddressMapper mapperImpl = this.getSqlSession().getMapper(CwdApplicationAddressMapper.class);
		return mapperImpl.deleteByPrimaryKey(ACwdApplicationAddressKey);
	}
	
	/**
	 * <param name="cwdApplicationAddress">从数据库中删除一个对象CwdApplicationAddress</param>
	 */
	protected int cwdApplicationAddressDeleteByCondition(CwdApplicationAddressExample cwdApplicationAddressQueryCondition) {
		CwdApplicationAddressMapper mapperImpl = this.getSqlSession().getMapper(CwdApplicationAddressMapper.class);
		return mapperImpl.deleteByExample(cwdApplicationAddressQueryCondition);
	}
	
	/**
	 * <param name="cwdApplicationAddress">从数据库中查询一个对象CwdApplicationAddress</param>
	 * <param name="ACwdApplicationAddressKey"> 主键类</param>
	 */
	protected CwdApplicationAddress cwdApplicationAddressSelectByPrimaryKey(CwdApplicationAddressKey ACwdApplicationAddressKey) {
		CwdApplicationAddressMapper mapperImpl = this.getSqlSession().getMapper(CwdApplicationAddressMapper.class);
		return mapperImpl.selectByPrimaryKey(ACwdApplicationAddressKey);
	}
	
	/**
	 * <param name="cwdApplicationAddressQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<CwdApplicationAddress> cwdApplicationAddressSelectObjects(CwdApplicationAddressExample cwdApplicationAddressQueryCondition) {
		CwdApplicationAddressMapper mapperImpl = this.getSqlSession().getMapper(CwdApplicationAddressMapper.class);
		return mapperImpl.selectByExample(cwdApplicationAddressQueryCondition);
	}
	
	/**
	 * <param name="cwdApplicationAddressQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int cwdApplicationAddressQuerySelectObjectsCount(CwdApplicationAddressExample cwdApplicationAddressQueryCondition) {
		CwdApplicationAddressMapper mapperImpl = this.getSqlSession().getMapper(CwdApplicationAddressMapper.class);
		return mapperImpl.countByExample(cwdApplicationAddressQueryCondition);
	}
	
	/**
	 * 插入一个对象CwdDirectory到数据库中
	 * <param name="CwdDirectory">需要插入的CwdDirectory</param>
	 */
	protected int cwdDirectoryInsert(CwdDirectory cwdDirectory) {
		CwdDirectoryMapper mapperImpl = this.getSqlSession().getMapper(CwdDirectoryMapper.class);
		return mapperImpl.insertSelective(cwdDirectory);
	}
	
	/**
	 * 更新一个对象CwdDirectory到数据库中
	 * <param name="cwdDirectory">需要更新的CwdDirectory</param>
	 */
	protected int cwdDirectoryUpdate(CwdDirectory cwdDirectory) {
		CwdDirectoryMapper mapperImpl = this.getSqlSession().getMapper(CwdDirectoryMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(cwdDirectory);
		return ret;
	}
	
	/**
	 * 更新一个对象CwdDirectory到数据库中
	 * <param name="cwdDirectory">需要更新的CwdDirectory</param>
	 */
	protected int cwdDirectoryUpdateSelective(CwdDirectory cwdDirectory) {
		CwdDirectoryMapper mapperImpl = this.getSqlSession().getMapper(CwdDirectoryMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(cwdDirectory);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象CwdDirectory到数据库中
	 * <param name="cwdDirectory">需要更新的CwdDirectory</param>
	 * <param name="cwdDirectoryQueryCondition">附加的条件</param>
	 */
	protected int cwdDirectoryUpdateByCondition(CwdDirectory cwdDirectory, CwdDirectoryExample cwdDirectoryQueryCondition) {
		CwdDirectoryMapper mapperImpl = this.getSqlSession().getMapper(CwdDirectoryMapper.class);
		int ret = mapperImpl.updateByExample(cwdDirectory, cwdDirectoryQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息CwdDirectory到数据库中
	 * <param name="cwdDirectory">需要更新的CwdDirectory</param>
	 * <param name="cwdDirectoryQueryCondition">附加的条件</param>
	 */
	protected int cwdDirectoryUpdateSelectiveByCondition(CwdDirectory cwdDirectory, CwdDirectoryExample cwdDirectoryQueryCondition) {
		CwdDirectoryMapper mapperImpl = this.getSqlSession().getMapper(CwdDirectoryMapper.class);
		int ret = mapperImpl.updateByExampleSelective(cwdDirectory, cwdDirectoryQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="cwdDirectory">从数据库中删除一个对象CwdDirectory</param>
	 * <param name="AId"></param>
	 */
	protected int cwdDirectoryDeleteByPrimaryKey(long AId) {
		CwdDirectoryMapper mapperImpl = this.getSqlSession().getMapper(CwdDirectoryMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="cwdDirectory">从数据库中删除一个对象CwdDirectory</param>
	 */
	protected int cwdDirectoryDeleteByCondition(CwdDirectoryExample cwdDirectoryQueryCondition) {
		CwdDirectoryMapper mapperImpl = this.getSqlSession().getMapper(CwdDirectoryMapper.class);
		return mapperImpl.deleteByExample(cwdDirectoryQueryCondition);
	}
	
	/**
	 * <param name="cwdDirectory">从数据库中查询一个对象CwdDirectory</param>
	 * <param name="AId"></param>
	 */
	protected CwdDirectory cwdDirectorySelectByPrimaryKey(long AId) {
		CwdDirectoryMapper mapperImpl = this.getSqlSession().getMapper(CwdDirectoryMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="cwdDirectoryQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<CwdDirectory> cwdDirectorySelectObjects(CwdDirectoryExample cwdDirectoryQueryCondition) {
		CwdDirectoryMapper mapperImpl = this.getSqlSession().getMapper(CwdDirectoryMapper.class);
		return mapperImpl.selectByExample(cwdDirectoryQueryCondition);
	}
	
	/**
	 * <param name="cwdDirectoryQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int cwdDirectoryQuerySelectObjectsCount(CwdDirectoryExample cwdDirectoryQueryCondition) {
		CwdDirectoryMapper mapperImpl = this.getSqlSession().getMapper(CwdDirectoryMapper.class);
		return mapperImpl.countByExample(cwdDirectoryQueryCondition);
	}
	
	/**
	 * 插入一个对象CwdDirectoryAttribute到数据库中
	 * <param name="CwdDirectoryAttribute">需要插入的CwdDirectoryAttribute</param>
	 */
	protected int cwdDirectoryAttributeInsert(CwdDirectoryAttribute cwdDirectoryAttribute) {
		CwdDirectoryAttributeMapper mapperImpl = this.getSqlSession().getMapper(CwdDirectoryAttributeMapper.class);
		return mapperImpl.insertSelective(cwdDirectoryAttribute);
	}
	
	/**
	 * 更新一个对象CwdDirectoryAttribute到数据库中
	 * <param name="cwdDirectoryAttribute">需要更新的CwdDirectoryAttribute</param>
	 */
	protected int cwdDirectoryAttributeUpdate(CwdDirectoryAttribute cwdDirectoryAttribute) {
		CwdDirectoryAttributeMapper mapperImpl = this.getSqlSession().getMapper(CwdDirectoryAttributeMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(cwdDirectoryAttribute);
		return ret;
	}
	
	/**
	 * 更新一个对象CwdDirectoryAttribute到数据库中
	 * <param name="cwdDirectoryAttribute">需要更新的CwdDirectoryAttribute</param>
	 */
	protected int cwdDirectoryAttributeUpdateSelective(CwdDirectoryAttribute cwdDirectoryAttribute) {
		CwdDirectoryAttributeMapper mapperImpl = this.getSqlSession().getMapper(CwdDirectoryAttributeMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(cwdDirectoryAttribute);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象CwdDirectoryAttribute到数据库中
	 * <param name="cwdDirectoryAttribute">需要更新的CwdDirectoryAttribute</param>
	 * <param name="cwdDirectoryAttributeQueryCondition">附加的条件</param>
	 */
	protected int cwdDirectoryAttributeUpdateByCondition(CwdDirectoryAttribute cwdDirectoryAttribute, CwdDirectoryAttributeExample cwdDirectoryAttributeQueryCondition) {
		CwdDirectoryAttributeMapper mapperImpl = this.getSqlSession().getMapper(CwdDirectoryAttributeMapper.class);
		int ret = mapperImpl.updateByExample(cwdDirectoryAttribute, cwdDirectoryAttributeQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息CwdDirectoryAttribute到数据库中
	 * <param name="cwdDirectoryAttribute">需要更新的CwdDirectoryAttribute</param>
	 * <param name="cwdDirectoryAttributeQueryCondition">附加的条件</param>
	 */
	protected int cwdDirectoryAttributeUpdateSelectiveByCondition(CwdDirectoryAttribute cwdDirectoryAttribute, CwdDirectoryAttributeExample cwdDirectoryAttributeQueryCondition) {
		CwdDirectoryAttributeMapper mapperImpl = this.getSqlSession().getMapper(CwdDirectoryAttributeMapper.class);
		int ret = mapperImpl.updateByExampleSelective(cwdDirectoryAttribute, cwdDirectoryAttributeQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="cwdDirectoryAttribute">从数据库中删除一个对象CwdDirectoryAttribute</param>
	 * <param name="ACwdDirectoryAttributeKey"> 主键类</param>
	 */
	protected int cwdDirectoryAttributeDeleteByPrimaryKey(CwdDirectoryAttributeKey ACwdDirectoryAttributeKey) {
		CwdDirectoryAttributeMapper mapperImpl = this.getSqlSession().getMapper(CwdDirectoryAttributeMapper.class);
		return mapperImpl.deleteByPrimaryKey(ACwdDirectoryAttributeKey);
	}
	
	/**
	 * <param name="cwdDirectoryAttribute">从数据库中删除一个对象CwdDirectoryAttribute</param>
	 */
	protected int cwdDirectoryAttributeDeleteByCondition(CwdDirectoryAttributeExample cwdDirectoryAttributeQueryCondition) {
		CwdDirectoryAttributeMapper mapperImpl = this.getSqlSession().getMapper(CwdDirectoryAttributeMapper.class);
		return mapperImpl.deleteByExample(cwdDirectoryAttributeQueryCondition);
	}
	
	/**
	 * <param name="cwdDirectoryAttribute">从数据库中查询一个对象CwdDirectoryAttribute</param>
	 * <param name="ACwdDirectoryAttributeKey"> 主键类</param>
	 */
	protected CwdDirectoryAttribute cwdDirectoryAttributeSelectByPrimaryKey(CwdDirectoryAttributeKey ACwdDirectoryAttributeKey) {
		CwdDirectoryAttributeMapper mapperImpl = this.getSqlSession().getMapper(CwdDirectoryAttributeMapper.class);
		return mapperImpl.selectByPrimaryKey(ACwdDirectoryAttributeKey);
	}
	
	/**
	 * <param name="cwdDirectoryAttributeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<CwdDirectoryAttribute> cwdDirectoryAttributeSelectObjects(CwdDirectoryAttributeExample cwdDirectoryAttributeQueryCondition) {
		CwdDirectoryAttributeMapper mapperImpl = this.getSqlSession().getMapper(CwdDirectoryAttributeMapper.class);
		return mapperImpl.selectByExample(cwdDirectoryAttributeQueryCondition);
	}
	
	/**
	 * <param name="cwdDirectoryAttributeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int cwdDirectoryAttributeQuerySelectObjectsCount(CwdDirectoryAttributeExample cwdDirectoryAttributeQueryCondition) {
		CwdDirectoryAttributeMapper mapperImpl = this.getSqlSession().getMapper(CwdDirectoryAttributeMapper.class);
		return mapperImpl.countByExample(cwdDirectoryAttributeQueryCondition);
	}
	
	/**
	 * 插入一个对象CwdDirectoryOperationKey到数据库中
	 * <param name="CwdDirectoryOperationKey">需要插入的CwdDirectoryOperationKey</param>
	 */
	protected int cwdDirectoryOperationInsert(CwdDirectoryOperationKey cwdDirectoryOperation) {
		CwdDirectoryOperationMapper mapperImpl = this.getSqlSession().getMapper(CwdDirectoryOperationMapper.class);
		return mapperImpl.insertSelective(cwdDirectoryOperation);
	}
	
	/**
	 * <param name="cwdDirectoryOperation">从数据库中删除一个对象CwdDirectoryOperation</param>
	 * <param name="ACwdDirectoryOperationKey"> 主键类</param>
	 */
	protected int cwdDirectoryOperationDeleteByPrimaryKey(CwdDirectoryOperationKey ACwdDirectoryOperationKey) {
		CwdDirectoryOperationMapper mapperImpl = this.getSqlSession().getMapper(CwdDirectoryOperationMapper.class);
		return mapperImpl.deleteByPrimaryKey(ACwdDirectoryOperationKey);
	}
	
	/**
	 * <param name="cwdDirectoryOperation">从数据库中删除一个对象CwdDirectoryOperation</param>
	 */
	protected int cwdDirectoryOperationDeleteByCondition(CwdDirectoryOperationExample cwdDirectoryOperationQueryCondition) {
		CwdDirectoryOperationMapper mapperImpl = this.getSqlSession().getMapper(CwdDirectoryOperationMapper.class);
		return mapperImpl.deleteByExample(cwdDirectoryOperationQueryCondition);
	}
	
	/**
	 * <param name="cwdDirectoryOperationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<CwdDirectoryOperationKey> cwdDirectoryOperationSelectObjects(CwdDirectoryOperationExample cwdDirectoryOperationQueryCondition) {
		CwdDirectoryOperationMapper mapperImpl = this.getSqlSession().getMapper(CwdDirectoryOperationMapper.class);
		return mapperImpl.selectByExample(cwdDirectoryOperationQueryCondition);
	}
	
	/**
	 * <param name="cwdDirectoryOperationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int cwdDirectoryOperationQuerySelectObjectsCount(CwdDirectoryOperationExample cwdDirectoryOperationQueryCondition) {
		CwdDirectoryOperationMapper mapperImpl = this.getSqlSession().getMapper(CwdDirectoryOperationMapper.class);
		return mapperImpl.countByExample(cwdDirectoryOperationQueryCondition);
	}
	
	/**
	 * 插入一个对象CwdGroup到数据库中
	 * <param name="CwdGroup">需要插入的CwdGroup</param>
	 */
	protected int cwdGroupInsert(CwdGroup cwdGroup) {
		CwdGroupMapper mapperImpl = this.getSqlSession().getMapper(CwdGroupMapper.class);
		return mapperImpl.insertSelective(cwdGroup);
	}
	
	/**
	 * 更新一个对象CwdGroup到数据库中
	 * <param name="cwdGroup">需要更新的CwdGroup</param>
	 */
	protected int cwdGroupUpdate(CwdGroup cwdGroup) {
		CwdGroupMapper mapperImpl = this.getSqlSession().getMapper(CwdGroupMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(cwdGroup);
		return ret;
	}
	
	/**
	 * 更新一个对象CwdGroup到数据库中
	 * <param name="cwdGroup">需要更新的CwdGroup</param>
	 */
	protected int cwdGroupUpdateSelective(CwdGroup cwdGroup) {
		CwdGroupMapper mapperImpl = this.getSqlSession().getMapper(CwdGroupMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(cwdGroup);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象CwdGroup到数据库中
	 * <param name="cwdGroup">需要更新的CwdGroup</param>
	 * <param name="cwdGroupQueryCondition">附加的条件</param>
	 */
	protected int cwdGroupUpdateByCondition(CwdGroup cwdGroup, CwdGroupExample cwdGroupQueryCondition) {
		CwdGroupMapper mapperImpl = this.getSqlSession().getMapper(CwdGroupMapper.class);
		int ret = mapperImpl.updateByExample(cwdGroup, cwdGroupQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息CwdGroup到数据库中
	 * <param name="cwdGroup">需要更新的CwdGroup</param>
	 * <param name="cwdGroupQueryCondition">附加的条件</param>
	 */
	protected int cwdGroupUpdateSelectiveByCondition(CwdGroup cwdGroup, CwdGroupExample cwdGroupQueryCondition) {
		CwdGroupMapper mapperImpl = this.getSqlSession().getMapper(CwdGroupMapper.class);
		int ret = mapperImpl.updateByExampleSelective(cwdGroup, cwdGroupQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="cwdGroup">从数据库中删除一个对象CwdGroup</param>
	 * <param name="AId"></param>
	 */
	protected int cwdGroupDeleteByPrimaryKey(long AId) {
		CwdGroupMapper mapperImpl = this.getSqlSession().getMapper(CwdGroupMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="cwdGroup">从数据库中删除一个对象CwdGroup</param>
	 */
	protected int cwdGroupDeleteByCondition(CwdGroupExample cwdGroupQueryCondition) {
		CwdGroupMapper mapperImpl = this.getSqlSession().getMapper(CwdGroupMapper.class);
		return mapperImpl.deleteByExample(cwdGroupQueryCondition);
	}
	
	/**
	 * <param name="cwdGroup">从数据库中查询一个对象CwdGroup</param>
	 * <param name="AId"></param>
	 */
	protected CwdGroup cwdGroupSelectByPrimaryKey(long AId) {
		CwdGroupMapper mapperImpl = this.getSqlSession().getMapper(CwdGroupMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="cwdGroupQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<CwdGroup> cwdGroupSelectObjects(CwdGroupExample cwdGroupQueryCondition) {
		CwdGroupMapper mapperImpl = this.getSqlSession().getMapper(CwdGroupMapper.class);
		return mapperImpl.selectByExample(cwdGroupQueryCondition);
	}
	
	/**
	 * <param name="cwdGroupQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int cwdGroupQuerySelectObjectsCount(CwdGroupExample cwdGroupQueryCondition) {
		CwdGroupMapper mapperImpl = this.getSqlSession().getMapper(CwdGroupMapper.class);
		return mapperImpl.countByExample(cwdGroupQueryCondition);
	}
	
	/**
	 * 插入一个对象CwdGroupAttributes到数据库中
	 * <param name="CwdGroupAttributes">需要插入的CwdGroupAttributes</param>
	 */
	protected int cwdGroupAttributesInsert(CwdGroupAttributes cwdGroupAttributes) {
		CwdGroupAttributesMapper mapperImpl = this.getSqlSession().getMapper(CwdGroupAttributesMapper.class);
		return mapperImpl.insertSelective(cwdGroupAttributes);
	}
	
	/**
	 * 更新一个对象CwdGroupAttributes到数据库中
	 * <param name="cwdGroupAttributes">需要更新的CwdGroupAttributes</param>
	 */
	protected int cwdGroupAttributesUpdate(CwdGroupAttributes cwdGroupAttributes) {
		CwdGroupAttributesMapper mapperImpl = this.getSqlSession().getMapper(CwdGroupAttributesMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(cwdGroupAttributes);
		return ret;
	}
	
	/**
	 * 更新一个对象CwdGroupAttributes到数据库中
	 * <param name="cwdGroupAttributes">需要更新的CwdGroupAttributes</param>
	 */
	protected int cwdGroupAttributesUpdateSelective(CwdGroupAttributes cwdGroupAttributes) {
		CwdGroupAttributesMapper mapperImpl = this.getSqlSession().getMapper(CwdGroupAttributesMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(cwdGroupAttributes);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象CwdGroupAttributes到数据库中
	 * <param name="cwdGroupAttributes">需要更新的CwdGroupAttributes</param>
	 * <param name="cwdGroupAttributesQueryCondition">附加的条件</param>
	 */
	protected int cwdGroupAttributesUpdateByCondition(CwdGroupAttributes cwdGroupAttributes, CwdGroupAttributesExample cwdGroupAttributesQueryCondition) {
		CwdGroupAttributesMapper mapperImpl = this.getSqlSession().getMapper(CwdGroupAttributesMapper.class);
		int ret = mapperImpl.updateByExample(cwdGroupAttributes, cwdGroupAttributesQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息CwdGroupAttributes到数据库中
	 * <param name="cwdGroupAttributes">需要更新的CwdGroupAttributes</param>
	 * <param name="cwdGroupAttributesQueryCondition">附加的条件</param>
	 */
	protected int cwdGroupAttributesUpdateSelectiveByCondition(CwdGroupAttributes cwdGroupAttributes, CwdGroupAttributesExample cwdGroupAttributesQueryCondition) {
		CwdGroupAttributesMapper mapperImpl = this.getSqlSession().getMapper(CwdGroupAttributesMapper.class);
		int ret = mapperImpl.updateByExampleSelective(cwdGroupAttributes, cwdGroupAttributesQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="cwdGroupAttributes">从数据库中删除一个对象CwdGroupAttributes</param>
	 * <param name="AId"></param>
	 */
	protected int cwdGroupAttributesDeleteByPrimaryKey(long AId) {
		CwdGroupAttributesMapper mapperImpl = this.getSqlSession().getMapper(CwdGroupAttributesMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="cwdGroupAttributes">从数据库中删除一个对象CwdGroupAttributes</param>
	 */
	protected int cwdGroupAttributesDeleteByCondition(CwdGroupAttributesExample cwdGroupAttributesQueryCondition) {
		CwdGroupAttributesMapper mapperImpl = this.getSqlSession().getMapper(CwdGroupAttributesMapper.class);
		return mapperImpl.deleteByExample(cwdGroupAttributesQueryCondition);
	}
	
	/**
	 * <param name="cwdGroupAttributes">从数据库中查询一个对象CwdGroupAttributes</param>
	 * <param name="AId"></param>
	 */
	protected CwdGroupAttributes cwdGroupAttributesSelectByPrimaryKey(long AId) {
		CwdGroupAttributesMapper mapperImpl = this.getSqlSession().getMapper(CwdGroupAttributesMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="cwdGroupAttributesQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<CwdGroupAttributes> cwdGroupAttributesSelectObjects(CwdGroupAttributesExample cwdGroupAttributesQueryCondition) {
		CwdGroupAttributesMapper mapperImpl = this.getSqlSession().getMapper(CwdGroupAttributesMapper.class);
		return mapperImpl.selectByExample(cwdGroupAttributesQueryCondition);
	}
	
	/**
	 * <param name="cwdGroupAttributesQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int cwdGroupAttributesQuerySelectObjectsCount(CwdGroupAttributesExample cwdGroupAttributesQueryCondition) {
		CwdGroupAttributesMapper mapperImpl = this.getSqlSession().getMapper(CwdGroupAttributesMapper.class);
		return mapperImpl.countByExample(cwdGroupAttributesQueryCondition);
	}
	
	/**
	 * 插入一个对象CwdMembership到数据库中
	 * <param name="CwdMembership">需要插入的CwdMembership</param>
	 */
	protected int cwdMembershipInsert(CwdMembership cwdMembership) {
		CwdMembershipMapper mapperImpl = this.getSqlSession().getMapper(CwdMembershipMapper.class);
		return mapperImpl.insertSelective(cwdMembership);
	}
	
	/**
	 * 更新一个对象CwdMembership到数据库中
	 * <param name="cwdMembership">需要更新的CwdMembership</param>
	 */
	protected int cwdMembershipUpdate(CwdMembership cwdMembership) {
		CwdMembershipMapper mapperImpl = this.getSqlSession().getMapper(CwdMembershipMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(cwdMembership);
		return ret;
	}
	
	/**
	 * 更新一个对象CwdMembership到数据库中
	 * <param name="cwdMembership">需要更新的CwdMembership</param>
	 */
	protected int cwdMembershipUpdateSelective(CwdMembership cwdMembership) {
		CwdMembershipMapper mapperImpl = this.getSqlSession().getMapper(CwdMembershipMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(cwdMembership);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象CwdMembership到数据库中
	 * <param name="cwdMembership">需要更新的CwdMembership</param>
	 * <param name="cwdMembershipQueryCondition">附加的条件</param>
	 */
	protected int cwdMembershipUpdateByCondition(CwdMembership cwdMembership, CwdMembershipExample cwdMembershipQueryCondition) {
		CwdMembershipMapper mapperImpl = this.getSqlSession().getMapper(CwdMembershipMapper.class);
		int ret = mapperImpl.updateByExample(cwdMembership, cwdMembershipQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息CwdMembership到数据库中
	 * <param name="cwdMembership">需要更新的CwdMembership</param>
	 * <param name="cwdMembershipQueryCondition">附加的条件</param>
	 */
	protected int cwdMembershipUpdateSelectiveByCondition(CwdMembership cwdMembership, CwdMembershipExample cwdMembershipQueryCondition) {
		CwdMembershipMapper mapperImpl = this.getSqlSession().getMapper(CwdMembershipMapper.class);
		int ret = mapperImpl.updateByExampleSelective(cwdMembership, cwdMembershipQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="cwdMembership">从数据库中删除一个对象CwdMembership</param>
	 * <param name="AId"></param>
	 */
	protected int cwdMembershipDeleteByPrimaryKey(long AId) {
		CwdMembershipMapper mapperImpl = this.getSqlSession().getMapper(CwdMembershipMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="cwdMembership">从数据库中删除一个对象CwdMembership</param>
	 */
	protected int cwdMembershipDeleteByCondition(CwdMembershipExample cwdMembershipQueryCondition) {
		CwdMembershipMapper mapperImpl = this.getSqlSession().getMapper(CwdMembershipMapper.class);
		return mapperImpl.deleteByExample(cwdMembershipQueryCondition);
	}
	
	/**
	 * <param name="cwdMembership">从数据库中查询一个对象CwdMembership</param>
	 * <param name="AId"></param>
	 */
	protected CwdMembership cwdMembershipSelectByPrimaryKey(long AId) {
		CwdMembershipMapper mapperImpl = this.getSqlSession().getMapper(CwdMembershipMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="cwdMembershipQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<CwdMembership> cwdMembershipSelectObjects(CwdMembershipExample cwdMembershipQueryCondition) {
		CwdMembershipMapper mapperImpl = this.getSqlSession().getMapper(CwdMembershipMapper.class);
		return mapperImpl.selectByExample(cwdMembershipQueryCondition);
	}
	
	/**
	 * <param name="cwdMembershipQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int cwdMembershipQuerySelectObjectsCount(CwdMembershipExample cwdMembershipQueryCondition) {
		CwdMembershipMapper mapperImpl = this.getSqlSession().getMapper(CwdMembershipMapper.class);
		return mapperImpl.countByExample(cwdMembershipQueryCondition);
	}
	
	/**
	 * 插入一个对象CwdUser到数据库中
	 * <param name="CwdUser">需要插入的CwdUser</param>
	 */
	protected int cwdUserInsert(CwdUser cwdUser) {
		CwdUserMapper mapperImpl = this.getSqlSession().getMapper(CwdUserMapper.class);
		return mapperImpl.insertSelective(cwdUser);
	}
	
	/**
	 * 更新一个对象CwdUser到数据库中
	 * <param name="cwdUser">需要更新的CwdUser</param>
	 */
	protected int cwdUserUpdate(CwdUser cwdUser) {
		CwdUserMapper mapperImpl = this.getSqlSession().getMapper(CwdUserMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(cwdUser);
		return ret;
	}
	
	/**
	 * 更新一个对象CwdUser到数据库中
	 * <param name="cwdUser">需要更新的CwdUser</param>
	 */
	protected int cwdUserUpdateSelective(CwdUser cwdUser) {
		CwdUserMapper mapperImpl = this.getSqlSession().getMapper(CwdUserMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(cwdUser);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象CwdUser到数据库中
	 * <param name="cwdUser">需要更新的CwdUser</param>
	 * <param name="cwdUserQueryCondition">附加的条件</param>
	 */
	protected int cwdUserUpdateByCondition(CwdUser cwdUser, CwdUserExample cwdUserQueryCondition) {
		CwdUserMapper mapperImpl = this.getSqlSession().getMapper(CwdUserMapper.class);
		int ret = mapperImpl.updateByExample(cwdUser, cwdUserQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息CwdUser到数据库中
	 * <param name="cwdUser">需要更新的CwdUser</param>
	 * <param name="cwdUserQueryCondition">附加的条件</param>
	 */
	protected int cwdUserUpdateSelectiveByCondition(CwdUser cwdUser, CwdUserExample cwdUserQueryCondition) {
		CwdUserMapper mapperImpl = this.getSqlSession().getMapper(CwdUserMapper.class);
		int ret = mapperImpl.updateByExampleSelective(cwdUser, cwdUserQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="cwdUser">从数据库中删除一个对象CwdUser</param>
	 * <param name="AId"></param>
	 */
	protected int cwdUserDeleteByPrimaryKey(long AId) {
		CwdUserMapper mapperImpl = this.getSqlSession().getMapper(CwdUserMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="cwdUser">从数据库中删除一个对象CwdUser</param>
	 */
	protected int cwdUserDeleteByCondition(CwdUserExample cwdUserQueryCondition) {
		CwdUserMapper mapperImpl = this.getSqlSession().getMapper(CwdUserMapper.class);
		return mapperImpl.deleteByExample(cwdUserQueryCondition);
	}
	
	/**
	 * <param name="cwdUser">从数据库中查询一个对象CwdUser</param>
	 * <param name="AId"></param>
	 */
	protected CwdUser cwdUserSelectByPrimaryKey(long AId) {
		CwdUserMapper mapperImpl = this.getSqlSession().getMapper(CwdUserMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="cwdUserQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<CwdUser> cwdUserSelectObjects(CwdUserExample cwdUserQueryCondition) {
		CwdUserMapper mapperImpl = this.getSqlSession().getMapper(CwdUserMapper.class);
		return mapperImpl.selectByExample(cwdUserQueryCondition);
	}
	
	/**
	 * <param name="cwdUserQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int cwdUserQuerySelectObjectsCount(CwdUserExample cwdUserQueryCondition) {
		CwdUserMapper mapperImpl = this.getSqlSession().getMapper(CwdUserMapper.class);
		return mapperImpl.countByExample(cwdUserQueryCondition);
	}
	
	/**
	 * 插入一个对象CwdUserAttributes到数据库中
	 * <param name="CwdUserAttributes">需要插入的CwdUserAttributes</param>
	 */
	protected int cwdUserAttributesInsert(CwdUserAttributes cwdUserAttributes) {
		CwdUserAttributesMapper mapperImpl = this.getSqlSession().getMapper(CwdUserAttributesMapper.class);
		return mapperImpl.insertSelective(cwdUserAttributes);
	}
	
	/**
	 * 更新一个对象CwdUserAttributes到数据库中
	 * <param name="cwdUserAttributes">需要更新的CwdUserAttributes</param>
	 */
	protected int cwdUserAttributesUpdate(CwdUserAttributes cwdUserAttributes) {
		CwdUserAttributesMapper mapperImpl = this.getSqlSession().getMapper(CwdUserAttributesMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(cwdUserAttributes);
		return ret;
	}
	
	/**
	 * 更新一个对象CwdUserAttributes到数据库中
	 * <param name="cwdUserAttributes">需要更新的CwdUserAttributes</param>
	 */
	protected int cwdUserAttributesUpdateSelective(CwdUserAttributes cwdUserAttributes) {
		CwdUserAttributesMapper mapperImpl = this.getSqlSession().getMapper(CwdUserAttributesMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(cwdUserAttributes);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象CwdUserAttributes到数据库中
	 * <param name="cwdUserAttributes">需要更新的CwdUserAttributes</param>
	 * <param name="cwdUserAttributesQueryCondition">附加的条件</param>
	 */
	protected int cwdUserAttributesUpdateByCondition(CwdUserAttributes cwdUserAttributes, CwdUserAttributesExample cwdUserAttributesQueryCondition) {
		CwdUserAttributesMapper mapperImpl = this.getSqlSession().getMapper(CwdUserAttributesMapper.class);
		int ret = mapperImpl.updateByExample(cwdUserAttributes, cwdUserAttributesQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息CwdUserAttributes到数据库中
	 * <param name="cwdUserAttributes">需要更新的CwdUserAttributes</param>
	 * <param name="cwdUserAttributesQueryCondition">附加的条件</param>
	 */
	protected int cwdUserAttributesUpdateSelectiveByCondition(CwdUserAttributes cwdUserAttributes, CwdUserAttributesExample cwdUserAttributesQueryCondition) {
		CwdUserAttributesMapper mapperImpl = this.getSqlSession().getMapper(CwdUserAttributesMapper.class);
		int ret = mapperImpl.updateByExampleSelective(cwdUserAttributes, cwdUserAttributesQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="cwdUserAttributes">从数据库中删除一个对象CwdUserAttributes</param>
	 * <param name="AId"></param>
	 */
	protected int cwdUserAttributesDeleteByPrimaryKey(long AId) {
		CwdUserAttributesMapper mapperImpl = this.getSqlSession().getMapper(CwdUserAttributesMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="cwdUserAttributes">从数据库中删除一个对象CwdUserAttributes</param>
	 */
	protected int cwdUserAttributesDeleteByCondition(CwdUserAttributesExample cwdUserAttributesQueryCondition) {
		CwdUserAttributesMapper mapperImpl = this.getSqlSession().getMapper(CwdUserAttributesMapper.class);
		return mapperImpl.deleteByExample(cwdUserAttributesQueryCondition);
	}
	
	/**
	 * <param name="cwdUserAttributes">从数据库中查询一个对象CwdUserAttributes</param>
	 * <param name="AId"></param>
	 */
	protected CwdUserAttributes cwdUserAttributesSelectByPrimaryKey(long AId) {
		CwdUserAttributesMapper mapperImpl = this.getSqlSession().getMapper(CwdUserAttributesMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="cwdUserAttributesQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<CwdUserAttributes> cwdUserAttributesSelectObjects(CwdUserAttributesExample cwdUserAttributesQueryCondition) {
		CwdUserAttributesMapper mapperImpl = this.getSqlSession().getMapper(CwdUserAttributesMapper.class);
		return mapperImpl.selectByExample(cwdUserAttributesQueryCondition);
	}
	
	/**
	 * <param name="cwdUserAttributesQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int cwdUserAttributesQuerySelectObjectsCount(CwdUserAttributesExample cwdUserAttributesQueryCondition) {
		CwdUserAttributesMapper mapperImpl = this.getSqlSession().getMapper(CwdUserAttributesMapper.class);
		return mapperImpl.countByExample(cwdUserAttributesQueryCondition);
	}
	
	/**
	 * 插入一个对象ExternalEntities到数据库中
	 * <param name="ExternalEntities">需要插入的ExternalEntities</param>
	 */
	protected int externalEntitiesInsert(ExternalEntities externalEntities) {
		ExternalEntitiesMapper mapperImpl = this.getSqlSession().getMapper(ExternalEntitiesMapper.class);
		return mapperImpl.insertSelective(externalEntities);
	}
	
	/**
	 * 更新一个对象ExternalEntities到数据库中
	 * <param name="externalEntities">需要更新的ExternalEntities</param>
	 */
	protected int externalEntitiesUpdate(ExternalEntities externalEntities) {
		ExternalEntitiesMapper mapperImpl = this.getSqlSession().getMapper(ExternalEntitiesMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(externalEntities);
		return ret;
	}
	
	/**
	 * 更新一个对象ExternalEntities到数据库中
	 * <param name="externalEntities">需要更新的ExternalEntities</param>
	 */
	protected int externalEntitiesUpdateSelective(ExternalEntities externalEntities) {
		ExternalEntitiesMapper mapperImpl = this.getSqlSession().getMapper(ExternalEntitiesMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(externalEntities);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象ExternalEntities到数据库中
	 * <param name="externalEntities">需要更新的ExternalEntities</param>
	 * <param name="externalEntitiesQueryCondition">附加的条件</param>
	 */
	protected int externalEntitiesUpdateByCondition(ExternalEntities externalEntities, ExternalEntitiesExample externalEntitiesQueryCondition) {
		ExternalEntitiesMapper mapperImpl = this.getSqlSession().getMapper(ExternalEntitiesMapper.class);
		int ret = mapperImpl.updateByExample(externalEntities, externalEntitiesQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息ExternalEntities到数据库中
	 * <param name="externalEntities">需要更新的ExternalEntities</param>
	 * <param name="externalEntitiesQueryCondition">附加的条件</param>
	 */
	protected int externalEntitiesUpdateSelectiveByCondition(ExternalEntities externalEntities, ExternalEntitiesExample externalEntitiesQueryCondition) {
		ExternalEntitiesMapper mapperImpl = this.getSqlSession().getMapper(ExternalEntitiesMapper.class);
		int ret = mapperImpl.updateByExampleSelective(externalEntities, externalEntitiesQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="externalEntities">从数据库中删除一个对象ExternalEntities</param>
	 * <param name="AId"></param>
	 */
	protected int externalEntitiesDeleteByPrimaryKey(long AId) {
		ExternalEntitiesMapper mapperImpl = this.getSqlSession().getMapper(ExternalEntitiesMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="externalEntities">从数据库中删除一个对象ExternalEntities</param>
	 */
	protected int externalEntitiesDeleteByCondition(ExternalEntitiesExample externalEntitiesQueryCondition) {
		ExternalEntitiesMapper mapperImpl = this.getSqlSession().getMapper(ExternalEntitiesMapper.class);
		return mapperImpl.deleteByExample(externalEntitiesQueryCondition);
	}
	
	/**
	 * <param name="externalEntities">从数据库中查询一个对象ExternalEntities</param>
	 * <param name="AId"></param>
	 */
	protected ExternalEntities externalEntitiesSelectByPrimaryKey(long AId) {
		ExternalEntitiesMapper mapperImpl = this.getSqlSession().getMapper(ExternalEntitiesMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="externalEntitiesQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<ExternalEntities> externalEntitiesSelectObjects(ExternalEntitiesExample externalEntitiesQueryCondition) {
		ExternalEntitiesMapper mapperImpl = this.getSqlSession().getMapper(ExternalEntitiesMapper.class);
		return mapperImpl.selectByExample(externalEntitiesQueryCondition);
	}
	
	/**
	 * <param name="externalEntitiesQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int externalEntitiesQuerySelectObjectsCount(ExternalEntitiesExample externalEntitiesQueryCondition) {
		ExternalEntitiesMapper mapperImpl = this.getSqlSession().getMapper(ExternalEntitiesMapper.class);
		return mapperImpl.countByExample(externalEntitiesQueryCondition);
	}
	
	/**
	 * 插入一个对象Externalgadget到数据库中
	 * <param name="Externalgadget">需要插入的Externalgadget</param>
	 */
	protected int externalgadgetInsert(Externalgadget externalgadget) {
		ExternalgadgetMapper mapperImpl = this.getSqlSession().getMapper(ExternalgadgetMapper.class);
		return mapperImpl.insertSelective(externalgadget);
	}
	
	/**
	 * 更新一个对象Externalgadget到数据库中
	 * <param name="externalgadget">需要更新的Externalgadget</param>
	 */
	public int externalgadgetUpdateWithBlobs(Externalgadget externalgadget) {
		ExternalgadgetMapper mapperImpl = this.getSqlSession().getMapper(ExternalgadgetMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(externalgadget);
	}
	
	/**
	 * 根据条件更新一批对象Externalgadget到数据库中
	 * <param name="externalgadget">需要更新的Externalgadget</param>
	 * <param name="externalgadgetQueryCondition">附加的条件</param>
	 */
	protected int externalgadgetUpdateByCondition(Externalgadget externalgadget, ExternalgadgetExample externalgadgetQueryCondition) {
		ExternalgadgetMapper mapperImpl = this.getSqlSession().getMapper(ExternalgadgetMapper.class);
		int ret = mapperImpl.updateByExample(externalgadget, externalgadgetQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Externalgadget到数据库中
	 * <param name="externalgadget">需要更新的Externalgadget</param>
	 * <param name="externalgadgetQueryCondition">附加的条件</param>
	 */
	protected int externalgadgetUpdateSelectiveByCondition(Externalgadget externalgadget, ExternalgadgetExample externalgadgetQueryCondition) {
		ExternalgadgetMapper mapperImpl = this.getSqlSession().getMapper(ExternalgadgetMapper.class);
		int ret = mapperImpl.updateByExampleSelective(externalgadget, externalgadgetQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="externalgadget">从数据库中删除一个对象Externalgadget</param>
	 * <param name="AId"></param>
	 */
	protected int externalgadgetDeleteByPrimaryKey(long AId) {
		ExternalgadgetMapper mapperImpl = this.getSqlSession().getMapper(ExternalgadgetMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="externalgadget">从数据库中删除一个对象Externalgadget</param>
	 */
	protected int externalgadgetDeleteByCondition(ExternalgadgetExample externalgadgetQueryCondition) {
		ExternalgadgetMapper mapperImpl = this.getSqlSession().getMapper(ExternalgadgetMapper.class);
		return mapperImpl.deleteByExample(externalgadgetQueryCondition);
	}
	
	/**
	 * <param name="externalgadget">从数据库中查询一个对象Externalgadget</param>
	 * <param name="AId"></param>
	 */
	protected Externalgadget externalgadgetSelectByPrimaryKey(long AId) {
		ExternalgadgetMapper mapperImpl = this.getSqlSession().getMapper(ExternalgadgetMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="externalgadgetQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Externalgadget> externalgadgetSelectObjects(ExternalgadgetExample externalgadgetQueryCondition) {
		ExternalgadgetMapper mapperImpl = this.getSqlSession().getMapper(ExternalgadgetMapper.class);
		return mapperImpl.selectByExample(externalgadgetQueryCondition);
	}
	
	/**
	 * <param name="externalgadgetQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Externalgadget> externalgadgetSelectObjectsWithBLOBs(ExternalgadgetExample externalgadgetQueryCondition) {
		ExternalgadgetMapper mapperImpl = this.getSqlSession().getMapper(ExternalgadgetMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(externalgadgetQueryCondition);
	}
	
	/**
	 * <param name="externalgadgetQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int externalgadgetQuerySelectObjectsCount(ExternalgadgetExample externalgadgetQueryCondition) {
		ExternalgadgetMapper mapperImpl = this.getSqlSession().getMapper(ExternalgadgetMapper.class);
		return mapperImpl.countByExample(externalgadgetQueryCondition);
	}
	
	/**
	 * 插入一个对象Favouriteassociations到数据库中
	 * <param name="Favouriteassociations">需要插入的Favouriteassociations</param>
	 */
	protected int favouriteassociationsInsert(Favouriteassociations favouriteassociations) {
		FavouriteassociationsMapper mapperImpl = this.getSqlSession().getMapper(FavouriteassociationsMapper.class);
		return mapperImpl.insertSelective(favouriteassociations);
	}
	
	/**
	 * 更新一个对象Favouriteassociations到数据库中
	 * <param name="favouriteassociations">需要更新的Favouriteassociations</param>
	 */
	protected int favouriteassociationsUpdate(Favouriteassociations favouriteassociations) {
		FavouriteassociationsMapper mapperImpl = this.getSqlSession().getMapper(FavouriteassociationsMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(favouriteassociations);
		return ret;
	}
	
	/**
	 * 更新一个对象Favouriteassociations到数据库中
	 * <param name="favouriteassociations">需要更新的Favouriteassociations</param>
	 */
	protected int favouriteassociationsUpdateSelective(Favouriteassociations favouriteassociations) {
		FavouriteassociationsMapper mapperImpl = this.getSqlSession().getMapper(FavouriteassociationsMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(favouriteassociations);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Favouriteassociations到数据库中
	 * <param name="favouriteassociations">需要更新的Favouriteassociations</param>
	 * <param name="favouriteassociationsQueryCondition">附加的条件</param>
	 */
	protected int favouriteassociationsUpdateByCondition(Favouriteassociations favouriteassociations, FavouriteassociationsExample favouriteassociationsQueryCondition) {
		FavouriteassociationsMapper mapperImpl = this.getSqlSession().getMapper(FavouriteassociationsMapper.class);
		int ret = mapperImpl.updateByExample(favouriteassociations, favouriteassociationsQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Favouriteassociations到数据库中
	 * <param name="favouriteassociations">需要更新的Favouriteassociations</param>
	 * <param name="favouriteassociationsQueryCondition">附加的条件</param>
	 */
	protected int favouriteassociationsUpdateSelectiveByCondition(Favouriteassociations favouriteassociations, FavouriteassociationsExample favouriteassociationsQueryCondition) {
		FavouriteassociationsMapper mapperImpl = this.getSqlSession().getMapper(FavouriteassociationsMapper.class);
		int ret = mapperImpl.updateByExampleSelective(favouriteassociations, favouriteassociationsQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="favouriteassociations">从数据库中删除一个对象Favouriteassociations</param>
	 * <param name="AId"></param>
	 */
	protected int favouriteassociationsDeleteByPrimaryKey(long AId) {
		FavouriteassociationsMapper mapperImpl = this.getSqlSession().getMapper(FavouriteassociationsMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="favouriteassociations">从数据库中删除一个对象Favouriteassociations</param>
	 */
	protected int favouriteassociationsDeleteByCondition(FavouriteassociationsExample favouriteassociationsQueryCondition) {
		FavouriteassociationsMapper mapperImpl = this.getSqlSession().getMapper(FavouriteassociationsMapper.class);
		return mapperImpl.deleteByExample(favouriteassociationsQueryCondition);
	}
	
	/**
	 * <param name="favouriteassociations">从数据库中查询一个对象Favouriteassociations</param>
	 * <param name="AId"></param>
	 */
	protected Favouriteassociations favouriteassociationsSelectByPrimaryKey(long AId) {
		FavouriteassociationsMapper mapperImpl = this.getSqlSession().getMapper(FavouriteassociationsMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="favouriteassociationsQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Favouriteassociations> favouriteassociationsSelectObjects(FavouriteassociationsExample favouriteassociationsQueryCondition) {
		FavouriteassociationsMapper mapperImpl = this.getSqlSession().getMapper(FavouriteassociationsMapper.class);
		return mapperImpl.selectByExample(favouriteassociationsQueryCondition);
	}
	
	/**
	 * <param name="favouriteassociationsQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int favouriteassociationsQuerySelectObjectsCount(FavouriteassociationsExample favouriteassociationsQueryCondition) {
		FavouriteassociationsMapper mapperImpl = this.getSqlSession().getMapper(FavouriteassociationsMapper.class);
		return mapperImpl.countByExample(favouriteassociationsQueryCondition);
	}
	
	/**
	 * 插入一个对象Fieldconfigscheme到数据库中
	 * <param name="Fieldconfigscheme">需要插入的Fieldconfigscheme</param>
	 */
	protected int fieldconfigschemeInsert(Fieldconfigscheme fieldconfigscheme) {
		FieldconfigschemeMapper mapperImpl = this.getSqlSession().getMapper(FieldconfigschemeMapper.class);
		return mapperImpl.insertSelective(fieldconfigscheme);
	}
	
	/**
	 * 更新一个对象Fieldconfigscheme到数据库中
	 * <param name="fieldconfigscheme">需要更新的Fieldconfigscheme</param>
	 */
	protected int fieldconfigschemeUpdate(Fieldconfigscheme fieldconfigscheme) {
		FieldconfigschemeMapper mapperImpl = this.getSqlSession().getMapper(FieldconfigschemeMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(fieldconfigscheme);
		return ret;
	}
	
	/**
	 * 更新一个对象Fieldconfigscheme到数据库中
	 * <param name="fieldconfigscheme">需要更新的Fieldconfigscheme</param>
	 */
	protected int fieldconfigschemeUpdateSelective(Fieldconfigscheme fieldconfigscheme) {
		FieldconfigschemeMapper mapperImpl = this.getSqlSession().getMapper(FieldconfigschemeMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(fieldconfigscheme);
		return ret;
	}
	
	/**
	 * 更新一个对象Fieldconfigscheme到数据库中
	 * <param name="fieldconfigscheme">需要更新的Fieldconfigscheme</param>
	 */
	public int fieldconfigschemeUpdateWithBlobs(Fieldconfigscheme fieldconfigscheme) {
		FieldconfigschemeMapper mapperImpl = this.getSqlSession().getMapper(FieldconfigschemeMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(fieldconfigscheme);
	}
	
	/**
	 * 根据条件更新一批对象Fieldconfigscheme到数据库中
	 * <param name="fieldconfigscheme">需要更新的Fieldconfigscheme</param>
	 * <param name="fieldconfigschemeQueryCondition">附加的条件</param>
	 */
	protected int fieldconfigschemeUpdateByCondition(Fieldconfigscheme fieldconfigscheme, FieldconfigschemeExample fieldconfigschemeQueryCondition) {
		FieldconfigschemeMapper mapperImpl = this.getSqlSession().getMapper(FieldconfigschemeMapper.class);
		int ret = mapperImpl.updateByExample(fieldconfigscheme, fieldconfigschemeQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Fieldconfigscheme到数据库中
	 * <param name="fieldconfigscheme">需要更新的Fieldconfigscheme</param>
	 * <param name="fieldconfigschemeQueryCondition">附加的条件</param>
	 */
	protected int fieldconfigschemeUpdateSelectiveByCondition(Fieldconfigscheme fieldconfigscheme, FieldconfigschemeExample fieldconfigschemeQueryCondition) {
		FieldconfigschemeMapper mapperImpl = this.getSqlSession().getMapper(FieldconfigschemeMapper.class);
		int ret = mapperImpl.updateByExampleSelective(fieldconfigscheme, fieldconfigschemeQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="fieldconfigscheme">从数据库中删除一个对象Fieldconfigscheme</param>
	 * <param name="AId"></param>
	 */
	protected int fieldconfigschemeDeleteByPrimaryKey(long AId) {
		FieldconfigschemeMapper mapperImpl = this.getSqlSession().getMapper(FieldconfigschemeMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fieldconfigscheme">从数据库中删除一个对象Fieldconfigscheme</param>
	 */
	protected int fieldconfigschemeDeleteByCondition(FieldconfigschemeExample fieldconfigschemeQueryCondition) {
		FieldconfigschemeMapper mapperImpl = this.getSqlSession().getMapper(FieldconfigschemeMapper.class);
		return mapperImpl.deleteByExample(fieldconfigschemeQueryCondition);
	}
	
	/**
	 * <param name="fieldconfigscheme">从数据库中查询一个对象Fieldconfigscheme</param>
	 * <param name="AId"></param>
	 */
	protected Fieldconfigscheme fieldconfigschemeSelectByPrimaryKey(long AId) {
		FieldconfigschemeMapper mapperImpl = this.getSqlSession().getMapper(FieldconfigschemeMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fieldconfigschemeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Fieldconfigscheme> fieldconfigschemeSelectObjects(FieldconfigschemeExample fieldconfigschemeQueryCondition) {
		FieldconfigschemeMapper mapperImpl = this.getSqlSession().getMapper(FieldconfigschemeMapper.class);
		return mapperImpl.selectByExample(fieldconfigschemeQueryCondition);
	}
	
	/**
	 * <param name="fieldconfigschemeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Fieldconfigscheme> fieldconfigschemeSelectObjectsWithBLOBs(FieldconfigschemeExample fieldconfigschemeQueryCondition) {
		FieldconfigschemeMapper mapperImpl = this.getSqlSession().getMapper(FieldconfigschemeMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(fieldconfigschemeQueryCondition);
	}
	
	/**
	 * <param name="fieldconfigschemeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int fieldconfigschemeQuerySelectObjectsCount(FieldconfigschemeExample fieldconfigschemeQueryCondition) {
		FieldconfigschemeMapper mapperImpl = this.getSqlSession().getMapper(FieldconfigschemeMapper.class);
		return mapperImpl.countByExample(fieldconfigschemeQueryCondition);
	}
	
	/**
	 * 插入一个对象Fieldconfigschemeissuetype到数据库中
	 * <param name="Fieldconfigschemeissuetype">需要插入的Fieldconfigschemeissuetype</param>
	 */
	protected int fieldconfigschemeissuetypeInsert(Fieldconfigschemeissuetype fieldconfigschemeissuetype) {
		FieldconfigschemeissuetypeMapper mapperImpl = this.getSqlSession().getMapper(FieldconfigschemeissuetypeMapper.class);
		return mapperImpl.insertSelective(fieldconfigschemeissuetype);
	}
	
	/**
	 * 更新一个对象Fieldconfigschemeissuetype到数据库中
	 * <param name="fieldconfigschemeissuetype">需要更新的Fieldconfigschemeissuetype</param>
	 */
	protected int fieldconfigschemeissuetypeUpdate(Fieldconfigschemeissuetype fieldconfigschemeissuetype) {
		FieldconfigschemeissuetypeMapper mapperImpl = this.getSqlSession().getMapper(FieldconfigschemeissuetypeMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(fieldconfigschemeissuetype);
		return ret;
	}
	
	/**
	 * 更新一个对象Fieldconfigschemeissuetype到数据库中
	 * <param name="fieldconfigschemeissuetype">需要更新的Fieldconfigschemeissuetype</param>
	 */
	protected int fieldconfigschemeissuetypeUpdateSelective(Fieldconfigschemeissuetype fieldconfigschemeissuetype) {
		FieldconfigschemeissuetypeMapper mapperImpl = this.getSqlSession().getMapper(FieldconfigschemeissuetypeMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(fieldconfigschemeissuetype);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Fieldconfigschemeissuetype到数据库中
	 * <param name="fieldconfigschemeissuetype">需要更新的Fieldconfigschemeissuetype</param>
	 * <param name="fieldconfigschemeissuetypeQueryCondition">附加的条件</param>
	 */
	protected int fieldconfigschemeissuetypeUpdateByCondition(Fieldconfigschemeissuetype fieldconfigschemeissuetype, FieldconfigschemeissuetypeExample fieldconfigschemeissuetypeQueryCondition) {
		FieldconfigschemeissuetypeMapper mapperImpl = this.getSqlSession().getMapper(FieldconfigschemeissuetypeMapper.class);
		int ret = mapperImpl.updateByExample(fieldconfigschemeissuetype, fieldconfigschemeissuetypeQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Fieldconfigschemeissuetype到数据库中
	 * <param name="fieldconfigschemeissuetype">需要更新的Fieldconfigschemeissuetype</param>
	 * <param name="fieldconfigschemeissuetypeQueryCondition">附加的条件</param>
	 */
	protected int fieldconfigschemeissuetypeUpdateSelectiveByCondition(Fieldconfigschemeissuetype fieldconfigschemeissuetype, FieldconfigschemeissuetypeExample fieldconfigschemeissuetypeQueryCondition) {
		FieldconfigschemeissuetypeMapper mapperImpl = this.getSqlSession().getMapper(FieldconfigschemeissuetypeMapper.class);
		int ret = mapperImpl.updateByExampleSelective(fieldconfigschemeissuetype, fieldconfigschemeissuetypeQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="fieldconfigschemeissuetype">从数据库中删除一个对象Fieldconfigschemeissuetype</param>
	 * <param name="AId"></param>
	 */
	protected int fieldconfigschemeissuetypeDeleteByPrimaryKey(long AId) {
		FieldconfigschemeissuetypeMapper mapperImpl = this.getSqlSession().getMapper(FieldconfigschemeissuetypeMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fieldconfigschemeissuetype">从数据库中删除一个对象Fieldconfigschemeissuetype</param>
	 */
	protected int fieldconfigschemeissuetypeDeleteByCondition(FieldconfigschemeissuetypeExample fieldconfigschemeissuetypeQueryCondition) {
		FieldconfigschemeissuetypeMapper mapperImpl = this.getSqlSession().getMapper(FieldconfigschemeissuetypeMapper.class);
		return mapperImpl.deleteByExample(fieldconfigschemeissuetypeQueryCondition);
	}
	
	/**
	 * <param name="fieldconfigschemeissuetype">从数据库中查询一个对象Fieldconfigschemeissuetype</param>
	 * <param name="AId"></param>
	 */
	protected Fieldconfigschemeissuetype fieldconfigschemeissuetypeSelectByPrimaryKey(long AId) {
		FieldconfigschemeissuetypeMapper mapperImpl = this.getSqlSession().getMapper(FieldconfigschemeissuetypeMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fieldconfigschemeissuetypeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Fieldconfigschemeissuetype> fieldconfigschemeissuetypeSelectObjects(FieldconfigschemeissuetypeExample fieldconfigschemeissuetypeQueryCondition) {
		FieldconfigschemeissuetypeMapper mapperImpl = this.getSqlSession().getMapper(FieldconfigschemeissuetypeMapper.class);
		return mapperImpl.selectByExample(fieldconfigschemeissuetypeQueryCondition);
	}
	
	/**
	 * <param name="fieldconfigschemeissuetypeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int fieldconfigschemeissuetypeQuerySelectObjectsCount(FieldconfigschemeissuetypeExample fieldconfigschemeissuetypeQueryCondition) {
		FieldconfigschemeissuetypeMapper mapperImpl = this.getSqlSession().getMapper(FieldconfigschemeissuetypeMapper.class);
		return mapperImpl.countByExample(fieldconfigschemeissuetypeQueryCondition);
	}
	
	/**
	 * 插入一个对象Fieldconfiguration到数据库中
	 * <param name="Fieldconfiguration">需要插入的Fieldconfiguration</param>
	 */
	protected int fieldconfigurationInsert(Fieldconfiguration fieldconfiguration) {
		FieldconfigurationMapper mapperImpl = this.getSqlSession().getMapper(FieldconfigurationMapper.class);
		return mapperImpl.insertSelective(fieldconfiguration);
	}
	
	/**
	 * 更新一个对象Fieldconfiguration到数据库中
	 * <param name="fieldconfiguration">需要更新的Fieldconfiguration</param>
	 */
	protected int fieldconfigurationUpdate(Fieldconfiguration fieldconfiguration) {
		FieldconfigurationMapper mapperImpl = this.getSqlSession().getMapper(FieldconfigurationMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(fieldconfiguration);
		return ret;
	}
	
	/**
	 * 更新一个对象Fieldconfiguration到数据库中
	 * <param name="fieldconfiguration">需要更新的Fieldconfiguration</param>
	 */
	protected int fieldconfigurationUpdateSelective(Fieldconfiguration fieldconfiguration) {
		FieldconfigurationMapper mapperImpl = this.getSqlSession().getMapper(FieldconfigurationMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(fieldconfiguration);
		return ret;
	}
	
	/**
	 * 更新一个对象Fieldconfiguration到数据库中
	 * <param name="fieldconfiguration">需要更新的Fieldconfiguration</param>
	 */
	public int fieldconfigurationUpdateWithBlobs(Fieldconfiguration fieldconfiguration) {
		FieldconfigurationMapper mapperImpl = this.getSqlSession().getMapper(FieldconfigurationMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(fieldconfiguration);
	}
	
	/**
	 * 根据条件更新一批对象Fieldconfiguration到数据库中
	 * <param name="fieldconfiguration">需要更新的Fieldconfiguration</param>
	 * <param name="fieldconfigurationQueryCondition">附加的条件</param>
	 */
	protected int fieldconfigurationUpdateByCondition(Fieldconfiguration fieldconfiguration, FieldconfigurationExample fieldconfigurationQueryCondition) {
		FieldconfigurationMapper mapperImpl = this.getSqlSession().getMapper(FieldconfigurationMapper.class);
		int ret = mapperImpl.updateByExample(fieldconfiguration, fieldconfigurationQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Fieldconfiguration到数据库中
	 * <param name="fieldconfiguration">需要更新的Fieldconfiguration</param>
	 * <param name="fieldconfigurationQueryCondition">附加的条件</param>
	 */
	protected int fieldconfigurationUpdateSelectiveByCondition(Fieldconfiguration fieldconfiguration, FieldconfigurationExample fieldconfigurationQueryCondition) {
		FieldconfigurationMapper mapperImpl = this.getSqlSession().getMapper(FieldconfigurationMapper.class);
		int ret = mapperImpl.updateByExampleSelective(fieldconfiguration, fieldconfigurationQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="fieldconfiguration">从数据库中删除一个对象Fieldconfiguration</param>
	 * <param name="AId"></param>
	 */
	protected int fieldconfigurationDeleteByPrimaryKey(long AId) {
		FieldconfigurationMapper mapperImpl = this.getSqlSession().getMapper(FieldconfigurationMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fieldconfiguration">从数据库中删除一个对象Fieldconfiguration</param>
	 */
	protected int fieldconfigurationDeleteByCondition(FieldconfigurationExample fieldconfigurationQueryCondition) {
		FieldconfigurationMapper mapperImpl = this.getSqlSession().getMapper(FieldconfigurationMapper.class);
		return mapperImpl.deleteByExample(fieldconfigurationQueryCondition);
	}
	
	/**
	 * <param name="fieldconfiguration">从数据库中查询一个对象Fieldconfiguration</param>
	 * <param name="AId"></param>
	 */
	protected Fieldconfiguration fieldconfigurationSelectByPrimaryKey(long AId) {
		FieldconfigurationMapper mapperImpl = this.getSqlSession().getMapper(FieldconfigurationMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fieldconfigurationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Fieldconfiguration> fieldconfigurationSelectObjects(FieldconfigurationExample fieldconfigurationQueryCondition) {
		FieldconfigurationMapper mapperImpl = this.getSqlSession().getMapper(FieldconfigurationMapper.class);
		return mapperImpl.selectByExample(fieldconfigurationQueryCondition);
	}
	
	/**
	 * <param name="fieldconfigurationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Fieldconfiguration> fieldconfigurationSelectObjectsWithBLOBs(FieldconfigurationExample fieldconfigurationQueryCondition) {
		FieldconfigurationMapper mapperImpl = this.getSqlSession().getMapper(FieldconfigurationMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(fieldconfigurationQueryCondition);
	}
	
	/**
	 * <param name="fieldconfigurationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int fieldconfigurationQuerySelectObjectsCount(FieldconfigurationExample fieldconfigurationQueryCondition) {
		FieldconfigurationMapper mapperImpl = this.getSqlSession().getMapper(FieldconfigurationMapper.class);
		return mapperImpl.countByExample(fieldconfigurationQueryCondition);
	}
	
	/**
	 * 插入一个对象Fieldlayout到数据库中
	 * <param name="Fieldlayout">需要插入的Fieldlayout</param>
	 */
	protected int fieldlayoutInsert(Fieldlayout fieldlayout) {
		FieldlayoutMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutMapper.class);
		return mapperImpl.insertSelective(fieldlayout);
	}
	
	/**
	 * 更新一个对象Fieldlayout到数据库中
	 * <param name="fieldlayout">需要更新的Fieldlayout</param>
	 */
	protected int fieldlayoutUpdate(Fieldlayout fieldlayout) {
		FieldlayoutMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(fieldlayout);
		return ret;
	}
	
	/**
	 * 更新一个对象Fieldlayout到数据库中
	 * <param name="fieldlayout">需要更新的Fieldlayout</param>
	 */
	protected int fieldlayoutUpdateSelective(Fieldlayout fieldlayout) {
		FieldlayoutMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(fieldlayout);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Fieldlayout到数据库中
	 * <param name="fieldlayout">需要更新的Fieldlayout</param>
	 * <param name="fieldlayoutQueryCondition">附加的条件</param>
	 */
	protected int fieldlayoutUpdateByCondition(Fieldlayout fieldlayout, FieldlayoutExample fieldlayoutQueryCondition) {
		FieldlayoutMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutMapper.class);
		int ret = mapperImpl.updateByExample(fieldlayout, fieldlayoutQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Fieldlayout到数据库中
	 * <param name="fieldlayout">需要更新的Fieldlayout</param>
	 * <param name="fieldlayoutQueryCondition">附加的条件</param>
	 */
	protected int fieldlayoutUpdateSelectiveByCondition(Fieldlayout fieldlayout, FieldlayoutExample fieldlayoutQueryCondition) {
		FieldlayoutMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutMapper.class);
		int ret = mapperImpl.updateByExampleSelective(fieldlayout, fieldlayoutQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="fieldlayout">从数据库中删除一个对象Fieldlayout</param>
	 * <param name="AId"></param>
	 */
	protected int fieldlayoutDeleteByPrimaryKey(long AId) {
		FieldlayoutMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fieldlayout">从数据库中删除一个对象Fieldlayout</param>
	 */
	protected int fieldlayoutDeleteByCondition(FieldlayoutExample fieldlayoutQueryCondition) {
		FieldlayoutMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutMapper.class);
		return mapperImpl.deleteByExample(fieldlayoutQueryCondition);
	}
	
	/**
	 * <param name="fieldlayout">从数据库中查询一个对象Fieldlayout</param>
	 * <param name="AId"></param>
	 */
	protected Fieldlayout fieldlayoutSelectByPrimaryKey(long AId) {
		FieldlayoutMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fieldlayoutQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Fieldlayout> fieldlayoutSelectObjects(FieldlayoutExample fieldlayoutQueryCondition) {
		FieldlayoutMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutMapper.class);
		return mapperImpl.selectByExample(fieldlayoutQueryCondition);
	}
	
	/**
	 * <param name="fieldlayoutQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int fieldlayoutQuerySelectObjectsCount(FieldlayoutExample fieldlayoutQueryCondition) {
		FieldlayoutMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutMapper.class);
		return mapperImpl.countByExample(fieldlayoutQueryCondition);
	}
	
	/**
	 * 插入一个对象Fieldlayoutitem到数据库中
	 * <param name="Fieldlayoutitem">需要插入的Fieldlayoutitem</param>
	 */
	protected int fieldlayoutitemInsert(Fieldlayoutitem fieldlayoutitem) {
		FieldlayoutitemMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutitemMapper.class);
		return mapperImpl.insertSelective(fieldlayoutitem);
	}
	
	/**
	 * 更新一个对象Fieldlayoutitem到数据库中
	 * <param name="fieldlayoutitem">需要更新的Fieldlayoutitem</param>
	 */
	protected int fieldlayoutitemUpdate(Fieldlayoutitem fieldlayoutitem) {
		FieldlayoutitemMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutitemMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(fieldlayoutitem);
		return ret;
	}
	
	/**
	 * 更新一个对象Fieldlayoutitem到数据库中
	 * <param name="fieldlayoutitem">需要更新的Fieldlayoutitem</param>
	 */
	protected int fieldlayoutitemUpdateSelective(Fieldlayoutitem fieldlayoutitem) {
		FieldlayoutitemMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutitemMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(fieldlayoutitem);
		return ret;
	}
	
	/**
	 * 更新一个对象Fieldlayoutitem到数据库中
	 * <param name="fieldlayoutitem">需要更新的Fieldlayoutitem</param>
	 */
	public int fieldlayoutitemUpdateWithBlobs(Fieldlayoutitem fieldlayoutitem) {
		FieldlayoutitemMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutitemMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(fieldlayoutitem);
	}
	
	/**
	 * 根据条件更新一批对象Fieldlayoutitem到数据库中
	 * <param name="fieldlayoutitem">需要更新的Fieldlayoutitem</param>
	 * <param name="fieldlayoutitemQueryCondition">附加的条件</param>
	 */
	protected int fieldlayoutitemUpdateByCondition(Fieldlayoutitem fieldlayoutitem, FieldlayoutitemExample fieldlayoutitemQueryCondition) {
		FieldlayoutitemMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutitemMapper.class);
		int ret = mapperImpl.updateByExample(fieldlayoutitem, fieldlayoutitemQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Fieldlayoutitem到数据库中
	 * <param name="fieldlayoutitem">需要更新的Fieldlayoutitem</param>
	 * <param name="fieldlayoutitemQueryCondition">附加的条件</param>
	 */
	protected int fieldlayoutitemUpdateSelectiveByCondition(Fieldlayoutitem fieldlayoutitem, FieldlayoutitemExample fieldlayoutitemQueryCondition) {
		FieldlayoutitemMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutitemMapper.class);
		int ret = mapperImpl.updateByExampleSelective(fieldlayoutitem, fieldlayoutitemQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="fieldlayoutitem">从数据库中删除一个对象Fieldlayoutitem</param>
	 * <param name="AId"></param>
	 */
	protected int fieldlayoutitemDeleteByPrimaryKey(long AId) {
		FieldlayoutitemMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutitemMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fieldlayoutitem">从数据库中删除一个对象Fieldlayoutitem</param>
	 */
	protected int fieldlayoutitemDeleteByCondition(FieldlayoutitemExample fieldlayoutitemQueryCondition) {
		FieldlayoutitemMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutitemMapper.class);
		return mapperImpl.deleteByExample(fieldlayoutitemQueryCondition);
	}
	
	/**
	 * <param name="fieldlayoutitem">从数据库中查询一个对象Fieldlayoutitem</param>
	 * <param name="AId"></param>
	 */
	protected Fieldlayoutitem fieldlayoutitemSelectByPrimaryKey(long AId) {
		FieldlayoutitemMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutitemMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fieldlayoutitemQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Fieldlayoutitem> fieldlayoutitemSelectObjects(FieldlayoutitemExample fieldlayoutitemQueryCondition) {
		FieldlayoutitemMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutitemMapper.class);
		return mapperImpl.selectByExample(fieldlayoutitemQueryCondition);
	}
	
	/**
	 * <param name="fieldlayoutitemQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Fieldlayoutitem> fieldlayoutitemSelectObjectsWithBLOBs(FieldlayoutitemExample fieldlayoutitemQueryCondition) {
		FieldlayoutitemMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutitemMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(fieldlayoutitemQueryCondition);
	}
	
	/**
	 * <param name="fieldlayoutitemQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int fieldlayoutitemQuerySelectObjectsCount(FieldlayoutitemExample fieldlayoutitemQueryCondition) {
		FieldlayoutitemMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutitemMapper.class);
		return mapperImpl.countByExample(fieldlayoutitemQueryCondition);
	}
	
	/**
	 * 插入一个对象Fieldlayoutscheme到数据库中
	 * <param name="Fieldlayoutscheme">需要插入的Fieldlayoutscheme</param>
	 */
	protected int fieldlayoutschemeInsert(Fieldlayoutscheme fieldlayoutscheme) {
		FieldlayoutschemeMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutschemeMapper.class);
		return mapperImpl.insertSelective(fieldlayoutscheme);
	}
	
	/**
	 * 更新一个对象Fieldlayoutscheme到数据库中
	 * <param name="fieldlayoutscheme">需要更新的Fieldlayoutscheme</param>
	 */
	protected int fieldlayoutschemeUpdate(Fieldlayoutscheme fieldlayoutscheme) {
		FieldlayoutschemeMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutschemeMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(fieldlayoutscheme);
		return ret;
	}
	
	/**
	 * 更新一个对象Fieldlayoutscheme到数据库中
	 * <param name="fieldlayoutscheme">需要更新的Fieldlayoutscheme</param>
	 */
	protected int fieldlayoutschemeUpdateSelective(Fieldlayoutscheme fieldlayoutscheme) {
		FieldlayoutschemeMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutschemeMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(fieldlayoutscheme);
		return ret;
	}
	
	/**
	 * 更新一个对象Fieldlayoutscheme到数据库中
	 * <param name="fieldlayoutscheme">需要更新的Fieldlayoutscheme</param>
	 */
	public int fieldlayoutschemeUpdateWithBlobs(Fieldlayoutscheme fieldlayoutscheme) {
		FieldlayoutschemeMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutschemeMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(fieldlayoutscheme);
	}
	
	/**
	 * 根据条件更新一批对象Fieldlayoutscheme到数据库中
	 * <param name="fieldlayoutscheme">需要更新的Fieldlayoutscheme</param>
	 * <param name="fieldlayoutschemeQueryCondition">附加的条件</param>
	 */
	protected int fieldlayoutschemeUpdateByCondition(Fieldlayoutscheme fieldlayoutscheme, FieldlayoutschemeExample fieldlayoutschemeQueryCondition) {
		FieldlayoutschemeMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutschemeMapper.class);
		int ret = mapperImpl.updateByExample(fieldlayoutscheme, fieldlayoutschemeQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Fieldlayoutscheme到数据库中
	 * <param name="fieldlayoutscheme">需要更新的Fieldlayoutscheme</param>
	 * <param name="fieldlayoutschemeQueryCondition">附加的条件</param>
	 */
	protected int fieldlayoutschemeUpdateSelectiveByCondition(Fieldlayoutscheme fieldlayoutscheme, FieldlayoutschemeExample fieldlayoutschemeQueryCondition) {
		FieldlayoutschemeMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutschemeMapper.class);
		int ret = mapperImpl.updateByExampleSelective(fieldlayoutscheme, fieldlayoutschemeQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="fieldlayoutscheme">从数据库中删除一个对象Fieldlayoutscheme</param>
	 * <param name="AId"></param>
	 */
	protected int fieldlayoutschemeDeleteByPrimaryKey(long AId) {
		FieldlayoutschemeMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutschemeMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fieldlayoutscheme">从数据库中删除一个对象Fieldlayoutscheme</param>
	 */
	protected int fieldlayoutschemeDeleteByCondition(FieldlayoutschemeExample fieldlayoutschemeQueryCondition) {
		FieldlayoutschemeMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutschemeMapper.class);
		return mapperImpl.deleteByExample(fieldlayoutschemeQueryCondition);
	}
	
	/**
	 * <param name="fieldlayoutscheme">从数据库中查询一个对象Fieldlayoutscheme</param>
	 * <param name="AId"></param>
	 */
	protected Fieldlayoutscheme fieldlayoutschemeSelectByPrimaryKey(long AId) {
		FieldlayoutschemeMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutschemeMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fieldlayoutschemeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Fieldlayoutscheme> fieldlayoutschemeSelectObjects(FieldlayoutschemeExample fieldlayoutschemeQueryCondition) {
		FieldlayoutschemeMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutschemeMapper.class);
		return mapperImpl.selectByExample(fieldlayoutschemeQueryCondition);
	}
	
	/**
	 * <param name="fieldlayoutschemeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Fieldlayoutscheme> fieldlayoutschemeSelectObjectsWithBLOBs(FieldlayoutschemeExample fieldlayoutschemeQueryCondition) {
		FieldlayoutschemeMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutschemeMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(fieldlayoutschemeQueryCondition);
	}
	
	/**
	 * <param name="fieldlayoutschemeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int fieldlayoutschemeQuerySelectObjectsCount(FieldlayoutschemeExample fieldlayoutschemeQueryCondition) {
		FieldlayoutschemeMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutschemeMapper.class);
		return mapperImpl.countByExample(fieldlayoutschemeQueryCondition);
	}
	
	/**
	 * 插入一个对象Fieldlayoutschemeassociation到数据库中
	 * <param name="Fieldlayoutschemeassociation">需要插入的Fieldlayoutschemeassociation</param>
	 */
	protected int fieldlayoutschemeassociationInsert(Fieldlayoutschemeassociation fieldlayoutschemeassociation) {
		FieldlayoutschemeassociationMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutschemeassociationMapper.class);
		return mapperImpl.insertSelective(fieldlayoutschemeassociation);
	}
	
	/**
	 * 更新一个对象Fieldlayoutschemeassociation到数据库中
	 * <param name="fieldlayoutschemeassociation">需要更新的Fieldlayoutschemeassociation</param>
	 */
	protected int fieldlayoutschemeassociationUpdate(Fieldlayoutschemeassociation fieldlayoutschemeassociation) {
		FieldlayoutschemeassociationMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutschemeassociationMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(fieldlayoutschemeassociation);
		return ret;
	}
	
	/**
	 * 更新一个对象Fieldlayoutschemeassociation到数据库中
	 * <param name="fieldlayoutschemeassociation">需要更新的Fieldlayoutschemeassociation</param>
	 */
	protected int fieldlayoutschemeassociationUpdateSelective(Fieldlayoutschemeassociation fieldlayoutschemeassociation) {
		FieldlayoutschemeassociationMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutschemeassociationMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(fieldlayoutschemeassociation);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Fieldlayoutschemeassociation到数据库中
	 * <param name="fieldlayoutschemeassociation">需要更新的Fieldlayoutschemeassociation</param>
	 * <param name="fieldlayoutschemeassociationQueryCondition">附加的条件</param>
	 */
	protected int fieldlayoutschemeassociationUpdateByCondition(Fieldlayoutschemeassociation fieldlayoutschemeassociation, FieldlayoutschemeassociationExample fieldlayoutschemeassociationQueryCondition) {
		FieldlayoutschemeassociationMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutschemeassociationMapper.class);
		int ret = mapperImpl.updateByExample(fieldlayoutschemeassociation, fieldlayoutschemeassociationQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Fieldlayoutschemeassociation到数据库中
	 * <param name="fieldlayoutschemeassociation">需要更新的Fieldlayoutschemeassociation</param>
	 * <param name="fieldlayoutschemeassociationQueryCondition">附加的条件</param>
	 */
	protected int fieldlayoutschemeassociationUpdateSelectiveByCondition(Fieldlayoutschemeassociation fieldlayoutschemeassociation, FieldlayoutschemeassociationExample fieldlayoutschemeassociationQueryCondition) {
		FieldlayoutschemeassociationMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutschemeassociationMapper.class);
		int ret = mapperImpl.updateByExampleSelective(fieldlayoutschemeassociation, fieldlayoutschemeassociationQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="fieldlayoutschemeassociation">从数据库中删除一个对象Fieldlayoutschemeassociation</param>
	 * <param name="AId"></param>
	 */
	protected int fieldlayoutschemeassociationDeleteByPrimaryKey(long AId) {
		FieldlayoutschemeassociationMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutschemeassociationMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fieldlayoutschemeassociation">从数据库中删除一个对象Fieldlayoutschemeassociation</param>
	 */
	protected int fieldlayoutschemeassociationDeleteByCondition(FieldlayoutschemeassociationExample fieldlayoutschemeassociationQueryCondition) {
		FieldlayoutschemeassociationMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutschemeassociationMapper.class);
		return mapperImpl.deleteByExample(fieldlayoutschemeassociationQueryCondition);
	}
	
	/**
	 * <param name="fieldlayoutschemeassociation">从数据库中查询一个对象Fieldlayoutschemeassociation</param>
	 * <param name="AId"></param>
	 */
	protected Fieldlayoutschemeassociation fieldlayoutschemeassociationSelectByPrimaryKey(long AId) {
		FieldlayoutschemeassociationMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutschemeassociationMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fieldlayoutschemeassociationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Fieldlayoutschemeassociation> fieldlayoutschemeassociationSelectObjects(FieldlayoutschemeassociationExample fieldlayoutschemeassociationQueryCondition) {
		FieldlayoutschemeassociationMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutschemeassociationMapper.class);
		return mapperImpl.selectByExample(fieldlayoutschemeassociationQueryCondition);
	}
	
	/**
	 * <param name="fieldlayoutschemeassociationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int fieldlayoutschemeassociationQuerySelectObjectsCount(FieldlayoutschemeassociationExample fieldlayoutschemeassociationQueryCondition) {
		FieldlayoutschemeassociationMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutschemeassociationMapper.class);
		return mapperImpl.countByExample(fieldlayoutschemeassociationQueryCondition);
	}
	
	/**
	 * 插入一个对象Fieldlayoutschemeentity到数据库中
	 * <param name="Fieldlayoutschemeentity">需要插入的Fieldlayoutschemeentity</param>
	 */
	protected int fieldlayoutschemeentityInsert(Fieldlayoutschemeentity fieldlayoutschemeentity) {
		FieldlayoutschemeentityMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutschemeentityMapper.class);
		return mapperImpl.insertSelective(fieldlayoutschemeentity);
	}
	
	/**
	 * 更新一个对象Fieldlayoutschemeentity到数据库中
	 * <param name="fieldlayoutschemeentity">需要更新的Fieldlayoutschemeentity</param>
	 */
	protected int fieldlayoutschemeentityUpdate(Fieldlayoutschemeentity fieldlayoutschemeentity) {
		FieldlayoutschemeentityMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutschemeentityMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(fieldlayoutschemeentity);
		return ret;
	}
	
	/**
	 * 更新一个对象Fieldlayoutschemeentity到数据库中
	 * <param name="fieldlayoutschemeentity">需要更新的Fieldlayoutschemeentity</param>
	 */
	protected int fieldlayoutschemeentityUpdateSelective(Fieldlayoutschemeentity fieldlayoutschemeentity) {
		FieldlayoutschemeentityMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutschemeentityMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(fieldlayoutschemeentity);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Fieldlayoutschemeentity到数据库中
	 * <param name="fieldlayoutschemeentity">需要更新的Fieldlayoutschemeentity</param>
	 * <param name="fieldlayoutschemeentityQueryCondition">附加的条件</param>
	 */
	protected int fieldlayoutschemeentityUpdateByCondition(Fieldlayoutschemeentity fieldlayoutschemeentity, FieldlayoutschemeentityExample fieldlayoutschemeentityQueryCondition) {
		FieldlayoutschemeentityMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutschemeentityMapper.class);
		int ret = mapperImpl.updateByExample(fieldlayoutschemeentity, fieldlayoutschemeentityQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Fieldlayoutschemeentity到数据库中
	 * <param name="fieldlayoutschemeentity">需要更新的Fieldlayoutschemeentity</param>
	 * <param name="fieldlayoutschemeentityQueryCondition">附加的条件</param>
	 */
	protected int fieldlayoutschemeentityUpdateSelectiveByCondition(Fieldlayoutschemeentity fieldlayoutschemeentity, FieldlayoutschemeentityExample fieldlayoutschemeentityQueryCondition) {
		FieldlayoutschemeentityMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutschemeentityMapper.class);
		int ret = mapperImpl.updateByExampleSelective(fieldlayoutschemeentity, fieldlayoutschemeentityQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="fieldlayoutschemeentity">从数据库中删除一个对象Fieldlayoutschemeentity</param>
	 * <param name="AId"></param>
	 */
	protected int fieldlayoutschemeentityDeleteByPrimaryKey(long AId) {
		FieldlayoutschemeentityMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutschemeentityMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fieldlayoutschemeentity">从数据库中删除一个对象Fieldlayoutschemeentity</param>
	 */
	protected int fieldlayoutschemeentityDeleteByCondition(FieldlayoutschemeentityExample fieldlayoutschemeentityQueryCondition) {
		FieldlayoutschemeentityMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutschemeentityMapper.class);
		return mapperImpl.deleteByExample(fieldlayoutschemeentityQueryCondition);
	}
	
	/**
	 * <param name="fieldlayoutschemeentity">从数据库中查询一个对象Fieldlayoutschemeentity</param>
	 * <param name="AId"></param>
	 */
	protected Fieldlayoutschemeentity fieldlayoutschemeentitySelectByPrimaryKey(long AId) {
		FieldlayoutschemeentityMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutschemeentityMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fieldlayoutschemeentityQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Fieldlayoutschemeentity> fieldlayoutschemeentitySelectObjects(FieldlayoutschemeentityExample fieldlayoutschemeentityQueryCondition) {
		FieldlayoutschemeentityMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutschemeentityMapper.class);
		return mapperImpl.selectByExample(fieldlayoutschemeentityQueryCondition);
	}
	
	/**
	 * <param name="fieldlayoutschemeentityQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int fieldlayoutschemeentityQuerySelectObjectsCount(FieldlayoutschemeentityExample fieldlayoutschemeentityQueryCondition) {
		FieldlayoutschemeentityMapper mapperImpl = this.getSqlSession().getMapper(FieldlayoutschemeentityMapper.class);
		return mapperImpl.countByExample(fieldlayoutschemeentityQueryCondition);
	}
	
	/**
	 * 插入一个对象Fieldscreen到数据库中
	 * <param name="Fieldscreen">需要插入的Fieldscreen</param>
	 */
	protected int fieldscreenInsert(Fieldscreen fieldscreen) {
		FieldscreenMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenMapper.class);
		return mapperImpl.insertSelective(fieldscreen);
	}
	
	/**
	 * 更新一个对象Fieldscreen到数据库中
	 * <param name="fieldscreen">需要更新的Fieldscreen</param>
	 */
	protected int fieldscreenUpdate(Fieldscreen fieldscreen) {
		FieldscreenMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(fieldscreen);
		return ret;
	}
	
	/**
	 * 更新一个对象Fieldscreen到数据库中
	 * <param name="fieldscreen">需要更新的Fieldscreen</param>
	 */
	protected int fieldscreenUpdateSelective(Fieldscreen fieldscreen) {
		FieldscreenMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(fieldscreen);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Fieldscreen到数据库中
	 * <param name="fieldscreen">需要更新的Fieldscreen</param>
	 * <param name="fieldscreenQueryCondition">附加的条件</param>
	 */
	protected int fieldscreenUpdateByCondition(Fieldscreen fieldscreen, FieldscreenExample fieldscreenQueryCondition) {
		FieldscreenMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenMapper.class);
		int ret = mapperImpl.updateByExample(fieldscreen, fieldscreenQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Fieldscreen到数据库中
	 * <param name="fieldscreen">需要更新的Fieldscreen</param>
	 * <param name="fieldscreenQueryCondition">附加的条件</param>
	 */
	protected int fieldscreenUpdateSelectiveByCondition(Fieldscreen fieldscreen, FieldscreenExample fieldscreenQueryCondition) {
		FieldscreenMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenMapper.class);
		int ret = mapperImpl.updateByExampleSelective(fieldscreen, fieldscreenQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="fieldscreen">从数据库中删除一个对象Fieldscreen</param>
	 * <param name="AId"></param>
	 */
	protected int fieldscreenDeleteByPrimaryKey(long AId) {
		FieldscreenMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fieldscreen">从数据库中删除一个对象Fieldscreen</param>
	 */
	protected int fieldscreenDeleteByCondition(FieldscreenExample fieldscreenQueryCondition) {
		FieldscreenMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenMapper.class);
		return mapperImpl.deleteByExample(fieldscreenQueryCondition);
	}
	
	/**
	 * <param name="fieldscreen">从数据库中查询一个对象Fieldscreen</param>
	 * <param name="AId"></param>
	 */
	protected Fieldscreen fieldscreenSelectByPrimaryKey(long AId) {
		FieldscreenMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fieldscreenQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Fieldscreen> fieldscreenSelectObjects(FieldscreenExample fieldscreenQueryCondition) {
		FieldscreenMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenMapper.class);
		return mapperImpl.selectByExample(fieldscreenQueryCondition);
	}
	
	/**
	 * <param name="fieldscreenQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int fieldscreenQuerySelectObjectsCount(FieldscreenExample fieldscreenQueryCondition) {
		FieldscreenMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenMapper.class);
		return mapperImpl.countByExample(fieldscreenQueryCondition);
	}
	
	/**
	 * 插入一个对象Fieldscreenlayoutitem到数据库中
	 * <param name="Fieldscreenlayoutitem">需要插入的Fieldscreenlayoutitem</param>
	 */
	protected int fieldscreenlayoutitemInsert(Fieldscreenlayoutitem fieldscreenlayoutitem) {
		FieldscreenlayoutitemMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenlayoutitemMapper.class);
		return mapperImpl.insertSelective(fieldscreenlayoutitem);
	}
	
	/**
	 * 更新一个对象Fieldscreenlayoutitem到数据库中
	 * <param name="fieldscreenlayoutitem">需要更新的Fieldscreenlayoutitem</param>
	 */
	protected int fieldscreenlayoutitemUpdate(Fieldscreenlayoutitem fieldscreenlayoutitem) {
		FieldscreenlayoutitemMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenlayoutitemMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(fieldscreenlayoutitem);
		return ret;
	}
	
	/**
	 * 更新一个对象Fieldscreenlayoutitem到数据库中
	 * <param name="fieldscreenlayoutitem">需要更新的Fieldscreenlayoutitem</param>
	 */
	protected int fieldscreenlayoutitemUpdateSelective(Fieldscreenlayoutitem fieldscreenlayoutitem) {
		FieldscreenlayoutitemMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenlayoutitemMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(fieldscreenlayoutitem);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Fieldscreenlayoutitem到数据库中
	 * <param name="fieldscreenlayoutitem">需要更新的Fieldscreenlayoutitem</param>
	 * <param name="fieldscreenlayoutitemQueryCondition">附加的条件</param>
	 */
	protected int fieldscreenlayoutitemUpdateByCondition(Fieldscreenlayoutitem fieldscreenlayoutitem, FieldscreenlayoutitemExample fieldscreenlayoutitemQueryCondition) {
		FieldscreenlayoutitemMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenlayoutitemMapper.class);
		int ret = mapperImpl.updateByExample(fieldscreenlayoutitem, fieldscreenlayoutitemQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Fieldscreenlayoutitem到数据库中
	 * <param name="fieldscreenlayoutitem">需要更新的Fieldscreenlayoutitem</param>
	 * <param name="fieldscreenlayoutitemQueryCondition">附加的条件</param>
	 */
	protected int fieldscreenlayoutitemUpdateSelectiveByCondition(Fieldscreenlayoutitem fieldscreenlayoutitem, FieldscreenlayoutitemExample fieldscreenlayoutitemQueryCondition) {
		FieldscreenlayoutitemMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenlayoutitemMapper.class);
		int ret = mapperImpl.updateByExampleSelective(fieldscreenlayoutitem, fieldscreenlayoutitemQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="fieldscreenlayoutitem">从数据库中删除一个对象Fieldscreenlayoutitem</param>
	 * <param name="AId"></param>
	 */
	protected int fieldscreenlayoutitemDeleteByPrimaryKey(long AId) {
		FieldscreenlayoutitemMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenlayoutitemMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fieldscreenlayoutitem">从数据库中删除一个对象Fieldscreenlayoutitem</param>
	 */
	protected int fieldscreenlayoutitemDeleteByCondition(FieldscreenlayoutitemExample fieldscreenlayoutitemQueryCondition) {
		FieldscreenlayoutitemMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenlayoutitemMapper.class);
		return mapperImpl.deleteByExample(fieldscreenlayoutitemQueryCondition);
	}
	
	/**
	 * <param name="fieldscreenlayoutitem">从数据库中查询一个对象Fieldscreenlayoutitem</param>
	 * <param name="AId"></param>
	 */
	protected Fieldscreenlayoutitem fieldscreenlayoutitemSelectByPrimaryKey(long AId) {
		FieldscreenlayoutitemMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenlayoutitemMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fieldscreenlayoutitemQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Fieldscreenlayoutitem> fieldscreenlayoutitemSelectObjects(FieldscreenlayoutitemExample fieldscreenlayoutitemQueryCondition) {
		FieldscreenlayoutitemMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenlayoutitemMapper.class);
		return mapperImpl.selectByExample(fieldscreenlayoutitemQueryCondition);
	}
	
	/**
	 * <param name="fieldscreenlayoutitemQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int fieldscreenlayoutitemQuerySelectObjectsCount(FieldscreenlayoutitemExample fieldscreenlayoutitemQueryCondition) {
		FieldscreenlayoutitemMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenlayoutitemMapper.class);
		return mapperImpl.countByExample(fieldscreenlayoutitemQueryCondition);
	}
	
	/**
	 * 插入一个对象Fieldscreenscheme到数据库中
	 * <param name="Fieldscreenscheme">需要插入的Fieldscreenscheme</param>
	 */
	protected int fieldscreenschemeInsert(Fieldscreenscheme fieldscreenscheme) {
		FieldscreenschemeMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenschemeMapper.class);
		return mapperImpl.insertSelective(fieldscreenscheme);
	}
	
	/**
	 * 更新一个对象Fieldscreenscheme到数据库中
	 * <param name="fieldscreenscheme">需要更新的Fieldscreenscheme</param>
	 */
	protected int fieldscreenschemeUpdate(Fieldscreenscheme fieldscreenscheme) {
		FieldscreenschemeMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenschemeMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(fieldscreenscheme);
		return ret;
	}
	
	/**
	 * 更新一个对象Fieldscreenscheme到数据库中
	 * <param name="fieldscreenscheme">需要更新的Fieldscreenscheme</param>
	 */
	protected int fieldscreenschemeUpdateSelective(Fieldscreenscheme fieldscreenscheme) {
		FieldscreenschemeMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenschemeMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(fieldscreenscheme);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Fieldscreenscheme到数据库中
	 * <param name="fieldscreenscheme">需要更新的Fieldscreenscheme</param>
	 * <param name="fieldscreenschemeQueryCondition">附加的条件</param>
	 */
	protected int fieldscreenschemeUpdateByCondition(Fieldscreenscheme fieldscreenscheme, FieldscreenschemeExample fieldscreenschemeQueryCondition) {
		FieldscreenschemeMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenschemeMapper.class);
		int ret = mapperImpl.updateByExample(fieldscreenscheme, fieldscreenschemeQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Fieldscreenscheme到数据库中
	 * <param name="fieldscreenscheme">需要更新的Fieldscreenscheme</param>
	 * <param name="fieldscreenschemeQueryCondition">附加的条件</param>
	 */
	protected int fieldscreenschemeUpdateSelectiveByCondition(Fieldscreenscheme fieldscreenscheme, FieldscreenschemeExample fieldscreenschemeQueryCondition) {
		FieldscreenschemeMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenschemeMapper.class);
		int ret = mapperImpl.updateByExampleSelective(fieldscreenscheme, fieldscreenschemeQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="fieldscreenscheme">从数据库中删除一个对象Fieldscreenscheme</param>
	 * <param name="AId"></param>
	 */
	protected int fieldscreenschemeDeleteByPrimaryKey(long AId) {
		FieldscreenschemeMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenschemeMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fieldscreenscheme">从数据库中删除一个对象Fieldscreenscheme</param>
	 */
	protected int fieldscreenschemeDeleteByCondition(FieldscreenschemeExample fieldscreenschemeQueryCondition) {
		FieldscreenschemeMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenschemeMapper.class);
		return mapperImpl.deleteByExample(fieldscreenschemeQueryCondition);
	}
	
	/**
	 * <param name="fieldscreenscheme">从数据库中查询一个对象Fieldscreenscheme</param>
	 * <param name="AId"></param>
	 */
	protected Fieldscreenscheme fieldscreenschemeSelectByPrimaryKey(long AId) {
		FieldscreenschemeMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenschemeMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fieldscreenschemeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Fieldscreenscheme> fieldscreenschemeSelectObjects(FieldscreenschemeExample fieldscreenschemeQueryCondition) {
		FieldscreenschemeMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenschemeMapper.class);
		return mapperImpl.selectByExample(fieldscreenschemeQueryCondition);
	}
	
	/**
	 * <param name="fieldscreenschemeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int fieldscreenschemeQuerySelectObjectsCount(FieldscreenschemeExample fieldscreenschemeQueryCondition) {
		FieldscreenschemeMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenschemeMapper.class);
		return mapperImpl.countByExample(fieldscreenschemeQueryCondition);
	}
	
	/**
	 * 插入一个对象Fieldscreenschemeitem到数据库中
	 * <param name="Fieldscreenschemeitem">需要插入的Fieldscreenschemeitem</param>
	 */
	protected int fieldscreenschemeitemInsert(Fieldscreenschemeitem fieldscreenschemeitem) {
		FieldscreenschemeitemMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenschemeitemMapper.class);
		return mapperImpl.insertSelective(fieldscreenschemeitem);
	}
	
	/**
	 * 更新一个对象Fieldscreenschemeitem到数据库中
	 * <param name="fieldscreenschemeitem">需要更新的Fieldscreenschemeitem</param>
	 */
	protected int fieldscreenschemeitemUpdate(Fieldscreenschemeitem fieldscreenschemeitem) {
		FieldscreenschemeitemMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenschemeitemMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(fieldscreenschemeitem);
		return ret;
	}
	
	/**
	 * 更新一个对象Fieldscreenschemeitem到数据库中
	 * <param name="fieldscreenschemeitem">需要更新的Fieldscreenschemeitem</param>
	 */
	protected int fieldscreenschemeitemUpdateSelective(Fieldscreenschemeitem fieldscreenschemeitem) {
		FieldscreenschemeitemMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenschemeitemMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(fieldscreenschemeitem);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Fieldscreenschemeitem到数据库中
	 * <param name="fieldscreenschemeitem">需要更新的Fieldscreenschemeitem</param>
	 * <param name="fieldscreenschemeitemQueryCondition">附加的条件</param>
	 */
	protected int fieldscreenschemeitemUpdateByCondition(Fieldscreenschemeitem fieldscreenschemeitem, FieldscreenschemeitemExample fieldscreenschemeitemQueryCondition) {
		FieldscreenschemeitemMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenschemeitemMapper.class);
		int ret = mapperImpl.updateByExample(fieldscreenschemeitem, fieldscreenschemeitemQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Fieldscreenschemeitem到数据库中
	 * <param name="fieldscreenschemeitem">需要更新的Fieldscreenschemeitem</param>
	 * <param name="fieldscreenschemeitemQueryCondition">附加的条件</param>
	 */
	protected int fieldscreenschemeitemUpdateSelectiveByCondition(Fieldscreenschemeitem fieldscreenschemeitem, FieldscreenschemeitemExample fieldscreenschemeitemQueryCondition) {
		FieldscreenschemeitemMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenschemeitemMapper.class);
		int ret = mapperImpl.updateByExampleSelective(fieldscreenschemeitem, fieldscreenschemeitemQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="fieldscreenschemeitem">从数据库中删除一个对象Fieldscreenschemeitem</param>
	 * <param name="AId"></param>
	 */
	protected int fieldscreenschemeitemDeleteByPrimaryKey(long AId) {
		FieldscreenschemeitemMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenschemeitemMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fieldscreenschemeitem">从数据库中删除一个对象Fieldscreenschemeitem</param>
	 */
	protected int fieldscreenschemeitemDeleteByCondition(FieldscreenschemeitemExample fieldscreenschemeitemQueryCondition) {
		FieldscreenschemeitemMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenschemeitemMapper.class);
		return mapperImpl.deleteByExample(fieldscreenschemeitemQueryCondition);
	}
	
	/**
	 * <param name="fieldscreenschemeitem">从数据库中查询一个对象Fieldscreenschemeitem</param>
	 * <param name="AId"></param>
	 */
	protected Fieldscreenschemeitem fieldscreenschemeitemSelectByPrimaryKey(long AId) {
		FieldscreenschemeitemMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenschemeitemMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fieldscreenschemeitemQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Fieldscreenschemeitem> fieldscreenschemeitemSelectObjects(FieldscreenschemeitemExample fieldscreenschemeitemQueryCondition) {
		FieldscreenschemeitemMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenschemeitemMapper.class);
		return mapperImpl.selectByExample(fieldscreenschemeitemQueryCondition);
	}
	
	/**
	 * <param name="fieldscreenschemeitemQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int fieldscreenschemeitemQuerySelectObjectsCount(FieldscreenschemeitemExample fieldscreenschemeitemQueryCondition) {
		FieldscreenschemeitemMapper mapperImpl = this.getSqlSession().getMapper(FieldscreenschemeitemMapper.class);
		return mapperImpl.countByExample(fieldscreenschemeitemQueryCondition);
	}
	
	/**
	 * 插入一个对象Fieldscreentab到数据库中
	 * <param name="Fieldscreentab">需要插入的Fieldscreentab</param>
	 */
	protected int fieldscreentabInsert(Fieldscreentab fieldscreentab) {
		FieldscreentabMapper mapperImpl = this.getSqlSession().getMapper(FieldscreentabMapper.class);
		return mapperImpl.insertSelective(fieldscreentab);
	}
	
	/**
	 * 更新一个对象Fieldscreentab到数据库中
	 * <param name="fieldscreentab">需要更新的Fieldscreentab</param>
	 */
	protected int fieldscreentabUpdate(Fieldscreentab fieldscreentab) {
		FieldscreentabMapper mapperImpl = this.getSqlSession().getMapper(FieldscreentabMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(fieldscreentab);
		return ret;
	}
	
	/**
	 * 更新一个对象Fieldscreentab到数据库中
	 * <param name="fieldscreentab">需要更新的Fieldscreentab</param>
	 */
	protected int fieldscreentabUpdateSelective(Fieldscreentab fieldscreentab) {
		FieldscreentabMapper mapperImpl = this.getSqlSession().getMapper(FieldscreentabMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(fieldscreentab);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Fieldscreentab到数据库中
	 * <param name="fieldscreentab">需要更新的Fieldscreentab</param>
	 * <param name="fieldscreentabQueryCondition">附加的条件</param>
	 */
	protected int fieldscreentabUpdateByCondition(Fieldscreentab fieldscreentab, FieldscreentabExample fieldscreentabQueryCondition) {
		FieldscreentabMapper mapperImpl = this.getSqlSession().getMapper(FieldscreentabMapper.class);
		int ret = mapperImpl.updateByExample(fieldscreentab, fieldscreentabQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Fieldscreentab到数据库中
	 * <param name="fieldscreentab">需要更新的Fieldscreentab</param>
	 * <param name="fieldscreentabQueryCondition">附加的条件</param>
	 */
	protected int fieldscreentabUpdateSelectiveByCondition(Fieldscreentab fieldscreentab, FieldscreentabExample fieldscreentabQueryCondition) {
		FieldscreentabMapper mapperImpl = this.getSqlSession().getMapper(FieldscreentabMapper.class);
		int ret = mapperImpl.updateByExampleSelective(fieldscreentab, fieldscreentabQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="fieldscreentab">从数据库中删除一个对象Fieldscreentab</param>
	 * <param name="AId"></param>
	 */
	protected int fieldscreentabDeleteByPrimaryKey(long AId) {
		FieldscreentabMapper mapperImpl = this.getSqlSession().getMapper(FieldscreentabMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fieldscreentab">从数据库中删除一个对象Fieldscreentab</param>
	 */
	protected int fieldscreentabDeleteByCondition(FieldscreentabExample fieldscreentabQueryCondition) {
		FieldscreentabMapper mapperImpl = this.getSqlSession().getMapper(FieldscreentabMapper.class);
		return mapperImpl.deleteByExample(fieldscreentabQueryCondition);
	}
	
	/**
	 * <param name="fieldscreentab">从数据库中查询一个对象Fieldscreentab</param>
	 * <param name="AId"></param>
	 */
	protected Fieldscreentab fieldscreentabSelectByPrimaryKey(long AId) {
		FieldscreentabMapper mapperImpl = this.getSqlSession().getMapper(FieldscreentabMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fieldscreentabQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Fieldscreentab> fieldscreentabSelectObjects(FieldscreentabExample fieldscreentabQueryCondition) {
		FieldscreentabMapper mapperImpl = this.getSqlSession().getMapper(FieldscreentabMapper.class);
		return mapperImpl.selectByExample(fieldscreentabQueryCondition);
	}
	
	/**
	 * <param name="fieldscreentabQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int fieldscreentabQuerySelectObjectsCount(FieldscreentabExample fieldscreentabQueryCondition) {
		FieldscreentabMapper mapperImpl = this.getSqlSession().getMapper(FieldscreentabMapper.class);
		return mapperImpl.countByExample(fieldscreentabQueryCondition);
	}
	
	/**
	 * 插入一个对象Fileattachment到数据库中
	 * <param name="Fileattachment">需要插入的Fileattachment</param>
	 */
	protected int fileattachmentInsert(Fileattachment fileattachment) {
		FileattachmentMapper mapperImpl = this.getSqlSession().getMapper(FileattachmentMapper.class);
		return mapperImpl.insertSelective(fileattachment);
	}
	
	/**
	 * 更新一个对象Fileattachment到数据库中
	 * <param name="fileattachment">需要更新的Fileattachment</param>
	 */
	protected int fileattachmentUpdate(Fileattachment fileattachment) {
		FileattachmentMapper mapperImpl = this.getSqlSession().getMapper(FileattachmentMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(fileattachment);
		return ret;
	}
	
	/**
	 * 更新一个对象Fileattachment到数据库中
	 * <param name="fileattachment">需要更新的Fileattachment</param>
	 */
	protected int fileattachmentUpdateSelective(Fileattachment fileattachment) {
		FileattachmentMapper mapperImpl = this.getSqlSession().getMapper(FileattachmentMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(fileattachment);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Fileattachment到数据库中
	 * <param name="fileattachment">需要更新的Fileattachment</param>
	 * <param name="fileattachmentQueryCondition">附加的条件</param>
	 */
	protected int fileattachmentUpdateByCondition(Fileattachment fileattachment, FileattachmentExample fileattachmentQueryCondition) {
		FileattachmentMapper mapperImpl = this.getSqlSession().getMapper(FileattachmentMapper.class);
		int ret = mapperImpl.updateByExample(fileattachment, fileattachmentQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Fileattachment到数据库中
	 * <param name="fileattachment">需要更新的Fileattachment</param>
	 * <param name="fileattachmentQueryCondition">附加的条件</param>
	 */
	protected int fileattachmentUpdateSelectiveByCondition(Fileattachment fileattachment, FileattachmentExample fileattachmentQueryCondition) {
		FileattachmentMapper mapperImpl = this.getSqlSession().getMapper(FileattachmentMapper.class);
		int ret = mapperImpl.updateByExampleSelective(fileattachment, fileattachmentQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="fileattachment">从数据库中删除一个对象Fileattachment</param>
	 * <param name="AId"></param>
	 */
	protected int fileattachmentDeleteByPrimaryKey(long AId) {
		FileattachmentMapper mapperImpl = this.getSqlSession().getMapper(FileattachmentMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fileattachment">从数据库中删除一个对象Fileattachment</param>
	 */
	protected int fileattachmentDeleteByCondition(FileattachmentExample fileattachmentQueryCondition) {
		FileattachmentMapper mapperImpl = this.getSqlSession().getMapper(FileattachmentMapper.class);
		return mapperImpl.deleteByExample(fileattachmentQueryCondition);
	}
	
	/**
	 * <param name="fileattachment">从数据库中查询一个对象Fileattachment</param>
	 * <param name="AId"></param>
	 */
	protected Fileattachment fileattachmentSelectByPrimaryKey(long AId) {
		FileattachmentMapper mapperImpl = this.getSqlSession().getMapper(FileattachmentMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="fileattachmentQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Fileattachment> fileattachmentSelectObjects(FileattachmentExample fileattachmentQueryCondition) {
		FileattachmentMapper mapperImpl = this.getSqlSession().getMapper(FileattachmentMapper.class);
		return mapperImpl.selectByExample(fileattachmentQueryCondition);
	}
	
	/**
	 * <param name="fileattachmentQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int fileattachmentQuerySelectObjectsCount(FileattachmentExample fileattachmentQueryCondition) {
		FileattachmentMapper mapperImpl = this.getSqlSession().getMapper(FileattachmentMapper.class);
		return mapperImpl.countByExample(fileattachmentQueryCondition);
	}
	
	/**
	 * 插入一个对象Filtersubscription到数据库中
	 * <param name="Filtersubscription">需要插入的Filtersubscription</param>
	 */
	protected int filtersubscriptionInsert(Filtersubscription filtersubscription) {
		FiltersubscriptionMapper mapperImpl = this.getSqlSession().getMapper(FiltersubscriptionMapper.class);
		return mapperImpl.insertSelective(filtersubscription);
	}
	
	/**
	 * 更新一个对象Filtersubscription到数据库中
	 * <param name="filtersubscription">需要更新的Filtersubscription</param>
	 */
	protected int filtersubscriptionUpdate(Filtersubscription filtersubscription) {
		FiltersubscriptionMapper mapperImpl = this.getSqlSession().getMapper(FiltersubscriptionMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(filtersubscription);
		return ret;
	}
	
	/**
	 * 更新一个对象Filtersubscription到数据库中
	 * <param name="filtersubscription">需要更新的Filtersubscription</param>
	 */
	protected int filtersubscriptionUpdateSelective(Filtersubscription filtersubscription) {
		FiltersubscriptionMapper mapperImpl = this.getSqlSession().getMapper(FiltersubscriptionMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(filtersubscription);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Filtersubscription到数据库中
	 * <param name="filtersubscription">需要更新的Filtersubscription</param>
	 * <param name="filtersubscriptionQueryCondition">附加的条件</param>
	 */
	protected int filtersubscriptionUpdateByCondition(Filtersubscription filtersubscription, FiltersubscriptionExample filtersubscriptionQueryCondition) {
		FiltersubscriptionMapper mapperImpl = this.getSqlSession().getMapper(FiltersubscriptionMapper.class);
		int ret = mapperImpl.updateByExample(filtersubscription, filtersubscriptionQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Filtersubscription到数据库中
	 * <param name="filtersubscription">需要更新的Filtersubscription</param>
	 * <param name="filtersubscriptionQueryCondition">附加的条件</param>
	 */
	protected int filtersubscriptionUpdateSelectiveByCondition(Filtersubscription filtersubscription, FiltersubscriptionExample filtersubscriptionQueryCondition) {
		FiltersubscriptionMapper mapperImpl = this.getSqlSession().getMapper(FiltersubscriptionMapper.class);
		int ret = mapperImpl.updateByExampleSelective(filtersubscription, filtersubscriptionQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="filtersubscription">从数据库中删除一个对象Filtersubscription</param>
	 * <param name="AId"></param>
	 */
	protected int filtersubscriptionDeleteByPrimaryKey(long AId) {
		FiltersubscriptionMapper mapperImpl = this.getSqlSession().getMapper(FiltersubscriptionMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="filtersubscription">从数据库中删除一个对象Filtersubscription</param>
	 */
	protected int filtersubscriptionDeleteByCondition(FiltersubscriptionExample filtersubscriptionQueryCondition) {
		FiltersubscriptionMapper mapperImpl = this.getSqlSession().getMapper(FiltersubscriptionMapper.class);
		return mapperImpl.deleteByExample(filtersubscriptionQueryCondition);
	}
	
	/**
	 * <param name="filtersubscription">从数据库中查询一个对象Filtersubscription</param>
	 * <param name="AId"></param>
	 */
	protected Filtersubscription filtersubscriptionSelectByPrimaryKey(long AId) {
		FiltersubscriptionMapper mapperImpl = this.getSqlSession().getMapper(FiltersubscriptionMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="filtersubscriptionQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Filtersubscription> filtersubscriptionSelectObjects(FiltersubscriptionExample filtersubscriptionQueryCondition) {
		FiltersubscriptionMapper mapperImpl = this.getSqlSession().getMapper(FiltersubscriptionMapper.class);
		return mapperImpl.selectByExample(filtersubscriptionQueryCondition);
	}
	
	/**
	 * <param name="filtersubscriptionQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int filtersubscriptionQuerySelectObjectsCount(FiltersubscriptionExample filtersubscriptionQueryCondition) {
		FiltersubscriptionMapper mapperImpl = this.getSqlSession().getMapper(FiltersubscriptionMapper.class);
		return mapperImpl.countByExample(filtersubscriptionQueryCondition);
	}
	
	/**
	 * 插入一个对象Gadgetuserpreference到数据库中
	 * <param name="Gadgetuserpreference">需要插入的Gadgetuserpreference</param>
	 */
	protected int gadgetuserpreferenceInsert(Gadgetuserpreference gadgetuserpreference) {
		GadgetuserpreferenceMapper mapperImpl = this.getSqlSession().getMapper(GadgetuserpreferenceMapper.class);
		return mapperImpl.insertSelective(gadgetuserpreference);
	}
	
	/**
	 * 更新一个对象Gadgetuserpreference到数据库中
	 * <param name="gadgetuserpreference">需要更新的Gadgetuserpreference</param>
	 */
	protected int gadgetuserpreferenceUpdate(Gadgetuserpreference gadgetuserpreference) {
		GadgetuserpreferenceMapper mapperImpl = this.getSqlSession().getMapper(GadgetuserpreferenceMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(gadgetuserpreference);
		return ret;
	}
	
	/**
	 * 更新一个对象Gadgetuserpreference到数据库中
	 * <param name="gadgetuserpreference">需要更新的Gadgetuserpreference</param>
	 */
	protected int gadgetuserpreferenceUpdateSelective(Gadgetuserpreference gadgetuserpreference) {
		GadgetuserpreferenceMapper mapperImpl = this.getSqlSession().getMapper(GadgetuserpreferenceMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(gadgetuserpreference);
		return ret;
	}
	
	/**
	 * 更新一个对象Gadgetuserpreference到数据库中
	 * <param name="gadgetuserpreference">需要更新的Gadgetuserpreference</param>
	 */
	public int gadgetuserpreferenceUpdateWithBlobs(Gadgetuserpreference gadgetuserpreference) {
		GadgetuserpreferenceMapper mapperImpl = this.getSqlSession().getMapper(GadgetuserpreferenceMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(gadgetuserpreference);
	}
	
	/**
	 * 根据条件更新一批对象Gadgetuserpreference到数据库中
	 * <param name="gadgetuserpreference">需要更新的Gadgetuserpreference</param>
	 * <param name="gadgetuserpreferenceQueryCondition">附加的条件</param>
	 */
	protected int gadgetuserpreferenceUpdateByCondition(Gadgetuserpreference gadgetuserpreference, GadgetuserpreferenceExample gadgetuserpreferenceQueryCondition) {
		GadgetuserpreferenceMapper mapperImpl = this.getSqlSession().getMapper(GadgetuserpreferenceMapper.class);
		int ret = mapperImpl.updateByExample(gadgetuserpreference, gadgetuserpreferenceQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Gadgetuserpreference到数据库中
	 * <param name="gadgetuserpreference">需要更新的Gadgetuserpreference</param>
	 * <param name="gadgetuserpreferenceQueryCondition">附加的条件</param>
	 */
	protected int gadgetuserpreferenceUpdateSelectiveByCondition(Gadgetuserpreference gadgetuserpreference, GadgetuserpreferenceExample gadgetuserpreferenceQueryCondition) {
		GadgetuserpreferenceMapper mapperImpl = this.getSqlSession().getMapper(GadgetuserpreferenceMapper.class);
		int ret = mapperImpl.updateByExampleSelective(gadgetuserpreference, gadgetuserpreferenceQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="gadgetuserpreference">从数据库中删除一个对象Gadgetuserpreference</param>
	 * <param name="AId"></param>
	 */
	protected int gadgetuserpreferenceDeleteByPrimaryKey(long AId) {
		GadgetuserpreferenceMapper mapperImpl = this.getSqlSession().getMapper(GadgetuserpreferenceMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="gadgetuserpreference">从数据库中删除一个对象Gadgetuserpreference</param>
	 */
	protected int gadgetuserpreferenceDeleteByCondition(GadgetuserpreferenceExample gadgetuserpreferenceQueryCondition) {
		GadgetuserpreferenceMapper mapperImpl = this.getSqlSession().getMapper(GadgetuserpreferenceMapper.class);
		return mapperImpl.deleteByExample(gadgetuserpreferenceQueryCondition);
	}
	
	/**
	 * <param name="gadgetuserpreference">从数据库中查询一个对象Gadgetuserpreference</param>
	 * <param name="AId"></param>
	 */
	protected Gadgetuserpreference gadgetuserpreferenceSelectByPrimaryKey(long AId) {
		GadgetuserpreferenceMapper mapperImpl = this.getSqlSession().getMapper(GadgetuserpreferenceMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="gadgetuserpreferenceQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Gadgetuserpreference> gadgetuserpreferenceSelectObjects(GadgetuserpreferenceExample gadgetuserpreferenceQueryCondition) {
		GadgetuserpreferenceMapper mapperImpl = this.getSqlSession().getMapper(GadgetuserpreferenceMapper.class);
		return mapperImpl.selectByExample(gadgetuserpreferenceQueryCondition);
	}
	
	/**
	 * <param name="gadgetuserpreferenceQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Gadgetuserpreference> gadgetuserpreferenceSelectObjectsWithBLOBs(GadgetuserpreferenceExample gadgetuserpreferenceQueryCondition) {
		GadgetuserpreferenceMapper mapperImpl = this.getSqlSession().getMapper(GadgetuserpreferenceMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(gadgetuserpreferenceQueryCondition);
	}
	
	/**
	 * <param name="gadgetuserpreferenceQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int gadgetuserpreferenceQuerySelectObjectsCount(GadgetuserpreferenceExample gadgetuserpreferenceQueryCondition) {
		GadgetuserpreferenceMapper mapperImpl = this.getSqlSession().getMapper(GadgetuserpreferenceMapper.class);
		return mapperImpl.countByExample(gadgetuserpreferenceQueryCondition);
	}
	
	/**
	 * 插入一个对象Genericconfiguration到数据库中
	 * <param name="Genericconfiguration">需要插入的Genericconfiguration</param>
	 */
	protected int genericconfigurationInsert(Genericconfiguration genericconfiguration) {
		GenericconfigurationMapper mapperImpl = this.getSqlSession().getMapper(GenericconfigurationMapper.class);
		return mapperImpl.insertSelective(genericconfiguration);
	}
	
	/**
	 * 更新一个对象Genericconfiguration到数据库中
	 * <param name="genericconfiguration">需要更新的Genericconfiguration</param>
	 */
	protected int genericconfigurationUpdate(Genericconfiguration genericconfiguration) {
		GenericconfigurationMapper mapperImpl = this.getSqlSession().getMapper(GenericconfigurationMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(genericconfiguration);
		return ret;
	}
	
	/**
	 * 更新一个对象Genericconfiguration到数据库中
	 * <param name="genericconfiguration">需要更新的Genericconfiguration</param>
	 */
	protected int genericconfigurationUpdateSelective(Genericconfiguration genericconfiguration) {
		GenericconfigurationMapper mapperImpl = this.getSqlSession().getMapper(GenericconfigurationMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(genericconfiguration);
		return ret;
	}
	
	/**
	 * 更新一个对象Genericconfiguration到数据库中
	 * <param name="genericconfiguration">需要更新的Genericconfiguration</param>
	 */
	public int genericconfigurationUpdateWithBlobs(Genericconfiguration genericconfiguration) {
		GenericconfigurationMapper mapperImpl = this.getSqlSession().getMapper(GenericconfigurationMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(genericconfiguration);
	}
	
	/**
	 * 根据条件更新一批对象Genericconfiguration到数据库中
	 * <param name="genericconfiguration">需要更新的Genericconfiguration</param>
	 * <param name="genericconfigurationQueryCondition">附加的条件</param>
	 */
	protected int genericconfigurationUpdateByCondition(Genericconfiguration genericconfiguration, GenericconfigurationExample genericconfigurationQueryCondition) {
		GenericconfigurationMapper mapperImpl = this.getSqlSession().getMapper(GenericconfigurationMapper.class);
		int ret = mapperImpl.updateByExample(genericconfiguration, genericconfigurationQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Genericconfiguration到数据库中
	 * <param name="genericconfiguration">需要更新的Genericconfiguration</param>
	 * <param name="genericconfigurationQueryCondition">附加的条件</param>
	 */
	protected int genericconfigurationUpdateSelectiveByCondition(Genericconfiguration genericconfiguration, GenericconfigurationExample genericconfigurationQueryCondition) {
		GenericconfigurationMapper mapperImpl = this.getSqlSession().getMapper(GenericconfigurationMapper.class);
		int ret = mapperImpl.updateByExampleSelective(genericconfiguration, genericconfigurationQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="genericconfiguration">从数据库中删除一个对象Genericconfiguration</param>
	 * <param name="AId"></param>
	 */
	protected int genericconfigurationDeleteByPrimaryKey(long AId) {
		GenericconfigurationMapper mapperImpl = this.getSqlSession().getMapper(GenericconfigurationMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="genericconfiguration">从数据库中删除一个对象Genericconfiguration</param>
	 */
	protected int genericconfigurationDeleteByCondition(GenericconfigurationExample genericconfigurationQueryCondition) {
		GenericconfigurationMapper mapperImpl = this.getSqlSession().getMapper(GenericconfigurationMapper.class);
		return mapperImpl.deleteByExample(genericconfigurationQueryCondition);
	}
	
	/**
	 * <param name="genericconfiguration">从数据库中查询一个对象Genericconfiguration</param>
	 * <param name="AId"></param>
	 */
	protected Genericconfiguration genericconfigurationSelectByPrimaryKey(long AId) {
		GenericconfigurationMapper mapperImpl = this.getSqlSession().getMapper(GenericconfigurationMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="genericconfigurationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Genericconfiguration> genericconfigurationSelectObjects(GenericconfigurationExample genericconfigurationQueryCondition) {
		GenericconfigurationMapper mapperImpl = this.getSqlSession().getMapper(GenericconfigurationMapper.class);
		return mapperImpl.selectByExample(genericconfigurationQueryCondition);
	}
	
	/**
	 * <param name="genericconfigurationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Genericconfiguration> genericconfigurationSelectObjectsWithBLOBs(GenericconfigurationExample genericconfigurationQueryCondition) {
		GenericconfigurationMapper mapperImpl = this.getSqlSession().getMapper(GenericconfigurationMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(genericconfigurationQueryCondition);
	}
	
	/**
	 * <param name="genericconfigurationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int genericconfigurationQuerySelectObjectsCount(GenericconfigurationExample genericconfigurationQueryCondition) {
		GenericconfigurationMapper mapperImpl = this.getSqlSession().getMapper(GenericconfigurationMapper.class);
		return mapperImpl.countByExample(genericconfigurationQueryCondition);
	}
	
	/**
	 * 插入一个对象Groupbase到数据库中
	 * <param name="Groupbase">需要插入的Groupbase</param>
	 */
	protected int groupbaseInsert(Groupbase groupbase) {
		GroupbaseMapper mapperImpl = this.getSqlSession().getMapper(GroupbaseMapper.class);
		return mapperImpl.insertSelective(groupbase);
	}
	
	/**
	 * 更新一个对象Groupbase到数据库中
	 * <param name="groupbase">需要更新的Groupbase</param>
	 */
	protected int groupbaseUpdate(Groupbase groupbase) {
		GroupbaseMapper mapperImpl = this.getSqlSession().getMapper(GroupbaseMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(groupbase);
		return ret;
	}
	
	/**
	 * 更新一个对象Groupbase到数据库中
	 * <param name="groupbase">需要更新的Groupbase</param>
	 */
	protected int groupbaseUpdateSelective(Groupbase groupbase) {
		GroupbaseMapper mapperImpl = this.getSqlSession().getMapper(GroupbaseMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(groupbase);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Groupbase到数据库中
	 * <param name="groupbase">需要更新的Groupbase</param>
	 * <param name="groupbaseQueryCondition">附加的条件</param>
	 */
	protected int groupbaseUpdateByCondition(Groupbase groupbase, GroupbaseExample groupbaseQueryCondition) {
		GroupbaseMapper mapperImpl = this.getSqlSession().getMapper(GroupbaseMapper.class);
		int ret = mapperImpl.updateByExample(groupbase, groupbaseQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Groupbase到数据库中
	 * <param name="groupbase">需要更新的Groupbase</param>
	 * <param name="groupbaseQueryCondition">附加的条件</param>
	 */
	protected int groupbaseUpdateSelectiveByCondition(Groupbase groupbase, GroupbaseExample groupbaseQueryCondition) {
		GroupbaseMapper mapperImpl = this.getSqlSession().getMapper(GroupbaseMapper.class);
		int ret = mapperImpl.updateByExampleSelective(groupbase, groupbaseQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="groupbase">从数据库中删除一个对象Groupbase</param>
	 * <param name="AId"></param>
	 */
	protected int groupbaseDeleteByPrimaryKey(long AId) {
		GroupbaseMapper mapperImpl = this.getSqlSession().getMapper(GroupbaseMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="groupbase">从数据库中删除一个对象Groupbase</param>
	 */
	protected int groupbaseDeleteByCondition(GroupbaseExample groupbaseQueryCondition) {
		GroupbaseMapper mapperImpl = this.getSqlSession().getMapper(GroupbaseMapper.class);
		return mapperImpl.deleteByExample(groupbaseQueryCondition);
	}
	
	/**
	 * <param name="groupbase">从数据库中查询一个对象Groupbase</param>
	 * <param name="AId"></param>
	 */
	protected Groupbase groupbaseSelectByPrimaryKey(long AId) {
		GroupbaseMapper mapperImpl = this.getSqlSession().getMapper(GroupbaseMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="groupbaseQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Groupbase> groupbaseSelectObjects(GroupbaseExample groupbaseQueryCondition) {
		GroupbaseMapper mapperImpl = this.getSqlSession().getMapper(GroupbaseMapper.class);
		return mapperImpl.selectByExample(groupbaseQueryCondition);
	}
	
	/**
	 * <param name="groupbaseQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int groupbaseQuerySelectObjectsCount(GroupbaseExample groupbaseQueryCondition) {
		GroupbaseMapper mapperImpl = this.getSqlSession().getMapper(GroupbaseMapper.class);
		return mapperImpl.countByExample(groupbaseQueryCondition);
	}
	
	/**
	 * 插入一个对象Issuelink到数据库中
	 * <param name="Issuelink">需要插入的Issuelink</param>
	 */
	protected int issuelinkInsert(Issuelink issuelink) {
		IssuelinkMapper mapperImpl = this.getSqlSession().getMapper(IssuelinkMapper.class);
		return mapperImpl.insertSelective(issuelink);
	}
	
	/**
	 * 更新一个对象Issuelink到数据库中
	 * <param name="issuelink">需要更新的Issuelink</param>
	 */
	protected int issuelinkUpdate(Issuelink issuelink) {
		IssuelinkMapper mapperImpl = this.getSqlSession().getMapper(IssuelinkMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(issuelink);
		return ret;
	}
	
	/**
	 * 更新一个对象Issuelink到数据库中
	 * <param name="issuelink">需要更新的Issuelink</param>
	 */
	protected int issuelinkUpdateSelective(Issuelink issuelink) {
		IssuelinkMapper mapperImpl = this.getSqlSession().getMapper(IssuelinkMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(issuelink);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Issuelink到数据库中
	 * <param name="issuelink">需要更新的Issuelink</param>
	 * <param name="issuelinkQueryCondition">附加的条件</param>
	 */
	protected int issuelinkUpdateByCondition(Issuelink issuelink, IssuelinkExample issuelinkQueryCondition) {
		IssuelinkMapper mapperImpl = this.getSqlSession().getMapper(IssuelinkMapper.class);
		int ret = mapperImpl.updateByExample(issuelink, issuelinkQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Issuelink到数据库中
	 * <param name="issuelink">需要更新的Issuelink</param>
	 * <param name="issuelinkQueryCondition">附加的条件</param>
	 */
	protected int issuelinkUpdateSelectiveByCondition(Issuelink issuelink, IssuelinkExample issuelinkQueryCondition) {
		IssuelinkMapper mapperImpl = this.getSqlSession().getMapper(IssuelinkMapper.class);
		int ret = mapperImpl.updateByExampleSelective(issuelink, issuelinkQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="issuelink">从数据库中删除一个对象Issuelink</param>
	 * <param name="AId"></param>
	 */
	protected int issuelinkDeleteByPrimaryKey(long AId) {
		IssuelinkMapper mapperImpl = this.getSqlSession().getMapper(IssuelinkMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="issuelink">从数据库中删除一个对象Issuelink</param>
	 */
	protected int issuelinkDeleteByCondition(IssuelinkExample issuelinkQueryCondition) {
		IssuelinkMapper mapperImpl = this.getSqlSession().getMapper(IssuelinkMapper.class);
		return mapperImpl.deleteByExample(issuelinkQueryCondition);
	}
	
	/**
	 * <param name="issuelink">从数据库中查询一个对象Issuelink</param>
	 * <param name="AId"></param>
	 */
	protected Issuelink issuelinkSelectByPrimaryKey(long AId) {
		IssuelinkMapper mapperImpl = this.getSqlSession().getMapper(IssuelinkMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="issuelinkQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Issuelink> issuelinkSelectObjects(IssuelinkExample issuelinkQueryCondition) {
		IssuelinkMapper mapperImpl = this.getSqlSession().getMapper(IssuelinkMapper.class);
		return mapperImpl.selectByExample(issuelinkQueryCondition);
	}
	
	/**
	 * <param name="issuelinkQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int issuelinkQuerySelectObjectsCount(IssuelinkExample issuelinkQueryCondition) {
		IssuelinkMapper mapperImpl = this.getSqlSession().getMapper(IssuelinkMapper.class);
		return mapperImpl.countByExample(issuelinkQueryCondition);
	}
	
	/**
	 * 插入一个对象Issuelinktype到数据库中
	 * <param name="Issuelinktype">需要插入的Issuelinktype</param>
	 */
	protected int issuelinktypeInsert(Issuelinktype issuelinktype) {
		IssuelinktypeMapper mapperImpl = this.getSqlSession().getMapper(IssuelinktypeMapper.class);
		return mapperImpl.insertSelective(issuelinktype);
	}
	
	/**
	 * 更新一个对象Issuelinktype到数据库中
	 * <param name="issuelinktype">需要更新的Issuelinktype</param>
	 */
	protected int issuelinktypeUpdate(Issuelinktype issuelinktype) {
		IssuelinktypeMapper mapperImpl = this.getSqlSession().getMapper(IssuelinktypeMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(issuelinktype);
		return ret;
	}
	
	/**
	 * 更新一个对象Issuelinktype到数据库中
	 * <param name="issuelinktype">需要更新的Issuelinktype</param>
	 */
	protected int issuelinktypeUpdateSelective(Issuelinktype issuelinktype) {
		IssuelinktypeMapper mapperImpl = this.getSqlSession().getMapper(IssuelinktypeMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(issuelinktype);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Issuelinktype到数据库中
	 * <param name="issuelinktype">需要更新的Issuelinktype</param>
	 * <param name="issuelinktypeQueryCondition">附加的条件</param>
	 */
	protected int issuelinktypeUpdateByCondition(Issuelinktype issuelinktype, IssuelinktypeExample issuelinktypeQueryCondition) {
		IssuelinktypeMapper mapperImpl = this.getSqlSession().getMapper(IssuelinktypeMapper.class);
		int ret = mapperImpl.updateByExample(issuelinktype, issuelinktypeQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Issuelinktype到数据库中
	 * <param name="issuelinktype">需要更新的Issuelinktype</param>
	 * <param name="issuelinktypeQueryCondition">附加的条件</param>
	 */
	protected int issuelinktypeUpdateSelectiveByCondition(Issuelinktype issuelinktype, IssuelinktypeExample issuelinktypeQueryCondition) {
		IssuelinktypeMapper mapperImpl = this.getSqlSession().getMapper(IssuelinktypeMapper.class);
		int ret = mapperImpl.updateByExampleSelective(issuelinktype, issuelinktypeQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="issuelinktype">从数据库中删除一个对象Issuelinktype</param>
	 * <param name="AId"></param>
	 */
	protected int issuelinktypeDeleteByPrimaryKey(long AId) {
		IssuelinktypeMapper mapperImpl = this.getSqlSession().getMapper(IssuelinktypeMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="issuelinktype">从数据库中删除一个对象Issuelinktype</param>
	 */
	protected int issuelinktypeDeleteByCondition(IssuelinktypeExample issuelinktypeQueryCondition) {
		IssuelinktypeMapper mapperImpl = this.getSqlSession().getMapper(IssuelinktypeMapper.class);
		return mapperImpl.deleteByExample(issuelinktypeQueryCondition);
	}
	
	/**
	 * <param name="issuelinktype">从数据库中查询一个对象Issuelinktype</param>
	 * <param name="AId"></param>
	 */
	protected Issuelinktype issuelinktypeSelectByPrimaryKey(long AId) {
		IssuelinktypeMapper mapperImpl = this.getSqlSession().getMapper(IssuelinktypeMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="issuelinktypeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Issuelinktype> issuelinktypeSelectObjects(IssuelinktypeExample issuelinktypeQueryCondition) {
		IssuelinktypeMapper mapperImpl = this.getSqlSession().getMapper(IssuelinktypeMapper.class);
		return mapperImpl.selectByExample(issuelinktypeQueryCondition);
	}
	
	/**
	 * <param name="issuelinktypeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int issuelinktypeQuerySelectObjectsCount(IssuelinktypeExample issuelinktypeQueryCondition) {
		IssuelinktypeMapper mapperImpl = this.getSqlSession().getMapper(IssuelinktypeMapper.class);
		return mapperImpl.countByExample(issuelinktypeQueryCondition);
	}
	
	/**
	 * 插入一个对象Issuesecurityscheme到数据库中
	 * <param name="Issuesecurityscheme">需要插入的Issuesecurityscheme</param>
	 */
	protected int issuesecurityschemeInsert(Issuesecurityscheme issuesecurityscheme) {
		IssuesecurityschemeMapper mapperImpl = this.getSqlSession().getMapper(IssuesecurityschemeMapper.class);
		return mapperImpl.insertSelective(issuesecurityscheme);
	}
	
	/**
	 * 更新一个对象Issuesecurityscheme到数据库中
	 * <param name="issuesecurityscheme">需要更新的Issuesecurityscheme</param>
	 */
	protected int issuesecurityschemeUpdate(Issuesecurityscheme issuesecurityscheme) {
		IssuesecurityschemeMapper mapperImpl = this.getSqlSession().getMapper(IssuesecurityschemeMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(issuesecurityscheme);
		return ret;
	}
	
	/**
	 * 更新一个对象Issuesecurityscheme到数据库中
	 * <param name="issuesecurityscheme">需要更新的Issuesecurityscheme</param>
	 */
	protected int issuesecurityschemeUpdateSelective(Issuesecurityscheme issuesecurityscheme) {
		IssuesecurityschemeMapper mapperImpl = this.getSqlSession().getMapper(IssuesecurityschemeMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(issuesecurityscheme);
		return ret;
	}
	
	/**
	 * 更新一个对象Issuesecurityscheme到数据库中
	 * <param name="issuesecurityscheme">需要更新的Issuesecurityscheme</param>
	 */
	public int issuesecurityschemeUpdateWithBlobs(Issuesecurityscheme issuesecurityscheme) {
		IssuesecurityschemeMapper mapperImpl = this.getSqlSession().getMapper(IssuesecurityschemeMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(issuesecurityscheme);
	}
	
	/**
	 * 根据条件更新一批对象Issuesecurityscheme到数据库中
	 * <param name="issuesecurityscheme">需要更新的Issuesecurityscheme</param>
	 * <param name="issuesecurityschemeQueryCondition">附加的条件</param>
	 */
	protected int issuesecurityschemeUpdateByCondition(Issuesecurityscheme issuesecurityscheme, IssuesecurityschemeExample issuesecurityschemeQueryCondition) {
		IssuesecurityschemeMapper mapperImpl = this.getSqlSession().getMapper(IssuesecurityschemeMapper.class);
		int ret = mapperImpl.updateByExample(issuesecurityscheme, issuesecurityschemeQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Issuesecurityscheme到数据库中
	 * <param name="issuesecurityscheme">需要更新的Issuesecurityscheme</param>
	 * <param name="issuesecurityschemeQueryCondition">附加的条件</param>
	 */
	protected int issuesecurityschemeUpdateSelectiveByCondition(Issuesecurityscheme issuesecurityscheme, IssuesecurityschemeExample issuesecurityschemeQueryCondition) {
		IssuesecurityschemeMapper mapperImpl = this.getSqlSession().getMapper(IssuesecurityschemeMapper.class);
		int ret = mapperImpl.updateByExampleSelective(issuesecurityscheme, issuesecurityschemeQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="issuesecurityscheme">从数据库中删除一个对象Issuesecurityscheme</param>
	 * <param name="AId"></param>
	 */
	protected int issuesecurityschemeDeleteByPrimaryKey(long AId) {
		IssuesecurityschemeMapper mapperImpl = this.getSqlSession().getMapper(IssuesecurityschemeMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="issuesecurityscheme">从数据库中删除一个对象Issuesecurityscheme</param>
	 */
	protected int issuesecurityschemeDeleteByCondition(IssuesecurityschemeExample issuesecurityschemeQueryCondition) {
		IssuesecurityschemeMapper mapperImpl = this.getSqlSession().getMapper(IssuesecurityschemeMapper.class);
		return mapperImpl.deleteByExample(issuesecurityschemeQueryCondition);
	}
	
	/**
	 * <param name="issuesecurityscheme">从数据库中查询一个对象Issuesecurityscheme</param>
	 * <param name="AId"></param>
	 */
	protected Issuesecurityscheme issuesecurityschemeSelectByPrimaryKey(long AId) {
		IssuesecurityschemeMapper mapperImpl = this.getSqlSession().getMapper(IssuesecurityschemeMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="issuesecurityschemeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Issuesecurityscheme> issuesecurityschemeSelectObjects(IssuesecurityschemeExample issuesecurityschemeQueryCondition) {
		IssuesecurityschemeMapper mapperImpl = this.getSqlSession().getMapper(IssuesecurityschemeMapper.class);
		return mapperImpl.selectByExample(issuesecurityschemeQueryCondition);
	}
	
	/**
	 * <param name="issuesecurityschemeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Issuesecurityscheme> issuesecurityschemeSelectObjectsWithBLOBs(IssuesecurityschemeExample issuesecurityschemeQueryCondition) {
		IssuesecurityschemeMapper mapperImpl = this.getSqlSession().getMapper(IssuesecurityschemeMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(issuesecurityschemeQueryCondition);
	}
	
	/**
	 * <param name="issuesecurityschemeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int issuesecurityschemeQuerySelectObjectsCount(IssuesecurityschemeExample issuesecurityschemeQueryCondition) {
		IssuesecurityschemeMapper mapperImpl = this.getSqlSession().getMapper(IssuesecurityschemeMapper.class);
		return mapperImpl.countByExample(issuesecurityschemeQueryCondition);
	}
	
	/**
	 * 插入一个对象Issuestatus到数据库中
	 * <param name="Issuestatus">需要插入的Issuestatus</param>
	 */
	protected int issuestatusInsert(Issuestatus issuestatus) {
		IssuestatusMapper mapperImpl = this.getSqlSession().getMapper(IssuestatusMapper.class);
		return mapperImpl.insertSelective(issuestatus);
	}
	
	/**
	 * 更新一个对象Issuestatus到数据库中
	 * <param name="issuestatus">需要更新的Issuestatus</param>
	 */
	protected int issuestatusUpdate(Issuestatus issuestatus) {
		IssuestatusMapper mapperImpl = this.getSqlSession().getMapper(IssuestatusMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(issuestatus);
		return ret;
	}
	
	/**
	 * 更新一个对象Issuestatus到数据库中
	 * <param name="issuestatus">需要更新的Issuestatus</param>
	 */
	protected int issuestatusUpdateSelective(Issuestatus issuestatus) {
		IssuestatusMapper mapperImpl = this.getSqlSession().getMapper(IssuestatusMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(issuestatus);
		return ret;
	}
	
	/**
	 * 更新一个对象Issuestatus到数据库中
	 * <param name="issuestatus">需要更新的Issuestatus</param>
	 */
	public int issuestatusUpdateWithBlobs(Issuestatus issuestatus) {
		IssuestatusMapper mapperImpl = this.getSqlSession().getMapper(IssuestatusMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(issuestatus);
	}
	
	/**
	 * 根据条件更新一批对象Issuestatus到数据库中
	 * <param name="issuestatus">需要更新的Issuestatus</param>
	 * <param name="issuestatusQueryCondition">附加的条件</param>
	 */
	protected int issuestatusUpdateByCondition(Issuestatus issuestatus, IssuestatusExample issuestatusQueryCondition) {
		IssuestatusMapper mapperImpl = this.getSqlSession().getMapper(IssuestatusMapper.class);
		int ret = mapperImpl.updateByExample(issuestatus, issuestatusQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Issuestatus到数据库中
	 * <param name="issuestatus">需要更新的Issuestatus</param>
	 * <param name="issuestatusQueryCondition">附加的条件</param>
	 */
	protected int issuestatusUpdateSelectiveByCondition(Issuestatus issuestatus, IssuestatusExample issuestatusQueryCondition) {
		IssuestatusMapper mapperImpl = this.getSqlSession().getMapper(IssuestatusMapper.class);
		int ret = mapperImpl.updateByExampleSelective(issuestatus, issuestatusQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="issuestatus">从数据库中删除一个对象Issuestatus</param>
	 * <param name="AId"></param>
	 */
	protected int issuestatusDeleteByPrimaryKey(String AId) {
		IssuestatusMapper mapperImpl = this.getSqlSession().getMapper(IssuestatusMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="issuestatus">从数据库中删除一个对象Issuestatus</param>
	 */
	protected int issuestatusDeleteByCondition(IssuestatusExample issuestatusQueryCondition) {
		IssuestatusMapper mapperImpl = this.getSqlSession().getMapper(IssuestatusMapper.class);
		return mapperImpl.deleteByExample(issuestatusQueryCondition);
	}
	
	/**
	 * <param name="issuestatus">从数据库中查询一个对象Issuestatus</param>
	 * <param name="AId"></param>
	 */
	protected Issuestatus issuestatusSelectByPrimaryKey(String AId) {
		IssuestatusMapper mapperImpl = this.getSqlSession().getMapper(IssuestatusMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="issuestatusQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Issuestatus> issuestatusSelectObjects(IssuestatusExample issuestatusQueryCondition) {
		IssuestatusMapper mapperImpl = this.getSqlSession().getMapper(IssuestatusMapper.class);
		return mapperImpl.selectByExample(issuestatusQueryCondition);
	}
	
	/**
	 * <param name="issuestatusQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Issuestatus> issuestatusSelectObjectsWithBLOBs(IssuestatusExample issuestatusQueryCondition) {
		IssuestatusMapper mapperImpl = this.getSqlSession().getMapper(IssuestatusMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(issuestatusQueryCondition);
	}
	
	/**
	 * <param name="issuestatusQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int issuestatusQuerySelectObjectsCount(IssuestatusExample issuestatusQueryCondition) {
		IssuestatusMapper mapperImpl = this.getSqlSession().getMapper(IssuestatusMapper.class);
		return mapperImpl.countByExample(issuestatusQueryCondition);
	}
	
	/**
	 * 插入一个对象Issuetype到数据库中
	 * <param name="Issuetype">需要插入的Issuetype</param>
	 */
	protected int issuetypeInsert(Issuetype issuetype) {
		IssuetypeMapper mapperImpl = this.getSqlSession().getMapper(IssuetypeMapper.class);
		return mapperImpl.insertSelective(issuetype);
	}
	
	/**
	 * 更新一个对象Issuetype到数据库中
	 * <param name="issuetype">需要更新的Issuetype</param>
	 */
	protected int issuetypeUpdate(Issuetype issuetype) {
		IssuetypeMapper mapperImpl = this.getSqlSession().getMapper(IssuetypeMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(issuetype);
		return ret;
	}
	
	/**
	 * 更新一个对象Issuetype到数据库中
	 * <param name="issuetype">需要更新的Issuetype</param>
	 */
	protected int issuetypeUpdateSelective(Issuetype issuetype) {
		IssuetypeMapper mapperImpl = this.getSqlSession().getMapper(IssuetypeMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(issuetype);
		return ret;
	}
	
	/**
	 * 更新一个对象Issuetype到数据库中
	 * <param name="issuetype">需要更新的Issuetype</param>
	 */
	public int issuetypeUpdateWithBlobs(Issuetype issuetype) {
		IssuetypeMapper mapperImpl = this.getSqlSession().getMapper(IssuetypeMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(issuetype);
	}
	
	/**
	 * 根据条件更新一批对象Issuetype到数据库中
	 * <param name="issuetype">需要更新的Issuetype</param>
	 * <param name="issuetypeQueryCondition">附加的条件</param>
	 */
	protected int issuetypeUpdateByCondition(Issuetype issuetype, IssuetypeExample issuetypeQueryCondition) {
		IssuetypeMapper mapperImpl = this.getSqlSession().getMapper(IssuetypeMapper.class);
		int ret = mapperImpl.updateByExample(issuetype, issuetypeQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Issuetype到数据库中
	 * <param name="issuetype">需要更新的Issuetype</param>
	 * <param name="issuetypeQueryCondition">附加的条件</param>
	 */
	protected int issuetypeUpdateSelectiveByCondition(Issuetype issuetype, IssuetypeExample issuetypeQueryCondition) {
		IssuetypeMapper mapperImpl = this.getSqlSession().getMapper(IssuetypeMapper.class);
		int ret = mapperImpl.updateByExampleSelective(issuetype, issuetypeQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="issuetype">从数据库中删除一个对象Issuetype</param>
	 * <param name="AId"></param>
	 */
	protected int issuetypeDeleteByPrimaryKey(String AId) {
		IssuetypeMapper mapperImpl = this.getSqlSession().getMapper(IssuetypeMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="issuetype">从数据库中删除一个对象Issuetype</param>
	 */
	protected int issuetypeDeleteByCondition(IssuetypeExample issuetypeQueryCondition) {
		IssuetypeMapper mapperImpl = this.getSqlSession().getMapper(IssuetypeMapper.class);
		return mapperImpl.deleteByExample(issuetypeQueryCondition);
	}
	
	/**
	 * <param name="issuetype">从数据库中查询一个对象Issuetype</param>
	 * <param name="AId"></param>
	 */
	protected Issuetype issuetypeSelectByPrimaryKey(String AId) {
		IssuetypeMapper mapperImpl = this.getSqlSession().getMapper(IssuetypeMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="issuetypeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Issuetype> issuetypeSelectObjects(IssuetypeExample issuetypeQueryCondition) {
		IssuetypeMapper mapperImpl = this.getSqlSession().getMapper(IssuetypeMapper.class);
		return mapperImpl.selectByExample(issuetypeQueryCondition);
	}
	
	/**
	 * <param name="issuetypeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Issuetype> issuetypeSelectObjectsWithBLOBs(IssuetypeExample issuetypeQueryCondition) {
		IssuetypeMapper mapperImpl = this.getSqlSession().getMapper(IssuetypeMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(issuetypeQueryCondition);
	}
	
	/**
	 * <param name="issuetypeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int issuetypeQuerySelectObjectsCount(IssuetypeExample issuetypeQueryCondition) {
		IssuetypeMapper mapperImpl = this.getSqlSession().getMapper(IssuetypeMapper.class);
		return mapperImpl.countByExample(issuetypeQueryCondition);
	}
	
	/**
	 * 插入一个对象Issuetypescreenscheme到数据库中
	 * <param name="Issuetypescreenscheme">需要插入的Issuetypescreenscheme</param>
	 */
	protected int issuetypescreenschemeInsert(Issuetypescreenscheme issuetypescreenscheme) {
		IssuetypescreenschemeMapper mapperImpl = this.getSqlSession().getMapper(IssuetypescreenschemeMapper.class);
		return mapperImpl.insertSelective(issuetypescreenscheme);
	}
	
	/**
	 * 更新一个对象Issuetypescreenscheme到数据库中
	 * <param name="issuetypescreenscheme">需要更新的Issuetypescreenscheme</param>
	 */
	protected int issuetypescreenschemeUpdate(Issuetypescreenscheme issuetypescreenscheme) {
		IssuetypescreenschemeMapper mapperImpl = this.getSqlSession().getMapper(IssuetypescreenschemeMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(issuetypescreenscheme);
		return ret;
	}
	
	/**
	 * 更新一个对象Issuetypescreenscheme到数据库中
	 * <param name="issuetypescreenscheme">需要更新的Issuetypescreenscheme</param>
	 */
	protected int issuetypescreenschemeUpdateSelective(Issuetypescreenscheme issuetypescreenscheme) {
		IssuetypescreenschemeMapper mapperImpl = this.getSqlSession().getMapper(IssuetypescreenschemeMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(issuetypescreenscheme);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Issuetypescreenscheme到数据库中
	 * <param name="issuetypescreenscheme">需要更新的Issuetypescreenscheme</param>
	 * <param name="issuetypescreenschemeQueryCondition">附加的条件</param>
	 */
	protected int issuetypescreenschemeUpdateByCondition(Issuetypescreenscheme issuetypescreenscheme, IssuetypescreenschemeExample issuetypescreenschemeQueryCondition) {
		IssuetypescreenschemeMapper mapperImpl = this.getSqlSession().getMapper(IssuetypescreenschemeMapper.class);
		int ret = mapperImpl.updateByExample(issuetypescreenscheme, issuetypescreenschemeQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Issuetypescreenscheme到数据库中
	 * <param name="issuetypescreenscheme">需要更新的Issuetypescreenscheme</param>
	 * <param name="issuetypescreenschemeQueryCondition">附加的条件</param>
	 */
	protected int issuetypescreenschemeUpdateSelectiveByCondition(Issuetypescreenscheme issuetypescreenscheme, IssuetypescreenschemeExample issuetypescreenschemeQueryCondition) {
		IssuetypescreenschemeMapper mapperImpl = this.getSqlSession().getMapper(IssuetypescreenschemeMapper.class);
		int ret = mapperImpl.updateByExampleSelective(issuetypescreenscheme, issuetypescreenschemeQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="issuetypescreenscheme">从数据库中删除一个对象Issuetypescreenscheme</param>
	 * <param name="AId"></param>
	 */
	protected int issuetypescreenschemeDeleteByPrimaryKey(long AId) {
		IssuetypescreenschemeMapper mapperImpl = this.getSqlSession().getMapper(IssuetypescreenschemeMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="issuetypescreenscheme">从数据库中删除一个对象Issuetypescreenscheme</param>
	 */
	protected int issuetypescreenschemeDeleteByCondition(IssuetypescreenschemeExample issuetypescreenschemeQueryCondition) {
		IssuetypescreenschemeMapper mapperImpl = this.getSqlSession().getMapper(IssuetypescreenschemeMapper.class);
		return mapperImpl.deleteByExample(issuetypescreenschemeQueryCondition);
	}
	
	/**
	 * <param name="issuetypescreenscheme">从数据库中查询一个对象Issuetypescreenscheme</param>
	 * <param name="AId"></param>
	 */
	protected Issuetypescreenscheme issuetypescreenschemeSelectByPrimaryKey(long AId) {
		IssuetypescreenschemeMapper mapperImpl = this.getSqlSession().getMapper(IssuetypescreenschemeMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="issuetypescreenschemeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Issuetypescreenscheme> issuetypescreenschemeSelectObjects(IssuetypescreenschemeExample issuetypescreenschemeQueryCondition) {
		IssuetypescreenschemeMapper mapperImpl = this.getSqlSession().getMapper(IssuetypescreenschemeMapper.class);
		return mapperImpl.selectByExample(issuetypescreenschemeQueryCondition);
	}
	
	/**
	 * <param name="issuetypescreenschemeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int issuetypescreenschemeQuerySelectObjectsCount(IssuetypescreenschemeExample issuetypescreenschemeQueryCondition) {
		IssuetypescreenschemeMapper mapperImpl = this.getSqlSession().getMapper(IssuetypescreenschemeMapper.class);
		return mapperImpl.countByExample(issuetypescreenschemeQueryCondition);
	}
	
	/**
	 * 插入一个对象Issuetypescreenschemeentity到数据库中
	 * <param name="Issuetypescreenschemeentity">需要插入的Issuetypescreenschemeentity</param>
	 */
	protected int issuetypescreenschemeentityInsert(Issuetypescreenschemeentity issuetypescreenschemeentity) {
		IssuetypescreenschemeentityMapper mapperImpl = this.getSqlSession().getMapper(IssuetypescreenschemeentityMapper.class);
		return mapperImpl.insertSelective(issuetypescreenschemeentity);
	}
	
	/**
	 * 更新一个对象Issuetypescreenschemeentity到数据库中
	 * <param name="issuetypescreenschemeentity">需要更新的Issuetypescreenschemeentity</param>
	 */
	protected int issuetypescreenschemeentityUpdate(Issuetypescreenschemeentity issuetypescreenschemeentity) {
		IssuetypescreenschemeentityMapper mapperImpl = this.getSqlSession().getMapper(IssuetypescreenschemeentityMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(issuetypescreenschemeentity);
		return ret;
	}
	
	/**
	 * 更新一个对象Issuetypescreenschemeentity到数据库中
	 * <param name="issuetypescreenschemeentity">需要更新的Issuetypescreenschemeentity</param>
	 */
	protected int issuetypescreenschemeentityUpdateSelective(Issuetypescreenschemeentity issuetypescreenschemeentity) {
		IssuetypescreenschemeentityMapper mapperImpl = this.getSqlSession().getMapper(IssuetypescreenschemeentityMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(issuetypescreenschemeentity);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Issuetypescreenschemeentity到数据库中
	 * <param name="issuetypescreenschemeentity">需要更新的Issuetypescreenschemeentity</param>
	 * <param name="issuetypescreenschemeentityQueryCondition">附加的条件</param>
	 */
	protected int issuetypescreenschemeentityUpdateByCondition(Issuetypescreenschemeentity issuetypescreenschemeentity, IssuetypescreenschemeentityExample issuetypescreenschemeentityQueryCondition) {
		IssuetypescreenschemeentityMapper mapperImpl = this.getSqlSession().getMapper(IssuetypescreenschemeentityMapper.class);
		int ret = mapperImpl.updateByExample(issuetypescreenschemeentity, issuetypescreenschemeentityQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Issuetypescreenschemeentity到数据库中
	 * <param name="issuetypescreenschemeentity">需要更新的Issuetypescreenschemeentity</param>
	 * <param name="issuetypescreenschemeentityQueryCondition">附加的条件</param>
	 */
	protected int issuetypescreenschemeentityUpdateSelectiveByCondition(Issuetypescreenschemeentity issuetypescreenschemeentity, IssuetypescreenschemeentityExample issuetypescreenschemeentityQueryCondition) {
		IssuetypescreenschemeentityMapper mapperImpl = this.getSqlSession().getMapper(IssuetypescreenschemeentityMapper.class);
		int ret = mapperImpl.updateByExampleSelective(issuetypescreenschemeentity, issuetypescreenschemeentityQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="issuetypescreenschemeentity">从数据库中删除一个对象Issuetypescreenschemeentity</param>
	 * <param name="AId"></param>
	 */
	protected int issuetypescreenschemeentityDeleteByPrimaryKey(long AId) {
		IssuetypescreenschemeentityMapper mapperImpl = this.getSqlSession().getMapper(IssuetypescreenschemeentityMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="issuetypescreenschemeentity">从数据库中删除一个对象Issuetypescreenschemeentity</param>
	 */
	protected int issuetypescreenschemeentityDeleteByCondition(IssuetypescreenschemeentityExample issuetypescreenschemeentityQueryCondition) {
		IssuetypescreenschemeentityMapper mapperImpl = this.getSqlSession().getMapper(IssuetypescreenschemeentityMapper.class);
		return mapperImpl.deleteByExample(issuetypescreenschemeentityQueryCondition);
	}
	
	/**
	 * <param name="issuetypescreenschemeentity">从数据库中查询一个对象Issuetypescreenschemeentity</param>
	 * <param name="AId"></param>
	 */
	protected Issuetypescreenschemeentity issuetypescreenschemeentitySelectByPrimaryKey(long AId) {
		IssuetypescreenschemeentityMapper mapperImpl = this.getSqlSession().getMapper(IssuetypescreenschemeentityMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="issuetypescreenschemeentityQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Issuetypescreenschemeentity> issuetypescreenschemeentitySelectObjects(IssuetypescreenschemeentityExample issuetypescreenschemeentityQueryCondition) {
		IssuetypescreenschemeentityMapper mapperImpl = this.getSqlSession().getMapper(IssuetypescreenschemeentityMapper.class);
		return mapperImpl.selectByExample(issuetypescreenschemeentityQueryCondition);
	}
	
	/**
	 * <param name="issuetypescreenschemeentityQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int issuetypescreenschemeentityQuerySelectObjectsCount(IssuetypescreenschemeentityExample issuetypescreenschemeentityQueryCondition) {
		IssuetypescreenschemeentityMapper mapperImpl = this.getSqlSession().getMapper(IssuetypescreenschemeentityMapper.class);
		return mapperImpl.countByExample(issuetypescreenschemeentityQueryCondition);
	}
	
	/**
	 * 插入一个对象Jiraaction到数据库中
	 * <param name="Jiraaction">需要插入的Jiraaction</param>
	 */
	protected int jiraactionInsert(Jiraaction jiraaction) {
		JiraactionMapper mapperImpl = this.getSqlSession().getMapper(JiraactionMapper.class);
		return mapperImpl.insertSelective(jiraaction);
	}
	
	/**
	 * 更新一个对象Jiraaction到数据库中
	 * <param name="jiraaction">需要更新的Jiraaction</param>
	 */
	protected int jiraactionUpdate(Jiraaction jiraaction) {
		JiraactionMapper mapperImpl = this.getSqlSession().getMapper(JiraactionMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(jiraaction);
		return ret;
	}
	
	/**
	 * 更新一个对象Jiraaction到数据库中
	 * <param name="jiraaction">需要更新的Jiraaction</param>
	 */
	protected int jiraactionUpdateSelective(Jiraaction jiraaction) {
		JiraactionMapper mapperImpl = this.getSqlSession().getMapper(JiraactionMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(jiraaction);
		return ret;
	}
	
	/**
	 * 更新一个对象Jiraaction到数据库中
	 * <param name="jiraaction">需要更新的Jiraaction</param>
	 */
	public int jiraactionUpdateWithBlobs(Jiraaction jiraaction) {
		JiraactionMapper mapperImpl = this.getSqlSession().getMapper(JiraactionMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(jiraaction);
	}
	
	/**
	 * 根据条件更新一批对象Jiraaction到数据库中
	 * <param name="jiraaction">需要更新的Jiraaction</param>
	 * <param name="jiraactionQueryCondition">附加的条件</param>
	 */
	protected int jiraactionUpdateByCondition(Jiraaction jiraaction, JiraactionExample jiraactionQueryCondition) {
		JiraactionMapper mapperImpl = this.getSqlSession().getMapper(JiraactionMapper.class);
		int ret = mapperImpl.updateByExample(jiraaction, jiraactionQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Jiraaction到数据库中
	 * <param name="jiraaction">需要更新的Jiraaction</param>
	 * <param name="jiraactionQueryCondition">附加的条件</param>
	 */
	protected int jiraactionUpdateSelectiveByCondition(Jiraaction jiraaction, JiraactionExample jiraactionQueryCondition) {
		JiraactionMapper mapperImpl = this.getSqlSession().getMapper(JiraactionMapper.class);
		int ret = mapperImpl.updateByExampleSelective(jiraaction, jiraactionQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="jiraaction">从数据库中删除一个对象Jiraaction</param>
	 * <param name="AId"></param>
	 */
	protected int jiraactionDeleteByPrimaryKey(long AId) {
		JiraactionMapper mapperImpl = this.getSqlSession().getMapper(JiraactionMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="jiraaction">从数据库中删除一个对象Jiraaction</param>
	 */
	protected int jiraactionDeleteByCondition(JiraactionExample jiraactionQueryCondition) {
		JiraactionMapper mapperImpl = this.getSqlSession().getMapper(JiraactionMapper.class);
		return mapperImpl.deleteByExample(jiraactionQueryCondition);
	}
	
	/**
	 * <param name="jiraaction">从数据库中查询一个对象Jiraaction</param>
	 * <param name="AId"></param>
	 */
	protected Jiraaction jiraactionSelectByPrimaryKey(long AId) {
		JiraactionMapper mapperImpl = this.getSqlSession().getMapper(JiraactionMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="jiraactionQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Jiraaction> jiraactionSelectObjects(JiraactionExample jiraactionQueryCondition) {
		JiraactionMapper mapperImpl = this.getSqlSession().getMapper(JiraactionMapper.class);
		return mapperImpl.selectByExample(jiraactionQueryCondition);
	}
	
	/**
	 * <param name="jiraactionQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Jiraaction> jiraactionSelectObjectsWithBLOBs(JiraactionExample jiraactionQueryCondition) {
		JiraactionMapper mapperImpl = this.getSqlSession().getMapper(JiraactionMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(jiraactionQueryCondition);
	}
	
	/**
	 * <param name="jiraactionQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int jiraactionQuerySelectObjectsCount(JiraactionExample jiraactionQueryCondition) {
		JiraactionMapper mapperImpl = this.getSqlSession().getMapper(JiraactionMapper.class);
		return mapperImpl.countByExample(jiraactionQueryCondition);
	}
	
	/**
	 * 插入一个对象Jiradraftworkflows到数据库中
	 * <param name="Jiradraftworkflows">需要插入的Jiradraftworkflows</param>
	 */
	protected int jiradraftworkflowsInsert(Jiradraftworkflows jiradraftworkflows) {
		JiradraftworkflowsMapper mapperImpl = this.getSqlSession().getMapper(JiradraftworkflowsMapper.class);
		return mapperImpl.insertSelective(jiradraftworkflows);
	}
	
	/**
	 * 更新一个对象Jiradraftworkflows到数据库中
	 * <param name="jiradraftworkflows">需要更新的Jiradraftworkflows</param>
	 */
	protected int jiradraftworkflowsUpdate(Jiradraftworkflows jiradraftworkflows) {
		JiradraftworkflowsMapper mapperImpl = this.getSqlSession().getMapper(JiradraftworkflowsMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(jiradraftworkflows);
		return ret;
	}
	
	/**
	 * 更新一个对象Jiradraftworkflows到数据库中
	 * <param name="jiradraftworkflows">需要更新的Jiradraftworkflows</param>
	 */
	protected int jiradraftworkflowsUpdateSelective(Jiradraftworkflows jiradraftworkflows) {
		JiradraftworkflowsMapper mapperImpl = this.getSqlSession().getMapper(JiradraftworkflowsMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(jiradraftworkflows);
		return ret;
	}
	
	/**
	 * 更新一个对象Jiradraftworkflows到数据库中
	 * <param name="jiradraftworkflows">需要更新的Jiradraftworkflows</param>
	 */
	public int jiradraftworkflowsUpdateWithBlobs(Jiradraftworkflows jiradraftworkflows) {
		JiradraftworkflowsMapper mapperImpl = this.getSqlSession().getMapper(JiradraftworkflowsMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(jiradraftworkflows);
	}
	
	/**
	 * 根据条件更新一批对象Jiradraftworkflows到数据库中
	 * <param name="jiradraftworkflows">需要更新的Jiradraftworkflows</param>
	 * <param name="jiradraftworkflowsQueryCondition">附加的条件</param>
	 */
	protected int jiradraftworkflowsUpdateByCondition(Jiradraftworkflows jiradraftworkflows, JiradraftworkflowsExample jiradraftworkflowsQueryCondition) {
		JiradraftworkflowsMapper mapperImpl = this.getSqlSession().getMapper(JiradraftworkflowsMapper.class);
		int ret = mapperImpl.updateByExample(jiradraftworkflows, jiradraftworkflowsQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Jiradraftworkflows到数据库中
	 * <param name="jiradraftworkflows">需要更新的Jiradraftworkflows</param>
	 * <param name="jiradraftworkflowsQueryCondition">附加的条件</param>
	 */
	protected int jiradraftworkflowsUpdateSelectiveByCondition(Jiradraftworkflows jiradraftworkflows, JiradraftworkflowsExample jiradraftworkflowsQueryCondition) {
		JiradraftworkflowsMapper mapperImpl = this.getSqlSession().getMapper(JiradraftworkflowsMapper.class);
		int ret = mapperImpl.updateByExampleSelective(jiradraftworkflows, jiradraftworkflowsQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="jiradraftworkflows">从数据库中删除一个对象Jiradraftworkflows</param>
	 * <param name="AId"></param>
	 */
	protected int jiradraftworkflowsDeleteByPrimaryKey(long AId) {
		JiradraftworkflowsMapper mapperImpl = this.getSqlSession().getMapper(JiradraftworkflowsMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="jiradraftworkflows">从数据库中删除一个对象Jiradraftworkflows</param>
	 */
	protected int jiradraftworkflowsDeleteByCondition(JiradraftworkflowsExample jiradraftworkflowsQueryCondition) {
		JiradraftworkflowsMapper mapperImpl = this.getSqlSession().getMapper(JiradraftworkflowsMapper.class);
		return mapperImpl.deleteByExample(jiradraftworkflowsQueryCondition);
	}
	
	/**
	 * <param name="jiradraftworkflows">从数据库中查询一个对象Jiradraftworkflows</param>
	 * <param name="AId"></param>
	 */
	protected Jiradraftworkflows jiradraftworkflowsSelectByPrimaryKey(long AId) {
		JiradraftworkflowsMapper mapperImpl = this.getSqlSession().getMapper(JiradraftworkflowsMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="jiradraftworkflowsQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Jiradraftworkflows> jiradraftworkflowsSelectObjects(JiradraftworkflowsExample jiradraftworkflowsQueryCondition) {
		JiradraftworkflowsMapper mapperImpl = this.getSqlSession().getMapper(JiradraftworkflowsMapper.class);
		return mapperImpl.selectByExample(jiradraftworkflowsQueryCondition);
	}
	
	/**
	 * <param name="jiradraftworkflowsQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Jiradraftworkflows> jiradraftworkflowsSelectObjectsWithBLOBs(JiradraftworkflowsExample jiradraftworkflowsQueryCondition) {
		JiradraftworkflowsMapper mapperImpl = this.getSqlSession().getMapper(JiradraftworkflowsMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(jiradraftworkflowsQueryCondition);
	}
	
	/**
	 * <param name="jiradraftworkflowsQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int jiradraftworkflowsQuerySelectObjectsCount(JiradraftworkflowsExample jiradraftworkflowsQueryCondition) {
		JiradraftworkflowsMapper mapperImpl = this.getSqlSession().getMapper(JiradraftworkflowsMapper.class);
		return mapperImpl.countByExample(jiradraftworkflowsQueryCondition);
	}
	
	/**
	 * 插入一个对象Jiraeventtype到数据库中
	 * <param name="Jiraeventtype">需要插入的Jiraeventtype</param>
	 */
	protected int jiraeventtypeInsert(Jiraeventtype jiraeventtype) {
		JiraeventtypeMapper mapperImpl = this.getSqlSession().getMapper(JiraeventtypeMapper.class);
		return mapperImpl.insertSelective(jiraeventtype);
	}
	
	/**
	 * 更新一个对象Jiraeventtype到数据库中
	 * <param name="jiraeventtype">需要更新的Jiraeventtype</param>
	 */
	protected int jiraeventtypeUpdate(Jiraeventtype jiraeventtype) {
		JiraeventtypeMapper mapperImpl = this.getSqlSession().getMapper(JiraeventtypeMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(jiraeventtype);
		return ret;
	}
	
	/**
	 * 更新一个对象Jiraeventtype到数据库中
	 * <param name="jiraeventtype">需要更新的Jiraeventtype</param>
	 */
	protected int jiraeventtypeUpdateSelective(Jiraeventtype jiraeventtype) {
		JiraeventtypeMapper mapperImpl = this.getSqlSession().getMapper(JiraeventtypeMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(jiraeventtype);
		return ret;
	}
	
	/**
	 * 更新一个对象Jiraeventtype到数据库中
	 * <param name="jiraeventtype">需要更新的Jiraeventtype</param>
	 */
	public int jiraeventtypeUpdateWithBlobs(Jiraeventtype jiraeventtype) {
		JiraeventtypeMapper mapperImpl = this.getSqlSession().getMapper(JiraeventtypeMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(jiraeventtype);
	}
	
	/**
	 * 根据条件更新一批对象Jiraeventtype到数据库中
	 * <param name="jiraeventtype">需要更新的Jiraeventtype</param>
	 * <param name="jiraeventtypeQueryCondition">附加的条件</param>
	 */
	protected int jiraeventtypeUpdateByCondition(Jiraeventtype jiraeventtype, JiraeventtypeExample jiraeventtypeQueryCondition) {
		JiraeventtypeMapper mapperImpl = this.getSqlSession().getMapper(JiraeventtypeMapper.class);
		int ret = mapperImpl.updateByExample(jiraeventtype, jiraeventtypeQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Jiraeventtype到数据库中
	 * <param name="jiraeventtype">需要更新的Jiraeventtype</param>
	 * <param name="jiraeventtypeQueryCondition">附加的条件</param>
	 */
	protected int jiraeventtypeUpdateSelectiveByCondition(Jiraeventtype jiraeventtype, JiraeventtypeExample jiraeventtypeQueryCondition) {
		JiraeventtypeMapper mapperImpl = this.getSqlSession().getMapper(JiraeventtypeMapper.class);
		int ret = mapperImpl.updateByExampleSelective(jiraeventtype, jiraeventtypeQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="jiraeventtype">从数据库中删除一个对象Jiraeventtype</param>
	 * <param name="AId"></param>
	 */
	protected int jiraeventtypeDeleteByPrimaryKey(long AId) {
		JiraeventtypeMapper mapperImpl = this.getSqlSession().getMapper(JiraeventtypeMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="jiraeventtype">从数据库中删除一个对象Jiraeventtype</param>
	 */
	protected int jiraeventtypeDeleteByCondition(JiraeventtypeExample jiraeventtypeQueryCondition) {
		JiraeventtypeMapper mapperImpl = this.getSqlSession().getMapper(JiraeventtypeMapper.class);
		return mapperImpl.deleteByExample(jiraeventtypeQueryCondition);
	}
	
	/**
	 * <param name="jiraeventtype">从数据库中查询一个对象Jiraeventtype</param>
	 * <param name="AId"></param>
	 */
	protected Jiraeventtype jiraeventtypeSelectByPrimaryKey(long AId) {
		JiraeventtypeMapper mapperImpl = this.getSqlSession().getMapper(JiraeventtypeMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="jiraeventtypeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Jiraeventtype> jiraeventtypeSelectObjects(JiraeventtypeExample jiraeventtypeQueryCondition) {
		JiraeventtypeMapper mapperImpl = this.getSqlSession().getMapper(JiraeventtypeMapper.class);
		return mapperImpl.selectByExample(jiraeventtypeQueryCondition);
	}
	
	/**
	 * <param name="jiraeventtypeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Jiraeventtype> jiraeventtypeSelectObjectsWithBLOBs(JiraeventtypeExample jiraeventtypeQueryCondition) {
		JiraeventtypeMapper mapperImpl = this.getSqlSession().getMapper(JiraeventtypeMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(jiraeventtypeQueryCondition);
	}
	
	/**
	 * <param name="jiraeventtypeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int jiraeventtypeQuerySelectObjectsCount(JiraeventtypeExample jiraeventtypeQueryCondition) {
		JiraeventtypeMapper mapperImpl = this.getSqlSession().getMapper(JiraeventtypeMapper.class);
		return mapperImpl.countByExample(jiraeventtypeQueryCondition);
	}
	
	/**
	 * 插入一个对象JiraissueWithBLOBs到数据库中
	 * <param name="JiraissueWithBLOBs">需要插入的JiraissueWithBLOBs</param>
	 */
	protected int jiraissueInsert(JiraissueWithBLOBs jiraissue) {
		JiraissueMapper mapperImpl = this.getSqlSession().getMapper(JiraissueMapper.class);
		return mapperImpl.insertSelective(jiraissue);
	}
	
	/**
	 * 更新一个对象Jiraissue到数据库中
	 * <param name="jiraissue">需要更新的Jiraissue</param>
	 */
	protected int jiraissueUpdate(Jiraissue jiraissue) {
		JiraissueMapper mapperImpl = this.getSqlSession().getMapper(JiraissueMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(jiraissue);
		return ret;
	}
	
	/**
	 * 更新一个对象Jiraissue到数据库中
	 * <param name="jiraissue">需要更新的Jiraissue</param>
	 */
	protected int jiraissueUpdateSelective(JiraissueWithBLOBs jiraissue) {
		JiraissueMapper mapperImpl = this.getSqlSession().getMapper(JiraissueMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(jiraissue);
		return ret;
	}
	
	/**
	 * 更新一个对象JiraissueWithBLOBs到数据库中
	 * <param name="jiraissue">需要更新的Jiraissue</param>
	 */
	public int jiraissueUpdateWithBlobs(JiraissueWithBLOBs jiraissue) {
		JiraissueMapper mapperImpl = this.getSqlSession().getMapper(JiraissueMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(jiraissue);
	}
	
	/**
	 * 根据条件更新一批对象Jiraissue到数据库中
	 * <param name="jiraissue">需要更新的Jiraissue</param>
	 * <param name="jiraissueQueryCondition">附加的条件</param>
	 */
	protected int jiraissueUpdateByCondition(Jiraissue jiraissue, JiraissueExample jiraissueQueryCondition) {
		JiraissueMapper mapperImpl = this.getSqlSession().getMapper(JiraissueMapper.class);
		int ret = mapperImpl.updateByExample(jiraissue, jiraissueQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Jiraissue到数据库中
	 * <param name="jiraissue">需要更新的Jiraissue</param>
	 * <param name="jiraissueQueryCondition">附加的条件</param>
	 */
	protected int jiraissueUpdateSelectiveByCondition(JiraissueWithBLOBs jiraissue, JiraissueExample jiraissueQueryCondition) {
		JiraissueMapper mapperImpl = this.getSqlSession().getMapper(JiraissueMapper.class);
		int ret = mapperImpl.updateByExampleSelective(jiraissue, jiraissueQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="jiraissue">从数据库中删除一个对象Jiraissue</param>
	 * <param name="AId"></param>
	 */
	protected int jiraissueDeleteByPrimaryKey(long AId) {
		JiraissueMapper mapperImpl = this.getSqlSession().getMapper(JiraissueMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="jiraissue">从数据库中删除一个对象Jiraissue</param>
	 */
	protected int jiraissueDeleteByCondition(JiraissueExample jiraissueQueryCondition) {
		JiraissueMapper mapperImpl = this.getSqlSession().getMapper(JiraissueMapper.class);
		return mapperImpl.deleteByExample(jiraissueQueryCondition);
	}
	
	/**
	 * <param name="jiraissue">从数据库中查询一个对象JiraissueWithBLOBs</param>
	 * <param name="AId"></param>
	 */
	protected JiraissueWithBLOBs jiraissueSelectByPrimaryKey(long AId) {
		JiraissueMapper mapperImpl = this.getSqlSession().getMapper(JiraissueMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="jiraissueQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Jiraissue> jiraissueSelectObjects(JiraissueExample jiraissueQueryCondition) {
		JiraissueMapper mapperImpl = this.getSqlSession().getMapper(JiraissueMapper.class);
		return mapperImpl.selectByExample(jiraissueQueryCondition);
	}
	
	/**
	 * <param name="jiraissueQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<JiraissueWithBLOBs> jiraissueSelectObjectsWithBLOBs(JiraissueExample jiraissueQueryCondition) {
		JiraissueMapper mapperImpl = this.getSqlSession().getMapper(JiraissueMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(jiraissueQueryCondition);
	}
	
	/**
	 * <param name="jiraissueQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int jiraissueQuerySelectObjectsCount(JiraissueExample jiraissueQueryCondition) {
		JiraissueMapper mapperImpl = this.getSqlSession().getMapper(JiraissueMapper.class);
		return mapperImpl.countByExample(jiraissueQueryCondition);
	}
	
	/**
	 * 插入一个对象Jiraperms到数据库中
	 * <param name="Jiraperms">需要插入的Jiraperms</param>
	 */
	protected int jirapermsInsert(Jiraperms jiraperms) {
		JirapermsMapper mapperImpl = this.getSqlSession().getMapper(JirapermsMapper.class);
		return mapperImpl.insertSelective(jiraperms);
	}
	
	/**
	 * 更新一个对象Jiraperms到数据库中
	 * <param name="jiraperms">需要更新的Jiraperms</param>
	 */
	protected int jirapermsUpdate(Jiraperms jiraperms) {
		JirapermsMapper mapperImpl = this.getSqlSession().getMapper(JirapermsMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(jiraperms);
		return ret;
	}
	
	/**
	 * 更新一个对象Jiraperms到数据库中
	 * <param name="jiraperms">需要更新的Jiraperms</param>
	 */
	protected int jirapermsUpdateSelective(Jiraperms jiraperms) {
		JirapermsMapper mapperImpl = this.getSqlSession().getMapper(JirapermsMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(jiraperms);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Jiraperms到数据库中
	 * <param name="jiraperms">需要更新的Jiraperms</param>
	 * <param name="jirapermsQueryCondition">附加的条件</param>
	 */
	protected int jirapermsUpdateByCondition(Jiraperms jiraperms, JirapermsExample jirapermsQueryCondition) {
		JirapermsMapper mapperImpl = this.getSqlSession().getMapper(JirapermsMapper.class);
		int ret = mapperImpl.updateByExample(jiraperms, jirapermsQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Jiraperms到数据库中
	 * <param name="jiraperms">需要更新的Jiraperms</param>
	 * <param name="jirapermsQueryCondition">附加的条件</param>
	 */
	protected int jirapermsUpdateSelectiveByCondition(Jiraperms jiraperms, JirapermsExample jirapermsQueryCondition) {
		JirapermsMapper mapperImpl = this.getSqlSession().getMapper(JirapermsMapper.class);
		int ret = mapperImpl.updateByExampleSelective(jiraperms, jirapermsQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="jiraperms">从数据库中删除一个对象Jiraperms</param>
	 * <param name="AId"></param>
	 */
	protected int jirapermsDeleteByPrimaryKey(long AId) {
		JirapermsMapper mapperImpl = this.getSqlSession().getMapper(JirapermsMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="jiraperms">从数据库中删除一个对象Jiraperms</param>
	 */
	protected int jirapermsDeleteByCondition(JirapermsExample jirapermsQueryCondition) {
		JirapermsMapper mapperImpl = this.getSqlSession().getMapper(JirapermsMapper.class);
		return mapperImpl.deleteByExample(jirapermsQueryCondition);
	}
	
	/**
	 * <param name="jiraperms">从数据库中查询一个对象Jiraperms</param>
	 * <param name="AId"></param>
	 */
	protected Jiraperms jirapermsSelectByPrimaryKey(long AId) {
		JirapermsMapper mapperImpl = this.getSqlSession().getMapper(JirapermsMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="jirapermsQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Jiraperms> jirapermsSelectObjects(JirapermsExample jirapermsQueryCondition) {
		JirapermsMapper mapperImpl = this.getSqlSession().getMapper(JirapermsMapper.class);
		return mapperImpl.selectByExample(jirapermsQueryCondition);
	}
	
	/**
	 * <param name="jirapermsQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int jirapermsQuerySelectObjectsCount(JirapermsExample jirapermsQueryCondition) {
		JirapermsMapper mapperImpl = this.getSqlSession().getMapper(JirapermsMapper.class);
		return mapperImpl.countByExample(jirapermsQueryCondition);
	}
	
	/**
	 * 插入一个对象Jiraworkflows到数据库中
	 * <param name="Jiraworkflows">需要插入的Jiraworkflows</param>
	 */
	protected int jiraworkflowsInsert(Jiraworkflows jiraworkflows) {
		JiraworkflowsMapper mapperImpl = this.getSqlSession().getMapper(JiraworkflowsMapper.class);
		return mapperImpl.insertSelective(jiraworkflows);
	}
	
	/**
	 * 更新一个对象Jiraworkflows到数据库中
	 * <param name="jiraworkflows">需要更新的Jiraworkflows</param>
	 */
	protected int jiraworkflowsUpdate(Jiraworkflows jiraworkflows) {
		JiraworkflowsMapper mapperImpl = this.getSqlSession().getMapper(JiraworkflowsMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(jiraworkflows);
		return ret;
	}
	
	/**
	 * 更新一个对象Jiraworkflows到数据库中
	 * <param name="jiraworkflows">需要更新的Jiraworkflows</param>
	 */
	protected int jiraworkflowsUpdateSelective(Jiraworkflows jiraworkflows) {
		JiraworkflowsMapper mapperImpl = this.getSqlSession().getMapper(JiraworkflowsMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(jiraworkflows);
		return ret;
	}
	
	/**
	 * 更新一个对象Jiraworkflows到数据库中
	 * <param name="jiraworkflows">需要更新的Jiraworkflows</param>
	 */
	public int jiraworkflowsUpdateWithBlobs(Jiraworkflows jiraworkflows) {
		JiraworkflowsMapper mapperImpl = this.getSqlSession().getMapper(JiraworkflowsMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(jiraworkflows);
	}
	
	/**
	 * 根据条件更新一批对象Jiraworkflows到数据库中
	 * <param name="jiraworkflows">需要更新的Jiraworkflows</param>
	 * <param name="jiraworkflowsQueryCondition">附加的条件</param>
	 */
	protected int jiraworkflowsUpdateByCondition(Jiraworkflows jiraworkflows, JiraworkflowsExample jiraworkflowsQueryCondition) {
		JiraworkflowsMapper mapperImpl = this.getSqlSession().getMapper(JiraworkflowsMapper.class);
		int ret = mapperImpl.updateByExample(jiraworkflows, jiraworkflowsQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Jiraworkflows到数据库中
	 * <param name="jiraworkflows">需要更新的Jiraworkflows</param>
	 * <param name="jiraworkflowsQueryCondition">附加的条件</param>
	 */
	protected int jiraworkflowsUpdateSelectiveByCondition(Jiraworkflows jiraworkflows, JiraworkflowsExample jiraworkflowsQueryCondition) {
		JiraworkflowsMapper mapperImpl = this.getSqlSession().getMapper(JiraworkflowsMapper.class);
		int ret = mapperImpl.updateByExampleSelective(jiraworkflows, jiraworkflowsQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="jiraworkflows">从数据库中删除一个对象Jiraworkflows</param>
	 * <param name="AId"></param>
	 */
	protected int jiraworkflowsDeleteByPrimaryKey(long AId) {
		JiraworkflowsMapper mapperImpl = this.getSqlSession().getMapper(JiraworkflowsMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="jiraworkflows">从数据库中删除一个对象Jiraworkflows</param>
	 */
	protected int jiraworkflowsDeleteByCondition(JiraworkflowsExample jiraworkflowsQueryCondition) {
		JiraworkflowsMapper mapperImpl = this.getSqlSession().getMapper(JiraworkflowsMapper.class);
		return mapperImpl.deleteByExample(jiraworkflowsQueryCondition);
	}
	
	/**
	 * <param name="jiraworkflows">从数据库中查询一个对象Jiraworkflows</param>
	 * <param name="AId"></param>
	 */
	protected Jiraworkflows jiraworkflowsSelectByPrimaryKey(long AId) {
		JiraworkflowsMapper mapperImpl = this.getSqlSession().getMapper(JiraworkflowsMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="jiraworkflowsQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Jiraworkflows> jiraworkflowsSelectObjects(JiraworkflowsExample jiraworkflowsQueryCondition) {
		JiraworkflowsMapper mapperImpl = this.getSqlSession().getMapper(JiraworkflowsMapper.class);
		return mapperImpl.selectByExample(jiraworkflowsQueryCondition);
	}
	
	/**
	 * <param name="jiraworkflowsQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Jiraworkflows> jiraworkflowsSelectObjectsWithBLOBs(JiraworkflowsExample jiraworkflowsQueryCondition) {
		JiraworkflowsMapper mapperImpl = this.getSqlSession().getMapper(JiraworkflowsMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(jiraworkflowsQueryCondition);
	}
	
	/**
	 * <param name="jiraworkflowsQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int jiraworkflowsQuerySelectObjectsCount(JiraworkflowsExample jiraworkflowsQueryCondition) {
		JiraworkflowsMapper mapperImpl = this.getSqlSession().getMapper(JiraworkflowsMapper.class);
		return mapperImpl.countByExample(jiraworkflowsQueryCondition);
	}
	
	/**
	 * 插入一个对象Label到数据库中
	 * <param name="Label">需要插入的Label</param>
	 */
	protected int labelInsert(Label label) {
		LabelMapper mapperImpl = this.getSqlSession().getMapper(LabelMapper.class);
		return mapperImpl.insertSelective(label);
	}
	
	/**
	 * 更新一个对象Label到数据库中
	 * <param name="label">需要更新的Label</param>
	 */
	protected int labelUpdate(Label label) {
		LabelMapper mapperImpl = this.getSqlSession().getMapper(LabelMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(label);
		return ret;
	}
	
	/**
	 * 更新一个对象Label到数据库中
	 * <param name="label">需要更新的Label</param>
	 */
	protected int labelUpdateSelective(Label label) {
		LabelMapper mapperImpl = this.getSqlSession().getMapper(LabelMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(label);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Label到数据库中
	 * <param name="label">需要更新的Label</param>
	 * <param name="labelQueryCondition">附加的条件</param>
	 */
	protected int labelUpdateByCondition(Label label, LabelExample labelQueryCondition) {
		LabelMapper mapperImpl = this.getSqlSession().getMapper(LabelMapper.class);
		int ret = mapperImpl.updateByExample(label, labelQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Label到数据库中
	 * <param name="label">需要更新的Label</param>
	 * <param name="labelQueryCondition">附加的条件</param>
	 */
	protected int labelUpdateSelectiveByCondition(Label label, LabelExample labelQueryCondition) {
		LabelMapper mapperImpl = this.getSqlSession().getMapper(LabelMapper.class);
		int ret = mapperImpl.updateByExampleSelective(label, labelQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="label">从数据库中删除一个对象Label</param>
	 * <param name="AId"></param>
	 */
	protected int labelDeleteByPrimaryKey(long AId) {
		LabelMapper mapperImpl = this.getSqlSession().getMapper(LabelMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="label">从数据库中删除一个对象Label</param>
	 */
	protected int labelDeleteByCondition(LabelExample labelQueryCondition) {
		LabelMapper mapperImpl = this.getSqlSession().getMapper(LabelMapper.class);
		return mapperImpl.deleteByExample(labelQueryCondition);
	}
	
	/**
	 * <param name="label">从数据库中查询一个对象Label</param>
	 * <param name="AId"></param>
	 */
	protected Label labelSelectByPrimaryKey(long AId) {
		LabelMapper mapperImpl = this.getSqlSession().getMapper(LabelMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="labelQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Label> labelSelectObjects(LabelExample labelQueryCondition) {
		LabelMapper mapperImpl = this.getSqlSession().getMapper(LabelMapper.class);
		return mapperImpl.selectByExample(labelQueryCondition);
	}
	
	/**
	 * <param name="labelQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int labelQuerySelectObjectsCount(LabelExample labelQueryCondition) {
		LabelMapper mapperImpl = this.getSqlSession().getMapper(LabelMapper.class);
		return mapperImpl.countByExample(labelQueryCondition);
	}
	
	/**
	 * 插入一个对象Listenerconfig到数据库中
	 * <param name="Listenerconfig">需要插入的Listenerconfig</param>
	 */
	protected int listenerconfigInsert(Listenerconfig listenerconfig) {
		ListenerconfigMapper mapperImpl = this.getSqlSession().getMapper(ListenerconfigMapper.class);
		return mapperImpl.insertSelective(listenerconfig);
	}
	
	/**
	 * 更新一个对象Listenerconfig到数据库中
	 * <param name="listenerconfig">需要更新的Listenerconfig</param>
	 */
	protected int listenerconfigUpdate(Listenerconfig listenerconfig) {
		ListenerconfigMapper mapperImpl = this.getSqlSession().getMapper(ListenerconfigMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(listenerconfig);
		return ret;
	}
	
	/**
	 * 更新一个对象Listenerconfig到数据库中
	 * <param name="listenerconfig">需要更新的Listenerconfig</param>
	 */
	protected int listenerconfigUpdateSelective(Listenerconfig listenerconfig) {
		ListenerconfigMapper mapperImpl = this.getSqlSession().getMapper(ListenerconfigMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(listenerconfig);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Listenerconfig到数据库中
	 * <param name="listenerconfig">需要更新的Listenerconfig</param>
	 * <param name="listenerconfigQueryCondition">附加的条件</param>
	 */
	protected int listenerconfigUpdateByCondition(Listenerconfig listenerconfig, ListenerconfigExample listenerconfigQueryCondition) {
		ListenerconfigMapper mapperImpl = this.getSqlSession().getMapper(ListenerconfigMapper.class);
		int ret = mapperImpl.updateByExample(listenerconfig, listenerconfigQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Listenerconfig到数据库中
	 * <param name="listenerconfig">需要更新的Listenerconfig</param>
	 * <param name="listenerconfigQueryCondition">附加的条件</param>
	 */
	protected int listenerconfigUpdateSelectiveByCondition(Listenerconfig listenerconfig, ListenerconfigExample listenerconfigQueryCondition) {
		ListenerconfigMapper mapperImpl = this.getSqlSession().getMapper(ListenerconfigMapper.class);
		int ret = mapperImpl.updateByExampleSelective(listenerconfig, listenerconfigQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="listenerconfig">从数据库中删除一个对象Listenerconfig</param>
	 * <param name="AId"></param>
	 */
	protected int listenerconfigDeleteByPrimaryKey(long AId) {
		ListenerconfigMapper mapperImpl = this.getSqlSession().getMapper(ListenerconfigMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="listenerconfig">从数据库中删除一个对象Listenerconfig</param>
	 */
	protected int listenerconfigDeleteByCondition(ListenerconfigExample listenerconfigQueryCondition) {
		ListenerconfigMapper mapperImpl = this.getSqlSession().getMapper(ListenerconfigMapper.class);
		return mapperImpl.deleteByExample(listenerconfigQueryCondition);
	}
	
	/**
	 * <param name="listenerconfig">从数据库中查询一个对象Listenerconfig</param>
	 * <param name="AId"></param>
	 */
	protected Listenerconfig listenerconfigSelectByPrimaryKey(long AId) {
		ListenerconfigMapper mapperImpl = this.getSqlSession().getMapper(ListenerconfigMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="listenerconfigQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Listenerconfig> listenerconfigSelectObjects(ListenerconfigExample listenerconfigQueryCondition) {
		ListenerconfigMapper mapperImpl = this.getSqlSession().getMapper(ListenerconfigMapper.class);
		return mapperImpl.selectByExample(listenerconfigQueryCondition);
	}
	
	/**
	 * <param name="listenerconfigQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int listenerconfigQuerySelectObjectsCount(ListenerconfigExample listenerconfigQueryCondition) {
		ListenerconfigMapper mapperImpl = this.getSqlSession().getMapper(ListenerconfigMapper.class);
		return mapperImpl.countByExample(listenerconfigQueryCondition);
	}
	
	/**
	 * 插入一个对象Mailserver到数据库中
	 * <param name="Mailserver">需要插入的Mailserver</param>
	 */
	protected int mailserverInsert(Mailserver mailserver) {
		MailserverMapper mapperImpl = this.getSqlSession().getMapper(MailserverMapper.class);
		return mapperImpl.insertSelective(mailserver);
	}
	
	/**
	 * 更新一个对象Mailserver到数据库中
	 * <param name="mailserver">需要更新的Mailserver</param>
	 */
	protected int mailserverUpdate(Mailserver mailserver) {
		MailserverMapper mapperImpl = this.getSqlSession().getMapper(MailserverMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(mailserver);
		return ret;
	}
	
	/**
	 * 更新一个对象Mailserver到数据库中
	 * <param name="mailserver">需要更新的Mailserver</param>
	 */
	protected int mailserverUpdateSelective(Mailserver mailserver) {
		MailserverMapper mapperImpl = this.getSqlSession().getMapper(MailserverMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(mailserver);
		return ret;
	}
	
	/**
	 * 更新一个对象Mailserver到数据库中
	 * <param name="mailserver">需要更新的Mailserver</param>
	 */
	public int mailserverUpdateWithBlobs(Mailserver mailserver) {
		MailserverMapper mapperImpl = this.getSqlSession().getMapper(MailserverMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(mailserver);
	}
	
	/**
	 * 根据条件更新一批对象Mailserver到数据库中
	 * <param name="mailserver">需要更新的Mailserver</param>
	 * <param name="mailserverQueryCondition">附加的条件</param>
	 */
	protected int mailserverUpdateByCondition(Mailserver mailserver, MailserverExample mailserverQueryCondition) {
		MailserverMapper mapperImpl = this.getSqlSession().getMapper(MailserverMapper.class);
		int ret = mapperImpl.updateByExample(mailserver, mailserverQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Mailserver到数据库中
	 * <param name="mailserver">需要更新的Mailserver</param>
	 * <param name="mailserverQueryCondition">附加的条件</param>
	 */
	protected int mailserverUpdateSelectiveByCondition(Mailserver mailserver, MailserverExample mailserverQueryCondition) {
		MailserverMapper mapperImpl = this.getSqlSession().getMapper(MailserverMapper.class);
		int ret = mapperImpl.updateByExampleSelective(mailserver, mailserverQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="mailserver">从数据库中删除一个对象Mailserver</param>
	 * <param name="AId"></param>
	 */
	protected int mailserverDeleteByPrimaryKey(long AId) {
		MailserverMapper mapperImpl = this.getSqlSession().getMapper(MailserverMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="mailserver">从数据库中删除一个对象Mailserver</param>
	 */
	protected int mailserverDeleteByCondition(MailserverExample mailserverQueryCondition) {
		MailserverMapper mapperImpl = this.getSqlSession().getMapper(MailserverMapper.class);
		return mapperImpl.deleteByExample(mailserverQueryCondition);
	}
	
	/**
	 * <param name="mailserver">从数据库中查询一个对象Mailserver</param>
	 * <param name="AId"></param>
	 */
	protected Mailserver mailserverSelectByPrimaryKey(long AId) {
		MailserverMapper mapperImpl = this.getSqlSession().getMapper(MailserverMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="mailserverQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Mailserver> mailserverSelectObjects(MailserverExample mailserverQueryCondition) {
		MailserverMapper mapperImpl = this.getSqlSession().getMapper(MailserverMapper.class);
		return mapperImpl.selectByExample(mailserverQueryCondition);
	}
	
	/**
	 * <param name="mailserverQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Mailserver> mailserverSelectObjectsWithBLOBs(MailserverExample mailserverQueryCondition) {
		MailserverMapper mapperImpl = this.getSqlSession().getMapper(MailserverMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(mailserverQueryCondition);
	}
	
	/**
	 * <param name="mailserverQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int mailserverQuerySelectObjectsCount(MailserverExample mailserverQueryCondition) {
		MailserverMapper mapperImpl = this.getSqlSession().getMapper(MailserverMapper.class);
		return mapperImpl.countByExample(mailserverQueryCondition);
	}
	
	/**
	 * 插入一个对象Membershipbase到数据库中
	 * <param name="Membershipbase">需要插入的Membershipbase</param>
	 */
	protected int membershipbaseInsert(Membershipbase membershipbase) {
		MembershipbaseMapper mapperImpl = this.getSqlSession().getMapper(MembershipbaseMapper.class);
		return mapperImpl.insertSelective(membershipbase);
	}
	
	/**
	 * 更新一个对象Membershipbase到数据库中
	 * <param name="membershipbase">需要更新的Membershipbase</param>
	 */
	protected int membershipbaseUpdate(Membershipbase membershipbase) {
		MembershipbaseMapper mapperImpl = this.getSqlSession().getMapper(MembershipbaseMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(membershipbase);
		return ret;
	}
	
	/**
	 * 更新一个对象Membershipbase到数据库中
	 * <param name="membershipbase">需要更新的Membershipbase</param>
	 */
	protected int membershipbaseUpdateSelective(Membershipbase membershipbase) {
		MembershipbaseMapper mapperImpl = this.getSqlSession().getMapper(MembershipbaseMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(membershipbase);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Membershipbase到数据库中
	 * <param name="membershipbase">需要更新的Membershipbase</param>
	 * <param name="membershipbaseQueryCondition">附加的条件</param>
	 */
	protected int membershipbaseUpdateByCondition(Membershipbase membershipbase, MembershipbaseExample membershipbaseQueryCondition) {
		MembershipbaseMapper mapperImpl = this.getSqlSession().getMapper(MembershipbaseMapper.class);
		int ret = mapperImpl.updateByExample(membershipbase, membershipbaseQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Membershipbase到数据库中
	 * <param name="membershipbase">需要更新的Membershipbase</param>
	 * <param name="membershipbaseQueryCondition">附加的条件</param>
	 */
	protected int membershipbaseUpdateSelectiveByCondition(Membershipbase membershipbase, MembershipbaseExample membershipbaseQueryCondition) {
		MembershipbaseMapper mapperImpl = this.getSqlSession().getMapper(MembershipbaseMapper.class);
		int ret = mapperImpl.updateByExampleSelective(membershipbase, membershipbaseQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="membershipbase">从数据库中删除一个对象Membershipbase</param>
	 * <param name="AId"></param>
	 */
	protected int membershipbaseDeleteByPrimaryKey(long AId) {
		MembershipbaseMapper mapperImpl = this.getSqlSession().getMapper(MembershipbaseMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="membershipbase">从数据库中删除一个对象Membershipbase</param>
	 */
	protected int membershipbaseDeleteByCondition(MembershipbaseExample membershipbaseQueryCondition) {
		MembershipbaseMapper mapperImpl = this.getSqlSession().getMapper(MembershipbaseMapper.class);
		return mapperImpl.deleteByExample(membershipbaseQueryCondition);
	}
	
	/**
	 * <param name="membershipbase">从数据库中查询一个对象Membershipbase</param>
	 * <param name="AId"></param>
	 */
	protected Membershipbase membershipbaseSelectByPrimaryKey(long AId) {
		MembershipbaseMapper mapperImpl = this.getSqlSession().getMapper(MembershipbaseMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="membershipbaseQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Membershipbase> membershipbaseSelectObjects(MembershipbaseExample membershipbaseQueryCondition) {
		MembershipbaseMapper mapperImpl = this.getSqlSession().getMapper(MembershipbaseMapper.class);
		return mapperImpl.selectByExample(membershipbaseQueryCondition);
	}
	
	/**
	 * <param name="membershipbaseQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int membershipbaseQuerySelectObjectsCount(MembershipbaseExample membershipbaseQueryCondition) {
		MembershipbaseMapper mapperImpl = this.getSqlSession().getMapper(MembershipbaseMapper.class);
		return mapperImpl.countByExample(membershipbaseQueryCondition);
	}
	
	/**
	 * 插入一个对象Nodeassociation到数据库中
	 * <param name="Nodeassociation">需要插入的Nodeassociation</param>
	 */
	protected int nodeassociationInsert(Nodeassociation nodeassociation) {
		NodeassociationMapper mapperImpl = this.getSqlSession().getMapper(NodeassociationMapper.class);
		return mapperImpl.insertSelective(nodeassociation);
	}
	
	/**
	 * 更新一个对象Nodeassociation到数据库中
	 * <param name="nodeassociation">需要更新的Nodeassociation</param>
	 */
	protected int nodeassociationUpdate(Nodeassociation nodeassociation) {
		NodeassociationMapper mapperImpl = this.getSqlSession().getMapper(NodeassociationMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(nodeassociation);
		return ret;
	}
	
	/**
	 * 更新一个对象Nodeassociation到数据库中
	 * <param name="nodeassociation">需要更新的Nodeassociation</param>
	 */
	protected int nodeassociationUpdateSelective(Nodeassociation nodeassociation) {
		NodeassociationMapper mapperImpl = this.getSqlSession().getMapper(NodeassociationMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(nodeassociation);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Nodeassociation到数据库中
	 * <param name="nodeassociation">需要更新的Nodeassociation</param>
	 * <param name="nodeassociationQueryCondition">附加的条件</param>
	 */
	protected int nodeassociationUpdateByCondition(Nodeassociation nodeassociation, NodeassociationExample nodeassociationQueryCondition) {
		NodeassociationMapper mapperImpl = this.getSqlSession().getMapper(NodeassociationMapper.class);
		int ret = mapperImpl.updateByExample(nodeassociation, nodeassociationQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Nodeassociation到数据库中
	 * <param name="nodeassociation">需要更新的Nodeassociation</param>
	 * <param name="nodeassociationQueryCondition">附加的条件</param>
	 */
	protected int nodeassociationUpdateSelectiveByCondition(Nodeassociation nodeassociation, NodeassociationExample nodeassociationQueryCondition) {
		NodeassociationMapper mapperImpl = this.getSqlSession().getMapper(NodeassociationMapper.class);
		int ret = mapperImpl.updateByExampleSelective(nodeassociation, nodeassociationQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="nodeassociation">从数据库中删除一个对象Nodeassociation</param>
	 * <param name="ANodeassociationKey"> 主键类</param>
	 */
	protected int nodeassociationDeleteByPrimaryKey(NodeassociationKey ANodeassociationKey) {
		NodeassociationMapper mapperImpl = this.getSqlSession().getMapper(NodeassociationMapper.class);
		return mapperImpl.deleteByPrimaryKey(ANodeassociationKey);
	}
	
	/**
	 * <param name="nodeassociation">从数据库中删除一个对象Nodeassociation</param>
	 */
	protected int nodeassociationDeleteByCondition(NodeassociationExample nodeassociationQueryCondition) {
		NodeassociationMapper mapperImpl = this.getSqlSession().getMapper(NodeassociationMapper.class);
		return mapperImpl.deleteByExample(nodeassociationQueryCondition);
	}
	
	/**
	 * <param name="nodeassociation">从数据库中查询一个对象Nodeassociation</param>
	 * <param name="ANodeassociationKey"> 主键类</param>
	 */
	protected Nodeassociation nodeassociationSelectByPrimaryKey(NodeassociationKey ANodeassociationKey) {
		NodeassociationMapper mapperImpl = this.getSqlSession().getMapper(NodeassociationMapper.class);
		return mapperImpl.selectByPrimaryKey(ANodeassociationKey);
	}
	
	/**
	 * <param name="nodeassociationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Nodeassociation> nodeassociationSelectObjects(NodeassociationExample nodeassociationQueryCondition) {
		NodeassociationMapper mapperImpl = this.getSqlSession().getMapper(NodeassociationMapper.class);
		return mapperImpl.selectByExample(nodeassociationQueryCondition);
	}
	
	/**
	 * <param name="nodeassociationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int nodeassociationQuerySelectObjectsCount(NodeassociationExample nodeassociationQueryCondition) {
		NodeassociationMapper mapperImpl = this.getSqlSession().getMapper(NodeassociationMapper.class);
		return mapperImpl.countByExample(nodeassociationQueryCondition);
	}
	
	/**
	 * 插入一个对象Notification到数据库中
	 * <param name="Notification">需要插入的Notification</param>
	 */
	protected int notificationInsert(Notification notification) {
		NotificationMapper mapperImpl = this.getSqlSession().getMapper(NotificationMapper.class);
		return mapperImpl.insertSelective(notification);
	}
	
	/**
	 * 更新一个对象Notification到数据库中
	 * <param name="notification">需要更新的Notification</param>
	 */
	protected int notificationUpdate(Notification notification) {
		NotificationMapper mapperImpl = this.getSqlSession().getMapper(NotificationMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(notification);
		return ret;
	}
	
	/**
	 * 更新一个对象Notification到数据库中
	 * <param name="notification">需要更新的Notification</param>
	 */
	protected int notificationUpdateSelective(Notification notification) {
		NotificationMapper mapperImpl = this.getSqlSession().getMapper(NotificationMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(notification);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Notification到数据库中
	 * <param name="notification">需要更新的Notification</param>
	 * <param name="notificationQueryCondition">附加的条件</param>
	 */
	protected int notificationUpdateByCondition(Notification notification, NotificationExample notificationQueryCondition) {
		NotificationMapper mapperImpl = this.getSqlSession().getMapper(NotificationMapper.class);
		int ret = mapperImpl.updateByExample(notification, notificationQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Notification到数据库中
	 * <param name="notification">需要更新的Notification</param>
	 * <param name="notificationQueryCondition">附加的条件</param>
	 */
	protected int notificationUpdateSelectiveByCondition(Notification notification, NotificationExample notificationQueryCondition) {
		NotificationMapper mapperImpl = this.getSqlSession().getMapper(NotificationMapper.class);
		int ret = mapperImpl.updateByExampleSelective(notification, notificationQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="notification">从数据库中删除一个对象Notification</param>
	 * <param name="AId"></param>
	 */
	protected int notificationDeleteByPrimaryKey(long AId) {
		NotificationMapper mapperImpl = this.getSqlSession().getMapper(NotificationMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="notification">从数据库中删除一个对象Notification</param>
	 */
	protected int notificationDeleteByCondition(NotificationExample notificationQueryCondition) {
		NotificationMapper mapperImpl = this.getSqlSession().getMapper(NotificationMapper.class);
		return mapperImpl.deleteByExample(notificationQueryCondition);
	}
	
	/**
	 * <param name="notification">从数据库中查询一个对象Notification</param>
	 * <param name="AId"></param>
	 */
	protected Notification notificationSelectByPrimaryKey(long AId) {
		NotificationMapper mapperImpl = this.getSqlSession().getMapper(NotificationMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="notificationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Notification> notificationSelectObjects(NotificationExample notificationQueryCondition) {
		NotificationMapper mapperImpl = this.getSqlSession().getMapper(NotificationMapper.class);
		return mapperImpl.selectByExample(notificationQueryCondition);
	}
	
	/**
	 * <param name="notificationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int notificationQuerySelectObjectsCount(NotificationExample notificationQueryCondition) {
		NotificationMapper mapperImpl = this.getSqlSession().getMapper(NotificationMapper.class);
		return mapperImpl.countByExample(notificationQueryCondition);
	}
	
	/**
	 * 插入一个对象Notificationinstance到数据库中
	 * <param name="Notificationinstance">需要插入的Notificationinstance</param>
	 */
	protected int notificationinstanceInsert(Notificationinstance notificationinstance) {
		NotificationinstanceMapper mapperImpl = this.getSqlSession().getMapper(NotificationinstanceMapper.class);
		return mapperImpl.insertSelective(notificationinstance);
	}
	
	/**
	 * 更新一个对象Notificationinstance到数据库中
	 * <param name="notificationinstance">需要更新的Notificationinstance</param>
	 */
	protected int notificationinstanceUpdate(Notificationinstance notificationinstance) {
		NotificationinstanceMapper mapperImpl = this.getSqlSession().getMapper(NotificationinstanceMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(notificationinstance);
		return ret;
	}
	
	/**
	 * 更新一个对象Notificationinstance到数据库中
	 * <param name="notificationinstance">需要更新的Notificationinstance</param>
	 */
	protected int notificationinstanceUpdateSelective(Notificationinstance notificationinstance) {
		NotificationinstanceMapper mapperImpl = this.getSqlSession().getMapper(NotificationinstanceMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(notificationinstance);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Notificationinstance到数据库中
	 * <param name="notificationinstance">需要更新的Notificationinstance</param>
	 * <param name="notificationinstanceQueryCondition">附加的条件</param>
	 */
	protected int notificationinstanceUpdateByCondition(Notificationinstance notificationinstance, NotificationinstanceExample notificationinstanceQueryCondition) {
		NotificationinstanceMapper mapperImpl = this.getSqlSession().getMapper(NotificationinstanceMapper.class);
		int ret = mapperImpl.updateByExample(notificationinstance, notificationinstanceQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Notificationinstance到数据库中
	 * <param name="notificationinstance">需要更新的Notificationinstance</param>
	 * <param name="notificationinstanceQueryCondition">附加的条件</param>
	 */
	protected int notificationinstanceUpdateSelectiveByCondition(Notificationinstance notificationinstance, NotificationinstanceExample notificationinstanceQueryCondition) {
		NotificationinstanceMapper mapperImpl = this.getSqlSession().getMapper(NotificationinstanceMapper.class);
		int ret = mapperImpl.updateByExampleSelective(notificationinstance, notificationinstanceQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="notificationinstance">从数据库中删除一个对象Notificationinstance</param>
	 * <param name="AId"></param>
	 */
	protected int notificationinstanceDeleteByPrimaryKey(long AId) {
		NotificationinstanceMapper mapperImpl = this.getSqlSession().getMapper(NotificationinstanceMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="notificationinstance">从数据库中删除一个对象Notificationinstance</param>
	 */
	protected int notificationinstanceDeleteByCondition(NotificationinstanceExample notificationinstanceQueryCondition) {
		NotificationinstanceMapper mapperImpl = this.getSqlSession().getMapper(NotificationinstanceMapper.class);
		return mapperImpl.deleteByExample(notificationinstanceQueryCondition);
	}
	
	/**
	 * <param name="notificationinstance">从数据库中查询一个对象Notificationinstance</param>
	 * <param name="AId"></param>
	 */
	protected Notificationinstance notificationinstanceSelectByPrimaryKey(long AId) {
		NotificationinstanceMapper mapperImpl = this.getSqlSession().getMapper(NotificationinstanceMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="notificationinstanceQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Notificationinstance> notificationinstanceSelectObjects(NotificationinstanceExample notificationinstanceQueryCondition) {
		NotificationinstanceMapper mapperImpl = this.getSqlSession().getMapper(NotificationinstanceMapper.class);
		return mapperImpl.selectByExample(notificationinstanceQueryCondition);
	}
	
	/**
	 * <param name="notificationinstanceQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int notificationinstanceQuerySelectObjectsCount(NotificationinstanceExample notificationinstanceQueryCondition) {
		NotificationinstanceMapper mapperImpl = this.getSqlSession().getMapper(NotificationinstanceMapper.class);
		return mapperImpl.countByExample(notificationinstanceQueryCondition);
	}
	
	/**
	 * 插入一个对象Notificationscheme到数据库中
	 * <param name="Notificationscheme">需要插入的Notificationscheme</param>
	 */
	protected int notificationschemeInsert(Notificationscheme notificationscheme) {
		NotificationschemeMapper mapperImpl = this.getSqlSession().getMapper(NotificationschemeMapper.class);
		return mapperImpl.insertSelective(notificationscheme);
	}
	
	/**
	 * 更新一个对象Notificationscheme到数据库中
	 * <param name="notificationscheme">需要更新的Notificationscheme</param>
	 */
	protected int notificationschemeUpdate(Notificationscheme notificationscheme) {
		NotificationschemeMapper mapperImpl = this.getSqlSession().getMapper(NotificationschemeMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(notificationscheme);
		return ret;
	}
	
	/**
	 * 更新一个对象Notificationscheme到数据库中
	 * <param name="notificationscheme">需要更新的Notificationscheme</param>
	 */
	protected int notificationschemeUpdateSelective(Notificationscheme notificationscheme) {
		NotificationschemeMapper mapperImpl = this.getSqlSession().getMapper(NotificationschemeMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(notificationscheme);
		return ret;
	}
	
	/**
	 * 更新一个对象Notificationscheme到数据库中
	 * <param name="notificationscheme">需要更新的Notificationscheme</param>
	 */
	public int notificationschemeUpdateWithBlobs(Notificationscheme notificationscheme) {
		NotificationschemeMapper mapperImpl = this.getSqlSession().getMapper(NotificationschemeMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(notificationscheme);
	}
	
	/**
	 * 根据条件更新一批对象Notificationscheme到数据库中
	 * <param name="notificationscheme">需要更新的Notificationscheme</param>
	 * <param name="notificationschemeQueryCondition">附加的条件</param>
	 */
	protected int notificationschemeUpdateByCondition(Notificationscheme notificationscheme, NotificationschemeExample notificationschemeQueryCondition) {
		NotificationschemeMapper mapperImpl = this.getSqlSession().getMapper(NotificationschemeMapper.class);
		int ret = mapperImpl.updateByExample(notificationscheme, notificationschemeQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Notificationscheme到数据库中
	 * <param name="notificationscheme">需要更新的Notificationscheme</param>
	 * <param name="notificationschemeQueryCondition">附加的条件</param>
	 */
	protected int notificationschemeUpdateSelectiveByCondition(Notificationscheme notificationscheme, NotificationschemeExample notificationschemeQueryCondition) {
		NotificationschemeMapper mapperImpl = this.getSqlSession().getMapper(NotificationschemeMapper.class);
		int ret = mapperImpl.updateByExampleSelective(notificationscheme, notificationschemeQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="notificationscheme">从数据库中删除一个对象Notificationscheme</param>
	 * <param name="AId"></param>
	 */
	protected int notificationschemeDeleteByPrimaryKey(long AId) {
		NotificationschemeMapper mapperImpl = this.getSqlSession().getMapper(NotificationschemeMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="notificationscheme">从数据库中删除一个对象Notificationscheme</param>
	 */
	protected int notificationschemeDeleteByCondition(NotificationschemeExample notificationschemeQueryCondition) {
		NotificationschemeMapper mapperImpl = this.getSqlSession().getMapper(NotificationschemeMapper.class);
		return mapperImpl.deleteByExample(notificationschemeQueryCondition);
	}
	
	/**
	 * <param name="notificationscheme">从数据库中查询一个对象Notificationscheme</param>
	 * <param name="AId"></param>
	 */
	protected Notificationscheme notificationschemeSelectByPrimaryKey(long AId) {
		NotificationschemeMapper mapperImpl = this.getSqlSession().getMapper(NotificationschemeMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="notificationschemeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Notificationscheme> notificationschemeSelectObjects(NotificationschemeExample notificationschemeQueryCondition) {
		NotificationschemeMapper mapperImpl = this.getSqlSession().getMapper(NotificationschemeMapper.class);
		return mapperImpl.selectByExample(notificationschemeQueryCondition);
	}
	
	/**
	 * <param name="notificationschemeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Notificationscheme> notificationschemeSelectObjectsWithBLOBs(NotificationschemeExample notificationschemeQueryCondition) {
		NotificationschemeMapper mapperImpl = this.getSqlSession().getMapper(NotificationschemeMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(notificationschemeQueryCondition);
	}
	
	/**
	 * <param name="notificationschemeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int notificationschemeQuerySelectObjectsCount(NotificationschemeExample notificationschemeQueryCondition) {
		NotificationschemeMapper mapperImpl = this.getSqlSession().getMapper(NotificationschemeMapper.class);
		return mapperImpl.countByExample(notificationschemeQueryCondition);
	}
	
	/**
	 * 插入一个对象OauthconsumerWithBLOBs到数据库中
	 * <param name="OauthconsumerWithBLOBs">需要插入的OauthconsumerWithBLOBs</param>
	 */
	protected int oauthconsumerInsert(OauthconsumerWithBLOBs oauthconsumer) {
		OauthconsumerMapper mapperImpl = this.getSqlSession().getMapper(OauthconsumerMapper.class);
		return mapperImpl.insertSelective(oauthconsumer);
	}
	
	/**
	 * 更新一个对象Oauthconsumer到数据库中
	 * <param name="oauthconsumer">需要更新的Oauthconsumer</param>
	 */
	protected int oauthconsumerUpdate(Oauthconsumer oauthconsumer) {
		OauthconsumerMapper mapperImpl = this.getSqlSession().getMapper(OauthconsumerMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(oauthconsumer);
		return ret;
	}
	
	/**
	 * 更新一个对象Oauthconsumer到数据库中
	 * <param name="oauthconsumer">需要更新的Oauthconsumer</param>
	 */
	protected int oauthconsumerUpdateSelective(OauthconsumerWithBLOBs oauthconsumer) {
		OauthconsumerMapper mapperImpl = this.getSqlSession().getMapper(OauthconsumerMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(oauthconsumer);
		return ret;
	}
	
	/**
	 * 更新一个对象OauthconsumerWithBLOBs到数据库中
	 * <param name="oauthconsumer">需要更新的Oauthconsumer</param>
	 */
	public int oauthconsumerUpdateWithBlobs(OauthconsumerWithBLOBs oauthconsumer) {
		OauthconsumerMapper mapperImpl = this.getSqlSession().getMapper(OauthconsumerMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(oauthconsumer);
	}
	
	/**
	 * 根据条件更新一批对象Oauthconsumer到数据库中
	 * <param name="oauthconsumer">需要更新的Oauthconsumer</param>
	 * <param name="oauthconsumerQueryCondition">附加的条件</param>
	 */
	protected int oauthconsumerUpdateByCondition(Oauthconsumer oauthconsumer, OauthconsumerExample oauthconsumerQueryCondition) {
		OauthconsumerMapper mapperImpl = this.getSqlSession().getMapper(OauthconsumerMapper.class);
		int ret = mapperImpl.updateByExample(oauthconsumer, oauthconsumerQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Oauthconsumer到数据库中
	 * <param name="oauthconsumer">需要更新的Oauthconsumer</param>
	 * <param name="oauthconsumerQueryCondition">附加的条件</param>
	 */
	protected int oauthconsumerUpdateSelectiveByCondition(OauthconsumerWithBLOBs oauthconsumer, OauthconsumerExample oauthconsumerQueryCondition) {
		OauthconsumerMapper mapperImpl = this.getSqlSession().getMapper(OauthconsumerMapper.class);
		int ret = mapperImpl.updateByExampleSelective(oauthconsumer, oauthconsumerQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="oauthconsumer">从数据库中删除一个对象Oauthconsumer</param>
	 * <param name="AId"></param>
	 */
	protected int oauthconsumerDeleteByPrimaryKey(long AId) {
		OauthconsumerMapper mapperImpl = this.getSqlSession().getMapper(OauthconsumerMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="oauthconsumer">从数据库中删除一个对象Oauthconsumer</param>
	 */
	protected int oauthconsumerDeleteByCondition(OauthconsumerExample oauthconsumerQueryCondition) {
		OauthconsumerMapper mapperImpl = this.getSqlSession().getMapper(OauthconsumerMapper.class);
		return mapperImpl.deleteByExample(oauthconsumerQueryCondition);
	}
	
	/**
	 * <param name="oauthconsumer">从数据库中查询一个对象OauthconsumerWithBLOBs</param>
	 * <param name="AId"></param>
	 */
	protected OauthconsumerWithBLOBs oauthconsumerSelectByPrimaryKey(long AId) {
		OauthconsumerMapper mapperImpl = this.getSqlSession().getMapper(OauthconsumerMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="oauthconsumerQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Oauthconsumer> oauthconsumerSelectObjects(OauthconsumerExample oauthconsumerQueryCondition) {
		OauthconsumerMapper mapperImpl = this.getSqlSession().getMapper(OauthconsumerMapper.class);
		return mapperImpl.selectByExample(oauthconsumerQueryCondition);
	}
	
	/**
	 * <param name="oauthconsumerQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<OauthconsumerWithBLOBs> oauthconsumerSelectObjectsWithBLOBs(OauthconsumerExample oauthconsumerQueryCondition) {
		OauthconsumerMapper mapperImpl = this.getSqlSession().getMapper(OauthconsumerMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(oauthconsumerQueryCondition);
	}
	
	/**
	 * <param name="oauthconsumerQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int oauthconsumerQuerySelectObjectsCount(OauthconsumerExample oauthconsumerQueryCondition) {
		OauthconsumerMapper mapperImpl = this.getSqlSession().getMapper(OauthconsumerMapper.class);
		return mapperImpl.countByExample(oauthconsumerQueryCondition);
	}
	
	/**
	 * 插入一个对象Oauthconsumertoken到数据库中
	 * <param name="Oauthconsumertoken">需要插入的Oauthconsumertoken</param>
	 */
	protected int oauthconsumertokenInsert(Oauthconsumertoken oauthconsumertoken) {
		OauthconsumertokenMapper mapperImpl = this.getSqlSession().getMapper(OauthconsumertokenMapper.class);
		return mapperImpl.insertSelective(oauthconsumertoken);
	}
	
	/**
	 * 更新一个对象Oauthconsumertoken到数据库中
	 * <param name="oauthconsumertoken">需要更新的Oauthconsumertoken</param>
	 */
	protected int oauthconsumertokenUpdate(Oauthconsumertoken oauthconsumertoken) {
		OauthconsumertokenMapper mapperImpl = this.getSqlSession().getMapper(OauthconsumertokenMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(oauthconsumertoken);
		return ret;
	}
	
	/**
	 * 更新一个对象Oauthconsumertoken到数据库中
	 * <param name="oauthconsumertoken">需要更新的Oauthconsumertoken</param>
	 */
	protected int oauthconsumertokenUpdateSelective(Oauthconsumertoken oauthconsumertoken) {
		OauthconsumertokenMapper mapperImpl = this.getSqlSession().getMapper(OauthconsumertokenMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(oauthconsumertoken);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Oauthconsumertoken到数据库中
	 * <param name="oauthconsumertoken">需要更新的Oauthconsumertoken</param>
	 * <param name="oauthconsumertokenQueryCondition">附加的条件</param>
	 */
	protected int oauthconsumertokenUpdateByCondition(Oauthconsumertoken oauthconsumertoken, OauthconsumertokenExample oauthconsumertokenQueryCondition) {
		OauthconsumertokenMapper mapperImpl = this.getSqlSession().getMapper(OauthconsumertokenMapper.class);
		int ret = mapperImpl.updateByExample(oauthconsumertoken, oauthconsumertokenQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Oauthconsumertoken到数据库中
	 * <param name="oauthconsumertoken">需要更新的Oauthconsumertoken</param>
	 * <param name="oauthconsumertokenQueryCondition">附加的条件</param>
	 */
	protected int oauthconsumertokenUpdateSelectiveByCondition(Oauthconsumertoken oauthconsumertoken, OauthconsumertokenExample oauthconsumertokenQueryCondition) {
		OauthconsumertokenMapper mapperImpl = this.getSqlSession().getMapper(OauthconsumertokenMapper.class);
		int ret = mapperImpl.updateByExampleSelective(oauthconsumertoken, oauthconsumertokenQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="oauthconsumertoken">从数据库中删除一个对象Oauthconsumertoken</param>
	 * <param name="AId"></param>
	 */
	protected int oauthconsumertokenDeleteByPrimaryKey(long AId) {
		OauthconsumertokenMapper mapperImpl = this.getSqlSession().getMapper(OauthconsumertokenMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="oauthconsumertoken">从数据库中删除一个对象Oauthconsumertoken</param>
	 */
	protected int oauthconsumertokenDeleteByCondition(OauthconsumertokenExample oauthconsumertokenQueryCondition) {
		OauthconsumertokenMapper mapperImpl = this.getSqlSession().getMapper(OauthconsumertokenMapper.class);
		return mapperImpl.deleteByExample(oauthconsumertokenQueryCondition);
	}
	
	/**
	 * <param name="oauthconsumertoken">从数据库中查询一个对象Oauthconsumertoken</param>
	 * <param name="AId"></param>
	 */
	protected Oauthconsumertoken oauthconsumertokenSelectByPrimaryKey(long AId) {
		OauthconsumertokenMapper mapperImpl = this.getSqlSession().getMapper(OauthconsumertokenMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="oauthconsumertokenQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Oauthconsumertoken> oauthconsumertokenSelectObjects(OauthconsumertokenExample oauthconsumertokenQueryCondition) {
		OauthconsumertokenMapper mapperImpl = this.getSqlSession().getMapper(OauthconsumertokenMapper.class);
		return mapperImpl.selectByExample(oauthconsumertokenQueryCondition);
	}
	
	/**
	 * <param name="oauthconsumertokenQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int oauthconsumertokenQuerySelectObjectsCount(OauthconsumertokenExample oauthconsumertokenQueryCondition) {
		OauthconsumertokenMapper mapperImpl = this.getSqlSession().getMapper(OauthconsumertokenMapper.class);
		return mapperImpl.countByExample(oauthconsumertokenQueryCondition);
	}
	
	/**
	 * 插入一个对象OauthspconsumerWithBLOBs到数据库中
	 * <param name="OauthspconsumerWithBLOBs">需要插入的OauthspconsumerWithBLOBs</param>
	 */
	protected int oauthspconsumerInsert(OauthspconsumerWithBLOBs oauthspconsumer) {
		OauthspconsumerMapper mapperImpl = this.getSqlSession().getMapper(OauthspconsumerMapper.class);
		return mapperImpl.insertSelective(oauthspconsumer);
	}
	
	/**
	 * 更新一个对象Oauthspconsumer到数据库中
	 * <param name="oauthspconsumer">需要更新的Oauthspconsumer</param>
	 */
	protected int oauthspconsumerUpdate(Oauthspconsumer oauthspconsumer) {
		OauthspconsumerMapper mapperImpl = this.getSqlSession().getMapper(OauthspconsumerMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(oauthspconsumer);
		return ret;
	}
	
	/**
	 * 更新一个对象Oauthspconsumer到数据库中
	 * <param name="oauthspconsumer">需要更新的Oauthspconsumer</param>
	 */
	protected int oauthspconsumerUpdateSelective(OauthspconsumerWithBLOBs oauthspconsumer) {
		OauthspconsumerMapper mapperImpl = this.getSqlSession().getMapper(OauthspconsumerMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(oauthspconsumer);
		return ret;
	}
	
	/**
	 * 更新一个对象OauthspconsumerWithBLOBs到数据库中
	 * <param name="oauthspconsumer">需要更新的Oauthspconsumer</param>
	 */
	public int oauthspconsumerUpdateWithBlobs(OauthspconsumerWithBLOBs oauthspconsumer) {
		OauthspconsumerMapper mapperImpl = this.getSqlSession().getMapper(OauthspconsumerMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(oauthspconsumer);
	}
	
	/**
	 * 根据条件更新一批对象Oauthspconsumer到数据库中
	 * <param name="oauthspconsumer">需要更新的Oauthspconsumer</param>
	 * <param name="oauthspconsumerQueryCondition">附加的条件</param>
	 */
	protected int oauthspconsumerUpdateByCondition(Oauthspconsumer oauthspconsumer, OauthspconsumerExample oauthspconsumerQueryCondition) {
		OauthspconsumerMapper mapperImpl = this.getSqlSession().getMapper(OauthspconsumerMapper.class);
		int ret = mapperImpl.updateByExample(oauthspconsumer, oauthspconsumerQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Oauthspconsumer到数据库中
	 * <param name="oauthspconsumer">需要更新的Oauthspconsumer</param>
	 * <param name="oauthspconsumerQueryCondition">附加的条件</param>
	 */
	protected int oauthspconsumerUpdateSelectiveByCondition(OauthspconsumerWithBLOBs oauthspconsumer, OauthspconsumerExample oauthspconsumerQueryCondition) {
		OauthspconsumerMapper mapperImpl = this.getSqlSession().getMapper(OauthspconsumerMapper.class);
		int ret = mapperImpl.updateByExampleSelective(oauthspconsumer, oauthspconsumerQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="oauthspconsumer">从数据库中删除一个对象Oauthspconsumer</param>
	 * <param name="AId"></param>
	 */
	protected int oauthspconsumerDeleteByPrimaryKey(long AId) {
		OauthspconsumerMapper mapperImpl = this.getSqlSession().getMapper(OauthspconsumerMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="oauthspconsumer">从数据库中删除一个对象Oauthspconsumer</param>
	 */
	protected int oauthspconsumerDeleteByCondition(OauthspconsumerExample oauthspconsumerQueryCondition) {
		OauthspconsumerMapper mapperImpl = this.getSqlSession().getMapper(OauthspconsumerMapper.class);
		return mapperImpl.deleteByExample(oauthspconsumerQueryCondition);
	}
	
	/**
	 * <param name="oauthspconsumer">从数据库中查询一个对象OauthspconsumerWithBLOBs</param>
	 * <param name="AId"></param>
	 */
	protected OauthspconsumerWithBLOBs oauthspconsumerSelectByPrimaryKey(long AId) {
		OauthspconsumerMapper mapperImpl = this.getSqlSession().getMapper(OauthspconsumerMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="oauthspconsumerQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Oauthspconsumer> oauthspconsumerSelectObjects(OauthspconsumerExample oauthspconsumerQueryCondition) {
		OauthspconsumerMapper mapperImpl = this.getSqlSession().getMapper(OauthspconsumerMapper.class);
		return mapperImpl.selectByExample(oauthspconsumerQueryCondition);
	}
	
	/**
	 * <param name="oauthspconsumerQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<OauthspconsumerWithBLOBs> oauthspconsumerSelectObjectsWithBLOBs(OauthspconsumerExample oauthspconsumerQueryCondition) {
		OauthspconsumerMapper mapperImpl = this.getSqlSession().getMapper(OauthspconsumerMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(oauthspconsumerQueryCondition);
	}
	
	/**
	 * <param name="oauthspconsumerQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int oauthspconsumerQuerySelectObjectsCount(OauthspconsumerExample oauthspconsumerQueryCondition) {
		OauthspconsumerMapper mapperImpl = this.getSqlSession().getMapper(OauthspconsumerMapper.class);
		return mapperImpl.countByExample(oauthspconsumerQueryCondition);
	}
	
	/**
	 * 插入一个对象Oauthsptoken到数据库中
	 * <param name="Oauthsptoken">需要插入的Oauthsptoken</param>
	 */
	protected int oauthsptokenInsert(Oauthsptoken oauthsptoken) {
		OauthsptokenMapper mapperImpl = this.getSqlSession().getMapper(OauthsptokenMapper.class);
		return mapperImpl.insertSelective(oauthsptoken);
	}
	
	/**
	 * 更新一个对象Oauthsptoken到数据库中
	 * <param name="oauthsptoken">需要更新的Oauthsptoken</param>
	 */
	protected int oauthsptokenUpdate(Oauthsptoken oauthsptoken) {
		OauthsptokenMapper mapperImpl = this.getSqlSession().getMapper(OauthsptokenMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(oauthsptoken);
		return ret;
	}
	
	/**
	 * 更新一个对象Oauthsptoken到数据库中
	 * <param name="oauthsptoken">需要更新的Oauthsptoken</param>
	 */
	protected int oauthsptokenUpdateSelective(Oauthsptoken oauthsptoken) {
		OauthsptokenMapper mapperImpl = this.getSqlSession().getMapper(OauthsptokenMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(oauthsptoken);
		return ret;
	}
	
	/**
	 * 更新一个对象Oauthsptoken到数据库中
	 * <param name="oauthsptoken">需要更新的Oauthsptoken</param>
	 */
	public int oauthsptokenUpdateWithBlobs(Oauthsptoken oauthsptoken) {
		OauthsptokenMapper mapperImpl = this.getSqlSession().getMapper(OauthsptokenMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(oauthsptoken);
	}
	
	/**
	 * 根据条件更新一批对象Oauthsptoken到数据库中
	 * <param name="oauthsptoken">需要更新的Oauthsptoken</param>
	 * <param name="oauthsptokenQueryCondition">附加的条件</param>
	 */
	protected int oauthsptokenUpdateByCondition(Oauthsptoken oauthsptoken, OauthsptokenExample oauthsptokenQueryCondition) {
		OauthsptokenMapper mapperImpl = this.getSqlSession().getMapper(OauthsptokenMapper.class);
		int ret = mapperImpl.updateByExample(oauthsptoken, oauthsptokenQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Oauthsptoken到数据库中
	 * <param name="oauthsptoken">需要更新的Oauthsptoken</param>
	 * <param name="oauthsptokenQueryCondition">附加的条件</param>
	 */
	protected int oauthsptokenUpdateSelectiveByCondition(Oauthsptoken oauthsptoken, OauthsptokenExample oauthsptokenQueryCondition) {
		OauthsptokenMapper mapperImpl = this.getSqlSession().getMapper(OauthsptokenMapper.class);
		int ret = mapperImpl.updateByExampleSelective(oauthsptoken, oauthsptokenQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="oauthsptoken">从数据库中删除一个对象Oauthsptoken</param>
	 * <param name="AId"></param>
	 */
	protected int oauthsptokenDeleteByPrimaryKey(long AId) {
		OauthsptokenMapper mapperImpl = this.getSqlSession().getMapper(OauthsptokenMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="oauthsptoken">从数据库中删除一个对象Oauthsptoken</param>
	 */
	protected int oauthsptokenDeleteByCondition(OauthsptokenExample oauthsptokenQueryCondition) {
		OauthsptokenMapper mapperImpl = this.getSqlSession().getMapper(OauthsptokenMapper.class);
		return mapperImpl.deleteByExample(oauthsptokenQueryCondition);
	}
	
	/**
	 * <param name="oauthsptoken">从数据库中查询一个对象Oauthsptoken</param>
	 * <param name="AId"></param>
	 */
	protected Oauthsptoken oauthsptokenSelectByPrimaryKey(long AId) {
		OauthsptokenMapper mapperImpl = this.getSqlSession().getMapper(OauthsptokenMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="oauthsptokenQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Oauthsptoken> oauthsptokenSelectObjects(OauthsptokenExample oauthsptokenQueryCondition) {
		OauthsptokenMapper mapperImpl = this.getSqlSession().getMapper(OauthsptokenMapper.class);
		return mapperImpl.selectByExample(oauthsptokenQueryCondition);
	}
	
	/**
	 * <param name="oauthsptokenQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Oauthsptoken> oauthsptokenSelectObjectsWithBLOBs(OauthsptokenExample oauthsptokenQueryCondition) {
		OauthsptokenMapper mapperImpl = this.getSqlSession().getMapper(OauthsptokenMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(oauthsptokenQueryCondition);
	}
	
	/**
	 * <param name="oauthsptokenQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int oauthsptokenQuerySelectObjectsCount(OauthsptokenExample oauthsptokenQueryCondition) {
		OauthsptokenMapper mapperImpl = this.getSqlSession().getMapper(OauthsptokenMapper.class);
		return mapperImpl.countByExample(oauthsptokenQueryCondition);
	}
	
	/**
	 * 插入一个对象Optionconfiguration到数据库中
	 * <param name="Optionconfiguration">需要插入的Optionconfiguration</param>
	 */
	protected int optionconfigurationInsert(Optionconfiguration optionconfiguration) {
		OptionconfigurationMapper mapperImpl = this.getSqlSession().getMapper(OptionconfigurationMapper.class);
		return mapperImpl.insertSelective(optionconfiguration);
	}
	
	/**
	 * 更新一个对象Optionconfiguration到数据库中
	 * <param name="optionconfiguration">需要更新的Optionconfiguration</param>
	 */
	protected int optionconfigurationUpdate(Optionconfiguration optionconfiguration) {
		OptionconfigurationMapper mapperImpl = this.getSqlSession().getMapper(OptionconfigurationMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(optionconfiguration);
		return ret;
	}
	
	/**
	 * 更新一个对象Optionconfiguration到数据库中
	 * <param name="optionconfiguration">需要更新的Optionconfiguration</param>
	 */
	protected int optionconfigurationUpdateSelective(Optionconfiguration optionconfiguration) {
		OptionconfigurationMapper mapperImpl = this.getSqlSession().getMapper(OptionconfigurationMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(optionconfiguration);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Optionconfiguration到数据库中
	 * <param name="optionconfiguration">需要更新的Optionconfiguration</param>
	 * <param name="optionconfigurationQueryCondition">附加的条件</param>
	 */
	protected int optionconfigurationUpdateByCondition(Optionconfiguration optionconfiguration, OptionconfigurationExample optionconfigurationQueryCondition) {
		OptionconfigurationMapper mapperImpl = this.getSqlSession().getMapper(OptionconfigurationMapper.class);
		int ret = mapperImpl.updateByExample(optionconfiguration, optionconfigurationQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Optionconfiguration到数据库中
	 * <param name="optionconfiguration">需要更新的Optionconfiguration</param>
	 * <param name="optionconfigurationQueryCondition">附加的条件</param>
	 */
	protected int optionconfigurationUpdateSelectiveByCondition(Optionconfiguration optionconfiguration, OptionconfigurationExample optionconfigurationQueryCondition) {
		OptionconfigurationMapper mapperImpl = this.getSqlSession().getMapper(OptionconfigurationMapper.class);
		int ret = mapperImpl.updateByExampleSelective(optionconfiguration, optionconfigurationQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="optionconfiguration">从数据库中删除一个对象Optionconfiguration</param>
	 * <param name="AId"></param>
	 */
	protected int optionconfigurationDeleteByPrimaryKey(long AId) {
		OptionconfigurationMapper mapperImpl = this.getSqlSession().getMapper(OptionconfigurationMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="optionconfiguration">从数据库中删除一个对象Optionconfiguration</param>
	 */
	protected int optionconfigurationDeleteByCondition(OptionconfigurationExample optionconfigurationQueryCondition) {
		OptionconfigurationMapper mapperImpl = this.getSqlSession().getMapper(OptionconfigurationMapper.class);
		return mapperImpl.deleteByExample(optionconfigurationQueryCondition);
	}
	
	/**
	 * <param name="optionconfiguration">从数据库中查询一个对象Optionconfiguration</param>
	 * <param name="AId"></param>
	 */
	protected Optionconfiguration optionconfigurationSelectByPrimaryKey(long AId) {
		OptionconfigurationMapper mapperImpl = this.getSqlSession().getMapper(OptionconfigurationMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="optionconfigurationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Optionconfiguration> optionconfigurationSelectObjects(OptionconfigurationExample optionconfigurationQueryCondition) {
		OptionconfigurationMapper mapperImpl = this.getSqlSession().getMapper(OptionconfigurationMapper.class);
		return mapperImpl.selectByExample(optionconfigurationQueryCondition);
	}
	
	/**
	 * <param name="optionconfigurationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int optionconfigurationQuerySelectObjectsCount(OptionconfigurationExample optionconfigurationQueryCondition) {
		OptionconfigurationMapper mapperImpl = this.getSqlSession().getMapper(OptionconfigurationMapper.class);
		return mapperImpl.countByExample(optionconfigurationQueryCondition);
	}
	
	/**
	 * 插入一个对象OsCurrentstep到数据库中
	 * <param name="OsCurrentstep">需要插入的OsCurrentstep</param>
	 */
	protected int osCurrentstepInsert(OsCurrentstep osCurrentstep) {
		OsCurrentstepMapper mapperImpl = this.getSqlSession().getMapper(OsCurrentstepMapper.class);
		return mapperImpl.insertSelective(osCurrentstep);
	}
	
	/**
	 * 更新一个对象OsCurrentstep到数据库中
	 * <param name="osCurrentstep">需要更新的OsCurrentstep</param>
	 */
	protected int osCurrentstepUpdate(OsCurrentstep osCurrentstep) {
		OsCurrentstepMapper mapperImpl = this.getSqlSession().getMapper(OsCurrentstepMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(osCurrentstep);
		return ret;
	}
	
	/**
	 * 更新一个对象OsCurrentstep到数据库中
	 * <param name="osCurrentstep">需要更新的OsCurrentstep</param>
	 */
	protected int osCurrentstepUpdateSelective(OsCurrentstep osCurrentstep) {
		OsCurrentstepMapper mapperImpl = this.getSqlSession().getMapper(OsCurrentstepMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(osCurrentstep);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象OsCurrentstep到数据库中
	 * <param name="osCurrentstep">需要更新的OsCurrentstep</param>
	 * <param name="osCurrentstepQueryCondition">附加的条件</param>
	 */
	protected int osCurrentstepUpdateByCondition(OsCurrentstep osCurrentstep, OsCurrentstepExample osCurrentstepQueryCondition) {
		OsCurrentstepMapper mapperImpl = this.getSqlSession().getMapper(OsCurrentstepMapper.class);
		int ret = mapperImpl.updateByExample(osCurrentstep, osCurrentstepQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息OsCurrentstep到数据库中
	 * <param name="osCurrentstep">需要更新的OsCurrentstep</param>
	 * <param name="osCurrentstepQueryCondition">附加的条件</param>
	 */
	protected int osCurrentstepUpdateSelectiveByCondition(OsCurrentstep osCurrentstep, OsCurrentstepExample osCurrentstepQueryCondition) {
		OsCurrentstepMapper mapperImpl = this.getSqlSession().getMapper(OsCurrentstepMapper.class);
		int ret = mapperImpl.updateByExampleSelective(osCurrentstep, osCurrentstepQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="osCurrentstep">从数据库中删除一个对象OsCurrentstep</param>
	 * <param name="AId"></param>
	 */
	protected int osCurrentstepDeleteByPrimaryKey(long AId) {
		OsCurrentstepMapper mapperImpl = this.getSqlSession().getMapper(OsCurrentstepMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="osCurrentstep">从数据库中删除一个对象OsCurrentstep</param>
	 */
	protected int osCurrentstepDeleteByCondition(OsCurrentstepExample osCurrentstepQueryCondition) {
		OsCurrentstepMapper mapperImpl = this.getSqlSession().getMapper(OsCurrentstepMapper.class);
		return mapperImpl.deleteByExample(osCurrentstepQueryCondition);
	}
	
	/**
	 * <param name="osCurrentstep">从数据库中查询一个对象OsCurrentstep</param>
	 * <param name="AId"></param>
	 */
	protected OsCurrentstep osCurrentstepSelectByPrimaryKey(long AId) {
		OsCurrentstepMapper mapperImpl = this.getSqlSession().getMapper(OsCurrentstepMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="osCurrentstepQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<OsCurrentstep> osCurrentstepSelectObjects(OsCurrentstepExample osCurrentstepQueryCondition) {
		OsCurrentstepMapper mapperImpl = this.getSqlSession().getMapper(OsCurrentstepMapper.class);
		return mapperImpl.selectByExample(osCurrentstepQueryCondition);
	}
	
	/**
	 * <param name="osCurrentstepQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int osCurrentstepQuerySelectObjectsCount(OsCurrentstepExample osCurrentstepQueryCondition) {
		OsCurrentstepMapper mapperImpl = this.getSqlSession().getMapper(OsCurrentstepMapper.class);
		return mapperImpl.countByExample(osCurrentstepQueryCondition);
	}
	
	/**
	 * 插入一个对象OsCurrentstepPrevKey到数据库中
	 * <param name="OsCurrentstepPrevKey">需要插入的OsCurrentstepPrevKey</param>
	 */
	protected int osCurrentstepPrevInsert(OsCurrentstepPrevKey osCurrentstepPrev) {
		OsCurrentstepPrevMapper mapperImpl = this.getSqlSession().getMapper(OsCurrentstepPrevMapper.class);
		return mapperImpl.insertSelective(osCurrentstepPrev);
	}
	
	/**
	 * <param name="osCurrentstepPrev">从数据库中删除一个对象OsCurrentstepPrev</param>
	 * <param name="AOsCurrentstepPrevKey"> 主键类</param>
	 */
	protected int osCurrentstepPrevDeleteByPrimaryKey(OsCurrentstepPrevKey AOsCurrentstepPrevKey) {
		OsCurrentstepPrevMapper mapperImpl = this.getSqlSession().getMapper(OsCurrentstepPrevMapper.class);
		return mapperImpl.deleteByPrimaryKey(AOsCurrentstepPrevKey);
	}
	
	/**
	 * <param name="osCurrentstepPrev">从数据库中删除一个对象OsCurrentstepPrev</param>
	 */
	protected int osCurrentstepPrevDeleteByCondition(OsCurrentstepPrevExample osCurrentstepPrevQueryCondition) {
		OsCurrentstepPrevMapper mapperImpl = this.getSqlSession().getMapper(OsCurrentstepPrevMapper.class);
		return mapperImpl.deleteByExample(osCurrentstepPrevQueryCondition);
	}
	
	/**
	 * <param name="osCurrentstepPrevQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<OsCurrentstepPrevKey> osCurrentstepPrevSelectObjects(OsCurrentstepPrevExample osCurrentstepPrevQueryCondition) {
		OsCurrentstepPrevMapper mapperImpl = this.getSqlSession().getMapper(OsCurrentstepPrevMapper.class);
		return mapperImpl.selectByExample(osCurrentstepPrevQueryCondition);
	}
	
	/**
	 * <param name="osCurrentstepPrevQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int osCurrentstepPrevQuerySelectObjectsCount(OsCurrentstepPrevExample osCurrentstepPrevQueryCondition) {
		OsCurrentstepPrevMapper mapperImpl = this.getSqlSession().getMapper(OsCurrentstepPrevMapper.class);
		return mapperImpl.countByExample(osCurrentstepPrevQueryCondition);
	}
	
	/**
	 * 插入一个对象OsHistorystep到数据库中
	 * <param name="OsHistorystep">需要插入的OsHistorystep</param>
	 */
	protected int osHistorystepInsert(OsHistorystep osHistorystep) {
		OsHistorystepMapper mapperImpl = this.getSqlSession().getMapper(OsHistorystepMapper.class);
		return mapperImpl.insertSelective(osHistorystep);
	}
	
	/**
	 * 更新一个对象OsHistorystep到数据库中
	 * <param name="osHistorystep">需要更新的OsHistorystep</param>
	 */
	protected int osHistorystepUpdate(OsHistorystep osHistorystep) {
		OsHistorystepMapper mapperImpl = this.getSqlSession().getMapper(OsHistorystepMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(osHistorystep);
		return ret;
	}
	
	/**
	 * 更新一个对象OsHistorystep到数据库中
	 * <param name="osHistorystep">需要更新的OsHistorystep</param>
	 */
	protected int osHistorystepUpdateSelective(OsHistorystep osHistorystep) {
		OsHistorystepMapper mapperImpl = this.getSqlSession().getMapper(OsHistorystepMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(osHistorystep);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象OsHistorystep到数据库中
	 * <param name="osHistorystep">需要更新的OsHistorystep</param>
	 * <param name="osHistorystepQueryCondition">附加的条件</param>
	 */
	protected int osHistorystepUpdateByCondition(OsHistorystep osHistorystep, OsHistorystepExample osHistorystepQueryCondition) {
		OsHistorystepMapper mapperImpl = this.getSqlSession().getMapper(OsHistorystepMapper.class);
		int ret = mapperImpl.updateByExample(osHistorystep, osHistorystepQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息OsHistorystep到数据库中
	 * <param name="osHistorystep">需要更新的OsHistorystep</param>
	 * <param name="osHistorystepQueryCondition">附加的条件</param>
	 */
	protected int osHistorystepUpdateSelectiveByCondition(OsHistorystep osHistorystep, OsHistorystepExample osHistorystepQueryCondition) {
		OsHistorystepMapper mapperImpl = this.getSqlSession().getMapper(OsHistorystepMapper.class);
		int ret = mapperImpl.updateByExampleSelective(osHistorystep, osHistorystepQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="osHistorystep">从数据库中删除一个对象OsHistorystep</param>
	 * <param name="AId"></param>
	 */
	protected int osHistorystepDeleteByPrimaryKey(long AId) {
		OsHistorystepMapper mapperImpl = this.getSqlSession().getMapper(OsHistorystepMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="osHistorystep">从数据库中删除一个对象OsHistorystep</param>
	 */
	protected int osHistorystepDeleteByCondition(OsHistorystepExample osHistorystepQueryCondition) {
		OsHistorystepMapper mapperImpl = this.getSqlSession().getMapper(OsHistorystepMapper.class);
		return mapperImpl.deleteByExample(osHistorystepQueryCondition);
	}
	
	/**
	 * <param name="osHistorystep">从数据库中查询一个对象OsHistorystep</param>
	 * <param name="AId"></param>
	 */
	protected OsHistorystep osHistorystepSelectByPrimaryKey(long AId) {
		OsHistorystepMapper mapperImpl = this.getSqlSession().getMapper(OsHistorystepMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="osHistorystepQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<OsHistorystep> osHistorystepSelectObjects(OsHistorystepExample osHistorystepQueryCondition) {
		OsHistorystepMapper mapperImpl = this.getSqlSession().getMapper(OsHistorystepMapper.class);
		return mapperImpl.selectByExample(osHistorystepQueryCondition);
	}
	
	/**
	 * <param name="osHistorystepQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int osHistorystepQuerySelectObjectsCount(OsHistorystepExample osHistorystepQueryCondition) {
		OsHistorystepMapper mapperImpl = this.getSqlSession().getMapper(OsHistorystepMapper.class);
		return mapperImpl.countByExample(osHistorystepQueryCondition);
	}
	
	/**
	 * 插入一个对象OsHistorystepPrevKey到数据库中
	 * <param name="OsHistorystepPrevKey">需要插入的OsHistorystepPrevKey</param>
	 */
	protected int osHistorystepPrevInsert(OsHistorystepPrevKey osHistorystepPrev) {
		OsHistorystepPrevMapper mapperImpl = this.getSqlSession().getMapper(OsHistorystepPrevMapper.class);
		return mapperImpl.insertSelective(osHistorystepPrev);
	}
	
	/**
	 * <param name="osHistorystepPrev">从数据库中删除一个对象OsHistorystepPrev</param>
	 * <param name="AOsHistorystepPrevKey"> 主键类</param>
	 */
	protected int osHistorystepPrevDeleteByPrimaryKey(OsHistorystepPrevKey AOsHistorystepPrevKey) {
		OsHistorystepPrevMapper mapperImpl = this.getSqlSession().getMapper(OsHistorystepPrevMapper.class);
		return mapperImpl.deleteByPrimaryKey(AOsHistorystepPrevKey);
	}
	
	/**
	 * <param name="osHistorystepPrev">从数据库中删除一个对象OsHistorystepPrev</param>
	 */
	protected int osHistorystepPrevDeleteByCondition(OsHistorystepPrevExample osHistorystepPrevQueryCondition) {
		OsHistorystepPrevMapper mapperImpl = this.getSqlSession().getMapper(OsHistorystepPrevMapper.class);
		return mapperImpl.deleteByExample(osHistorystepPrevQueryCondition);
	}
	
	/**
	 * <param name="osHistorystepPrevQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<OsHistorystepPrevKey> osHistorystepPrevSelectObjects(OsHistorystepPrevExample osHistorystepPrevQueryCondition) {
		OsHistorystepPrevMapper mapperImpl = this.getSqlSession().getMapper(OsHistorystepPrevMapper.class);
		return mapperImpl.selectByExample(osHistorystepPrevQueryCondition);
	}
	
	/**
	 * <param name="osHistorystepPrevQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int osHistorystepPrevQuerySelectObjectsCount(OsHistorystepPrevExample osHistorystepPrevQueryCondition) {
		OsHistorystepPrevMapper mapperImpl = this.getSqlSession().getMapper(OsHistorystepPrevMapper.class);
		return mapperImpl.countByExample(osHistorystepPrevQueryCondition);
	}
	
	/**
	 * 插入一个对象OsWfentry到数据库中
	 * <param name="OsWfentry">需要插入的OsWfentry</param>
	 */
	protected int osWfentryInsert(OsWfentry osWfentry) {
		OsWfentryMapper mapperImpl = this.getSqlSession().getMapper(OsWfentryMapper.class);
		return mapperImpl.insertSelective(osWfentry);
	}
	
	/**
	 * 更新一个对象OsWfentry到数据库中
	 * <param name="osWfentry">需要更新的OsWfentry</param>
	 */
	protected int osWfentryUpdate(OsWfentry osWfentry) {
		OsWfentryMapper mapperImpl = this.getSqlSession().getMapper(OsWfentryMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(osWfentry);
		return ret;
	}
	
	/**
	 * 更新一个对象OsWfentry到数据库中
	 * <param name="osWfentry">需要更新的OsWfentry</param>
	 */
	protected int osWfentryUpdateSelective(OsWfentry osWfentry) {
		OsWfentryMapper mapperImpl = this.getSqlSession().getMapper(OsWfentryMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(osWfentry);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象OsWfentry到数据库中
	 * <param name="osWfentry">需要更新的OsWfentry</param>
	 * <param name="osWfentryQueryCondition">附加的条件</param>
	 */
	protected int osWfentryUpdateByCondition(OsWfentry osWfentry, OsWfentryExample osWfentryQueryCondition) {
		OsWfentryMapper mapperImpl = this.getSqlSession().getMapper(OsWfentryMapper.class);
		int ret = mapperImpl.updateByExample(osWfentry, osWfentryQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息OsWfentry到数据库中
	 * <param name="osWfentry">需要更新的OsWfentry</param>
	 * <param name="osWfentryQueryCondition">附加的条件</param>
	 */
	protected int osWfentryUpdateSelectiveByCondition(OsWfentry osWfentry, OsWfentryExample osWfentryQueryCondition) {
		OsWfentryMapper mapperImpl = this.getSqlSession().getMapper(OsWfentryMapper.class);
		int ret = mapperImpl.updateByExampleSelective(osWfentry, osWfentryQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="osWfentry">从数据库中删除一个对象OsWfentry</param>
	 * <param name="AId"></param>
	 */
	protected int osWfentryDeleteByPrimaryKey(long AId) {
		OsWfentryMapper mapperImpl = this.getSqlSession().getMapper(OsWfentryMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="osWfentry">从数据库中删除一个对象OsWfentry</param>
	 */
	protected int osWfentryDeleteByCondition(OsWfentryExample osWfentryQueryCondition) {
		OsWfentryMapper mapperImpl = this.getSqlSession().getMapper(OsWfentryMapper.class);
		return mapperImpl.deleteByExample(osWfentryQueryCondition);
	}
	
	/**
	 * <param name="osWfentry">从数据库中查询一个对象OsWfentry</param>
	 * <param name="AId"></param>
	 */
	protected OsWfentry osWfentrySelectByPrimaryKey(long AId) {
		OsWfentryMapper mapperImpl = this.getSqlSession().getMapper(OsWfentryMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="osWfentryQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<OsWfentry> osWfentrySelectObjects(OsWfentryExample osWfentryQueryCondition) {
		OsWfentryMapper mapperImpl = this.getSqlSession().getMapper(OsWfentryMapper.class);
		return mapperImpl.selectByExample(osWfentryQueryCondition);
	}
	
	/**
	 * <param name="osWfentryQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int osWfentryQuerySelectObjectsCount(OsWfentryExample osWfentryQueryCondition) {
		OsWfentryMapper mapperImpl = this.getSqlSession().getMapper(OsWfentryMapper.class);
		return mapperImpl.countByExample(osWfentryQueryCondition);
	}
	
	/**
	 * 插入一个对象Permissionscheme到数据库中
	 * <param name="Permissionscheme">需要插入的Permissionscheme</param>
	 */
	protected int permissionschemeInsert(Permissionscheme permissionscheme) {
		PermissionschemeMapper mapperImpl = this.getSqlSession().getMapper(PermissionschemeMapper.class);
		return mapperImpl.insertSelective(permissionscheme);
	}
	
	/**
	 * 更新一个对象Permissionscheme到数据库中
	 * <param name="permissionscheme">需要更新的Permissionscheme</param>
	 */
	protected int permissionschemeUpdate(Permissionscheme permissionscheme) {
		PermissionschemeMapper mapperImpl = this.getSqlSession().getMapper(PermissionschemeMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(permissionscheme);
		return ret;
	}
	
	/**
	 * 更新一个对象Permissionscheme到数据库中
	 * <param name="permissionscheme">需要更新的Permissionscheme</param>
	 */
	protected int permissionschemeUpdateSelective(Permissionscheme permissionscheme) {
		PermissionschemeMapper mapperImpl = this.getSqlSession().getMapper(PermissionschemeMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(permissionscheme);
		return ret;
	}
	
	/**
	 * 更新一个对象Permissionscheme到数据库中
	 * <param name="permissionscheme">需要更新的Permissionscheme</param>
	 */
	public int permissionschemeUpdateWithBlobs(Permissionscheme permissionscheme) {
		PermissionschemeMapper mapperImpl = this.getSqlSession().getMapper(PermissionschemeMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(permissionscheme);
	}
	
	/**
	 * 根据条件更新一批对象Permissionscheme到数据库中
	 * <param name="permissionscheme">需要更新的Permissionscheme</param>
	 * <param name="permissionschemeQueryCondition">附加的条件</param>
	 */
	protected int permissionschemeUpdateByCondition(Permissionscheme permissionscheme, PermissionschemeExample permissionschemeQueryCondition) {
		PermissionschemeMapper mapperImpl = this.getSqlSession().getMapper(PermissionschemeMapper.class);
		int ret = mapperImpl.updateByExample(permissionscheme, permissionschemeQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Permissionscheme到数据库中
	 * <param name="permissionscheme">需要更新的Permissionscheme</param>
	 * <param name="permissionschemeQueryCondition">附加的条件</param>
	 */
	protected int permissionschemeUpdateSelectiveByCondition(Permissionscheme permissionscheme, PermissionschemeExample permissionschemeQueryCondition) {
		PermissionschemeMapper mapperImpl = this.getSqlSession().getMapper(PermissionschemeMapper.class);
		int ret = mapperImpl.updateByExampleSelective(permissionscheme, permissionschemeQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="permissionscheme">从数据库中删除一个对象Permissionscheme</param>
	 * <param name="AId"></param>
	 */
	protected int permissionschemeDeleteByPrimaryKey(long AId) {
		PermissionschemeMapper mapperImpl = this.getSqlSession().getMapper(PermissionschemeMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="permissionscheme">从数据库中删除一个对象Permissionscheme</param>
	 */
	protected int permissionschemeDeleteByCondition(PermissionschemeExample permissionschemeQueryCondition) {
		PermissionschemeMapper mapperImpl = this.getSqlSession().getMapper(PermissionschemeMapper.class);
		return mapperImpl.deleteByExample(permissionschemeQueryCondition);
	}
	
	/**
	 * <param name="permissionscheme">从数据库中查询一个对象Permissionscheme</param>
	 * <param name="AId"></param>
	 */
	protected Permissionscheme permissionschemeSelectByPrimaryKey(long AId) {
		PermissionschemeMapper mapperImpl = this.getSqlSession().getMapper(PermissionschemeMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="permissionschemeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Permissionscheme> permissionschemeSelectObjects(PermissionschemeExample permissionschemeQueryCondition) {
		PermissionschemeMapper mapperImpl = this.getSqlSession().getMapper(PermissionschemeMapper.class);
		return mapperImpl.selectByExample(permissionschemeQueryCondition);
	}
	
	/**
	 * <param name="permissionschemeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Permissionscheme> permissionschemeSelectObjectsWithBLOBs(PermissionschemeExample permissionschemeQueryCondition) {
		PermissionschemeMapper mapperImpl = this.getSqlSession().getMapper(PermissionschemeMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(permissionschemeQueryCondition);
	}
	
	/**
	 * <param name="permissionschemeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int permissionschemeQuerySelectObjectsCount(PermissionschemeExample permissionschemeQueryCondition) {
		PermissionschemeMapper mapperImpl = this.getSqlSession().getMapper(PermissionschemeMapper.class);
		return mapperImpl.countByExample(permissionschemeQueryCondition);
	}
	
	/**
	 * 插入一个对象Pluginversion到数据库中
	 * <param name="Pluginversion">需要插入的Pluginversion</param>
	 */
	protected int pluginversionInsert(Pluginversion pluginversion) {
		PluginversionMapper mapperImpl = this.getSqlSession().getMapper(PluginversionMapper.class);
		return mapperImpl.insertSelective(pluginversion);
	}
	
	/**
	 * 更新一个对象Pluginversion到数据库中
	 * <param name="pluginversion">需要更新的Pluginversion</param>
	 */
	protected int pluginversionUpdate(Pluginversion pluginversion) {
		PluginversionMapper mapperImpl = this.getSqlSession().getMapper(PluginversionMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(pluginversion);
		return ret;
	}
	
	/**
	 * 更新一个对象Pluginversion到数据库中
	 * <param name="pluginversion">需要更新的Pluginversion</param>
	 */
	protected int pluginversionUpdateSelective(Pluginversion pluginversion) {
		PluginversionMapper mapperImpl = this.getSqlSession().getMapper(PluginversionMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(pluginversion);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Pluginversion到数据库中
	 * <param name="pluginversion">需要更新的Pluginversion</param>
	 * <param name="pluginversionQueryCondition">附加的条件</param>
	 */
	protected int pluginversionUpdateByCondition(Pluginversion pluginversion, PluginversionExample pluginversionQueryCondition) {
		PluginversionMapper mapperImpl = this.getSqlSession().getMapper(PluginversionMapper.class);
		int ret = mapperImpl.updateByExample(pluginversion, pluginversionQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Pluginversion到数据库中
	 * <param name="pluginversion">需要更新的Pluginversion</param>
	 * <param name="pluginversionQueryCondition">附加的条件</param>
	 */
	protected int pluginversionUpdateSelectiveByCondition(Pluginversion pluginversion, PluginversionExample pluginversionQueryCondition) {
		PluginversionMapper mapperImpl = this.getSqlSession().getMapper(PluginversionMapper.class);
		int ret = mapperImpl.updateByExampleSelective(pluginversion, pluginversionQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="pluginversion">从数据库中删除一个对象Pluginversion</param>
	 * <param name="AId"></param>
	 */
	protected int pluginversionDeleteByPrimaryKey(long AId) {
		PluginversionMapper mapperImpl = this.getSqlSession().getMapper(PluginversionMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="pluginversion">从数据库中删除一个对象Pluginversion</param>
	 */
	protected int pluginversionDeleteByCondition(PluginversionExample pluginversionQueryCondition) {
		PluginversionMapper mapperImpl = this.getSqlSession().getMapper(PluginversionMapper.class);
		return mapperImpl.deleteByExample(pluginversionQueryCondition);
	}
	
	/**
	 * <param name="pluginversion">从数据库中查询一个对象Pluginversion</param>
	 * <param name="AId"></param>
	 */
	protected Pluginversion pluginversionSelectByPrimaryKey(long AId) {
		PluginversionMapper mapperImpl = this.getSqlSession().getMapper(PluginversionMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="pluginversionQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Pluginversion> pluginversionSelectObjects(PluginversionExample pluginversionQueryCondition) {
		PluginversionMapper mapperImpl = this.getSqlSession().getMapper(PluginversionMapper.class);
		return mapperImpl.selectByExample(pluginversionQueryCondition);
	}
	
	/**
	 * <param name="pluginversionQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int pluginversionQuerySelectObjectsCount(PluginversionExample pluginversionQueryCondition) {
		PluginversionMapper mapperImpl = this.getSqlSession().getMapper(PluginversionMapper.class);
		return mapperImpl.countByExample(pluginversionQueryCondition);
	}
	
	/**
	 * 插入一个对象Portalpage到数据库中
	 * <param name="Portalpage">需要插入的Portalpage</param>
	 */
	protected int portalpageInsert(Portalpage portalpage) {
		PortalpageMapper mapperImpl = this.getSqlSession().getMapper(PortalpageMapper.class);
		return mapperImpl.insertSelective(portalpage);
	}
	
	/**
	 * 更新一个对象Portalpage到数据库中
	 * <param name="portalpage">需要更新的Portalpage</param>
	 */
	protected int portalpageUpdate(Portalpage portalpage) {
		PortalpageMapper mapperImpl = this.getSqlSession().getMapper(PortalpageMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(portalpage);
		return ret;
	}
	
	/**
	 * 更新一个对象Portalpage到数据库中
	 * <param name="portalpage">需要更新的Portalpage</param>
	 */
	protected int portalpageUpdateSelective(Portalpage portalpage) {
		PortalpageMapper mapperImpl = this.getSqlSession().getMapper(PortalpageMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(portalpage);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Portalpage到数据库中
	 * <param name="portalpage">需要更新的Portalpage</param>
	 * <param name="portalpageQueryCondition">附加的条件</param>
	 */
	protected int portalpageUpdateByCondition(Portalpage portalpage, PortalpageExample portalpageQueryCondition) {
		PortalpageMapper mapperImpl = this.getSqlSession().getMapper(PortalpageMapper.class);
		int ret = mapperImpl.updateByExample(portalpage, portalpageQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Portalpage到数据库中
	 * <param name="portalpage">需要更新的Portalpage</param>
	 * <param name="portalpageQueryCondition">附加的条件</param>
	 */
	protected int portalpageUpdateSelectiveByCondition(Portalpage portalpage, PortalpageExample portalpageQueryCondition) {
		PortalpageMapper mapperImpl = this.getSqlSession().getMapper(PortalpageMapper.class);
		int ret = mapperImpl.updateByExampleSelective(portalpage, portalpageQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="portalpage">从数据库中删除一个对象Portalpage</param>
	 * <param name="AId"></param>
	 */
	protected int portalpageDeleteByPrimaryKey(long AId) {
		PortalpageMapper mapperImpl = this.getSqlSession().getMapper(PortalpageMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="portalpage">从数据库中删除一个对象Portalpage</param>
	 */
	protected int portalpageDeleteByCondition(PortalpageExample portalpageQueryCondition) {
		PortalpageMapper mapperImpl = this.getSqlSession().getMapper(PortalpageMapper.class);
		return mapperImpl.deleteByExample(portalpageQueryCondition);
	}
	
	/**
	 * <param name="portalpage">从数据库中查询一个对象Portalpage</param>
	 * <param name="AId"></param>
	 */
	protected Portalpage portalpageSelectByPrimaryKey(long AId) {
		PortalpageMapper mapperImpl = this.getSqlSession().getMapper(PortalpageMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="portalpageQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Portalpage> portalpageSelectObjects(PortalpageExample portalpageQueryCondition) {
		PortalpageMapper mapperImpl = this.getSqlSession().getMapper(PortalpageMapper.class);
		return mapperImpl.selectByExample(portalpageQueryCondition);
	}
	
	/**
	 * <param name="portalpageQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int portalpageQuerySelectObjectsCount(PortalpageExample portalpageQueryCondition) {
		PortalpageMapper mapperImpl = this.getSqlSession().getMapper(PortalpageMapper.class);
		return mapperImpl.countByExample(portalpageQueryCondition);
	}
	
	/**
	 * 插入一个对象Portletconfiguration到数据库中
	 * <param name="Portletconfiguration">需要插入的Portletconfiguration</param>
	 */
	protected int portletconfigurationInsert(Portletconfiguration portletconfiguration) {
		PortletconfigurationMapper mapperImpl = this.getSqlSession().getMapper(PortletconfigurationMapper.class);
		return mapperImpl.insertSelective(portletconfiguration);
	}
	
	/**
	 * 更新一个对象Portletconfiguration到数据库中
	 * <param name="portletconfiguration">需要更新的Portletconfiguration</param>
	 */
	protected int portletconfigurationUpdate(Portletconfiguration portletconfiguration) {
		PortletconfigurationMapper mapperImpl = this.getSqlSession().getMapper(PortletconfigurationMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(portletconfiguration);
		return ret;
	}
	
	/**
	 * 更新一个对象Portletconfiguration到数据库中
	 * <param name="portletconfiguration">需要更新的Portletconfiguration</param>
	 */
	protected int portletconfigurationUpdateSelective(Portletconfiguration portletconfiguration) {
		PortletconfigurationMapper mapperImpl = this.getSqlSession().getMapper(PortletconfigurationMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(portletconfiguration);
		return ret;
	}
	
	/**
	 * 更新一个对象Portletconfiguration到数据库中
	 * <param name="portletconfiguration">需要更新的Portletconfiguration</param>
	 */
	public int portletconfigurationUpdateWithBlobs(Portletconfiguration portletconfiguration) {
		PortletconfigurationMapper mapperImpl = this.getSqlSession().getMapper(PortletconfigurationMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(portletconfiguration);
	}
	
	/**
	 * 根据条件更新一批对象Portletconfiguration到数据库中
	 * <param name="portletconfiguration">需要更新的Portletconfiguration</param>
	 * <param name="portletconfigurationQueryCondition">附加的条件</param>
	 */
	protected int portletconfigurationUpdateByCondition(Portletconfiguration portletconfiguration, PortletconfigurationExample portletconfigurationQueryCondition) {
		PortletconfigurationMapper mapperImpl = this.getSqlSession().getMapper(PortletconfigurationMapper.class);
		int ret = mapperImpl.updateByExample(portletconfiguration, portletconfigurationQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Portletconfiguration到数据库中
	 * <param name="portletconfiguration">需要更新的Portletconfiguration</param>
	 * <param name="portletconfigurationQueryCondition">附加的条件</param>
	 */
	protected int portletconfigurationUpdateSelectiveByCondition(Portletconfiguration portletconfiguration, PortletconfigurationExample portletconfigurationQueryCondition) {
		PortletconfigurationMapper mapperImpl = this.getSqlSession().getMapper(PortletconfigurationMapper.class);
		int ret = mapperImpl.updateByExampleSelective(portletconfiguration, portletconfigurationQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="portletconfiguration">从数据库中删除一个对象Portletconfiguration</param>
	 * <param name="AId"></param>
	 */
	protected int portletconfigurationDeleteByPrimaryKey(long AId) {
		PortletconfigurationMapper mapperImpl = this.getSqlSession().getMapper(PortletconfigurationMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="portletconfiguration">从数据库中删除一个对象Portletconfiguration</param>
	 */
	protected int portletconfigurationDeleteByCondition(PortletconfigurationExample portletconfigurationQueryCondition) {
		PortletconfigurationMapper mapperImpl = this.getSqlSession().getMapper(PortletconfigurationMapper.class);
		return mapperImpl.deleteByExample(portletconfigurationQueryCondition);
	}
	
	/**
	 * <param name="portletconfiguration">从数据库中查询一个对象Portletconfiguration</param>
	 * <param name="AId"></param>
	 */
	protected Portletconfiguration portletconfigurationSelectByPrimaryKey(long AId) {
		PortletconfigurationMapper mapperImpl = this.getSqlSession().getMapper(PortletconfigurationMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="portletconfigurationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Portletconfiguration> portletconfigurationSelectObjects(PortletconfigurationExample portletconfigurationQueryCondition) {
		PortletconfigurationMapper mapperImpl = this.getSqlSession().getMapper(PortletconfigurationMapper.class);
		return mapperImpl.selectByExample(portletconfigurationQueryCondition);
	}
	
	/**
	 * <param name="portletconfigurationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Portletconfiguration> portletconfigurationSelectObjectsWithBLOBs(PortletconfigurationExample portletconfigurationQueryCondition) {
		PortletconfigurationMapper mapperImpl = this.getSqlSession().getMapper(PortletconfigurationMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(portletconfigurationQueryCondition);
	}
	
	/**
	 * <param name="portletconfigurationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int portletconfigurationQuerySelectObjectsCount(PortletconfigurationExample portletconfigurationQueryCondition) {
		PortletconfigurationMapper mapperImpl = this.getSqlSession().getMapper(PortletconfigurationMapper.class);
		return mapperImpl.countByExample(portletconfigurationQueryCondition);
	}
	
	/**
	 * 插入一个对象Priority到数据库中
	 * <param name="Priority">需要插入的Priority</param>
	 */
	protected int priorityInsert(Priority priority) {
		PriorityMapper mapperImpl = this.getSqlSession().getMapper(PriorityMapper.class);
		return mapperImpl.insertSelective(priority);
	}
	
	/**
	 * 更新一个对象Priority到数据库中
	 * <param name="priority">需要更新的Priority</param>
	 */
	protected int priorityUpdate(Priority priority) {
		PriorityMapper mapperImpl = this.getSqlSession().getMapper(PriorityMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(priority);
		return ret;
	}
	
	/**
	 * 更新一个对象Priority到数据库中
	 * <param name="priority">需要更新的Priority</param>
	 */
	protected int priorityUpdateSelective(Priority priority) {
		PriorityMapper mapperImpl = this.getSqlSession().getMapper(PriorityMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(priority);
		return ret;
	}
	
	/**
	 * 更新一个对象Priority到数据库中
	 * <param name="priority">需要更新的Priority</param>
	 */
	public int priorityUpdateWithBlobs(Priority priority) {
		PriorityMapper mapperImpl = this.getSqlSession().getMapper(PriorityMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(priority);
	}
	
	/**
	 * 根据条件更新一批对象Priority到数据库中
	 * <param name="priority">需要更新的Priority</param>
	 * <param name="priorityQueryCondition">附加的条件</param>
	 */
	protected int priorityUpdateByCondition(Priority priority, PriorityExample priorityQueryCondition) {
		PriorityMapper mapperImpl = this.getSqlSession().getMapper(PriorityMapper.class);
		int ret = mapperImpl.updateByExample(priority, priorityQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Priority到数据库中
	 * <param name="priority">需要更新的Priority</param>
	 * <param name="priorityQueryCondition">附加的条件</param>
	 */
	protected int priorityUpdateSelectiveByCondition(Priority priority, PriorityExample priorityQueryCondition) {
		PriorityMapper mapperImpl = this.getSqlSession().getMapper(PriorityMapper.class);
		int ret = mapperImpl.updateByExampleSelective(priority, priorityQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="priority">从数据库中删除一个对象Priority</param>
	 * <param name="AId"></param>
	 */
	protected int priorityDeleteByPrimaryKey(String AId) {
		PriorityMapper mapperImpl = this.getSqlSession().getMapper(PriorityMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="priority">从数据库中删除一个对象Priority</param>
	 */
	protected int priorityDeleteByCondition(PriorityExample priorityQueryCondition) {
		PriorityMapper mapperImpl = this.getSqlSession().getMapper(PriorityMapper.class);
		return mapperImpl.deleteByExample(priorityQueryCondition);
	}
	
	/**
	 * <param name="priority">从数据库中查询一个对象Priority</param>
	 * <param name="AId"></param>
	 */
	protected Priority prioritySelectByPrimaryKey(String AId) {
		PriorityMapper mapperImpl = this.getSqlSession().getMapper(PriorityMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="priorityQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Priority> prioritySelectObjects(PriorityExample priorityQueryCondition) {
		PriorityMapper mapperImpl = this.getSqlSession().getMapper(PriorityMapper.class);
		return mapperImpl.selectByExample(priorityQueryCondition);
	}
	
	/**
	 * <param name="priorityQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Priority> prioritySelectObjectsWithBLOBs(PriorityExample priorityQueryCondition) {
		PriorityMapper mapperImpl = this.getSqlSession().getMapper(PriorityMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(priorityQueryCondition);
	}
	
	/**
	 * <param name="priorityQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int priorityQuerySelectObjectsCount(PriorityExample priorityQueryCondition) {
		PriorityMapper mapperImpl = this.getSqlSession().getMapper(PriorityMapper.class);
		return mapperImpl.countByExample(priorityQueryCondition);
	}
	
	/**
	 * 插入一个对象Project到数据库中
	 * <param name="Project">需要插入的Project</param>
	 */
	protected int projectInsert(Project project) {
		ProjectMapper mapperImpl = this.getSqlSession().getMapper(ProjectMapper.class);
		return mapperImpl.insertSelective(project);
	}
	
	/**
	 * 更新一个对象Project到数据库中
	 * <param name="project">需要更新的Project</param>
	 */
	protected int projectUpdate(Project project) {
		ProjectMapper mapperImpl = this.getSqlSession().getMapper(ProjectMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(project);
		return ret;
	}
	
	/**
	 * 更新一个对象Project到数据库中
	 * <param name="project">需要更新的Project</param>
	 */
	protected int projectUpdateSelective(Project project) {
		ProjectMapper mapperImpl = this.getSqlSession().getMapper(ProjectMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(project);
		return ret;
	}
	
	/**
	 * 更新一个对象Project到数据库中
	 * <param name="project">需要更新的Project</param>
	 */
	public int projectUpdateWithBlobs(Project project) {
		ProjectMapper mapperImpl = this.getSqlSession().getMapper(ProjectMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(project);
	}
	
	/**
	 * 根据条件更新一批对象Project到数据库中
	 * <param name="project">需要更新的Project</param>
	 * <param name="projectQueryCondition">附加的条件</param>
	 */
	protected int projectUpdateByCondition(Project project, ProjectExample projectQueryCondition) {
		ProjectMapper mapperImpl = this.getSqlSession().getMapper(ProjectMapper.class);
		int ret = mapperImpl.updateByExample(project, projectQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Project到数据库中
	 * <param name="project">需要更新的Project</param>
	 * <param name="projectQueryCondition">附加的条件</param>
	 */
	protected int projectUpdateSelectiveByCondition(Project project, ProjectExample projectQueryCondition) {
		ProjectMapper mapperImpl = this.getSqlSession().getMapper(ProjectMapper.class);
		int ret = mapperImpl.updateByExampleSelective(project, projectQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="project">从数据库中删除一个对象Project</param>
	 * <param name="AId"></param>
	 */
	protected int projectDeleteByPrimaryKey(long AId) {
		ProjectMapper mapperImpl = this.getSqlSession().getMapper(ProjectMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="project">从数据库中删除一个对象Project</param>
	 */
	protected int projectDeleteByCondition(ProjectExample projectQueryCondition) {
		ProjectMapper mapperImpl = this.getSqlSession().getMapper(ProjectMapper.class);
		return mapperImpl.deleteByExample(projectQueryCondition);
	}
	
	/**
	 * <param name="project">从数据库中查询一个对象Project</param>
	 * <param name="AId"></param>
	 */
	protected Project projectSelectByPrimaryKey(long AId) {
		ProjectMapper mapperImpl = this.getSqlSession().getMapper(ProjectMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="projectQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Project> projectSelectObjects(ProjectExample projectQueryCondition) {
		ProjectMapper mapperImpl = this.getSqlSession().getMapper(ProjectMapper.class);
		return mapperImpl.selectByExample(projectQueryCondition);
	}
	
	/**
	 * <param name="projectQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Project> projectSelectObjectsWithBLOBs(ProjectExample projectQueryCondition) {
		ProjectMapper mapperImpl = this.getSqlSession().getMapper(ProjectMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(projectQueryCondition);
	}
	
	/**
	 * <param name="projectQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int projectQuerySelectObjectsCount(ProjectExample projectQueryCondition) {
		ProjectMapper mapperImpl = this.getSqlSession().getMapper(ProjectMapper.class);
		return mapperImpl.countByExample(projectQueryCondition);
	}
	
	/**
	 * 插入一个对象Projectcategory到数据库中
	 * <param name="Projectcategory">需要插入的Projectcategory</param>
	 */
	protected int projectcategoryInsert(Projectcategory projectcategory) {
		ProjectcategoryMapper mapperImpl = this.getSqlSession().getMapper(ProjectcategoryMapper.class);
		return mapperImpl.insertSelective(projectcategory);
	}
	
	/**
	 * 更新一个对象Projectcategory到数据库中
	 * <param name="projectcategory">需要更新的Projectcategory</param>
	 */
	protected int projectcategoryUpdate(Projectcategory projectcategory) {
		ProjectcategoryMapper mapperImpl = this.getSqlSession().getMapper(ProjectcategoryMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(projectcategory);
		return ret;
	}
	
	/**
	 * 更新一个对象Projectcategory到数据库中
	 * <param name="projectcategory">需要更新的Projectcategory</param>
	 */
	protected int projectcategoryUpdateSelective(Projectcategory projectcategory) {
		ProjectcategoryMapper mapperImpl = this.getSqlSession().getMapper(ProjectcategoryMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(projectcategory);
		return ret;
	}
	
	/**
	 * 更新一个对象Projectcategory到数据库中
	 * <param name="projectcategory">需要更新的Projectcategory</param>
	 */
	public int projectcategoryUpdateWithBlobs(Projectcategory projectcategory) {
		ProjectcategoryMapper mapperImpl = this.getSqlSession().getMapper(ProjectcategoryMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(projectcategory);
	}
	
	/**
	 * 根据条件更新一批对象Projectcategory到数据库中
	 * <param name="projectcategory">需要更新的Projectcategory</param>
	 * <param name="projectcategoryQueryCondition">附加的条件</param>
	 */
	protected int projectcategoryUpdateByCondition(Projectcategory projectcategory, ProjectcategoryExample projectcategoryQueryCondition) {
		ProjectcategoryMapper mapperImpl = this.getSqlSession().getMapper(ProjectcategoryMapper.class);
		int ret = mapperImpl.updateByExample(projectcategory, projectcategoryQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Projectcategory到数据库中
	 * <param name="projectcategory">需要更新的Projectcategory</param>
	 * <param name="projectcategoryQueryCondition">附加的条件</param>
	 */
	protected int projectcategoryUpdateSelectiveByCondition(Projectcategory projectcategory, ProjectcategoryExample projectcategoryQueryCondition) {
		ProjectcategoryMapper mapperImpl = this.getSqlSession().getMapper(ProjectcategoryMapper.class);
		int ret = mapperImpl.updateByExampleSelective(projectcategory, projectcategoryQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="projectcategory">从数据库中删除一个对象Projectcategory</param>
	 * <param name="AId"></param>
	 */
	protected int projectcategoryDeleteByPrimaryKey(long AId) {
		ProjectcategoryMapper mapperImpl = this.getSqlSession().getMapper(ProjectcategoryMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="projectcategory">从数据库中删除一个对象Projectcategory</param>
	 */
	protected int projectcategoryDeleteByCondition(ProjectcategoryExample projectcategoryQueryCondition) {
		ProjectcategoryMapper mapperImpl = this.getSqlSession().getMapper(ProjectcategoryMapper.class);
		return mapperImpl.deleteByExample(projectcategoryQueryCondition);
	}
	
	/**
	 * <param name="projectcategory">从数据库中查询一个对象Projectcategory</param>
	 * <param name="AId"></param>
	 */
	protected Projectcategory projectcategorySelectByPrimaryKey(long AId) {
		ProjectcategoryMapper mapperImpl = this.getSqlSession().getMapper(ProjectcategoryMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="projectcategoryQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Projectcategory> projectcategorySelectObjects(ProjectcategoryExample projectcategoryQueryCondition) {
		ProjectcategoryMapper mapperImpl = this.getSqlSession().getMapper(ProjectcategoryMapper.class);
		return mapperImpl.selectByExample(projectcategoryQueryCondition);
	}
	
	/**
	 * <param name="projectcategoryQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Projectcategory> projectcategorySelectObjectsWithBLOBs(ProjectcategoryExample projectcategoryQueryCondition) {
		ProjectcategoryMapper mapperImpl = this.getSqlSession().getMapper(ProjectcategoryMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(projectcategoryQueryCondition);
	}
	
	/**
	 * <param name="projectcategoryQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int projectcategoryQuerySelectObjectsCount(ProjectcategoryExample projectcategoryQueryCondition) {
		ProjectcategoryMapper mapperImpl = this.getSqlSession().getMapper(ProjectcategoryMapper.class);
		return mapperImpl.countByExample(projectcategoryQueryCondition);
	}
	
	/**
	 * 插入一个对象Projectrole到数据库中
	 * <param name="Projectrole">需要插入的Projectrole</param>
	 */
	protected int projectroleInsert(Projectrole projectrole) {
		ProjectroleMapper mapperImpl = this.getSqlSession().getMapper(ProjectroleMapper.class);
		return mapperImpl.insertSelective(projectrole);
	}
	
	/**
	 * 更新一个对象Projectrole到数据库中
	 * <param name="projectrole">需要更新的Projectrole</param>
	 */
	protected int projectroleUpdate(Projectrole projectrole) {
		ProjectroleMapper mapperImpl = this.getSqlSession().getMapper(ProjectroleMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(projectrole);
		return ret;
	}
	
	/**
	 * 更新一个对象Projectrole到数据库中
	 * <param name="projectrole">需要更新的Projectrole</param>
	 */
	protected int projectroleUpdateSelective(Projectrole projectrole) {
		ProjectroleMapper mapperImpl = this.getSqlSession().getMapper(ProjectroleMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(projectrole);
		return ret;
	}
	
	/**
	 * 更新一个对象Projectrole到数据库中
	 * <param name="projectrole">需要更新的Projectrole</param>
	 */
	public int projectroleUpdateWithBlobs(Projectrole projectrole) {
		ProjectroleMapper mapperImpl = this.getSqlSession().getMapper(ProjectroleMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(projectrole);
	}
	
	/**
	 * 根据条件更新一批对象Projectrole到数据库中
	 * <param name="projectrole">需要更新的Projectrole</param>
	 * <param name="projectroleQueryCondition">附加的条件</param>
	 */
	protected int projectroleUpdateByCondition(Projectrole projectrole, ProjectroleExample projectroleQueryCondition) {
		ProjectroleMapper mapperImpl = this.getSqlSession().getMapper(ProjectroleMapper.class);
		int ret = mapperImpl.updateByExample(projectrole, projectroleQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Projectrole到数据库中
	 * <param name="projectrole">需要更新的Projectrole</param>
	 * <param name="projectroleQueryCondition">附加的条件</param>
	 */
	protected int projectroleUpdateSelectiveByCondition(Projectrole projectrole, ProjectroleExample projectroleQueryCondition) {
		ProjectroleMapper mapperImpl = this.getSqlSession().getMapper(ProjectroleMapper.class);
		int ret = mapperImpl.updateByExampleSelective(projectrole, projectroleQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="projectrole">从数据库中删除一个对象Projectrole</param>
	 * <param name="AId"></param>
	 */
	protected int projectroleDeleteByPrimaryKey(long AId) {
		ProjectroleMapper mapperImpl = this.getSqlSession().getMapper(ProjectroleMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="projectrole">从数据库中删除一个对象Projectrole</param>
	 */
	protected int projectroleDeleteByCondition(ProjectroleExample projectroleQueryCondition) {
		ProjectroleMapper mapperImpl = this.getSqlSession().getMapper(ProjectroleMapper.class);
		return mapperImpl.deleteByExample(projectroleQueryCondition);
	}
	
	/**
	 * <param name="projectrole">从数据库中查询一个对象Projectrole</param>
	 * <param name="AId"></param>
	 */
	protected Projectrole projectroleSelectByPrimaryKey(long AId) {
		ProjectroleMapper mapperImpl = this.getSqlSession().getMapper(ProjectroleMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="projectroleQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Projectrole> projectroleSelectObjects(ProjectroleExample projectroleQueryCondition) {
		ProjectroleMapper mapperImpl = this.getSqlSession().getMapper(ProjectroleMapper.class);
		return mapperImpl.selectByExample(projectroleQueryCondition);
	}
	
	/**
	 * <param name="projectroleQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Projectrole> projectroleSelectObjectsWithBLOBs(ProjectroleExample projectroleQueryCondition) {
		ProjectroleMapper mapperImpl = this.getSqlSession().getMapper(ProjectroleMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(projectroleQueryCondition);
	}
	
	/**
	 * <param name="projectroleQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int projectroleQuerySelectObjectsCount(ProjectroleExample projectroleQueryCondition) {
		ProjectroleMapper mapperImpl = this.getSqlSession().getMapper(ProjectroleMapper.class);
		return mapperImpl.countByExample(projectroleQueryCondition);
	}
	
	/**
	 * 插入一个对象Projectroleactor到数据库中
	 * <param name="Projectroleactor">需要插入的Projectroleactor</param>
	 */
	protected int projectroleactorInsert(Projectroleactor projectroleactor) {
		ProjectroleactorMapper mapperImpl = this.getSqlSession().getMapper(ProjectroleactorMapper.class);
		return mapperImpl.insertSelective(projectroleactor);
	}
	
	/**
	 * 更新一个对象Projectroleactor到数据库中
	 * <param name="projectroleactor">需要更新的Projectroleactor</param>
	 */
	protected int projectroleactorUpdate(Projectroleactor projectroleactor) {
		ProjectroleactorMapper mapperImpl = this.getSqlSession().getMapper(ProjectroleactorMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(projectroleactor);
		return ret;
	}
	
	/**
	 * 更新一个对象Projectroleactor到数据库中
	 * <param name="projectroleactor">需要更新的Projectroleactor</param>
	 */
	protected int projectroleactorUpdateSelective(Projectroleactor projectroleactor) {
		ProjectroleactorMapper mapperImpl = this.getSqlSession().getMapper(ProjectroleactorMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(projectroleactor);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Projectroleactor到数据库中
	 * <param name="projectroleactor">需要更新的Projectroleactor</param>
	 * <param name="projectroleactorQueryCondition">附加的条件</param>
	 */
	protected int projectroleactorUpdateByCondition(Projectroleactor projectroleactor, ProjectroleactorExample projectroleactorQueryCondition) {
		ProjectroleactorMapper mapperImpl = this.getSqlSession().getMapper(ProjectroleactorMapper.class);
		int ret = mapperImpl.updateByExample(projectroleactor, projectroleactorQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Projectroleactor到数据库中
	 * <param name="projectroleactor">需要更新的Projectroleactor</param>
	 * <param name="projectroleactorQueryCondition">附加的条件</param>
	 */
	protected int projectroleactorUpdateSelectiveByCondition(Projectroleactor projectroleactor, ProjectroleactorExample projectroleactorQueryCondition) {
		ProjectroleactorMapper mapperImpl = this.getSqlSession().getMapper(ProjectroleactorMapper.class);
		int ret = mapperImpl.updateByExampleSelective(projectroleactor, projectroleactorQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="projectroleactor">从数据库中删除一个对象Projectroleactor</param>
	 * <param name="AId"></param>
	 */
	protected int projectroleactorDeleteByPrimaryKey(long AId) {
		ProjectroleactorMapper mapperImpl = this.getSqlSession().getMapper(ProjectroleactorMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="projectroleactor">从数据库中删除一个对象Projectroleactor</param>
	 */
	protected int projectroleactorDeleteByCondition(ProjectroleactorExample projectroleactorQueryCondition) {
		ProjectroleactorMapper mapperImpl = this.getSqlSession().getMapper(ProjectroleactorMapper.class);
		return mapperImpl.deleteByExample(projectroleactorQueryCondition);
	}
	
	/**
	 * <param name="projectroleactor">从数据库中查询一个对象Projectroleactor</param>
	 * <param name="AId"></param>
	 */
	protected Projectroleactor projectroleactorSelectByPrimaryKey(long AId) {
		ProjectroleactorMapper mapperImpl = this.getSqlSession().getMapper(ProjectroleactorMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="projectroleactorQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Projectroleactor> projectroleactorSelectObjects(ProjectroleactorExample projectroleactorQueryCondition) {
		ProjectroleactorMapper mapperImpl = this.getSqlSession().getMapper(ProjectroleactorMapper.class);
		return mapperImpl.selectByExample(projectroleactorQueryCondition);
	}
	
	/**
	 * <param name="projectroleactorQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int projectroleactorQuerySelectObjectsCount(ProjectroleactorExample projectroleactorQueryCondition) {
		ProjectroleactorMapper mapperImpl = this.getSqlSession().getMapper(ProjectroleactorMapper.class);
		return mapperImpl.countByExample(projectroleactorQueryCondition);
	}
	
	/**
	 * 插入一个对象Projectversion到数据库中
	 * <param name="Projectversion">需要插入的Projectversion</param>
	 */
	protected int projectversionInsert(Projectversion projectversion) {
		ProjectversionMapper mapperImpl = this.getSqlSession().getMapper(ProjectversionMapper.class);
		return mapperImpl.insertSelective(projectversion);
	}
	
	/**
	 * 更新一个对象Projectversion到数据库中
	 * <param name="projectversion">需要更新的Projectversion</param>
	 */
	protected int projectversionUpdate(Projectversion projectversion) {
		ProjectversionMapper mapperImpl = this.getSqlSession().getMapper(ProjectversionMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(projectversion);
		return ret;
	}
	
	/**
	 * 更新一个对象Projectversion到数据库中
	 * <param name="projectversion">需要更新的Projectversion</param>
	 */
	protected int projectversionUpdateSelective(Projectversion projectversion) {
		ProjectversionMapper mapperImpl = this.getSqlSession().getMapper(ProjectversionMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(projectversion);
		return ret;
	}
	
	/**
	 * 更新一个对象Projectversion到数据库中
	 * <param name="projectversion">需要更新的Projectversion</param>
	 */
	public int projectversionUpdateWithBlobs(Projectversion projectversion) {
		ProjectversionMapper mapperImpl = this.getSqlSession().getMapper(ProjectversionMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(projectversion);
	}
	
	/**
	 * 根据条件更新一批对象Projectversion到数据库中
	 * <param name="projectversion">需要更新的Projectversion</param>
	 * <param name="projectversionQueryCondition">附加的条件</param>
	 */
	protected int projectversionUpdateByCondition(Projectversion projectversion, ProjectversionExample projectversionQueryCondition) {
		ProjectversionMapper mapperImpl = this.getSqlSession().getMapper(ProjectversionMapper.class);
		int ret = mapperImpl.updateByExample(projectversion, projectversionQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Projectversion到数据库中
	 * <param name="projectversion">需要更新的Projectversion</param>
	 * <param name="projectversionQueryCondition">附加的条件</param>
	 */
	protected int projectversionUpdateSelectiveByCondition(Projectversion projectversion, ProjectversionExample projectversionQueryCondition) {
		ProjectversionMapper mapperImpl = this.getSqlSession().getMapper(ProjectversionMapper.class);
		int ret = mapperImpl.updateByExampleSelective(projectversion, projectversionQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="projectversion">从数据库中删除一个对象Projectversion</param>
	 * <param name="AId"></param>
	 */
	protected int projectversionDeleteByPrimaryKey(long AId) {
		ProjectversionMapper mapperImpl = this.getSqlSession().getMapper(ProjectversionMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="projectversion">从数据库中删除一个对象Projectversion</param>
	 */
	protected int projectversionDeleteByCondition(ProjectversionExample projectversionQueryCondition) {
		ProjectversionMapper mapperImpl = this.getSqlSession().getMapper(ProjectversionMapper.class);
		return mapperImpl.deleteByExample(projectversionQueryCondition);
	}
	
	/**
	 * <param name="projectversion">从数据库中查询一个对象Projectversion</param>
	 * <param name="AId"></param>
	 */
	protected Projectversion projectversionSelectByPrimaryKey(long AId) {
		ProjectversionMapper mapperImpl = this.getSqlSession().getMapper(ProjectversionMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="projectversionQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Projectversion> projectversionSelectObjects(ProjectversionExample projectversionQueryCondition) {
		ProjectversionMapper mapperImpl = this.getSqlSession().getMapper(ProjectversionMapper.class);
		return mapperImpl.selectByExample(projectversionQueryCondition);
	}
	
	/**
	 * <param name="projectversionQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Projectversion> projectversionSelectObjectsWithBLOBs(ProjectversionExample projectversionQueryCondition) {
		ProjectversionMapper mapperImpl = this.getSqlSession().getMapper(ProjectversionMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(projectversionQueryCondition);
	}
	
	/**
	 * <param name="projectversionQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int projectversionQuerySelectObjectsCount(ProjectversionExample projectversionQueryCondition) {
		ProjectversionMapper mapperImpl = this.getSqlSession().getMapper(ProjectversionMapper.class);
		return mapperImpl.countByExample(projectversionQueryCondition);
	}
	
	/**
	 * 插入一个对象Propertydata到数据库中
	 * <param name="Propertydata">需要插入的Propertydata</param>
	 */
	protected int propertydataInsert(Propertydata propertydata) {
		PropertydataMapper mapperImpl = this.getSqlSession().getMapper(PropertydataMapper.class);
		return mapperImpl.insertSelective(propertydata);
	}
	
	/**
	 * 更新一个对象Propertydata到数据库中
	 * <param name="propertydata">需要更新的Propertydata</param>
	 */
	public int propertydataUpdateWithBlobs(Propertydata propertydata) {
		PropertydataMapper mapperImpl = this.getSqlSession().getMapper(PropertydataMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(propertydata);
	}
	
	/**
	 * 根据条件更新一批对象Propertydata到数据库中
	 * <param name="propertydata">需要更新的Propertydata</param>
	 * <param name="propertydataQueryCondition">附加的条件</param>
	 */
	protected int propertydataUpdateByCondition(Propertydata propertydata, PropertydataExample propertydataQueryCondition) {
		PropertydataMapper mapperImpl = this.getSqlSession().getMapper(PropertydataMapper.class);
		int ret = mapperImpl.updateByExample(propertydata, propertydataQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Propertydata到数据库中
	 * <param name="propertydata">需要更新的Propertydata</param>
	 * <param name="propertydataQueryCondition">附加的条件</param>
	 */
	protected int propertydataUpdateSelectiveByCondition(Propertydata propertydata, PropertydataExample propertydataQueryCondition) {
		PropertydataMapper mapperImpl = this.getSqlSession().getMapper(PropertydataMapper.class);
		int ret = mapperImpl.updateByExampleSelective(propertydata, propertydataQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="propertydata">从数据库中删除一个对象Propertydata</param>
	 * <param name="AId"></param>
	 */
	protected int propertydataDeleteByPrimaryKey(long AId) {
		PropertydataMapper mapperImpl = this.getSqlSession().getMapper(PropertydataMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="propertydata">从数据库中删除一个对象Propertydata</param>
	 */
	protected int propertydataDeleteByCondition(PropertydataExample propertydataQueryCondition) {
		PropertydataMapper mapperImpl = this.getSqlSession().getMapper(PropertydataMapper.class);
		return mapperImpl.deleteByExample(propertydataQueryCondition);
	}
	
	/**
	 * <param name="propertydata">从数据库中查询一个对象Propertydata</param>
	 * <param name="AId"></param>
	 */
	protected Propertydata propertydataSelectByPrimaryKey(long AId) {
		PropertydataMapper mapperImpl = this.getSqlSession().getMapper(PropertydataMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="propertydataQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Propertydata> propertydataSelectObjects(PropertydataExample propertydataQueryCondition) {
		PropertydataMapper mapperImpl = this.getSqlSession().getMapper(PropertydataMapper.class);
		return mapperImpl.selectByExample(propertydataQueryCondition);
	}
	
	/**
	 * <param name="propertydataQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int propertydataQuerySelectObjectsCount(PropertydataExample propertydataQueryCondition) {
		PropertydataMapper mapperImpl = this.getSqlSession().getMapper(PropertydataMapper.class);
		return mapperImpl.countByExample(propertydataQueryCondition);
	}
	
	/**
	 * 插入一个对象Propertydate到数据库中
	 * <param name="Propertydate">需要插入的Propertydate</param>
	 */
	protected int propertydateInsert(Propertydate propertydate) {
		PropertydateMapper mapperImpl = this.getSqlSession().getMapper(PropertydateMapper.class);
		return mapperImpl.insertSelective(propertydate);
	}
	
	/**
	 * 更新一个对象Propertydate到数据库中
	 * <param name="propertydate">需要更新的Propertydate</param>
	 */
	protected int propertydateUpdate(Propertydate propertydate) {
		PropertydateMapper mapperImpl = this.getSqlSession().getMapper(PropertydateMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(propertydate);
		return ret;
	}
	
	/**
	 * 更新一个对象Propertydate到数据库中
	 * <param name="propertydate">需要更新的Propertydate</param>
	 */
	protected int propertydateUpdateSelective(Propertydate propertydate) {
		PropertydateMapper mapperImpl = this.getSqlSession().getMapper(PropertydateMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(propertydate);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Propertydate到数据库中
	 * <param name="propertydate">需要更新的Propertydate</param>
	 * <param name="propertydateQueryCondition">附加的条件</param>
	 */
	protected int propertydateUpdateByCondition(Propertydate propertydate, PropertydateExample propertydateQueryCondition) {
		PropertydateMapper mapperImpl = this.getSqlSession().getMapper(PropertydateMapper.class);
		int ret = mapperImpl.updateByExample(propertydate, propertydateQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Propertydate到数据库中
	 * <param name="propertydate">需要更新的Propertydate</param>
	 * <param name="propertydateQueryCondition">附加的条件</param>
	 */
	protected int propertydateUpdateSelectiveByCondition(Propertydate propertydate, PropertydateExample propertydateQueryCondition) {
		PropertydateMapper mapperImpl = this.getSqlSession().getMapper(PropertydateMapper.class);
		int ret = mapperImpl.updateByExampleSelective(propertydate, propertydateQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="propertydate">从数据库中删除一个对象Propertydate</param>
	 * <param name="AId"></param>
	 */
	protected int propertydateDeleteByPrimaryKey(long AId) {
		PropertydateMapper mapperImpl = this.getSqlSession().getMapper(PropertydateMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="propertydate">从数据库中删除一个对象Propertydate</param>
	 */
	protected int propertydateDeleteByCondition(PropertydateExample propertydateQueryCondition) {
		PropertydateMapper mapperImpl = this.getSqlSession().getMapper(PropertydateMapper.class);
		return mapperImpl.deleteByExample(propertydateQueryCondition);
	}
	
	/**
	 * <param name="propertydate">从数据库中查询一个对象Propertydate</param>
	 * <param name="AId"></param>
	 */
	protected Propertydate propertydateSelectByPrimaryKey(long AId) {
		PropertydateMapper mapperImpl = this.getSqlSession().getMapper(PropertydateMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="propertydateQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Propertydate> propertydateSelectObjects(PropertydateExample propertydateQueryCondition) {
		PropertydateMapper mapperImpl = this.getSqlSession().getMapper(PropertydateMapper.class);
		return mapperImpl.selectByExample(propertydateQueryCondition);
	}
	
	/**
	 * <param name="propertydateQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int propertydateQuerySelectObjectsCount(PropertydateExample propertydateQueryCondition) {
		PropertydateMapper mapperImpl = this.getSqlSession().getMapper(PropertydateMapper.class);
		return mapperImpl.countByExample(propertydateQueryCondition);
	}
	
	/**
	 * 插入一个对象Propertydecimal到数据库中
	 * <param name="Propertydecimal">需要插入的Propertydecimal</param>
	 */
	protected int propertydecimalInsert(Propertydecimal propertydecimal) {
		PropertydecimalMapper mapperImpl = this.getSqlSession().getMapper(PropertydecimalMapper.class);
		return mapperImpl.insertSelective(propertydecimal);
	}
	
	/**
	 * 更新一个对象Propertydecimal到数据库中
	 * <param name="propertydecimal">需要更新的Propertydecimal</param>
	 */
	protected int propertydecimalUpdate(Propertydecimal propertydecimal) {
		PropertydecimalMapper mapperImpl = this.getSqlSession().getMapper(PropertydecimalMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(propertydecimal);
		return ret;
	}
	
	/**
	 * 更新一个对象Propertydecimal到数据库中
	 * <param name="propertydecimal">需要更新的Propertydecimal</param>
	 */
	protected int propertydecimalUpdateSelective(Propertydecimal propertydecimal) {
		PropertydecimalMapper mapperImpl = this.getSqlSession().getMapper(PropertydecimalMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(propertydecimal);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Propertydecimal到数据库中
	 * <param name="propertydecimal">需要更新的Propertydecimal</param>
	 * <param name="propertydecimalQueryCondition">附加的条件</param>
	 */
	protected int propertydecimalUpdateByCondition(Propertydecimal propertydecimal, PropertydecimalExample propertydecimalQueryCondition) {
		PropertydecimalMapper mapperImpl = this.getSqlSession().getMapper(PropertydecimalMapper.class);
		int ret = mapperImpl.updateByExample(propertydecimal, propertydecimalQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Propertydecimal到数据库中
	 * <param name="propertydecimal">需要更新的Propertydecimal</param>
	 * <param name="propertydecimalQueryCondition">附加的条件</param>
	 */
	protected int propertydecimalUpdateSelectiveByCondition(Propertydecimal propertydecimal, PropertydecimalExample propertydecimalQueryCondition) {
		PropertydecimalMapper mapperImpl = this.getSqlSession().getMapper(PropertydecimalMapper.class);
		int ret = mapperImpl.updateByExampleSelective(propertydecimal, propertydecimalQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="propertydecimal">从数据库中删除一个对象Propertydecimal</param>
	 * <param name="AId"></param>
	 */
	protected int propertydecimalDeleteByPrimaryKey(long AId) {
		PropertydecimalMapper mapperImpl = this.getSqlSession().getMapper(PropertydecimalMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="propertydecimal">从数据库中删除一个对象Propertydecimal</param>
	 */
	protected int propertydecimalDeleteByCondition(PropertydecimalExample propertydecimalQueryCondition) {
		PropertydecimalMapper mapperImpl = this.getSqlSession().getMapper(PropertydecimalMapper.class);
		return mapperImpl.deleteByExample(propertydecimalQueryCondition);
	}
	
	/**
	 * <param name="propertydecimal">从数据库中查询一个对象Propertydecimal</param>
	 * <param name="AId"></param>
	 */
	protected Propertydecimal propertydecimalSelectByPrimaryKey(long AId) {
		PropertydecimalMapper mapperImpl = this.getSqlSession().getMapper(PropertydecimalMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="propertydecimalQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Propertydecimal> propertydecimalSelectObjects(PropertydecimalExample propertydecimalQueryCondition) {
		PropertydecimalMapper mapperImpl = this.getSqlSession().getMapper(PropertydecimalMapper.class);
		return mapperImpl.selectByExample(propertydecimalQueryCondition);
	}
	
	/**
	 * <param name="propertydecimalQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int propertydecimalQuerySelectObjectsCount(PropertydecimalExample propertydecimalQueryCondition) {
		PropertydecimalMapper mapperImpl = this.getSqlSession().getMapper(PropertydecimalMapper.class);
		return mapperImpl.countByExample(propertydecimalQueryCondition);
	}
	
	/**
	 * 插入一个对象Propertyentry到数据库中
	 * <param name="Propertyentry">需要插入的Propertyentry</param>
	 */
	protected int propertyentryInsert(Propertyentry propertyentry) {
		PropertyentryMapper mapperImpl = this.getSqlSession().getMapper(PropertyentryMapper.class);
		return mapperImpl.insertSelective(propertyentry);
	}
	
	/**
	 * 更新一个对象Propertyentry到数据库中
	 * <param name="propertyentry">需要更新的Propertyentry</param>
	 */
	protected int propertyentryUpdate(Propertyentry propertyentry) {
		PropertyentryMapper mapperImpl = this.getSqlSession().getMapper(PropertyentryMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(propertyentry);
		return ret;
	}
	
	/**
	 * 更新一个对象Propertyentry到数据库中
	 * <param name="propertyentry">需要更新的Propertyentry</param>
	 */
	protected int propertyentryUpdateSelective(Propertyentry propertyentry) {
		PropertyentryMapper mapperImpl = this.getSqlSession().getMapper(PropertyentryMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(propertyentry);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Propertyentry到数据库中
	 * <param name="propertyentry">需要更新的Propertyentry</param>
	 * <param name="propertyentryQueryCondition">附加的条件</param>
	 */
	protected int propertyentryUpdateByCondition(Propertyentry propertyentry, PropertyentryExample propertyentryQueryCondition) {
		PropertyentryMapper mapperImpl = this.getSqlSession().getMapper(PropertyentryMapper.class);
		int ret = mapperImpl.updateByExample(propertyentry, propertyentryQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Propertyentry到数据库中
	 * <param name="propertyentry">需要更新的Propertyentry</param>
	 * <param name="propertyentryQueryCondition">附加的条件</param>
	 */
	protected int propertyentryUpdateSelectiveByCondition(Propertyentry propertyentry, PropertyentryExample propertyentryQueryCondition) {
		PropertyentryMapper mapperImpl = this.getSqlSession().getMapper(PropertyentryMapper.class);
		int ret = mapperImpl.updateByExampleSelective(propertyentry, propertyentryQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="propertyentry">从数据库中删除一个对象Propertyentry</param>
	 * <param name="AId"></param>
	 */
	protected int propertyentryDeleteByPrimaryKey(long AId) {
		PropertyentryMapper mapperImpl = this.getSqlSession().getMapper(PropertyentryMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="propertyentry">从数据库中删除一个对象Propertyentry</param>
	 */
	protected int propertyentryDeleteByCondition(PropertyentryExample propertyentryQueryCondition) {
		PropertyentryMapper mapperImpl = this.getSqlSession().getMapper(PropertyentryMapper.class);
		return mapperImpl.deleteByExample(propertyentryQueryCondition);
	}
	
	/**
	 * <param name="propertyentry">从数据库中查询一个对象Propertyentry</param>
	 * <param name="AId"></param>
	 */
	protected Propertyentry propertyentrySelectByPrimaryKey(long AId) {
		PropertyentryMapper mapperImpl = this.getSqlSession().getMapper(PropertyentryMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="propertyentryQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Propertyentry> propertyentrySelectObjects(PropertyentryExample propertyentryQueryCondition) {
		PropertyentryMapper mapperImpl = this.getSqlSession().getMapper(PropertyentryMapper.class);
		return mapperImpl.selectByExample(propertyentryQueryCondition);
	}
	
	/**
	 * <param name="propertyentryQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int propertyentryQuerySelectObjectsCount(PropertyentryExample propertyentryQueryCondition) {
		PropertyentryMapper mapperImpl = this.getSqlSession().getMapper(PropertyentryMapper.class);
		return mapperImpl.countByExample(propertyentryQueryCondition);
	}
	
	/**
	 * 插入一个对象Propertynumber到数据库中
	 * <param name="Propertynumber">需要插入的Propertynumber</param>
	 */
	protected int propertynumberInsert(Propertynumber propertynumber) {
		PropertynumberMapper mapperImpl = this.getSqlSession().getMapper(PropertynumberMapper.class);
		return mapperImpl.insertSelective(propertynumber);
	}
	
	/**
	 * 更新一个对象Propertynumber到数据库中
	 * <param name="propertynumber">需要更新的Propertynumber</param>
	 */
	protected int propertynumberUpdate(Propertynumber propertynumber) {
		PropertynumberMapper mapperImpl = this.getSqlSession().getMapper(PropertynumberMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(propertynumber);
		return ret;
	}
	
	/**
	 * 更新一个对象Propertynumber到数据库中
	 * <param name="propertynumber">需要更新的Propertynumber</param>
	 */
	protected int propertynumberUpdateSelective(Propertynumber propertynumber) {
		PropertynumberMapper mapperImpl = this.getSqlSession().getMapper(PropertynumberMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(propertynumber);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Propertynumber到数据库中
	 * <param name="propertynumber">需要更新的Propertynumber</param>
	 * <param name="propertynumberQueryCondition">附加的条件</param>
	 */
	protected int propertynumberUpdateByCondition(Propertynumber propertynumber, PropertynumberExample propertynumberQueryCondition) {
		PropertynumberMapper mapperImpl = this.getSqlSession().getMapper(PropertynumberMapper.class);
		int ret = mapperImpl.updateByExample(propertynumber, propertynumberQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Propertynumber到数据库中
	 * <param name="propertynumber">需要更新的Propertynumber</param>
	 * <param name="propertynumberQueryCondition">附加的条件</param>
	 */
	protected int propertynumberUpdateSelectiveByCondition(Propertynumber propertynumber, PropertynumberExample propertynumberQueryCondition) {
		PropertynumberMapper mapperImpl = this.getSqlSession().getMapper(PropertynumberMapper.class);
		int ret = mapperImpl.updateByExampleSelective(propertynumber, propertynumberQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="propertynumber">从数据库中删除一个对象Propertynumber</param>
	 * <param name="AId"></param>
	 */
	protected int propertynumberDeleteByPrimaryKey(long AId) {
		PropertynumberMapper mapperImpl = this.getSqlSession().getMapper(PropertynumberMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="propertynumber">从数据库中删除一个对象Propertynumber</param>
	 */
	protected int propertynumberDeleteByCondition(PropertynumberExample propertynumberQueryCondition) {
		PropertynumberMapper mapperImpl = this.getSqlSession().getMapper(PropertynumberMapper.class);
		return mapperImpl.deleteByExample(propertynumberQueryCondition);
	}
	
	/**
	 * <param name="propertynumber">从数据库中查询一个对象Propertynumber</param>
	 * <param name="AId"></param>
	 */
	protected Propertynumber propertynumberSelectByPrimaryKey(long AId) {
		PropertynumberMapper mapperImpl = this.getSqlSession().getMapper(PropertynumberMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="propertynumberQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Propertynumber> propertynumberSelectObjects(PropertynumberExample propertynumberQueryCondition) {
		PropertynumberMapper mapperImpl = this.getSqlSession().getMapper(PropertynumberMapper.class);
		return mapperImpl.selectByExample(propertynumberQueryCondition);
	}
	
	/**
	 * <param name="propertynumberQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int propertynumberQuerySelectObjectsCount(PropertynumberExample propertynumberQueryCondition) {
		PropertynumberMapper mapperImpl = this.getSqlSession().getMapper(PropertynumberMapper.class);
		return mapperImpl.countByExample(propertynumberQueryCondition);
	}
	
	/**
	 * 插入一个对象Propertystring到数据库中
	 * <param name="Propertystring">需要插入的Propertystring</param>
	 */
	protected int propertystringInsert(Propertystring propertystring) {
		PropertystringMapper mapperImpl = this.getSqlSession().getMapper(PropertystringMapper.class);
		return mapperImpl.insertSelective(propertystring);
	}
	
	/**
	 * 更新一个对象Propertystring到数据库中
	 * <param name="propertystring">需要更新的Propertystring</param>
	 */
	public int propertystringUpdateWithBlobs(Propertystring propertystring) {
		PropertystringMapper mapperImpl = this.getSqlSession().getMapper(PropertystringMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(propertystring);
	}
	
	/**
	 * 根据条件更新一批对象Propertystring到数据库中
	 * <param name="propertystring">需要更新的Propertystring</param>
	 * <param name="propertystringQueryCondition">附加的条件</param>
	 */
	protected int propertystringUpdateByCondition(Propertystring propertystring, PropertystringExample propertystringQueryCondition) {
		PropertystringMapper mapperImpl = this.getSqlSession().getMapper(PropertystringMapper.class);
		int ret = mapperImpl.updateByExample(propertystring, propertystringQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Propertystring到数据库中
	 * <param name="propertystring">需要更新的Propertystring</param>
	 * <param name="propertystringQueryCondition">附加的条件</param>
	 */
	protected int propertystringUpdateSelectiveByCondition(Propertystring propertystring, PropertystringExample propertystringQueryCondition) {
		PropertystringMapper mapperImpl = this.getSqlSession().getMapper(PropertystringMapper.class);
		int ret = mapperImpl.updateByExampleSelective(propertystring, propertystringQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="propertystring">从数据库中删除一个对象Propertystring</param>
	 * <param name="AId"></param>
	 */
	protected int propertystringDeleteByPrimaryKey(long AId) {
		PropertystringMapper mapperImpl = this.getSqlSession().getMapper(PropertystringMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="propertystring">从数据库中删除一个对象Propertystring</param>
	 */
	protected int propertystringDeleteByCondition(PropertystringExample propertystringQueryCondition) {
		PropertystringMapper mapperImpl = this.getSqlSession().getMapper(PropertystringMapper.class);
		return mapperImpl.deleteByExample(propertystringQueryCondition);
	}
	
	/**
	 * <param name="propertystring">从数据库中查询一个对象Propertystring</param>
	 * <param name="AId"></param>
	 */
	protected Propertystring propertystringSelectByPrimaryKey(long AId) {
		PropertystringMapper mapperImpl = this.getSqlSession().getMapper(PropertystringMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="propertystringQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Propertystring> propertystringSelectObjects(PropertystringExample propertystringQueryCondition) {
		PropertystringMapper mapperImpl = this.getSqlSession().getMapper(PropertystringMapper.class);
		return mapperImpl.selectByExample(propertystringQueryCondition);
	}
	
	/**
	 * <param name="propertystringQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Propertystring> propertystringSelectObjectsWithBLOBs(PropertystringExample propertystringQueryCondition) {
		PropertystringMapper mapperImpl = this.getSqlSession().getMapper(PropertystringMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(propertystringQueryCondition);
	}
	
	/**
	 * <param name="propertystringQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int propertystringQuerySelectObjectsCount(PropertystringExample propertystringQueryCondition) {
		PropertystringMapper mapperImpl = this.getSqlSession().getMapper(PropertystringMapper.class);
		return mapperImpl.countByExample(propertystringQueryCondition);
	}
	
	/**
	 * 插入一个对象Propertytext到数据库中
	 * <param name="Propertytext">需要插入的Propertytext</param>
	 */
	protected int propertytextInsert(Propertytext propertytext) {
		PropertytextMapper mapperImpl = this.getSqlSession().getMapper(PropertytextMapper.class);
		return mapperImpl.insertSelective(propertytext);
	}
	
	/**
	 * 更新一个对象Propertytext到数据库中
	 * <param name="propertytext">需要更新的Propertytext</param>
	 */
	public int propertytextUpdateWithBlobs(Propertytext propertytext) {
		PropertytextMapper mapperImpl = this.getSqlSession().getMapper(PropertytextMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(propertytext);
	}
	
	/**
	 * 根据条件更新一批对象Propertytext到数据库中
	 * <param name="propertytext">需要更新的Propertytext</param>
	 * <param name="propertytextQueryCondition">附加的条件</param>
	 */
	protected int propertytextUpdateByCondition(Propertytext propertytext, PropertytextExample propertytextQueryCondition) {
		PropertytextMapper mapperImpl = this.getSqlSession().getMapper(PropertytextMapper.class);
		int ret = mapperImpl.updateByExample(propertytext, propertytextQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Propertytext到数据库中
	 * <param name="propertytext">需要更新的Propertytext</param>
	 * <param name="propertytextQueryCondition">附加的条件</param>
	 */
	protected int propertytextUpdateSelectiveByCondition(Propertytext propertytext, PropertytextExample propertytextQueryCondition) {
		PropertytextMapper mapperImpl = this.getSqlSession().getMapper(PropertytextMapper.class);
		int ret = mapperImpl.updateByExampleSelective(propertytext, propertytextQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="propertytext">从数据库中删除一个对象Propertytext</param>
	 * <param name="AId"></param>
	 */
	protected int propertytextDeleteByPrimaryKey(long AId) {
		PropertytextMapper mapperImpl = this.getSqlSession().getMapper(PropertytextMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="propertytext">从数据库中删除一个对象Propertytext</param>
	 */
	protected int propertytextDeleteByCondition(PropertytextExample propertytextQueryCondition) {
		PropertytextMapper mapperImpl = this.getSqlSession().getMapper(PropertytextMapper.class);
		return mapperImpl.deleteByExample(propertytextQueryCondition);
	}
	
	/**
	 * <param name="propertytext">从数据库中查询一个对象Propertytext</param>
	 * <param name="AId"></param>
	 */
	protected Propertytext propertytextSelectByPrimaryKey(long AId) {
		PropertytextMapper mapperImpl = this.getSqlSession().getMapper(PropertytextMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="propertytextQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Propertytext> propertytextSelectObjects(PropertytextExample propertytextQueryCondition) {
		PropertytextMapper mapperImpl = this.getSqlSession().getMapper(PropertytextMapper.class);
		return mapperImpl.selectByExample(propertytextQueryCondition);
	}
	
	/**
	 * <param name="propertytextQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Propertytext> propertytextSelectObjectsWithBLOBs(PropertytextExample propertytextQueryCondition) {
		PropertytextMapper mapperImpl = this.getSqlSession().getMapper(PropertytextMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(propertytextQueryCondition);
	}
	
	/**
	 * <param name="propertytextQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int propertytextQuerySelectObjectsCount(PropertytextExample propertytextQueryCondition) {
		PropertytextMapper mapperImpl = this.getSqlSession().getMapper(PropertytextMapper.class);
		return mapperImpl.countByExample(propertytextQueryCondition);
	}
	
	/**
	 * 插入一个对象QrtzCalendars到数据库中
	 * <param name="QrtzCalendars">需要插入的QrtzCalendars</param>
	 */
	protected int qrtzCalendarsInsert(QrtzCalendars qrtzCalendars) {
		QrtzCalendarsMapper mapperImpl = this.getSqlSession().getMapper(QrtzCalendarsMapper.class);
		return mapperImpl.insertSelective(qrtzCalendars);
	}
	
	/**
	 * 更新一个对象QrtzCalendars到数据库中
	 * <param name="qrtzCalendars">需要更新的QrtzCalendars</param>
	 */
	protected int qrtzCalendarsUpdate(QrtzCalendars qrtzCalendars) {
		QrtzCalendarsMapper mapperImpl = this.getSqlSession().getMapper(QrtzCalendarsMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(qrtzCalendars);
		return ret;
	}
	
	/**
	 * 更新一个对象QrtzCalendars到数据库中
	 * <param name="qrtzCalendars">需要更新的QrtzCalendars</param>
	 */
	protected int qrtzCalendarsUpdateSelective(QrtzCalendars qrtzCalendars) {
		QrtzCalendarsMapper mapperImpl = this.getSqlSession().getMapper(QrtzCalendarsMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(qrtzCalendars);
		return ret;
	}
	
	/**
	 * 更新一个对象QrtzCalendars到数据库中
	 * <param name="qrtzCalendars">需要更新的QrtzCalendars</param>
	 */
	public int qrtzCalendarsUpdateWithBlobs(QrtzCalendars qrtzCalendars) {
		QrtzCalendarsMapper mapperImpl = this.getSqlSession().getMapper(QrtzCalendarsMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(qrtzCalendars);
	}
	
	/**
	 * 根据条件更新一批对象QrtzCalendars到数据库中
	 * <param name="qrtzCalendars">需要更新的QrtzCalendars</param>
	 * <param name="qrtzCalendarsQueryCondition">附加的条件</param>
	 */
	protected int qrtzCalendarsUpdateByCondition(QrtzCalendars qrtzCalendars, QrtzCalendarsExample qrtzCalendarsQueryCondition) {
		QrtzCalendarsMapper mapperImpl = this.getSqlSession().getMapper(QrtzCalendarsMapper.class);
		int ret = mapperImpl.updateByExample(qrtzCalendars, qrtzCalendarsQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息QrtzCalendars到数据库中
	 * <param name="qrtzCalendars">需要更新的QrtzCalendars</param>
	 * <param name="qrtzCalendarsQueryCondition">附加的条件</param>
	 */
	protected int qrtzCalendarsUpdateSelectiveByCondition(QrtzCalendars qrtzCalendars, QrtzCalendarsExample qrtzCalendarsQueryCondition) {
		QrtzCalendarsMapper mapperImpl = this.getSqlSession().getMapper(QrtzCalendarsMapper.class);
		int ret = mapperImpl.updateByExampleSelective(qrtzCalendars, qrtzCalendarsQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="qrtzCalendars">从数据库中删除一个对象QrtzCalendars</param>
	 * <param name="ACalendarName"></param>
	 */
	protected int qrtzCalendarsDeleteByPrimaryKey(String ACalendarName) {
		QrtzCalendarsMapper mapperImpl = this.getSqlSession().getMapper(QrtzCalendarsMapper.class);
		return mapperImpl.deleteByPrimaryKey(ACalendarName);
	}
	
	/**
	 * <param name="qrtzCalendars">从数据库中删除一个对象QrtzCalendars</param>
	 */
	protected int qrtzCalendarsDeleteByCondition(QrtzCalendarsExample qrtzCalendarsQueryCondition) {
		QrtzCalendarsMapper mapperImpl = this.getSqlSession().getMapper(QrtzCalendarsMapper.class);
		return mapperImpl.deleteByExample(qrtzCalendarsQueryCondition);
	}
	
	/**
	 * <param name="qrtzCalendars">从数据库中查询一个对象QrtzCalendars</param>
	 * <param name="ACalendarName"></param>
	 */
	protected QrtzCalendars qrtzCalendarsSelectByPrimaryKey(String ACalendarName) {
		QrtzCalendarsMapper mapperImpl = this.getSqlSession().getMapper(QrtzCalendarsMapper.class);
		return mapperImpl.selectByPrimaryKey(ACalendarName);
	}
	
	/**
	 * <param name="qrtzCalendarsQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<QrtzCalendars> qrtzCalendarsSelectObjects(QrtzCalendarsExample qrtzCalendarsQueryCondition) {
		QrtzCalendarsMapper mapperImpl = this.getSqlSession().getMapper(QrtzCalendarsMapper.class);
		return mapperImpl.selectByExample(qrtzCalendarsQueryCondition);
	}
	
	/**
	 * <param name="qrtzCalendarsQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<QrtzCalendars> qrtzCalendarsSelectObjectsWithBLOBs(QrtzCalendarsExample qrtzCalendarsQueryCondition) {
		QrtzCalendarsMapper mapperImpl = this.getSqlSession().getMapper(QrtzCalendarsMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(qrtzCalendarsQueryCondition);
	}
	
	/**
	 * <param name="qrtzCalendarsQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int qrtzCalendarsQuerySelectObjectsCount(QrtzCalendarsExample qrtzCalendarsQueryCondition) {
		QrtzCalendarsMapper mapperImpl = this.getSqlSession().getMapper(QrtzCalendarsMapper.class);
		return mapperImpl.countByExample(qrtzCalendarsQueryCondition);
	}
	
	/**
	 * 插入一个对象QrtzCronTriggers到数据库中
	 * <param name="QrtzCronTriggers">需要插入的QrtzCronTriggers</param>
	 */
	protected int qrtzCronTriggersInsert(QrtzCronTriggers qrtzCronTriggers) {
		QrtzCronTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzCronTriggersMapper.class);
		return mapperImpl.insertSelective(qrtzCronTriggers);
	}
	
	/**
	 * 更新一个对象QrtzCronTriggers到数据库中
	 * <param name="qrtzCronTriggers">需要更新的QrtzCronTriggers</param>
	 */
	protected int qrtzCronTriggersUpdate(QrtzCronTriggers qrtzCronTriggers) {
		QrtzCronTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzCronTriggersMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(qrtzCronTriggers);
		return ret;
	}
	
	/**
	 * 更新一个对象QrtzCronTriggers到数据库中
	 * <param name="qrtzCronTriggers">需要更新的QrtzCronTriggers</param>
	 */
	protected int qrtzCronTriggersUpdateSelective(QrtzCronTriggers qrtzCronTriggers) {
		QrtzCronTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzCronTriggersMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(qrtzCronTriggers);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象QrtzCronTriggers到数据库中
	 * <param name="qrtzCronTriggers">需要更新的QrtzCronTriggers</param>
	 * <param name="qrtzCronTriggersQueryCondition">附加的条件</param>
	 */
	protected int qrtzCronTriggersUpdateByCondition(QrtzCronTriggers qrtzCronTriggers, QrtzCronTriggersExample qrtzCronTriggersQueryCondition) {
		QrtzCronTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzCronTriggersMapper.class);
		int ret = mapperImpl.updateByExample(qrtzCronTriggers, qrtzCronTriggersQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息QrtzCronTriggers到数据库中
	 * <param name="qrtzCronTriggers">需要更新的QrtzCronTriggers</param>
	 * <param name="qrtzCronTriggersQueryCondition">附加的条件</param>
	 */
	protected int qrtzCronTriggersUpdateSelectiveByCondition(QrtzCronTriggers qrtzCronTriggers, QrtzCronTriggersExample qrtzCronTriggersQueryCondition) {
		QrtzCronTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzCronTriggersMapper.class);
		int ret = mapperImpl.updateByExampleSelective(qrtzCronTriggers, qrtzCronTriggersQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="qrtzCronTriggers">从数据库中删除一个对象QrtzCronTriggers</param>
	 * <param name="AId"></param>
	 */
	protected int qrtzCronTriggersDeleteByPrimaryKey(long AId) {
		QrtzCronTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzCronTriggersMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="qrtzCronTriggers">从数据库中删除一个对象QrtzCronTriggers</param>
	 */
	protected int qrtzCronTriggersDeleteByCondition(QrtzCronTriggersExample qrtzCronTriggersQueryCondition) {
		QrtzCronTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzCronTriggersMapper.class);
		return mapperImpl.deleteByExample(qrtzCronTriggersQueryCondition);
	}
	
	/**
	 * <param name="qrtzCronTriggers">从数据库中查询一个对象QrtzCronTriggers</param>
	 * <param name="AId"></param>
	 */
	protected QrtzCronTriggers qrtzCronTriggersSelectByPrimaryKey(long AId) {
		QrtzCronTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzCronTriggersMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="qrtzCronTriggersQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<QrtzCronTriggers> qrtzCronTriggersSelectObjects(QrtzCronTriggersExample qrtzCronTriggersQueryCondition) {
		QrtzCronTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzCronTriggersMapper.class);
		return mapperImpl.selectByExample(qrtzCronTriggersQueryCondition);
	}
	
	/**
	 * <param name="qrtzCronTriggersQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int qrtzCronTriggersQuerySelectObjectsCount(QrtzCronTriggersExample qrtzCronTriggersQueryCondition) {
		QrtzCronTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzCronTriggersMapper.class);
		return mapperImpl.countByExample(qrtzCronTriggersQueryCondition);
	}
	
	/**
	 * 插入一个对象QrtzFiredTriggers到数据库中
	 * <param name="QrtzFiredTriggers">需要插入的QrtzFiredTriggers</param>
	 */
	protected int qrtzFiredTriggersInsert(QrtzFiredTriggers qrtzFiredTriggers) {
		QrtzFiredTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzFiredTriggersMapper.class);
		return mapperImpl.insertSelective(qrtzFiredTriggers);
	}
	
	/**
	 * 更新一个对象QrtzFiredTriggers到数据库中
	 * <param name="qrtzFiredTriggers">需要更新的QrtzFiredTriggers</param>
	 */
	protected int qrtzFiredTriggersUpdate(QrtzFiredTriggers qrtzFiredTriggers) {
		QrtzFiredTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzFiredTriggersMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(qrtzFiredTriggers);
		return ret;
	}
	
	/**
	 * 更新一个对象QrtzFiredTriggers到数据库中
	 * <param name="qrtzFiredTriggers">需要更新的QrtzFiredTriggers</param>
	 */
	protected int qrtzFiredTriggersUpdateSelective(QrtzFiredTriggers qrtzFiredTriggers) {
		QrtzFiredTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzFiredTriggersMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(qrtzFiredTriggers);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象QrtzFiredTriggers到数据库中
	 * <param name="qrtzFiredTriggers">需要更新的QrtzFiredTriggers</param>
	 * <param name="qrtzFiredTriggersQueryCondition">附加的条件</param>
	 */
	protected int qrtzFiredTriggersUpdateByCondition(QrtzFiredTriggers qrtzFiredTriggers, QrtzFiredTriggersExample qrtzFiredTriggersQueryCondition) {
		QrtzFiredTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzFiredTriggersMapper.class);
		int ret = mapperImpl.updateByExample(qrtzFiredTriggers, qrtzFiredTriggersQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息QrtzFiredTriggers到数据库中
	 * <param name="qrtzFiredTriggers">需要更新的QrtzFiredTriggers</param>
	 * <param name="qrtzFiredTriggersQueryCondition">附加的条件</param>
	 */
	protected int qrtzFiredTriggersUpdateSelectiveByCondition(QrtzFiredTriggers qrtzFiredTriggers, QrtzFiredTriggersExample qrtzFiredTriggersQueryCondition) {
		QrtzFiredTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzFiredTriggersMapper.class);
		int ret = mapperImpl.updateByExampleSelective(qrtzFiredTriggers, qrtzFiredTriggersQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="qrtzFiredTriggers">从数据库中删除一个对象QrtzFiredTriggers</param>
	 * <param name="AEntryId"></param>
	 */
	protected int qrtzFiredTriggersDeleteByPrimaryKey(String AEntryId) {
		QrtzFiredTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzFiredTriggersMapper.class);
		return mapperImpl.deleteByPrimaryKey(AEntryId);
	}
	
	/**
	 * <param name="qrtzFiredTriggers">从数据库中删除一个对象QrtzFiredTriggers</param>
	 */
	protected int qrtzFiredTriggersDeleteByCondition(QrtzFiredTriggersExample qrtzFiredTriggersQueryCondition) {
		QrtzFiredTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzFiredTriggersMapper.class);
		return mapperImpl.deleteByExample(qrtzFiredTriggersQueryCondition);
	}
	
	/**
	 * <param name="qrtzFiredTriggers">从数据库中查询一个对象QrtzFiredTriggers</param>
	 * <param name="AEntryId"></param>
	 */
	protected QrtzFiredTriggers qrtzFiredTriggersSelectByPrimaryKey(String AEntryId) {
		QrtzFiredTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzFiredTriggersMapper.class);
		return mapperImpl.selectByPrimaryKey(AEntryId);
	}
	
	/**
	 * <param name="qrtzFiredTriggersQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<QrtzFiredTriggers> qrtzFiredTriggersSelectObjects(QrtzFiredTriggersExample qrtzFiredTriggersQueryCondition) {
		QrtzFiredTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzFiredTriggersMapper.class);
		return mapperImpl.selectByExample(qrtzFiredTriggersQueryCondition);
	}
	
	/**
	 * <param name="qrtzFiredTriggersQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int qrtzFiredTriggersQuerySelectObjectsCount(QrtzFiredTriggersExample qrtzFiredTriggersQueryCondition) {
		QrtzFiredTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzFiredTriggersMapper.class);
		return mapperImpl.countByExample(qrtzFiredTriggersQueryCondition);
	}
	
	/**
	 * 插入一个对象QrtzJobDetails到数据库中
	 * <param name="QrtzJobDetails">需要插入的QrtzJobDetails</param>
	 */
	protected int qrtzJobDetailsInsert(QrtzJobDetails qrtzJobDetails) {
		QrtzJobDetailsMapper mapperImpl = this.getSqlSession().getMapper(QrtzJobDetailsMapper.class);
		return mapperImpl.insertSelective(qrtzJobDetails);
	}
	
	/**
	 * 更新一个对象QrtzJobDetails到数据库中
	 * <param name="qrtzJobDetails">需要更新的QrtzJobDetails</param>
	 */
	protected int qrtzJobDetailsUpdate(QrtzJobDetails qrtzJobDetails) {
		QrtzJobDetailsMapper mapperImpl = this.getSqlSession().getMapper(QrtzJobDetailsMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(qrtzJobDetails);
		return ret;
	}
	
	/**
	 * 更新一个对象QrtzJobDetails到数据库中
	 * <param name="qrtzJobDetails">需要更新的QrtzJobDetails</param>
	 */
	protected int qrtzJobDetailsUpdateSelective(QrtzJobDetails qrtzJobDetails) {
		QrtzJobDetailsMapper mapperImpl = this.getSqlSession().getMapper(QrtzJobDetailsMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(qrtzJobDetails);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象QrtzJobDetails到数据库中
	 * <param name="qrtzJobDetails">需要更新的QrtzJobDetails</param>
	 * <param name="qrtzJobDetailsQueryCondition">附加的条件</param>
	 */
	protected int qrtzJobDetailsUpdateByCondition(QrtzJobDetails qrtzJobDetails, QrtzJobDetailsExample qrtzJobDetailsQueryCondition) {
		QrtzJobDetailsMapper mapperImpl = this.getSqlSession().getMapper(QrtzJobDetailsMapper.class);
		int ret = mapperImpl.updateByExample(qrtzJobDetails, qrtzJobDetailsQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息QrtzJobDetails到数据库中
	 * <param name="qrtzJobDetails">需要更新的QrtzJobDetails</param>
	 * <param name="qrtzJobDetailsQueryCondition">附加的条件</param>
	 */
	protected int qrtzJobDetailsUpdateSelectiveByCondition(QrtzJobDetails qrtzJobDetails, QrtzJobDetailsExample qrtzJobDetailsQueryCondition) {
		QrtzJobDetailsMapper mapperImpl = this.getSqlSession().getMapper(QrtzJobDetailsMapper.class);
		int ret = mapperImpl.updateByExampleSelective(qrtzJobDetails, qrtzJobDetailsQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="qrtzJobDetails">从数据库中删除一个对象QrtzJobDetails</param>
	 * <param name="AId"></param>
	 */
	protected int qrtzJobDetailsDeleteByPrimaryKey(long AId) {
		QrtzJobDetailsMapper mapperImpl = this.getSqlSession().getMapper(QrtzJobDetailsMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="qrtzJobDetails">从数据库中删除一个对象QrtzJobDetails</param>
	 */
	protected int qrtzJobDetailsDeleteByCondition(QrtzJobDetailsExample qrtzJobDetailsQueryCondition) {
		QrtzJobDetailsMapper mapperImpl = this.getSqlSession().getMapper(QrtzJobDetailsMapper.class);
		return mapperImpl.deleteByExample(qrtzJobDetailsQueryCondition);
	}
	
	/**
	 * <param name="qrtzJobDetails">从数据库中查询一个对象QrtzJobDetails</param>
	 * <param name="AId"></param>
	 */
	protected QrtzJobDetails qrtzJobDetailsSelectByPrimaryKey(long AId) {
		QrtzJobDetailsMapper mapperImpl = this.getSqlSession().getMapper(QrtzJobDetailsMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="qrtzJobDetailsQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<QrtzJobDetails> qrtzJobDetailsSelectObjects(QrtzJobDetailsExample qrtzJobDetailsQueryCondition) {
		QrtzJobDetailsMapper mapperImpl = this.getSqlSession().getMapper(QrtzJobDetailsMapper.class);
		return mapperImpl.selectByExample(qrtzJobDetailsQueryCondition);
	}
	
	/**
	 * <param name="qrtzJobDetailsQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int qrtzJobDetailsQuerySelectObjectsCount(QrtzJobDetailsExample qrtzJobDetailsQueryCondition) {
		QrtzJobDetailsMapper mapperImpl = this.getSqlSession().getMapper(QrtzJobDetailsMapper.class);
		return mapperImpl.countByExample(qrtzJobDetailsQueryCondition);
	}
	
	/**
	 * 插入一个对象QrtzJobListeners到数据库中
	 * <param name="QrtzJobListeners">需要插入的QrtzJobListeners</param>
	 */
	protected int qrtzJobListenersInsert(QrtzJobListeners qrtzJobListeners) {
		QrtzJobListenersMapper mapperImpl = this.getSqlSession().getMapper(QrtzJobListenersMapper.class);
		return mapperImpl.insertSelective(qrtzJobListeners);
	}
	
	/**
	 * 更新一个对象QrtzJobListeners到数据库中
	 * <param name="qrtzJobListeners">需要更新的QrtzJobListeners</param>
	 */
	protected int qrtzJobListenersUpdate(QrtzJobListeners qrtzJobListeners) {
		QrtzJobListenersMapper mapperImpl = this.getSqlSession().getMapper(QrtzJobListenersMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(qrtzJobListeners);
		return ret;
	}
	
	/**
	 * 更新一个对象QrtzJobListeners到数据库中
	 * <param name="qrtzJobListeners">需要更新的QrtzJobListeners</param>
	 */
	protected int qrtzJobListenersUpdateSelective(QrtzJobListeners qrtzJobListeners) {
		QrtzJobListenersMapper mapperImpl = this.getSqlSession().getMapper(QrtzJobListenersMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(qrtzJobListeners);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象QrtzJobListeners到数据库中
	 * <param name="qrtzJobListeners">需要更新的QrtzJobListeners</param>
	 * <param name="qrtzJobListenersQueryCondition">附加的条件</param>
	 */
	protected int qrtzJobListenersUpdateByCondition(QrtzJobListeners qrtzJobListeners, QrtzJobListenersExample qrtzJobListenersQueryCondition) {
		QrtzJobListenersMapper mapperImpl = this.getSqlSession().getMapper(QrtzJobListenersMapper.class);
		int ret = mapperImpl.updateByExample(qrtzJobListeners, qrtzJobListenersQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息QrtzJobListeners到数据库中
	 * <param name="qrtzJobListeners">需要更新的QrtzJobListeners</param>
	 * <param name="qrtzJobListenersQueryCondition">附加的条件</param>
	 */
	protected int qrtzJobListenersUpdateSelectiveByCondition(QrtzJobListeners qrtzJobListeners, QrtzJobListenersExample qrtzJobListenersQueryCondition) {
		QrtzJobListenersMapper mapperImpl = this.getSqlSession().getMapper(QrtzJobListenersMapper.class);
		int ret = mapperImpl.updateByExampleSelective(qrtzJobListeners, qrtzJobListenersQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="qrtzJobListeners">从数据库中删除一个对象QrtzJobListeners</param>
	 * <param name="AId"></param>
	 */
	protected int qrtzJobListenersDeleteByPrimaryKey(long AId) {
		QrtzJobListenersMapper mapperImpl = this.getSqlSession().getMapper(QrtzJobListenersMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="qrtzJobListeners">从数据库中删除一个对象QrtzJobListeners</param>
	 */
	protected int qrtzJobListenersDeleteByCondition(QrtzJobListenersExample qrtzJobListenersQueryCondition) {
		QrtzJobListenersMapper mapperImpl = this.getSqlSession().getMapper(QrtzJobListenersMapper.class);
		return mapperImpl.deleteByExample(qrtzJobListenersQueryCondition);
	}
	
	/**
	 * <param name="qrtzJobListeners">从数据库中查询一个对象QrtzJobListeners</param>
	 * <param name="AId"></param>
	 */
	protected QrtzJobListeners qrtzJobListenersSelectByPrimaryKey(long AId) {
		QrtzJobListenersMapper mapperImpl = this.getSqlSession().getMapper(QrtzJobListenersMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="qrtzJobListenersQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<QrtzJobListeners> qrtzJobListenersSelectObjects(QrtzJobListenersExample qrtzJobListenersQueryCondition) {
		QrtzJobListenersMapper mapperImpl = this.getSqlSession().getMapper(QrtzJobListenersMapper.class);
		return mapperImpl.selectByExample(qrtzJobListenersQueryCondition);
	}
	
	/**
	 * <param name="qrtzJobListenersQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int qrtzJobListenersQuerySelectObjectsCount(QrtzJobListenersExample qrtzJobListenersQueryCondition) {
		QrtzJobListenersMapper mapperImpl = this.getSqlSession().getMapper(QrtzJobListenersMapper.class);
		return mapperImpl.countByExample(qrtzJobListenersQueryCondition);
	}
	
	/**
	 * 插入一个对象QrtzSimpleTriggers到数据库中
	 * <param name="QrtzSimpleTriggers">需要插入的QrtzSimpleTriggers</param>
	 */
	protected int qrtzSimpleTriggersInsert(QrtzSimpleTriggers qrtzSimpleTriggers) {
		QrtzSimpleTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzSimpleTriggersMapper.class);
		return mapperImpl.insertSelective(qrtzSimpleTriggers);
	}
	
	/**
	 * 更新一个对象QrtzSimpleTriggers到数据库中
	 * <param name="qrtzSimpleTriggers">需要更新的QrtzSimpleTriggers</param>
	 */
	protected int qrtzSimpleTriggersUpdate(QrtzSimpleTriggers qrtzSimpleTriggers) {
		QrtzSimpleTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzSimpleTriggersMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(qrtzSimpleTriggers);
		return ret;
	}
	
	/**
	 * 更新一个对象QrtzSimpleTriggers到数据库中
	 * <param name="qrtzSimpleTriggers">需要更新的QrtzSimpleTriggers</param>
	 */
	protected int qrtzSimpleTriggersUpdateSelective(QrtzSimpleTriggers qrtzSimpleTriggers) {
		QrtzSimpleTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzSimpleTriggersMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(qrtzSimpleTriggers);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象QrtzSimpleTriggers到数据库中
	 * <param name="qrtzSimpleTriggers">需要更新的QrtzSimpleTriggers</param>
	 * <param name="qrtzSimpleTriggersQueryCondition">附加的条件</param>
	 */
	protected int qrtzSimpleTriggersUpdateByCondition(QrtzSimpleTriggers qrtzSimpleTriggers, QrtzSimpleTriggersExample qrtzSimpleTriggersQueryCondition) {
		QrtzSimpleTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzSimpleTriggersMapper.class);
		int ret = mapperImpl.updateByExample(qrtzSimpleTriggers, qrtzSimpleTriggersQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息QrtzSimpleTriggers到数据库中
	 * <param name="qrtzSimpleTriggers">需要更新的QrtzSimpleTriggers</param>
	 * <param name="qrtzSimpleTriggersQueryCondition">附加的条件</param>
	 */
	protected int qrtzSimpleTriggersUpdateSelectiveByCondition(QrtzSimpleTriggers qrtzSimpleTriggers, QrtzSimpleTriggersExample qrtzSimpleTriggersQueryCondition) {
		QrtzSimpleTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzSimpleTriggersMapper.class);
		int ret = mapperImpl.updateByExampleSelective(qrtzSimpleTriggers, qrtzSimpleTriggersQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="qrtzSimpleTriggers">从数据库中删除一个对象QrtzSimpleTriggers</param>
	 * <param name="AId"></param>
	 */
	protected int qrtzSimpleTriggersDeleteByPrimaryKey(long AId) {
		QrtzSimpleTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzSimpleTriggersMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="qrtzSimpleTriggers">从数据库中删除一个对象QrtzSimpleTriggers</param>
	 */
	protected int qrtzSimpleTriggersDeleteByCondition(QrtzSimpleTriggersExample qrtzSimpleTriggersQueryCondition) {
		QrtzSimpleTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzSimpleTriggersMapper.class);
		return mapperImpl.deleteByExample(qrtzSimpleTriggersQueryCondition);
	}
	
	/**
	 * <param name="qrtzSimpleTriggers">从数据库中查询一个对象QrtzSimpleTriggers</param>
	 * <param name="AId"></param>
	 */
	protected QrtzSimpleTriggers qrtzSimpleTriggersSelectByPrimaryKey(long AId) {
		QrtzSimpleTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzSimpleTriggersMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="qrtzSimpleTriggersQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<QrtzSimpleTriggers> qrtzSimpleTriggersSelectObjects(QrtzSimpleTriggersExample qrtzSimpleTriggersQueryCondition) {
		QrtzSimpleTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzSimpleTriggersMapper.class);
		return mapperImpl.selectByExample(qrtzSimpleTriggersQueryCondition);
	}
	
	/**
	 * <param name="qrtzSimpleTriggersQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int qrtzSimpleTriggersQuerySelectObjectsCount(QrtzSimpleTriggersExample qrtzSimpleTriggersQueryCondition) {
		QrtzSimpleTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzSimpleTriggersMapper.class);
		return mapperImpl.countByExample(qrtzSimpleTriggersQueryCondition);
	}
	
	/**
	 * 插入一个对象QrtzTriggerListeners到数据库中
	 * <param name="QrtzTriggerListeners">需要插入的QrtzTriggerListeners</param>
	 */
	protected int qrtzTriggerListenersInsert(QrtzTriggerListeners qrtzTriggerListeners) {
		QrtzTriggerListenersMapper mapperImpl = this.getSqlSession().getMapper(QrtzTriggerListenersMapper.class);
		return mapperImpl.insertSelective(qrtzTriggerListeners);
	}
	
	/**
	 * 更新一个对象QrtzTriggerListeners到数据库中
	 * <param name="qrtzTriggerListeners">需要更新的QrtzTriggerListeners</param>
	 */
	protected int qrtzTriggerListenersUpdate(QrtzTriggerListeners qrtzTriggerListeners) {
		QrtzTriggerListenersMapper mapperImpl = this.getSqlSession().getMapper(QrtzTriggerListenersMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(qrtzTriggerListeners);
		return ret;
	}
	
	/**
	 * 更新一个对象QrtzTriggerListeners到数据库中
	 * <param name="qrtzTriggerListeners">需要更新的QrtzTriggerListeners</param>
	 */
	protected int qrtzTriggerListenersUpdateSelective(QrtzTriggerListeners qrtzTriggerListeners) {
		QrtzTriggerListenersMapper mapperImpl = this.getSqlSession().getMapper(QrtzTriggerListenersMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(qrtzTriggerListeners);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象QrtzTriggerListeners到数据库中
	 * <param name="qrtzTriggerListeners">需要更新的QrtzTriggerListeners</param>
	 * <param name="qrtzTriggerListenersQueryCondition">附加的条件</param>
	 */
	protected int qrtzTriggerListenersUpdateByCondition(QrtzTriggerListeners qrtzTriggerListeners, QrtzTriggerListenersExample qrtzTriggerListenersQueryCondition) {
		QrtzTriggerListenersMapper mapperImpl = this.getSqlSession().getMapper(QrtzTriggerListenersMapper.class);
		int ret = mapperImpl.updateByExample(qrtzTriggerListeners, qrtzTriggerListenersQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息QrtzTriggerListeners到数据库中
	 * <param name="qrtzTriggerListeners">需要更新的QrtzTriggerListeners</param>
	 * <param name="qrtzTriggerListenersQueryCondition">附加的条件</param>
	 */
	protected int qrtzTriggerListenersUpdateSelectiveByCondition(QrtzTriggerListeners qrtzTriggerListeners, QrtzTriggerListenersExample qrtzTriggerListenersQueryCondition) {
		QrtzTriggerListenersMapper mapperImpl = this.getSqlSession().getMapper(QrtzTriggerListenersMapper.class);
		int ret = mapperImpl.updateByExampleSelective(qrtzTriggerListeners, qrtzTriggerListenersQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="qrtzTriggerListeners">从数据库中删除一个对象QrtzTriggerListeners</param>
	 * <param name="AId"></param>
	 */
	protected int qrtzTriggerListenersDeleteByPrimaryKey(long AId) {
		QrtzTriggerListenersMapper mapperImpl = this.getSqlSession().getMapper(QrtzTriggerListenersMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="qrtzTriggerListeners">从数据库中删除一个对象QrtzTriggerListeners</param>
	 */
	protected int qrtzTriggerListenersDeleteByCondition(QrtzTriggerListenersExample qrtzTriggerListenersQueryCondition) {
		QrtzTriggerListenersMapper mapperImpl = this.getSqlSession().getMapper(QrtzTriggerListenersMapper.class);
		return mapperImpl.deleteByExample(qrtzTriggerListenersQueryCondition);
	}
	
	/**
	 * <param name="qrtzTriggerListeners">从数据库中查询一个对象QrtzTriggerListeners</param>
	 * <param name="AId"></param>
	 */
	protected QrtzTriggerListeners qrtzTriggerListenersSelectByPrimaryKey(long AId) {
		QrtzTriggerListenersMapper mapperImpl = this.getSqlSession().getMapper(QrtzTriggerListenersMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="qrtzTriggerListenersQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<QrtzTriggerListeners> qrtzTriggerListenersSelectObjects(QrtzTriggerListenersExample qrtzTriggerListenersQueryCondition) {
		QrtzTriggerListenersMapper mapperImpl = this.getSqlSession().getMapper(QrtzTriggerListenersMapper.class);
		return mapperImpl.selectByExample(qrtzTriggerListenersQueryCondition);
	}
	
	/**
	 * <param name="qrtzTriggerListenersQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int qrtzTriggerListenersQuerySelectObjectsCount(QrtzTriggerListenersExample qrtzTriggerListenersQueryCondition) {
		QrtzTriggerListenersMapper mapperImpl = this.getSqlSession().getMapper(QrtzTriggerListenersMapper.class);
		return mapperImpl.countByExample(qrtzTriggerListenersQueryCondition);
	}
	
	/**
	 * 插入一个对象QrtzTriggers到数据库中
	 * <param name="QrtzTriggers">需要插入的QrtzTriggers</param>
	 */
	protected int qrtzTriggersInsert(QrtzTriggers qrtzTriggers) {
		QrtzTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzTriggersMapper.class);
		return mapperImpl.insertSelective(qrtzTriggers);
	}
	
	/**
	 * 更新一个对象QrtzTriggers到数据库中
	 * <param name="qrtzTriggers">需要更新的QrtzTriggers</param>
	 */
	protected int qrtzTriggersUpdate(QrtzTriggers qrtzTriggers) {
		QrtzTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzTriggersMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(qrtzTriggers);
		return ret;
	}
	
	/**
	 * 更新一个对象QrtzTriggers到数据库中
	 * <param name="qrtzTriggers">需要更新的QrtzTriggers</param>
	 */
	protected int qrtzTriggersUpdateSelective(QrtzTriggers qrtzTriggers) {
		QrtzTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzTriggersMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(qrtzTriggers);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象QrtzTriggers到数据库中
	 * <param name="qrtzTriggers">需要更新的QrtzTriggers</param>
	 * <param name="qrtzTriggersQueryCondition">附加的条件</param>
	 */
	protected int qrtzTriggersUpdateByCondition(QrtzTriggers qrtzTriggers, QrtzTriggersExample qrtzTriggersQueryCondition) {
		QrtzTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzTriggersMapper.class);
		int ret = mapperImpl.updateByExample(qrtzTriggers, qrtzTriggersQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息QrtzTriggers到数据库中
	 * <param name="qrtzTriggers">需要更新的QrtzTriggers</param>
	 * <param name="qrtzTriggersQueryCondition">附加的条件</param>
	 */
	protected int qrtzTriggersUpdateSelectiveByCondition(QrtzTriggers qrtzTriggers, QrtzTriggersExample qrtzTriggersQueryCondition) {
		QrtzTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzTriggersMapper.class);
		int ret = mapperImpl.updateByExampleSelective(qrtzTriggers, qrtzTriggersQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="qrtzTriggers">从数据库中删除一个对象QrtzTriggers</param>
	 * <param name="AId"></param>
	 */
	protected int qrtzTriggersDeleteByPrimaryKey(long AId) {
		QrtzTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzTriggersMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="qrtzTriggers">从数据库中删除一个对象QrtzTriggers</param>
	 */
	protected int qrtzTriggersDeleteByCondition(QrtzTriggersExample qrtzTriggersQueryCondition) {
		QrtzTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzTriggersMapper.class);
		return mapperImpl.deleteByExample(qrtzTriggersQueryCondition);
	}
	
	/**
	 * <param name="qrtzTriggers">从数据库中查询一个对象QrtzTriggers</param>
	 * <param name="AId"></param>
	 */
	protected QrtzTriggers qrtzTriggersSelectByPrimaryKey(long AId) {
		QrtzTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzTriggersMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="qrtzTriggersQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<QrtzTriggers> qrtzTriggersSelectObjects(QrtzTriggersExample qrtzTriggersQueryCondition) {
		QrtzTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzTriggersMapper.class);
		return mapperImpl.selectByExample(qrtzTriggersQueryCondition);
	}
	
	/**
	 * <param name="qrtzTriggersQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int qrtzTriggersQuerySelectObjectsCount(QrtzTriggersExample qrtzTriggersQueryCondition) {
		QrtzTriggersMapper mapperImpl = this.getSqlSession().getMapper(QrtzTriggersMapper.class);
		return mapperImpl.countByExample(qrtzTriggersQueryCondition);
	}
	
	/**
	 * 插入一个对象Remembermetoken到数据库中
	 * <param name="Remembermetoken">需要插入的Remembermetoken</param>
	 */
	protected int remembermetokenInsert(Remembermetoken remembermetoken) {
		RemembermetokenMapper mapperImpl = this.getSqlSession().getMapper(RemembermetokenMapper.class);
		return mapperImpl.insertSelective(remembermetoken);
	}
	
	/**
	 * 更新一个对象Remembermetoken到数据库中
	 * <param name="remembermetoken">需要更新的Remembermetoken</param>
	 */
	protected int remembermetokenUpdate(Remembermetoken remembermetoken) {
		RemembermetokenMapper mapperImpl = this.getSqlSession().getMapper(RemembermetokenMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(remembermetoken);
		return ret;
	}
	
	/**
	 * 更新一个对象Remembermetoken到数据库中
	 * <param name="remembermetoken">需要更新的Remembermetoken</param>
	 */
	protected int remembermetokenUpdateSelective(Remembermetoken remembermetoken) {
		RemembermetokenMapper mapperImpl = this.getSqlSession().getMapper(RemembermetokenMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(remembermetoken);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Remembermetoken到数据库中
	 * <param name="remembermetoken">需要更新的Remembermetoken</param>
	 * <param name="remembermetokenQueryCondition">附加的条件</param>
	 */
	protected int remembermetokenUpdateByCondition(Remembermetoken remembermetoken, RemembermetokenExample remembermetokenQueryCondition) {
		RemembermetokenMapper mapperImpl = this.getSqlSession().getMapper(RemembermetokenMapper.class);
		int ret = mapperImpl.updateByExample(remembermetoken, remembermetokenQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Remembermetoken到数据库中
	 * <param name="remembermetoken">需要更新的Remembermetoken</param>
	 * <param name="remembermetokenQueryCondition">附加的条件</param>
	 */
	protected int remembermetokenUpdateSelectiveByCondition(Remembermetoken remembermetoken, RemembermetokenExample remembermetokenQueryCondition) {
		RemembermetokenMapper mapperImpl = this.getSqlSession().getMapper(RemembermetokenMapper.class);
		int ret = mapperImpl.updateByExampleSelective(remembermetoken, remembermetokenQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="remembermetoken">从数据库中删除一个对象Remembermetoken</param>
	 * <param name="AId"></param>
	 */
	protected int remembermetokenDeleteByPrimaryKey(long AId) {
		RemembermetokenMapper mapperImpl = this.getSqlSession().getMapper(RemembermetokenMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="remembermetoken">从数据库中删除一个对象Remembermetoken</param>
	 */
	protected int remembermetokenDeleteByCondition(RemembermetokenExample remembermetokenQueryCondition) {
		RemembermetokenMapper mapperImpl = this.getSqlSession().getMapper(RemembermetokenMapper.class);
		return mapperImpl.deleteByExample(remembermetokenQueryCondition);
	}
	
	/**
	 * <param name="remembermetoken">从数据库中查询一个对象Remembermetoken</param>
	 * <param name="AId"></param>
	 */
	protected Remembermetoken remembermetokenSelectByPrimaryKey(long AId) {
		RemembermetokenMapper mapperImpl = this.getSqlSession().getMapper(RemembermetokenMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="remembermetokenQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Remembermetoken> remembermetokenSelectObjects(RemembermetokenExample remembermetokenQueryCondition) {
		RemembermetokenMapper mapperImpl = this.getSqlSession().getMapper(RemembermetokenMapper.class);
		return mapperImpl.selectByExample(remembermetokenQueryCondition);
	}
	
	/**
	 * <param name="remembermetokenQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int remembermetokenQuerySelectObjectsCount(RemembermetokenExample remembermetokenQueryCondition) {
		RemembermetokenMapper mapperImpl = this.getSqlSession().getMapper(RemembermetokenMapper.class);
		return mapperImpl.countByExample(remembermetokenQueryCondition);
	}
	
	/**
	 * 插入一个对象RemotelinkWithBLOBs到数据库中
	 * <param name="RemotelinkWithBLOBs">需要插入的RemotelinkWithBLOBs</param>
	 */
	protected int remotelinkInsert(RemotelinkWithBLOBs remotelink) {
		RemotelinkMapper mapperImpl = this.getSqlSession().getMapper(RemotelinkMapper.class);
		return mapperImpl.insertSelective(remotelink);
	}
	
	/**
	 * 更新一个对象Remotelink到数据库中
	 * <param name="remotelink">需要更新的Remotelink</param>
	 */
	protected int remotelinkUpdate(Remotelink remotelink) {
		RemotelinkMapper mapperImpl = this.getSqlSession().getMapper(RemotelinkMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(remotelink);
		return ret;
	}
	
	/**
	 * 更新一个对象Remotelink到数据库中
	 * <param name="remotelink">需要更新的Remotelink</param>
	 */
	protected int remotelinkUpdateSelective(RemotelinkWithBLOBs remotelink) {
		RemotelinkMapper mapperImpl = this.getSqlSession().getMapper(RemotelinkMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(remotelink);
		return ret;
	}
	
	/**
	 * 更新一个对象RemotelinkWithBLOBs到数据库中
	 * <param name="remotelink">需要更新的Remotelink</param>
	 */
	public int remotelinkUpdateWithBlobs(RemotelinkWithBLOBs remotelink) {
		RemotelinkMapper mapperImpl = this.getSqlSession().getMapper(RemotelinkMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(remotelink);
	}
	
	/**
	 * 根据条件更新一批对象Remotelink到数据库中
	 * <param name="remotelink">需要更新的Remotelink</param>
	 * <param name="remotelinkQueryCondition">附加的条件</param>
	 */
	protected int remotelinkUpdateByCondition(Remotelink remotelink, RemotelinkExample remotelinkQueryCondition) {
		RemotelinkMapper mapperImpl = this.getSqlSession().getMapper(RemotelinkMapper.class);
		int ret = mapperImpl.updateByExample(remotelink, remotelinkQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Remotelink到数据库中
	 * <param name="remotelink">需要更新的Remotelink</param>
	 * <param name="remotelinkQueryCondition">附加的条件</param>
	 */
	protected int remotelinkUpdateSelectiveByCondition(RemotelinkWithBLOBs remotelink, RemotelinkExample remotelinkQueryCondition) {
		RemotelinkMapper mapperImpl = this.getSqlSession().getMapper(RemotelinkMapper.class);
		int ret = mapperImpl.updateByExampleSelective(remotelink, remotelinkQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="remotelink">从数据库中删除一个对象Remotelink</param>
	 * <param name="AId"></param>
	 */
	protected int remotelinkDeleteByPrimaryKey(long AId) {
		RemotelinkMapper mapperImpl = this.getSqlSession().getMapper(RemotelinkMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="remotelink">从数据库中删除一个对象Remotelink</param>
	 */
	protected int remotelinkDeleteByCondition(RemotelinkExample remotelinkQueryCondition) {
		RemotelinkMapper mapperImpl = this.getSqlSession().getMapper(RemotelinkMapper.class);
		return mapperImpl.deleteByExample(remotelinkQueryCondition);
	}
	
	/**
	 * <param name="remotelink">从数据库中查询一个对象RemotelinkWithBLOBs</param>
	 * <param name="AId"></param>
	 */
	protected RemotelinkWithBLOBs remotelinkSelectByPrimaryKey(long AId) {
		RemotelinkMapper mapperImpl = this.getSqlSession().getMapper(RemotelinkMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="remotelinkQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Remotelink> remotelinkSelectObjects(RemotelinkExample remotelinkQueryCondition) {
		RemotelinkMapper mapperImpl = this.getSqlSession().getMapper(RemotelinkMapper.class);
		return mapperImpl.selectByExample(remotelinkQueryCondition);
	}
	
	/**
	 * <param name="remotelinkQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<RemotelinkWithBLOBs> remotelinkSelectObjectsWithBLOBs(RemotelinkExample remotelinkQueryCondition) {
		RemotelinkMapper mapperImpl = this.getSqlSession().getMapper(RemotelinkMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(remotelinkQueryCondition);
	}
	
	/**
	 * <param name="remotelinkQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int remotelinkQuerySelectObjectsCount(RemotelinkExample remotelinkQueryCondition) {
		RemotelinkMapper mapperImpl = this.getSqlSession().getMapper(RemotelinkMapper.class);
		return mapperImpl.countByExample(remotelinkQueryCondition);
	}
	
	/**
	 * 插入一个对象Resolution到数据库中
	 * <param name="Resolution">需要插入的Resolution</param>
	 */
	protected int resolutionInsert(Resolution resolution) {
		ResolutionMapper mapperImpl = this.getSqlSession().getMapper(ResolutionMapper.class);
		return mapperImpl.insertSelective(resolution);
	}
	
	/**
	 * 更新一个对象Resolution到数据库中
	 * <param name="resolution">需要更新的Resolution</param>
	 */
	protected int resolutionUpdate(Resolution resolution) {
		ResolutionMapper mapperImpl = this.getSqlSession().getMapper(ResolutionMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(resolution);
		return ret;
	}
	
	/**
	 * 更新一个对象Resolution到数据库中
	 * <param name="resolution">需要更新的Resolution</param>
	 */
	protected int resolutionUpdateSelective(Resolution resolution) {
		ResolutionMapper mapperImpl = this.getSqlSession().getMapper(ResolutionMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(resolution);
		return ret;
	}
	
	/**
	 * 更新一个对象Resolution到数据库中
	 * <param name="resolution">需要更新的Resolution</param>
	 */
	public int resolutionUpdateWithBlobs(Resolution resolution) {
		ResolutionMapper mapperImpl = this.getSqlSession().getMapper(ResolutionMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(resolution);
	}
	
	/**
	 * 根据条件更新一批对象Resolution到数据库中
	 * <param name="resolution">需要更新的Resolution</param>
	 * <param name="resolutionQueryCondition">附加的条件</param>
	 */
	protected int resolutionUpdateByCondition(Resolution resolution, ResolutionExample resolutionQueryCondition) {
		ResolutionMapper mapperImpl = this.getSqlSession().getMapper(ResolutionMapper.class);
		int ret = mapperImpl.updateByExample(resolution, resolutionQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Resolution到数据库中
	 * <param name="resolution">需要更新的Resolution</param>
	 * <param name="resolutionQueryCondition">附加的条件</param>
	 */
	protected int resolutionUpdateSelectiveByCondition(Resolution resolution, ResolutionExample resolutionQueryCondition) {
		ResolutionMapper mapperImpl = this.getSqlSession().getMapper(ResolutionMapper.class);
		int ret = mapperImpl.updateByExampleSelective(resolution, resolutionQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="resolution">从数据库中删除一个对象Resolution</param>
	 * <param name="AId"></param>
	 */
	protected int resolutionDeleteByPrimaryKey(String AId) {
		ResolutionMapper mapperImpl = this.getSqlSession().getMapper(ResolutionMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="resolution">从数据库中删除一个对象Resolution</param>
	 */
	protected int resolutionDeleteByCondition(ResolutionExample resolutionQueryCondition) {
		ResolutionMapper mapperImpl = this.getSqlSession().getMapper(ResolutionMapper.class);
		return mapperImpl.deleteByExample(resolutionQueryCondition);
	}
	
	/**
	 * <param name="resolution">从数据库中查询一个对象Resolution</param>
	 * <param name="AId"></param>
	 */
	protected Resolution resolutionSelectByPrimaryKey(String AId) {
		ResolutionMapper mapperImpl = this.getSqlSession().getMapper(ResolutionMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="resolutionQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Resolution> resolutionSelectObjects(ResolutionExample resolutionQueryCondition) {
		ResolutionMapper mapperImpl = this.getSqlSession().getMapper(ResolutionMapper.class);
		return mapperImpl.selectByExample(resolutionQueryCondition);
	}
	
	/**
	 * <param name="resolutionQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Resolution> resolutionSelectObjectsWithBLOBs(ResolutionExample resolutionQueryCondition) {
		ResolutionMapper mapperImpl = this.getSqlSession().getMapper(ResolutionMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(resolutionQueryCondition);
	}
	
	/**
	 * <param name="resolutionQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int resolutionQuerySelectObjectsCount(ResolutionExample resolutionQueryCondition) {
		ResolutionMapper mapperImpl = this.getSqlSession().getMapper(ResolutionMapper.class);
		return mapperImpl.countByExample(resolutionQueryCondition);
	}
	
	/**
	 * 插入一个对象Schemeissuesecurities到数据库中
	 * <param name="Schemeissuesecurities">需要插入的Schemeissuesecurities</param>
	 */
	protected int schemeissuesecuritiesInsert(Schemeissuesecurities schemeissuesecurities) {
		SchemeissuesecuritiesMapper mapperImpl = this.getSqlSession().getMapper(SchemeissuesecuritiesMapper.class);
		return mapperImpl.insertSelective(schemeissuesecurities);
	}
	
	/**
	 * 更新一个对象Schemeissuesecurities到数据库中
	 * <param name="schemeissuesecurities">需要更新的Schemeissuesecurities</param>
	 */
	protected int schemeissuesecuritiesUpdate(Schemeissuesecurities schemeissuesecurities) {
		SchemeissuesecuritiesMapper mapperImpl = this.getSqlSession().getMapper(SchemeissuesecuritiesMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(schemeissuesecurities);
		return ret;
	}
	
	/**
	 * 更新一个对象Schemeissuesecurities到数据库中
	 * <param name="schemeissuesecurities">需要更新的Schemeissuesecurities</param>
	 */
	protected int schemeissuesecuritiesUpdateSelective(Schemeissuesecurities schemeissuesecurities) {
		SchemeissuesecuritiesMapper mapperImpl = this.getSqlSession().getMapper(SchemeissuesecuritiesMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(schemeissuesecurities);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Schemeissuesecurities到数据库中
	 * <param name="schemeissuesecurities">需要更新的Schemeissuesecurities</param>
	 * <param name="schemeissuesecuritiesQueryCondition">附加的条件</param>
	 */
	protected int schemeissuesecuritiesUpdateByCondition(Schemeissuesecurities schemeissuesecurities, SchemeissuesecuritiesExample schemeissuesecuritiesQueryCondition) {
		SchemeissuesecuritiesMapper mapperImpl = this.getSqlSession().getMapper(SchemeissuesecuritiesMapper.class);
		int ret = mapperImpl.updateByExample(schemeissuesecurities, schemeissuesecuritiesQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Schemeissuesecurities到数据库中
	 * <param name="schemeissuesecurities">需要更新的Schemeissuesecurities</param>
	 * <param name="schemeissuesecuritiesQueryCondition">附加的条件</param>
	 */
	protected int schemeissuesecuritiesUpdateSelectiveByCondition(Schemeissuesecurities schemeissuesecurities, SchemeissuesecuritiesExample schemeissuesecuritiesQueryCondition) {
		SchemeissuesecuritiesMapper mapperImpl = this.getSqlSession().getMapper(SchemeissuesecuritiesMapper.class);
		int ret = mapperImpl.updateByExampleSelective(schemeissuesecurities, schemeissuesecuritiesQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="schemeissuesecurities">从数据库中删除一个对象Schemeissuesecurities</param>
	 * <param name="AId"></param>
	 */
	protected int schemeissuesecuritiesDeleteByPrimaryKey(long AId) {
		SchemeissuesecuritiesMapper mapperImpl = this.getSqlSession().getMapper(SchemeissuesecuritiesMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="schemeissuesecurities">从数据库中删除一个对象Schemeissuesecurities</param>
	 */
	protected int schemeissuesecuritiesDeleteByCondition(SchemeissuesecuritiesExample schemeissuesecuritiesQueryCondition) {
		SchemeissuesecuritiesMapper mapperImpl = this.getSqlSession().getMapper(SchemeissuesecuritiesMapper.class);
		return mapperImpl.deleteByExample(schemeissuesecuritiesQueryCondition);
	}
	
	/**
	 * <param name="schemeissuesecurities">从数据库中查询一个对象Schemeissuesecurities</param>
	 * <param name="AId"></param>
	 */
	protected Schemeissuesecurities schemeissuesecuritiesSelectByPrimaryKey(long AId) {
		SchemeissuesecuritiesMapper mapperImpl = this.getSqlSession().getMapper(SchemeissuesecuritiesMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="schemeissuesecuritiesQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Schemeissuesecurities> schemeissuesecuritiesSelectObjects(SchemeissuesecuritiesExample schemeissuesecuritiesQueryCondition) {
		SchemeissuesecuritiesMapper mapperImpl = this.getSqlSession().getMapper(SchemeissuesecuritiesMapper.class);
		return mapperImpl.selectByExample(schemeissuesecuritiesQueryCondition);
	}
	
	/**
	 * <param name="schemeissuesecuritiesQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int schemeissuesecuritiesQuerySelectObjectsCount(SchemeissuesecuritiesExample schemeissuesecuritiesQueryCondition) {
		SchemeissuesecuritiesMapper mapperImpl = this.getSqlSession().getMapper(SchemeissuesecuritiesMapper.class);
		return mapperImpl.countByExample(schemeissuesecuritiesQueryCondition);
	}
	
	/**
	 * 插入一个对象Schemeissuesecuritylevels到数据库中
	 * <param name="Schemeissuesecuritylevels">需要插入的Schemeissuesecuritylevels</param>
	 */
	protected int schemeissuesecuritylevelsInsert(Schemeissuesecuritylevels schemeissuesecuritylevels) {
		SchemeissuesecuritylevelsMapper mapperImpl = this.getSqlSession().getMapper(SchemeissuesecuritylevelsMapper.class);
		return mapperImpl.insertSelective(schemeissuesecuritylevels);
	}
	
	/**
	 * 更新一个对象Schemeissuesecuritylevels到数据库中
	 * <param name="schemeissuesecuritylevels">需要更新的Schemeissuesecuritylevels</param>
	 */
	protected int schemeissuesecuritylevelsUpdate(Schemeissuesecuritylevels schemeissuesecuritylevels) {
		SchemeissuesecuritylevelsMapper mapperImpl = this.getSqlSession().getMapper(SchemeissuesecuritylevelsMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(schemeissuesecuritylevels);
		return ret;
	}
	
	/**
	 * 更新一个对象Schemeissuesecuritylevels到数据库中
	 * <param name="schemeissuesecuritylevels">需要更新的Schemeissuesecuritylevels</param>
	 */
	protected int schemeissuesecuritylevelsUpdateSelective(Schemeissuesecuritylevels schemeissuesecuritylevels) {
		SchemeissuesecuritylevelsMapper mapperImpl = this.getSqlSession().getMapper(SchemeissuesecuritylevelsMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(schemeissuesecuritylevels);
		return ret;
	}
	
	/**
	 * 更新一个对象Schemeissuesecuritylevels到数据库中
	 * <param name="schemeissuesecuritylevels">需要更新的Schemeissuesecuritylevels</param>
	 */
	public int schemeissuesecuritylevelsUpdateWithBlobs(Schemeissuesecuritylevels schemeissuesecuritylevels) {
		SchemeissuesecuritylevelsMapper mapperImpl = this.getSqlSession().getMapper(SchemeissuesecuritylevelsMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(schemeissuesecuritylevels);
	}
	
	/**
	 * 根据条件更新一批对象Schemeissuesecuritylevels到数据库中
	 * <param name="schemeissuesecuritylevels">需要更新的Schemeissuesecuritylevels</param>
	 * <param name="schemeissuesecuritylevelsQueryCondition">附加的条件</param>
	 */
	protected int schemeissuesecuritylevelsUpdateByCondition(Schemeissuesecuritylevels schemeissuesecuritylevels, SchemeissuesecuritylevelsExample schemeissuesecuritylevelsQueryCondition) {
		SchemeissuesecuritylevelsMapper mapperImpl = this.getSqlSession().getMapper(SchemeissuesecuritylevelsMapper.class);
		int ret = mapperImpl.updateByExample(schemeissuesecuritylevels, schemeissuesecuritylevelsQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Schemeissuesecuritylevels到数据库中
	 * <param name="schemeissuesecuritylevels">需要更新的Schemeissuesecuritylevels</param>
	 * <param name="schemeissuesecuritylevelsQueryCondition">附加的条件</param>
	 */
	protected int schemeissuesecuritylevelsUpdateSelectiveByCondition(Schemeissuesecuritylevels schemeissuesecuritylevels, SchemeissuesecuritylevelsExample schemeissuesecuritylevelsQueryCondition) {
		SchemeissuesecuritylevelsMapper mapperImpl = this.getSqlSession().getMapper(SchemeissuesecuritylevelsMapper.class);
		int ret = mapperImpl.updateByExampleSelective(schemeissuesecuritylevels, schemeissuesecuritylevelsQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="schemeissuesecuritylevels">从数据库中删除一个对象Schemeissuesecuritylevels</param>
	 * <param name="AId"></param>
	 */
	protected int schemeissuesecuritylevelsDeleteByPrimaryKey(long AId) {
		SchemeissuesecuritylevelsMapper mapperImpl = this.getSqlSession().getMapper(SchemeissuesecuritylevelsMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="schemeissuesecuritylevels">从数据库中删除一个对象Schemeissuesecuritylevels</param>
	 */
	protected int schemeissuesecuritylevelsDeleteByCondition(SchemeissuesecuritylevelsExample schemeissuesecuritylevelsQueryCondition) {
		SchemeissuesecuritylevelsMapper mapperImpl = this.getSqlSession().getMapper(SchemeissuesecuritylevelsMapper.class);
		return mapperImpl.deleteByExample(schemeissuesecuritylevelsQueryCondition);
	}
	
	/**
	 * <param name="schemeissuesecuritylevels">从数据库中查询一个对象Schemeissuesecuritylevels</param>
	 * <param name="AId"></param>
	 */
	protected Schemeissuesecuritylevels schemeissuesecuritylevelsSelectByPrimaryKey(long AId) {
		SchemeissuesecuritylevelsMapper mapperImpl = this.getSqlSession().getMapper(SchemeissuesecuritylevelsMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="schemeissuesecuritylevelsQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Schemeissuesecuritylevels> schemeissuesecuritylevelsSelectObjects(SchemeissuesecuritylevelsExample schemeissuesecuritylevelsQueryCondition) {
		SchemeissuesecuritylevelsMapper mapperImpl = this.getSqlSession().getMapper(SchemeissuesecuritylevelsMapper.class);
		return mapperImpl.selectByExample(schemeissuesecuritylevelsQueryCondition);
	}
	
	/**
	 * <param name="schemeissuesecuritylevelsQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Schemeissuesecuritylevels> schemeissuesecuritylevelsSelectObjectsWithBLOBs(SchemeissuesecuritylevelsExample schemeissuesecuritylevelsQueryCondition) {
		SchemeissuesecuritylevelsMapper mapperImpl = this.getSqlSession().getMapper(SchemeissuesecuritylevelsMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(schemeissuesecuritylevelsQueryCondition);
	}
	
	/**
	 * <param name="schemeissuesecuritylevelsQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int schemeissuesecuritylevelsQuerySelectObjectsCount(SchemeissuesecuritylevelsExample schemeissuesecuritylevelsQueryCondition) {
		SchemeissuesecuritylevelsMapper mapperImpl = this.getSqlSession().getMapper(SchemeissuesecuritylevelsMapper.class);
		return mapperImpl.countByExample(schemeissuesecuritylevelsQueryCondition);
	}
	
	/**
	 * 插入一个对象Schemepermissions到数据库中
	 * <param name="Schemepermissions">需要插入的Schemepermissions</param>
	 */
	protected int schemepermissionsInsert(Schemepermissions schemepermissions) {
		SchemepermissionsMapper mapperImpl = this.getSqlSession().getMapper(SchemepermissionsMapper.class);
		return mapperImpl.insertSelective(schemepermissions);
	}
	
	/**
	 * 更新一个对象Schemepermissions到数据库中
	 * <param name="schemepermissions">需要更新的Schemepermissions</param>
	 */
	protected int schemepermissionsUpdate(Schemepermissions schemepermissions) {
		SchemepermissionsMapper mapperImpl = this.getSqlSession().getMapper(SchemepermissionsMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(schemepermissions);
		return ret;
	}
	
	/**
	 * 更新一个对象Schemepermissions到数据库中
	 * <param name="schemepermissions">需要更新的Schemepermissions</param>
	 */
	protected int schemepermissionsUpdateSelective(Schemepermissions schemepermissions) {
		SchemepermissionsMapper mapperImpl = this.getSqlSession().getMapper(SchemepermissionsMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(schemepermissions);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Schemepermissions到数据库中
	 * <param name="schemepermissions">需要更新的Schemepermissions</param>
	 * <param name="schemepermissionsQueryCondition">附加的条件</param>
	 */
	protected int schemepermissionsUpdateByCondition(Schemepermissions schemepermissions, SchemepermissionsExample schemepermissionsQueryCondition) {
		SchemepermissionsMapper mapperImpl = this.getSqlSession().getMapper(SchemepermissionsMapper.class);
		int ret = mapperImpl.updateByExample(schemepermissions, schemepermissionsQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Schemepermissions到数据库中
	 * <param name="schemepermissions">需要更新的Schemepermissions</param>
	 * <param name="schemepermissionsQueryCondition">附加的条件</param>
	 */
	protected int schemepermissionsUpdateSelectiveByCondition(Schemepermissions schemepermissions, SchemepermissionsExample schemepermissionsQueryCondition) {
		SchemepermissionsMapper mapperImpl = this.getSqlSession().getMapper(SchemepermissionsMapper.class);
		int ret = mapperImpl.updateByExampleSelective(schemepermissions, schemepermissionsQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="schemepermissions">从数据库中删除一个对象Schemepermissions</param>
	 * <param name="AId"></param>
	 */
	protected int schemepermissionsDeleteByPrimaryKey(long AId) {
		SchemepermissionsMapper mapperImpl = this.getSqlSession().getMapper(SchemepermissionsMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="schemepermissions">从数据库中删除一个对象Schemepermissions</param>
	 */
	protected int schemepermissionsDeleteByCondition(SchemepermissionsExample schemepermissionsQueryCondition) {
		SchemepermissionsMapper mapperImpl = this.getSqlSession().getMapper(SchemepermissionsMapper.class);
		return mapperImpl.deleteByExample(schemepermissionsQueryCondition);
	}
	
	/**
	 * <param name="schemepermissions">从数据库中查询一个对象Schemepermissions</param>
	 * <param name="AId"></param>
	 */
	protected Schemepermissions schemepermissionsSelectByPrimaryKey(long AId) {
		SchemepermissionsMapper mapperImpl = this.getSqlSession().getMapper(SchemepermissionsMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="schemepermissionsQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Schemepermissions> schemepermissionsSelectObjects(SchemepermissionsExample schemepermissionsQueryCondition) {
		SchemepermissionsMapper mapperImpl = this.getSqlSession().getMapper(SchemepermissionsMapper.class);
		return mapperImpl.selectByExample(schemepermissionsQueryCondition);
	}
	
	/**
	 * <param name="schemepermissionsQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int schemepermissionsQuerySelectObjectsCount(SchemepermissionsExample schemepermissionsQueryCondition) {
		SchemepermissionsMapper mapperImpl = this.getSqlSession().getMapper(SchemepermissionsMapper.class);
		return mapperImpl.countByExample(schemepermissionsQueryCondition);
	}
	
	/**
	 * 插入一个对象SearchrequestWithBLOBs到数据库中
	 * <param name="SearchrequestWithBLOBs">需要插入的SearchrequestWithBLOBs</param>
	 */
	protected int searchrequestInsert(SearchrequestWithBLOBs searchrequest) {
		SearchrequestMapper mapperImpl = this.getSqlSession().getMapper(SearchrequestMapper.class);
		return mapperImpl.insertSelective(searchrequest);
	}
	
	/**
	 * 更新一个对象Searchrequest到数据库中
	 * <param name="searchrequest">需要更新的Searchrequest</param>
	 */
	protected int searchrequestUpdate(Searchrequest searchrequest) {
		SearchrequestMapper mapperImpl = this.getSqlSession().getMapper(SearchrequestMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(searchrequest);
		return ret;
	}
	
	/**
	 * 更新一个对象Searchrequest到数据库中
	 * <param name="searchrequest">需要更新的Searchrequest</param>
	 */
	protected int searchrequestUpdateSelective(SearchrequestWithBLOBs searchrequest) {
		SearchrequestMapper mapperImpl = this.getSqlSession().getMapper(SearchrequestMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(searchrequest);
		return ret;
	}
	
	/**
	 * 更新一个对象SearchrequestWithBLOBs到数据库中
	 * <param name="searchrequest">需要更新的Searchrequest</param>
	 */
	public int searchrequestUpdateWithBlobs(SearchrequestWithBLOBs searchrequest) {
		SearchrequestMapper mapperImpl = this.getSqlSession().getMapper(SearchrequestMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(searchrequest);
	}
	
	/**
	 * 根据条件更新一批对象Searchrequest到数据库中
	 * <param name="searchrequest">需要更新的Searchrequest</param>
	 * <param name="searchrequestQueryCondition">附加的条件</param>
	 */
	protected int searchrequestUpdateByCondition(Searchrequest searchrequest, SearchrequestExample searchrequestQueryCondition) {
		SearchrequestMapper mapperImpl = this.getSqlSession().getMapper(SearchrequestMapper.class);
		int ret = mapperImpl.updateByExample(searchrequest, searchrequestQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Searchrequest到数据库中
	 * <param name="searchrequest">需要更新的Searchrequest</param>
	 * <param name="searchrequestQueryCondition">附加的条件</param>
	 */
	protected int searchrequestUpdateSelectiveByCondition(SearchrequestWithBLOBs searchrequest, SearchrequestExample searchrequestQueryCondition) {
		SearchrequestMapper mapperImpl = this.getSqlSession().getMapper(SearchrequestMapper.class);
		int ret = mapperImpl.updateByExampleSelective(searchrequest, searchrequestQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="searchrequest">从数据库中删除一个对象Searchrequest</param>
	 * <param name="AId"></param>
	 */
	protected int searchrequestDeleteByPrimaryKey(long AId) {
		SearchrequestMapper mapperImpl = this.getSqlSession().getMapper(SearchrequestMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="searchrequest">从数据库中删除一个对象Searchrequest</param>
	 */
	protected int searchrequestDeleteByCondition(SearchrequestExample searchrequestQueryCondition) {
		SearchrequestMapper mapperImpl = this.getSqlSession().getMapper(SearchrequestMapper.class);
		return mapperImpl.deleteByExample(searchrequestQueryCondition);
	}
	
	/**
	 * <param name="searchrequest">从数据库中查询一个对象SearchrequestWithBLOBs</param>
	 * <param name="AId"></param>
	 */
	protected SearchrequestWithBLOBs searchrequestSelectByPrimaryKey(long AId) {
		SearchrequestMapper mapperImpl = this.getSqlSession().getMapper(SearchrequestMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="searchrequestQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Searchrequest> searchrequestSelectObjects(SearchrequestExample searchrequestQueryCondition) {
		SearchrequestMapper mapperImpl = this.getSqlSession().getMapper(SearchrequestMapper.class);
		return mapperImpl.selectByExample(searchrequestQueryCondition);
	}
	
	/**
	 * <param name="searchrequestQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SearchrequestWithBLOBs> searchrequestSelectObjectsWithBLOBs(SearchrequestExample searchrequestQueryCondition) {
		SearchrequestMapper mapperImpl = this.getSqlSession().getMapper(SearchrequestMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(searchrequestQueryCondition);
	}
	
	/**
	 * <param name="searchrequestQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int searchrequestQuerySelectObjectsCount(SearchrequestExample searchrequestQueryCondition) {
		SearchrequestMapper mapperImpl = this.getSqlSession().getMapper(SearchrequestMapper.class);
		return mapperImpl.countByExample(searchrequestQueryCondition);
	}
	
	/**
	 * 插入一个对象SequenceValueItem到数据库中
	 * <param name="SequenceValueItem">需要插入的SequenceValueItem</param>
	 */
	protected int sequenceValueItemInsert(SequenceValueItem sequenceValueItem) {
		SequenceValueItemMapper mapperImpl = this.getSqlSession().getMapper(SequenceValueItemMapper.class);
		return mapperImpl.insertSelective(sequenceValueItem);
	}
	
	/**
	 * 更新一个对象SequenceValueItem到数据库中
	 * <param name="sequenceValueItem">需要更新的SequenceValueItem</param>
	 */
	protected int sequenceValueItemUpdate(SequenceValueItem sequenceValueItem) {
		SequenceValueItemMapper mapperImpl = this.getSqlSession().getMapper(SequenceValueItemMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(sequenceValueItem);
		return ret;
	}
	
	/**
	 * 更新一个对象SequenceValueItem到数据库中
	 * <param name="sequenceValueItem">需要更新的SequenceValueItem</param>
	 */
	protected int sequenceValueItemUpdateSelective(SequenceValueItem sequenceValueItem) {
		SequenceValueItemMapper mapperImpl = this.getSqlSession().getMapper(SequenceValueItemMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(sequenceValueItem);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象SequenceValueItem到数据库中
	 * <param name="sequenceValueItem">需要更新的SequenceValueItem</param>
	 * <param name="sequenceValueItemQueryCondition">附加的条件</param>
	 */
	protected int sequenceValueItemUpdateByCondition(SequenceValueItem sequenceValueItem, SequenceValueItemExample sequenceValueItemQueryCondition) {
		SequenceValueItemMapper mapperImpl = this.getSqlSession().getMapper(SequenceValueItemMapper.class);
		int ret = mapperImpl.updateByExample(sequenceValueItem, sequenceValueItemQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息SequenceValueItem到数据库中
	 * <param name="sequenceValueItem">需要更新的SequenceValueItem</param>
	 * <param name="sequenceValueItemQueryCondition">附加的条件</param>
	 */
	protected int sequenceValueItemUpdateSelectiveByCondition(SequenceValueItem sequenceValueItem, SequenceValueItemExample sequenceValueItemQueryCondition) {
		SequenceValueItemMapper mapperImpl = this.getSqlSession().getMapper(SequenceValueItemMapper.class);
		int ret = mapperImpl.updateByExampleSelective(sequenceValueItem, sequenceValueItemQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="sequenceValueItem">从数据库中删除一个对象SequenceValueItem</param>
	 * <param name="ASeqName"></param>
	 */
	protected int sequenceValueItemDeleteByPrimaryKey(String ASeqName) {
		SequenceValueItemMapper mapperImpl = this.getSqlSession().getMapper(SequenceValueItemMapper.class);
		return mapperImpl.deleteByPrimaryKey(ASeqName);
	}
	
	/**
	 * <param name="sequenceValueItem">从数据库中删除一个对象SequenceValueItem</param>
	 */
	protected int sequenceValueItemDeleteByCondition(SequenceValueItemExample sequenceValueItemQueryCondition) {
		SequenceValueItemMapper mapperImpl = this.getSqlSession().getMapper(SequenceValueItemMapper.class);
		return mapperImpl.deleteByExample(sequenceValueItemQueryCondition);
	}
	
	/**
	 * <param name="sequenceValueItem">从数据库中查询一个对象SequenceValueItem</param>
	 * <param name="ASeqName"></param>
	 */
	protected SequenceValueItem sequenceValueItemSelectByPrimaryKey(String ASeqName) {
		SequenceValueItemMapper mapperImpl = this.getSqlSession().getMapper(SequenceValueItemMapper.class);
		return mapperImpl.selectByPrimaryKey(ASeqName);
	}
	
	/**
	 * <param name="sequenceValueItemQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SequenceValueItem> sequenceValueItemSelectObjects(SequenceValueItemExample sequenceValueItemQueryCondition) {
		SequenceValueItemMapper mapperImpl = this.getSqlSession().getMapper(SequenceValueItemMapper.class);
		return mapperImpl.selectByExample(sequenceValueItemQueryCondition);
	}
	
	/**
	 * <param name="sequenceValueItemQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int sequenceValueItemQuerySelectObjectsCount(SequenceValueItemExample sequenceValueItemQueryCondition) {
		SequenceValueItemMapper mapperImpl = this.getSqlSession().getMapper(SequenceValueItemMapper.class);
		return mapperImpl.countByExample(sequenceValueItemQueryCondition);
	}
	
	/**
	 * 插入一个对象Serviceconfig到数据库中
	 * <param name="Serviceconfig">需要插入的Serviceconfig</param>
	 */
	protected int serviceconfigInsert(Serviceconfig serviceconfig) {
		ServiceconfigMapper mapperImpl = this.getSqlSession().getMapper(ServiceconfigMapper.class);
		return mapperImpl.insertSelective(serviceconfig);
	}
	
	/**
	 * 更新一个对象Serviceconfig到数据库中
	 * <param name="serviceconfig">需要更新的Serviceconfig</param>
	 */
	protected int serviceconfigUpdate(Serviceconfig serviceconfig) {
		ServiceconfigMapper mapperImpl = this.getSqlSession().getMapper(ServiceconfigMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(serviceconfig);
		return ret;
	}
	
	/**
	 * 更新一个对象Serviceconfig到数据库中
	 * <param name="serviceconfig">需要更新的Serviceconfig</param>
	 */
	protected int serviceconfigUpdateSelective(Serviceconfig serviceconfig) {
		ServiceconfigMapper mapperImpl = this.getSqlSession().getMapper(ServiceconfigMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(serviceconfig);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Serviceconfig到数据库中
	 * <param name="serviceconfig">需要更新的Serviceconfig</param>
	 * <param name="serviceconfigQueryCondition">附加的条件</param>
	 */
	protected int serviceconfigUpdateByCondition(Serviceconfig serviceconfig, ServiceconfigExample serviceconfigQueryCondition) {
		ServiceconfigMapper mapperImpl = this.getSqlSession().getMapper(ServiceconfigMapper.class);
		int ret = mapperImpl.updateByExample(serviceconfig, serviceconfigQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Serviceconfig到数据库中
	 * <param name="serviceconfig">需要更新的Serviceconfig</param>
	 * <param name="serviceconfigQueryCondition">附加的条件</param>
	 */
	protected int serviceconfigUpdateSelectiveByCondition(Serviceconfig serviceconfig, ServiceconfigExample serviceconfigQueryCondition) {
		ServiceconfigMapper mapperImpl = this.getSqlSession().getMapper(ServiceconfigMapper.class);
		int ret = mapperImpl.updateByExampleSelective(serviceconfig, serviceconfigQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="serviceconfig">从数据库中删除一个对象Serviceconfig</param>
	 * <param name="AId"></param>
	 */
	protected int serviceconfigDeleteByPrimaryKey(long AId) {
		ServiceconfigMapper mapperImpl = this.getSqlSession().getMapper(ServiceconfigMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="serviceconfig">从数据库中删除一个对象Serviceconfig</param>
	 */
	protected int serviceconfigDeleteByCondition(ServiceconfigExample serviceconfigQueryCondition) {
		ServiceconfigMapper mapperImpl = this.getSqlSession().getMapper(ServiceconfigMapper.class);
		return mapperImpl.deleteByExample(serviceconfigQueryCondition);
	}
	
	/**
	 * <param name="serviceconfig">从数据库中查询一个对象Serviceconfig</param>
	 * <param name="AId"></param>
	 */
	protected Serviceconfig serviceconfigSelectByPrimaryKey(long AId) {
		ServiceconfigMapper mapperImpl = this.getSqlSession().getMapper(ServiceconfigMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="serviceconfigQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Serviceconfig> serviceconfigSelectObjects(ServiceconfigExample serviceconfigQueryCondition) {
		ServiceconfigMapper mapperImpl = this.getSqlSession().getMapper(ServiceconfigMapper.class);
		return mapperImpl.selectByExample(serviceconfigQueryCondition);
	}
	
	/**
	 * <param name="serviceconfigQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int serviceconfigQuerySelectObjectsCount(ServiceconfigExample serviceconfigQueryCondition) {
		ServiceconfigMapper mapperImpl = this.getSqlSession().getMapper(ServiceconfigMapper.class);
		return mapperImpl.countByExample(serviceconfigQueryCondition);
	}
	
	/**
	 * 插入一个对象Sharepermissions到数据库中
	 * <param name="Sharepermissions">需要插入的Sharepermissions</param>
	 */
	protected int sharepermissionsInsert(Sharepermissions sharepermissions) {
		SharepermissionsMapper mapperImpl = this.getSqlSession().getMapper(SharepermissionsMapper.class);
		return mapperImpl.insertSelective(sharepermissions);
	}
	
	/**
	 * 更新一个对象Sharepermissions到数据库中
	 * <param name="sharepermissions">需要更新的Sharepermissions</param>
	 */
	protected int sharepermissionsUpdate(Sharepermissions sharepermissions) {
		SharepermissionsMapper mapperImpl = this.getSqlSession().getMapper(SharepermissionsMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(sharepermissions);
		return ret;
	}
	
	/**
	 * 更新一个对象Sharepermissions到数据库中
	 * <param name="sharepermissions">需要更新的Sharepermissions</param>
	 */
	protected int sharepermissionsUpdateSelective(Sharepermissions sharepermissions) {
		SharepermissionsMapper mapperImpl = this.getSqlSession().getMapper(SharepermissionsMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(sharepermissions);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Sharepermissions到数据库中
	 * <param name="sharepermissions">需要更新的Sharepermissions</param>
	 * <param name="sharepermissionsQueryCondition">附加的条件</param>
	 */
	protected int sharepermissionsUpdateByCondition(Sharepermissions sharepermissions, SharepermissionsExample sharepermissionsQueryCondition) {
		SharepermissionsMapper mapperImpl = this.getSqlSession().getMapper(SharepermissionsMapper.class);
		int ret = mapperImpl.updateByExample(sharepermissions, sharepermissionsQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Sharepermissions到数据库中
	 * <param name="sharepermissions">需要更新的Sharepermissions</param>
	 * <param name="sharepermissionsQueryCondition">附加的条件</param>
	 */
	protected int sharepermissionsUpdateSelectiveByCondition(Sharepermissions sharepermissions, SharepermissionsExample sharepermissionsQueryCondition) {
		SharepermissionsMapper mapperImpl = this.getSqlSession().getMapper(SharepermissionsMapper.class);
		int ret = mapperImpl.updateByExampleSelective(sharepermissions, sharepermissionsQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="sharepermissions">从数据库中删除一个对象Sharepermissions</param>
	 * <param name="AId"></param>
	 */
	protected int sharepermissionsDeleteByPrimaryKey(long AId) {
		SharepermissionsMapper mapperImpl = this.getSqlSession().getMapper(SharepermissionsMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="sharepermissions">从数据库中删除一个对象Sharepermissions</param>
	 */
	protected int sharepermissionsDeleteByCondition(SharepermissionsExample sharepermissionsQueryCondition) {
		SharepermissionsMapper mapperImpl = this.getSqlSession().getMapper(SharepermissionsMapper.class);
		return mapperImpl.deleteByExample(sharepermissionsQueryCondition);
	}
	
	/**
	 * <param name="sharepermissions">从数据库中查询一个对象Sharepermissions</param>
	 * <param name="AId"></param>
	 */
	protected Sharepermissions sharepermissionsSelectByPrimaryKey(long AId) {
		SharepermissionsMapper mapperImpl = this.getSqlSession().getMapper(SharepermissionsMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="sharepermissionsQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Sharepermissions> sharepermissionsSelectObjects(SharepermissionsExample sharepermissionsQueryCondition) {
		SharepermissionsMapper mapperImpl = this.getSqlSession().getMapper(SharepermissionsMapper.class);
		return mapperImpl.selectByExample(sharepermissionsQueryCondition);
	}
	
	/**
	 * <param name="sharepermissionsQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int sharepermissionsQuerySelectObjectsCount(SharepermissionsExample sharepermissionsQueryCondition) {
		SharepermissionsMapper mapperImpl = this.getSqlSession().getMapper(SharepermissionsMapper.class);
		return mapperImpl.countByExample(sharepermissionsQueryCondition);
	}
	
	/**
	 * 插入一个对象TrackbackPing到数据库中
	 * <param name="TrackbackPing">需要插入的TrackbackPing</param>
	 */
	protected int trackbackPingInsert(TrackbackPing trackbackPing) {
		TrackbackPingMapper mapperImpl = this.getSqlSession().getMapper(TrackbackPingMapper.class);
		return mapperImpl.insertSelective(trackbackPing);
	}
	
	/**
	 * 更新一个对象TrackbackPing到数据库中
	 * <param name="trackbackPing">需要更新的TrackbackPing</param>
	 */
	protected int trackbackPingUpdate(TrackbackPing trackbackPing) {
		TrackbackPingMapper mapperImpl = this.getSqlSession().getMapper(TrackbackPingMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(trackbackPing);
		return ret;
	}
	
	/**
	 * 更新一个对象TrackbackPing到数据库中
	 * <param name="trackbackPing">需要更新的TrackbackPing</param>
	 */
	protected int trackbackPingUpdateSelective(TrackbackPing trackbackPing) {
		TrackbackPingMapper mapperImpl = this.getSqlSession().getMapper(TrackbackPingMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(trackbackPing);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象TrackbackPing到数据库中
	 * <param name="trackbackPing">需要更新的TrackbackPing</param>
	 * <param name="trackbackPingQueryCondition">附加的条件</param>
	 */
	protected int trackbackPingUpdateByCondition(TrackbackPing trackbackPing, TrackbackPingExample trackbackPingQueryCondition) {
		TrackbackPingMapper mapperImpl = this.getSqlSession().getMapper(TrackbackPingMapper.class);
		int ret = mapperImpl.updateByExample(trackbackPing, trackbackPingQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息TrackbackPing到数据库中
	 * <param name="trackbackPing">需要更新的TrackbackPing</param>
	 * <param name="trackbackPingQueryCondition">附加的条件</param>
	 */
	protected int trackbackPingUpdateSelectiveByCondition(TrackbackPing trackbackPing, TrackbackPingExample trackbackPingQueryCondition) {
		TrackbackPingMapper mapperImpl = this.getSqlSession().getMapper(TrackbackPingMapper.class);
		int ret = mapperImpl.updateByExampleSelective(trackbackPing, trackbackPingQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="trackbackPing">从数据库中删除一个对象TrackbackPing</param>
	 * <param name="AId"></param>
	 */
	protected int trackbackPingDeleteByPrimaryKey(long AId) {
		TrackbackPingMapper mapperImpl = this.getSqlSession().getMapper(TrackbackPingMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="trackbackPing">从数据库中删除一个对象TrackbackPing</param>
	 */
	protected int trackbackPingDeleteByCondition(TrackbackPingExample trackbackPingQueryCondition) {
		TrackbackPingMapper mapperImpl = this.getSqlSession().getMapper(TrackbackPingMapper.class);
		return mapperImpl.deleteByExample(trackbackPingQueryCondition);
	}
	
	/**
	 * <param name="trackbackPing">从数据库中查询一个对象TrackbackPing</param>
	 * <param name="AId"></param>
	 */
	protected TrackbackPing trackbackPingSelectByPrimaryKey(long AId) {
		TrackbackPingMapper mapperImpl = this.getSqlSession().getMapper(TrackbackPingMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="trackbackPingQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<TrackbackPing> trackbackPingSelectObjects(TrackbackPingExample trackbackPingQueryCondition) {
		TrackbackPingMapper mapperImpl = this.getSqlSession().getMapper(TrackbackPingMapper.class);
		return mapperImpl.selectByExample(trackbackPingQueryCondition);
	}
	
	/**
	 * <param name="trackbackPingQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int trackbackPingQuerySelectObjectsCount(TrackbackPingExample trackbackPingQueryCondition) {
		TrackbackPingMapper mapperImpl = this.getSqlSession().getMapper(TrackbackPingMapper.class);
		return mapperImpl.countByExample(trackbackPingQueryCondition);
	}
	
	/**
	 * 插入一个对象TrustedappWithBLOBs到数据库中
	 * <param name="TrustedappWithBLOBs">需要插入的TrustedappWithBLOBs</param>
	 */
	protected int trustedappInsert(TrustedappWithBLOBs trustedapp) {
		TrustedappMapper mapperImpl = this.getSqlSession().getMapper(TrustedappMapper.class);
		return mapperImpl.insertSelective(trustedapp);
	}
	
	/**
	 * 更新一个对象Trustedapp到数据库中
	 * <param name="trustedapp">需要更新的Trustedapp</param>
	 */
	protected int trustedappUpdate(Trustedapp trustedapp) {
		TrustedappMapper mapperImpl = this.getSqlSession().getMapper(TrustedappMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(trustedapp);
		return ret;
	}
	
	/**
	 * 更新一个对象Trustedapp到数据库中
	 * <param name="trustedapp">需要更新的Trustedapp</param>
	 */
	protected int trustedappUpdateSelective(TrustedappWithBLOBs trustedapp) {
		TrustedappMapper mapperImpl = this.getSqlSession().getMapper(TrustedappMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(trustedapp);
		return ret;
	}
	
	/**
	 * 更新一个对象TrustedappWithBLOBs到数据库中
	 * <param name="trustedapp">需要更新的Trustedapp</param>
	 */
	public int trustedappUpdateWithBlobs(TrustedappWithBLOBs trustedapp) {
		TrustedappMapper mapperImpl = this.getSqlSession().getMapper(TrustedappMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(trustedapp);
	}
	
	/**
	 * 根据条件更新一批对象Trustedapp到数据库中
	 * <param name="trustedapp">需要更新的Trustedapp</param>
	 * <param name="trustedappQueryCondition">附加的条件</param>
	 */
	protected int trustedappUpdateByCondition(Trustedapp trustedapp, TrustedappExample trustedappQueryCondition) {
		TrustedappMapper mapperImpl = this.getSqlSession().getMapper(TrustedappMapper.class);
		int ret = mapperImpl.updateByExample(trustedapp, trustedappQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Trustedapp到数据库中
	 * <param name="trustedapp">需要更新的Trustedapp</param>
	 * <param name="trustedappQueryCondition">附加的条件</param>
	 */
	protected int trustedappUpdateSelectiveByCondition(TrustedappWithBLOBs trustedapp, TrustedappExample trustedappQueryCondition) {
		TrustedappMapper mapperImpl = this.getSqlSession().getMapper(TrustedappMapper.class);
		int ret = mapperImpl.updateByExampleSelective(trustedapp, trustedappQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="trustedapp">从数据库中删除一个对象Trustedapp</param>
	 * <param name="AId"></param>
	 */
	protected int trustedappDeleteByPrimaryKey(long AId) {
		TrustedappMapper mapperImpl = this.getSqlSession().getMapper(TrustedappMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="trustedapp">从数据库中删除一个对象Trustedapp</param>
	 */
	protected int trustedappDeleteByCondition(TrustedappExample trustedappQueryCondition) {
		TrustedappMapper mapperImpl = this.getSqlSession().getMapper(TrustedappMapper.class);
		return mapperImpl.deleteByExample(trustedappQueryCondition);
	}
	
	/**
	 * <param name="trustedapp">从数据库中查询一个对象TrustedappWithBLOBs</param>
	 * <param name="AId"></param>
	 */
	protected TrustedappWithBLOBs trustedappSelectByPrimaryKey(long AId) {
		TrustedappMapper mapperImpl = this.getSqlSession().getMapper(TrustedappMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="trustedappQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Trustedapp> trustedappSelectObjects(TrustedappExample trustedappQueryCondition) {
		TrustedappMapper mapperImpl = this.getSqlSession().getMapper(TrustedappMapper.class);
		return mapperImpl.selectByExample(trustedappQueryCondition);
	}
	
	/**
	 * <param name="trustedappQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<TrustedappWithBLOBs> trustedappSelectObjectsWithBLOBs(TrustedappExample trustedappQueryCondition) {
		TrustedappMapper mapperImpl = this.getSqlSession().getMapper(TrustedappMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(trustedappQueryCondition);
	}
	
	/**
	 * <param name="trustedappQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int trustedappQuerySelectObjectsCount(TrustedappExample trustedappQueryCondition) {
		TrustedappMapper mapperImpl = this.getSqlSession().getMapper(TrustedappMapper.class);
		return mapperImpl.countByExample(trustedappQueryCondition);
	}
	
	/**
	 * 插入一个对象Upgradehistory到数据库中
	 * <param name="Upgradehistory">需要插入的Upgradehistory</param>
	 */
	protected int upgradehistoryInsert(Upgradehistory upgradehistory) {
		UpgradehistoryMapper mapperImpl = this.getSqlSession().getMapper(UpgradehistoryMapper.class);
		return mapperImpl.insertSelective(upgradehistory);
	}
	
	/**
	 * 更新一个对象Upgradehistory到数据库中
	 * <param name="upgradehistory">需要更新的Upgradehistory</param>
	 */
	protected int upgradehistoryUpdate(Upgradehistory upgradehistory) {
		UpgradehistoryMapper mapperImpl = this.getSqlSession().getMapper(UpgradehistoryMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(upgradehistory);
		return ret;
	}
	
	/**
	 * 更新一个对象Upgradehistory到数据库中
	 * <param name="upgradehistory">需要更新的Upgradehistory</param>
	 */
	protected int upgradehistoryUpdateSelective(Upgradehistory upgradehistory) {
		UpgradehistoryMapper mapperImpl = this.getSqlSession().getMapper(UpgradehistoryMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(upgradehistory);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Upgradehistory到数据库中
	 * <param name="upgradehistory">需要更新的Upgradehistory</param>
	 * <param name="upgradehistoryQueryCondition">附加的条件</param>
	 */
	protected int upgradehistoryUpdateByCondition(Upgradehistory upgradehistory, UpgradehistoryExample upgradehistoryQueryCondition) {
		UpgradehistoryMapper mapperImpl = this.getSqlSession().getMapper(UpgradehistoryMapper.class);
		int ret = mapperImpl.updateByExample(upgradehistory, upgradehistoryQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Upgradehistory到数据库中
	 * <param name="upgradehistory">需要更新的Upgradehistory</param>
	 * <param name="upgradehistoryQueryCondition">附加的条件</param>
	 */
	protected int upgradehistoryUpdateSelectiveByCondition(Upgradehistory upgradehistory, UpgradehistoryExample upgradehistoryQueryCondition) {
		UpgradehistoryMapper mapperImpl = this.getSqlSession().getMapper(UpgradehistoryMapper.class);
		int ret = mapperImpl.updateByExampleSelective(upgradehistory, upgradehistoryQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="upgradehistory">从数据库中删除一个对象Upgradehistory</param>
	 * <param name="AUpgradeclass"></param>
	 */
	protected int upgradehistoryDeleteByPrimaryKey(String AUpgradeclass) {
		UpgradehistoryMapper mapperImpl = this.getSqlSession().getMapper(UpgradehistoryMapper.class);
		return mapperImpl.deleteByPrimaryKey(AUpgradeclass);
	}
	
	/**
	 * <param name="upgradehistory">从数据库中删除一个对象Upgradehistory</param>
	 */
	protected int upgradehistoryDeleteByCondition(UpgradehistoryExample upgradehistoryQueryCondition) {
		UpgradehistoryMapper mapperImpl = this.getSqlSession().getMapper(UpgradehistoryMapper.class);
		return mapperImpl.deleteByExample(upgradehistoryQueryCondition);
	}
	
	/**
	 * <param name="upgradehistory">从数据库中查询一个对象Upgradehistory</param>
	 * <param name="AUpgradeclass"></param>
	 */
	protected Upgradehistory upgradehistorySelectByPrimaryKey(String AUpgradeclass) {
		UpgradehistoryMapper mapperImpl = this.getSqlSession().getMapper(UpgradehistoryMapper.class);
		return mapperImpl.selectByPrimaryKey(AUpgradeclass);
	}
	
	/**
	 * <param name="upgradehistoryQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Upgradehistory> upgradehistorySelectObjects(UpgradehistoryExample upgradehistoryQueryCondition) {
		UpgradehistoryMapper mapperImpl = this.getSqlSession().getMapper(UpgradehistoryMapper.class);
		return mapperImpl.selectByExample(upgradehistoryQueryCondition);
	}
	
	/**
	 * <param name="upgradehistoryQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int upgradehistoryQuerySelectObjectsCount(UpgradehistoryExample upgradehistoryQueryCondition) {
		UpgradehistoryMapper mapperImpl = this.getSqlSession().getMapper(UpgradehistoryMapper.class);
		return mapperImpl.countByExample(upgradehistoryQueryCondition);
	}
	
	/**
	 * 插入一个对象Upgradeversionhistory到数据库中
	 * <param name="Upgradeversionhistory">需要插入的Upgradeversionhistory</param>
	 */
	protected int upgradeversionhistoryInsert(Upgradeversionhistory upgradeversionhistory) {
		UpgradeversionhistoryMapper mapperImpl = this.getSqlSession().getMapper(UpgradeversionhistoryMapper.class);
		return mapperImpl.insertSelective(upgradeversionhistory);
	}
	
	/**
	 * 更新一个对象Upgradeversionhistory到数据库中
	 * <param name="upgradeversionhistory">需要更新的Upgradeversionhistory</param>
	 */
	protected int upgradeversionhistoryUpdate(Upgradeversionhistory upgradeversionhistory) {
		UpgradeversionhistoryMapper mapperImpl = this.getSqlSession().getMapper(UpgradeversionhistoryMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(upgradeversionhistory);
		return ret;
	}
	
	/**
	 * 更新一个对象Upgradeversionhistory到数据库中
	 * <param name="upgradeversionhistory">需要更新的Upgradeversionhistory</param>
	 */
	protected int upgradeversionhistoryUpdateSelective(Upgradeversionhistory upgradeversionhistory) {
		UpgradeversionhistoryMapper mapperImpl = this.getSqlSession().getMapper(UpgradeversionhistoryMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(upgradeversionhistory);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Upgradeversionhistory到数据库中
	 * <param name="upgradeversionhistory">需要更新的Upgradeversionhistory</param>
	 * <param name="upgradeversionhistoryQueryCondition">附加的条件</param>
	 */
	protected int upgradeversionhistoryUpdateByCondition(Upgradeversionhistory upgradeversionhistory, UpgradeversionhistoryExample upgradeversionhistoryQueryCondition) {
		UpgradeversionhistoryMapper mapperImpl = this.getSqlSession().getMapper(UpgradeversionhistoryMapper.class);
		int ret = mapperImpl.updateByExample(upgradeversionhistory, upgradeversionhistoryQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Upgradeversionhistory到数据库中
	 * <param name="upgradeversionhistory">需要更新的Upgradeversionhistory</param>
	 * <param name="upgradeversionhistoryQueryCondition">附加的条件</param>
	 */
	protected int upgradeversionhistoryUpdateSelectiveByCondition(Upgradeversionhistory upgradeversionhistory, UpgradeversionhistoryExample upgradeversionhistoryQueryCondition) {
		UpgradeversionhistoryMapper mapperImpl = this.getSqlSession().getMapper(UpgradeversionhistoryMapper.class);
		int ret = mapperImpl.updateByExampleSelective(upgradeversionhistory, upgradeversionhistoryQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="upgradeversionhistory">从数据库中删除一个对象Upgradeversionhistory</param>
	 * <param name="ATargetbuild"></param>
	 */
	protected int upgradeversionhistoryDeleteByPrimaryKey(String ATargetbuild) {
		UpgradeversionhistoryMapper mapperImpl = this.getSqlSession().getMapper(UpgradeversionhistoryMapper.class);
		return mapperImpl.deleteByPrimaryKey(ATargetbuild);
	}
	
	/**
	 * <param name="upgradeversionhistory">从数据库中删除一个对象Upgradeversionhistory</param>
	 */
	protected int upgradeversionhistoryDeleteByCondition(UpgradeversionhistoryExample upgradeversionhistoryQueryCondition) {
		UpgradeversionhistoryMapper mapperImpl = this.getSqlSession().getMapper(UpgradeversionhistoryMapper.class);
		return mapperImpl.deleteByExample(upgradeversionhistoryQueryCondition);
	}
	
	/**
	 * <param name="upgradeversionhistory">从数据库中查询一个对象Upgradeversionhistory</param>
	 * <param name="ATargetbuild"></param>
	 */
	protected Upgradeversionhistory upgradeversionhistorySelectByPrimaryKey(String ATargetbuild) {
		UpgradeversionhistoryMapper mapperImpl = this.getSqlSession().getMapper(UpgradeversionhistoryMapper.class);
		return mapperImpl.selectByPrimaryKey(ATargetbuild);
	}
	
	/**
	 * <param name="upgradeversionhistoryQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Upgradeversionhistory> upgradeversionhistorySelectObjects(UpgradeversionhistoryExample upgradeversionhistoryQueryCondition) {
		UpgradeversionhistoryMapper mapperImpl = this.getSqlSession().getMapper(UpgradeversionhistoryMapper.class);
		return mapperImpl.selectByExample(upgradeversionhistoryQueryCondition);
	}
	
	/**
	 * <param name="upgradeversionhistoryQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int upgradeversionhistoryQuerySelectObjectsCount(UpgradeversionhistoryExample upgradeversionhistoryQueryCondition) {
		UpgradeversionhistoryMapper mapperImpl = this.getSqlSession().getMapper(UpgradeversionhistoryMapper.class);
		return mapperImpl.countByExample(upgradeversionhistoryQueryCondition);
	}
	
	/**
	 * 插入一个对象Userassociation到数据库中
	 * <param name="Userassociation">需要插入的Userassociation</param>
	 */
	protected int userassociationInsert(Userassociation userassociation) {
		UserassociationMapper mapperImpl = this.getSqlSession().getMapper(UserassociationMapper.class);
		return mapperImpl.insertSelective(userassociation);
	}
	
	/**
	 * 更新一个对象Userassociation到数据库中
	 * <param name="userassociation">需要更新的Userassociation</param>
	 */
	protected int userassociationUpdate(Userassociation userassociation) {
		UserassociationMapper mapperImpl = this.getSqlSession().getMapper(UserassociationMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(userassociation);
		return ret;
	}
	
	/**
	 * 更新一个对象Userassociation到数据库中
	 * <param name="userassociation">需要更新的Userassociation</param>
	 */
	protected int userassociationUpdateSelective(Userassociation userassociation) {
		UserassociationMapper mapperImpl = this.getSqlSession().getMapper(UserassociationMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(userassociation);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Userassociation到数据库中
	 * <param name="userassociation">需要更新的Userassociation</param>
	 * <param name="userassociationQueryCondition">附加的条件</param>
	 */
	protected int userassociationUpdateByCondition(Userassociation userassociation, UserassociationExample userassociationQueryCondition) {
		UserassociationMapper mapperImpl = this.getSqlSession().getMapper(UserassociationMapper.class);
		int ret = mapperImpl.updateByExample(userassociation, userassociationQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Userassociation到数据库中
	 * <param name="userassociation">需要更新的Userassociation</param>
	 * <param name="userassociationQueryCondition">附加的条件</param>
	 */
	protected int userassociationUpdateSelectiveByCondition(Userassociation userassociation, UserassociationExample userassociationQueryCondition) {
		UserassociationMapper mapperImpl = this.getSqlSession().getMapper(UserassociationMapper.class);
		int ret = mapperImpl.updateByExampleSelective(userassociation, userassociationQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="userassociation">从数据库中删除一个对象Userassociation</param>
	 * <param name="AUserassociationKey"> 主键类</param>
	 */
	protected int userassociationDeleteByPrimaryKey(UserassociationKey AUserassociationKey) {
		UserassociationMapper mapperImpl = this.getSqlSession().getMapper(UserassociationMapper.class);
		return mapperImpl.deleteByPrimaryKey(AUserassociationKey);
	}
	
	/**
	 * <param name="userassociation">从数据库中删除一个对象Userassociation</param>
	 */
	protected int userassociationDeleteByCondition(UserassociationExample userassociationQueryCondition) {
		UserassociationMapper mapperImpl = this.getSqlSession().getMapper(UserassociationMapper.class);
		return mapperImpl.deleteByExample(userassociationQueryCondition);
	}
	
	/**
	 * <param name="userassociation">从数据库中查询一个对象Userassociation</param>
	 * <param name="AUserassociationKey"> 主键类</param>
	 */
	protected Userassociation userassociationSelectByPrimaryKey(UserassociationKey AUserassociationKey) {
		UserassociationMapper mapperImpl = this.getSqlSession().getMapper(UserassociationMapper.class);
		return mapperImpl.selectByPrimaryKey(AUserassociationKey);
	}
	
	/**
	 * <param name="userassociationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Userassociation> userassociationSelectObjects(UserassociationExample userassociationQueryCondition) {
		UserassociationMapper mapperImpl = this.getSqlSession().getMapper(UserassociationMapper.class);
		return mapperImpl.selectByExample(userassociationQueryCondition);
	}
	
	/**
	 * <param name="userassociationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int userassociationQuerySelectObjectsCount(UserassociationExample userassociationQueryCondition) {
		UserassociationMapper mapperImpl = this.getSqlSession().getMapper(UserassociationMapper.class);
		return mapperImpl.countByExample(userassociationQueryCondition);
	}
	
	/**
	 * 插入一个对象Userbase到数据库中
	 * <param name="Userbase">需要插入的Userbase</param>
	 */
	protected int userbaseInsert(Userbase userbase) {
		UserbaseMapper mapperImpl = this.getSqlSession().getMapper(UserbaseMapper.class);
		return mapperImpl.insertSelective(userbase);
	}
	
	/**
	 * 更新一个对象Userbase到数据库中
	 * <param name="userbase">需要更新的Userbase</param>
	 */
	protected int userbaseUpdate(Userbase userbase) {
		UserbaseMapper mapperImpl = this.getSqlSession().getMapper(UserbaseMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(userbase);
		return ret;
	}
	
	/**
	 * 更新一个对象Userbase到数据库中
	 * <param name="userbase">需要更新的Userbase</param>
	 */
	protected int userbaseUpdateSelective(Userbase userbase) {
		UserbaseMapper mapperImpl = this.getSqlSession().getMapper(UserbaseMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(userbase);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Userbase到数据库中
	 * <param name="userbase">需要更新的Userbase</param>
	 * <param name="userbaseQueryCondition">附加的条件</param>
	 */
	protected int userbaseUpdateByCondition(Userbase userbase, UserbaseExample userbaseQueryCondition) {
		UserbaseMapper mapperImpl = this.getSqlSession().getMapper(UserbaseMapper.class);
		int ret = mapperImpl.updateByExample(userbase, userbaseQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Userbase到数据库中
	 * <param name="userbase">需要更新的Userbase</param>
	 * <param name="userbaseQueryCondition">附加的条件</param>
	 */
	protected int userbaseUpdateSelectiveByCondition(Userbase userbase, UserbaseExample userbaseQueryCondition) {
		UserbaseMapper mapperImpl = this.getSqlSession().getMapper(UserbaseMapper.class);
		int ret = mapperImpl.updateByExampleSelective(userbase, userbaseQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="userbase">从数据库中删除一个对象Userbase</param>
	 * <param name="AId"></param>
	 */
	protected int userbaseDeleteByPrimaryKey(long AId) {
		UserbaseMapper mapperImpl = this.getSqlSession().getMapper(UserbaseMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="userbase">从数据库中删除一个对象Userbase</param>
	 */
	protected int userbaseDeleteByCondition(UserbaseExample userbaseQueryCondition) {
		UserbaseMapper mapperImpl = this.getSqlSession().getMapper(UserbaseMapper.class);
		return mapperImpl.deleteByExample(userbaseQueryCondition);
	}
	
	/**
	 * <param name="userbase">从数据库中查询一个对象Userbase</param>
	 * <param name="AId"></param>
	 */
	protected Userbase userbaseSelectByPrimaryKey(long AId) {
		UserbaseMapper mapperImpl = this.getSqlSession().getMapper(UserbaseMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="userbaseQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Userbase> userbaseSelectObjects(UserbaseExample userbaseQueryCondition) {
		UserbaseMapper mapperImpl = this.getSqlSession().getMapper(UserbaseMapper.class);
		return mapperImpl.selectByExample(userbaseQueryCondition);
	}
	
	/**
	 * <param name="userbaseQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int userbaseQuerySelectObjectsCount(UserbaseExample userbaseQueryCondition) {
		UserbaseMapper mapperImpl = this.getSqlSession().getMapper(UserbaseMapper.class);
		return mapperImpl.countByExample(userbaseQueryCondition);
	}
	
	/**
	 * 插入一个对象Userhistoryitem到数据库中
	 * <param name="Userhistoryitem">需要插入的Userhistoryitem</param>
	 */
	protected int userhistoryitemInsert(Userhistoryitem userhistoryitem) {
		UserhistoryitemMapper mapperImpl = this.getSqlSession().getMapper(UserhistoryitemMapper.class);
		return mapperImpl.insertSelective(userhistoryitem);
	}
	
	/**
	 * 更新一个对象Userhistoryitem到数据库中
	 * <param name="userhistoryitem">需要更新的Userhistoryitem</param>
	 */
	protected int userhistoryitemUpdate(Userhistoryitem userhistoryitem) {
		UserhistoryitemMapper mapperImpl = this.getSqlSession().getMapper(UserhistoryitemMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(userhistoryitem);
		return ret;
	}
	
	/**
	 * 更新一个对象Userhistoryitem到数据库中
	 * <param name="userhistoryitem">需要更新的Userhistoryitem</param>
	 */
	protected int userhistoryitemUpdateSelective(Userhistoryitem userhistoryitem) {
		UserhistoryitemMapper mapperImpl = this.getSqlSession().getMapper(UserhistoryitemMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(userhistoryitem);
		return ret;
	}
	
	/**
	 * 更新一个对象Userhistoryitem到数据库中
	 * <param name="userhistoryitem">需要更新的Userhistoryitem</param>
	 */
	public int userhistoryitemUpdateWithBlobs(Userhistoryitem userhistoryitem) {
		UserhistoryitemMapper mapperImpl = this.getSqlSession().getMapper(UserhistoryitemMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(userhistoryitem);
	}
	
	/**
	 * 根据条件更新一批对象Userhistoryitem到数据库中
	 * <param name="userhistoryitem">需要更新的Userhistoryitem</param>
	 * <param name="userhistoryitemQueryCondition">附加的条件</param>
	 */
	protected int userhistoryitemUpdateByCondition(Userhistoryitem userhistoryitem, UserhistoryitemExample userhistoryitemQueryCondition) {
		UserhistoryitemMapper mapperImpl = this.getSqlSession().getMapper(UserhistoryitemMapper.class);
		int ret = mapperImpl.updateByExample(userhistoryitem, userhistoryitemQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Userhistoryitem到数据库中
	 * <param name="userhistoryitem">需要更新的Userhistoryitem</param>
	 * <param name="userhistoryitemQueryCondition">附加的条件</param>
	 */
	protected int userhistoryitemUpdateSelectiveByCondition(Userhistoryitem userhistoryitem, UserhistoryitemExample userhistoryitemQueryCondition) {
		UserhistoryitemMapper mapperImpl = this.getSqlSession().getMapper(UserhistoryitemMapper.class);
		int ret = mapperImpl.updateByExampleSelective(userhistoryitem, userhistoryitemQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="userhistoryitem">从数据库中删除一个对象Userhistoryitem</param>
	 * <param name="AId"></param>
	 */
	protected int userhistoryitemDeleteByPrimaryKey(long AId) {
		UserhistoryitemMapper mapperImpl = this.getSqlSession().getMapper(UserhistoryitemMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="userhistoryitem">从数据库中删除一个对象Userhistoryitem</param>
	 */
	protected int userhistoryitemDeleteByCondition(UserhistoryitemExample userhistoryitemQueryCondition) {
		UserhistoryitemMapper mapperImpl = this.getSqlSession().getMapper(UserhistoryitemMapper.class);
		return mapperImpl.deleteByExample(userhistoryitemQueryCondition);
	}
	
	/**
	 * <param name="userhistoryitem">从数据库中查询一个对象Userhistoryitem</param>
	 * <param name="AId"></param>
	 */
	protected Userhistoryitem userhistoryitemSelectByPrimaryKey(long AId) {
		UserhistoryitemMapper mapperImpl = this.getSqlSession().getMapper(UserhistoryitemMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="userhistoryitemQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Userhistoryitem> userhistoryitemSelectObjects(UserhistoryitemExample userhistoryitemQueryCondition) {
		UserhistoryitemMapper mapperImpl = this.getSqlSession().getMapper(UserhistoryitemMapper.class);
		return mapperImpl.selectByExample(userhistoryitemQueryCondition);
	}
	
	/**
	 * <param name="userhistoryitemQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Userhistoryitem> userhistoryitemSelectObjectsWithBLOBs(UserhistoryitemExample userhistoryitemQueryCondition) {
		UserhistoryitemMapper mapperImpl = this.getSqlSession().getMapper(UserhistoryitemMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(userhistoryitemQueryCondition);
	}
	
	/**
	 * <param name="userhistoryitemQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int userhistoryitemQuerySelectObjectsCount(UserhistoryitemExample userhistoryitemQueryCondition) {
		UserhistoryitemMapper mapperImpl = this.getSqlSession().getMapper(UserhistoryitemMapper.class);
		return mapperImpl.countByExample(userhistoryitemQueryCondition);
	}
	
	/**
	 * 插入一个对象Versioncontrol到数据库中
	 * <param name="Versioncontrol">需要插入的Versioncontrol</param>
	 */
	protected int versioncontrolInsert(Versioncontrol versioncontrol) {
		VersioncontrolMapper mapperImpl = this.getSqlSession().getMapper(VersioncontrolMapper.class);
		return mapperImpl.insertSelective(versioncontrol);
	}
	
	/**
	 * 更新一个对象Versioncontrol到数据库中
	 * <param name="versioncontrol">需要更新的Versioncontrol</param>
	 */
	protected int versioncontrolUpdate(Versioncontrol versioncontrol) {
		VersioncontrolMapper mapperImpl = this.getSqlSession().getMapper(VersioncontrolMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(versioncontrol);
		return ret;
	}
	
	/**
	 * 更新一个对象Versioncontrol到数据库中
	 * <param name="versioncontrol">需要更新的Versioncontrol</param>
	 */
	protected int versioncontrolUpdateSelective(Versioncontrol versioncontrol) {
		VersioncontrolMapper mapperImpl = this.getSqlSession().getMapper(VersioncontrolMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(versioncontrol);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Versioncontrol到数据库中
	 * <param name="versioncontrol">需要更新的Versioncontrol</param>
	 * <param name="versioncontrolQueryCondition">附加的条件</param>
	 */
	protected int versioncontrolUpdateByCondition(Versioncontrol versioncontrol, VersioncontrolExample versioncontrolQueryCondition) {
		VersioncontrolMapper mapperImpl = this.getSqlSession().getMapper(VersioncontrolMapper.class);
		int ret = mapperImpl.updateByExample(versioncontrol, versioncontrolQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Versioncontrol到数据库中
	 * <param name="versioncontrol">需要更新的Versioncontrol</param>
	 * <param name="versioncontrolQueryCondition">附加的条件</param>
	 */
	protected int versioncontrolUpdateSelectiveByCondition(Versioncontrol versioncontrol, VersioncontrolExample versioncontrolQueryCondition) {
		VersioncontrolMapper mapperImpl = this.getSqlSession().getMapper(VersioncontrolMapper.class);
		int ret = mapperImpl.updateByExampleSelective(versioncontrol, versioncontrolQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="versioncontrol">从数据库中删除一个对象Versioncontrol</param>
	 * <param name="AId"></param>
	 */
	protected int versioncontrolDeleteByPrimaryKey(long AId) {
		VersioncontrolMapper mapperImpl = this.getSqlSession().getMapper(VersioncontrolMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="versioncontrol">从数据库中删除一个对象Versioncontrol</param>
	 */
	protected int versioncontrolDeleteByCondition(VersioncontrolExample versioncontrolQueryCondition) {
		VersioncontrolMapper mapperImpl = this.getSqlSession().getMapper(VersioncontrolMapper.class);
		return mapperImpl.deleteByExample(versioncontrolQueryCondition);
	}
	
	/**
	 * <param name="versioncontrol">从数据库中查询一个对象Versioncontrol</param>
	 * <param name="AId"></param>
	 */
	protected Versioncontrol versioncontrolSelectByPrimaryKey(long AId) {
		VersioncontrolMapper mapperImpl = this.getSqlSession().getMapper(VersioncontrolMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="versioncontrolQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Versioncontrol> versioncontrolSelectObjects(VersioncontrolExample versioncontrolQueryCondition) {
		VersioncontrolMapper mapperImpl = this.getSqlSession().getMapper(VersioncontrolMapper.class);
		return mapperImpl.selectByExample(versioncontrolQueryCondition);
	}
	
	/**
	 * <param name="versioncontrolQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int versioncontrolQuerySelectObjectsCount(VersioncontrolExample versioncontrolQueryCondition) {
		VersioncontrolMapper mapperImpl = this.getSqlSession().getMapper(VersioncontrolMapper.class);
		return mapperImpl.countByExample(versioncontrolQueryCondition);
	}
	
	/**
	 * <param name="viewTopdeepBeanQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<ViewTopdeepBean> viewTopdeepBeanSelectObjects(ViewTopdeepBeanExample viewTopdeepBeanQueryCondition) {
		ViewTopdeepBeanMapper mapperImpl = this.getSqlSession().getMapper(ViewTopdeepBeanMapper.class);
		return mapperImpl.selectByExample(viewTopdeepBeanQueryCondition);
	}
	
	/**
	 * <param name="viewTopdeepBeanQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int viewTopdeepBeanQuerySelectObjectsCount(ViewTopdeepBeanExample viewTopdeepBeanQueryCondition) {
		ViewTopdeepBeanMapper mapperImpl = this.getSqlSession().getMapper(ViewTopdeepBeanMapper.class);
		return mapperImpl.countByExample(viewTopdeepBeanQueryCondition);
	}
	
	/**
	 * <param name="viewTopdeepWorkQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<ViewTopdeepWork> viewTopdeepWorkSelectObjects(ViewTopdeepWorkExample viewTopdeepWorkQueryCondition) {
		ViewTopdeepWorkMapper mapperImpl = this.getSqlSession().getMapper(ViewTopdeepWorkMapper.class);
		return mapperImpl.selectByExample(viewTopdeepWorkQueryCondition);
	}
	
	/**
	 * <param name="viewTopdeepWorkQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<ViewTopdeepWorkWithBLOBs> viewTopdeepWorkSelectObjectsWithBLOBs(ViewTopdeepWorkExample viewTopdeepWorkQueryCondition) {
		ViewTopdeepWorkMapper mapperImpl = this.getSqlSession().getMapper(ViewTopdeepWorkMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(viewTopdeepWorkQueryCondition);
	}
	
	/**
	 * <param name="viewTopdeepWorkQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int viewTopdeepWorkQuerySelectObjectsCount(ViewTopdeepWorkExample viewTopdeepWorkQueryCondition) {
		ViewTopdeepWorkMapper mapperImpl = this.getSqlSession().getMapper(ViewTopdeepWorkMapper.class);
		return mapperImpl.countByExample(viewTopdeepWorkQueryCondition);
	}
	
	/**
	 * 插入一个对象Votehistory到数据库中
	 * <param name="Votehistory">需要插入的Votehistory</param>
	 */
	protected int votehistoryInsert(Votehistory votehistory) {
		VotehistoryMapper mapperImpl = this.getSqlSession().getMapper(VotehistoryMapper.class);
		return mapperImpl.insertSelective(votehistory);
	}
	
	/**
	 * 更新一个对象Votehistory到数据库中
	 * <param name="votehistory">需要更新的Votehistory</param>
	 */
	protected int votehistoryUpdate(Votehistory votehistory) {
		VotehistoryMapper mapperImpl = this.getSqlSession().getMapper(VotehistoryMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(votehistory);
		return ret;
	}
	
	/**
	 * 更新一个对象Votehistory到数据库中
	 * <param name="votehistory">需要更新的Votehistory</param>
	 */
	protected int votehistoryUpdateSelective(Votehistory votehistory) {
		VotehistoryMapper mapperImpl = this.getSqlSession().getMapper(VotehistoryMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(votehistory);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Votehistory到数据库中
	 * <param name="votehistory">需要更新的Votehistory</param>
	 * <param name="votehistoryQueryCondition">附加的条件</param>
	 */
	protected int votehistoryUpdateByCondition(Votehistory votehistory, VotehistoryExample votehistoryQueryCondition) {
		VotehistoryMapper mapperImpl = this.getSqlSession().getMapper(VotehistoryMapper.class);
		int ret = mapperImpl.updateByExample(votehistory, votehistoryQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Votehistory到数据库中
	 * <param name="votehistory">需要更新的Votehistory</param>
	 * <param name="votehistoryQueryCondition">附加的条件</param>
	 */
	protected int votehistoryUpdateSelectiveByCondition(Votehistory votehistory, VotehistoryExample votehistoryQueryCondition) {
		VotehistoryMapper mapperImpl = this.getSqlSession().getMapper(VotehistoryMapper.class);
		int ret = mapperImpl.updateByExampleSelective(votehistory, votehistoryQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="votehistory">从数据库中删除一个对象Votehistory</param>
	 * <param name="AId"></param>
	 */
	protected int votehistoryDeleteByPrimaryKey(long AId) {
		VotehistoryMapper mapperImpl = this.getSqlSession().getMapper(VotehistoryMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="votehistory">从数据库中删除一个对象Votehistory</param>
	 */
	protected int votehistoryDeleteByCondition(VotehistoryExample votehistoryQueryCondition) {
		VotehistoryMapper mapperImpl = this.getSqlSession().getMapper(VotehistoryMapper.class);
		return mapperImpl.deleteByExample(votehistoryQueryCondition);
	}
	
	/**
	 * <param name="votehistory">从数据库中查询一个对象Votehistory</param>
	 * <param name="AId"></param>
	 */
	protected Votehistory votehistorySelectByPrimaryKey(long AId) {
		VotehistoryMapper mapperImpl = this.getSqlSession().getMapper(VotehistoryMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="votehistoryQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Votehistory> votehistorySelectObjects(VotehistoryExample votehistoryQueryCondition) {
		VotehistoryMapper mapperImpl = this.getSqlSession().getMapper(VotehistoryMapper.class);
		return mapperImpl.selectByExample(votehistoryQueryCondition);
	}
	
	/**
	 * <param name="votehistoryQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int votehistoryQuerySelectObjectsCount(VotehistoryExample votehistoryQueryCondition) {
		VotehistoryMapper mapperImpl = this.getSqlSession().getMapper(VotehistoryMapper.class);
		return mapperImpl.countByExample(votehistoryQueryCondition);
	}
	
	/**
	 * 插入一个对象Workflowscheme到数据库中
	 * <param name="Workflowscheme">需要插入的Workflowscheme</param>
	 */
	protected int workflowschemeInsert(Workflowscheme workflowscheme) {
		WorkflowschemeMapper mapperImpl = this.getSqlSession().getMapper(WorkflowschemeMapper.class);
		return mapperImpl.insertSelective(workflowscheme);
	}
	
	/**
	 * 更新一个对象Workflowscheme到数据库中
	 * <param name="workflowscheme">需要更新的Workflowscheme</param>
	 */
	protected int workflowschemeUpdate(Workflowscheme workflowscheme) {
		WorkflowschemeMapper mapperImpl = this.getSqlSession().getMapper(WorkflowschemeMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(workflowscheme);
		return ret;
	}
	
	/**
	 * 更新一个对象Workflowscheme到数据库中
	 * <param name="workflowscheme">需要更新的Workflowscheme</param>
	 */
	protected int workflowschemeUpdateSelective(Workflowscheme workflowscheme) {
		WorkflowschemeMapper mapperImpl = this.getSqlSession().getMapper(WorkflowschemeMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(workflowscheme);
		return ret;
	}
	
	/**
	 * 更新一个对象Workflowscheme到数据库中
	 * <param name="workflowscheme">需要更新的Workflowscheme</param>
	 */
	public int workflowschemeUpdateWithBlobs(Workflowscheme workflowscheme) {
		WorkflowschemeMapper mapperImpl = this.getSqlSession().getMapper(WorkflowschemeMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(workflowscheme);
	}
	
	/**
	 * 根据条件更新一批对象Workflowscheme到数据库中
	 * <param name="workflowscheme">需要更新的Workflowscheme</param>
	 * <param name="workflowschemeQueryCondition">附加的条件</param>
	 */
	protected int workflowschemeUpdateByCondition(Workflowscheme workflowscheme, WorkflowschemeExample workflowschemeQueryCondition) {
		WorkflowschemeMapper mapperImpl = this.getSqlSession().getMapper(WorkflowschemeMapper.class);
		int ret = mapperImpl.updateByExample(workflowscheme, workflowschemeQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Workflowscheme到数据库中
	 * <param name="workflowscheme">需要更新的Workflowscheme</param>
	 * <param name="workflowschemeQueryCondition">附加的条件</param>
	 */
	protected int workflowschemeUpdateSelectiveByCondition(Workflowscheme workflowscheme, WorkflowschemeExample workflowschemeQueryCondition) {
		WorkflowschemeMapper mapperImpl = this.getSqlSession().getMapper(WorkflowschemeMapper.class);
		int ret = mapperImpl.updateByExampleSelective(workflowscheme, workflowschemeQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="workflowscheme">从数据库中删除一个对象Workflowscheme</param>
	 * <param name="AId"></param>
	 */
	protected int workflowschemeDeleteByPrimaryKey(long AId) {
		WorkflowschemeMapper mapperImpl = this.getSqlSession().getMapper(WorkflowschemeMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="workflowscheme">从数据库中删除一个对象Workflowscheme</param>
	 */
	protected int workflowschemeDeleteByCondition(WorkflowschemeExample workflowschemeQueryCondition) {
		WorkflowschemeMapper mapperImpl = this.getSqlSession().getMapper(WorkflowschemeMapper.class);
		return mapperImpl.deleteByExample(workflowschemeQueryCondition);
	}
	
	/**
	 * <param name="workflowscheme">从数据库中查询一个对象Workflowscheme</param>
	 * <param name="AId"></param>
	 */
	protected Workflowscheme workflowschemeSelectByPrimaryKey(long AId) {
		WorkflowschemeMapper mapperImpl = this.getSqlSession().getMapper(WorkflowschemeMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="workflowschemeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Workflowscheme> workflowschemeSelectObjects(WorkflowschemeExample workflowschemeQueryCondition) {
		WorkflowschemeMapper mapperImpl = this.getSqlSession().getMapper(WorkflowschemeMapper.class);
		return mapperImpl.selectByExample(workflowschemeQueryCondition);
	}
	
	/**
	 * <param name="workflowschemeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Workflowscheme> workflowschemeSelectObjectsWithBLOBs(WorkflowschemeExample workflowschemeQueryCondition) {
		WorkflowschemeMapper mapperImpl = this.getSqlSession().getMapper(WorkflowschemeMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(workflowschemeQueryCondition);
	}
	
	/**
	 * <param name="workflowschemeQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int workflowschemeQuerySelectObjectsCount(WorkflowschemeExample workflowschemeQueryCondition) {
		WorkflowschemeMapper mapperImpl = this.getSqlSession().getMapper(WorkflowschemeMapper.class);
		return mapperImpl.countByExample(workflowschemeQueryCondition);
	}
	
	/**
	 * 插入一个对象Workflowschemeentity到数据库中
	 * <param name="Workflowschemeentity">需要插入的Workflowschemeentity</param>
	 */
	protected int workflowschemeentityInsert(Workflowschemeentity workflowschemeentity) {
		WorkflowschemeentityMapper mapperImpl = this.getSqlSession().getMapper(WorkflowschemeentityMapper.class);
		return mapperImpl.insertSelective(workflowschemeentity);
	}
	
	/**
	 * 更新一个对象Workflowschemeentity到数据库中
	 * <param name="workflowschemeentity">需要更新的Workflowschemeentity</param>
	 */
	protected int workflowschemeentityUpdate(Workflowschemeentity workflowschemeentity) {
		WorkflowschemeentityMapper mapperImpl = this.getSqlSession().getMapper(WorkflowschemeentityMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(workflowschemeentity);
		return ret;
	}
	
	/**
	 * 更新一个对象Workflowschemeentity到数据库中
	 * <param name="workflowschemeentity">需要更新的Workflowschemeentity</param>
	 */
	protected int workflowschemeentityUpdateSelective(Workflowschemeentity workflowschemeentity) {
		WorkflowschemeentityMapper mapperImpl = this.getSqlSession().getMapper(WorkflowschemeentityMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(workflowschemeentity);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Workflowschemeentity到数据库中
	 * <param name="workflowschemeentity">需要更新的Workflowschemeentity</param>
	 * <param name="workflowschemeentityQueryCondition">附加的条件</param>
	 */
	protected int workflowschemeentityUpdateByCondition(Workflowschemeentity workflowschemeentity, WorkflowschemeentityExample workflowschemeentityQueryCondition) {
		WorkflowschemeentityMapper mapperImpl = this.getSqlSession().getMapper(WorkflowschemeentityMapper.class);
		int ret = mapperImpl.updateByExample(workflowschemeentity, workflowschemeentityQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Workflowschemeentity到数据库中
	 * <param name="workflowschemeentity">需要更新的Workflowschemeentity</param>
	 * <param name="workflowschemeentityQueryCondition">附加的条件</param>
	 */
	protected int workflowschemeentityUpdateSelectiveByCondition(Workflowschemeentity workflowschemeentity, WorkflowschemeentityExample workflowschemeentityQueryCondition) {
		WorkflowschemeentityMapper mapperImpl = this.getSqlSession().getMapper(WorkflowschemeentityMapper.class);
		int ret = mapperImpl.updateByExampleSelective(workflowschemeentity, workflowschemeentityQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="workflowschemeentity">从数据库中删除一个对象Workflowschemeentity</param>
	 * <param name="AId"></param>
	 */
	protected int workflowschemeentityDeleteByPrimaryKey(long AId) {
		WorkflowschemeentityMapper mapperImpl = this.getSqlSession().getMapper(WorkflowschemeentityMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="workflowschemeentity">从数据库中删除一个对象Workflowschemeentity</param>
	 */
	protected int workflowschemeentityDeleteByCondition(WorkflowschemeentityExample workflowschemeentityQueryCondition) {
		WorkflowschemeentityMapper mapperImpl = this.getSqlSession().getMapper(WorkflowschemeentityMapper.class);
		return mapperImpl.deleteByExample(workflowschemeentityQueryCondition);
	}
	
	/**
	 * <param name="workflowschemeentity">从数据库中查询一个对象Workflowschemeentity</param>
	 * <param name="AId"></param>
	 */
	protected Workflowschemeentity workflowschemeentitySelectByPrimaryKey(long AId) {
		WorkflowschemeentityMapper mapperImpl = this.getSqlSession().getMapper(WorkflowschemeentityMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="workflowschemeentityQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Workflowschemeentity> workflowschemeentitySelectObjects(WorkflowschemeentityExample workflowschemeentityQueryCondition) {
		WorkflowschemeentityMapper mapperImpl = this.getSqlSession().getMapper(WorkflowschemeentityMapper.class);
		return mapperImpl.selectByExample(workflowschemeentityQueryCondition);
	}
	
	/**
	 * <param name="workflowschemeentityQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int workflowschemeentityQuerySelectObjectsCount(WorkflowschemeentityExample workflowschemeentityQueryCondition) {
		WorkflowschemeentityMapper mapperImpl = this.getSqlSession().getMapper(WorkflowschemeentityMapper.class);
		return mapperImpl.countByExample(workflowschemeentityQueryCondition);
	}
	
	/**
	 * 插入一个对象Worklog到数据库中
	 * <param name="Worklog">需要插入的Worklog</param>
	 */
	protected int worklogInsert(Worklog worklog) {
		WorklogMapper mapperImpl = this.getSqlSession().getMapper(WorklogMapper.class);
		return mapperImpl.insertSelective(worklog);
	}
	
	/**
	 * 更新一个对象Worklog到数据库中
	 * <param name="worklog">需要更新的Worklog</param>
	 */
	protected int worklogUpdate(Worklog worklog) {
		WorklogMapper mapperImpl = this.getSqlSession().getMapper(WorklogMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(worklog);
		return ret;
	}
	
	/**
	 * 更新一个对象Worklog到数据库中
	 * <param name="worklog">需要更新的Worklog</param>
	 */
	protected int worklogUpdateSelective(Worklog worklog) {
		WorklogMapper mapperImpl = this.getSqlSession().getMapper(WorklogMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(worklog);
		return ret;
	}
	
	/**
	 * 更新一个对象Worklog到数据库中
	 * <param name="worklog">需要更新的Worklog</param>
	 */
	public int worklogUpdateWithBlobs(Worklog worklog) {
		WorklogMapper mapperImpl = this.getSqlSession().getMapper(WorklogMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(worklog);
	}
	
	/**
	 * 根据条件更新一批对象Worklog到数据库中
	 * <param name="worklog">需要更新的Worklog</param>
	 * <param name="worklogQueryCondition">附加的条件</param>
	 */
	protected int worklogUpdateByCondition(Worklog worklog, WorklogExample worklogQueryCondition) {
		WorklogMapper mapperImpl = this.getSqlSession().getMapper(WorklogMapper.class);
		int ret = mapperImpl.updateByExample(worklog, worklogQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Worklog到数据库中
	 * <param name="worklog">需要更新的Worklog</param>
	 * <param name="worklogQueryCondition">附加的条件</param>
	 */
	protected int worklogUpdateSelectiveByCondition(Worklog worklog, WorklogExample worklogQueryCondition) {
		WorklogMapper mapperImpl = this.getSqlSession().getMapper(WorklogMapper.class);
		int ret = mapperImpl.updateByExampleSelective(worklog, worklogQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="worklog">从数据库中删除一个对象Worklog</param>
	 * <param name="AId"></param>
	 */
	protected int worklogDeleteByPrimaryKey(long AId) {
		WorklogMapper mapperImpl = this.getSqlSession().getMapper(WorklogMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="worklog">从数据库中删除一个对象Worklog</param>
	 */
	protected int worklogDeleteByCondition(WorklogExample worklogQueryCondition) {
		WorklogMapper mapperImpl = this.getSqlSession().getMapper(WorklogMapper.class);
		return mapperImpl.deleteByExample(worklogQueryCondition);
	}
	
	/**
	 * <param name="worklog">从数据库中查询一个对象Worklog</param>
	 * <param name="AId"></param>
	 */
	protected Worklog worklogSelectByPrimaryKey(long AId) {
		WorklogMapper mapperImpl = this.getSqlSession().getMapper(WorklogMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="worklogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Worklog> worklogSelectObjects(WorklogExample worklogQueryCondition) {
		WorklogMapper mapperImpl = this.getSqlSession().getMapper(WorklogMapper.class);
		return mapperImpl.selectByExample(worklogQueryCondition);
	}
	
	/**
	 * <param name="worklogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Worklog> worklogSelectObjectsWithBLOBs(WorklogExample worklogQueryCondition) {
		WorklogMapper mapperImpl = this.getSqlSession().getMapper(WorklogMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(worklogQueryCondition);
	}
	
	/**
	 * <param name="worklogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int worklogQuerySelectObjectsCount(WorklogExample worklogQueryCondition) {
		WorklogMapper mapperImpl = this.getSqlSession().getMapper(WorklogMapper.class);
		return mapperImpl.countByExample(worklogQueryCondition);
	}
	
	/**
	 * 简单的日志接口,无任何实现
	 * <param name="tableName">表名称</param>
	 * <param name="operateName">操作名称</param>
	 * <param name="keyFieldName">主键字段名</param>
	 * <param name="keyFieldValue">主键字段值</param>
	 * <param name="param">附加参数</param>
	 * <param name="updateCount">生效行数</param>
	 */
	protected void operatesLogSimpleAdd(String tableName, String operateName, String keyFieldName, String keyFieldValue, Object param, int updateCount) {
	}
}
