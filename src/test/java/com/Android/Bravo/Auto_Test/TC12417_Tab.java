package com.Android.Bravo.Auto_Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;

import io.appium.java_client.android.AndroidDriver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

@SuppressWarnings("unused")
public class TC12417_Tab extends ParentTest{

  @Test (groups = {"Full"})
  public void Tab() throws InterruptedException, IOException {
	  test = extent4.startTest("First Test", "HOME page verification");
	  Thread.sleep(2000l);
	  driver.findElement(By.name("Dismiss")).click();
		Thread.sleep(2000l);
		try{
			driver.findElement(By.id("com.nbcu.tve.client.bravo:id/image_provider_logo"));
			test.log(LogStatus.INFO, "Provider logo verify ");
			driver.findElement(By.id("com.nbcu.tve.client.bravo:id/nav_button"));
			test.log(LogStatus.INFO, "Navigation button verify");
			driver.findElement(By.id("com.nbcu.tve.client.bravo:id/usa"));
			test.log(LogStatus.INFO, "App logo verify");
			driver.findElement(By.name("LATEST EPISODES"));
			test.log(LogStatus.INFO, "Episode button present");
			driver.findElement(By.name("FEATURED SHOWS"));
			test.log(LogStatus.INFO, "Featured shows button present");
			test.log(LogStatus.PASS, "Home page VERIFIED");
		}catch(Exception e){
			test.log(LogStatus.FAIL, "Home page NOT VERIFIED");
			ScreenShot();
			Assert.assertTrue(false, "Home page not verified");
			
		}
		menu();
		Thread.sleep(2000l); 
	      
	    	driver.findElement(By.name("SHOWS")).click();
	  	
	  	try{
	  		driver.findElement(By.id("com.nbcu.tve.client.bravo:id/image_provider_logo"));
	  		test.log(LogStatus.INFO, "Provider logo verify ");
	  		driver.findElement(By.id("com.nbcu.tve.client.bravo:id/nav_button"));
	  		test.log(LogStatus.INFO, "Navigation button verify");
	  		driver.findElement(By.id("com.nbcu.tve.client.bravo:id/usa"));
	  		test.log(LogStatus.INFO, "App logo verify");
	  		driver.findElement(By.id("com.nbcu.tve.client.bravo:id/show_image"));
	  		driver.findElement(By.name("SHOWS"));
	  		driver.findElement(By.name("ACTION"));
	  		driver.findElement(By.name("ALL"));
	  		driver.findElement(By.name("CLASSIC"));
	  		driver.findElement(By.name("CURRENT"));
	  		test.log(LogStatus.PASS, "Show page VERIFIED");
	  	}catch(Exception e){
	  		test.log(LogStatus.FAIL, "Show page NOT VERIFIED");
	  		ScreenShot();
			Assert.assertTrue(false, "Show page not verified");
	  	}
	  	Thread.sleep(2000l);
	  	menu();
	
	driver.findElement(By.name("WATCHLIST")).click();
		
		try{
			driver.findElement(By.id("com.nbcu.tve.client.bravo:id/image_provider_logo"));
			driver.findElement(By.id("com.nbcu.tve.client.bravo:id/nav_button"));
			driver.findElement(By.id("com.nbcu.tve.client.bravo:id/usa"));
			driver.findElement(By.name("WATCHLIST"));
			driver.findElement(By.name("YOUR WATCHLIST IS EMPTY"));
			driver.findElement(By.name("BROWSE SHOWS"));
			driver.findElement(By.name("ADD TO WATCHLIST"));
			
			test.log(LogStatus.PASS, "Watchlist page VERIFIED");
		}catch(Exception e){
			test.log(LogStatus.FAIL, "Watchlist page NOT VERIFIED");
			ScreenShot();
			Assert.assertTrue(false, "Watchlist not verified");
		}
		Thread.sleep(2000l);
		menu();
		
		driver.findElement(By.name("SEARCH")).click();
		try{
			driver.findElement(By.id("com.nbcu.tve.client.bravo:id/image_provider_logo"));
			driver.findElement(By.id("com.nbcu.tve.client.bravo:id/nav_button"));
			driver.findElement(By.id("com.nbcu.tve.client.bravo:id/usa"));
			driver.findElement(By.id("com.nbcu.tve.client.bravo:id/search_view"));
			driver.findElement(By.id("com.nbcu.tve.client.bravo:id/clicklayout_voice_search"));
			driver.findElement(By.id("com.nbcu.tve.client.bravo:id/search_results_recycler_view"));
			driver.findElement(By.name("SEARCH"));
			
			test.log(LogStatus.PASS, "Search page VERIFIED");
		}catch(Exception e){
			test.log(LogStatus.FAIL, "Search page NOT VERIFIED");
			ScreenShot();
			Assert.assertTrue(false, "Search not verified");
		}
		Thread.sleep(2000l);
		menu();

		driver.findElement(By.name("SETTINGS")).click();
		try{
			driver.findElement(By.id("com.nbcu.tve.client.bravo:id/image_provider_logo"));
			driver.findElement(By.id("com.nbcu.tve.client.bravo:id/nav_button"));
			driver.findElement(By.id("com.nbcu.tve.client.bravo:id/usa"));
			driver.findElement(By.id("com.nbcu.tve.client.bravo:id/settings_html_text"));
			driver.findElement(By.name("SETTINGS"));
			driver.findElement(By.name("TERMS OF USE"));
			driver.findElement(By.name("PRIVACY POLICY"));
			driver.findElement(By.name("ABOUT"));
		
			test.log(LogStatus.PASS, "Settings page VERIFIED");
		}catch(Exception e){
			test.log(LogStatus.FAIL, "Settings page NOT VERIFIED");
			ScreenShot();
			Assert.assertTrue(false, "Settings not verified");
		}
		extent4.flush();
  }
  
  
  public void menu(){
		WebElement Menu4=driver.findElement(By.id("com.nbcu.tve.client.bravo:id/nav_button"));
		Menu4.click();
	}
	public void ScreenShot() throws IOException{
		File srcFile = driver.getScreenshotAs(OutputType.FILE);
		String filename = UUID.randomUUID().toString();
		File destFile = new File ("/Users/pvaland/Documents/luna/USA_DPIM_Project/test-output/Screenshots/home" + filename + ".jpg");
		FileUtils.copyFile(srcFile, destFile);
		String a= test.addScreenCapture("/Users/pvaland/Documents/luna/USA_DPIM_Project/test-output/Screenshots/home" + filename + ".jpg");
		test.log(LogStatus.INFO, "dfasdfas", a);
	}
}
