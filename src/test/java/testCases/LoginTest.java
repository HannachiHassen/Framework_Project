package testCases;

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
		loginPage.email().sendKeys("arun.selenium@gmail.com");
		loginPage.password().sendKeys("Second@123");
		loginPage.clickLoginbtn().click();
		
		AccountPage account=new AccountPage();
		account.editAccountInformation().click();
	}	
}
