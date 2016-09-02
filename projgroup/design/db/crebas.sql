/*==============================================================*/
/* DBMS name:      Microsoft SQL Server 2005                    */
/* Created on:     2009-2-12 15:52:50                           */
/*==============================================================*/


if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('dbo.T_PROJECT') and o.name = 'FK4B5FEA0E26F5056E')
alter table dbo.T_PROJECT
   drop constraint FK4B5FEA0E26F5056E
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('dbo.T_PROJECT_JOIN_USER') and o.name = 'FK422E9CCF845CFBAA')
alter table dbo.T_PROJECT_JOIN_USER
   drop constraint FK422E9CCF845CFBAA
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('dbo.T_PROJECT_JOIN_USER') and o.name = 'FK422E9CCFEAD905EC')
alter table dbo.T_PROJECT_JOIN_USER
   drop constraint FK422E9CCFEAD905EC
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('dbo.T_TASK') and o.name = 'FK94B8FA9075AB6D64')
alter table dbo.T_TASK
   drop constraint FK94B8FA9075AB6D64
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('dbo.T_TASK') and o.name = 'FK94B8FA90B4A9F82')
alter table dbo.T_TASK
   drop constraint FK94B8FA90B4A9F82
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('dbo.T_TASK') and o.name = 'FK94B8FA90C83BFF99')
alter table dbo.T_TASK
   drop constraint FK94B8FA90C83BFF99
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('dbo.T_TASK') and o.name = 'FK94B8FA90D448F0E6')
alter table dbo.T_TASK
   drop constraint FK94B8FA90D448F0E6
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('dbo.T_TASK') and o.name = 'FK94B8FA90E80C5E89')
alter table dbo.T_TASK
   drop constraint FK94B8FA90E80C5E89
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('dbo.T_TASK') and o.name = 'FK94B8FA90F0C60D3C')
alter table dbo.T_TASK
   drop constraint FK94B8FA90F0C60D3C
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('dbo.T_TASK_PREVIOUS_TASK') and o.name = 'FK40D48E5E13B7208')
alter table dbo.T_TASK_PREVIOUS_TASK
   drop constraint FK40D48E5E13B7208
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('dbo.T_TASK_PREVIOUS_TASK') and o.name = 'FK40D48E5E458BECC0')
alter table dbo.T_TASK_PREVIOUS_TASK
   drop constraint FK40D48E5E458BECC0
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('dbo.T_WORK_LOG') and o.name = 'FK5E4B7481F4F8C87C')
alter table dbo.T_WORK_LOG
   drop constraint FK5E4B7481F4F8C87C
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('dbo.T_WORK_LOG_RELATIONSHIP_TASK') and o.name = 'FKB6AD4AEE13B7208')
alter table dbo.T_WORK_LOG_RELATIONSHIP_TASK
   drop constraint FKB6AD4AEE13B7208
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('dbo.T_WORK_LOG_RELATIONSHIP_TASK') and o.name = 'FKB6AD4AEEC161FE29')
alter table dbo.T_WORK_LOG_RELATIONSHIP_TASK
   drop constraint FKB6AD4AEEC161FE29
go

if exists (select 1
            from  sysobjects
           where  id = object_id('dbo.T_PROJECT')
            and   type = 'U')
   drop table dbo.T_PROJECT
go

if exists (select 1
            from  sysobjects
           where  id = object_id('dbo.T_PROJECT_JOIN_USER')
            and   type = 'U')
   drop table dbo.T_PROJECT_JOIN_USER
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('dbo.T_ROLE')
            and   name  = 'Index_1'
            and   indid > 0
            and   indid < 255)
   drop index dbo.T_ROLE.Index_1
go

if exists (select 1
            from  sysobjects
           where  id = object_id('dbo.T_ROLE')
            and   type = 'U')
   drop table dbo.T_ROLE
go

if exists (select 1
            from  sysobjects
           where  id = object_id('dbo.T_TASK')
            and   type = 'U')
   drop table dbo.T_TASK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('dbo.T_TASK_PREVIOUS_TASK')
            and   type = 'U')
   drop table dbo.T_TASK_PREVIOUS_TASK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('dbo.T_USER')
            and   type = 'U')
   drop table dbo.T_USER
go

if exists (select 1
            from  sysobjects
           where  id = object_id('dbo.T_WORK_LOG')
            and   type = 'U')
   drop table dbo.T_WORK_LOG
