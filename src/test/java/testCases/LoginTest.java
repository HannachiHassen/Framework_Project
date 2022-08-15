package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pageObject.AccountPage;
import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.Base;

public class LoginTest extends Base{
	
	public LoginTest() {
		super();
	}
	
	@Test
	public void login() {		
		intializeDriver();
		driver.get(prop.getProperty("url"));
		
		LandingPage landingPage = new LandingPage();
		landingPage.myAccountDropDown().click();
		landingPage.loginOption().click();
		
		LoginPage loginPage=new LoginPage();
		loginPage.email().sendKeys(prop.getProperty("email"));
		loginPage.password().sendKeys(prop.getProperty("password"));
		loginPage.clickLoginbtn().click();
		
		AccountPage account=new AccountPage();
		Assert.assertTrue(account.editAccountInformation().isDisplayed());
		account.editAccountInformation().click();
	}	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
