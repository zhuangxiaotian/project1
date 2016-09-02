/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2016-03-11 11:59:31                          */
/*==============================================================*/

use oa_develop;
drop procedure if exists P_GET_IDENTITY;

drop table if exists T_CHECK_DEVICE;

drop table if exists T_CLIENT_ACTIVATION;

drop table if exists T_CODE_BUILD;

drop table if exists T_CODE_BUILD_LOG;

drop table if exists T_CODE_BUILD_PROCEDURE;

drop table if exists T_CODE_BUILD_PROPERTY;

drop table if exists T_DEPART_MENT;

drop table if exists T_DEPART_MENT_USER;

drop table if exists T_FUNC_PARAMS;

drop table if exists T_FUNC_PROCEDURE;

drop table if exists T_FUNC_PROJECT;

drop table if exists T_FUNC_TEST;

drop table if exists T_IDENTITY;

drop table if exists T_ORMAPPING_PROJECT;

drop table if exists T_PROJECT;

drop table if exists T_PROJECT_JOIN_USER;

drop index Index_1 on T_ROLE;

drop table if exists T_ROLE;

drop table if exists T_SYSTEM_PARAM;

drop table if exists T_TEST_PARAM_VALUE;

drop table if exists T_TEST_PROCEDURE;

drop index Index_1 on T_USER;

drop table if exists T_USER;

drop table if exists T_USER_CHECK_IN;

drop table if exists T_WORK_LOG;

drop table if exists T_WORK_LOG_RELATIONSHIP_TASK;

/*==============================================================*/
/* Table: T_CHECK_DEVICE                                        */
/*==============================================================*/
create table T_CHECK_DEVICE
(
   ID                   char(24) not null comment 'PK',
   CHECK_DEVICE_NAME    varchar(100) not null comment '签到设备名称',
   CHECK_DEVICE_UUID    varchar(100) not null comment '签到设备唯一标识',
   CHECK_DEVICE_TYPE    char(1) not null comment '签到设备类型0Wifi路由器',
   CHECK_ADDRESS        varchar(100) comment '签到地点说明',
   ROW_VERSION          numeric(8,0) not null comment '版本',
   CREATE_TIME          datetime not null comment '创建时间',
   CREATE_ID            char(24) comment '创建人ID',
   CREATE_NAME          varchar(100) comment '创建人登录名称',
   MODIFY_TIME          datetime not null comment '修改时间',
   AUDIT_STATE          char(1) comment '审核状态0未审核 1审核通过2审核不通过',
   AUDIT_NAME           varchar(100) comment '审核人名称',
   AUDIT_ID             char(24) comment '审核人ID',
   AUDIT_TIME           datetime comment '审核时间',
   MODIFY_NAME          varchar(100) comment '修改人登录名称',
   MODIFY_ID            char(24) comment '修改人ID',
   primary key (ID)
);

alter table T_CHECK_DEVICE comment '签到设备表';

/*==============================================================*/
/* Table: T_CLIENT_ACTIVATION                                   */
/*==============================================================*/
create table T_CLIENT_ACTIVATION
(
   ID                   char(24) not null comment 'PK',
   USER_ID              numeric(8,0) comment '激活用户',
   CHANNEL              varchar(50) not null comment '激活渠道',
   CLIENT_TYPE          varchar(50) not null comment '客户端类型',
   CLIENT_VERSION       varchar(50) not null comment '客户端版本',
   DEVICE_ID            varchar(100) not null comment '设备标识',
   PUSH_ID              varchar(100) comment '用于推送的标识',
   ACTIVATION_TIME      datetime not null comment '激活时间',
   CLIENT_MODEL         varchar(200) comment '设备型号',
   CLIENT_OS            varchar(200) comment '客户端操作系统',
   CLIENT_OS_VERSION    varchar(200) comment '客户端操作系统版本',
   CLIENT_NETWORK_TYPE  varchar(200) comment '客户端网络类型',
   CLIENT_NETWORK_EXTRA_INFO varchar(200) comment '客户端网络扩展信息',
   CLIENT_SCREEN_WIDTH  varchar(200) comment '客户端屏幕宽度',
   CLIENT_SCREEN_HEIGHT varchar(200) comment '客户端屏幕高度',
   CLIENT_SCREEN_DENSITY varchar(200) comment '客户端屏幕密度',
   STATE                char(1) not null comment '0 无效 1有效，表示最后激活的相同设备',
   PUB1                 varchar(200) comment '备用信息',
   PUB2                 varchar(200) comment '备用信息',
   PUB3                 varchar(200) comment '备用信息',
   PUB4                 varchar(200) comment '备用信息',
   PUB5                 varchar(200) comment '备用信息',
   ROW_VERSION          numeric(8,0) not null comment '版本',
   primary key (ID)
);

