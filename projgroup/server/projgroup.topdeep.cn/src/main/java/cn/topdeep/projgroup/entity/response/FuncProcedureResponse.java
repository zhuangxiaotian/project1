/**
 * 
 */
package cn.topdeep.projgroup.entity.response;

import java.util.List;

import cn.topdeep.projgroup.entity.db.FuncParams;
import cn.topdeep.projgroup.entity.db.FuncProcedure;

/**
 * @author niexin
 *
 */
public class FuncProcedureResponse extends BaseResponse {

	private Integer funcProjectId;

	private Integer funcProcedureId;

	private Integer funcParamId;

	private List<FuncProcedure> procedureList;

	private List<FuncParams> paramList;

	private FuncParams funcParam;

	private FuncProcedure output;

	/**
	 * @return the procedureList
	 */
	public List<FuncProcedure> getProcedureList() {
		return procedureList;
	}

	/**
	 * @param procedureList the procedureList to set
	 */
	public void setProcedureList(List<FuncProcedure> procedureList) {
		this.procedureList = procedureList;
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
	 * @return the paramList
	 */
	public List<FuncParams> getParamList() {
		return paramList;
	}

	/**
	 * @param paramList the paramList to set
	 */
	public void setParamList(List<FuncParams> paramList) {
		this.paramList = paramList;
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
	 * @return the funcParam
	 */
	public FuncParams getFuncParam() {
		return funcParam;
	}

	/**
	 * @param funcParam the funcParam to set
	 */
	public void setFuncParam(FuncParams funcParam) {
		this.funcParam = funcParam;
	}

	public FuncProcedure getOutput() {
		return output;
	}

	public void setOutput(FuncProcedure output) {
		this.output = output;
	}

}
