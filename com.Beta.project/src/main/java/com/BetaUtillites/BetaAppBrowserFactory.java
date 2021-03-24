package com.BetaUtillites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BetaAppBrowserFactory 
{
	public static WebDriver driver;
	 public static Betaconfigreaderclass reader;
	 
	  
	  public static  void InvokeBrowser(String browsername,String appurl) {
		  
		 
		  reader=new Betaconfigreaderclass();
		  
		  if(browsername.equals("chrome")) {
				
				
				System.setProperty(reader.getchromesetup(),reader.getchromepath());
				driver=new ChromeDriver();
		    	
				}
				else if(browsername.equals("Firefox")){
					System.setProperty("webdriver.gecko.driver", "./BAppMydrivers/geckodriver.exe");
					driver=new ChromeDriver();
					
				}
				else if(browsername.equals("edge")){
					System.setProperty("webdriver.edge.driver", "./BAppMydrivers/msedgedriver.exe");
					driver=new ChromeDriver();
					
				}

		  driver.get(appurl);
	    	
		  driver.manage().window().maximize();
			
				
	  }
	  
	  public void closebrowser() {
		  driver.close();
	  }
	
	
}
