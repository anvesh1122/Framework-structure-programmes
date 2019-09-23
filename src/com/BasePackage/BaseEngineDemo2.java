package com.BasePackage;

import java.util.concurrent.TimeUnit;

import org.junit.internal.runners.InitializationError;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseEngineDemo2 {
	
	public WebDriver driver;
	public String curDir;
	public String browser;

	@Parameters("browser")
	@BeforeSuite
	
	public void openbrowser(@Optional("chrome")String browser) {
		curDir=System.getProperty("user.Dir");
		System.out.println("before suite is excuted");
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\workspace\\Com.FrameWorkTestDemo\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			Initialization();
			
		}
		
	}
	
	public void Initialization() {
		driver.get("https://www.google.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println("After initialized");
	}

	@AfterSuite
	public void closebrowser() {
		if (browser!=null) {
			System.out.println("Aftersuite is excuted");
			driver.close();
		}
		
	}
	public WebDriver getDriver() {
		return driver ;
			
	}
	public void CurDirDriver() {
		return;
	}
}

