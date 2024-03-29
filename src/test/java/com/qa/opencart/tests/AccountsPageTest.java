package com.qa.opencart.tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.utils.Constants;
import com.qa.opencart.utils.Error;

public class AccountsPageTest extends BaseTest{
	
	@BeforeClass
	public void AccSetUp() {
	accPage =	loginPage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test(priority = 1)
	public void accPageTitleTest() {
		String title  = accPage.getAccPageTitle();
		System.out.println("home page title :" + title);
		Assert.assertEquals(title, Constants.ACC_PAGE_TITLE,Error.ACC_PAGE_MISMATCH_ERROR);
	}
	
	@Test(priority =2)
	public void accPageLogoTest() {
		Assert.assertTrue(accPage.isLogoExists(),Error.LOGO_NOT_AVAILABLE_ERROR);
	}
	
	@Test(priority =3)
	public void accPageSectionsCountTest() {
	Assert.assertEquals(accPage.getAccountPageHeadersCount(), Constants.ACC_PAGE_SECTIONS_COUNT,Error.ACC_PAGE_SECTION_ERROR);	
	}
   
	@Test(priority =4)
	public void accPageSectionsTest() {
		List<String> actualAccSecList = accPage.getAccountPageHeaderList();
		System.out.println(actualAccSecList);
		
		Assert.assertEquals(actualAccSecList, Constants.expectedAccSecList());
	}
}
