package com.TestNGFrameworkUtilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.BasePackage.BaseEngine1;

public interface ScreenShots {

	
 public static void takeScreenShot() throws IOException {
	 
	 TakesScreenshot ss=(TakesScreenshot)BaseEngine1.getDriver();
     File file=ss.getScreenshotAs(OutputType.FILE);
     FileUtils.copyFile(file,new File("D:\\workspace\\Com.FrameWorkTestDemo\\TakeScreenshots\\"+BaseEngine1.getTcname()+".jpeg"));
     //System.out.println("failed test case:"+TcName());	 
}
  public static void takeScreenShot(String Tcname) throws IOException
  {
	  TakesScreenshot ss=(TakesScreenshot)BaseEngine1.getDriver();
	     File file=ss.getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(file,new File("D:\\workspace\\Com.FrameWorkTestDemo\\TakeScreenshots\\"+Tcname+".jpeg"));
	  
  }
 

}
