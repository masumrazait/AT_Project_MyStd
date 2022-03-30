package com.myStudent.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(id="email")
	@CacheLookup
	WebElement txtUserID;
	
	@FindBy(id="password")
	@CacheLookup
	WebElement txtUPassword;
	
	@FindBy(xpath="//input[@name='submit'][@type='submit']")
	@CacheLookup
	WebElement btnLogin;	
	
	public void setUserName(String uname)
	{
		txtUserID.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtUPassword.sendKeys(pwd);
	}

	public void clickSubmit()
	{
		btnLogin.click();
	}		
}









