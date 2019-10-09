package com.walmart.qa.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.walmart.qa.bases.TestBase;
import com.walmart.qa.pages.CreateAccountPage;
import com.walmart.qa.utils.TestUtils;

public class CreateAccountPageTest extends TestBase{

	CreateAccountPage  createAccountPage;
	String SheetName = "wb11";
	public CreateAccountPageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		Intialization();
		createAccountPage = new CreateAccountPage();
		
	}	
	
	@DataProvider
	public Object[][] getUserData(){
		Object[][] data = TestUtils.getTestData(SheetName);
		return data;
		
	}
	
	
	@Test(priority = 1, dataProvider = "getUserData")
	public void createAccount(String FirstName,String LastName, String Email, String pass, String copass) {
		createAccountPage.createAccountInput(FirstName,LastName,Email,pass,copass);
		createAccountPage.create_Account();
	
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
