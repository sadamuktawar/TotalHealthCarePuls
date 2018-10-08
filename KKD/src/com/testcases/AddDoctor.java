
package com.testcases;

import com.keyword.Keyword;

public class AddDoctor  {
	public static void main(String[] args) {
	    Keyword.openBrowser(Keyword.getProperty("browser"));
        Keyword.enterUrl(Keyword.getProperty("url"));
        Keyword.SelectDropdown(Keyword.getProperty("accountType"), "admin");
        Keyword.enterText(Keyword.getProperty("email"), "admin@admin.com");
        Keyword.enterText(Keyword.getProperty("password"), "admin");
        Keyword.click(Keyword.getProperty("login"));
        Keyword.click(Keyword.getProperty("doctor"));
        Keyword.click(Keyword.getProperty("addDoctor"));
        Keyword.enterText(Keyword.getProperty("doctorName"), "Dr.Sadadnand Muktawar");
        Keyword.enterText(Keyword.getProperty("doctorEmail"), "sada@admin.com");
        Keyword.enterText(Keyword.getProperty("doctorPassword"), "Health123");
        Keyword.enterText(Keyword.getProperty("doctorAddress"), "Ganpati sansthan Trust,Kalptaru Lane-1,Chandan Nagar,Pune");
        Keyword.enterText(Keyword.getProperty("doctorPhone"), "9673457306");
        Keyword.SelectDropdown(Keyword.getProperty("department"), "Physical Therapy");
        Keyword.enterText(Keyword.getProperty("profile"), "Surgen");
        Keyword.click(Keyword.getProperty("doctorAdd"));
        Keyword.takeScreenshot(null);
        Keyword.click(Keyword.getProperty("account"));
        Keyword.click(Keyword.getProperty("logOut"));
        Keyword.tearDown();
        
        


             }
		
		
	}


