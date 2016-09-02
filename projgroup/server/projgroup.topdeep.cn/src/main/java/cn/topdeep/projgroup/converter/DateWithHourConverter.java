/**
 * 
 */
package cn.topdeep.projgroup.converter;

import java.text.ParseException;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;
import common.util.*;

/**
 * @author niexin
 *
 */
public class DateWithHourConverter extends StrutsTypeConverter {

	/* (non-Javadoc)
	 * @see org.apache.struts2.util.StrutsTypeConverter#convertFromString(java.util.Map, java.lang.String[], java.lang.Class)
	 */
	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		try {
			return StringUtils.stringToDate(values[0], "yyyy-MM-dd HH");
		} catch (ParseException e) {
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see org.apache.struts2.util.StrutsTypeConverter#convertToString(java.util.Map, java.lang.Object)
	 */
	@Override
	public String convertToString(Map context, Object o) {
		if (o instanceof Date) {
			Date date = (Date) o;
			return StringUtils.dateTimeToString(date, "yyyy-MM-dd HH");
		}
		return "";
	}

}
