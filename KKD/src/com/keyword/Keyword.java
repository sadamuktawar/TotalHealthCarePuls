package com.keyword;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Keyword {
public	static WebDriver driver =null;
static	 WebElement ele;	
public static void openBrowser(String Bname) {
		switch (Bname) {
		case "chrome":
			System.out.println("chrome is launched..");
			System.setProperty("webdriver.chrome.driver","D:\\Selenium Softeware\\Setup\\WebDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "firefox":
			System.out.println("fireFox is launched..");
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium Softeware\\Setup\\WebDrivers\\geckodriver.exe");
		 driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;
		case "InternetExplorer":
			System.out.println(" IE is launched");
			System.setProperty("webdriver.ie.driver", "D:\\Selenium Softeware\\Setup\\WebDrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
           break;
		case "htmlUnitBroser":
			System.out.println("Htmlunitbrowser launched...");
			System.setProperty("webdriver.ie.driver", "D:\\Selenium Softeware\\Setup\\WebDrivers\\IEDriverServer.exe");
			driver = new HtmlUnitDriver();
			driver.manage().window().maximize();
           	break;	
		default:
           			
			
			System.out.println("Invlaid Broweser ");
					}
		
	}
	public static void enterUrl(String url) {
   driver.get(url);
		
	}
	
	public Object[] []data() {
		
		
		
		return null ;
		
	}
	
	public static void enterText(String Locator,String Key)
	{
	WebElement	text=driver.findElement(By.xpath(Locator));
	text.sendKeys(Key);
	}
	
public static void click(String Locator) {
	WebElement clickelement=driver.findElement(By.xpath(Locator));
	clickelement.click();
	
}
public static void SelectDropdown(String Locator,String Key ) {
	Select sel=new Select(driver.findElement(By.xpath(Locator)));
	sel.selectByVisibleText(Key);
	
  }


public static void logoutApp(String Locator,String Key ) {
	Select sel=new Select(driver.findElement(By.xpath(Locator)));
	sel.selectByVisibleText("logout");
	
  }

public static void doBSelect(String Locator, String value) {
	 WebElement dateBox = driver.findElement(By.xpath(Locator));
	  dateBox.sendKeys(value);
	  dateBox.sendKeys(Keys.TAB);
      

}
public static WebElement element(String keyWithLocator) {
	
  
	String arr[] = keyWithLocator.split(":");
    
    switch (arr[0]) {
    case "id":
        ele = driver.findElement(By.id(arr[1]));
        break;
    case "name":
        ele = driver.findElement(By.name(arr[1]));
        break;
    case "cssSelector":
        ele = driver.findElement(By.cssSelector(arr[1]));
        break;
    case "xpath":
        ele = driver.findElement(By.xpath(arr[1]));
        break;
    case "linkText":
        ele = driver.findElement(By.linkText(arr[1]));
        break;
    case "partialLinkText":
        ele = driver.findElement(By.partialLinkText(arr[1]));
        break;
    case "tagName":
        ele = driver.findElement(By.tagName(arr[1]));
        break;
    case "className":
        ele = driver.findElement(By.className(arr[1]));
        break;
    default:
        System.out.println("Please select valid locator...");

    }
    return ele;
}
public static void takeScreenshot(String Key) {
	

File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE) ;   
try {
	FileHandler.copy(src,new File("D:\\TestingShastra\\Selenium program\\KKD\\Reports\\TotalHealthcare.png"));
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println("Screenshot captured");
}
public static void tearDown() {
		driver.close();
	}


public static String getProperty(String Key) {
	try {
	FileInputStream fis =new FileInputStream("D:\\TestingShastra\\Selenium program\\KKD\\OB.Properties");
	Properties prop=new Properties();
	prop.load(fis);
	return prop.getProperty(Key);
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return "";
	}
	
	
	}

}
