package com.walmart.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.bases.TestBase;
import com.walmart.qa.pages.CreditCardPage;
import com.walmart.qa.pages.LoginPage;
import com.walmart.qa.pages.MyAccountPage;
import com.walmart.qa.utils.TestUtils;

public class CreditCardPageTest extends TestBase{
	
	CreditCardPage creditCardPage;
	LoginPage loginPage;
	MyAccountPage myAccountPage;
	TestUtils testUtils;
	
	public CreditCardPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		Intialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
		myAccountPage = loginPage.loginforAccountSetting("Bimal.suthar1607@gmail.com", "1607@Bims");
		testUtils.ScrollDown();
		creditCardPage =myAccountPage.clickOnCreditCard();
		
		
	}
	@Test
	public void verifyTitleCredit() throws InterruptedException  {
		Thread.sleep(2000);
		Assert.assertEquals(creditCardPage.verifyCreditcardTitle(), "Credit Cards");
			}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
