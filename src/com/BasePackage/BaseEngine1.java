package com.BasePackage;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.Apps.constantsPackage.constants1;
import com.TestNGFrameworkUtilities.ScreenShots;

public class BaseEngine1 {
	


	private static String curdir;
	private static WebDriver driver;
	private String browser;
	private static String Tcname;
	
@Parameters("browser")
@BeforeSuite
public void openbrowser(@Optional("Chrome")String browser) {
	curdir=System.getProperty("user.dir");
	System.out.println("passed through the Chromebrowser");
	if (browser.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Com.FrameWorkTestDemo\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		initialization();
		
	}			
}
public void initialization() {
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}
public static WebDriver getDriver() {
	return driver;
	
}
public static String getCurdir() {
	return curdir;
	
}
public static String getTcname() {
	return Tcname;
}

@AfterSuite

public void closebrowser() {
	if (browser!=null)
		driver.close();
	}
}

/*@BeforeMethod
public void BeforeExcution(Method method) {
Tcname=method.getName();
System.out.println("Before method passing");
}


@AfterMethod
public void AfterExcution(ITestResult result) throws IOException {
	Tcname=result.getName();
	if(result.getStatus()==result.SUCCESS) {
		System.out.println("testCase is success:"+Tcname);
	}
	else if (result.getStatus()==result.FAILURE) {
		System.out.println("testcase is failure:"+Tcname);
		ScreenShots.takeScreenShot();
		TakesScreenshot ss=(TakesScreenshot)driver;
         File file=ss.getScreenshotAs(OutputType.FILE);
         FileUtils.copyFile(file,new File("D:\\workspace\\Com.FrameWorkTestDemo\\TakeScreenshots\\"+Tcname+".jpeg"));
         System.out.println("failed test case:"+Tcname);
         
	}
        else if (result.getStatus()==result.SKIP) {
        	 System.out.println("test case is skipping:"+Tcname);
        	 ScreenShots.takeScreenShot();
        	 TakesScreenshot ss=(TakesScreenshot)driver;
        	 File file=ss.getScreenshotAs(OutputType.FILE);
        	 FileUtils.copyFile(file,new File("D:\\workspace\\Com.FrameWorkTestDemo\\TakeScreenshots\\"+Tcname+".jpeg\""));
        	 System.out.println("skipped testcase:"+Tcname);
        		
		}
		
		
	}*/
	
	