alter table T_CLIENT_ACTIVATION comment '客户端激活表';

/*==============================================================*/
/* Table: T_CODE_BUILD                                          */
/*==============================================================*/
create table T_CODE_BUILD
(
   BUILD_ID             int not null auto_increment comment '构建标识',
   BUILD_NAME           varchar(100) not null comment '构建名称',
   BUILD_DESC           varchar(500) comment '构建说明',
   PARENT_BUILD_ID      int not null comment '父构建标识',
   FUNC_PROJECTS        varchar(1000) comment '相关项目标识，多个用逗号分隔',
   PUB0                 varchar(200) comment '备用字段1',
   PUB1                 varchar(200) comment '备用字段2',
   PUB2                 varchar(200) comment '备用字段3',
   PUB3                 varchar(200) comment '备用字段4',
   PUB4                 varchar(200) comment '备用字段5',
   PUB5                 varchar(200) comment '备用字段6',
   primary key (BUILD_ID)
);

alter table T_CODE_BUILD comment '构建任务';

/*==============================================================*/
/* Table: T_CODE_BUILD_LOG                                      */
/*==============================================================*/
create table T_CODE_BUILD_LOG
(
   BUILD_LOG_ID         int not null auto_increment comment '构建标识',
   BUILD_ID             int not null comment '构建标识',
   BUILD_STATE          int not null comment '0构建准备 1构建中 2构建完成',
   BUILD_RESULT         int not null comment '构建结果0，构建结果未知 1 构建成功 2构建失败',
   BUILD_MESSAGE        varchar(1000) comment '构建结果提示',
   BUILD_START_TIME     datetime comment '构建开始时间',
   BUILD_END_TIME       datetime comment '构建结束时间',
   BUILD_OPERATOR       varchar(100) comment '构建人',
   PUB0                 varchar(200) comment '备用字段1',
   PUB1                 varchar(200) comment '备用字段2',
   PUB2                 varchar(200) comment '备用字段3',
   PUB3                 varchar(200) comment '备用字段4',
   PUB4                 varchar(200) comment '备用字段5',
   PUB5                 varchar(200) comment '备用字段6',
   primary key (BUILD_LOG_ID)
);

alter table T_CODE_BUILD_LOG comment '构建记录';

/*==============================================================*/
/* Table: T_CODE_BUILD_PROCEDURE                                */
/*==============================================================*/
create table T_CODE_BUILD_PROCEDURE
(
   BUILD_PROCEDURE_ID   int not null auto_increment comment '构建过程标识',
   BUILD_ID             int not null comment '构建标识',
   FUNC_PROCEDURE_ID    int not null comment '函数过程标识',
   primary key (BUILD_PROCEDURE_ID)
);

alter table T_CODE_BUILD_PROCEDURE comment '构建相关的过程';

/*==============================================================*/
/* Table: T_CODE_BUILD_PROPERTY                                 */
/*==============================================================*/
create table T_CODE_BUILD_PROPERTY
(
   BUILD_PROPERTY_ID    int not null auto_increment comment '属性标识',
   BUILD_ID             int not null comment '构建标识',
   BUILD_PROPERTY_NAME  varchar(100) not null comment '属性名称',
   BUILD_PROPERTY_VALUE varchar(1000) comment '属性值',
   BUILD_PROPERTY_DESC  varchar(1000) comment '属性描述',
   primary key (BUILD_PROPERTY_ID)
);

