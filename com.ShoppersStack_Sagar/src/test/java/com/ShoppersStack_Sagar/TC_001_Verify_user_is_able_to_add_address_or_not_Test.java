package com.ShoppersStack_Sagar;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ShoppersStack_GenericUtility.Base_test;
import com.ShoppersStack_POM.AddAddressForm_Page;
import com.ShoppersStack_POM.MyAddresses_Page;
import com.ShoppersStack_POM.MyProfile_Page;

public class TC_001_Verify_user_is_able_to_add_address_or_not_Test extends Base_test {
	@Test
	public void addAddress() throws EncryptedDocumentException, IOException, InterruptedException {
		
		homePage.getAccountSettingBtn().click();
		homePage.getMyProfileBtn().click();
		
		MyProfile_Page myProfilePage=new MyProfile_Page(driver);
		myProfilePage.getMyAddressBtn().click();
		
		MyAddresses_Page myaddressesPage=new MyAddresses_Page(driver);
		Thread.sleep(2000);
		myaddressesPage.getAddAddressBtn().click();
		
		AddAddressForm_Page addressForm_Page =new AddAddressForm_Page(driver);
		addressForm_Page.getOfficeRB().click();
		addressForm_Page.getNameTextField().sendKeys(fileUtility.readDataFromExcelFile("sheet1", 1, 0));
		addressForm_Page.getHouseTextField().sendKeys(fileUtility.readDataFromExcelFile("sheet1", 1, 1));
		addressForm_Page.getStreetTextField().sendKeys(fileUtility.readDataFromExcelFile("sheet1", 1, 2));
		addressForm_Page.getLandmarkTextFiled().sendKeys(fileUtility.readDataFromExcelFile("sheet1", 1, 3));
		webdriverUtility.selectByValue(addressForm_Page.getCountryDD(),fileUtility.readDataFromPropertyFile("country"));
		webdriverUtility.selectByValue(addressForm_Page.getStateDD(),fileUtility.readDataFromPropertyFile("state"));
		webdriverUtility.selectByValue(addressForm_Page.getCityDD(),fileUtility.readDataFromPropertyFile("city"));
		
		addressForm_Page.getPincodetextField().sendKeys(fileUtility.readDataFromExcelFile("sheet1", 1, 4));
		addressForm_Page.getPhoneNumberTextField().sendKeys(fileUtility.readDataFromExcelFile("sheet1", 1, 5));
		
		addressForm_Page.getAddAddressBtn().click();
		
		myaddressesPage.getCloseBtn().click();
		
		
		webdriverUtility.getWebPageScreenShot(driver);
		
		
		
		
		
		
		
		
		
	}

}
