package com.Android.Bravo.Auto_Test;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ParentTest {
	
	AppiumDriver driver;
	 public ExtentReports extent4;
	 public ExtentTest test;
  
  @BeforeClass
  public void beforeClass() throws MalformedURLException, InterruptedException {
	  DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME" , "Android");
		capabilities.setCapability("platformName" , "Android");
		capabilities.setCapability("VERSION" , "5.0.1");
		capabilities.setCapability("deviceName" , "45d30948");
		
		//Samsung Galaxy S6 edge+
		capabilities.setCapability("VERSION" , "5.1.1");
		capabilities.setCapability("deviceName" , "8431535038343654");
		
		capabilities.setCapability("appPackage" , "com.nbcu.tve.client.bravo");
		capabilities.setCapability("appActivity" , "com.nbcu.tve.client.activities.home.SplashScreenActivity");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		Thread.sleep(5000l);
      extent4 = new ExtentReports("directory/Report.html", true);
     
  }

}
