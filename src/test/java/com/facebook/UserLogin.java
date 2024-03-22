package com.facebook;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

import com.facebook.basefunctions.BaseClass;
import com.facebook.locators.LoginAccountLocators;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserLogin {
	
	public static BaseClass base = BaseClass.getInstance();
	public static LoginAccountLocators locators;
	public static XSSFWorkbook readWorkbook;
	public static XSSFSheet readSheet;
	public static String password;
	public static XSSFCell mobile;
	
	@When("User enters email address or phone number {string}")
	public void user_enters_email_address_or_phone_number(String mobileNo) {
		locators = new LoginAccountLocators(BaseClass.driver);
		base.sendText(locators.getMobile(), mobileNo);
	}

	@When("User enters the password {string}")
	public void user_enters_the_password(String password) {
		base.sendText(locators.getPass(), password);
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		base.button(locators.getSubmit());
	}

	@Then("Validate the user credentials in db and proceed to homepage {string}{string}{string}")
	public void validate_the_user_credentials_in_db_and_proceed_to_homepage
	(String mobileNo, String dbPassword, String url) {
		try {
			readWorkbook = base.readWorkbook("C:\\Users\\Karna\\Pictures\\Account Details.xlsx");
			readSheet = readWorkbook.getSheet("User Accounts");
			for(int i=1;i<readSheet.getPhysicalNumberOfRows();i++) {
				mobile = readSheet.getRow(i).getCell(2);
				password = readSheet.getRow(i).getCell(5).getStringCellValue();
				mobile.setCellType(CellType.STRING);
                String dbMobile= mobile.getStringCellValue();
				if(dbMobile.equals(mobileNo) && dbPassword.equals(password)) {
					BaseClass.driver.navigate().to(url);
				}
				else {
					System.out.println("Please enter valid username and password");
					i = readSheet.getPhysicalNumberOfRows();
				}
			}
			base.closeReadFile();
			Thread.sleep(3000);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Then("Validate all the urls working as expected")
	public void validate_all_the_urls_working_as_expected() {
			try {
				List<WebElement> links =locators.getLink();
				Iterator<WebElement> iterator = links.iterator();
				while(iterator.hasNext()) {
					WebElement link = iterator.next();
					String href = base.returnAttribute(link, "href");
					if(href == null || href.isEmpty()) {
						System.out.println("Link Not Available");
					}
					else if(!href.startsWith("https://www.facebook.com")) {
						System.out.println("Link not related to facebook: "+href);
					}
					else {
						HttpURLConnection http = (HttpURLConnection) (new URL(href).openConnection());
						http.setRequestMethod("HEAD");
						http.connect();
						int responsecode= http.getResponseCode();
						if(responsecode==200) {
							System.out.println("Link is not broken: "+href);
						}
					}
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
}
