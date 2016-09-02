package cn.topdeep.projgroup.action.work;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.topdeep.projgroup.action.base.BaseAction;
import cn.topdeep.projgroup.entity.db.VWorkLogView;
import cn.topdeep.projgroup.entity.request.NineStatisticalDetailRequest;
import cn.topdeep.projgroup.entity.response.NineStatisticalDetailResponse;
import cn.topdeep.projgroup.entity.view.VWorkLogViewExExample;

@Controller
@RequestMapping(value = {
	"/work"
})
public class NineStatisticalDetailAction extends BaseAction {
	@RequestMapping(value = "nineStatisticalDetail", method = {
		RequestMethod.GET
	})
	public String execute(NineStatisticalDetailRequest req, Model model) {
		NineStatisticalDetailResponse res = new NineStatisticalDetailResponse();
		model.addAttribute("res", res);

		return "/" + res.getSkin() + "/work/nine-statistical-detail";
	}

	@RequestMapping(value = {
		"nineStatisticalDetail!ajaxQuery"
	}, method = {
		RequestMethod.POST
	})
	@ResponseBody
	public NineStatisticalDetailResponse ajaxQueryDetail(NineStatisticalDetailRequest request) {
		NineStatisticalDetailResponse res = new NineStatisticalDetailResponse();
		if (res.isSuccess()) {
			try {
				VWorkLogViewExExample example = new VWorkLogViewExExample();
				example.setWorkDayMonth(request.getQueryMonth());
				List<VWorkLogView> list = attendanceStatisticsBiz.selectNineStatisticalDetail(example);
				res.getData().put("list", list);
				res.setResult(true, "查询九点考勤详情");
			} catch (Exception e) {
				res.setResult(false, e.getMessage());
				logger.error("nineStatisticalDeatil!ajaxQueryDetail error: " + e.getMessage(), e);
			}
		}
		return res;
	}

}
