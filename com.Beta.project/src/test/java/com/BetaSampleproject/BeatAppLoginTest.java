package com.BetaSampleproject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BeatAppLoginTest 
{
	public static BetaAppServices appservices;
	public static Betacapturescreenshot screen;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static WebDriver driver;

	
	@BeforeSuite
	public void setupsuite() {
		appservices=new BetaAppServices();
		screen=new Betacapturescreenshot();
		extent = new ExtentReports("./BetaTestReports/extentreport.html");
		
	}
	@BeforeTest
	public void browserlaunch() throws Exception {
		
		
		
		appservices.launchbrowser();
		Thread.sleep(3000);
		
		
	}
    
    @Test
    public void shouldAnswerWithTrue() throws Exception
    {
    	screen=new Betacapturescreenshot();
    	test = extent.startTest("logintest");
    	appservices.clickloginlink();
		
    	test.log(LogStatus.INFO, "Click login link");
    	//test.addScreenCapture(screen.capturescreen(driver, "Click login link"));
		//test.addScreenCapture(screen.capturescreen(driver, "Click login link"));
		appservices.clicksignuplink();
		test.log(LogStatus.INFO, "Click signup link");
		Thread.sleep(3000);
    }
    
    @AfterTest
    public void browserclose() {
    	appservices.closebrowser();
    	extent.flush();
    }
}
