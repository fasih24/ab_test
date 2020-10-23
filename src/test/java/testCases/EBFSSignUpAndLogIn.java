package testCases;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ab.BASE;
import ab.Create_EBFC_Act;
import abc.My_EBFC_Act;
import abc.TestingData;

public class EBFSSignUpAndLogIn extends BASE {

	@BeforeTest
	public void initilization() {
		openBrowser();
		goToEBFS();
		
	}
	

	@Test
	public void googleSerach() {
		//goToGoogle();
	
		
		clickOnLogin();
		//inputEmail();
//		clickCreateAccountBtn();
//		clickGender("mr");
//		firstName();
//		lastName();
//		 userEmail();
//		userPasswd();
//		days();
//		months();
//		years();
		
//		signUpAndSpecialOfferBtn();
	//	selectDateOfBirth("12-15-2000");
		InputEmail();
		password();
		click();
		searchBar();
		clickSearchBt();
		TShirtSortBy();
		sortSelectionOption3();
		SelectBest();
		AddToCart();
		continueToAdd();
		searchBar();
		clickSearchBt();
		TShirtSortBy();
		SelectInStock();
		
	     AddToCart();
//		continueToAdd();
//		searchBar();
//		clickSearchBt();
//		TShirtSortBy();
//		SelectBest();
//		AddToCart();
//	//	SelectInStock();
//		ProceedToCheckOut();
//		ProceedToCheckOut1();
	}

	public void clickOnLogin() { 
		driver.findElement(By.className(My_EBFC_Act.LoginButton_class)).click();
	}
	public void InputEmail() {
		WebElement email = driver.findElement(By.id(My_EBFC_Act.Email_id));

		email.sendKeys(TestingData.SignUpEmail);
	}

	// sign up method
	public void inputEmail() {
		WebElement email = driver.findElement(By.id(My_EBFC_Act.signup_id));

		email.sendKeys(TestingData.SignUpEmail);
	}

	public void clickCreateAccountBtn() {
		driver.findElement(By.xpath(Create_EBFC_Act.creatAccountBtn_xpath)).click();
	}

	public void clickGender(String gender) {
		if (gender.equalsIgnoreCase("Mr")) {
			Boolean actual = driver.findElement(By.id(Create_EBFC_Act.maleBtn_id)).isSelected();
			        actual=true;
			Assert.assertTrue(actual);
			driver.findElement(By.id(Create_EBFC_Act.maleBtn_id)).click();
		} else {

			Boolean actual = driver.findElement(By.id(Create_EBFC_Act.femaleBtn_id)).isSelected();
			Assert.assertFalse(actual);
			driver.findElement(By.id(Create_EBFC_Act.femaleBtn_id)).click();
			actual = driver.findElement(By.id(Create_EBFC_Act.femaleBtn_id)).isSelected();
			Assert.assertTrue(actual);
		}
	}

	public void firstName() {
		driver.findElement(By.name(TestingData.firstName_name)).sendKeys(TestingData.firstName);
	}

	public void lastName() {

		driver.findElement(By.name(TestingData.lastName_name)).sendKeys(TestingData.lastName);
	}

	public void userEmail() {
		driver.findElement(By.name(TestingData.userEmail_name)).sendKeys(TestingData.userEmail);
		;
	}

	public void userPasswd() {
		driver.findElement(By.id(TestingData.passwd_id)).sendKeys(TestingData.passwd);
	}

	public void days(String day) {
		WebElement Days = driver.findElement(By.name(TestingData.days_id));
		Select selectDay = new Select(Days);
		int d=Integer.parseInt(day);
		selectDay.selectByIndex(d);
	}

	public void months(String month) {
		WebElement months = driver.findElement(By.name(TestingData.months_id));
		Select selectMonth = new Select(months);
		selectMonth.selectByValue(month);
	}

	public void years(String year) {
		WebElement years = driver.findElement(By.id(TestingData.years_id));
		Select selectYear = new Select(years);
		selectYear.selectByValue(year);
	}
public void selectDateOfBirth(String dob) {
	//mm-dd-yyyy
	String [] d=dob.split("-");
	
	
	months(d[0]);
	days(d[1]);
	years(d[2]);
	
	
}
	public void signUpAndSpecialOfferBtn() {
		driver.findElement(By.id(TestingData.newSettler_id)).click();
		driver.findElement(By.id(TestingData.specialOffer_id)).click();

	}

	public void inputEmail1() {
		WebElement email = driver.findElement(By.id(My_EBFC_Act.Email_id));

		email.sendKeys(TestingData.email);
	}

	public void password() {
		WebElement password = driver.findElement(By.id(My_EBFC_Act.password_id));

		password.sendKeys(TestingData.passwd);
	}

	public void click() {
		driver.findElement(By.xpath(My_EBFC_Act.clickBtn_xpath)).click();
	}

	public void searchBar() {
		driver.findElement(By.id(My_EBFC_Act.searchBar_id)).sendKeys(TestingData.TShirt);
	}

	public void clickSearchBt() {
		driver.findElement(By.xpath(My_EBFC_Act.clickSearchBt_xpath)).click();
	}

	public void TShirtSortBy() {
		driver.findElement(By.id(My_EBFC_Act.SortBy_xpath));
		driver.findElement(By.xpath(TestingData.selectOption_xpath));
	}

	public void sortSelectionOption3() {
		driver.findElement(By.xpath(TestingData.Option3_xpath)).click();
	}

	public void SelectBest() {
		driver.findElement(By.xpath(My_EBFC_Act.best_xpath)).click();
	}

	public void AddToCart() {
		driver.findElement(By.xpath(My_EBFC_Act.addToCart_xpath)).click();
	}
	public void continueToAdd() {
		driver.findElement(By.xpath(TestingData.continueToAdd_xpath)).click();
	}
	public void SelectInStock() {
		driver.findElement(By.xpath(TestingData.SelectInStock_xpath)).click();
	}
	public void ProceedToCheckOut() {
		driver.findElement(By.xpath(TestingData.proceedToCheckOut_xpath)).click();
	}
	public void ProceedToCheckOut1() {
		driver.findElement(By.xpath(TestingData.proceedToCheckOut1_xpath)).click();
	}
}
