create or replace view V_WORK_LOG_VIEW as
  SELECT t_user.real_name, t_work_log.work_day, t_work_log.modify_time
FROM t_work_log
INNER JOIN t_user ON t_user.user_id = t_work_log.work_user_id;

update T_SYSTEM_PARAM set SYSTEM_PARAM_VALUE = '1.2', MODIFY_TIME = now()
  where SYSTEM_PARAM_CATEGORY = 'cn.topdeep.projgroup.entity.params.DbParam' and SYSTEM_PARAM_CODE = 'dbVersion'

