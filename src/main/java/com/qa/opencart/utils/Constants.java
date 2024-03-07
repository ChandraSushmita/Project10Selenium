package com.qa.opencart.utils;

import java.util.ArrayList;
import java.util.List;

public class Constants {
	
	public static final String LOGIN_PAGE_TITLE = "Account Login";
	public static final String ACC_PAGE_TITLE = "OpenCart - Your Account";
	public static final int  ACC_PAGE_SECTIONS_COUNT = 4;
	
	
	public static List<String> expectedAccSecList() {
		List<String> expList = new ArrayList<String>();
		expList.add("Account");
		expList.add("Purchases");
		expList.add("Extensions");
		expList.add("Cloud Stores");
		
		return expList;
		
	}
}