alter table T_CODE_BUILD_PROPERTY comment '构建属性';

/*==============================================================*/
/* Table: T_DEPART_MENT                                         */
/*==============================================================*/
create table T_DEPART_MENT
(
   DEPART_MENT_ID       int not null auto_increment comment '部门ID',
   DEPART_MENT_NAME     varchar(100) not null comment '部门名称',
   DEPART_MENT_PARENT_ID int comment '父部门ID',
   primary key (DEPART_MENT_ID)
);

alter table T_DEPART_MENT comment '部门表';

/*==============================================================*/
/* Table: T_DEPART_MENT_USER                                    */
/*==============================================================*/
create table T_DEPART_MENT_USER
(
   DEPART_MENT_ID       int not null comment '部门ID',
   USER_ID              int not null comment '用户代号',
   primary key (DEPART_MENT_ID, USER_ID)
);

/*==============================================================*/
/* Table: T_FUNC_PARAMS                                         */
/*==============================================================*/
create table T_FUNC_PARAMS
(
   PARAM_ID             int not null auto_increment comment '参数标识',
   FUNC_PROCEDURE_ID    int not null comment '函数过程标识',
   PARAM_CODE           varchar(100) not null comment '参数代码',
   PARAM_NAME           varchar(200) comment '参数名称',
   PARAM_DIRECTION      int not null default 0 comment '参数方向,0输入参数1输出参数',
   PARAM_CATEGORY       int not null default 1 comment '参数类型，0普通参数1集合参数',
   PARAM_COMMENT        varchar(2000) comment '参数说明',
   PARENT_PARAM_ID      int not null default 0 comment '父参数标识,0表示没有父参数',
   PARAM_DATA_TYPE      varchar(200) not null comment '数据类型',
   PARAM_DATA_LENGTH    int not null default 0 comment '数据类型长度',
   PARAM_DATA_DECIMAL   int not null default 0 comment '数据类型小数长度',
   PARAM_DATA_NOT_NULL  int not null default 0 comment '数据非空 0允许空 1不允许空',
   PARAM_DATA_DEFAULT_VALUE varchar(200) comment '参数默认值',
   PARAM_ALLOW_MODIFY   int not null default 1 comment '参数允许修改 0 不允许修改 1允许修改',
   IMPL_INTERFACE       varchar(100) comment '对象实现的接口，只针对需要生成的对象',
   ORDER_FIELD          int not null default 0 comment '排序字段',
   PUB0                 varchar(200) comment '备用字段1',
   PUB1                 varchar(200) comment '备用字段2',
   PUB2                 varchar(200) comment '备用字段3',
   PUB3                 varchar(200) comment '备用字段4',
   PUB4                 varchar(200) comment '备用字段5',
   PUB5                 varchar(200) comment '备用字段6',
   DELETED              char(1) comment '是否删除',
   primary key (PARAM_ID)
);

alter table T_FUNC_PARAMS comment '函数参数';

/*==============================================================*/
/* Table: T_FUNC_PROCEDURE                                      */
/*==============================================================*/
create table T_FUNC_PROCEDURE
(
   FUNC_PROCEDURE_ID    int not null auto_increment comment '函数过程标识',
   FUNC_PROJECT_ID      int not null comment '函数项目标识',
   PROC_CODE            varchar(100) not null comment '函数代码',
   PROC_NAME            varchar(200) comment '函数名称',
   FUNC_CATEGORY        varchar(200) comment '函数分类',
   PROC_COMMENT         varchar(2000) comment '函数描述',
   PROC_VERSION         varchar(50) comment '函数版本',
   FUNC_CODE            varchar(50) comment '函数代码',
   PROC_TYPE            int not null default 1 comment '过程类型，0通用参数过程1普通过程',
   CACHE_TIME           int default 0 comment '缓存时间',
   FUNC_INPUT_INTERFACE varchar(100) comment '输入参数实现的接口',
   FUNC_OUTPUT_INTERFACE varchar(100) comment '输出参数实现的接口',
   ORDER_FIELD          int not null default 0 comment '排序字段',
   PUB0                 varchar(200) comment '备用字段1',
   PUB1                 varchar(200) comment '备用字段2',
   PUB2                 varchar(200) comment '备用字段3',
   PUB3                 varchar(200) comment '备用字段4',
   PUB4                 varchar(200) comment '备用字段5',
   PUB5                 varchar(200) comment '备用字段6',
   DELETED              char(1) comment '是否删除',
   primary key (FUNC_PROCEDURE_ID)
);

