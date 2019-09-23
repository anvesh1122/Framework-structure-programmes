package ObjectRepository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Apps.constantsPackage.ORpropertiespaths;
import com.BasePackage.BaseEngine1;

public class ORPropertiesWithBaseEngine extends BaseEngine1 {

	
	@Test
	public void GmailTest() throws IOException {
		
		Properties obj=new Properties();
		FileInputStream objfile =new FileInputStream(ORpropertiespaths.filepath);
		obj.load(objfile);
		
		Properties obj1=new Properties();
		FileInputStream obj1file =new FileInputStream(ORpropertiespaths.filepath1);
		obj1.load(obj1file);
		
		
		/*
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Com.FrameWorkTestDemo\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		*/
		
		//From  ConfigurationURL.file
		String Url=obj1.getProperty("URL");
		System.out.println("passing URL");
		
		String UN=obj1.getProperty("User");
		System.out.println("taken UserName");
		
		String PASS=obj1.getProperty("pass");
		System.out.println("taken Password");
		
		
		//From OR_Properties.locators.File
		String Username=obj.getProperty("user_id");
		System.out.println(Username);
		String next=obj.getProperty("user_nxt");
		System.out.println(next);
		String password=obj.getProperty("pass_wrd");
		System.out.println(password);
		String nextbtn=obj.getProperty("pass_nxt");
		System.out.println(nextbtn);
		String xpath=obj.getProperty("x_path");
		System.out.println(xpath);
		
		getDriver().get(Url);
		getDriver().findElement(By.id(Username)).sendKeys(UN);
		System.out.println("1");
		getDriver().findElement(By.id(next)).click();
		System.out.println("2");
	    getDriver().findElement(By.name(password)).sendKeys(PASS);
	    System.out.println("3");
		getDriver().findElement(By.id("nextbtn")).click();
		System.out.println("4");
		//driver.findElement(By.className("view")).click();
		
	
		
	}
	
		

	}


