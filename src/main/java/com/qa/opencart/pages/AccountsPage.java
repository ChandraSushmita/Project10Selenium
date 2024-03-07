package com.qa.opencart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.opencart.utils.Constants;
import com.qa.opencart.utils.ElementUtil;

public class AccountsPage {
	
	ElementUtil elementUtil;
	
	private By logo = By.xpath("//h1");
	private By AccHeaders = By.xpath("//h2");
	
	
	public AccountsPage(WebDriver driver) {
		elementUtil = new ElementUtil(driver);
	}
	 
	public String getAccPageTitle(){
		return elementUtil.waitForTitleIs(5, Constants.ACC_PAGE_TITLE);
	}
	
	public boolean isLogoExists() {
		return elementUtil.doIsDisplayed(logo);
		
	}
	
	public int getAccountPageHeadersCount() {
		return elementUtil.getElements(AccHeaders).size();
	}
	
	public List<String> getAccountPageHeaderList() {
		List<WebElement> accList = elementUtil.getElements(AccHeaders);
		List<String> accSectionList = new ArrayList<String>();
		for(WebElement e : accList ) {
			accSectionList.add(e.getText());
		}
		return accSectionList;
	}

}