go

if exists (select 1
            from  sysobjects
           where  id = object_id('dbo.T_WORK_LOG_RELATIONSHIP_TASK')
            and   type = 'U')
   drop table dbo.T_WORK_LOG_RELATIONSHIP_TASK
go

/*==============================================================*/
/* Table: T_PROJECT                                             */
/*==============================================================*/
create table dbo.T_PROJECT (
   PROJ_ID              int                  identity(1,1),
   PROJECT_ACTUAL_END_DATE datetime             not null,
   PROJECT_ACTUAL_START_DATE datetime             not null,
   PROJECT_DESC         varchar(500)         null,
   PROJECT_NAME         varchar(100)         not null,
   PROJECT_PLAN_END_DATE datetime             null,
   PROJECT_PLAN_START_DATE datetime             null,
   PROJECT_SHORT_NAME   varchar(30)          not null,
   PROJECT_STATE        int                  not null,
   PROJECT_MANAGER_ID   int                  null,
   constraint PK_T_PROJECT primary key (PROJ_ID)
)
go

execute sp_addextendedproperty 'MS_Description', 
   '工程表',
   'user', 'dbo', 'table', 'T_PROJECT'
go

execute sp_addextendedproperty 'MS_Description', 
   '工程号',
   'user', 'dbo', 'table', 'T_PROJECT', 'column', 'PROJ_ID'
go

execute sp_addextendedproperty 'MS_Description', 
   '工程实际结束时间',
   'user', 'dbo', 'table', 'T_PROJECT', 'column', 'PROJECT_ACTUAL_END_DATE'
go

execute sp_addextendedproperty 'MS_Description', 
   '工程实际开始时间',
   'user', 'dbo', 'table', 'T_PROJECT', 'column', 'PROJECT_ACTUAL_START_DATE'
go

execute sp_addextendedproperty 'MS_Description', 
   '工程描述',
   'user', 'dbo', 'table', 'T_PROJECT', 'column', 'PROJECT_DESC'
go

execute sp_addextendedproperty 'MS_Description', 
   '工程名称',
   'user', 'dbo', 'table', 'T_PROJECT', 'column', 'PROJECT_NAME'
go

execute sp_addextendedproperty 'MS_Description', 
   '工程计划结束时间',
   'user', 'dbo', 'table', 'T_PROJECT', 'column', 'PROJECT_PLAN_END_DATE'
go

execute sp_addextendedproperty 'MS_Description', 
   '工程计划开始时间',
   'user', 'dbo', 'table', 'T_PROJECT', 'column', 'PROJECT_PLAN_START_DATE'
go

execute sp_addextendedproperty 'MS_Description', 
   '工程简称',
   'user', 'dbo', 'table', 'T_PROJECT', 'column', 'PROJECT_SHORT_NAME'
go

execute sp_addextendedproperty 'MS_Description', 
   '工程状态',
   'user', 'dbo', 'table', 'T_PROJECT', 'column', 'PROJECT_STATE'
go

execute sp_addextendedproperty 'MS_Description', 
   '工程管理员号',
   'user', 'dbo', 'table', 'T_PROJECT', 'column', 'PROJECT_MANAGER_ID'
go

/*==============================================================*/
/* Table: T_PROJECT_JOIN_USER                                   */
/*==============================================================*/
create table dbo.T_PROJECT_JOIN_USER (
   PROJECT_ID           int                  not null,
   USER_ID              int                  not null,
   constraint PK_T_PROJECT_JOIN_USER primary key (PROJECT_ID, USER_ID)
)
go

execute sp_addextendedproperty 'MS_Description', 
   '工程——用户表',
   'user', 'dbo', 'table', 'T_PROJECT_JOIN_USER'
go

execute sp_addextendedproperty 'MS_Description', 
   '工程代号',
   'user', 'dbo', 'table', 'T_PROJECT_JOIN_USER', 'column', 'PROJECT_ID'
go

execute sp_addextendedproperty 'MS_Description', 
   '用户代号',
   'user', 'dbo', 'table', 'T_PROJECT_JOIN_USER', 'column', 'USER_ID'
go