alter table T_FUNC_PROCEDURE comment '函数过程';

/*==============================================================*/
/* Table: T_FUNC_PROJECT                                        */
/*==============================================================*/
create table T_FUNC_PROJECT
(
   FUNC_PROJECT_ID      int not null auto_increment comment '函数项目标识',
   FUNC_PROJECT_NAME    varchar(100) not null comment '函数项目名称',
   FUNC_PROJECT_DESC    varchar(300) comment '函数面目描述',
   PUB0                 varchar(200) comment '备用字段1',
   PUB1                 varchar(200) comment '备用字段2',
   PUB2                 varchar(200) comment '备用字段3',
   PUB3                 varchar(200) comment '备用字段4',
   PUB4                 varchar(200) comment '备用字段5',
   PUB5                 varchar(200) comment '备用字段6',
   primary key (FUNC_PROJECT_ID)
);

alter table T_FUNC_PROJECT comment '函数项目';

/*==============================================================*/
/* Table: T_FUNC_TEST                                           */
/*==============================================================*/
create table T_FUNC_TEST
(
   BUILD_ID             int not null comment '构建标识',
   PARAM_ID             int not null comment '参数标识',
   TEST_VALUE           varchar(1000) comment '测试值',
   TEST_VALUE_DESC      varchar(1000) comment '测试值的说明',
   PUB0                 varchar(200) comment '备用字段1',
   PUB1                 varchar(200) comment '备用字段2',
   PUB2                 varchar(200) comment '备用字段3',
   PUB3                 varchar(200) comment '备用字段4',
   PUB4                 varchar(200) comment '备用字段5',
   PUB5                 varchar(200) comment '备用字段6',
   primary key (BUILD_ID, PARAM_ID)
);

alter table T_FUNC_TEST comment '函数测试';

/*==============================================================*/
/* Table: T_IDENTITY                                            */
/*==============================================================*/
create table T_IDENTITY
(
   TAB_NAME             varchar(50) not null,
   LAST_MODIFY          timestamp not null default CURRENT_TIMESTAMP,
   CURRENT_IDENTITY     int not null default 1,
   primary key (TAB_NAME)
);

alter table T_IDENTITY comment '标识表';

/*==============================================================*/
/* Table: T_ORMAPPING_PROJECT                                   */
/*==============================================================*/
create table T_ORMAPPING_PROJECT
(
   PROJ_ID              int not null comment '工程号',
   PROJ_PARAM_FILE_PATH varchar(300) comment '参数文件路径',
   PROJ_DB_CONFIG_PATH  varchar(300) comment '数据架构文件路径',
   DB_HOST              varchar(100) comment '数据库主机',
   DB_NAME              varchar(100) comment '数据库名称',
   DB_USER              varchar(100) comment '数据库用户',
   DB_PASS              varchar(100) comment '数据库用户密码',
   primary key (PROJ_ID)
);

alter table T_ORMAPPING_PROJECT comment '实体对象映射项目';

/*==============================================================*/
/* Table: T_PROJECT                                             */
/*==============================================================*/
create table T_PROJECT
(
   PROJ_ID              int not null auto_increment comment '工程号',
   PROJECT_ACTUAL_END_DATE datetime not null comment '工程实际结束时间',
   PROJECT_ACTUAL_START_DATE datetime not null comment '工程实际开始时间',
   PROJECT_DESC         varchar(500) comment '工程描述',
   PROJECT_NAME         varchar(100) not null comment '工程名称',
   PROJECT_PLAN_END_DATE datetime comment '工程计划结束时间',
   PROJECT_PLAN_START_DATE datetime comment '工程计划开始时间',
   PROJECT_SHORT_NAME   varchar(30) not null comment '工程简称',
   PROJECT_STATE        int not null comment '工程状态',
   PROJECT_MANAGER_ID   int comment '工程管理员号',
   primary key (PROJ_ID)
);

