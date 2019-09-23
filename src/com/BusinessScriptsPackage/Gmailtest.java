package com.BusinessScriptsPackage;

import org.testng.annotations.Test;

import com.BasePackage.BaseEngine;

public class Gmailtest extends BaseEngine{
	
	@Test
	public void gmail() throws InterruptedException {
		
		getDriver().get("https://www.gmail.com");
		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		getDriver().findElementById("identifierId").sendKeys("chilakaraju.anvesh7799@gmail.com");
		Thread.sleep(1000);
		
		getDriver().findElementById("dentifierNext").click();
		Thread.sleep(1000);
		getDriver().findElementByXPath("//input[@type='password']").sendKeys("9618989578");

	}

}