/*==============================================================*/
/* Table: T_ROLE                                                */
/*==============================================================*/
create table dbo.T_ROLE (
   ROLE_ID              int                  identity(1,1),
   ROLE_DESC            varchar(100)         not null,
   ROLE_NAME            varchar(30)          not null,
   ROLE_PRIVILEGES      varchar(1000)        null,
   ROLE_STATE           int                  not null,
   constraint PK_T_ROLE primary key (ROLE_ID)
)
go

execute sp_addextendedproperty 'MS_Description', 
   '角色表',
   'user', 'dbo', 'table', 'T_ROLE'
go

execute sp_addextendedproperty 'MS_Description', 
   '角色代号',
   'user', 'dbo', 'table', 'T_ROLE', 'column', 'ROLE_ID'
go

execute sp_addextendedproperty 'MS_Description', 
   '角色描述',
   'user', 'dbo', 'table', 'T_ROLE', 'column', 'ROLE_DESC'
go

execute sp_addextendedproperty 'MS_Description', 
   '角色名称',
   'user', 'dbo', 'table', 'T_ROLE', 'column', 'ROLE_NAME'
go

execute sp_addextendedproperty 'MS_Description', 
   '角色权利',
   'user', 'dbo', 'table', 'T_ROLE', 'column', 'ROLE_PRIVILEGES'
go

execute sp_addextendedproperty 'MS_Description', 
   '角色状态',
   'user', 'dbo', 'table', 'T_ROLE', 'column', 'ROLE_STATE'
go

/*==============================================================*/
/* Index: Index_1                                               */
/*==============================================================*/
create unique index Index_1 on dbo.T_ROLE (
ROLE_NAME ASC
)
go

/*==============================================================*/
/* Table: T_TASK                                                */
/*==============================================================*/
create table dbo.T_TASK (
   TASK_ID              int                  identity(1,1),
   ACTUAL_WORK_TIME     float                null,
   AUDIT_WORK_TIME      float                null,
   CREATE_TIME          datetime             not null,
   ESTIMATE_WORK_TIME   float                null,
   MODIFY_TIME          datetime             not null,
   ORDER_FIELD          datetime             null,
   TASK_ACTUAL_END_DATE datetime             null,
   TASK_ACTUAL_START_DATE datetime             null,
   TASK_DESC            varchar(1000)        null,
   TASK_LEVEL           int                  not null,
   TASK_NAME            varchar(100)         not null,
   TASK_PLAN_END_DATE   datetime             null,
   TASK_PLAN_START_DATE datetime             null,
   TASK_STATE           int                  not null,
   TASK_PARENT_ID       int                  null,
   TASK_PROJECT_ID      int                  not null,
   TASK_CREATER_ID      int                  not null,
   TASK_MANAGER_ID      int                  not null,
   TASK_MODIFIER_ID     int                  not null,
   TASK_OWNER_ID        int                  not null,
   constraint PK_T_TASK primary key (TASK_ID)
)
go

execute sp_addextendedproperty 'MS_Description', 
   '任务表',
   'user', 'dbo', 'table', 'T_TASK'
go

execute sp_addextendedproperty 'MS_Description', 
   '任务代号',
   'user', 'dbo', 'table', 'T_TASK', 'column', 'TASK_ID'
go

execute sp_addextendedproperty 'MS_Description', 
   '实际工作时间',
   'user', 'dbo', 'table', 'T_TASK', 'column', 'ACTUAL_WORK_TIME'
go

execute sp_addextendedproperty 'MS_Description', 
   '审计工作时间',
   'user', 'dbo', 'table', 'T_TASK', 'column', 'AUDIT_WORK_TIME'
go

execute sp_addextendedproperty 'MS_Description', 
   '创建时间',
   'user', 'dbo', 'table', 'T_TASK', 'column', 'CREATE_TIME'
go

execute sp_addextendedproperty 'MS_Description', 
   '工作估计完成时间',
   'user', 'dbo', 'table', 'T_TASK', 'column', 'ESTIMATE_WORK_TIME'
go

execute sp_addextendedproperty 'MS_Description', 
   '修改时间',
   'user', 'dbo', 'table', 'T_TASK', 'column', 'MODIFY_TIME'
go

execute sp_addextendedproperty 'MS_Description', 
   '口令域',
   'user', 'dbo', 'table', 'T_TASK', 'column', 'ORDER_FIELD'
go

execute sp_addextendedproperty 'MS_Description', 
   '任务实际结束日期',
   'user', 'dbo', 'table', 'T_TASK', 'column', 'TASK_ACTUAL_END_DATE'
