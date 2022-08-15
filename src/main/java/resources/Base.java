package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver=null;
    public static Properties prop;
	
	public WebDriver intializeDriver() {
		
		try {
			 prop=new Properties();
	         FileInputStream fis=new FileInputStream(System.getProperty("user.dir") + "./Config File/config.properties");
	         prop.load(fis);
	         System.out.println(prop.getProperty("url"));
	         System.out.println(prop.getProperty("browser"));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException io) {
			io.printStackTrace();
		}		
		
		String browserName=prop.getProperty("browser");
		
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("fireforx")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();			
		} else if(browserName.equalsIgnoreCase("edge")){
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		} 
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}
}	