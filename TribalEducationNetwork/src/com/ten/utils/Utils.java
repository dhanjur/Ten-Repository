package com.ten.utils;

/**
 * @author Nita Karande
 * This class will contain reusable helper methods for the entire application
 */
public class Utils {
	/**
	 * Returns true if the input string is null or empty
	 * @param string
	 * @return
	 */
	public static boolean isEmptyOrNull(String string){
		return ((null == string) || ("".equals(string.trim())));
	}
}
