package cn.topdeep.projgroup.converter;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

public class JsonDateProcessor implements JsonValueProcessor {
	public Object processArrayValue(Object value, JsonConfig jsonConfig) {
		return null;
	}

	public Object processObjectValue(String key, Object bean,
			JsonConfig jsonConfig) {
		String jsonObject = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		if (bean instanceof java.sql.Date) {
			bean = new java.util.Date(((java.sql.Date) bean).getTime());
		}
		if (bean instanceof Timestamp) {
			bean = new java.util.Date(((Timestamp) bean).getTime());
		}
		if (bean instanceof java.util.Date) {
			jsonObject = sdf.format(bean);
		}
		return jsonObject;
	}

}