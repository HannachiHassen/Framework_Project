package testCases;

import org.testng.annotations.Test;

import resources.Base;

public class FourTest extends Base{
	@Test
	public void testFour() throws InterruptedException {
		System.out.println("TestFour");
		initializeBrowser();
		driver.navigate().to(prop.getProperty("url"));
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
