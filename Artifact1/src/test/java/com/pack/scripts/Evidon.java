package com.pack.scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
* @Method: Evidon
* @Description: Click on Allow button of evidon and ensure it 
                does not reappear after navigating to another page.
* @author: Manali Kamble
*/


public class Evidon {
	WebDriver driver;

	@BeforeClass
	public void setup() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		
	}
	
	@Test
	public void testevidon() throws InterruptedException
	{
		driver.get("https://events.economist.com");
		System.out.println("Navigated to https://events.economist.com ");
		WebElement allow=driver.findElement(By.xpath("//*[@id=\"_evidon-accept-button\"]"));
		allow.click();
		System.out.println("Clicked on Allow");
		System.out.println("Evidon Banner disappeared after clicking on Allow");
		driver.navigate().to("https://events.economist.com/upcoming-events/");
		System.out.println("Navigated to Upcoming Events Page");
		
		try
		{
		WebElement popup=driver.findElement(By.xpath("*[@id=\"_evidon_banner\"]"));
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("*[@id=\"_evidon_banner\"]")));
	    System.out.println("Verifying if Evidon appears");
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Evidon does not appear after navigating to upcoming events page");
			System.out.println("Test Case Pass");
		}
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
}
