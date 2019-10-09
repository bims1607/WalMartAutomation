package com.walmart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.qa.bases.TestBase;

public class PersonalSettingPage extends TestBase {
	
	@FindBy(id = "set-edit-info")
	WebElement EditPersonalinfo;
	
	@FindBy(name = "firstName")
	WebElement EditFirstName;
	
	@FindBy(name = "lastName")
	WebElement EditLastName;
	
	@FindBy(name = "phone")
	WebElement EditPhone;
	
	@FindBy(name = "postalCode")
	WebElement EditPostalCode;
	
	@FindBy(id = "update-details-btn")
	WebElement saveDetail;
	
	@FindBy(id="set-edit-password")
	WebElement EditPassword;
	
	@FindBy(name = "oldPassword")
	WebElement oldPassword;
	
	@FindBy(name ="password")
	WebElement newPassword;
	
	@FindBy(name = "confirmPassword")
	WebElement confirmPassword;
	
	@FindBy(id = "update-passwd-btn")
	WebElement savePswd;
	
	@FindBy(id = "set-edit-language")
	WebElement changeLanguage;
	
	@FindBy(xpath = "//*[text()=' Français ']")
	WebElement selectFrench;
	
	@FindBy(xpath ="//*[text()='English ']")
	WebElement selectEnglish;
	
	@FindBy(id = "update-language-btn")
	WebElement saveLanguage;
	
	public PersonalSettingPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void ClickonEditPersInfo() {
		EditPersonalinfo.click();
	}
	
	public void EditPersonalInfo(String Fname, String Lname, String pstlcd, String phn) {
		EditFirstName.clear();
		EditFirstName.sendKeys(Fname);
		EditLastName.clear();
		EditLastName.sendKeys(Lname);
		EditPostalCode.clear();
		EditPostalCode.sendKeys(pstlcd);
		EditPhone.clear();
		EditPhone.sendKeys(phn);
	}
	public void clickOnSaveDetail() {
		saveDetail.click();
	}
	
	public void ClickOnEditPassword() {
		EditPassword.click();
	}
	
	public void ChangePassword(String oldpswd, String newpswd, String cnfmpswd) {
		oldPassword.sendKeys(oldpswd);
		newPassword.sendKeys(newpswd);
		confirmPassword.sendKeys(cnfmpswd);
		savePswd.click();
	}
	
	public void ClickOnEditLanguage() {
		
		changeLanguage.click();
	}
	
	public void changingLanguage() {
		String English = selectEnglish.getText();
		
		
		if(English.equals("English")) {
			selectFrench.click();
		}
		else {
			selectEnglish.click();
		}
		saveLanguage.click();
		
	}
	
}
