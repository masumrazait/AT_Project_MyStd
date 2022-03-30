package com.myStudent.testCases;


import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myStudent.pageObjects.RegisterPage;


public class TC_RegisterTest extends BaseClass
{

	@Test
	public void RegisterTest() throws IOException, InterruptedException 
	{
			
		logger.info("URL is opened");
		RegisterPage rp=new RegisterPage(driver);
		
		rp.clickCreate();
		
		rp.getSelectOptions().selectByIndex(6);
		logger.info("USer Selected Tittle from Dropdown");
		
		rp.set_user_firstName(readconfig.getFirstName());
		logger.info("Entered First Name");
		
		rp.setSurname(readconfig.getSurname());
		logger.info("Entered Surname");
		
		rp.setPhoneNumeber(readconfig.getPhoneNumber());
		logger.info("Entered Phone Number");
		
		rp.getSelectYearOptions().selectByValue("1970");
		logger.info("USer Selected Years from Dropdown");
		
		rp.getSelectMonthsOptions().selectByIndex(4);
		logger.info("USer Selected Months from Dropdown");
		
		rp.getSelectDaysOptions().selectByValue("6");
		logger.info("USer Selected DAte from Dropdown");
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,3000)");
		
		rp.clickProvisionalRatioBtn();
		logger.info("USer Selected Provision");
		
		rp.getSelectLicencePeriodOptions().selectByIndex(6);
		logger.info("USer Selected Licence Period ");
		
		rp.getSelectOccupationOptions().selectByIndex(12);
		logger.info("USer Selected Occupation Engineer");
		
		rp.set_user_AddressStreet(readconfig.getAddressStreet());
		logger.info("Entered Address Street");

		rp.set_user_City(readconfig.getCityName());
		logger.info("Entered City Name");
		
		rp.set_user_County(readconfig.getCountyName());
		logger.info("Entered Country Name");
		
		rp.set_user_Postcode(readconfig.getPostcode());
		logger.info("Entered Post code");
		
		rp.set_user_Email(readconfig.getEmailId());
		logger.info("Entered Email ID");
		
		rp.set_user_Password(readconfig.getPassword());
		logger.info("Entered Password ");
		
		rp.set_user_CPassword(readconfig.getCPassword());
		logger.info("Entered Confirm Password ");
		
		Thread.sleep(3000);
		
		rp.clickCreate();
		logger.info("User Create Account");
		
		if(driver.getTitle().equals("Insurance Broker System - Register"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"RegisterTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
	}
}
