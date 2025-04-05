package com.ShoppersStack_GenericUtility;

public interface FremworkConstants {
	Java_Utility javaUtility=new Java_Utility();
	
	final static String propertyFilePath="./src/test/resources/testData/Shoppers.properties";
	
	final static String excelFilePath="./src/test/resources/testData/AddressDetails.xlsx";
	
	final static String screenshotPath="./screenshot/"+javaUtility.getLocalDateAndTime()+".png";
	
	final static String reportsPath="./reports/"+javaUtility.getLocalDateAndTime()+".html";
	
	final static String chromeKey="webdriver.chrome.driver";
	
	final static String chromevalue="./src/main/resources/driver/chromedriver.exe";
}