go

execute sp_addextendedproperty 'MS_Description', 
   '任务实际开始日期',
   'user', 'dbo', 'table', 'T_TASK', 'column', 'TASK_ACTUAL_START_DATE'
go

execute sp_addextendedproperty 'MS_Description', 
   '任务描述',
   'user', 'dbo', 'table', 'T_TASK', 'column', 'TASK_DESC'
go

execute sp_addextendedproperty 'MS_Description', 
   '任务级别',
   'user', 'dbo', 'table', 'T_TASK', 'column', 'TASK_LEVEL'
go

execute sp_addextendedproperty 'MS_Description', 
   '任务名称',
   'user', 'dbo', 'table', 'T_TASK', 'column', 'TASK_NAME'
go

execute sp_addextendedproperty 'MS_Description', 
   '任务计划结束日期',
   'user', 'dbo', 'table', 'T_TASK', 'column', 'TASK_PLAN_END_DATE'
go

execute sp_addextendedproperty 'MS_Description', 
   '任务计划开始日期',
   'user', 'dbo', 'table', 'T_TASK', 'column', 'TASK_PLAN_START_DATE'
go

execute sp_addextendedproperty 'MS_Description', 
   '任务状态',
   'user', 'dbo', 'table', 'T_TASK', 'column', 'TASK_STATE'
go

execute sp_addextendedproperty 'MS_Description', 
   '父任务代号',
   'user', 'dbo', 'table', 'T_TASK', 'column', 'TASK_PARENT_ID'
go

execute sp_addextendedproperty 'MS_Description', 
   '任务工程代号',
   'user', 'dbo', 'table', 'T_TASK', 'column', 'TASK_PROJECT_ID'
go

execute sp_addextendedproperty 'MS_Description', 
   '任务创建者代号',
   'user', 'dbo', 'table', 'T_TASK', 'column', 'TASK_CREATER_ID'
go

execute sp_addextendedproperty 'MS_Description', 
   '任务管理员代号',
   'user', 'dbo', 'table', 'T_TASK', 'column', 'TASK_MANAGER_ID'
go

execute sp_addextendedproperty 'MS_Description', 
   '任务修改者代号',
   'user', 'dbo', 'table', 'T_TASK', 'column', 'TASK_MODIFIER_ID'
go

execute sp_addextendedproperty 'MS_Description', 
   '任务持有人代号',
   'user', 'dbo', 'table', 'T_TASK', 'column', 'TASK_OWNER_ID'
go

/*==============================================================*/
/* Table: T_TASK_PREVIOUS_TASK                                  */
/*==============================================================*/
create table dbo.T_TASK_PREVIOUS_TASK (
   TASK_ID              int                  not null,
   PREVIOUS_TASK_ID     int                  not null,
   constraint PK_T_TASK_PREVIOUS_TASK primary key (TASK_ID)
)
go

execute sp_addextendedproperty 'MS_Description', 
   '任务——前驱任务表',
   'user', 'dbo', 'table', 'T_TASK_PREVIOUS_TASK'
go

execute sp_addextendedproperty 'MS_Description', 
   '任务代号',
   'user', 'dbo', 'table', 'T_TASK_PREVIOUS_TASK', 'column', 'TASK_ID'
go

execute sp_addextendedproperty 'MS_Description', 
   '前驱任务代号',
   'user', 'dbo', 'table', 'T_TASK_PREVIOUS_TASK', 'column', 'PREVIOUS_TASK_ID'
go

/*==============================================================*/
/* Table: T_USER                                                */
/*==============================================================*/
create table dbo.T_USER (
   USER_ID              int                  identity(1,1),
   LAST_LOGIN_ADDRESS   varchar(50)          null,
   LAST_LOGIN_TIME      datetime             null,
   LOGIN_COUNT          int                  not null,
   LOGIN_NAME           varchar(32)          not null,
   LOGIN_PASS           varchar(32)          not null,
   REAL_NAME            varchar(32)          not null,
   USER_EMAIL           varchar(300)         null,
   USER_MEMO            varchar(1000)        null,
   USER_MOBILE          varchar(30)          null,
   USER_MSN             varchar(300)         null,
   USER_PRIVILEGES      varchar(1000)        null,
   USER_QQ              varchar(30)          null,
   USER_ROLES           varchar(1000)        null,
   USER_STATE           int                  not null,
   USER_TELEPHONE       varchar(30)          null,
   constraint PK_T_USER primary key (USER_ID)
)
go

