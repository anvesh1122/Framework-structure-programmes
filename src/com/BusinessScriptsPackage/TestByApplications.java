package com.BusinessScriptsPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Automation.Supporters.ApplicationProperties;
import com.BasePackage.BaseEngine1;

public class TestByApplications extends BaseEngine1{
	
	@Test
	public void TestApps() throws IOException {
	ApplicationProperties application=new ApplicationProperties("D:\\workspace\\Com.FrameWorkTestDemo\\config.poperties.TestByapplications");
	 String str=application.getPropertyValue("URL");
	 getDriver().get(str);
	 
	 //String str1=application.getPropertyValue("URL12");
	 
	 
	 String str1= application.getPropertyValue("URL12");
	 getDriver().get(str1);
	 String str2=application.getPropertyValue("URL123456","https://www.whatsapp.com");
	 getDriver().get(str2);
	 String str3=application.getPropertyValue("URL123","https://www.guru99.com");
	 getDriver().get(str3);
	String str4=application.getPropertyValue("URL12345");
	getDriver().get(str4);
	
	}
}
