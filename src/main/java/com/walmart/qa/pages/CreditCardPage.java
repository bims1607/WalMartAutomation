package com.walmart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.qa.bases.TestBase;

public class CreditCardPage extends TestBase{
  
	@FindBy(xpath= "//*[@data-analytics-value='Credit-Cards']")
	WebElement creditCardTitle;
	
	public CreditCardPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyCreditcardTitle() {
		String title = creditCardTitle.getText();
		return title;
	}
	
}