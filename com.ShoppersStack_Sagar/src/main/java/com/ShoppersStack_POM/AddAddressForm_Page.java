package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAddressForm_Page {
	
	public AddAddressForm_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="Office")
	private WebElement officeRB;
	
	@FindBy(id="Name")
	private WebElement NameTextField;
	
	@FindBy(id="House/Office Info")
	private WebElement HouseTextField;
	
	@FindBy(id="Street Info")
	private WebElement StreetTextField;

	@FindBy(id="Landmark")
	private WebElement LandmarkTextFiled;
	
	@FindBy(id="Country")
	private WebElement countryDD;
	
	@FindBy(id="State")
	private WebElement StateDD;
	
	@FindBy(id="City")
	private WebElement CityDD;
	
	@FindBy(id="Pincode")
	private WebElement pincodetextField;
	
	@FindBy(id="Phone Number")
	private WebElement PhoneNumberTextField;
	
	@FindBy(id="addAddress")
	private WebElement addAddressBtn;

	public WebElement getOfficeRB() {
		return officeRB;
	}

	public WebElement getNameTextField() {
		return NameTextField;
	}

	public WebElement getHouseTextField() {
		return HouseTextField;
	}

	public WebElement getStreetTextField() {
		return StreetTextField;
	}

	public WebElement getLandmarkTextFiled() {
		return LandmarkTextFiled;
	}

	public WebElement getCountryDD() {
		return countryDD;
	}

	public WebElement getStateDD() {
		return StateDD;
	}

	public WebElement getCityDD() {
		return CityDD;
	}

	public WebElement getPincodetextField() {
		return pincodetextField;
	}

	public WebElement getPhoneNumberTextField() {
		return PhoneNumberTextField;
	}

	public WebElement getAddAddressBtn() {
		return addAddressBtn;
	}
	
	
	

}
