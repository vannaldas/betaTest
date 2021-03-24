package com.BetaSampleproject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.BetaUtillites.BetaAppBrowserFactory;
import com.BetaUtillites.BetaCommonUtilites;
import com.BetaUtillites.Betaconfigreaderclass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BetaAppServices extends BetaAppBrowserFactory  {
	public Betaconfigreaderclass reader;
	//public static WebDriver driver;
public static Betacapturescreenshot screen;
	
	public static ExtentReports extent;
	public static ExtentTest test;



	public BetaAppServices launchbrowser() {
		
		
		BetaAppBrowserFactory.InvokeBrowser("chrome","http://beta.bookofpoem.com/");
		
		
		return this;
		
	}
	
	public BetaAppServices clickloginlink()  {
		reader=new Betaconfigreaderclass();
		screen=new Betacapturescreenshot();
		extent = new ExtentReports("./BetaTestReports/extentreport.html");
		test = extent.startTest("logintest");
		try {
		BetaCommonUtilites.clickweblink("xpath",reader.getloginlink(),driver);
		test.log(LogStatus.INFO, "Click login link");
		
			screen.capturescreen(driver, "Click login link");
			extent.flush();
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
		return this;
		
	}
	public BetaAppServices clicksignuplink() {
		BetaCommonUtilites.clickweblink("xpath",reader.getsignuplink(),driver);
		return this;
		
	}
	public BetaAppServices logindatafield()  {
		BetaCommonUtilites.logindatafield("name",reader.getusername(),reader.getusname1element(),driver);
	
		return this;
		
	}
	
	public BetaAppServices logindatafield2() {
		BetaCommonUtilites.logindatafield("name",reader.getpasswordname(),reader.getpname1element(),driver);
		
		return this;
		
	}
	public BetaAppServices loginbutton() {
		BetaCommonUtilites.loginbuttonfield("name",reader.getloginbutton(),driver);
		
		return this;
		
	}
	public BetaAppServices logindatafield3() {
		BetaCommonUtilites.logindatafield("name",reader.getusername(),reader.getusnameelement(),driver);
		return this;
		
	}
	public BetaAppServices logout() {
		BetaCommonUtilites.loginbuttonfield("xpath",reader.logoutelement(),driver);
		return this;
		
	}
	
	
	public BetaAppServices browserclose() {
		closebrowser();
		
		return this;
		
	}
 
	

}
