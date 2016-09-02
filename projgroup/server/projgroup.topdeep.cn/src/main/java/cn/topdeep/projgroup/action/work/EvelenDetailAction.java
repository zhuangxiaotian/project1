package cn.topdeep.projgroup.action.work;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.topdeep.projgroup.action.base.BaseAction;
import cn.topdeep.projgroup.entity.db.VWorkLogView;
import cn.topdeep.projgroup.entity.request.EvelenStatisticalRequest;
import cn.topdeep.projgroup.entity.response.EvelenStatisticalResponse;
import cn.topdeep.projgroup.entity.view.VWorkLogViewExExample;

@Controller
@RequestMapping(value = {
	"/work"
})
public class EvelenDetailAction extends BaseAction {
	@RequestMapping(value = "evelenDetail", method = {
		RequestMethod.GET
	})
	public String execute(EvelenStatisticalRequest req, Model model) {
		EvelenStatisticalResponse res = new EvelenStatisticalResponse();
		model.addAttribute("res", res);
		// if (!hasPrivilege(Privilege.FUNC_Evelen_STATIC_MANAGE, PrivilegeOperate.Read)) {
		// return "";
		// }
		return "/" + res.getSkin() + "/work/evelen-detail-success";
	}

	@RequestMapping(value = {
		"evelenDetail!ajaxQuery"
	}, method = {
		RequestMethod.POST
	})
	@ResponseBody
	public EvelenStatisticalResponse ajaxQuery(EvelenStatisticalRequest request) {
		EvelenStatisticalResponse res = new EvelenStatisticalResponse();
		// if (!hasPrivilege(Privilege.FUNC_Evelen_STATIC_MANAGE, PrivilegeOperate.Read)) {
		// res.setResult(false, "没有权限");
		// }
		if (res.isSuccess()) {
			try {
				VWorkLogViewExExample example = new VWorkLogViewExExample();
				example.setWorkDayMonth(request.getQueryMonth());
				List<VWorkLogView> list = attendanceStatisticsBiz.selectEvelenStatisticalDetail(example);
				res.setDetailList(list);
				res.setResult(true, "查询成功!");
			} catch (Exception e) {
				res.setResult(false, e.getMessage());
				logger.error("evelenStatistical!ajaxQueryDetail error: " + e.getMessage(), e);
			}
		}
		return res;
	}

}
