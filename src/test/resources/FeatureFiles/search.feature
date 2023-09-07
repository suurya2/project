@Search
Feature: To Validate the Search products functionality in threadless application

Background:
Given User have to launch the Threadless application through chrome Browser
@smoke
Scenario Outline:

To validate the Search products with any product name

When  User have to enter the "<product>" name in Search artist textbox
And User have to click the search icon
Then User have to validate the Valid creadential page
Examples:
|product|
|T-shirts|




