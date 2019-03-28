package com.pack.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
* @Method: Show Hide Map
* @Description: Verifies if REFID should is appended to all URLs of a website
* @author: Manali Kamble
*/
public class ShowHideMap {
	WebDriver driver;

	@BeforeClass
	public void setup() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		
	}
	
	@Test
	public void ShowHideMapTest() throws InterruptedException
	{
		driver.get("https://events.economist.com/events-conferences/emea/general-counsel-2018/#venue");
		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"map-hide-show\"]"))).click();
	
		
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver,50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[starts-with(@id,'em-location-map')]/div/div/div[1]/div[3]")));
			
			/*
			 
			 USed dynamic xpath in above statement as id attribute in map's xapth is dynamically changing.As shown in below xpaths.
			//*[@id="em-location-map-0f0e0"]/div/div/div[1]/div[3]
			//*[@id="em-location-map-cf0i0"]/div/div/div[1]/div[3]
			 
			 */
			 
			System.out.println("Map is displayed");
			System.out.println("Test Case:Show Map- Pass");

		}
		catch(NoSuchElementException E)
		{
			System.out.println("Map does not appear");
			
		}
		
		
		driver.manage().window().maximize();
		//try scroll to element
		WebDriverWait wait2 = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"map-hide-show\"]"))).click();
		try
		{
			
			WebDriverWait wait1 = new WebDriverWait(driver,50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[starts-with(@id,'em-location-map')]/div/div/div[1]/div[3]")));
		}
		catch(NoSuchElementException E)
		{
			System.out.println("Map does not appear");
			System.out.println("Test Case:Hide Map- Pass");
		}
		
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
}
