package cn.topdeep.projgroup.entity.db;
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
	 * 插入一个对象CheckDevice到数据库中
	 * <param name="CheckDevice">需要插入的CheckDevice</param>
	 */
	protected int checkDeviceInsert(CheckDevice checkDevice) {
		CheckDeviceMapper mapperImpl = this.getSqlSession().getMapper(CheckDeviceMapper.class);
		return mapperImpl.insertSelective(checkDevice);
	}
	
	/**
	 * 更新一个对象CheckDevice到数据库中
	 * <param name="checkDevice">需要更新的CheckDevice</param>
	 */
	protected int checkDeviceUpdate(CheckDevice checkDevice) {
		CheckDeviceMapper mapperImpl = this.getSqlSession().getMapper(CheckDeviceMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(checkDevice);
		return ret;
	}
	
	/**
	 * 更新一个对象CheckDevice到数据库中
	 * <param name="checkDevice">需要更新的CheckDevice</param>
	 */
	protected int checkDeviceUpdateSelective(CheckDevice checkDevice) {
		CheckDeviceMapper mapperImpl = this.getSqlSession().getMapper(CheckDeviceMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(checkDevice);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象CheckDevice到数据库中
	 * <param name="checkDevice">需要更新的CheckDevice</param>
	 * <param name="checkDeviceQueryCondition">附加的条件</param>
	 */
	protected int checkDeviceUpdateByCondition(CheckDevice checkDevice, CheckDeviceExample checkDeviceQueryCondition) {
		CheckDeviceMapper mapperImpl = this.getSqlSession().getMapper(CheckDeviceMapper.class);
		int ret = mapperImpl.updateByExample(checkDevice, checkDeviceQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息CheckDevice到数据库中
	 * <param name="checkDevice">需要更新的CheckDevice</param>
	 * <param name="checkDeviceQueryCondition">附加的条件</param>
	 */
	protected int checkDeviceUpdateSelectiveByCondition(CheckDevice checkDevice, CheckDeviceExample checkDeviceQueryCondition) {
		CheckDeviceMapper mapperImpl = this.getSqlSession().getMapper(CheckDeviceMapper.class);
		int ret = mapperImpl.updateByExampleSelective(checkDevice, checkDeviceQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="checkDevice">从数据库中删除一个对象CheckDevice</param>
	 * <param name="AId">PK</param>
	 */
	protected int checkDeviceDeleteByPrimaryKey(String AId) {
		CheckDeviceMapper mapperImpl = this.getSqlSession().getMapper(CheckDeviceMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="checkDevice">从数据库中删除一个对象CheckDevice</param>
	 */
	protected int checkDeviceDeleteByCondition(CheckDeviceExample checkDeviceQueryCondition) {
		CheckDeviceMapper mapperImpl = this.getSqlSession().getMapper(CheckDeviceMapper.class);
		return mapperImpl.deleteByExample(checkDeviceQueryCondition);
	}
	
	/**
	 * <param name="checkDevice">从数据库中查询一个对象CheckDevice</param>
	 * <param name="AId">PK</param>
	 */
	protected CheckDevice checkDeviceSelectByPrimaryKey(String AId) {
		CheckDeviceMapper mapperImpl = this.getSqlSession().getMapper(CheckDeviceMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="checkDeviceQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<CheckDevice> checkDeviceSelectObjects(CheckDeviceExample checkDeviceQueryCondition) {
		CheckDeviceMapper mapperImpl = this.getSqlSession().getMapper(CheckDeviceMapper.class);
		return mapperImpl.selectByExample(checkDeviceQueryCondition);
	}
	
	/**
	 * <param name="checkDeviceQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int checkDeviceQuerySelectObjectsCount(CheckDeviceExample checkDeviceQueryCondition) {
		CheckDeviceMapper mapperImpl = this.getSqlSession().getMapper(CheckDeviceMapper.class);
		return mapperImpl.countByExample(checkDeviceQueryCondition);
	}
	
	/**
	 * 插入一个对象ClientActivation到数据库中
	 * <param name="ClientActivation">需要插入的ClientActivation</param>
	 */
	protected int clientActivationInsert(ClientActivation clientActivation) {
		ClientActivationMapper mapperImpl = this.getSqlSession().getMapper(ClientActivationMapper.class);
		return mapperImpl.insertSelective(clientActivation);
	}
	
	/**
	 * 更新一个对象ClientActivation到数据库中
	 * <param name="clientActivation">需要更新的ClientActivation</param>
	 */
	protected int clientActivationUpdate(ClientActivation clientActivation) {
		ClientActivationMapper mapperImpl = this.getSqlSession().getMapper(ClientActivationMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(clientActivation);
		return ret;
	}
	
	/**
	 * 更新一个对象ClientActivation到数据库中
	 * <param name="clientActivation">需要更新的ClientActivation</param>
	 */
	protected int clientActivationUpdateSelective(ClientActivation clientActivation) {
		ClientActivationMapper mapperImpl = this.getSqlSession().getMapper(ClientActivationMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(clientActivation);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象ClientActivation到数据库中
	 * <param name="clientActivation">需要更新的ClientActivation</param>
	 * <param name="clientActivationQueryCondition">附加的条件</param>
	 */
	protected int clientActivationUpdateByCondition(ClientActivation clientActivation, ClientActivationExample clientActivationQueryCondition) {
		ClientActivationMapper mapperImpl = this.getSqlSession().getMapper(ClientActivationMapper.class);
		int ret = mapperImpl.updateByExample(clientActivation, clientActivationQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息ClientActivation到数据库中
	 * <param name="clientActivation">需要更新的ClientActivation</param>
	 * <param name="clientActivationQueryCondition">附加的条件</param>
	 */
	protected int clientActivationUpdateSelectiveByCondition(ClientActivation clientActivation, ClientActivationExample clientActivationQueryCondition) {
		ClientActivationMapper mapperImpl = this.getSqlSession().getMapper(ClientActivationMapper.class);
		int ret = mapperImpl.updateByExampleSelective(clientActivation, clientActivationQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="clientActivation">从数据库中删除一个对象ClientActivation</param>
	 * <param name="AId">PK</param>
	 */
	protected int clientActivationDeleteByPrimaryKey(String AId) {
		ClientActivationMapper mapperImpl = this.getSqlSession().getMapper(ClientActivationMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="clientActivation">从数据库中删除一个对象ClientActivation</param>
	 */
	protected int clientActivationDeleteByCondition(ClientActivationExample clientActivationQueryCondition) {
		ClientActivationMapper mapperImpl = this.getSqlSession().getMapper(ClientActivationMapper.class);
		return mapperImpl.deleteByExample(clientActivationQueryCondition);
	}
	
	/**
	 * <param name="clientActivation">从数据库中查询一个对象ClientActivation</param>
	 * <param name="AId">PK</param>
	 */
	protected ClientActivation clientActivationSelectByPrimaryKey(String AId) {
		ClientActivationMapper mapperImpl = this.getSqlSession().getMapper(ClientActivationMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="clientActivationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<ClientActivation> clientActivationSelectObjects(ClientActivationExample clientActivationQueryCondition) {
		ClientActivationMapper mapperImpl = this.getSqlSession().getMapper(ClientActivationMapper.class);
		return mapperImpl.selectByExample(clientActivationQueryCondition);
	}
	
	/**
	 * <param name="clientActivationQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int clientActivationQuerySelectObjectsCount(ClientActivationExample clientActivationQueryCondition) {
		ClientActivationMapper mapperImpl = this.getSqlSession().getMapper(ClientActivationMapper.class);
		return mapperImpl.countByExample(clientActivationQueryCondition);
	}
	
	/**
	 * 插入一个对象CodeBuild到数据库中
	 * <param name="CodeBuild">需要插入的CodeBuild</param>
	 */
	protected int codeBuildInsert(CodeBuild codeBuild) {
		CodeBuildMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildMapper.class);
		return mapperImpl.insertSelective(codeBuild);
	}
	
	/**
	 * 更新一个对象CodeBuild到数据库中
	 * <param name="codeBuild">需要更新的CodeBuild</param>
	 */
	protected int codeBuildUpdate(CodeBuild codeBuild) {
		CodeBuildMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(codeBuild);
		return ret;
	}
	
	/**
	 * 更新一个对象CodeBuild到数据库中
	 * <param name="codeBuild">需要更新的CodeBuild</param>
	 */
	protected int codeBuildUpdateSelective(CodeBuild codeBuild) {
		CodeBuildMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(codeBuild);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象CodeBuild到数据库中
	 * <param name="codeBuild">需要更新的CodeBuild</param>
	 * <param name="codeBuildQueryCondition">附加的条件</param>
	 */
	protected int codeBuildUpdateByCondition(CodeBuild codeBuild, CodeBuildExample codeBuildQueryCondition) {
		CodeBuildMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildMapper.class);
		int ret = mapperImpl.updateByExample(codeBuild, codeBuildQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息CodeBuild到数据库中
	 * <param name="codeBuild">需要更新的CodeBuild</param>
	 * <param name="codeBuildQueryCondition">附加的条件</param>
	 */
	protected int codeBuildUpdateSelectiveByCondition(CodeBuild codeBuild, CodeBuildExample codeBuildQueryCondition) {
		CodeBuildMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildMapper.class);
		int ret = mapperImpl.updateByExampleSelective(codeBuild, codeBuildQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="codeBuild">从数据库中删除一个对象CodeBuild</param>
	 * <param name="ABuildId">¹¹½¨±êÊ¶</param>
	 */
	protected int codeBuildDeleteByPrimaryKey(int ABuildId) {
		CodeBuildMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildMapper.class);
		return mapperImpl.deleteByPrimaryKey(ABuildId);
	}
	
	/**
	 * <param name="codeBuild">从数据库中删除一个对象CodeBuild</param>
	 */
	protected int codeBuildDeleteByCondition(CodeBuildExample codeBuildQueryCondition) {
		CodeBuildMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildMapper.class);
		return mapperImpl.deleteByExample(codeBuildQueryCondition);
	}
	
	/**
	 * <param name="codeBuild">从数据库中查询一个对象CodeBuild</param>
	 * <param name="ABuildId">¹¹½¨±êÊ¶</param>
	 */
	protected CodeBuild codeBuildSelectByPrimaryKey(int ABuildId) {
		CodeBuildMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildMapper.class);
		return mapperImpl.selectByPrimaryKey(ABuildId);
	}
	
	/**
	 * <param name="codeBuildQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<CodeBuild> codeBuildSelectObjects(CodeBuildExample codeBuildQueryCondition) {
		CodeBuildMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildMapper.class);
		return mapperImpl.selectByExample(codeBuildQueryCondition);
	}
	
	/**
	 * <param name="codeBuildQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int codeBuildQuerySelectObjectsCount(CodeBuildExample codeBuildQueryCondition) {
		CodeBuildMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildMapper.class);
		return mapperImpl.countByExample(codeBuildQueryCondition);
	}
	
	/**
	 * 插入一个对象CodeBuildLog到数据库中
	 * <param name="CodeBuildLog">需要插入的CodeBuildLog</param>
	 */
	protected int codeBuildLogInsert(CodeBuildLog codeBuildLog) {
		CodeBuildLogMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildLogMapper.class);
		return mapperImpl.insertSelective(codeBuildLog);
	}
	
	/**
	 * 更新一个对象CodeBuildLog到数据库中
	 * <param name="codeBuildLog">需要更新的CodeBuildLog</param>
	 */
	protected int codeBuildLogUpdate(CodeBuildLog codeBuildLog) {
		CodeBuildLogMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildLogMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(codeBuildLog);
		return ret;
	}
	
	/**
	 * 更新一个对象CodeBuildLog到数据库中
	 * <param name="codeBuildLog">需要更新的CodeBuildLog</param>
	 */
	protected int codeBuildLogUpdateSelective(CodeBuildLog codeBuildLog) {
		CodeBuildLogMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildLogMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(codeBuildLog);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象CodeBuildLog到数据库中
	 * <param name="codeBuildLog">需要更新的CodeBuildLog</param>
	 * <param name="codeBuildLogQueryCondition">附加的条件</param>
	 */
	protected int codeBuildLogUpdateByCondition(CodeBuildLog codeBuildLog, CodeBuildLogExample codeBuildLogQueryCondition) {
		CodeBuildLogMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildLogMapper.class);
		int ret = mapperImpl.updateByExample(codeBuildLog, codeBuildLogQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息CodeBuildLog到数据库中
	 * <param name="codeBuildLog">需要更新的CodeBuildLog</param>
	 * <param name="codeBuildLogQueryCondition">附加的条件</param>
	 */
	protected int codeBuildLogUpdateSelectiveByCondition(CodeBuildLog codeBuildLog, CodeBuildLogExample codeBuildLogQueryCondition) {
		CodeBuildLogMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildLogMapper.class);
		int ret = mapperImpl.updateByExampleSelective(codeBuildLog, codeBuildLogQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="codeBuildLog">从数据库中删除一个对象CodeBuildLog</param>
	 * <param name="ABuildLogId">¹¹½¨±êÊ¶</param>
	 */
	protected int codeBuildLogDeleteByPrimaryKey(int ABuildLogId) {
		CodeBuildLogMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildLogMapper.class);
		return mapperImpl.deleteByPrimaryKey(ABuildLogId);
	}
	
	/**
	 * <param name="codeBuildLog">从数据库中删除一个对象CodeBuildLog</param>
	 */
	protected int codeBuildLogDeleteByCondition(CodeBuildLogExample codeBuildLogQueryCondition) {
		CodeBuildLogMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildLogMapper.class);
		return mapperImpl.deleteByExample(codeBuildLogQueryCondition);
	}
	
	/**
	 * <param name="codeBuildLog">从数据库中查询一个对象CodeBuildLog</param>
	 * <param name="ABuildLogId">¹¹½¨±êÊ¶</param>
	 */
	protected CodeBuildLog codeBuildLogSelectByPrimaryKey(int ABuildLogId) {
		CodeBuildLogMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildLogMapper.class);
		return mapperImpl.selectByPrimaryKey(ABuildLogId);
	}
	
	/**
	 * <param name="codeBuildLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<CodeBuildLog> codeBuildLogSelectObjects(CodeBuildLogExample codeBuildLogQueryCondition) {
		CodeBuildLogMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildLogMapper.class);
		return mapperImpl.selectByExample(codeBuildLogQueryCondition);
	}
	
	/**
	 * <param name="codeBuildLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int codeBuildLogQuerySelectObjectsCount(CodeBuildLogExample codeBuildLogQueryCondition) {
		CodeBuildLogMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildLogMapper.class);
		return mapperImpl.countByExample(codeBuildLogQueryCondition);
	}
	
	/**
	 * 插入一个对象CodeBuildProcedure到数据库中
	 * <param name="CodeBuildProcedure">需要插入的CodeBuildProcedure</param>
	 */
	protected int codeBuildProcedureInsert(CodeBuildProcedure codeBuildProcedure) {
		CodeBuildProcedureMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildProcedureMapper.class);
		return mapperImpl.insertSelective(codeBuildProcedure);
	}
	
	/**
	 * 更新一个对象CodeBuildProcedure到数据库中
	 * <param name="codeBuildProcedure">需要更新的CodeBuildProcedure</param>
	 */
	protected int codeBuildProcedureUpdate(CodeBuildProcedure codeBuildProcedure) {
		CodeBuildProcedureMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildProcedureMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(codeBuildProcedure);
		return ret;
	}
	
	/**
	 * 更新一个对象CodeBuildProcedure到数据库中
	 * <param name="codeBuildProcedure">需要更新的CodeBuildProcedure</param>
	 */
	protected int codeBuildProcedureUpdateSelective(CodeBuildProcedure codeBuildProcedure) {
		CodeBuildProcedureMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildProcedureMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(codeBuildProcedure);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象CodeBuildProcedure到数据库中
	 * <param name="codeBuildProcedure">需要更新的CodeBuildProcedure</param>
	 * <param name="codeBuildProcedureQueryCondition">附加的条件</param>
	 */
	protected int codeBuildProcedureUpdateByCondition(CodeBuildProcedure codeBuildProcedure, CodeBuildProcedureExample codeBuildProcedureQueryCondition) {
		CodeBuildProcedureMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildProcedureMapper.class);
		int ret = mapperImpl.updateByExample(codeBuildProcedure, codeBuildProcedureQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息CodeBuildProcedure到数据库中
	 * <param name="codeBuildProcedure">需要更新的CodeBuildProcedure</param>
	 * <param name="codeBuildProcedureQueryCondition">附加的条件</param>
	 */
	protected int codeBuildProcedureUpdateSelectiveByCondition(CodeBuildProcedure codeBuildProcedure, CodeBuildProcedureExample codeBuildProcedureQueryCondition) {
		CodeBuildProcedureMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildProcedureMapper.class);
		int ret = mapperImpl.updateByExampleSelective(codeBuildProcedure, codeBuildProcedureQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="codeBuildProcedure">从数据库中删除一个对象CodeBuildProcedure</param>
	 * <param name="ABuildProcedureId">¹¹½¨¹ý³Ì±êÊ¶</param>
	 */
	protected int codeBuildProcedureDeleteByPrimaryKey(int ABuildProcedureId) {
		CodeBuildProcedureMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildProcedureMapper.class);
		return mapperImpl.deleteByPrimaryKey(ABuildProcedureId);
	}
	
	/**
	 * <param name="codeBuildProcedure">从数据库中删除一个对象CodeBuildProcedure</param>
	 */
	protected int codeBuildProcedureDeleteByCondition(CodeBuildProcedureExample codeBuildProcedureQueryCondition) {
		CodeBuildProcedureMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildProcedureMapper.class);
		return mapperImpl.deleteByExample(codeBuildProcedureQueryCondition);
	}
	
	/**
	 * <param name="codeBuildProcedure">从数据库中查询一个对象CodeBuildProcedure</param>
	 * <param name="ABuildProcedureId">¹¹½¨¹ý³Ì±êÊ¶</param>
	 */
	protected CodeBuildProcedure codeBuildProcedureSelectByPrimaryKey(int ABuildProcedureId) {
		CodeBuildProcedureMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildProcedureMapper.class);
		return mapperImpl.selectByPrimaryKey(ABuildProcedureId);
	}
	
	/**
	 * <param name="codeBuildProcedureQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<CodeBuildProcedure> codeBuildProcedureSelectObjects(CodeBuildProcedureExample codeBuildProcedureQueryCondition) {
		CodeBuildProcedureMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildProcedureMapper.class);
		return mapperImpl.selectByExample(codeBuildProcedureQueryCondition);
	}
	
	/**
	 * <param name="codeBuildProcedureQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int codeBuildProcedureQuerySelectObjectsCount(CodeBuildProcedureExample codeBuildProcedureQueryCondition) {
		CodeBuildProcedureMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildProcedureMapper.class);
		return mapperImpl.countByExample(codeBuildProcedureQueryCondition);
	}
	
	/**
	 * 插入一个对象CodeBuildProperty到数据库中
	 * <param name="CodeBuildProperty">需要插入的CodeBuildProperty</param>
	 */
	protected int codeBuildPropertyInsert(CodeBuildProperty codeBuildProperty) {
		CodeBuildPropertyMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildPropertyMapper.class);
		return mapperImpl.insertSelective(codeBuildProperty);
	}
	
	/**
	 * 更新一个对象CodeBuildProperty到数据库中
	 * <param name="codeBuildProperty">需要更新的CodeBuildProperty</param>
	 */
	protected int codeBuildPropertyUpdate(CodeBuildProperty codeBuildProperty) {
		CodeBuildPropertyMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildPropertyMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(codeBuildProperty);
		return ret;
	}
	
	/**
	 * 更新一个对象CodeBuildProperty到数据库中
	 * <param name="codeBuildProperty">需要更新的CodeBuildProperty</param>
	 */
	protected int codeBuildPropertyUpdateSelective(CodeBuildProperty codeBuildProperty) {
		CodeBuildPropertyMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildPropertyMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(codeBuildProperty);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象CodeBuildProperty到数据库中
	 * <param name="codeBuildProperty">需要更新的CodeBuildProperty</param>
	 * <param name="codeBuildPropertyQueryCondition">附加的条件</param>
	 */
	protected int codeBuildPropertyUpdateByCondition(CodeBuildProperty codeBuildProperty, CodeBuildPropertyExample codeBuildPropertyQueryCondition) {
		CodeBuildPropertyMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildPropertyMapper.class);
		int ret = mapperImpl.updateByExample(codeBuildProperty, codeBuildPropertyQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息CodeBuildProperty到数据库中
	 * <param name="codeBuildProperty">需要更新的CodeBuildProperty</param>
	 * <param name="codeBuildPropertyQueryCondition">附加的条件</param>
	 */
	protected int codeBuildPropertyUpdateSelectiveByCondition(CodeBuildProperty codeBuildProperty, CodeBuildPropertyExample codeBuildPropertyQueryCondition) {
		CodeBuildPropertyMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildPropertyMapper.class);
		int ret = mapperImpl.updateByExampleSelective(codeBuildProperty, codeBuildPropertyQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="codeBuildProperty">从数据库中删除一个对象CodeBuildProperty</param>
	 * <param name="ABuildPropertyId">ÊôÐÔ±êÊ¶</param>
	 */
	protected int codeBuildPropertyDeleteByPrimaryKey(int ABuildPropertyId) {
		CodeBuildPropertyMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildPropertyMapper.class);
		return mapperImpl.deleteByPrimaryKey(ABuildPropertyId);
	}
	
	/**
	 * <param name="codeBuildProperty">从数据库中删除一个对象CodeBuildProperty</param>
	 */
	protected int codeBuildPropertyDeleteByCondition(CodeBuildPropertyExample codeBuildPropertyQueryCondition) {
		CodeBuildPropertyMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildPropertyMapper.class);
		return mapperImpl.deleteByExample(codeBuildPropertyQueryCondition);
	}
	
	/**
	 * <param name="codeBuildProperty">从数据库中查询一个对象CodeBuildProperty</param>
	 * <param name="ABuildPropertyId">ÊôÐÔ±êÊ¶</param>
	 */
	protected CodeBuildProperty codeBuildPropertySelectByPrimaryKey(int ABuildPropertyId) {
		CodeBuildPropertyMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildPropertyMapper.class);
		return mapperImpl.selectByPrimaryKey(ABuildPropertyId);
	}
	
	/**
	 * <param name="codeBuildPropertyQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<CodeBuildProperty> codeBuildPropertySelectObjects(CodeBuildPropertyExample codeBuildPropertyQueryCondition) {
		CodeBuildPropertyMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildPropertyMapper.class);
		return mapperImpl.selectByExample(codeBuildPropertyQueryCondition);
	}
	
	/**
	 * <param name="codeBuildPropertyQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int codeBuildPropertyQuerySelectObjectsCount(CodeBuildPropertyExample codeBuildPropertyQueryCondition) {
		CodeBuildPropertyMapper mapperImpl = this.getSqlSession().getMapper(CodeBuildPropertyMapper.class);
		return mapperImpl.countByExample(codeBuildPropertyQueryCondition);
	}
	
	/**
	 * 插入一个对象DepartMent到数据库中
	 * <param name="DepartMent">需要插入的DepartMent</param>
	 */
	protected int departMentInsert(DepartMent departMent) {
		DepartMentMapper mapperImpl = this.getSqlSession().getMapper(DepartMentMapper.class);
		return mapperImpl.insertSelective(departMent);
	}
	
	/**
	 * 更新一个对象DepartMent到数据库中
	 * <param name="departMent">需要更新的DepartMent</param>
	 */
	protected int departMentUpdate(DepartMent departMent) {
		DepartMentMapper mapperImpl = this.getSqlSession().getMapper(DepartMentMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(departMent);
		return ret;
	}
	
	/**
	 * 更新一个对象DepartMent到数据库中
	 * <param name="departMent">需要更新的DepartMent</param>
	 */
	protected int departMentUpdateSelective(DepartMent departMent) {
		DepartMentMapper mapperImpl = this.getSqlSession().getMapper(DepartMentMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(departMent);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象DepartMent到数据库中
	 * <param name="departMent">需要更新的DepartMent</param>
	 * <param name="departMentQueryCondition">附加的条件</param>
	 */
	protected int departMentUpdateByCondition(DepartMent departMent, DepartMentExample departMentQueryCondition) {
		DepartMentMapper mapperImpl = this.getSqlSession().getMapper(DepartMentMapper.class);
		int ret = mapperImpl.updateByExample(departMent, departMentQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息DepartMent到数据库中
	 * <param name="departMent">需要更新的DepartMent</param>
	 * <param name="departMentQueryCondition">附加的条件</param>
	 */
	protected int departMentUpdateSelectiveByCondition(DepartMent departMent, DepartMentExample departMentQueryCondition) {
		DepartMentMapper mapperImpl = this.getSqlSession().getMapper(DepartMentMapper.class);
		int ret = mapperImpl.updateByExampleSelective(departMent, departMentQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="departMent">从数据库中删除一个对象DepartMent</param>
	 * <param name="ADepartMentId">²¿ÃÅID</param>
	 */
	protected int departMentDeleteByPrimaryKey(int ADepartMentId) {
		DepartMentMapper mapperImpl = this.getSqlSession().getMapper(DepartMentMapper.class);
		return mapperImpl.deleteByPrimaryKey(ADepartMentId);
	}
	
	/**
	 * <param name="departMent">从数据库中删除一个对象DepartMent</param>
	 */
	protected int departMentDeleteByCondition(DepartMentExample departMentQueryCondition) {
		DepartMentMapper mapperImpl = this.getSqlSession().getMapper(DepartMentMapper.class);
		return mapperImpl.deleteByExample(departMentQueryCondition);
	}
	
	/**
	 * <param name="departMent">从数据库中查询一个对象DepartMent</param>
	 * <param name="ADepartMentId">²¿ÃÅID</param>
	 */
	protected DepartMent departMentSelectByPrimaryKey(int ADepartMentId) {
		DepartMentMapper mapperImpl = this.getSqlSession().getMapper(DepartMentMapper.class);
		return mapperImpl.selectByPrimaryKey(ADepartMentId);
	}
	
	/**
	 * <param name="departMentQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<DepartMent> departMentSelectObjects(DepartMentExample departMentQueryCondition) {
		DepartMentMapper mapperImpl = this.getSqlSession().getMapper(DepartMentMapper.class);
		return mapperImpl.selectByExample(departMentQueryCondition);
	}
	
	/**
	 * <param name="departMentQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int departMentQuerySelectObjectsCount(DepartMentExample departMentQueryCondition) {
		DepartMentMapper mapperImpl = this.getSqlSession().getMapper(DepartMentMapper.class);
		return mapperImpl.countByExample(departMentQueryCondition);
	}
	
	/**
	 * 插入一个对象DepartMentUserKey到数据库中
	 * <param name="DepartMentUserKey">需要插入的DepartMentUserKey</param>
	 */
	protected int departMentUserInsert(DepartMentUserKey departMentUser) {
		DepartMentUserMapper mapperImpl = this.getSqlSession().getMapper(DepartMentUserMapper.class);
		return mapperImpl.insertSelective(departMentUser);
	}
	
	/**
	 * <param name="departMentUser">从数据库中删除一个对象DepartMentUser</param>
	 * <param name="ADepartMentUserKey"> 主键类</param>
	 */
	protected int departMentUserDeleteByPrimaryKey(DepartMentUserKey ADepartMentUserKey) {
		DepartMentUserMapper mapperImpl = this.getSqlSession().getMapper(DepartMentUserMapper.class);
		return mapperImpl.deleteByPrimaryKey(ADepartMentUserKey);
	}
	
	/**
	 * <param name="departMentUser">从数据库中删除一个对象DepartMentUser</param>
	 */
	protected int departMentUserDeleteByCondition(DepartMentUserExample departMentUserQueryCondition) {
		DepartMentUserMapper mapperImpl = this.getSqlSession().getMapper(DepartMentUserMapper.class);
		return mapperImpl.deleteByExample(departMentUserQueryCondition);
	}
	
	/**
	 * <param name="departMentUserQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<DepartMentUserKey> departMentUserSelectObjects(DepartMentUserExample departMentUserQueryCondition) {
		DepartMentUserMapper mapperImpl = this.getSqlSession().getMapper(DepartMentUserMapper.class);
		return mapperImpl.selectByExample(departMentUserQueryCondition);
	}
	
	/**
	 * <param name="departMentUserQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int departMentUserQuerySelectObjectsCount(DepartMentUserExample departMentUserQueryCondition) {
		DepartMentUserMapper mapperImpl = this.getSqlSession().getMapper(DepartMentUserMapper.class);
		return mapperImpl.countByExample(departMentUserQueryCondition);
	}
	
	/**
	 * 插入一个对象FuncParams到数据库中
	 * <param name="FuncParams">需要插入的FuncParams</param>
	 */
	protected int funcParamsInsert(FuncParams funcParams) {
		FuncParamsMapper mapperImpl = this.getSqlSession().getMapper(FuncParamsMapper.class);
		return mapperImpl.insertSelective(funcParams);
	}
	
	/**
	 * 更新一个对象FuncParams到数据库中
	 * <param name="funcParams">需要更新的FuncParams</param>
	 */
	protected int funcParamsUpdate(FuncParams funcParams) {
		FuncParamsMapper mapperImpl = this.getSqlSession().getMapper(FuncParamsMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(funcParams);
		return ret;
	}
	
	/**
	 * 更新一个对象FuncParams到数据库中
	 * <param name="funcParams">需要更新的FuncParams</param>
	 */
	protected int funcParamsUpdateSelective(FuncParams funcParams) {
		FuncParamsMapper mapperImpl = this.getSqlSession().getMapper(FuncParamsMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(funcParams);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象FuncParams到数据库中
	 * <param name="funcParams">需要更新的FuncParams</param>
	 * <param name="funcParamsQueryCondition">附加的条件</param>
	 */
	protected int funcParamsUpdateByCondition(FuncParams funcParams, FuncParamsExample funcParamsQueryCondition) {
		FuncParamsMapper mapperImpl = this.getSqlSession().getMapper(FuncParamsMapper.class);
		int ret = mapperImpl.updateByExample(funcParams, funcParamsQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息FuncParams到数据库中
	 * <param name="funcParams">需要更新的FuncParams</param>
	 * <param name="funcParamsQueryCondition">附加的条件</param>
	 */
	protected int funcParamsUpdateSelectiveByCondition(FuncParams funcParams, FuncParamsExample funcParamsQueryCondition) {
		FuncParamsMapper mapperImpl = this.getSqlSession().getMapper(FuncParamsMapper.class);
		int ret = mapperImpl.updateByExampleSelective(funcParams, funcParamsQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="funcParams">从数据库中删除一个对象FuncParams</param>
	 * <param name="AParamId">²ÎÊý±êÊ¶</param>
	 */
	protected int funcParamsDeleteByPrimaryKey(int AParamId) {
		FuncParamsMapper mapperImpl = this.getSqlSession().getMapper(FuncParamsMapper.class);
		return mapperImpl.deleteByPrimaryKey(AParamId);
	}
	
	/**
	 * <param name="funcParams">从数据库中删除一个对象FuncParams</param>
	 */
	protected int funcParamsDeleteByCondition(FuncParamsExample funcParamsQueryCondition) {
		FuncParamsMapper mapperImpl = this.getSqlSession().getMapper(FuncParamsMapper.class);
		return mapperImpl.deleteByExample(funcParamsQueryCondition);
	}
	
	/**
	 * <param name="funcParams">从数据库中查询一个对象FuncParams</param>
	 * <param name="AParamId">²ÎÊý±êÊ¶</param>
	 */
	protected FuncParams funcParamsSelectByPrimaryKey(int AParamId) {
		FuncParamsMapper mapperImpl = this.getSqlSession().getMapper(FuncParamsMapper.class);
		return mapperImpl.selectByPrimaryKey(AParamId);
	}
	
	/**
	 * <param name="funcParamsQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<FuncParams> funcParamsSelectObjects(FuncParamsExample funcParamsQueryCondition) {
		FuncParamsMapper mapperImpl = this.getSqlSession().getMapper(FuncParamsMapper.class);
		return mapperImpl.selectByExample(funcParamsQueryCondition);
	}
	
	/**
	 * <param name="funcParamsQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int funcParamsQuerySelectObjectsCount(FuncParamsExample funcParamsQueryCondition) {
		FuncParamsMapper mapperImpl = this.getSqlSession().getMapper(FuncParamsMapper.class);
		return mapperImpl.countByExample(funcParamsQueryCondition);
	}
	
	/**
	 * 插入一个对象FuncProcedure到数据库中
	 * <param name="FuncProcedure">需要插入的FuncProcedure</param>
	 */
	protected int funcProcedureInsert(FuncProcedure funcProcedure) {
		FuncProcedureMapper mapperImpl = this.getSqlSession().getMapper(FuncProcedureMapper.class);
		return mapperImpl.insertSelective(funcProcedure);
	}
	
	/**
	 * 更新一个对象FuncProcedure到数据库中
	 * <param name="funcProcedure">需要更新的FuncProcedure</param>
	 */
	protected int funcProcedureUpdate(FuncProcedure funcProcedure) {
		FuncProcedureMapper mapperImpl = this.getSqlSession().getMapper(FuncProcedureMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(funcProcedure);
		return ret;
	}
	
	/**
	 * 更新一个对象FuncProcedure到数据库中
	 * <param name="funcProcedure">需要更新的FuncProcedure</param>
	 */
	protected int funcProcedureUpdateSelective(FuncProcedure funcProcedure) {
		FuncProcedureMapper mapperImpl = this.getSqlSession().getMapper(FuncProcedureMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(funcProcedure);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象FuncProcedure到数据库中
	 * <param name="funcProcedure">需要更新的FuncProcedure</param>
	 * <param name="funcProcedureQueryCondition">附加的条件</param>
	 */
	protected int funcProcedureUpdateByCondition(FuncProcedure funcProcedure, FuncProcedureExample funcProcedureQueryCondition) {
		FuncProcedureMapper mapperImpl = this.getSqlSession().getMapper(FuncProcedureMapper.class);
		int ret = mapperImpl.updateByExample(funcProcedure, funcProcedureQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息FuncProcedure到数据库中
	 * <param name="funcProcedure">需要更新的FuncProcedure</param>
	 * <param name="funcProcedureQueryCondition">附加的条件</param>
	 */
	protected int funcProcedureUpdateSelectiveByCondition(FuncProcedure funcProcedure, FuncProcedureExample funcProcedureQueryCondition) {
		FuncProcedureMapper mapperImpl = this.getSqlSession().getMapper(FuncProcedureMapper.class);
		int ret = mapperImpl.updateByExampleSelective(funcProcedure, funcProcedureQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="funcProcedure">从数据库中删除一个对象FuncProcedure</param>
	 * <param name="AFuncProcedureId">º¯Êý¹ý³Ì±êÊ¶</param>
	 */
	protected int funcProcedureDeleteByPrimaryKey(int AFuncProcedureId) {
		FuncProcedureMapper mapperImpl = this.getSqlSession().getMapper(FuncProcedureMapper.class);
		return mapperImpl.deleteByPrimaryKey(AFuncProcedureId);
	}
	
	/**
	 * <param name="funcProcedure">从数据库中删除一个对象FuncProcedure</param>
	 */
	protected int funcProcedureDeleteByCondition(FuncProcedureExample funcProcedureQueryCondition) {
		FuncProcedureMapper mapperImpl = this.getSqlSession().getMapper(FuncProcedureMapper.class);
		return mapperImpl.deleteByExample(funcProcedureQueryCondition);
	}
	
	/**
	 * <param name="funcProcedure">从数据库中查询一个对象FuncProcedure</param>
	 * <param name="AFuncProcedureId">º¯Êý¹ý³Ì±êÊ¶</param>
	 */
	protected FuncProcedure funcProcedureSelectByPrimaryKey(int AFuncProcedureId) {
		FuncProcedureMapper mapperImpl = this.getSqlSession().getMapper(FuncProcedureMapper.class);
		return mapperImpl.selectByPrimaryKey(AFuncProcedureId);
	}
	
	/**
	 * <param name="funcProcedureQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<FuncProcedure> funcProcedureSelectObjects(FuncProcedureExample funcProcedureQueryCondition) {
		FuncProcedureMapper mapperImpl = this.getSqlSession().getMapper(FuncProcedureMapper.class);
		return mapperImpl.selectByExample(funcProcedureQueryCondition);
	}
	
	/**
	 * <param name="funcProcedureQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int funcProcedureQuerySelectObjectsCount(FuncProcedureExample funcProcedureQueryCondition) {
		FuncProcedureMapper mapperImpl = this.getSqlSession().getMapper(FuncProcedureMapper.class);
		return mapperImpl.countByExample(funcProcedureQueryCondition);
	}
	
	/**
	 * 插入一个对象FuncProject到数据库中
	 * <param name="FuncProject">需要插入的FuncProject</param>
	 */
	protected int funcProjectInsert(FuncProject funcProject) {
		FuncProjectMapper mapperImpl = this.getSqlSession().getMapper(FuncProjectMapper.class);
		return mapperImpl.insertSelective(funcProject);
	}
	
	/**
	 * 更新一个对象FuncProject到数据库中
	 * <param name="funcProject">需要更新的FuncProject</param>
	 */
	protected int funcProjectUpdate(FuncProject funcProject) {
		FuncProjectMapper mapperImpl = this.getSqlSession().getMapper(FuncProjectMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(funcProject);
		return ret;
	}
	
	/**
	 * 更新一个对象FuncProject到数据库中
	 * <param name="funcProject">需要更新的FuncProject</param>
	 */
	protected int funcProjectUpdateSelective(FuncProject funcProject) {
		FuncProjectMapper mapperImpl = this.getSqlSession().getMapper(FuncProjectMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(funcProject);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象FuncProject到数据库中
	 * <param name="funcProject">需要更新的FuncProject</param>
	 * <param name="funcProjectQueryCondition">附加的条件</param>
	 */
	protected int funcProjectUpdateByCondition(FuncProject funcProject, FuncProjectExample funcProjectQueryCondition) {
		FuncProjectMapper mapperImpl = this.getSqlSession().getMapper(FuncProjectMapper.class);
		int ret = mapperImpl.updateByExample(funcProject, funcProjectQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息FuncProject到数据库中
	 * <param name="funcProject">需要更新的FuncProject</param>
	 * <param name="funcProjectQueryCondition">附加的条件</param>
	 */
	protected int funcProjectUpdateSelectiveByCondition(FuncProject funcProject, FuncProjectExample funcProjectQueryCondition) {
		FuncProjectMapper mapperImpl = this.getSqlSession().getMapper(FuncProjectMapper.class);
		int ret = mapperImpl.updateByExampleSelective(funcProject, funcProjectQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="funcProject">从数据库中删除一个对象FuncProject</param>
	 * <param name="AFuncProjectId">º¯ÊýÏîÄ¿±êÊ¶</param>
	 */
	protected int funcProjectDeleteByPrimaryKey(int AFuncProjectId) {
		FuncProjectMapper mapperImpl = this.getSqlSession().getMapper(FuncProjectMapper.class);
		return mapperImpl.deleteByPrimaryKey(AFuncProjectId);
	}
	
	/**
	 * <param name="funcProject">从数据库中删除一个对象FuncProject</param>
	 */
	protected int funcProjectDeleteByCondition(FuncProjectExample funcProjectQueryCondition) {
		FuncProjectMapper mapperImpl = this.getSqlSession().getMapper(FuncProjectMapper.class);
		return mapperImpl.deleteByExample(funcProjectQueryCondition);
	}
	
	/**
	 * <param name="funcProject">从数据库中查询一个对象FuncProject</param>
	 * <param name="AFuncProjectId">º¯ÊýÏîÄ¿±êÊ¶</param>
	 */
	protected FuncProject funcProjectSelectByPrimaryKey(int AFuncProjectId) {
		FuncProjectMapper mapperImpl = this.getSqlSession().getMapper(FuncProjectMapper.class);
		return mapperImpl.selectByPrimaryKey(AFuncProjectId);
	}
	
	/**
	 * <param name="funcProjectQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<FuncProject> funcProjectSelectObjects(FuncProjectExample funcProjectQueryCondition) {
		FuncProjectMapper mapperImpl = this.getSqlSession().getMapper(FuncProjectMapper.class);
		return mapperImpl.selectByExample(funcProjectQueryCondition);
	}
	
	/**
	 * <param name="funcProjectQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int funcProjectQuerySelectObjectsCount(FuncProjectExample funcProjectQueryCondition) {
		FuncProjectMapper mapperImpl = this.getSqlSession().getMapper(FuncProjectMapper.class);
		return mapperImpl.countByExample(funcProjectQueryCondition);
	}
	
	/**
	 * 插入一个对象FuncTest到数据库中
	 * <param name="FuncTest">需要插入的FuncTest</param>
	 */
	protected int funcTestInsert(FuncTest funcTest) {
		FuncTestMapper mapperImpl = this.getSqlSession().getMapper(FuncTestMapper.class);
		return mapperImpl.insertSelective(funcTest);
	}
	
	/**
	 * 更新一个对象FuncTest到数据库中
	 * <param name="funcTest">需要更新的FuncTest</param>
	 */
	protected int funcTestUpdate(FuncTest funcTest) {
		FuncTestMapper mapperImpl = this.getSqlSession().getMapper(FuncTestMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(funcTest);
		return ret;
	}
	
	/**
	 * 更新一个对象FuncTest到数据库中
	 * <param name="funcTest">需要更新的FuncTest</param>
	 */
	protected int funcTestUpdateSelective(FuncTest funcTest) {
		FuncTestMapper mapperImpl = this.getSqlSession().getMapper(FuncTestMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(funcTest);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象FuncTest到数据库中
	 * <param name="funcTest">需要更新的FuncTest</param>
	 * <param name="funcTestQueryCondition">附加的条件</param>
	 */
	protected int funcTestUpdateByCondition(FuncTest funcTest, FuncTestExample funcTestQueryCondition) {
		FuncTestMapper mapperImpl = this.getSqlSession().getMapper(FuncTestMapper.class);
		int ret = mapperImpl.updateByExample(funcTest, funcTestQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息FuncTest到数据库中
	 * <param name="funcTest">需要更新的FuncTest</param>
	 * <param name="funcTestQueryCondition">附加的条件</param>
	 */
	protected int funcTestUpdateSelectiveByCondition(FuncTest funcTest, FuncTestExample funcTestQueryCondition) {
		FuncTestMapper mapperImpl = this.getSqlSession().getMapper(FuncTestMapper.class);
		int ret = mapperImpl.updateByExampleSelective(funcTest, funcTestQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="funcTest">从数据库中删除一个对象FuncTest</param>
	 * <param name="AFuncTestKey">º¯Êý²âÊÔ 主键类</param>
	 */
	protected int funcTestDeleteByPrimaryKey(FuncTestKey AFuncTestKey) {
		FuncTestMapper mapperImpl = this.getSqlSession().getMapper(FuncTestMapper.class);
		return mapperImpl.deleteByPrimaryKey(AFuncTestKey);
	}
	
	/**
	 * <param name="funcTest">从数据库中删除一个对象FuncTest</param>
	 */
	protected int funcTestDeleteByCondition(FuncTestExample funcTestQueryCondition) {
		FuncTestMapper mapperImpl = this.getSqlSession().getMapper(FuncTestMapper.class);
		return mapperImpl.deleteByExample(funcTestQueryCondition);
	}
	
	/**
	 * <param name="funcTest">从数据库中查询一个对象FuncTest</param>
	 * <param name="AFuncTestKey">º¯Êý²âÊÔ 主键类</param>
	 */
	protected FuncTest funcTestSelectByPrimaryKey(FuncTestKey AFuncTestKey) {
		FuncTestMapper mapperImpl = this.getSqlSession().getMapper(FuncTestMapper.class);
		return mapperImpl.selectByPrimaryKey(AFuncTestKey);
	}
	
	/**
	 * <param name="funcTestQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<FuncTest> funcTestSelectObjects(FuncTestExample funcTestQueryCondition) {
		FuncTestMapper mapperImpl = this.getSqlSession().getMapper(FuncTestMapper.class);
		return mapperImpl.selectByExample(funcTestQueryCondition);
	}
	
	/**
	 * <param name="funcTestQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int funcTestQuerySelectObjectsCount(FuncTestExample funcTestQueryCondition) {
		FuncTestMapper mapperImpl = this.getSqlSession().getMapper(FuncTestMapper.class);
		return mapperImpl.countByExample(funcTestQueryCondition);
	}
	
	/**
	 * 插入一个对象Identity到数据库中
	 * <param name="Identity">需要插入的Identity</param>
	 */
	protected int identityInsert(Identity identity) {
		IdentityMapper mapperImpl = this.getSqlSession().getMapper(IdentityMapper.class);
		return mapperImpl.insertSelective(identity);
	}
	
	/**
	 * 更新一个对象Identity到数据库中
	 * <param name="identity">需要更新的Identity</param>
	 */
	protected int identityUpdate(Identity identity) {
		IdentityMapper mapperImpl = this.getSqlSession().getMapper(IdentityMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(identity);
		return ret;
	}
	
	/**
	 * 更新一个对象Identity到数据库中
	 * <param name="identity">需要更新的Identity</param>
	 */
	protected int identityUpdateSelective(Identity identity) {
		IdentityMapper mapperImpl = this.getSqlSession().getMapper(IdentityMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(identity);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Identity到数据库中
	 * <param name="identity">需要更新的Identity</param>
	 * <param name="identityQueryCondition">附加的条件</param>
	 */
	protected int identityUpdateByCondition(Identity identity, IdentityExample identityQueryCondition) {
		IdentityMapper mapperImpl = this.getSqlSession().getMapper(IdentityMapper.class);
		int ret = mapperImpl.updateByExample(identity, identityQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Identity到数据库中
	 * <param name="identity">需要更新的Identity</param>
	 * <param name="identityQueryCondition">附加的条件</param>
	 */
	protected int identityUpdateSelectiveByCondition(Identity identity, IdentityExample identityQueryCondition) {
		IdentityMapper mapperImpl = this.getSqlSession().getMapper(IdentityMapper.class);
		int ret = mapperImpl.updateByExampleSelective(identity, identityQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="identity">从数据库中删除一个对象Identity</param>
	 * <param name="ATabName"></param>
	 */
	protected int identityDeleteByPrimaryKey(String ATabName) {
		IdentityMapper mapperImpl = this.getSqlSession().getMapper(IdentityMapper.class);
		return mapperImpl.deleteByPrimaryKey(ATabName);
	}
	
	/**
	 * <param name="identity">从数据库中删除一个对象Identity</param>
	 */
	protected int identityDeleteByCondition(IdentityExample identityQueryCondition) {
		IdentityMapper mapperImpl = this.getSqlSession().getMapper(IdentityMapper.class);
		return mapperImpl.deleteByExample(identityQueryCondition);
	}
	
	/**
	 * <param name="identity">从数据库中查询一个对象Identity</param>
	 * <param name="ATabName"></param>
	 */
	protected Identity identitySelectByPrimaryKey(String ATabName) {
		IdentityMapper mapperImpl = this.getSqlSession().getMapper(IdentityMapper.class);
		return mapperImpl.selectByPrimaryKey(ATabName);
	}
	
	/**
	 * <param name="identityQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Identity> identitySelectObjects(IdentityExample identityQueryCondition) {
		IdentityMapper mapperImpl = this.getSqlSession().getMapper(IdentityMapper.class);
		return mapperImpl.selectByExample(identityQueryCondition);
	}
	
	/**
	 * <param name="identityQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int identityQuerySelectObjectsCount(IdentityExample identityQueryCondition) {
		IdentityMapper mapperImpl = this.getSqlSession().getMapper(IdentityMapper.class);
		return mapperImpl.countByExample(identityQueryCondition);
	}
	
	/**
	 * 插入一个对象OrmappingProject到数据库中
	 * <param name="OrmappingProject">需要插入的OrmappingProject</param>
	 */
	protected int ormappingProjectInsert(OrmappingProject ormappingProject) {
		OrmappingProjectMapper mapperImpl = this.getSqlSession().getMapper(OrmappingProjectMapper.class);
		return mapperImpl.insertSelective(ormappingProject);
	}
	
	/**
	 * 更新一个对象OrmappingProject到数据库中
	 * <param name="ormappingProject">需要更新的OrmappingProject</param>
	 */
	protected int ormappingProjectUpdate(OrmappingProject ormappingProject) {
		OrmappingProjectMapper mapperImpl = this.getSqlSession().getMapper(OrmappingProjectMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(ormappingProject);
		return ret;
	}
	
	/**
	 * 更新一个对象OrmappingProject到数据库中
	 * <param name="ormappingProject">需要更新的OrmappingProject</param>
	 */
	protected int ormappingProjectUpdateSelective(OrmappingProject ormappingProject) {
		OrmappingProjectMapper mapperImpl = this.getSqlSession().getMapper(OrmappingProjectMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(ormappingProject);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象OrmappingProject到数据库中
	 * <param name="ormappingProject">需要更新的OrmappingProject</param>
	 * <param name="ormappingProjectQueryCondition">附加的条件</param>
	 */
	protected int ormappingProjectUpdateByCondition(OrmappingProject ormappingProject, OrmappingProjectExample ormappingProjectQueryCondition) {
		OrmappingProjectMapper mapperImpl = this.getSqlSession().getMapper(OrmappingProjectMapper.class);
		int ret = mapperImpl.updateByExample(ormappingProject, ormappingProjectQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息OrmappingProject到数据库中
	 * <param name="ormappingProject">需要更新的OrmappingProject</param>
	 * <param name="ormappingProjectQueryCondition">附加的条件</param>
	 */
	protected int ormappingProjectUpdateSelectiveByCondition(OrmappingProject ormappingProject, OrmappingProjectExample ormappingProjectQueryCondition) {
		OrmappingProjectMapper mapperImpl = this.getSqlSession().getMapper(OrmappingProjectMapper.class);
		int ret = mapperImpl.updateByExampleSelective(ormappingProject, ormappingProjectQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="ormappingProject">从数据库中删除一个对象OrmappingProject</param>
	 * <param name="AProjId">¹¤³ÌºÅ</param>
	 */
	protected int ormappingProjectDeleteByPrimaryKey(int AProjId) {
		OrmappingProjectMapper mapperImpl = this.getSqlSession().getMapper(OrmappingProjectMapper.class);
		return mapperImpl.deleteByPrimaryKey(AProjId);
	}
	
	/**
	 * <param name="ormappingProject">从数据库中删除一个对象OrmappingProject</param>
	 */
	protected int ormappingProjectDeleteByCondition(OrmappingProjectExample ormappingProjectQueryCondition) {
		OrmappingProjectMapper mapperImpl = this.getSqlSession().getMapper(OrmappingProjectMapper.class);
		return mapperImpl.deleteByExample(ormappingProjectQueryCondition);
	}
	
	/**
	 * <param name="ormappingProject">从数据库中查询一个对象OrmappingProject</param>
	 * <param name="AProjId">¹¤³ÌºÅ</param>
	 */
	protected OrmappingProject ormappingProjectSelectByPrimaryKey(int AProjId) {
		OrmappingProjectMapper mapperImpl = this.getSqlSession().getMapper(OrmappingProjectMapper.class);
		return mapperImpl.selectByPrimaryKey(AProjId);
	}
	
	/**
	 * <param name="ormappingProjectQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<OrmappingProject> ormappingProjectSelectObjects(OrmappingProjectExample ormappingProjectQueryCondition) {
		OrmappingProjectMapper mapperImpl = this.getSqlSession().getMapper(OrmappingProjectMapper.class);
		return mapperImpl.selectByExample(ormappingProjectQueryCondition);
	}
	
	/**
	 * <param name="ormappingProjectQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int ormappingProjectQuerySelectObjectsCount(OrmappingProjectExample ormappingProjectQueryCondition) {
		OrmappingProjectMapper mapperImpl = this.getSqlSession().getMapper(OrmappingProjectMapper.class);
		return mapperImpl.countByExample(ormappingProjectQueryCondition);
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
	 * <param name="AProjId">¹¤³ÌºÅ</param>
	 */
	protected int projectDeleteByPrimaryKey(int AProjId) {
		ProjectMapper mapperImpl = this.getSqlSession().getMapper(ProjectMapper.class);
		return mapperImpl.deleteByPrimaryKey(AProjId);
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
	 * <param name="AProjId">¹¤³ÌºÅ</param>
	 */
	protected Project projectSelectByPrimaryKey(int AProjId) {
		ProjectMapper mapperImpl = this.getSqlSession().getMapper(ProjectMapper.class);
		return mapperImpl.selectByPrimaryKey(AProjId);
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
	protected int projectQuerySelectObjectsCount(ProjectExample projectQueryCondition) {
		ProjectMapper mapperImpl = this.getSqlSession().getMapper(ProjectMapper.class);
		return mapperImpl.countByExample(projectQueryCondition);
	}
	
	/**
	 * 插入一个对象ProjectJoinUserKey到数据库中
	 * <param name="ProjectJoinUserKey">需要插入的ProjectJoinUserKey</param>
	 */
	protected int projectJoinUserInsert(ProjectJoinUserKey projectJoinUser) {
		ProjectJoinUserMapper mapperImpl = this.getSqlSession().getMapper(ProjectJoinUserMapper.class);
		return mapperImpl.insertSelective(projectJoinUser);
	}
	
	/**
	 * <param name="projectJoinUser">从数据库中删除一个对象ProjectJoinUser</param>
	 * <param name="AProjectJoinUserKey">¹¤³Ì¡ª¡ªÓÃ»§±í 主键类</param>
	 */
	protected int projectJoinUserDeleteByPrimaryKey(ProjectJoinUserKey AProjectJoinUserKey) {
		ProjectJoinUserMapper mapperImpl = this.getSqlSession().getMapper(ProjectJoinUserMapper.class);
		return mapperImpl.deleteByPrimaryKey(AProjectJoinUserKey);
	}
	
	/**
	 * <param name="projectJoinUser">从数据库中删除一个对象ProjectJoinUser</param>
	 */
	protected int projectJoinUserDeleteByCondition(ProjectJoinUserExample projectJoinUserQueryCondition) {
		ProjectJoinUserMapper mapperImpl = this.getSqlSession().getMapper(ProjectJoinUserMapper.class);
		return mapperImpl.deleteByExample(projectJoinUserQueryCondition);
	}
	
	/**
	 * <param name="projectJoinUserQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<ProjectJoinUserKey> projectJoinUserSelectObjects(ProjectJoinUserExample projectJoinUserQueryCondition) {
		ProjectJoinUserMapper mapperImpl = this.getSqlSession().getMapper(ProjectJoinUserMapper.class);
		return mapperImpl.selectByExample(projectJoinUserQueryCondition);
	}
	
	/**
	 * <param name="projectJoinUserQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int projectJoinUserQuerySelectObjectsCount(ProjectJoinUserExample projectJoinUserQueryCondition) {
		ProjectJoinUserMapper mapperImpl = this.getSqlSession().getMapper(ProjectJoinUserMapper.class);
		return mapperImpl.countByExample(projectJoinUserQueryCondition);
	}
	
	/**
	 * 插入一个对象Role到数据库中
	 * <param name="Role">需要插入的Role</param>
	 */
	protected int roleInsert(Role role) {
		RoleMapper mapperImpl = this.getSqlSession().getMapper(RoleMapper.class);
		return mapperImpl.insertSelective(role);
	}
	
	/**
	 * 更新一个对象Role到数据库中
	 * <param name="role">需要更新的Role</param>
	 */
	protected int roleUpdate(Role role) {
		RoleMapper mapperImpl = this.getSqlSession().getMapper(RoleMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(role);
		return ret;
	}
	
	/**
	 * 更新一个对象Role到数据库中
	 * <param name="role">需要更新的Role</param>
	 */
	protected int roleUpdateSelective(Role role) {
		RoleMapper mapperImpl = this.getSqlSession().getMapper(RoleMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(role);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象Role到数据库中
	 * <param name="role">需要更新的Role</param>
	 * <param name="roleQueryCondition">附加的条件</param>
	 */
	protected int roleUpdateByCondition(Role role, RoleExample roleQueryCondition) {
		RoleMapper mapperImpl = this.getSqlSession().getMapper(RoleMapper.class);
		int ret = mapperImpl.updateByExample(role, roleQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息Role到数据库中
	 * <param name="role">需要更新的Role</param>
	 * <param name="roleQueryCondition">附加的条件</param>
	 */
	protected int roleUpdateSelectiveByCondition(Role role, RoleExample roleQueryCondition) {
		RoleMapper mapperImpl = this.getSqlSession().getMapper(RoleMapper.class);
		int ret = mapperImpl.updateByExampleSelective(role, roleQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="role">从数据库中删除一个对象Role</param>
	 * <param name="ARoleId">½ÇÉ«´úºÅ</param>
	 */
	protected int roleDeleteByPrimaryKey(int ARoleId) {
		RoleMapper mapperImpl = this.getSqlSession().getMapper(RoleMapper.class);
		return mapperImpl.deleteByPrimaryKey(ARoleId);
	}
	
	/**
	 * <param name="role">从数据库中删除一个对象Role</param>
	 */
	protected int roleDeleteByCondition(RoleExample roleQueryCondition) {
		RoleMapper mapperImpl = this.getSqlSession().getMapper(RoleMapper.class);
		return mapperImpl.deleteByExample(roleQueryCondition);
	}
	
	/**
	 * <param name="role">从数据库中查询一个对象Role</param>
	 * <param name="ARoleId">½ÇÉ«´úºÅ</param>
	 */
	protected Role roleSelectByPrimaryKey(int ARoleId) {
		RoleMapper mapperImpl = this.getSqlSession().getMapper(RoleMapper.class);
		return mapperImpl.selectByPrimaryKey(ARoleId);
	}
	
	/**
	 * <param name="roleQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Role> roleSelectObjects(RoleExample roleQueryCondition) {
		RoleMapper mapperImpl = this.getSqlSession().getMapper(RoleMapper.class);
		return mapperImpl.selectByExample(roleQueryCondition);
	}
	
	/**
	 * <param name="roleQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int roleQuerySelectObjectsCount(RoleExample roleQueryCondition) {
		RoleMapper mapperImpl = this.getSqlSession().getMapper(RoleMapper.class);
		return mapperImpl.countByExample(roleQueryCondition);
	}
	
	/**
	 * 插入一个对象SystemParam到数据库中
	 * <param name="SystemParam">需要插入的SystemParam</param>
	 */
	protected int systemParamInsert(SystemParam systemParam) {
		SystemParamMapper mapperImpl = this.getSqlSession().getMapper(SystemParamMapper.class);
		return mapperImpl.insertSelective(systemParam);
	}
	
	/**
	 * 更新一个对象SystemParam到数据库中
	 * <param name="systemParam">需要更新的SystemParam</param>
	 */
	protected int systemParamUpdate(SystemParam systemParam) {
		SystemParamMapper mapperImpl = this.getSqlSession().getMapper(SystemParamMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(systemParam);
		return ret;
	}
	
	/**
	 * 更新一个对象SystemParam到数据库中
	 * <param name="systemParam">需要更新的SystemParam</param>
	 */
	protected int systemParamUpdateSelective(SystemParam systemParam) {
		SystemParamMapper mapperImpl = this.getSqlSession().getMapper(SystemParamMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(systemParam);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象SystemParam到数据库中
	 * <param name="systemParam">需要更新的SystemParam</param>
	 * <param name="systemParamQueryCondition">附加的条件</param>
	 */
	protected int systemParamUpdateByCondition(SystemParam systemParam, SystemParamExample systemParamQueryCondition) {
		SystemParamMapper mapperImpl = this.getSqlSession().getMapper(SystemParamMapper.class);
		int ret = mapperImpl.updateByExample(systemParam, systemParamQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息SystemParam到数据库中
	 * <param name="systemParam">需要更新的SystemParam</param>
	 * <param name="systemParamQueryCondition">附加的条件</param>
	 */
	protected int systemParamUpdateSelectiveByCondition(SystemParam systemParam, SystemParamExample systemParamQueryCondition) {
		SystemParamMapper mapperImpl = this.getSqlSession().getMapper(SystemParamMapper.class);
		int ret = mapperImpl.updateByExampleSelective(systemParam, systemParamQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="systemParam">从数据库中删除一个对象SystemParam</param>
	 * <param name="ASystemParamKey">系统参数表 主键类</param>
	 */
	protected int systemParamDeleteByPrimaryKey(SystemParamKey ASystemParamKey) {
		SystemParamMapper mapperImpl = this.getSqlSession().getMapper(SystemParamMapper.class);
		return mapperImpl.deleteByPrimaryKey(ASystemParamKey);
	}
	
	/**
	 * <param name="systemParam">从数据库中删除一个对象SystemParam</param>
	 */
	protected int systemParamDeleteByCondition(SystemParamExample systemParamQueryCondition) {
		SystemParamMapper mapperImpl = this.getSqlSession().getMapper(SystemParamMapper.class);
		return mapperImpl.deleteByExample(systemParamQueryCondition);
	}
	
	/**
	 * <param name="systemParam">从数据库中查询一个对象SystemParam</param>
	 * <param name="ASystemParamKey">系统参数表 主键类</param>
	 */
	protected SystemParam systemParamSelectByPrimaryKey(SystemParamKey ASystemParamKey) {
		SystemParamMapper mapperImpl = this.getSqlSession().getMapper(SystemParamMapper.class);
		return mapperImpl.selectByPrimaryKey(ASystemParamKey);
	}
	
	/**
	 * <param name="systemParamQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<SystemParam> systemParamSelectObjects(SystemParamExample systemParamQueryCondition) {
		SystemParamMapper mapperImpl = this.getSqlSession().getMapper(SystemParamMapper.class);
		return mapperImpl.selectByExample(systemParamQueryCondition);
	}
	
	/**
	 * <param name="systemParamQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int systemParamQuerySelectObjectsCount(SystemParamExample systemParamQueryCondition) {
		SystemParamMapper mapperImpl = this.getSqlSession().getMapper(SystemParamMapper.class);
		return mapperImpl.countByExample(systemParamQueryCondition);
	}
	
	/**
	 * 插入一个对象TestParamValue到数据库中
	 * <param name="TestParamValue">需要插入的TestParamValue</param>
	 */
	protected int testParamValueInsert(TestParamValue testParamValue) {
		TestParamValueMapper mapperImpl = this.getSqlSession().getMapper(TestParamValueMapper.class);
		return mapperImpl.insertSelective(testParamValue);
	}
	
	/**
	 * 更新一个对象TestParamValue到数据库中
	 * <param name="testParamValue">需要更新的TestParamValue</param>
	 */
	protected int testParamValueUpdate(TestParamValue testParamValue) {
		TestParamValueMapper mapperImpl = this.getSqlSession().getMapper(TestParamValueMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(testParamValue);
		return ret;
	}
	
	/**
	 * 更新一个对象TestParamValue到数据库中
	 * <param name="testParamValue">需要更新的TestParamValue</param>
	 */
	protected int testParamValueUpdateSelective(TestParamValue testParamValue) {
		TestParamValueMapper mapperImpl = this.getSqlSession().getMapper(TestParamValueMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(testParamValue);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象TestParamValue到数据库中
	 * <param name="testParamValue">需要更新的TestParamValue</param>
	 * <param name="testParamValueQueryCondition">附加的条件</param>
	 */
	protected int testParamValueUpdateByCondition(TestParamValue testParamValue, TestParamValueExample testParamValueQueryCondition) {
		TestParamValueMapper mapperImpl = this.getSqlSession().getMapper(TestParamValueMapper.class);
		int ret = mapperImpl.updateByExample(testParamValue, testParamValueQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息TestParamValue到数据库中
	 * <param name="testParamValue">需要更新的TestParamValue</param>
	 * <param name="testParamValueQueryCondition">附加的条件</param>
	 */
	protected int testParamValueUpdateSelectiveByCondition(TestParamValue testParamValue, TestParamValueExample testParamValueQueryCondition) {
		TestParamValueMapper mapperImpl = this.getSqlSession().getMapper(TestParamValueMapper.class);
		int ret = mapperImpl.updateByExampleSelective(testParamValue, testParamValueQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="testParamValue">从数据库中删除一个对象TestParamValue</param>
	 * <param name="ATestParamValueKey">º¯Êý²âÊÔ²ÎÊý±í 主键类</param>
	 */
	protected int testParamValueDeleteByPrimaryKey(TestParamValueKey ATestParamValueKey) {
		TestParamValueMapper mapperImpl = this.getSqlSession().getMapper(TestParamValueMapper.class);
		return mapperImpl.deleteByPrimaryKey(ATestParamValueKey);
	}
	
	/**
	 * <param name="testParamValue">从数据库中删除一个对象TestParamValue</param>
	 */
	protected int testParamValueDeleteByCondition(TestParamValueExample testParamValueQueryCondition) {
		TestParamValueMapper mapperImpl = this.getSqlSession().getMapper(TestParamValueMapper.class);
		return mapperImpl.deleteByExample(testParamValueQueryCondition);
	}
	
	/**
	 * <param name="testParamValue">从数据库中查询一个对象TestParamValue</param>
	 * <param name="ATestParamValueKey">º¯Êý²âÊÔ²ÎÊý±í 主键类</param>
	 */
	protected TestParamValue testParamValueSelectByPrimaryKey(TestParamValueKey ATestParamValueKey) {
		TestParamValueMapper mapperImpl = this.getSqlSession().getMapper(TestParamValueMapper.class);
		return mapperImpl.selectByPrimaryKey(ATestParamValueKey);
	}
	
	/**
	 * <param name="testParamValueQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<TestParamValue> testParamValueSelectObjects(TestParamValueExample testParamValueQueryCondition) {
		TestParamValueMapper mapperImpl = this.getSqlSession().getMapper(TestParamValueMapper.class);
		return mapperImpl.selectByExample(testParamValueQueryCondition);
	}
	
	/**
	 * <param name="testParamValueQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int testParamValueQuerySelectObjectsCount(TestParamValueExample testParamValueQueryCondition) {
		TestParamValueMapper mapperImpl = this.getSqlSession().getMapper(TestParamValueMapper.class);
		return mapperImpl.countByExample(testParamValueQueryCondition);
	}
	
	/**
	 * 插入一个对象TestProcedure到数据库中
	 * <param name="TestProcedure">需要插入的TestProcedure</param>
	 */
	protected int testProcedureInsert(TestProcedure testProcedure) {
		TestProcedureMapper mapperImpl = this.getSqlSession().getMapper(TestProcedureMapper.class);
		return mapperImpl.insertSelective(testProcedure);
	}
	
	/**
	 * 更新一个对象TestProcedure到数据库中
	 * <param name="testProcedure">需要更新的TestProcedure</param>
	 */
	protected int testProcedureUpdate(TestProcedure testProcedure) {
		TestProcedureMapper mapperImpl = this.getSqlSession().getMapper(TestProcedureMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(testProcedure);
		return ret;
	}
	
	/**
	 * 更新一个对象TestProcedure到数据库中
	 * <param name="testProcedure">需要更新的TestProcedure</param>
	 */
	protected int testProcedureUpdateSelective(TestProcedure testProcedure) {
		TestProcedureMapper mapperImpl = this.getSqlSession().getMapper(TestProcedureMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(testProcedure);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象TestProcedure到数据库中
	 * <param name="testProcedure">需要更新的TestProcedure</param>
	 * <param name="testProcedureQueryCondition">附加的条件</param>
	 */
	protected int testProcedureUpdateByCondition(TestProcedure testProcedure, TestProcedureExample testProcedureQueryCondition) {
		TestProcedureMapper mapperImpl = this.getSqlSession().getMapper(TestProcedureMapper.class);
		int ret = mapperImpl.updateByExample(testProcedure, testProcedureQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息TestProcedure到数据库中
	 * <param name="testProcedure">需要更新的TestProcedure</param>
	 * <param name="testProcedureQueryCondition">附加的条件</param>
	 */
	protected int testProcedureUpdateSelectiveByCondition(TestProcedure testProcedure, TestProcedureExample testProcedureQueryCondition) {
		TestProcedureMapper mapperImpl = this.getSqlSession().getMapper(TestProcedureMapper.class);
		int ret = mapperImpl.updateByExampleSelective(testProcedure, testProcedureQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="testProcedure">从数据库中删除一个对象TestProcedure</param>
	 * <param name="ATestProcedureId">²âÊÔ¹ý³Ì±êÊ¶</param>
	 */
	protected int testProcedureDeleteByPrimaryKey(int ATestProcedureId) {
		TestProcedureMapper mapperImpl = this.getSqlSession().getMapper(TestProcedureMapper.class);
		return mapperImpl.deleteByPrimaryKey(ATestProcedureId);
	}
	
	/**
	 * <param name="testProcedure">从数据库中删除一个对象TestProcedure</param>
	 */
	protected int testProcedureDeleteByCondition(TestProcedureExample testProcedureQueryCondition) {
		TestProcedureMapper mapperImpl = this.getSqlSession().getMapper(TestProcedureMapper.class);
		return mapperImpl.deleteByExample(testProcedureQueryCondition);
	}
	
	/**
	 * <param name="testProcedure">从数据库中查询一个对象TestProcedure</param>
	 * <param name="ATestProcedureId">²âÊÔ¹ý³Ì±êÊ¶</param>
	 */
	protected TestProcedure testProcedureSelectByPrimaryKey(int ATestProcedureId) {
		TestProcedureMapper mapperImpl = this.getSqlSession().getMapper(TestProcedureMapper.class);
		return mapperImpl.selectByPrimaryKey(ATestProcedureId);
	}
	
	/**
	 * <param name="testProcedureQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<TestProcedure> testProcedureSelectObjects(TestProcedureExample testProcedureQueryCondition) {
		TestProcedureMapper mapperImpl = this.getSqlSession().getMapper(TestProcedureMapper.class);
		return mapperImpl.selectByExample(testProcedureQueryCondition);
	}
	
	/**
	 * <param name="testProcedureQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int testProcedureQuerySelectObjectsCount(TestProcedureExample testProcedureQueryCondition) {
		TestProcedureMapper mapperImpl = this.getSqlSession().getMapper(TestProcedureMapper.class);
		return mapperImpl.countByExample(testProcedureQueryCondition);
	}
	
	/**
	 * 插入一个对象User到数据库中
	 * <param name="User">需要插入的User</param>
	 */
	protected int userInsert(User user) {
		UserMapper mapperImpl = this.getSqlSession().getMapper(UserMapper.class);
		return mapperImpl.insertSelective(user);
	}
	
	/**
	 * 更新一个对象User到数据库中
	 * <param name="user">需要更新的User</param>
	 */
	protected int userUpdate(User user) {
		UserMapper mapperImpl = this.getSqlSession().getMapper(UserMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(user);
		return ret;
	}
	
	/**
	 * 更新一个对象User到数据库中
	 * <param name="user">需要更新的User</param>
	 */
	protected int userUpdateSelective(User user) {
		UserMapper mapperImpl = this.getSqlSession().getMapper(UserMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(user);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象User到数据库中
	 * <param name="user">需要更新的User</param>
	 * <param name="userQueryCondition">附加的条件</param>
	 */
	protected int userUpdateByCondition(User user, UserExample userQueryCondition) {
		UserMapper mapperImpl = this.getSqlSession().getMapper(UserMapper.class);
		int ret = mapperImpl.updateByExample(user, userQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息User到数据库中
	 * <param name="user">需要更新的User</param>
	 * <param name="userQueryCondition">附加的条件</param>
	 */
	protected int userUpdateSelectiveByCondition(User user, UserExample userQueryCondition) {
		UserMapper mapperImpl = this.getSqlSession().getMapper(UserMapper.class);
		int ret = mapperImpl.updateByExampleSelective(user, userQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="user">从数据库中删除一个对象User</param>
	 * <param name="AUserId">ÓÃ»§´úºÅ</param>
	 */
	protected int userDeleteByPrimaryKey(int AUserId) {
		UserMapper mapperImpl = this.getSqlSession().getMapper(UserMapper.class);
		return mapperImpl.deleteByPrimaryKey(AUserId);
	}
	
	/**
	 * <param name="user">从数据库中删除一个对象User</param>
	 */
	protected int userDeleteByCondition(UserExample userQueryCondition) {
		UserMapper mapperImpl = this.getSqlSession().getMapper(UserMapper.class);
		return mapperImpl.deleteByExample(userQueryCondition);
	}
	
	/**
	 * <param name="user">从数据库中查询一个对象User</param>
	 * <param name="AUserId">ÓÃ»§´úºÅ</param>
	 */
	protected User userSelectByPrimaryKey(int AUserId) {
		UserMapper mapperImpl = this.getSqlSession().getMapper(UserMapper.class);
		return mapperImpl.selectByPrimaryKey(AUserId);
	}
	
	/**
	 * <param name="userQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<User> userSelectObjects(UserExample userQueryCondition) {
		UserMapper mapperImpl = this.getSqlSession().getMapper(UserMapper.class);
		return mapperImpl.selectByExample(userQueryCondition);
	}
	
	/**
	 * <param name="userQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int userQuerySelectObjectsCount(UserExample userQueryCondition) {
		UserMapper mapperImpl = this.getSqlSession().getMapper(UserMapper.class);
		return mapperImpl.countByExample(userQueryCondition);
	}
	
	/**
	 * 插入一个对象UserCheckIn到数据库中
	 * <param name="UserCheckIn">需要插入的UserCheckIn</param>
	 */
	protected int userCheckInInsert(UserCheckIn userCheckIn) {
		UserCheckInMapper mapperImpl = this.getSqlSession().getMapper(UserCheckInMapper.class);
		return mapperImpl.insertSelective(userCheckIn);
	}
	
	/**
	 * 更新一个对象UserCheckIn到数据库中
	 * <param name="userCheckIn">需要更新的UserCheckIn</param>
	 */
	protected int userCheckInUpdate(UserCheckIn userCheckIn) {
		UserCheckInMapper mapperImpl = this.getSqlSession().getMapper(UserCheckInMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(userCheckIn);
		return ret;
	}
	
	/**
	 * 更新一个对象UserCheckIn到数据库中
	 * <param name="userCheckIn">需要更新的UserCheckIn</param>
	 */
	protected int userCheckInUpdateSelective(UserCheckIn userCheckIn) {
		UserCheckInMapper mapperImpl = this.getSqlSession().getMapper(UserCheckInMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(userCheckIn);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象UserCheckIn到数据库中
	 * <param name="userCheckIn">需要更新的UserCheckIn</param>
	 * <param name="userCheckInQueryCondition">附加的条件</param>
	 */
	protected int userCheckInUpdateByCondition(UserCheckIn userCheckIn, UserCheckInExample userCheckInQueryCondition) {
		UserCheckInMapper mapperImpl = this.getSqlSession().getMapper(UserCheckInMapper.class);
		int ret = mapperImpl.updateByExample(userCheckIn, userCheckInQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息UserCheckIn到数据库中
	 * <param name="userCheckIn">需要更新的UserCheckIn</param>
	 * <param name="userCheckInQueryCondition">附加的条件</param>
	 */
	protected int userCheckInUpdateSelectiveByCondition(UserCheckIn userCheckIn, UserCheckInExample userCheckInQueryCondition) {
		UserCheckInMapper mapperImpl = this.getSqlSession().getMapper(UserCheckInMapper.class);
		int ret = mapperImpl.updateByExampleSelective(userCheckIn, userCheckInQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="userCheckIn">从数据库中删除一个对象UserCheckIn</param>
	 * <param name="AId"></param>
	 */
	protected int userCheckInDeleteByPrimaryKey(String AId) {
		UserCheckInMapper mapperImpl = this.getSqlSession().getMapper(UserCheckInMapper.class);
		return mapperImpl.deleteByPrimaryKey(AId);
	}
	
	/**
	 * <param name="userCheckIn">从数据库中删除一个对象UserCheckIn</param>
	 */
	protected int userCheckInDeleteByCondition(UserCheckInExample userCheckInQueryCondition) {
		UserCheckInMapper mapperImpl = this.getSqlSession().getMapper(UserCheckInMapper.class);
		return mapperImpl.deleteByExample(userCheckInQueryCondition);
	}
	
	/**
	 * <param name="userCheckIn">从数据库中查询一个对象UserCheckIn</param>
	 * <param name="AId"></param>
	 */
	protected UserCheckIn userCheckInSelectByPrimaryKey(String AId) {
		UserCheckInMapper mapperImpl = this.getSqlSession().getMapper(UserCheckInMapper.class);
		return mapperImpl.selectByPrimaryKey(AId);
	}
	
	/**
	 * <param name="userCheckInQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<UserCheckIn> userCheckInSelectObjects(UserCheckInExample userCheckInQueryCondition) {
		UserCheckInMapper mapperImpl = this.getSqlSession().getMapper(UserCheckInMapper.class);
		return mapperImpl.selectByExample(userCheckInQueryCondition);
	}
	
	/**
	 * <param name="userCheckInQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int userCheckInQuerySelectObjectsCount(UserCheckInExample userCheckInQueryCondition) {
		UserCheckInMapper mapperImpl = this.getSqlSession().getMapper(UserCheckInMapper.class);
		return mapperImpl.countByExample(userCheckInQueryCondition);
	}
	
	/**
	 * 插入一个对象WorkLog到数据库中
	 * <param name="WorkLog">需要插入的WorkLog</param>
	 */
	protected int workLogInsert(WorkLog workLog) {
		WorkLogMapper mapperImpl = this.getSqlSession().getMapper(WorkLogMapper.class);
		return mapperImpl.insertSelective(workLog);
	}
	
	/**
	 * 更新一个对象WorkLog到数据库中
	 * <param name="workLog">需要更新的WorkLog</param>
	 */
	protected int workLogUpdate(WorkLog workLog) {
		WorkLogMapper mapperImpl = this.getSqlSession().getMapper(WorkLogMapper.class);
		int ret = mapperImpl.updateByPrimaryKey(workLog);
		return ret;
	}
	
	/**
	 * 更新一个对象WorkLog到数据库中
	 * <param name="workLog">需要更新的WorkLog</param>
	 */
	protected int workLogUpdateSelective(WorkLog workLog) {
		WorkLogMapper mapperImpl = this.getSqlSession().getMapper(WorkLogMapper.class);
		int ret = mapperImpl.updateByPrimaryKeySelective(workLog);
		return ret;
	}
	
	/**
	 * 更新一个对象WorkLog到数据库中
	 * <param name="workLog">需要更新的WorkLog</param>
	 */
	public int workLogUpdateWithBlobs(WorkLog workLog) {
		WorkLogMapper mapperImpl = this.getSqlSession().getMapper(WorkLogMapper.class);
		return mapperImpl.updateByPrimaryKeyWithBLOBs(workLog);
	}
	
	/**
	 * 根据条件更新一批对象WorkLog到数据库中
	 * <param name="workLog">需要更新的WorkLog</param>
	 * <param name="workLogQueryCondition">附加的条件</param>
	 */
	protected int workLogUpdateByCondition(WorkLog workLog, WorkLogExample workLogQueryCondition) {
		WorkLogMapper mapperImpl = this.getSqlSession().getMapper(WorkLogMapper.class);
		int ret = mapperImpl.updateByExample(workLog, workLogQueryCondition);
		return ret;
	}
	
	/**
	 * 根据条件更新一批对象中的部分信息WorkLog到数据库中
	 * <param name="workLog">需要更新的WorkLog</param>
	 * <param name="workLogQueryCondition">附加的条件</param>
	 */
	protected int workLogUpdateSelectiveByCondition(WorkLog workLog, WorkLogExample workLogQueryCondition) {
		WorkLogMapper mapperImpl = this.getSqlSession().getMapper(WorkLogMapper.class);
		int ret = mapperImpl.updateByExampleSelective(workLog, workLogQueryCondition);
		return ret;
	}
	
	/**
	 * <param name="workLog">从数据库中删除一个对象WorkLog</param>
	 * <param name="AWorkLogId">¹¤×÷ÈÕÖ¾´úºÅ</param>
	 */
	protected int workLogDeleteByPrimaryKey(int AWorkLogId) {
		WorkLogMapper mapperImpl = this.getSqlSession().getMapper(WorkLogMapper.class);
		return mapperImpl.deleteByPrimaryKey(AWorkLogId);
	}
	
	/**
	 * <param name="workLog">从数据库中删除一个对象WorkLog</param>
	 */
	protected int workLogDeleteByCondition(WorkLogExample workLogQueryCondition) {
		WorkLogMapper mapperImpl = this.getSqlSession().getMapper(WorkLogMapper.class);
		return mapperImpl.deleteByExample(workLogQueryCondition);
	}
	
	/**
	 * <param name="workLog">从数据库中查询一个对象WorkLog</param>
	 * <param name="AWorkLogId">¹¤×÷ÈÕÖ¾´úºÅ</param>
	 */
	protected WorkLog workLogSelectByPrimaryKey(int AWorkLogId) {
		WorkLogMapper mapperImpl = this.getSqlSession().getMapper(WorkLogMapper.class);
		return mapperImpl.selectByPrimaryKey(AWorkLogId);
	}
	
	/**
	 * <param name="workLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<WorkLog> workLogSelectObjects(WorkLogExample workLogQueryCondition) {
		WorkLogMapper mapperImpl = this.getSqlSession().getMapper(WorkLogMapper.class);
		return mapperImpl.selectByExample(workLogQueryCondition);
	}
	
	/**
	 * <param name="workLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<WorkLog> workLogSelectObjectsWithBLOBs(WorkLogExample workLogQueryCondition) {
		WorkLogMapper mapperImpl = this.getSqlSession().getMapper(WorkLogMapper.class);
		return mapperImpl.selectByExampleWithBLOBs(workLogQueryCondition);
	}
	
	/**
	 * <param name="workLogQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int workLogQuerySelectObjectsCount(WorkLogExample workLogQueryCondition) {
		WorkLogMapper mapperImpl = this.getSqlSession().getMapper(WorkLogMapper.class);
		return mapperImpl.countByExample(workLogQueryCondition);
	}
	
	/**
	 * 插入一个对象WorkLogRelationshipTaskKey到数据库中
	 * <param name="WorkLogRelationshipTaskKey">需要插入的WorkLogRelationshipTaskKey</param>
	 */
	protected int workLogRelationshipTaskInsert(WorkLogRelationshipTaskKey workLogRelationshipTask) {
		WorkLogRelationshipTaskMapper mapperImpl = this.getSqlSession().getMapper(WorkLogRelationshipTaskMapper.class);
		return mapperImpl.insertSelective(workLogRelationshipTask);
	}
	
	/**
	 * <param name="workLogRelationshipTask">从数据库中删除一个对象WorkLogRelationshipTask</param>
	 * <param name="AWorkLogRelationshipTaskKey">¹¤×÷ÈÕÖ¾¡ª¡ª¹ØÏµ¡ª¡ªÈÎÎñ±í 主键类</param>
	 */
	protected int workLogRelationshipTaskDeleteByPrimaryKey(WorkLogRelationshipTaskKey AWorkLogRelationshipTaskKey) {
		WorkLogRelationshipTaskMapper mapperImpl = this.getSqlSession().getMapper(WorkLogRelationshipTaskMapper.class);
		return mapperImpl.deleteByPrimaryKey(AWorkLogRelationshipTaskKey);
	}
	
	/**
	 * <param name="workLogRelationshipTask">从数据库中删除一个对象WorkLogRelationshipTask</param>
	 */
	protected int workLogRelationshipTaskDeleteByCondition(WorkLogRelationshipTaskExample workLogRelationshipTaskQueryCondition) {
		WorkLogRelationshipTaskMapper mapperImpl = this.getSqlSession().getMapper(WorkLogRelationshipTaskMapper.class);
		return mapperImpl.deleteByExample(workLogRelationshipTaskQueryCondition);
	}
	
	/**
	 * <param name="workLogRelationshipTaskQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<WorkLogRelationshipTaskKey> workLogRelationshipTaskSelectObjects(WorkLogRelationshipTaskExample workLogRelationshipTaskQueryCondition) {
		WorkLogRelationshipTaskMapper mapperImpl = this.getSqlSession().getMapper(WorkLogRelationshipTaskMapper.class);
		return mapperImpl.selectByExample(workLogRelationshipTaskQueryCondition);
	}
	
	/**
	 * <param name="workLogRelationshipTaskQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int workLogRelationshipTaskQuerySelectObjectsCount(WorkLogRelationshipTaskExample workLogRelationshipTaskQueryCondition) {
		WorkLogRelationshipTaskMapper mapperImpl = this.getSqlSession().getMapper(WorkLogRelationshipTaskMapper.class);
		return mapperImpl.countByExample(workLogRelationshipTaskQueryCondition);
	}
	
	/**
	 * <param name="vWorkLogViewQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<VWorkLogView> vWorkLogViewSelectObjects(VWorkLogViewExample vWorkLogViewQueryCondition) {
		VWorkLogViewMapper mapperImpl = this.getSqlSession().getMapper(VWorkLogViewMapper.class);
		return mapperImpl.selectByExample(vWorkLogViewQueryCondition);
	}
	
	/**
	 * <param name="vWorkLogViewQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	protected int vWorkLogViewQuerySelectObjectsCount(VWorkLogViewExample vWorkLogViewQueryCondition) {
		VWorkLogViewMapper mapperImpl = this.getSqlSession().getMapper(VWorkLogViewMapper.class);
		return mapperImpl.countByExample(vWorkLogViewQueryCondition);
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