alter table T_PROJECT comment '工程表';

/*==============================================================*/
/* Table: T_PROJECT_JOIN_USER                                   */
/*==============================================================*/
create table T_PROJECT_JOIN_USER
(
   PROJECT_ID           int not null comment '工程代号',
   USER_ID              int not null comment '用户代号',
   primary key (PROJECT_ID, USER_ID)
);

alter table T_PROJECT_JOIN_USER comment '工程——用户表';

/*==============================================================*/
/* Table: T_ROLE                                                */
/*==============================================================*/
create table T_ROLE
(
   ROLE_ID              int not null auto_increment comment '角色代号',
   ROLE_DESC            varchar(100) not null comment '角色描述',
   ROLE_NAME            varchar(30) not null comment '角色名称',
   ROLE_PRIVILEGES      varchar(1000) comment '角色权利',
   ROLE_STATE           int not null comment '角色状态',
   primary key (ROLE_ID)
);

alter table T_ROLE comment '角色表';

/*==============================================================*/
/* Index: Index_1                                               */
/*==============================================================*/
create unique index Index_1 on T_ROLE
(
   ROLE_NAME
);

/*==============================================================*/
/* Table: T_SYSTEM_PARAM                                        */
/*==============================================================*/
create table T_SYSTEM_PARAM
(
   SYSTEM_PARAM_CATEGORY varchar(100) not null comment '参数分类',
   SYSTEM_PARAM_CODE    varchar(100) not null comment '参数代码',
   SYSTEM_PARAM_NAME    varchar(100) not null comment '参数名称',
   SYSTEM_PARAM_DESC    varchar(1000) comment '参数说明',
   SYSTEM_PARAM_VALUE   varchar(2000) comment '参数值',
   LAST_MODIFY_TIME     datetime comment '最后修改时间',
   LAST_MODIFY_OPER     char(24) comment '最后修改人',
   ROW_VERSION          numeric(8,0) not null comment '版本',
   CREATE_TIME          datetime not null comment '创建时间',
   CREATE_ID            char(24) comment '创建人ID',
   CREATE_NAME          varchar(100) comment '创建人登录名称',
   MODIFY_TIME          datetime not null comment '修改时间',
   MODIFY_ID            char(24) comment '修改人ID',
   MODIFY_NAME          varchar(100) comment '修改人登录名称',
   AUDIT_TIME           datetime comment '审核时间',
   AUDIT_ID             char(24) comment '审核人ID',
   AUDIT_NAME           varchar(100) comment '审核人名称',
   AUDIT_STATE          char(1) comment '审核状态0未审核 1审核通过2审核不通过',
   primary key (SYSTEM_PARAM_CATEGORY, SYSTEM_PARAM_CODE)
);

alter table T_SYSTEM_PARAM comment '系统参数表';

/*==============================================================*/
/* Table: T_TEST_PARAM_VALUE                                    */
/*==============================================================*/
create table T_TEST_PARAM_VALUE
(
   TEST_PROCEDURE_ID    int not null comment '测试过程标识',
   PARAM_ID             int not null comment '参数标识',
   TEST_VALUE           varchar(1000) comment '测试值',
   TEST_VALUE_DESC      varchar(1000) comment '测试值的说明',
   PUB0                 varchar(200) comment '备用字段1',
   PUB1                 varchar(200) comment '备用字段2',
   PUB2                 varchar(200) comment '备用字段3',
   PUB3                 varchar(200) comment '备用字段4',
   PUB4                 varchar(200) comment '备用字段5',
   PUB5                 varchar(200) comment '备用字段6',
   primary key (TEST_PROCEDURE_ID, PARAM_ID)
);

alter table T_TEST_PARAM_VALUE comment '函数测试参数表';

