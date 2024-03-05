package com.facebook.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.facebook.basefunctions.BaseClass;

public class LoginAccountLocators{
	
	public static LoginAccountLocators locators = null;
	
	private LoginAccountLocators() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public static LoginAccountLocators getInstance() {
		if(locators == null) {
			locators = new LoginAccountLocators();
	 	}
		return locators;
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
