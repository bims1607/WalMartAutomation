package com.walmart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.qa.bases.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy( xpath ="//*[text()='Sign in']")
	WebElement signIn; 
	
	@FindBy(id = "login-form-email")
	WebElement loginEmail;
	
	@FindBy(name = "password")
	WebElement loginPassword;
	
	@FindBy(id = "account-signin-btn")
	WebElement SignInbtn;
	
	@FindBy(css= ".css-hl2cc3")
	WebElement myAccount;
	

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public MyAccountPage loginforAccountSetting(String mail, String pswd) {
		signIn.click();
		loginEmail.sendKeys(mail);
		loginPassword.sendKeys(pswd);
		SignInbtn.click();
		myAccount.click();
		
		
		return new MyAccountPage();
	}
	public HomePage loginforSearch(String mail, String pswd) {
		signIn.click();
		loginEmail.sendKeys(mail);
		loginPassword.sendKeys(pswd);
		SignInbtn.click();
		
		return new HomePage();
	}
}
