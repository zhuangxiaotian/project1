/**
 * 
 */
package cn.topdeep.projgroup.action.home;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.jcs.JCS;
import org.apache.commons.jcs.access.CacheAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.topdeep.projgroup.action.base.BaseAction;
import cn.topdeep.projgroup.biz.jira.JiraBiz;
import cn.topdeep.projgroup.entity.db.User;
import cn.topdeep.projgroup.entity.db.UserExample;
import cn.topdeep.projgroup.entity.jiradb.ViewTopdeepBean;
import cn.topdeep.projgroup.entity.jiradb.ViewTopdeepBeanExample;
import cn.topdeep.projgroup.entity.request.BaseRequest;
import cn.topdeep.projgroup.entity.request.IndexRequest;
import cn.topdeep.projgroup.entity.response.EChartData;
import cn.topdeep.projgroup.entity.response.EChartSeriesData;
import cn.topdeep.projgroup.entity.response.IndexResponse;
import cn.topdeep.projgroup.entity.view.NameValue;

import common.cache2.CacheException;
import common.util.StringUtils;

/**
 * @author niexin
 *
 */
@Controller
@RequestMapping(value = {
	"/home"
})
public class IndexAction extends BaseAction {

	@Autowired
	@Qualifier("jiraBiz")
	private JiraBiz jiraBiz;

	private CacheAccess<String, EChartData> echartCache = JCS.getInstance("jiraCache");

	@RequestMapping(value = "index", method = {
			RequestMethod.GET, RequestMethod.POST
	})
	public String execute(BaseRequest req, Model model) {
		IndexResponse res = new IndexResponse();
		model.addAttribute("res", res);
		res.setTitle("首页");
		List<NameValue> columnList = new ArrayList<NameValue>();
		columnList.add(new NameValue("姓名", "userName"));
		Date today = new Date();
		for (int i = 6; i >= 0; i--) {
			Date day = StringUtils.getDate(today, -i);
			columnList.add(new NameValue(StringUtils.dateTimeToString(day, "yyyy-MM-dd"), "day" + (i + 1)));
		}
		res.setColumnList(columnList);
		return "/" + res.getSkin() + "/home/index-success";
	}

	@RequestMapping(value = "/topdeepBeanList.do", method = {
			RequestMethod.GET, RequestMethod.POST
	})
	public String executeTopdeepBean(BaseRequest req, Model model) {
		IndexResponse res = new IndexResponse();
		model.addAttribute("res", res);
		res.setTitle("首页");
		List<NameValue> columnList = new ArrayList<NameValue>();
		columnList.add(new NameValue("姓名", "userName"));
		Date today = new Date();
		for (int i = 6; i >= 0; i--) {
			Date day = StringUtils.getDate(today, -i);
			columnList.add(new NameValue(StringUtils.dateTimeToString(day, "yyyy-MM-dd"), "day" + (i + 1)));
		}
		res.setColumnList(columnList);
		return "/" + res.getSkin() + "/work/topdeep-bean-list-success";
	}

