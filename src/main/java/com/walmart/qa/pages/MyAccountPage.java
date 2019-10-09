package com.walmart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.qa.bases.TestBase;

public class MyAccountPage extends TestBase {
	
	@FindBy(xpath="(//a[text()='My Recommendations'])[3]")
	WebElement myRecommendation; 
	
	@FindBy(xpath = "//a[contains(text(),'Order History ')]")
	WebElement orderHistory;
	
	@FindBy(xpath = "(//a[text()='My Lists'])[3]")
	WebElement myLists;
	
	@FindBy(xpath = "(//a[text()='My Subscriptions'])[3]")
	WebElement myAutosave;
	
	@FindBy(xpath = "(//a[text()='My Registries'])[3]")
	WebElement myRegistries;
	
	@FindBy(xpath = "//a[text()='Personal Settings']")
	WebElement personalSetting;
	
	@FindBy(xpath = "//a[text()='Addresses']")
	WebElement Addresses;
	
	@FindBy(xpath = "//a[text()='Credit Cards']")
	WebElement creditCard;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	WebElement signOut;
	
	public MyAccountPage() {
		PageFactory.initElements(driver	, this);
	}
	public OrderHistoryPage clickOnOrderHistory() {
		orderHistory.click();
		return new OrderHistoryPage();
	}
	public  MyRecommendationPage clickOnMyRecommendationPage() {
		myRecommendation.click();
		return new MyRecommendationPage();
			
	}
	public MyListsPage clickOnMyLists() {
		myLists.click();
		return new MyListsPage();
	}
	public MyAutosavePage clickOnMyAutosave() {
		myAutosave.click();
		return new MyAutosavePage();
	}
	public MyRegistryPage clickOnMyRegisteryPage() {
		myRegistries.click();
		return new MyRegistryPage();
	}
	public PersonalSettingPage clickOnPersonalSetting() {
		personalSetting.click();
		return new PersonalSettingPage();
	}
	public AddressPage clickOnAddresses() {
		Addresses.click();
		return new AddressPage();
	}
	public CreditCardPage clickOnCreditCard() {
		creditCard.click();
		return new CreditCardPage();
	}
	public GuestPage clickOnSignOut() {
		signOut.click();
		return new GuestPage();
	}
}
