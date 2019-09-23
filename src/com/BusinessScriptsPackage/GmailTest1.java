package com.BusinessScriptsPackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.BasePackage.BaseEngine1;

public class GmailTest1 extends BaseEngine1 {
	
	/*@Test
	public void gmailtest1() {
		getDriver().get("https://www.gmail.com");
		getDriver().findElement(By.id("identifierId")).sendKeys("chilakaraju.anvesh7799@gmail.com");
		getDriver().findElement(By.className("Cwa9")).click();
		getDriver().findElement(By.className("i9lrp mIZh1c")).sendKeys("96189");
	}
	
	@Test
		public void  FbTest() {
		  getDriver().get("https://www.facebook.com");
		  getDriver().findElement(By.id("identifierId")).sendKeys("chilakaraju.anvesh7799@gmail.com");
		}*/
	
    @Test
       public void filpkart() {
	getDriver().get("https://www.flipkart.com");
}
    @Test
    public void outlook() {
    	getDriver().get("https://www.outlook.com");
    }
    
   @Test
   public void prime() {
	   getDriver().get("https://www.amazon.com");
   }
 }

