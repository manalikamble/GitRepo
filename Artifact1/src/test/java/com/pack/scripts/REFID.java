package com.pack.scripts;


import java.util.List;

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
* @Method: REFID
* @Description: Verifies if REFID should is appended to all URLs of a website
* @author: Manali Kamble
*/
public class REFID {
	WebDriver driver;

	@BeforeClass
	public void setup() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		
	}
	
	@Test
	public void REFIDCheck() throws InterruptedException
	{
		driver.get("https://events.economist.com/?RefID=1234");
		/* List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		 
		 String[] linkTexts = new String[linkElements.size()];
		 int i = 0;	
		 for (WebElement e : linkElements) 
		 {							
				linkTexts[i] = e.getText();							
				i++;	
		 }		
		 
		 linkElements.contains("?RefID=1234");
		 System.out.println("Pass");*/
		 
		 
		 
		 try {
			    List<WebElement> no = driver.findElements(By.tagName("a"));
			    int nooflinks = no.size(); 
			    System.out.println(nooflinks);
			    for (WebElement pagelink : no)
			         {
			          String linktext = pagelink.getText();
			          String link = pagelink.getAttribute("href"); 
			          System.out.println(linktext+" ->");
			          System.out.println(link);
			          System.out.println("-----------Pass");
			          }
			   }catch (Exception e){
			             System.out.println("error "+e);
			         }
		
	}
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	

}
