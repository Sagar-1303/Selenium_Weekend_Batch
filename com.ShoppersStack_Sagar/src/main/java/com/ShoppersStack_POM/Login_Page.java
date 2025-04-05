package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	private WebElement EmailTextField;
	
	@FindBy(id="Password")
	private WebElement PasswordFiled;
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement LoginBtn;

	public WebElement getEmailTextField() {
		return EmailTextField;
	}

	public WebElement getPasswordFiled() {
		return PasswordFiled;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	
	

}
