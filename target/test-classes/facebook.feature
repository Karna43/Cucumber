Feature: Facebook Create Account

Background: Facebook launching function
Given Click on Create new account

@createaccount
Scenario Outline: User enters values for all fields and Click on create new account
When User enters first name "<Firstname>"
And User enters surname "<Surname>"
And User enters mobile number or email address "<MobileNo>"
And User enters password "<Password>"
And User selects date of birth "<Date>"
And User selects month of birth "<Month>"
And User selects year of birth "<Year>"
And User selects gender "<Gender>"
And User clicks on sign up button
Then Validate if user account exists in db "<MobileNo>"
And Create new user account in db after validating all input fields "<Firstname>""<Surname>""<MobileNo>""<Date>""<Month>""<Year>""<Gender>""<Password>"
And Take screenshot after validation "<Firstname>"

Examples: 

|Firstname|Surname	|MobileNo    |Password |Date|Month|Year|Gender|
|Karna  	|S  			|1111111111	 |karna    |15  |Oct  |1995|Male|
|Kirthik	|J  			|2222222222	 |kirthik  |20  |May 	|1997|Male|
|Ranjith	|S 				|3333333333	 |ranjith  |25  |Feb 	|1997|Male|
|Priya  	|P  			|4444444444	 |priya    |10  |Dec 	|1999|Female|
