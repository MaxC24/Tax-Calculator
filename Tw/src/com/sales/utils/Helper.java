/*
 * The Helper class is a utility that helps the other classes 
 * to implement some of the logic, for separation of concerns.
 */

package com.sales.utils;

public class Helper {
	
	public static String[] matchers = {"(.*)food(.*)", "(.*)pill(.*)", "(.*)chocolate(.*)", "(.*)book(.*)"};
	
	public static String fixName(String[] nameArr) {
		String name = "";
		for(int i = 1; i < nameArr.length; i++) {
			name += " " + nameArr[i];
		}
		return name.trim();
	}
	
	public static boolean isImported(String name) {
		return name.matches("(.*)imported(.*)");
	}
	
	public static boolean isTaxable(String name) {
		 for(String mat: matchers) {
			 if(name.matches(mat)) {
				 return true;
			 }
		 }
		 return false;
	}
	
	public static double taxRound(double tax) {
		return tax % 0.05 > 0 ? tax += (0.05 - tax % 0.05) : tax;
	}
	
	public static String format(double num) {
		return String.format("%.2f", num);
	}
}

