/**
 * 
 */
package cn.topdeep.projgroup.entity.request;

import cn.topdeep.projgroup.entity.response.BaseResponse;

/**
 * @author niexin
 *
 */
public class FuncProcedureRequest extends BaseRequest {
	private Integer funcProjectId;

	private Integer funcProcedureId;

	private Integer funcParamId;

	private boolean queryDeleteParams = false;

	public void checkQueryInput(BaseResponse res) {
		res.checkNull(funcProjectId, "缺少参数FuncProjectId");
	}

	public void checkParamsQueryInput(BaseResponse res) {
		res.checkNull(funcProcedureId, "缺少参数funcProcedureId");
	}

	/**
	 * @return the funcProjectId
	 */
	public Integer getFuncProjectId() {
		return funcProjectId;
	}

	/**
	 * @param funcProjectId the funcProjectId to set
	 */
	public void setFuncProjectId(Integer funcProjectId) {
		this.funcProjectId = funcProjectId;
	}

	/**
	 * @return the funcProcedureId
	 */
	public Integer getFuncProcedureId() {
		return funcProcedureId;
	}

	/**
	 * @param funcProcedureId the funcProcedureId to set
	 */
	public void setFuncProcedureId(Integer funcProcedureId) {
		this.funcProcedureId = funcProcedureId;
	}

	/**
	 * @return the funcParamId
	 */
	public Integer getFuncParamId() {
		return funcParamId;
	}

	/**
	 * @param funcParamId the funcParamId to set
	 */
	public void setFuncParamId(Integer funcParamId) {
		this.funcParamId = funcParamId;
	}

	/**
	 * @return the queryDeleteParams
	 */
	public boolean isQueryDeleteParams() {
		return queryDeleteParams;
	}

	/**
	 * @param queryDeleteParams the queryDeleteParams to set
	 */
	public void setQueryDeleteParams(boolean queryDeleteParams) {
		this.queryDeleteParams = queryDeleteParams;
	}
}
