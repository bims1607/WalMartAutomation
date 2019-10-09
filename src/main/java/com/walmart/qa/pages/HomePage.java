package com.walmart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.qa.bases.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath = "//input[@type='text' and @aria-label='What are you looking for?']")
	WebElement searchInput;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement clickSearch;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void searchforItem(String input)  {
		
		searchInput.sendKeys(input);
		
	}
	public SearchOutputPage clickOnSearch() {
		clickSearch.click();
		return new SearchOutputPage();
	}
	
}
