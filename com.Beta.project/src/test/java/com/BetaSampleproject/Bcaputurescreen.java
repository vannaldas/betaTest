package com.BetaSampleproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bcaputurescreen {
public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		/*System.setProperty("webdriver.chrome.driver","./BAppMydrivers/chromedriver.exe");
		   driver = new ChromeDriver();
		  
		   
		   driver.get("https://www.mycontactform.com/");
		   driver.manage().window().maximize();
		   takeScreenshot("mycontactform_loginpage");*/
		
	}
	public static void takeScreenshot(WebDriver driver,String filename) throws IOException {
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("./BetaTestReports/"+filename+".png"));
		
	}

}
