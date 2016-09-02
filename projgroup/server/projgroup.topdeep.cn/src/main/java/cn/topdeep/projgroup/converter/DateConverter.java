/**
 * $Id$
 */
package cn.topdeep.projgroup.converter;

import java.text.ParseException;
import java.util.*;
import common.util.*;

import org.apache.struts2.util.StrutsTypeConverter;

/**
 * @author niexin
 *
 */
public class DateConverter extends StrutsTypeConverter {

	/* (non-Javadoc)
	 * @see org.apache.struts2.util.StrutsTypeConverter#convertFromString(java.util.Map, java.lang.String[], java.lang.Class)
	 */
	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		String dateString = values[0];   
		try {
			return StringUtils.stringToDate(dateString, "yyyy-MM-dd");
		} catch (ParseException e) {
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see org.apache.struts2.util.StrutsTypeConverter#convertToString(java.util.Map, java.lang.Object)
	 */
	@Override
	public String convertToString(Map context, Object o) {
		return StringUtils.dateTimeToString((Date)o, "yyyy-MM-dd");
	}

}
