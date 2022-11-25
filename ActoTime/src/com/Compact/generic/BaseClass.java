package com.Compact.generic;




import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.beust.jcommander.Parameter;

public class BaseClass{
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/geckodriver.exe");
	}
	
	public  WebDriver driver;

	
	@Parameter(names="browser")
	@BeforeTest
	public void openBrowser(){                                                    
Reporter.log("openBrowser",true);

if("browser".equals("chrome")) {
driver=new ChromeDriver();
}
if("browser".equals("firefox")) {
	driver=new FirefoxDriver();
}
driver.get("https://demo.actitime.com/login.do");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
	
	@AfterTest
	public void closeBrowser(){
Reporter.log("closeBrowser",true);
driver.close();
}
	
	@BeforeMethod
	public void login() throws IOException, InterruptedException{
Reporter.log("login",true);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
FileInputStream fis= new FileInputStream("./Data/handlefile.property");
Properties p= new Properties();
p.load(fis);
 driver.get( p.getProperty("url"));
 Thread.sleep(3000);
 driver.findElement(By.id("username")).sendKeys(p.getProperty("un"));
 driver.findElement(By.name("pwd")).sendKeys(p.getProperty("pw"));
 Thread.sleep(3000);
 driver.findElement(By.xpath("//div[text()='Login ']")).click();

}
	
	@AfterMethod
	public void logout(){
Reporter.log("logout",true);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.id("logoutLink")).click();

}
}
