package com.walmart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.bases.TestBase;
import com.walmart.qa.pages.HomePage;
import com.walmart.qa.pages.LoginPage;
import com.walmart.qa.pages.ProductPage;
import com.walmart.qa.pages.SearchOutputPage;
import com.walmart.qa.utils.TestUtils;

public class SearchOutputPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	SearchOutputPage searchOutPage;
	TestUtils testUtils;
	public SearchOutputPageTest() {
		super();
	
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		Intialization();
		loginPage = new LoginPage();
		homePage =loginPage.loginforSearch("Bimal.suthar1607@gmail.com", "1607@Bims");
		Thread.sleep(2000);
		homePage.searchforItem("dining table ");
		searchOutPage = homePage.clickOnSearch();
		testUtils = new TestUtils();
		
	}
	
	@Test(priority = 1)
	public void checkingNumbOfItemsPerPage() {
		String items = searchOutPage.CheckNumOfItems();
		Assert.assertEquals(items,"60");

		
	}
	@Test(priority =2)
	public void validateImage() throws InterruptedException {
		Thread.sleep(3000);
		Boolean flag = searchOutPage.verifyImage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 3)
	public ProductPage clickOnProduct() throws InterruptedException {
		Thread.sleep(3000);
		testUtils.ScrollDown();
		searchOutPage.clickOnImage();
		return new ProductPage();
	}

	@Test(priority = 4)
	public void paginationTest() throws InterruptedException {
		Thread.sleep(3000);
		searchOutPage.pagination();
	}
	
	@Test(priority = 5)
	public void ratingFilter() throws InterruptedException {
		testUtils.ScrollDown();
		Thread.sleep(3000);
		searchOutPage.FilterByCustomerRating();
	}
	
	@Test(priority = 6)
	public void sortingTest() throws InterruptedException {
		searchOutPage.selectSorting();
	}
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	
	
}
