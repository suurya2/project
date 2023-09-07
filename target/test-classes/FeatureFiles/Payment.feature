@payment
Feature: To validate the payment page Functionality in ThreadLess Application
Scenario: To validate the payment page Functionality with Valid Card Details
Given User have to launch the Threadless application through chrome Browser
When User have to enter the Product name in Search artist textbox
And User have to select the product,Click AddtoCart button and click Securly Checkout button
And user have to Enter  valid details in checkout Page and click the Continue button
|Email|Country|FirstName|LastName|Address1|address2|City|State|postalcode|phoneNum|
|abc123@gmail.com|United|Virat|Vk|Royal,street|newbuilding|Neywork|Neywork|12354|1234567890|
And User Have to select the Payment Method
And user have to enter the Valid Card Details 
|CCnumber|CCexpdate|CVV|Postalcode|
|4444444444445555|0229|782|12401|
Then  User have to click the placeOrder button


 