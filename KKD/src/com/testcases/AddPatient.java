package com.testcases;

import com.keyword.Keyword;


public class AddPatient {
	public static void main(String[] args) throws Exception {
		Keyword.openBrowser(Keyword.getProperty("browser"));
        Keyword.enterUrl(Keyword.getProperty("url"));
        Keyword.SelectDropdown(Keyword.getProperty("accountType"), "admin");
        Keyword.enterText(Keyword.getProperty("email"), "admin@admin.com");
        Keyword.enterText(Keyword.getProperty("password"), "admin");
        Keyword.click(Keyword.getProperty("login"));
        Keyword.click(Keyword.getProperty("patient"));
        Keyword.click(Keyword.getProperty("addPatient"));
        Keyword.enterText(Keyword.getProperty("patientName"), "Sagar Jumde");
        Keyword.enterText(Keyword.getProperty("patientEmail"), "jumde123@gmail.com");
        Keyword.enterText(Keyword.getProperty("patientPassword"), "sagar@123");
        Keyword.enterText(Keyword.getProperty("patientAddress"), "Chandani Chowk,Kothrud,Pune");      
        Keyword.enterText(Keyword.getProperty("patientPhone"), "9673457306");
        Keyword.SelectDropdown(Keyword.getProperty("gender"), "male");
        Keyword.doBSelect(Keyword.getProperty("patientBirthDate"), "07/16/2018");
        Keyword.enterText(Keyword.getProperty("patientAge"),"28");
		Keyword.SelectDropdown(Keyword.getProperty("patientBloodGroup"), "B+");
		Keyword.takeScreenshot("ele");
		Keyword.tearDown();
		
	}


}
