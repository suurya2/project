@checkout
Feature: To Validate the Checkout Page Functinality in ThreadLess Application
Scenario: To validate the Checkout Page Functinality with Valid Details
Given User have to launch the Threadless application through chrome Browser
When User have to enter the Product name in Search artist textbox
And User have to select the product and Click AddtoCart button
And user have to click the Securly Checkout button
And user have to Enter  valid details in checkout Page
|Email|Country|FirstName|LastName|Address1|address2|City|State|postalcode|phoneNum|
|abc123@gmail.com|United|Virat|Vk|Royal,street|newbuilding|Neywork|Neywork|12354|1234567890|
Then click the Continue button
















