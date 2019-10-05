package com.crm.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	//page factory
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(linkText="Sign Up")
	WebElement signUpBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;

//intilizing the pagefactory elements
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	//actions
	
	
public String validateLoginPageTitle(){
	return driver.getTitle();
}

public boolean validateCRMImage(){
	return crmLogo.isDisplayed();
}

public HomePage login(String un,String pwd){
	username.sendKeys(un);
	password.sendKeys(pwd);
	loginBtn.click();
	
	return new HomePage();
}
}