	private EChartData loadEChartData(String queryType) throws CacheException, ParseException {

		EChartData ret = new EChartData();
		Date endDay = null;
		Date beginDay = null;
		Date today = new Date();
		boolean needTotal = false;
		int queryDay = 0;
		if ("0".equals(queryType)) {
			beginDay = StringUtils.stringToDate(StringUtils.dateTimeToString(today, "yyyyMM") + "01", "yyyyMMdd");
			endDay = today;
		} else if ("1".equals(queryType)) {
			beginDay = StringUtils.stringToDate(StringUtils.dateTimeToString(today, "yyyyMM") + "01", "yyyyMMdd");
			endDay = StringUtils.getDate(beginDay, -1);
			beginDay = StringUtils.stringToDate(StringUtils.dateTimeToString(endDay, "yyyyMM") + "01", "yyyyMMdd");
		} else if ("2".equals(queryType)) {
			beginDay = StringUtils.stringToDate("20160101", "yyyyMMdd");
			endDay = today;
			needTotal = true;
		}
		long diff = endDay.getTime() - beginDay.getTime();
		int diffDay = (int) (diff / 1000 / 60 / 60 / 24);
		queryDay = diffDay;

		List<String> dateList = new ArrayList<String>();
		// 日期列表
		for (int i = 0; i <= queryDay; i++) {
			Date day = StringUtils.getDate(beginDay, i);
			dateList.add(StringUtils.dateTimeToString(day, "yyyy-MM-dd"));
		}
		ret.setDateList(dateList);
		// 人员列表
		UserExample condition1 = new UserExample();
		condition1.or().andUserStateEqualTo(1);
		List<User> userList = systemBiz.userSelectObjects(condition1);
		List<String> userLegendList = new ArrayList<String>();
		List<EChartSeriesData> seriesList = new ArrayList<EChartSeriesData>();
		Map<String, EChartSeriesData> seriesMap = new HashMap<String, EChartSeriesData>();
		Map<String, Boolean> selectedLegendMap = new HashMap<String, Boolean>();
		for (User item : userList) {
			EChartSeriesData data = new EChartSeriesData();
			data.setName(item.getRealName());
			data.setType("line");
			// if (data.getName().equals("聂鑫")) {
			// data.setyAxisIndex(1);
			// }
			data.setData(new ArrayList<Integer>());
			seriesList.add(data);
			seriesMap.put(item.getRealName(), data);
			userLegendList.add(item.getRealName());
			// selectedLegendMap.put(data.getName(), false);
		}
		if (true) {
			EChartSeriesData data = new EChartSeriesData();
			data.setName("玄谷");
			data.setType("line");
			data.setyAxisIndex(1);
			data.setData(new ArrayList<Integer>());
			seriesList.add(data);
			seriesMap.put("total", data);
			userLegendList.add(data.getName());
			// selectedLegendMap.put(data.getName(), true);
		}
		// selectedLegendMap.put(getLoginUser().getLoginUser().getRealName(), true);
		ret.setUserList(userLegendList);
		ret.setSelectedUser(selectedLegendMap);
		// 第一天的
		String beginDayStr = StringUtils.dateTimeToString(beginDay, "yyyy-MM-dd");
		ViewTopdeepBeanExample condition = new ViewTopdeepBeanExample();
		if (needTotal) {
			condition.or().andStatDateLessThanOrEqualTo(beginDayStr).andStatDateGreaterThanOrEqualTo("2016-01-01");
		} else {
			condition.or().andStatDateEqualTo(beginDayStr);
		}
		List<ViewTopdeepBean> beginList = jiraBiz.viewTopdeepBeanSelectObjectsSumByExample(condition);
		for (ViewTopdeepBean item : beginList) {
			if (seriesMap.containsKey(item.getUserName())) {
				seriesMap.get(item.getUserName()).getData().add((int) Math.round(item.getTotalBean().doubleValue()));
			}
		}
		for (EChartSeriesData item : seriesList) {
			if (item.getData().size() <= 0) {
				item.getData().add(0);
			}
		}
		// 第一天的数据初始化完成
		condition.clear();
		condition.or().andStatDateGreaterThan(beginDayStr);
		List<ViewTopdeepBean> list = jiraBiz.viewTopdeepBeanSelectObjects(condition);
		// 开始填充第二天以后的数据
		for (int i = 1; i <= queryDay; i++) {
			Date day = StringUtils.getDate(beginDay, i);
			String dayStr = StringUtils.dateTimeToString(day, "yyyy-MM-dd");
			int daySum = 0;
			for (ViewTopdeepBean item : list) {
				if (!item.getStatDate().equals(dayStr)) {
					continue;
				}
				daySum += item.getTotalBean().doubleValue();
				if (!seriesMap.containsKey(item.getUserName())) {
					continue;
				}
				EChartSeriesData seriesData = seriesMap.get(item.getUserName());
				seriesData.getData().add(seriesData.getData().get(i - 1) + (int) Math.round(item.getTotalBean().doubleValue()));
			}
			if (true) {
				EChartSeriesData seriesData = seriesMap.get("total");
				seriesData.getData().add(seriesData.getData().get(i - 1) + daySum);
			}
			for (EChartSeriesData item : seriesList) {
				if (item.getData().size() <= i) {
					item.getData().add(item.getData().get(i - 1));
				}
			}
		}
		ret.setSeriesList(seriesList);
		return ret;
	}

	@RequestMapping(value = "index!ajaxQueryTopdeepBeanList", method = {
			RequestMethod.GET, RequestMethod.POST
	})
	@ResponseBody
	public IndexResponse ajaxQueryTopdeepBeanList(IndexRequest req) {
		IndexResponse res = new IndexResponse();
		try {
			String key = req.getQueryType();
			EChartData chartData = echartCache.get(key);
			if (req.isForceRefresh()) {
				if (chartData != null) {
					long diff = new Date().getTime() - chartData.getLastRefreshTime();
					if (diff > 1000 * 60 * 10) {
						chartData = null;
						logger.debug("force refresh echartData");
					}
				}
			}
			if (chartData == null) {
				chartData = loadEChartData(req.getQueryType());
				if (chartData != null) {
					chartData.setLastRefreshTime(new Date().getTime());
					echartCache.put(key, chartData);
				}
			}
			if (chartData != null) {
				chartData.getSelectedUser().clear();
				for (EChartSeriesData item : chartData.getSeriesList()) {
					chartData.getSelectedUser().put(item.getName(), false);
				}
				chartData.getSelectedUser().put("玄谷", true);
				chartData.getSelectedUser().put(getLoginUser().getLoginUser().getRealName(), true);
			}
			res.seteChartData(chartData);
		} catch (Exception ex) {
			res.setResult(false, ex.getMessage());
			logger.error("index!ajaxQueryTopdeepBeanList error: " + ex.getMessage(), ex);
		}
		return res;
	}

}
