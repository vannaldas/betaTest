package com.BetaUtillites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BetaCommonUtilites extends BetaAppBrowserFactory  {
	
public static WebElement signuplink;
	
	public static void clickweblink(String Identifiedby,String locator,WebDriver drier) {
		
		
		/*switch(Identifiedby) {
		case "name":
			driver.findElement(By.name(locator)).click();
			break;
		case "id":
			driver.findElement(By.id(locator)).click();
			break;
		case "xpath":
			homelink=driver.findElement(By.xpath(locator));
			if(homelink.isEnabled()) {
				homelink.click();
				System.out.println("performed susessfully");
			}
			else {
				System.out.println("dose not performed");
			}
			break;
			default:
				break;
		}*/
		
		if( Identifiedby.equalsIgnoreCase("id")) {
			driver.findElement(By.id(locator)).click();
			
		}
		else if(Identifiedby.equalsIgnoreCase("name")) {
			driver.findElement(By.name(locator)).click();
		}
		else if(Identifiedby.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(locator)).click();
			/*if(signuplink.isEnabled()) {
				signuplink.click();
				System.out.println("performed susessfully");
			}
			else {
				System.out.println("dose not performed");
			}*/
		}
		else if(Identifiedby.equalsIgnoreCase("xpath")) {
			driver.findElement(By.cssSelector(locator)).click();
		}
	}
	
	public static void logindatafield(String Identifiedby,String locator,String username,WebDriver drier) {
		if( Identifiedby.equalsIgnoreCase("id")) {
			driver.findElement(By.id(locator)).sendKeys(username);
			
		}
		else if(Identifiedby.equalsIgnoreCase("name")) {
			driver.findElement(By.name(locator)).sendKeys(username);
		}
		else if(Identifiedby.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(locator)).sendKeys(username);
			
		}
		else if(Identifiedby.equalsIgnoreCase("xpath")) {
			driver.findElement(By.cssSelector(locator)).sendKeys(username);
		}
	}
	public static void loginbuttonfield(String Identifiedby,String locator,WebDriver drier) {
		
		if( Identifiedby.equalsIgnoreCase("id")) {
			driver.findElement(By.id(locator)).click();
		}
		else if(Identifiedby.equalsIgnoreCase("name")) {
			driver.findElement(By.name(locator)).click();
		}
		else if(Identifiedby.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(locator)).click();
			
		}
		else if(Identifiedby.equalsIgnoreCase("xpath")) {
			driver.findElement(By.cssSelector(locator)).click();
		}
	}

}
