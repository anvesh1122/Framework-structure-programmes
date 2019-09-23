package com.BusinessScriptsPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.BasePackage.BaseEngineDemo2;

public class GmailTestDemo2 extends BaseEngineDemo2{
	
	@Test
	public void AmazonTest() throws IOException {
	getDriver().get("https://www.amazon.com");
	WebElement dp=getDriver().findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	System.out.println("1st TC passed");
	
	Actions actions=new Actions(getDriver());
	actions.moveToElement(dp).build().perform();
	
	String deptxt=dp.getText();
	System.out.println("text is:"+deptxt);
	
	File file=new File("D:\\workspace\\Com.FrameWorkTestDemo\\src\\com\\Automation\\Supporters\\TextUtilities.txt");
	boolean status=file.createNewFile();
	if(status) {
		System.out.println("file is created newly");
	}else {
		System.out.println("return to existing ");
	}
	FileWriter fw=new FileWriter(file,true);
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write(deptxt);
	bw.flush();	
}
}
	/*@Test
	public void bookmyshow() {
		getDriver().get("https://www.bookmyshow.com");
		System.out.println("2nd TC passed");
	}*/

