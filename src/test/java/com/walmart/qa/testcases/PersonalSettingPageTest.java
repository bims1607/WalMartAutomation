package com.walmart.qa.testcases;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.walmart.qa.bases.TestBase;
import com.walmart.qa.pages.LoginPage;
import com.walmart.qa.pages.MyAccountPage;
import com.walmart.qa.pages.PersonalSettingPage;
import com.walmart.qa.utils.TestUtils;

public class PersonalSettingPageTest extends TestBase {

	
	LoginPage loginPage;
	MyAccountPage myAccountPage;
	PersonalSettingPage personalSettingPage;
	TestUtils  testUtils = new TestUtils();
	public PersonalSettingPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		Intialization();
		loginPage = new LoginPage();
		myAccountPage = loginPage.loginforAccountSetting("Bimal.suthar1607@gmail.com", "1607@Bims");
		
		testUtils.ScrollDown();
		personalSettingPage= myAccountPage.clickOnPersonalSetting();
		
		
	}
	@Test
	public void editPersonalInformation() {
		personalSettingPage.ClickonEditPersInfo();
		personalSettingPage.EditPersonalInfo("bim", "sut", "n6b3r7", "2269771540");
		testUtils.ScrollDown();
		personalSettingPage.clickOnSaveDetail();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
