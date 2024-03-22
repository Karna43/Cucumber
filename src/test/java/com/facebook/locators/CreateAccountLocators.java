package com.facebook.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountLocators{
	
	public CreateAccountLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//	@FindBys({@FindBy(className = "fb"), @FindBy(id = "signup")})
//	private WebElement element;
//	
//	@FindAll({@FindBy(className = "fb"), @FindBy(id = "signup")})
//	private WebElement ele;
	
//	By element = By.xpath("//a[contains(text(),'new')]");
//	By element = By.id("new");
	
	@FindBy(xpath = "//a[contains(text(),'new')]")
	private WebElement newAccount;
	
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement name;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath = "//input[contains(@aria-label,'Mobile')]")
	private WebElement mobile;
	
	@FindBy(xpath = "//input[contains(@aria-label,'password')]")
	private WebElement pass;
	
	@FindBy(xpath = "//select[@id='day']")
	private WebElement dateDropdown;
	
	@FindBy(xpath = "//select[@id='month']")
	private WebElement birthMonth;
	
	@FindBy(xpath = "//select[@id='year']")
	private WebElement yearDropdown;
	
	@FindBy(xpath = "//button[@name='websubmit']")
	private WebElement submit;

	public WebElement getNewAccount() {
		return newAccount;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getDateDropdown() {
		return dateDropdown;
	}

	public WebElement getBirthMonth() {
		return birthMonth;
	}

	public WebElement getYearDropdown() {
		return yearDropdown;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
}
