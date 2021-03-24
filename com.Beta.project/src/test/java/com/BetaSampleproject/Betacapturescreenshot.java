package com.BetaSampleproject;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Betacapturescreenshot {
	//public static WebDriver driver;
	
	
	
	public  String capturescreen(WebDriver driver, String screenname) throws IOException {
		
		File file  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//File file  = element.getScreenshotAs(OutputType.FILE);
		String dateName=new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
		File dest = new File("./BetaTestReports/"+screenname+dateName+".png");
		String destpath=dest.getAbsolutePath();
		FileUtils.copyFile(file,dest);
		return destpath;
		
		
		
		
	}

}