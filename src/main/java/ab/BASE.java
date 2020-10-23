package ab;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ab.properties.BaseProperties;

public class BASE {

	 protected WebDriver driver;
public BASE() {
	System.setProperty(BaseProperties.chromeDriver, BaseProperties.chromePath);
	driver = new ChromeDriver();
}
	
	public void openBrowser() {

		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	} 

	public void goToGoogle() {

		driver.get(BaseProperties.google);
		
	}

	public void goToEBFS() {

		driver.get(BaseProperties.EBFC);
		String actual=driver.getCurrentUrl();
		String expected=BaseProperties.EBFC;
		Assert.assertEquals(actual, expected); 

		
		actual=driver.getTitle();
		expected="eBFS - the power of choice";
		Assert.assertEquals(actual, expected);
		System.out.println(actual);
		System.out.println(actual);
		System.out.println(actual);
	}

	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(10000);
		driver.quit();
	}
}
