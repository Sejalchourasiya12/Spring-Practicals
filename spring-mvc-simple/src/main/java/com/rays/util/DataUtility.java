package com.rays.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtility {

	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public static Date stringToDate(String value) {
		if (value != null && value.trim().length() > 0) {
	        try {
	            return sdf.parse(value);
	        } catch (ParseException e) {
	            return null;
	        }
	    }
	    return null;
	}

	public static String dateToString(Date value) {

		if (value != null) {
	        return sdf.format(value);
	    }
	    return "";   // empty string JSP ke liye safe
	}

	}
