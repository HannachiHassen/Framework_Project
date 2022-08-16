package testCases;

import org.testng.annotations.Test;

import resources.Base;

public class TwoTest extends Base{
	@Test
	public void testTwo() throws InterruptedException {
		System.out.println("TestTwo");
		initializeBrowser();
		driver.navigate().to(prop.getProperty("url"));
		
		Thread.sleep(2000);
		
		driver.close();
	}
}
