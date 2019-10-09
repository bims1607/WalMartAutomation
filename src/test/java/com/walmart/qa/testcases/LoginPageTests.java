package com.walmart.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.bases.TestBase;
import com.walmart.qa.pages.LoginPage;

public class LoginPageTests extends TestBase {
	
	LoginPage loginPage;
	public LoginPageTests() {
	super();
	}
	
	@BeforeMethod
	public void setUp() {
		Intialization();
		loginPage = new LoginPage();
	}
	
	@Test
	public void LoginintoWalmart() {
		loginPage.loginforSearch("Bimal.suthar1607@gmail.com", "1607@Bims");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
