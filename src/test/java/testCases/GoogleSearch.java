package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ab.BASE;
import ab.google.SignIn;
import ab.properties.SignInProperties;
import ab.properties.googleProperties;

public class GoogleSearch extends BASE {
	SignIn signIn;

	GoogleSearch() {
		super();
	}

	@BeforeMethod
	public void initilization() {
		signIn = new SignIn();
		openBrowser();
		goToGoogle();

	}
//	@Test(priority=1)
//	public void google() {
//		
//		search();
//	}

	@Test(priority = 1)
	public void signInGoogle() {
		signIn.signIn();
		 //signIn();
		 signIn.useAnotherAcc();
//	typeEmail();
//	typePwd();
		signIn.createAcc();
		signIn.forMySelf();
	}

	public void search() {
		WebElement type = driver.findElement(By.name(googleProperties.GoogleTypeBar_byName));
		type.sendKeys("fasih");
		driver.findElement(By.className(googleProperties.clickBtn_byClass)).click();
	}

	public void signIn() {
		WebElement sign = driver.findElement(By.id(SignInProperties.signIn_id));
		sign.click();
	}

	public void useAnotherAcc() {
		WebElement uaa = driver.findElement(By.className("BHzsHc"));
		uaa.click();
	}

	public void typeEmail() {
		WebElement type = driver.findElement(By.name("identifier"));
		type.sendKeys("uddin24fasih@gmail.com");
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
	}

	public void typePwd() {
		WebElement type = driver.findElement(By.className("whsOnd zHQkBf"));
		type.sendKeys("Tamur1983");
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
	}

	public void createAcc() {
		WebElement cr = driver.findElement(By.xpath(SignInProperties.craeteAcc_xpath));
		cr.click();
//		Actions action=new Actions(driver);
//		action.moveToElement(cr).perform();
//		driver.findElement(By.xpath("//span[2]//div[2]//div[1]")).click();
	}

	public void forMySelf() {
		WebElement my = driver.findElement(By.xpath("//span[2]//div[2]//div[1]"));
		my.click();
//	    Select select=new Select(my);
//	    select.selectByVisibleText("For myself");

	}

}
