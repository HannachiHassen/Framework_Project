package testCases;

import org.testng.annotations.Test;

import pageObject.LandingPage;
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
	}	
}
