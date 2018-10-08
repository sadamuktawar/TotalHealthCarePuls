package com.excelExportandFile;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;
	import org.apache.poi.hssf.usermodel.HSSFWorkbook;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	public class ReadExcelFile {	    
	    public Sheet readExcel(String filePath,String fileName,String sheetName) throws IOException{
	    //Create a object of File class to open xlsx file
	    File file =    new File(filePath+"D:\\TestingShastra\\Selenium program\\KKD\\Data Engin.xlsx"+fileName);
	    //Create an object of FileInputStream class to read excel file
	    FileInputStream inputStream = new FileInputStream(file);
	    Workbook DataEngin = null;
	    //Find the file extension by spliting file name in substing and getting only extension name
	    String fileExtensionName = fileName.substring(fileName.indexOf("."));
	    //Check condition if the file is xlsx file
	    if(fileExtensionName.equals(".xlsx")){
	    //If it is xlsx file then create object of XSSFWorkbook class
	    DataEngin = new XSSFWorkbook(inputStream);
	    }
	    //Check condition if the file is xls file
	    else if(fileExtensionName.equals(".xls")){
	        	        DataEngin = new HSSFWorkbook(inputStream);
	    
	        }
	    Sheet sheet1 = DataEngin.getSheet(sheetName);
	     return sheet1;    
	    }
	
}
