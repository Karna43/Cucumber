package com.facebook.locators;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAccountLocators{
	
	public LoginAccountLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement mobile;
	
	@FindBy(xpath = "//input[@id='pass']")
	private WebElement pass;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit;
	
	@FindBy(tagName = "link")
	private List<WebElement> links;

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	public List<WebElement> getLink() {
		return links;
	}
}
