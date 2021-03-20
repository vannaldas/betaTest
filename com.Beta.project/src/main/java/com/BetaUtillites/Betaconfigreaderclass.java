package com.BetaUtillites;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Betaconfigreaderclass {
	public static Properties prop;
	
	public Betaconfigreaderclass() {
		
	
		try {
			File src=new File("./BAppMyfiles/BTLogin.properties");
			//FileReader fis1 = new FileReader(src);
			
			FileInputStream fis=new FileInputStream(src);
			
			  prop =new Properties();
			//prop.load(fis1);
			prop.load(fis);
	
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
			
		}
		
	}
		public String getloginbutton() {
			return prop.getProperty("login");
			
		}
		public String getfirstname() {
			return prop.getProperty("fname");
			
		}
		public String getlastname() {
			return prop.getProperty("lname");
			
		}
		public String getusername() {
			return prop.getProperty("username");
			
			
		}
		public String getEmail() {
			return prop.getProperty("email");
			
		}
		public String getpasswordname() {
			return prop.getProperty("password");
			
		}
		public String getcpasswordelement() {
			return prop.getProperty("cpass");
			
		}
		public String getbrowserurl() {
			return prop.getProperty("browserurl");
			
		}
		public String getchromepath() {
			return prop.getProperty("CromeDriver");
			
			
		}
		public String getchromesetup() {
			return prop.getProperty("Chromesetup");
			
		}
		public String getfnameelement() {
			return prop.getProperty("firstname");
			
		}
		public String getlnameelement() {
			return prop.getProperty("lastname");
		}
		public String getusnameelement() {
			return prop.getProperty("Uname");
		}
		public String getusname1element() {
			return prop.getProperty("Uname1");
		}
		public String getemaielement() {
			return prop.getProperty("Em");
		}
		public String getpnameelement() {
			return prop.getProperty("pname");
			
		}
		public String getpname1element() {
			return prop.getProperty("pname1");
			
		}
		public String getcpnameelement() {
			return prop.getProperty("Cpname");
		}
		public String getbrowsername() {
			return prop.getProperty("browsername");
		}
		public String getloginlink() {
			return prop.getProperty("loginlink");
		}
		public String logoutelement() {
			return prop.getProperty("logout");
		}
		public String getsignuplink() {
			return prop.getProperty("signUp");
		}
	}



