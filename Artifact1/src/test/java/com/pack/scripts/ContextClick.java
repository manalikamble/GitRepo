package com.pack.scripts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {






 

	WebDriver driver;

	@BeforeClass
	public void setup()
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
		
	}
	
	@Test
	public void contextClick()
	{
		Actions ac=new Actions(driver);
		ac.contextClick().build().perform();

	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
}