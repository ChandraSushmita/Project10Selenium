package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.Constants;
import com.qa.opencart.utils.ElementUtil;

public class LoginPage {
	
	
	private ElementUtil elementUtil;
	private WebDriver driver;
	
	// Page Object - By Locators - Object Repository
	
	private By username = By.id("input-email");
	private By password = By.id("input-password");
	private By loginButton = By.xpath("//button[@type='submit']");
	private By forgotpwd = By.xpath("//a[text()='Forgot your password?']");
	
	
	//constructor
	
	public LoginPage(WebDriver driver)
	{
		this.driver =driver;
		elementUtil = new ElementUtil(driver);
	}
	
   //page actions:
	
	public String getLoginPageTitle() {
		return elementUtil.waitForTitleIs(5,Constants.LOGIN_PAGE_TITLE);
	}
	
	public boolean isForgotPwdLinkExists() {
		return elementUtil.doIsDisplayed(forgotpwd);
	}
	
	public AccountsPage doLogin(String un, String pwd) {
		System.out.println("login with"+" : "+ un+ pwd);
		elementUtil.doSendKeys(username, un);
		elementUtil.doSendKeys(password, pwd);
		elementUtil.doClick(loginButton);
		return new AccountsPage(driver);
		
	}

}
