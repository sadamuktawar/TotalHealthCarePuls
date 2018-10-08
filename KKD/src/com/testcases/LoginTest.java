package com.testcases;

import com.keyword.Keyword;

public class LoginTest {
	public static void main(String[] args) {
		Keyword.openBrowser("chrome");
		Keyword.enterUrl(Keyword.getProperty("url"));
		Keyword.SelectDropdown(Keyword.getProperty("accountType"), "admin");
		Keyword.enterText(Keyword.getProperty("email"),"admin@admin.com");
		Keyword.enterText(Keyword.getProperty("password"),"admin");
		Keyword.click(Keyword.getProperty("login"));
		//Keyword.logoutApp(Keyword.getProperty("accountlogout"), "logout");
		Keyword.tearDown();
		
		
	}

}
