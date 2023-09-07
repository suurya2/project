@login
Feature: To Validate the Login Functionality of Threadless Application

Background:
Given User have to launch the Threadless application through chrome Browser


@valid
Scenario: To validate the Login with Valid user name and Valid password

When User have to click the login button
And User have to enter with the Valid user name and Valid password
|username|password|
|abc123@email.com|Abcd@1234|


And User have to click the Log Me In button
Then To verify the page title

@Smoke
Scenario: To validate the Login with Valid user name and InValid password
When User have to click the login button
And User have to enter with the Valid user name and InValid password
|frames@123|abc|
|java@25pt|78946|
|abc123@email.com|7894566|

And User have to click the Log Me In button
Then To verify the page title
        
@invalid
Scenario Outline:

 To validate the  Login with InValid user name and InValid password

When User have to click the login button
And User have to enter the  "<username>" and  "<password>"     
And User have to click the Log Me In button
Then To verify the page title

Examples:
        |username|password|
        |frames@123|12345|
        |java@345|789|
        |abc@gmail.com|bcd@789|
        
        

