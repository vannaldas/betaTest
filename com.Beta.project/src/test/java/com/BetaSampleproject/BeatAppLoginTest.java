package com.BetaSampleproject;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeatAppLoginTest 
{
	public static BetaAppServices appservices;
	
	
	
	

		
		
		
		
	
	
	

	
	@BeforeSuite
	public void setupsuite() {
		appservices=new BetaAppServices();
		
		
	}
	@BeforeTest
	public void browserlaunch() throws Exception {
		
		
		appservices.launchbrowser();
		Thread.sleep(3000);
		
		
		
	}
    
    @Test
    public void verifylogin() throws Exception
    {
appservices.clickloginlink();
		
		Thread.sleep(3000);
		appservices.clicksignuplink();
		
		Thread.sleep(3000);
    	
    	
		 
    }
    
    @AfterTest
    public void browserclose() {
    	appservices.closebrowser();
    	
    }
}
