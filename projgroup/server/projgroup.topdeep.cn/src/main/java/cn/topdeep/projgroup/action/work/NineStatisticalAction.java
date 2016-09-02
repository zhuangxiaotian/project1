package cn.topdeep.projgroup.action.work;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.topdeep.projgroup.action.base.BaseAction;
import cn.topdeep.projgroup.entity.request.NineStatisticalRequest;
import cn.topdeep.projgroup.entity.response.NineStatisticalResponse;
import cn.topdeep.projgroup.entity.view.VWorkLogViewExExample;
import cn.topdeep.projgroup.entity.view.VWorkLogViewStat;

@Controller
@RequestMapping(value = {
	"/work"
})
public class NineStatisticalAction extends BaseAction {
	@RequestMapping(value = "nineStatistical", method = {
		RequestMethod.GET
	})
	public String execute(NineStatisticalRequest req, Model model) {
		NineStatisticalResponse res = new NineStatisticalResponse();
		model.addAttribute("res", res);
		return "/" + res.getSkin() + "/work/nine-statistical-success";
	}

	@RequestMapping(value = {
		"nineStatistical!ajaxQuery"
	}, method = {
		RequestMethod.POST
	})
	@ResponseBody
	public NineStatisticalResponse ajaxQuery(NineStatisticalRequest request) {
		NineStatisticalResponse res = new NineStatisticalResponse();
		if (res.isSuccess()) {
			try {
				VWorkLogViewExExample example = new VWorkLogViewExExample();
				example.setWorkDayMonth(request.getQueryMonth());
				List<VWorkLogViewStat> list = attendanceStatisticsBiz.selectNineStatisticalList(example);
				res.getData().put("list", list);
				res.setResult(true, "九点考勤查询");
			} catch (Exception e) {
				res.setResult(false, e.getMessage());
				logger.error("nineStatistical!ajaxQuery error: " + e.getMessage(), e);
			}
		}
		return res;
	}
}
