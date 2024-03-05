$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/facebook.feature");
formatter.feature({
  "name": "Facebook Create Account",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User enters values for all fields and Click on create new account",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@createaccount"
    }
  ]
});
formatter.step({
  "name": "User enters first name \"\u003cFirstname\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enters surname \"\u003cSurname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters mobile number or email address \"\u003cMobileNo\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters password \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User selects date of birth \"\u003cDate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User selects month of birth \"\u003cMonth\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User selects year of birth \"\u003cYear\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User selects gender \"\u003cGender\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on sign up button",
  "keyword": "And "
});
formatter.step({
  "name": "Validate if user account exists in db \"\u003cMobileNo\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Create new user account in db after validating all input fields \"\u003cFirstname\u003e\"\"\u003cSurname\u003e\"\"\u003cMobileNo\u003e\"\"\u003cDate\u003e\"\"\u003cMonth\u003e\"\"\u003cYear\u003e\"\"\u003cGender\u003e\"\"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Take screenshot after validation \"\u003cFirstname\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Firstname",
        "Surname",
        "MobileNo",
        "Password",
        "Date",
        "Month",
        "Year",
        "Gender"
      ]
    },
    {
      "cells": [
        "Karna",
        "S",
        "1111111111",
        "karna",
        "15",
        "Oct",
        "1995",
        "Male"
      ]
    }
  ]
});
formatter.background({
  "name": "Facebook launching function",
  "description": "",
  "keyword": "Background"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click on Create new account",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateAccount.click_on_create_new_account()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User enters values for all fields and Click on create new account",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@createaccount"
    }
  ]
});
formatter.step({
  "name": "User enters first name \"Karna\"",
  "keyword": "When "
});
formatter.match({
  "location": "CreateAccount.user_enters_first_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters surname \"S\"",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAccount.user_enters_surname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters mobile number or email address \"1111111111\"",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAccount.user_enters_mobile_number_or_email_address(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters password \"karna\"",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAccount.user_enters_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects date of birth \"15\"",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAccount.user_selects_date_of_birth(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects month of birth \"Oct\"",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAccount.user_selects_month_of_birth(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects year of birth \"1995\"",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAccount.user_selects_year_of_birth(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects gender \"Male\"",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAccount.user_selects_gender(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on sign up button",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAccount.user_clicks_on_sign_up_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate if user account exists in db \"1111111111\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateAccount.validate_if_user_account_exists_in_db(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Create new user account in db after validating all input fields \"Karna\"\"S\"\"1111111111\"\"15\"\"Oct\"\"1995\"\"Male\"\"karna\"",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAccount.create_new_user_account_in_db_after_validating_all_input_fields(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Take screenshot after validation \"Karna\"",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAccount.take_screenshot_after_validation(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/facebooklogin.feature");
formatter.feature({
  "name": "Facebook Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login to facebook",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "User enters email address or phone number \"\u003cMobileNo\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enters the password \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.step({
  "name": "Validate the user credentials in db and proceed to homepage \"\u003cMobileNo\u003e\"\"\u003cPassword\u003e\"\"https://www.facebook.com\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Validate all the urls working as expected",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "MobileNo",
        "Password"
      ]
    },
    {
      "cells": [
        "1111111111",
        "karna"
      ]
    },
    {
      "cells": [
        "2222222222",
        "kirthik"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login to facebook",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.embedding("image/png", "embedded2.png", null);
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User enters email address or phone number \"1111111111\"",
  "keyword": "When "
});
formatter.match({
  "location": "UserLogin.user_enters_email_address_or_phone_number(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the password \"karna\"",
  "keyword": "And "
});
formatter.match({
  "location": "UserLogin.user_enters_the_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "UserLogin.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the user credentials in db and proceed to homepage \"1111111111\"\"karna\"\"https://www.facebook.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "UserLogin.validate_the_user_credentials_in_db_and_proceed_to_homepage(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate all the urls working as expected",
  "keyword": "And "
});
formatter.match({
  "location": "UserLogin.validate_all_the_urls_working_as_expected()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login to facebook",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.embedding("image/png", "embedded4.png", null);
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User enters email address or phone number \"2222222222\"",
  "keyword": "When "
});
formatter.match({
  "location": "UserLogin.user_enters_email_address_or_phone_number(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the password \"kirthik\"",
  "keyword": "And "
});
formatter.match({
  "location": "UserLogin.user_enters_the_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "UserLogin.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the user credentials in db and proceed to homepage \"2222222222\"\"kirthik\"\"https://www.facebook.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "UserLogin.validate_the_user_credentials_in_db_and_proceed_to_homepage(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate all the urls working as expected",
  "keyword": "And "
});
formatter.match({
  "location": "UserLogin.validate_all_the_urls_working_as_expected()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded5.png", null);
formatter.after({
  "status": "passed"
});
});