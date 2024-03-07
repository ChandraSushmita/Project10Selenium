package com.qa.opencart.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.cart.factory.DriverFactory;
import com.qa.opencart.pages.AccountsPage;
import com.qa.opencart.pages.LoginPage;

public class BaseTest {
	private WebDriver driver;
	public Properties prop;
	DriverFactory df;
	
public	LoginPage loginPage;
public AccountsPage accPage;
	
	@BeforeTest
	public void setUp() {
		df = new DriverFactory();
		prop = df.int_prop();
		
	    driver = df.int_driver(prop);
	    loginPage = new LoginPage(driver);
		
		
	}
	
	@AfterTest
	public void tearDown() {
	driver.quit();
	}

}
