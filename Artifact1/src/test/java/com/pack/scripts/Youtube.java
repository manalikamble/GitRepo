package com.pack.scripts;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	import org.sikuli.script.FindFailed;
	import org.sikuli.script.ImagePath;
	import org.sikuli.script.Pattern;
	import org.sikuli.script.Screen;

	public class Youtube {
		WebDriver driver;

		@Test
		public void setup() throws InterruptedException
		{
			
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.quit();
			
			
		}
}
