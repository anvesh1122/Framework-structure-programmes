package ObjectRepository;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ORPropertieswithoutBaseEngine {

	public static void main(String[] args) throws IOException {
		Properties properties=new Properties();
		FileInputStream propertiesfile =new FileInputStream("D:\\workspace\\Com.FrameWorkTestDemo\\src\\ObjectRepository\\OR_Properties.locators.file");
		properties.load(propertiesfile);
		
		
		
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Com.FrameWorkTestDemo\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		String Url=properties.getProperty("URL");
		System.out.println(Url);
		String Username=properties.getProperty("user_id");
		System.out.println(Username);
		String next=properties.getProperty("user_nxt");
		System.out.println(next);
		String password=properties.getProperty("pass_wrd");
		System.out.println(password);
		String nextbtn=properties.getProperty("pass_nxt");
		System.out.println(nextbtn);
		String xpath=properties.getProperty("x_path");
		System.out.println(xpath);
		
		
		driver.get(Url);
		//driver.findElement(By.id("Username")).sendKeys("chilakaraju.anvesh7799@gmail.com");
	}
	

}
