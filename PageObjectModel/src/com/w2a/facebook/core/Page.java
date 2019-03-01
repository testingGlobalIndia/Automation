package com.w2a.facebook.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.w2a.facebook.pages.TopNavigation;
import com.w2a.facebook.util.Xls_Reader;



public class Page {
	
	
	
	public static WebDriver driver;
	public static Properties Config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;
	public static Xls_Reader excel = new Xls_Reader(System.getProperty("user.dir")+"/src/com/w2a/facebook/properties/testdata.xlsx");
	public static Logger logs = Logger.getLogger("devpinoyLogger");
	public static TopNavigation topNav;
	
	
	public Page() {
		
		if(driver==null){
		
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"/src/com/w2a/facebook/properties/Config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Config.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logs.debug("Loaded the Config property file");
		
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"/src/com/w2a/facebook/properties/OR.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			OR.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logs.debug("loaded the OR property file");
		
		if(Config.getProperty("browser").equals("firefox")){
			
			driver = new FirefoxDriver();
			logs.debug("Loaded Firefox");
			
		}else if(Config.getProperty("browser").equals("ie")){
			
			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		}else if(Config.getProperty("browser").equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		driver.get(Config.getProperty("testsiteurl"));
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		//DbManager.setMysqlDbConnection();
		topNav = new TopNavigation();
		
		}
		
		
		
	}
	
	
	public static void click(String key){
		
		
		driver.findElement(By.xpath(OR.getProperty(key))).click();
		System.out.println(key);
		
	}
	
	
	public static void input(String key,String value){
		
		
		driver.findElement(By.xpath(OR.getProperty(key))).sendKeys(value);
		
	}
	
	

}