execute sp_addextendedproperty 'MS_Description', 
   '用户表',
   'user', 'dbo', 'table', 'T_USER'
go

execute sp_addextendedproperty 'MS_Description', 
   '用户代号',
   'user', 'dbo', 'table', 'T_USER', 'column', 'USER_ID'
go

execute sp_addextendedproperty 'MS_Description', 
   '上次登陆地址',
   'user', 'dbo', 'table', 'T_USER', 'column', 'LAST_LOGIN_ADDRESS'
go

execute sp_addextendedproperty 'MS_Description', 
   '上次登陆时间',
   'user', 'dbo', 'table', 'T_USER', 'column', 'LAST_LOGIN_TIME'
go

execute sp_addextendedproperty 'MS_Description', 
   '登陆次数',
   'user', 'dbo', 'table', 'T_USER', 'column', 'LOGIN_COUNT'
go

execute sp_addextendedproperty 'MS_Description', 
   '登陆名',
   'user', 'dbo', 'table', 'T_USER', 'column', 'LOGIN_NAME'
go

execute sp_addextendedproperty 'MS_Description', 
   '登陆密码',
   'user', 'dbo', 'table', 'T_USER', 'column', 'LOGIN_PASS'
go

execute sp_addextendedproperty 'MS_Description', 
   '真实姓名',
   'user', 'dbo', 'table', 'T_USER', 'column', 'REAL_NAME'
go

execute sp_addextendedproperty 'MS_Description', 
   '用户电子邮箱',
   'user', 'dbo', 'table', 'T_USER', 'column', 'USER_EMAIL'
go

execute sp_addextendedproperty 'MS_Description', 
   '用户信息',
   'user', 'dbo', 'table', 'T_USER', 'column', 'USER_MEMO'
go

execute sp_addextendedproperty 'MS_Description', 
   '用户手机号码',
   'user', 'dbo', 'table', 'T_USER', 'column', 'USER_MOBILE'
go

execute sp_addextendedproperty 'MS_Description', 
   '用户MSN',
   'user', 'dbo', 'table', 'T_USER', 'column', 'USER_MSN'
go

execute sp_addextendedproperty 'MS_Description', 
   '用户权利',
   'user', 'dbo', 'table', 'T_USER', 'column', 'USER_PRIVILEGES'
go

execute sp_addextendedproperty 'MS_Description', 
   '用户QQ',
   'user', 'dbo', 'table', 'T_USER', 'column', 'USER_QQ'
go

execute sp_addextendedproperty 'MS_Description', 
   '用户角色',
   'user', 'dbo', 'table', 'T_USER', 'column', 'USER_ROLES'
go

execute sp_addextendedproperty 'MS_Description', 
   '用户状态',
   'user', 'dbo', 'table', 'T_USER', 'column', 'USER_STATE'
go

execute sp_addextendedproperty 'MS_Description', 
   '用户电话号码',
   'user', 'dbo', 'table', 'T_USER', 'column', 'USER_TELEPHONE'
go

/*==============================================================*/
/* Table: T_WORK_LOG                                            */
/*==============================================================*/
create table dbo.T_WORK_LOG (
   WORK_LOG_ID          int                  identity(1,1),
   CREATE_TIME          datetime             not null,
   MODIFY_TIME          datetime             null,
   WORK_CONTENT         text                 null,
   WORK_DAY             datetime             not null,
   WORK_USER_ID         int                  not null,
   constraint PK_T_WORK_LOG primary key (WORK_LOG_ID)
)
go

execute sp_addextendedproperty 'MS_Description', 
   '工作日志表',
   'user', 'dbo', 'table', 'T_WORK_LOG'
go

execute sp_addextendedproperty 'MS_Description', 
   '工作日志代号',
   'user', 'dbo', 'table', 'T_WORK_LOG', 'column', 'WORK_LOG_ID'
go

execute sp_addextendedproperty 'MS_Description', 
   '创建时间',
   'user', 'dbo', 'table', 'T_WORK_LOG', 'column', 'CREATE_TIME'
go

execute sp_addextendedproperty 'MS_Description', 
   '修改时间',
   'user', 'dbo', 'table', 'T_WORK_LOG', 'column', 'MODIFY_TIME'
go

