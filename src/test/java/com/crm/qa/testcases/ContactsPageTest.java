package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	String sheetName="contacts";
	public ContactsPageTest(){
		super();

}
	@BeforeMethod
	public void setUp(){
		initialization();
		testUtil = new TestUtil();
		contactsPage = new ContactsPage();
		 loginpage = new LoginPage();
		 homePage= loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		 testUtil.switchToFrame(); 
		contactsPage= homePage.clickOnContactsLink();
	}
	@Test(priority=1)
	public void verifyContactsPageLabel(){
		Assert.assertTrue(contactsPage.verifyContactsLabel(), "contacts label is missing on the page");
	}
	
	@Test(priority=2)
	public void selectContactsTest(){
		contactsPage.selectContactsByName("test2 test2");
		
	}
	
	@DataProvider
	public Object[][] getCRMTestData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	@Test(priority=3,dataProvider="getCRMTestData")
	
	public void validateCreateNewContact(String title,String firstname,String lastname,String company){
		homePage.clickOnContactsLink();

		contactsPage.createNewContact(title, firstname, lastname, company);
	}

	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
