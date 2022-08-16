package testCases;

import org.testng.annotations.Test;

import resources.Base;

public class ThreeTest extends Base{
	@Test
	public void testThree() throws InterruptedException {
		System.out.println("TestThree");
		initializeBrowser();
		driver.navigate().to(prop.getProperty("url"));
		
		Thread.sleep(2000);
		
		driver.close();
	}
}
