package com.ShoppersStack_Sagar;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import com.ShoppersStack_GenericUtility.Base_test;
import com.ShoppersStack_POM.MyAddresses_Page;
import com.ShoppersStack_POM.MyProfile_Page;

public class TC_002_Verify_user_is_able_to_delete_address_or_not_Test extends Base_test {
	@Test
public void deleteAddress() throws EncryptedDocumentException, IOException, InterruptedException {
		
		homePage.getAccountSettingBtn().click();
		homePage.getMyProfileBtn().click();	
		
		MyProfile_Page myprofilePage=new MyProfile_Page(driver);
		myprofilePage.getMyAddressBtn().click();
		
		Thread.sleep(2000);
		
		MyAddresses_Page myAddresses_Page=new MyAddresses_Page(driver);
		myAddresses_Page.getDeleteBtn().click();
		Thread.sleep(2000);
		myAddresses_Page.getYesBtn().click();

		wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
		webdriverUtility.getWebPageScreenShot(driver);
		
		
	}
}
