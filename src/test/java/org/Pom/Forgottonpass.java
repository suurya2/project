package org.Pom;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Forgottonpass extends Baseclass {
	public Forgottonpass() {
		PageFactory.initElements(driver, this);
		
	}
	

@FindBy(xpath="//a[text()='Login']")
WebElement Login;
@FindBy(name="username")
WebElement username;
@FindBy(xpath="//a[text()='Forgot your password?']")
WebElement forgotton;
@FindBy(xpath="(//input[@type=\"email\"])[2]")
WebElement Email;
@FindBy(xpath="//button[text()=\"Submit\"]")
WebElement Submit;
public WebElement getLogin() {
	return Login;
}
public WebElement getUsername() {
	return username;
}
public WebElement getForgotton() {
	return forgotton;
}
public WebElement getEmail() {
	return Email;
}
public WebElement getSubmit() {
	return Submit;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