execute sp_addextendedproperty 'MS_Description', 
   '工作内容',
   'user', 'dbo', 'table', 'T_WORK_LOG', 'column', 'WORK_CONTENT'
go

execute sp_addextendedproperty 'MS_Description', 
   '工作日',
   'user', 'dbo', 'table', 'T_WORK_LOG', 'column', 'WORK_DAY'
go

execute sp_addextendedproperty 'MS_Description', 
   '职工号',
   'user', 'dbo', 'table', 'T_WORK_LOG', 'column', 'WORK_USER_ID'
go

/*==============================================================*/
/* Table: T_WORK_LOG_RELATIONSHIP_TASK                          */
/*==============================================================*/
create table dbo.T_WORK_LOG_RELATIONSHIP_TASK (
   WORK_LOG_ID          int                  not null,
   TASK_ID              int                  not null,
   constraint PK_T_WORK_LOG_RELATIONSHIP_TAS primary key (WORK_LOG_ID, TASK_ID)
)
go

execute sp_addextendedproperty 'MS_Description', 
   '工作日志——关系——任务表',
   'user', 'dbo', 'table', 'T_WORK_LOG_RELATIONSHIP_TASK'
go

execute sp_addextendedproperty 'MS_Description', 
   '工作日志代号',
   'user', 'dbo', 'table', 'T_WORK_LOG_RELATIONSHIP_TASK', 'column', 'WORK_LOG_ID'
go

execute sp_addextendedproperty 'MS_Description', 
   '任务代号',
   'user', 'dbo', 'table', 'T_WORK_LOG_RELATIONSHIP_TASK', 'column', 'TASK_ID'
go

alter table dbo.T_PROJECT
   add constraint FK4B5FEA0E26F5056E foreign key (PROJECT_MANAGER_ID)
      references dbo.T_USER (USER_ID)
go

alter table dbo.T_PROJECT_JOIN_USER
   add constraint FK422E9CCF845CFBAA foreign key (USER_ID)
      references dbo.T_USER (USER_ID)
go

alter table dbo.T_PROJECT_JOIN_USER
   add constraint FK422E9CCFEAD905EC foreign key (PROJECT_ID)
      references dbo.T_PROJECT (PROJ_ID)
go

alter table dbo.T_TASK
   add constraint FK94B8FA9075AB6D64 foreign key (TASK_MODIFIER_ID)
      references dbo.T_USER (USER_ID)
go

alter table dbo.T_TASK
   add constraint FK94B8FA90B4A9F82 foreign key (TASK_MANAGER_ID)
      references dbo.T_USER (USER_ID)
go

alter table dbo.T_TASK
   add constraint FK94B8FA90C83BFF99 foreign key (TASK_CREATER_ID)
      references dbo.T_USER (USER_ID)
go

alter table dbo.T_TASK
   add constraint FK94B8FA90D448F0E6 foreign key (TASK_PROJECT_ID)
      references dbo.T_PROJECT (PROJ_ID)
go

alter table dbo.T_TASK
   add constraint FK94B8FA90E80C5E89 foreign key (TASK_PARENT_ID)
      references dbo.T_TASK (TASK_ID)
go

alter table dbo.T_TASK
   add constraint FK94B8FA90F0C60D3C foreign key (TASK_OWNER_ID)
      references dbo.T_USER (USER_ID)
go

alter table dbo.T_TASK_PREVIOUS_TASK
   add constraint FK40D48E5E13B7208 foreign key (TASK_ID)
      references dbo.T_TASK (TASK_ID)
go

alter table dbo.T_TASK_PREVIOUS_TASK
   add constraint FK40D48E5E458BECC0 foreign key (PREVIOUS_TASK_ID)
      references dbo.T_TASK (TASK_ID)
go

alter table dbo.T_WORK_LOG
   add constraint FK5E4B7481F4F8C87C foreign key (WORK_USER_ID)
      references dbo.T_USER (USER_ID)
go

alter table dbo.T_WORK_LOG_RELATIONSHIP_TASK
   add constraint FKB6AD4AEE13B7208 foreign key (TASK_ID)
      references dbo.T_TASK (TASK_ID)
go

alter table dbo.T_WORK_LOG_RELATIONSHIP_TASK
   add constraint FKB6AD4AEEC161FE29 foreign key (WORK_LOG_ID)
      references dbo.T_WORK_LOG (WORK_LOG_ID)
go

