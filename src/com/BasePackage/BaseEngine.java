package com.BasePackage;

import java.util.concurrent.TimeUnit;

import javax.naming.InitialContext;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseEngine {

	private static RemoteWebDriver driver;
	private static String CurDir;
	

    @Parameters("browser")
	@BeforeSuite
	public void openbrowser(@Optional("chrome")String browser)
    {
		CurDir = System.getProperty("cur.Dir+");
		
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\workspace\\Com.FrameWorkTestDemo\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			intial();	
		}
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("constants.firefox","D:\\workspace\\Com.FrameWorkTestDemo\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			intial();
			
			//if(browser.equalsIgnoreCase("IE")) {
				//System.setProperty("webdriver.ie.driver", value)
			
			
			//@BeforeMethod
			
			
			
			}
			
			
		}
	
    

	private void intial() {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
	}

	@AfterSuite
	public void closebrowser() {
		//driver.quit();
		if (driver!=null) 
			driver.close();
			else
				System.out.println("task completed");
				
	}
	
	public static RemoteWebDriver getDriver() {
		return driver;
	}
	
	public static String CurDir() {
		return CurDir;
	}
		
	}
	

