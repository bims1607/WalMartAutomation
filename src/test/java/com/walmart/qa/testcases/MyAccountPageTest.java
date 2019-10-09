package com.walmart.qa.testcases;

import javax.swing.JScrollBar;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.bases.TestBase;
import com.walmart.qa.pages.CreditCardPage;
import com.walmart.qa.pages.LoginPage;
import com.walmart.qa.pages.MyAccountPage;
import com.walmart.qa.pages.MyListsPage;
import com.walmart.qa.utils.TestUtils;

public class MyAccountPageTest extends TestBase {

	CreditCardPage creditCardPage;
	LoginPage loginPage;
	MyAccountPage myAccountPage;
	TestUtils testUtils;
	public MyAccountPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		Intialization();
		loginPage = new LoginPage();
		myAccountPage = loginPage.loginforAccountSetting("Bimal.suthar1607@gmail.com", "1607@Bims");
		testUtils = new TestUtils();
	}
	
	@Test (priority = 1)
	public void viewOrderHistory() throws InterruptedException {
		myAccountPage.clickOnOrderHistory();
	}
	@Test(priority = 2)	
	public void viewMyRecommendation() {
		myAccountPage.clickOnMyRecommendationPage();
	}
	@Test(priority = 3)
	public void viewMyPersonalSetting() {
		testUtils.ScrollDown();
		myAccountPage.clickOnPersonalSetting();
		
	}
	@Test(priority =4)
	public void viewMyListsPage() {
		myAccountPage.clickOnMyLists();
	}
	@Test(priority =5)
	public void viewMyAutosavePage() {
		myAccountPage.clickOnMyAutosave();
	}
	@Test(priority =6)
	public void viewRegistryPage() {
		myAccountPage.clickOnMyRegisteryPage();
	}
	@Test(priority =7)
	public void viewaddresses() {
		testUtils.ScrollDown();
		myAccountPage.clickOnAddresses();
	}
	@Test(priority =8)
	public void viewcreditcardPage() {
		testUtils.ScrollDown();
		creditCardPage = myAccountPage.clickOnCreditCard();
	}
	@Test(priority =9)
	public void signoutPage() {
		testUtils.ScrollDown();	
		myAccountPage.clickOnSignOut();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
