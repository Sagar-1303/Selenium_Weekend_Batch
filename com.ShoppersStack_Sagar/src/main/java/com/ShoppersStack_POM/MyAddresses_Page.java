package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddresses_Page {
	public MyAddresses_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Add Address']")
	private WebElement AddAddressBtn;
	
	@FindBy(xpath="(//span[contains(@class,'MuiButton-startIcon MuiButton')])[2]")
	private WebElement DeleteBtn;
	
	@FindBy(xpath="(//button[text()='Yes'])[1]")
	private WebElement YesBtn;
	
	@FindBy(xpath="//button[@aria-label='close']")
	private WebElement closeBtn;
	

	public WebElement getCloseBtn() {
		return closeBtn;
	}

	public WebElement getAddAddressBtn() {
		return AddAddressBtn;
	}

	public WebElement getDeleteBtn() {
		return DeleteBtn;
	}

	public WebElement getYesBtn() {
		return YesBtn;
	}
	
	

}
