package com.walmart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.qa.bases.TestBase;

public class CreateAccountPage extends TestBase{
	
	// page object 
	@FindBy (xpath = "//*[text()='Sign in']")
	WebElement signIn;
	
	@FindBy(xpath = "//*[text()='Join now']")
	WebElement joinNow;
	
	@FindBy(name = "email")	
	WebElement SignInEmail;
	
	@FindBy(name = "firstName")
	WebElement firstName;
	
	@FindBy(name = "lastName")
	WebElement lastName;
	
	@FindBy(name ="password")
	WebElement SignUpPassword;
	
	@FindBy(name = "confirmPassword")
	WebElement confirmPassword;
	
	@FindBy(xpath = "//input[@name='tnc']")
	WebElement acceptPrivacy;
	
	@FindBy(name = "emailOptIn")
	WebElement subscribe;
	
	@FindBy(css = ".result")
	WebElement PasswordStrength;
	
	@FindBy(id = "create-account-btn")
	WebElement CreateaccountBtn;
	
	
	
  // Initializing page object
	public CreateAccountPage() {
		
		PageFactory.initElements(driver, this);
	}
	//action I have to perform
	public void createAccountInput(String fn, String ln,String eml,String fpwd,String cpwd) {
		Actions action = new Actions(driver);
		action.moveToElement(signIn).build().perform();
		joinNow.click();
		
		firstName.sendKeys(fn);
		lastName.sendKeys(ln);
		SignInEmail.sendKeys(eml);
		SignUpPassword.sendKeys(fpwd);
		confirmPassword.sendKeys(cpwd);
		acceptPrivacy.click();
		subscribe.click();
		
	}
	public String validateStrength() {
		return PasswordStrength.getText();
	}
	
	public void create_Account() {
		CreateaccountBtn.click();
		
	}
	
	
	
}
