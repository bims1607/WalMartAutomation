package com.walmart.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.bases.TestBase;
import com.walmart.qa.pages.HomePage;
import com.walmart.qa.pages.LoginPage;
import com.walmart.qa.pages.ProductPage;
import com.walmart.qa.pages.SearchOutputPage;
import com.walmart.qa.utils.TestUtils;

public class ProductPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	SearchOutputPage searchOutPage;
	ProductPage productPage;
	TestUtils testUtils;
	
	public ProductPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		Intialization();
		loginPage = new LoginPage(); 
		homePage = loginPage.loginforSearch("Bimal.suthar1607@gmail.com", "1607@Bims");
		Thread.sleep(3000);
		homePage.searchforItem("dinig table");
		searchOutPage = homePage.clickOnSearch();
		productPage = searchOutPage.clickOnImage();
		testUtils = new TestUtils();
		
		
	}
	@Test
	public void addCart() throws InterruptedException {
		testUtils.ScrollDown();
		productPage.quantityAndCart();
		
		
	}
}