/*==============================================================*/
/* Table: T_TEST_PROCEDURE                                      */
/*==============================================================*/
create table T_TEST_PROCEDURE
(
   TEST_PROCEDURE_ID    int not null auto_increment comment '测试过程标识',
   BUILD_ID             int not null comment '构建标识',
   FUNC_PROCEDURE_ID    int not null comment '函数过程标识',
   TEST_ORDER           int not null comment '测试顺序',
   PUB0                 varchar(200) comment '备用字段1',
   PUB1                 varchar(200) comment '备用字段2',
   PUB2                 varchar(200) comment '备用字段3',
   PUB3                 varchar(200) comment '备用字段4',
   PUB4                 varchar(200) comment '备用字段5',
   PUB5                 varchar(200) comment '备用字段6',
   primary key (TEST_PROCEDURE_ID)
);

alter table T_TEST_PROCEDURE comment '测试过程';

/*==============================================================*/
/* Table: T_USER                                                */
/*==============================================================*/
create table T_USER
(
   USER_ID              int not null auto_increment comment '用户代号',
   LAST_LOGIN_ADDRESS   varchar(50) comment '上次登陆地址',
   LAST_LOGIN_TIME      datetime comment '上次登陆时间',
   LOGIN_COUNT          int not null comment '登陆次数',
   LOGIN_NAME           varchar(32) not null comment '登陆名',
   LOGIN_PASS           varchar(32) not null comment '登陆密码',
   REAL_NAME            varchar(32) not null comment '真实姓名',
   USER_EMAIL           varchar(300) comment '用户电子邮箱',
   USER_MEMO            varchar(1000) comment '用户信息',
   USER_MOBILE          varchar(30) comment '用户手机号码',
   USER_MSN             varchar(300) comment '用户MSN',
   USER_PRIVILEGES      varchar(1000) comment '用户权利',
   USER_QQ              varchar(30) comment '用户QQ',
   USER_ROLES           varchar(1000) comment '用户角色',
   USER_STATE           int not null comment '用户状态',
   USER_TELEPHONE       varchar(30) comment '用户电话号码',
   primary key (USER_ID)
);

alter table T_USER comment '用户表';

/*==============================================================*/
/* Index: Index_1                                               */
/*==============================================================*/
create unique index Index_1 on T_USER
(
   LOGIN_NAME
);

/*==============================================================*/
/* Table: T_USER_CHECK_IN                                       */
/*==============================================================*/
create table T_USER_CHECK_IN
(
   ID                   char(24) not null,
   USER_ID              numeric(8,0) not null comment '签到用户',
   CHECK_TIME           datetime not null comment '签到时间',
   DEVICE_ID            varchar(100) comment '设备标识',
   CHECK_DEVICE_ID      char(24) comment '签到设备',
   primary key (ID)
);

alter table T_USER_CHECK_IN comment '用户签到表';

/*==============================================================*/
/* Table: T_WORK_LOG                                            */
/*==============================================================*/
create table T_WORK_LOG
(
   WORK_LOG_ID          int not null auto_increment comment '工作日志代号',
   CREATE_TIME          datetime not null comment '创建时间',
   MODIFY_TIME          datetime comment '修改时间',
   WORK_CONTENT         text comment '工作内容',
   WORK_DAY             datetime not null comment '工作日',
   WORK_USER_ID         int not null comment '职工号',
   WORK_EVALUATION_SCORE int comment '工作评价分数',
   WORK_EVALUATION_CONTENT varchar(500) comment '工作评价内容',
   primary key (WORK_LOG_ID)
);

alter table T_WORK_LOG comment '工作日志表';

/*==============================================================*/
/* Table: T_WORK_LOG_RELATIONSHIP_TASK                          */
/*==============================================================*/
create table T_WORK_LOG_RELATIONSHIP_TASK
(
   WORK_LOG_ID          int not null comment '工作日志代号',
   TASK_ID              int not null comment '任务代号',
   primary key (WORK_LOG_ID, TASK_ID)
);

alter table T_WORK_LOG_RELATIONSHIP_TASK comment '工作日志——关系——任务表';

