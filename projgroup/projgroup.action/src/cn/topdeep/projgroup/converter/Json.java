package cn.topdeep.projgroup.converter;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.*;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import net.sf.json.JsonConfig;

public class Json {
	public static String encode(Object obj) {
		if(obj == null) return "";
		if(obj instanceof List) { 
			JsonConfig jsonConfig = new JsonConfig(); 
			Map<String,Object> classMap = new HashMap<String,Object>();
			classMap.put("*", HashMap.class);
			jsonConfig.setClassMap(classMap);
			jsonConfig.registerJsonValueProcessor(Timestamp.class, new JsonDateProcessor());
			jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateProcessor());
			return JSONSerializer.toJSON((List)obj, jsonConfig).toString();
		} else if(obj instanceof Map){
			JsonConfig jsonConfig = new JsonConfig(); 
			jsonConfig.registerJsonValueProcessor(Timestamp.class, new JsonDateProcessor());
			jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateProcessor());
			return JSONSerializer.toJSON((Map)obj, jsonConfig).toString();
		} else { 
			return obj.toString();
		}
	}
	
	/**
	 * 从json反序列成java对象
	 * @param json
	 * @return
	 */
	public static Object decode(String json) {
		if(json.startsWith("[")) {
			JsonConfig jsonConfig = new JsonConfig();
			jsonConfig.setRootClass(HashMap.class);
			Map<String,Object> classMap = new HashMap<String,Object>();
			classMap.put("*", HashMap.class);
			jsonConfig.setClassMap(classMap);
			return (List)JSONSerializer.toJava(JSONArray.fromObject(json), jsonConfig);//
		} else if(json.startsWith("{")) {
			JsonConfig jsonConfig = new JsonConfig(); 
			jsonConfig.setRootClass(HashMap.class);
			Map<String,Object> classMap = new HashMap<String,Object>();
			classMap.put("*", HashMap.class);
			jsonConfig.setClassMap(classMap);
			return (Map)JSONObject.toBean(JSONObject.fromObject(json),jsonConfig);
		} else {
			return null;
		}
	}
}
