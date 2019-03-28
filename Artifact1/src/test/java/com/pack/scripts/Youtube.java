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

	@BeforeClass
	public void setup() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		
	}
	
	@Test
	public void testvideo() throws InterruptedException, FindFailed
	{
        Screen s=new Screen();
		driver.get("https://events.economist.com/become-a-sponsor/");
		/*WebElement ele=driver.findElement(By.xpath("//*[@title='Play Video']"));
		//Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();*/
        //Thread.sleep(50000);
		String filepath = "C:\\Users\\prdxn71\\eclipse-workspace\\Test\\Artifact1\\images\\";
		Pattern Play = new Pattern(filepath + "PlayButton.PNG");
        
        //ImagePath.setBundlePath("fullpath");
		//Pattern Play = new Pattern("PlayButton.png");
		Thread.sleep(50000);
		s.find(Play); //identify pause button
		s.click(Play); //click pause button
		System.out.println("pause button clicked");
		System.out.println(ImagePath.getBundlePath());
		s.find(Play); //identify play button
		s.click(Play); //click play button
		
		
		//*[@id=\"vjs_video_3\"]/div[5]"
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
}

