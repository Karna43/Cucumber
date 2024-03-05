Feature: Facebook Login

@login
Scenario Outline: Login to facebook
When User enters email address or phone number "<MobileNo>"
And User enters the password "<Password>"
And User clicks on login button
Then Validate the user credentials in db and proceed to homepage "<MobileNo>""<Password>""https://www.facebook.com"
And Validate all the urls working as expected

Examples: 

|MobileNo    |Password |
|1111111111	 |karna    |
|2222222222	 |kirthik	 |