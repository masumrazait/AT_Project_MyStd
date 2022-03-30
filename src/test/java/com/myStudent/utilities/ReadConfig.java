package com.myStudent.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig() {
		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}

	// For Browser
	public String getChromePath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}

	public String getIEPath() {
		String iepath = pro.getProperty("iepath");
		return iepath;
	}

	public String getFirefoxPath() {
		String firefoxpath = pro.getProperty("firefoxpath");
		return firefoxpath;
	}

	public String getApplicationURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}

	// For Insurance Register Page
	public String getFirstName() {
		String userFirstName = pro.getProperty("firstname");
		return userFirstName;
	}

	public String getSurname() {
		String surname = pro.getProperty("lastname");
		return surname;
	}

	public String getPhoneNumber() {
		String phone = pro.getProperty("phone");
		return phone;
	}
	
	public String getAddressStreet() {
		String AddressStreet = pro.getProperty("street");
		return AddressStreet;
	}
	
	public String getCityName() {
		String City = pro.getProperty("city");
		return City;
	}
	
	public String getCountyName() {
		String County = pro.getProperty("county");
		return County;
	}
	
	public String getPostcode() {
		String Postcode = pro.getProperty("post_code");
		return Postcode;
	}
	
	public String getEmailId() {
		String Email = pro.getProperty("email");
		return Email;
	}
	
	public String getPassword() {
		String Password = pro.getProperty("password");
		return Password;
	}
	
	public String getCPassword() {
		String CPassword = pro.getProperty("c_password");
		return CPassword;
	}
	
	//For Login 
	public String getUserId() {
		String userId = pro.getProperty("username");
		return userId;
	}
	
	public String getUserPassword() {
		String uPassword = pro.getProperty("upassword");
		return uPassword;
	}
	

}
