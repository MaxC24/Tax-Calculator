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
		double mod = tax % 0.05;
		
		if(mod > 0) {
			tax += (0.05 - mod);
		}
		
		return tax;
	}
}

