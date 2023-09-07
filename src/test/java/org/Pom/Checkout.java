package org.Pom;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout extends Baseclass {
	public Checkout() {
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(id="order-email")
	WebElement Email;
	@FindBy(name="country")
	WebElement country;
	@FindBy(name="first_name")
	WebElement firstname;
	@FindBy(name="last_name")
	WebElement Lastname;
	@FindBy(name="address1")
	WebElement address1;
	@FindBy(name="address2")
	WebElement address2;
	@FindBy(name="city")
	WebElement city;
	@FindBy(name="state")
	WebElement state;
	@FindBy(name="postal_code")
	WebElement postal_code;
	@FindBy(name="phone")
	WebElement phonenumber;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	WebElement Continuebutton;
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getCountry() {
		return country;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return Lastname;
	}
	public WebElement getAddress1() {
		return address1;
	}
	public WebElement getAddress2() {
		return address2;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getPostal_code() {
		return postal_code;
	}
	public WebElement getPhonenumber() {
		return phonenumber;
	}
	public WebElement getContinuebutton() {
		return Continuebutton;
	}
	
	
	
	
	
	
	
	
	
	
	

}
