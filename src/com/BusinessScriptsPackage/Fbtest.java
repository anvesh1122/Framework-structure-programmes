package com.BusinessScriptsPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Automation.Supporters.ApplicationProperties;
import com.BasePackage.BaseEngine;

public class Fbtest extends BaseEngine{

	@Test
	private void fbTest() throws IOException {
		ApplicationProperties app=new ApplicationProperties("D:\\workspace\\Com.FrameWorkTestDemo\\Config.Properties");
		String Url=app.getPropertyValue("URL");
		getDriver().get(Url);
		
	    String amazon= app.getPropertyValue("URL2","https://www.amazon.com");
	    getDriver().get(amazon);
	    
	    String str=app.getPropertyValue("URL4","https://www.rameshsoft.com");
	    getDriver().get(str);
		
		
		 
	}
}