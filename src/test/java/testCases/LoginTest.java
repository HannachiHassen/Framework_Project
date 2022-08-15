package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.AccountPage;
import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.Base;

public class LoginTest extends Base{
	
	public LoginTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		intializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test(priority=1)
	public void login() {
		
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
	
	@Test(priority = 2, dataProvider = "getLoginData")
	public void loginDataProvider(String email, String password, String expectedRsult) {
				
		LandingPage landingPage = new LandingPage();
		landingPage.myAccountDropDown().click();
		landingPage.loginOption().click();
		
		LoginPage loginPage=new LoginPage();
		loginPage.email().sendKeys(email);
		loginPage.password().sendKeys(password);
		loginPage.clickLoginbtn().click();
		
		AccountPage account=new AccountPage();
		
		String actualResutl=null;
		try {
			 if(account.editAccountInformation().isDisplayed()) {
			   actualResutl="Sucessfull";
			 }
		} catch (Exception e) {
			actualResutl="Failure";
		}
		Assert.assertEquals(actualResutl, expectedRsult);		
	}
	
	@DataProvider
	public Object[][] getLoginData() {
		Object[][] data= {
				          {"arun.selenium@gmail.com","Second@123", "Sucessfull"}, 
				          {"dummy@test.com","dummy", "Failure"}
				         };
		return data;
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
