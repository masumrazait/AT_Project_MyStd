package com.myStudent.testCases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.myStudent.pageObjects.LoginPage;


public class TC_LoginTest extends BaseClass
{

	@Test
	public void loginTest() throws IOException 
	{
			
		logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(readconfig.getUserId());
		logger.info("Entered username");
		
		lp.setPassword(readconfig.getUserPassword());
		logger.info("Entered password");
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Insurance Broker System - Login"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
	}
}
