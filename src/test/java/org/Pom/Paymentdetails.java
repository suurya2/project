package org.Pom;


import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Paymentdetails  extends Baseclass{
	public Paymentdetails() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='braintree-option braintree-option__card']")
	WebElement PaymentMethod;
	@FindBy(xpath="//iframe[@type='number']")
	WebElement Fcreditcardnumber;
	@FindBy(name="credit-card-number")
	WebElement creditcardnumber;
	@FindBy(xpath="//iframe[@type='expirationDate']")
	WebElement FCCexpdate;
	@FindBy(xpath="//input[@class='expirationDate']")
	WebElement CCexpdate;
    @FindBy(xpath="//iframe[@type='cvv']")
    WebElement FCvv;
    @FindBy(id="cvv")
    WebElement Cvv;
	@FindBy(xpath="//iframe[@type='postalCode']")
	WebElement Fpostalcode;
	@FindBy(xpath="//input[@class='postalCode']")
	WebElement postalcode;
	@FindBy(xpath="//button[@class='order-control--submit submit_payment_info_form']")
	WebElement placeorder;
	public WebElement getPaymentMethod() {
		return PaymentMethod;
	}
	public WebElement getFcreditcardnumber() {
		return Fcreditcardnumber;
	}
	public WebElement getCreditcardnumber() {
		return creditcardnumber;
	}
	public WebElement getFCCexpdate() {
		return FCCexpdate;
	}
	public WebElement getCCexpdate() {
		return CCexpdate;
	}
	public WebElement getFCvv() {
		return FCvv;
	}
	public WebElement getCvv() {
		return Cvv;
	}
	public WebElement getFpostalcode() {
		return Fpostalcode;
	}
	public WebElement getPostalcode() {
		return postalcode;
	}
	public WebElement getPlaceorder() {
		return placeorder;
	}
	
	
	
	

	
}
