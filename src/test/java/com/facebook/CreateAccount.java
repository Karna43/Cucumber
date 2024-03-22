package com.facebook;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.facebook.basefunctions.BaseClass;
import com.facebook.locators.CreateAccountLocators;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccount {
	
	public static BaseClass base = BaseClass.getInstance();
	public static CreateAccountLocators locators;
	public static FileOutputStream writeFile;
	public static XSSFWorkbook readWorkbook;
	public static XSSFSheet readSheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static boolean user;
	public static Date dob;
	
	@Given("Click on Create new account")
	public void click_on_create_new_account() {
		locators = new CreateAccountLocators(BaseClass.driver);
		base.button(locators.getNewAccount());
	}

	@When("User enters first name {string}")
	public void user_enters_first_name(String firstname) {
		base.sendText(locators.getName(), firstname);
	}

	@And("User enters surname {string}")
	public void user_enters_surname(String surname) {
		base.sendText(locators.getLastname(), surname);
	}

	@And("User enters mobile number or email address {string}")
	public void user_enters_mobile_number_or_email_address(String mobileNo) {
		base.sendText(locators.getMobile(), mobileNo);
	}

	@And("User enters password {string}")
	public void user_enters_password(String password) {
		base.sendText(locators.getPass(), password);
	}

	@And("User selects date of birth {string}")
	public void user_selects_date_of_birth(String dateOfBirth) {
		List<WebElement> options = base.selectAllOptions(locators.getDateDropdown());
		  for(WebElement option : options) {
			  String date = base.returnText(option);
			  if(date.contains(dateOfBirth)) {
				  base.selectVisibleText(locators.getDateDropdown(), date);
			  }
		  }
	}

	@And("User selects month of birth {string}")
	public void user_selects_month_of_birth(String monthOfBirth) {
		base.sendText(locators.getBirthMonth(), monthOfBirth);
	}

	@And("User selects year of birth {string}")
	public void user_selects_year_of_birth(String yearOfBirth) {
		 List<WebElement> options = base.selectAllOptions(locators.getYearDropdown());
		  for(WebElement option : options) {
			  String year = base.returnText(option);
			  if(year.contains(yearOfBirth)) {
				  base.selectVisibleText(locators.getYearDropdown(), year);
			  }
		  }
	}

	@And("User selects gender {string}")
	public void user_selects_gender(String gender) {
		WebElement gen = BaseClass.driver.findElement(By.xpath("//label[text()='"+gender+"']"));
		base.button(gen);
	}

	@And("User clicks on sign up button")
	public void user_clicks_on_sign_up_button() {
		base.button(locators.getSubmit());
	}
	
	@Then("Validate if user account exists in db {string}")
	public void validate_if_user_account_exists_in_db(String mobileNo) {
		try {
			user = true;
			readWorkbook = base.readWorkbook("C:\\Users\\Karna\\Pictures\\Account Details.xlsx");
			readSheet = readWorkbook.getSheet("User Accounts");
			for(int i=1;i<readSheet.getPhysicalNumberOfRows();i++) {
				cell = readSheet.getRow(i).getCell(2);
				cell.setCellType(CellType.STRING);
                String dbMobile= cell.getStringCellValue();
				if(dbMobile.equals(mobileNo)) {
					user = false;
					System.out.println("User account exists");
					i = readSheet.getPhysicalNumberOfRows();
				}
				else {
					user = true;
				}
			}
			base.closeReadFile();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	@And("Create new user account in db after validating all input fields {string}{string}{string}{string}{string}{string}{string}{string}")
	public void create_new_user_account_in_db_after_validating_all_input_fields
			(String firstname, String surname, String mobileNo, 
					String dateOfBirth, String monthOfBirth, 
					String yearOfBirth, String gender, String password) {
		if (user == true) {
			try {
				writeFile = new FileOutputStream(new File("C:\\Users\\Karna\\Pictures\\Account Details.xlsx"));
				row = readSheet.createRow(readSheet.getPhysicalNumberOfRows());
				dob = new SimpleDateFormat("dd-MMM-yyyy").parse(dateOfBirth+"-"+monthOfBirth+"-"+yearOfBirth);
				for(int j=0;j<6;j++) {
					cell = row.createCell(j);
					switch (j) {
						case 0: cell.setCellValue(firstname); break;
						case 1: cell.setCellValue(surname); break;
						case 2: cell.setCellValue(mobileNo); break;
						case 3: cell.setCellValue(dob); break;
						case 4: cell.setCellValue(gender); break;
						case 5: cell.setCellValue(password); break;
					}
				}
				readWorkbook.write(writeFile);
				base.closeWriteFile();
				System.out.println("Welcome "+firstname+", Your account is successfully created");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	@And("Take screenshot after validation {string}")
	public void take_screenshot_after_validation(String firstname) {
		try {
			Thread.sleep(15000);
			base.screenshot(firstname);
			Thread.sleep(5000);	
			} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