alter table T_CODE_BUILD_LOG add constraint FK_T_CODE_251 foreign key (BUILD_ID)
      references T_CODE_BUILD (BUILD_ID) on delete restrict on update restrict;

alter table T_CODE_BUILD_PROCEDURE add constraint FK_T_CODE_249 foreign key (BUILD_ID)
      references T_CODE_BUILD (BUILD_ID) on delete restrict on update restrict;

alter table T_CODE_BUILD_PROCEDURE add constraint FK_T_CODE_250 foreign key (FUNC_PROCEDURE_ID)
      references T_FUNC_PROCEDURE (FUNC_PROCEDURE_ID) on delete restrict on update restrict;

alter table T_CODE_BUILD_PROPERTY add constraint FK_T_CODE248 foreign key (BUILD_ID)
      references T_CODE_BUILD (BUILD_ID) on delete restrict on update restrict;

alter table T_DEPART_MENT_USER add constraint FK_Reference_41 foreign key (DEPART_MENT_ID)
      references T_DEPART_MENT (DEPART_MENT_ID) on delete restrict on update restrict;

alter table T_DEPART_MENT_USER add constraint FK_Reference_42 foreign key (USER_ID)
      references T_USER (USER_ID) on delete restrict on update restrict;

alter table T_FUNC_PARAMS add constraint FK_T_FUN246 foreign key (FUNC_PROCEDURE_ID)
      references T_FUNC_PROCEDURE (FUNC_PROCEDURE_ID) on delete restrict on update restrict;

alter table T_FUNC_PROCEDURE add constraint FK_T_FUNC_P_245 foreign key (FUNC_PROJECT_ID)
      references T_FUNC_PROJECT (FUNC_PROJECT_ID) on delete restrict on update restrict;

alter table T_FUNC_TEST add constraint FK_Reference_57 foreign key (BUILD_ID)
      references T_CODE_BUILD (BUILD_ID) on delete restrict on update restrict;

alter table T_FUNC_TEST add constraint FK_Reference_59 foreign key (PARAM_ID)
      references T_FUNC_PARAMS (PARAM_ID) on delete restrict on update restrict;

alter table T_ORMAPPING_PROJECT add constraint FK_Reference_46 foreign key (PROJ_ID)
      references T_PROJECT (PROJ_ID) on delete restrict on update restrict;

alter table T_PROJECT add constraint FK4B5FEA0E26F5056E foreign key (PROJECT_MANAGER_ID)
      references T_USER (USER_ID);

alter table T_PROJECT_JOIN_USER add constraint FK422E9CCF845CFBAA foreign key (USER_ID)
      references T_USER (USER_ID);

alter table T_PROJECT_JOIN_USER add constraint FK422E9CCFEAD905EC foreign key (PROJECT_ID)
      references T_PROJECT (PROJ_ID);

alter table T_TEST_PARAM_VALUE add constraint FK_Reference_62 foreign key (TEST_PROCEDURE_ID)
      references T_TEST_PROCEDURE (TEST_PROCEDURE_ID) on delete restrict on update restrict;

alter table T_TEST_PARAM_VALUE add constraint FK_T_TEST_FUNC_P foreign key (PARAM_ID)
      references T_FUNC_PARAMS (PARAM_ID) on delete restrict on update restrict;

alter table T_TEST_PROCEDURE add constraint FK_Reference_60 foreign key (BUILD_ID)
      references T_CODE_BUILD (BUILD_ID) on delete restrict on update restrict;

alter table T_TEST_PROCEDURE add constraint FK_Reference_61 foreign key (FUNC_PROCEDURE_ID)
      references T_FUNC_PROCEDURE (FUNC_PROCEDURE_ID) on delete restrict on update restrict;

alter table T_WORK_LOG add constraint FK5E4B7481F4F8C87C foreign key (WORK_USER_ID)
      references T_USER (USER_ID);

alter table T_WORK_LOG_RELATIONSHIP_TASK add constraint FKB6AD4AEEC161FE29 foreign key (WORK_LOG_ID)
      references T_WORK_LOG (WORK_LOG_ID);




