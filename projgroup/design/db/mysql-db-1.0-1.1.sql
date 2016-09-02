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

delete from T_SYSTEM_PARAM where SYSTEM_PARAM_CATEGORY = 'cn.topdeep.projgroup.entity.params.DbParam' and SYSTEM_PARAM_CODE = 'dbVersion';

INSERT
INTO T_SYSTEM_PARAM (  SYSTEM_PARAM_CATEGORY,    SYSTEM_PARAM_CODE,    SYSTEM_PARAM_NAME,    SYSTEM_PARAM_DESC,
    SYSTEM_PARAM_VALUE,  ROW_VERSION, CREATE_TIME,    MODIFY_TIME)
  VALUES
  (
    'cn.topdeep.projgroup.entity.params.DbParam',
    'dbVersion',
    '当前数据库版本',
    '当前数据库版本',
    '1.1',
    0,
    now(),
    now()
  );

