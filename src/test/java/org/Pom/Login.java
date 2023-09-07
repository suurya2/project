package org.Pom;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends Baseclass {
	public Login() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Login']")
	WebElement Login;
	@FindBy(name="username")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="login_threadless")
	WebElement sumbit;
	public WebElement getLogin() {
		return Login;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSumbit() {
		return sumbit;
	}


}
