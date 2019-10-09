package com.walmart.qa.pages;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.walmart.qa.bases.TestBase;

public class SearchOutputPage extends TestBase{
	
	@FindBy(xpath = "//span[@class='last-rec-num']")
	WebElement numberOfItemsperPage;

	@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[4]/section[3]/div[3]/div/article[2]/a")
	WebElement product;
	
	@FindBy(xpath = "//a[@data-original ='?sortBy=newest&orderBy=ASC']")
	WebElement Newest;
	

	@FindBy(xpath = "//a[@data-original='?sortBy=rating&orderBy=ASC']")
	WebElement Rating;
	
	@FindBy(xpath = "//a[@data-original='?sortBy=price&orderBy=ASC']")
	WebElement Price;
	
	@FindBy(xpath = "//a[@data-original='?sortBy=popular&orderBy=ASC']")
	WebElement popular;
	
	@FindBy(xpath = "//select[@class='page-select']")
	WebElement rangeSelect;
	
	@FindBy(css = "#rm-CustomerRating > button:nth-child(1)")
	WebElement customerRating;
	
	@FindBy(xpath = "//*[@title='5 stars']")
	WebElement starFive;
	
	
	public SearchOutputPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String CheckNumOfItems() {
		return numberOfItemsperPage.getText();
		
	}
	public void pagination() {
		List page = driver.findElements(By.xpath("//a[@id='loadmore']"));
		
		if(page.size()>=0) {
			for(int i = 0; i< page.size();i++) {
				((WebElement)page.get(i)).click();
				
			}
		}
		Select rangePage = new Select(rangeSelect);
		rangePage.selectByIndex(1);
	}
	
	public boolean verifyImage() {
		
		return product.isDisplayed();
	}
	public ProductPage clickOnImage() {
		product.click();
		return new ProductPage();
	}
	
	public void selectSorting() throws InterruptedException {
		Newest.click();   
		Thread.sleep(2000);
		
		Rating.click();
		Thread.sleep(2000);
		Price.click();
		Thread.sleep(2000);
		popular.click();
		
	}
	
	public void FilterByCustomerRating() {
		customerRating.click();
		starFive.click();
	}
	
}

