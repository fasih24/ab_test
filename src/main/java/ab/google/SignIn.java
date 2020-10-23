package ab.google;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;

import ab.BASE;
import ab.properties.SignInProperties;
import ab.properties.googleProperties;

public class SignIn extends BASE {
	public SignIn() {
		super();
	
	}
	public void search() {
		
		WebElement type= driver.findElement(By.name(googleProperties.GoogleTypeBar_byName));
		type.sendKeys("fasih");
	     
		driver.findElement(By.className(googleProperties.clickBtn_byClass)).click();
	}
	public void signIn() {
		WebElement sign= driver.findElement(By.id(SignInProperties.signIn_id));
		sign.click();
		
	}
	public void useAnotherAcc() {
		WebElement uaa= driver.findElement(By.className(SignInProperties.useAnotherAcc_ByClass));
		uaa.click();
	}
	public void createAcc() {
		WebElement cr= driver.findElement(By.xpath(SignInProperties.craeteAcc_xpath));
		cr.click();
	}
	public void forMySelf() {
		WebElement my= driver.findElement(By.className(SignInProperties.forMySelf_class));
		my.click();
	}
	
}
