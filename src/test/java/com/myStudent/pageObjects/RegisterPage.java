package com.myStudent.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

	WebDriver ldriver;

	public RegisterPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	
	@FindBy(className="btn btn-default")
	@CacheLookup
	WebElement btnRegster;
	
	@FindBy(id = "user_title")
	WebElement dropdownList;

	@FindBy(id = "user_firstname")
	@CacheLookup
	WebElement txtUserFirstName;

	@FindBy(id = "user_surname")
	@CacheLookup
	WebElement txtSurname;

	@FindBy(id = "user_phone")
	@CacheLookup
	WebElement txtPhone;

	@FindBy(id = "user_dateofbirth_1i")
	@CacheLookup
	WebElement yearDropdownList;

	@FindBy(id = "user_dateofbirth_2i")
	@CacheLookup
	WebElement monthsDropdownList;

	@FindBy(id = "user_dateofbirth_3i")
	@CacheLookup
	WebElement daysDropdownList;

	@FindBy(xpath = "//input[@id='licencetype_f'][@value='Provisional']")
	@CacheLookup
	WebElement provisional;
	
	@FindBy(id = "user_licenceperiod")
	@CacheLookup
	WebElement LicencePeriodDropdownList;
	
	@FindBy(id = "user_occupation_id")
	@CacheLookup
	WebElement occupationDropDown;

	@FindBy(id = "user_address_attributes_street")
	@CacheLookup
	WebElement txtAddressStreet;

	@FindBy(id = "user_address_attributes_city")
	@CacheLookup
	WebElement txtUserCity;

	@FindBy(id = "user_address_attributes_county")
	@CacheLookup
	WebElement txtUserCounty;

	@FindBy(id = "user_address_attributes_postcode")
	@CacheLookup
	WebElement txtUserPostcode;

	@FindBy(id = "user_user_detail_attributes_email")
	@CacheLookup
	WebElement txtUserEmail;

	@FindBy(id = "user_user_detail_attributes_password")
	@CacheLookup
	WebElement txtUserPassword;

	@FindBy(id = "user_user_detail_attributes_password_confirmation")
	@CacheLookup
	WebElement txtUserCPassword;

	@FindBy(id = "resetform")
	@CacheLookup
	WebElement btnReset;	
	
	@FindBy(xpath = "//input[@name='submit'][@type='submit']")
	@CacheLookup
	WebElement btnCreate;
	
	
	// Action Method	
	public void clickRegister() {
		btnRegster.click();
	}
	
	public Select getSelectOptions() {
		return new Select(dropdownList);
	}

	public void set_user_firstName(String userFirstName) {
		txtUserFirstName.sendKeys(userFirstName);
	}

	public void setSurname(String surname) {
		txtSurname.sendKeys(surname);
	}

	public void setPhoneNumeber(String phone) {
		txtPhone.sendKeys(phone);
	}

	public Select getSelectYearOptions() {
		return new Select(yearDropdownList);
	}

	public Select getSelectMonthsOptions() {
		return new Select(monthsDropdownList);
	}

	public Select getSelectDaysOptions() {
		return new Select(daysDropdownList);
	}

	public void clickProvisionalRatioBtn() {
		provisional.click();
	}
	
	public Select getSelectLicencePeriodOptions() {
		return new Select(LicencePeriodDropdownList);
	}
	
	public Select getSelectOccupationOptions() {
		return new Select(occupationDropDown);
	}
	
	public void set_user_AddressStreet(String userFirstName) {
		txtAddressStreet.sendKeys(userFirstName);
	}
	
	public void set_user_City(String city) {
		txtUserCity.sendKeys(city);
	}
	
	public void set_user_County(String County) {
		txtUserCounty.sendKeys(County);
	}
	
	public void set_user_Postcode(String Postcode) {
		txtUserPostcode.sendKeys(Postcode);
	}
	
	public void set_user_Email(String Email) {
		txtUserEmail.sendKeys(Email);
	}
	
	public void set_user_Password(String Password) {
		txtUserPassword.sendKeys(Password);
	}	
	
	public void set_user_CPassword(String CPassword) {
		txtUserCPassword.sendKeys(CPassword);
	}
	public void clickReset() {
		btnReset.click();
	}
	
	public void clickCreate() {
		btnCreate.click();
	}
	

}
