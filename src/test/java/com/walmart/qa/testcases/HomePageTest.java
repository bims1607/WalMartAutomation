package com.walmart.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.bases.TestBase;
import com.walmart.qa.pages.HomePage;
import com.walmart.qa.pages.LoginPage;
import com.walmart.qa.pages.SearchOutputPage;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	SearchOutputPage searchOutputPage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		Intialization();
		loginPage = new LoginPage();
		homePage = loginPage.loginforSearch("bimal.suthar1607@gmail.com", "1607@Bims");
		
		
	}
	@Test
	public void searchItem() throws InterruptedException  {
		Thread.sleep(2000);
		homePage.searchforItem("apple ipad ");
		searchOutputPage= homePage.clickOnSearch();
		
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
