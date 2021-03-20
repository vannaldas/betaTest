package com.BetaSampleproject;

import com.BetaUtillites.BetaAppBrowserFactory;
import com.BetaUtillites.BetaCommonUtilites;
import com.BetaUtillites.Betaconfigreaderclass;

public class BetaAppServices extends BetaAppBrowserFactory  {
	public Betaconfigreaderclass reader;
	
	
	
	public BetaAppServices launchbrowser() {
		reader=new Betaconfigreaderclass();
		
		BetaAppBrowserFactory.InvokeBrowser("chrome","http://beta.bookofpoem.com/");
		
		
		return this;
		
	}
	
	public BetaAppServices clickloginlink()  {
		
		BetaCommonUtilites.clickweblink("xpath",reader.getloginlink(), driver);
		
		
		return this;
		
	}
	public BetaAppServices clicksignuplink() {
		BetaCommonUtilites.clickweblink("xpath",reader.getsignuplink(), driver);
		return this;
		
	}
	public BetaAppServices logindatafield()  {
		BetaCommonUtilites.logindatafield("name",reader.getusername(),reader.getusname1element(), driver);
	
		return this;
		
	}
	
	public BetaAppServices logindatafield2() {
		BetaCommonUtilites.logindatafield("name",reader.getpasswordname(),reader.getpname1element(), driver);
		
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
