package org.Step;

import java.util.List;
import java.util.Map;

import org.Pom.Checkout;
import org.Pom.Forgottonpass;
import org.Pom.Login;
import org.Pom.Paymentdetails;
import org.Pom.Search;
import org.base.Baseclass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Baseclass{



@Given("User have to launch the Threadless application through chrome Browser")
public void user_have_to_launch_the_Threadless_application_through_chrome_Browser() {
  lanchchromebrowser();
  launchurl("https://www.threadless.com/");
  maxi();
}

@When("User have to click the login button")
public void user_have_to_click_the_login_button() {
	Login L = new Login();
	WebElement login = L.getLogin();
	login.click();
}

@When("User have to enter the Valid user name and Valid password")
public void user_have_to_enter_the_Valid_user_name_and_Valid_password() {
	Login L = new Login();
	WebElement username = L.getUsername();
	passvalue(username, "abc123@email.com");
	WebElement password = L.getPassword();
	passvalue(password, "Abcd@1234");
}

@When("User have to click the Log Me In button")
public void user_have_to_click_the_Log_Me_In_button() {
	Login L = new Login();
	WebElement sumbit = L.getSumbit();
	sumbit.click();
}

@Then("To verify the page title")
public void to_verify_the_page_title() {
	getcurrenturl();
}

@When("User have to enter the InValid user name and InValid password")
public void user_have_to_enter_the_InValid_user_name_and_InValid_password() {
	Login L = new Login();
	WebElement username = L.getUsername();
	passvalue(username, "abcd@email.com");
	WebElement password = L.getPassword();
	passvalue(password, "Abcd@123fd4");
}
@When("User have to click the Forgotton password button")
public void user_have_to_click_the_Forgotton_password_button() {
	Forgottonpass f = new Forgottonpass();
	WebElement forgotton = f.getForgotton();
	forgotton.click();  
}

@When("User have to enter the Email in that textBox")
public void user_have_to_enter_the_Email_in_that_textBox() {
	Forgottonpass f = new Forgottonpass();
	WebElement email = f.getEmail();
	passvalue(email, "abc23@umail.com");
}

@Then("User have to click the Submit button")
public void user_have_to_click_the_Submit_button() {
	Forgottonpass f = new Forgottonpass();
	WebElement submit = f.getSubmit();
	submit.click();
}


@When("User have to enter the  {string} and  {string}")
public void user_have_to_enter_the_and(String username, String password) {
	Login L = new Login();
	L.getUsername().sendKeys(username);
	L.getPassword().sendKeys(password);
	L.getSumbit().click();
	
}
// one dimensional list
@When("User have to enter the Valid user name and InValid password")
public void user_have_to_enter_the_Valid_user_name_and_InValid_password(io.cucumber.datatable.DataTable d) {
	List<String> L = d.asList();
	
	Login l = new Login();
	l.getUsername().sendKeys(L.get(4));
	l.getPassword().sendKeys(L.get(5));
	l.getSumbit().click();
}
	// two dimensional list
@When("User have to enter with the Valid user name and InValid password")
public void user_have_to_enter_with_the_Valid_user_name_and_InValid_password(io.cucumber.datatable.DataTable d) {
    List<List<String>> L = d.asLists();
    List<String> L1 = L.get(2);
    Login l = new Login();
    l.getUsername().sendKeys(L1.get(0));
    l.getPassword().sendKeys(L1.get(1));
    l.getSumbit().click();
	
}
// 2D map
@When("User have to enter with the Valid user name and Valid password")
public void user_have_to_enter_with_the_Valid_user_name_and_Valid_password(io.cucumber.datatable.DataTable M) {
  List<Map<String, String>> Maps = M.asMaps();
  
  Map<String, String> map = Maps.get(0);
  String user = map.get("username");
  String pass = map.get("password");
  
  Login l = new Login();
  l.getUsername().sendKeys(user);
  l.getPassword().sendKeys(pass);
  l.getSumbit().click();
}


@When("User have to enter the product name in Search artist textbox")
public void user_have_to_enter_the_product_name_in_Search_artist_textbox() {
	Search s = new Search();
	WebElement searchItem = s.getSearchItem();
	
	
	
   
}

@When("User have to click the search icon")
public void user_have_to_click_the_search_icon() {
	Search s = new Search();
	s.getSearch().click();
	
}

@Then("User have to validate the Valid creadential page")
public void user_have_to_validate_the_Valid_creadential_page() {
    String url = driver.getCurrentUrl();
    if (url.contains("shirts")) {
    	System.out.println("valid page");
		
	} else {
		System.out.println("invalid page");

	}
  

   



  
	
	
	
}

@When("User have to enter the {string} name in Search artist textbox")
public void user_have_to_enter_the_name_in_Search_artist_textbox(String product) {
	Search s = new Search();
	s.getSearchItem().sendKeys(product);
	
}

@When("User have to select the gender")
public void user_have_to_select_the_gender() throws InterruptedException {
	Search s = new Search();
	s.getSelectGender().click();
	Thread.sleep(2000);
  
}

@When("User have to select the type")
public void user_have_to_select_the_type() throws InterruptedException {
	Search s = new Search();
	WebElement selectmodel = s.getSelectmodel();
	selectmodel.click();
	Thread.sleep(2000);
   
}

@When("User have to select the product")
public void user_have_to_select_the_product() throws InterruptedException {
	Search s = new Search();
	s.getSelectItem().click();
	Thread.sleep(2000);
   
}

@When("user have to select the fit")
public void user_have_to_select_the_fit() throws InterruptedException {
	Search s = new Search();
	s.getSelectfit().click();
	Thread.sleep(2000);
   
}

@When("user have to select the colourA")
public void user_have_to_select_the_colourA() throws InterruptedException {
	Search s = new Search();
	s.getSelectcolour().click();
	Thread.sleep(2000);
}

@When("user have to select the size")
public void user_have_to_select_the_size() throws InterruptedException {
	Search s = new Search();
	s.getSelectsize().click();
	Thread.sleep(2000);

}

@Then("User have to click the Add to cart buuton")
public void user_have_to_click_the_Add_to_cart_buuton() throws InterruptedException {
	Search s = new Search();
	WebElement addtocart = s.getAddtocart();
	addtocart.click();
	
}
@When("User have to select the gender and Type")
public void user_have_to_select_the_gender_and_Type() throws InterruptedException {
	Search s = new Search();
	s.getSelectGender().click();
	Thread.sleep(2000);
	WebElement selectmodel = s.getSelectmodel();
	selectmodel.click();
	Thread.sleep(2000);
	
   
	
  
}

@When("User have to select the fit,colour and size")
public void user_have_to_select_the_fit_colour_and_size() throws InterruptedException {
	Search s = new Search();
	s.getSelectfit().click();
	Thread.sleep(2000);
	s.getSelectcolour().click();
	Thread.sleep(2000);
	s.getSelectsize().click();
	Thread.sleep(2000);
   
}

@Then("User have to click the Add to cart button")
public void user_have_to_click_the_Add_to_cart_button() throws InterruptedException {
	Search s = new Search();
	WebElement addtocart = s.getAddtocart();
	addtocart.click();
	Thread.sleep(4000);
	s.getCheckout().click();
}




@When("User have to enter the Product name in Search artist textbox")
public void user_have_to_enter_the_Product_name_in_Search_artist_textbox() {
	Search s = new Search();
	WebElement searchItem = s.getSearchItem();
	passvalue(searchItem, "T-shirts");
	
  
}



@Given("User Have to check the Valid or Invalid Credential page")
public void user_Have_to_check_the_Valid_or_Invalid_Credential_page() {
	 String url = driver.getCurrentUrl();
	    if (url.contains("checkout")) {
	    	System.out.println("valid page");
			
		} else {
			System.out.println("invalid page");

		}
	
	
  
}

@When("User Have to Enter the Valid Details in Checkout Page")
public void user_Have_to_Enter_the_Valid_Details_in_Checkout_Page() {
	Checkout c = new Checkout();
	WebElement email = c.getEmail();
	passvalue(email, "abc@email.com");
	c.getCountry().sendKeys("united");
	c.getFirstname().sendKeys("vinai");
	c.getLastname().sendKeys("vs");
	c.getAddress1().sendKeys("132, My Street");
	c.getAddress2().sendKeys("kingston");
	c.getCity().sendKeys("newyork");
	WebElement state = c.getState();
	selectbyindex(state, 30);
	c.getPostal_code().sendKeys("12401");
	c.getPhonenumber().sendKeys("1234567890");
	c.getContinuebutton().click();
	//Thread.sleep(10000);
   
}

@Then("User have to click the Continue button")
public void user_have_to_click_the_Continue_button() {
  
}



@When("User have to select the product and Click AddtoCart button")
public void user_have_to_select_the_product_and_Click_AddtoCart_button() throws InterruptedException {
	Search S = new Search();
	
	S.getSearch().click();
	S.getSelectGender().click();
	Thread.sleep(2000);
	S.getSelectmodel().click();
	Thread.sleep(2000);
	S.getSelectItem().click();
	Thread.sleep(2000);
	S.getSelectfit().click();
	Thread.sleep(4000);
	S.getSelectcolour().click();
    S.getSelectsize().click();
    S.getAddtocart().click();
    Thread.sleep(3000);
   
	
	
  }

@When("user have to click the Securly Checkout button")
public void user_have_to_click_the_Securly_Checkout_button() throws InterruptedException {
	Search S = new Search();
	 S.getCheckout().click();
	 Thread.sleep(3000);
	
   
}

@When("user have to Enter the valid details in checkout Page")
public void user_have_to_Enter_the_valid_details_in_checkout_Page() throws InterruptedException {
	Checkout c = new Checkout();
	//c.getEmail().click();
	WebElement e = c.getEmail();
	jspassvalue("abc123@gmail.com", e);
	c.getCountry().sendKeys("united");
	c.getFirstname().sendKeys("vinai");
	c.getLastname().sendKeys("vs");
	c.getAddress1().sendKeys("132, My Street");
	c.getAddress2().sendKeys("kingston");
	c.getCity().sendKeys("newyork");
	WebElement state = c.getState();
	selectbyindex(state, 30);
	c.getPostal_code().sendKeys("12401");
	c.getPhonenumber().sendKeys("1234567890");
	
}

@Then("click the Continue button")
public void click_the_Continue_button() {
	Checkout c = new Checkout();
	c.getContinuebutton().click();
	
	
	
	
 
}



@When("user have to Enter  valid details in checkout Page")
public void user_have_to_Enter_valid_details_in_checkout_Page(io.cucumber.datatable.DataTable M) {
	List<Map<String, String>> List = M.asMaps();
	
	Map<String, String> m = List.get(0);
	
	String email = m.get("Email");
	String country = m.get("Country");
	String Fn = m.get("FirstName");
	String Ln = m.get("LastName");
	String Ad1 = m.get("Address1");
	String Ad2 = m.get("address2");
	String City = m.get("City");
	String st = m.get("State");
	String Pc = m.get("postalcode");
	String Phn = m.get("phoneNum");
	Checkout c = new Checkout();
	c.getEmail().sendKeys(email);
	c.getCountry().sendKeys(country);
	c.getFirstname().sendKeys(Fn);
	c.getLastname().sendKeys(Ln);
	c.getAddress1().sendKeys(Ad1);
	c.getAddress2().sendKeys(Ad2);
	c.getCity().sendKeys(City);
	c.getState().sendKeys(st);
	c.getPostal_code().sendKeys(Pc);
	c.getPhonenumber().sendKeys(Phn);
}



@When("User have to select the product,Click AddtoCart button and click Securly Checkout button")
public void user_have_to_select_the_product_Click_AddtoCart_button_and_click_Securly_Checkout_button() throws InterruptedException {
Search S = new Search();
	S.getSearch().click();
	S.getSelectGender().click();
	Thread.sleep(2000);
	S.getSelectmodel().click();
	Thread.sleep(2000);
	S.getSelectItem().click();
	Thread.sleep(2000);
	S.getSelectfit().click();
	Thread.sleep(4000);
	S.getSelectcolour().click();
    S.getSelectsize().click();
    S.getAddtocart().click();
    Thread.sleep(3000);
    S.getCheckout().click();
	 Thread.sleep(3000);	
}

@When("user have to Enter  valid details in checkout Page and click the Continue button")
public void user_have_to_Enter_valid_details_in_checkout_Page_and_click_the_Continue_button(io.cucumber.datatable.DataTable M) throws InterruptedException {
List<Map<String, String>> List = M.asMaps();
	
	Map<String, String> m = List.get(0);
	
	String email = m.get("Email");
	String country = m.get("Country");
	String Fn = m.get("FirstName");
	String Ln = m.get("LastName");
	String Ad1 = m.get("Address1");
	String Ad2 = m.get("address2");
	String City = m.get("City");
	String st = m.get("State");
	String Pc = m.get("postalcode");
	String Phn = m.get("phoneNum");
	Checkout c = new Checkout();
	c.getEmail().sendKeys(email);
	c.getCountry().sendKeys(country);
	c.getFirstname().sendKeys(Fn);
	c.getLastname().sendKeys(Ln);
	c.getAddress1().sendKeys(Ad1);
	c.getAddress2().sendKeys(Ad2);
	c.getCity().sendKeys(City);
	c.getState().sendKeys(st);
	c.getPostal_code().sendKeys(Pc);
	c.getPhonenumber().sendKeys(Phn);
	c.getContinuebutton().click();
	Thread.sleep(10000);
}

@When("User Have to select the Payment Method")
public void user_Have_to_select_the_Payment_Method() {
	Paymentdetails p = new Paymentdetails();
   p.getPaymentMethod().click();
}

@When("user have to enter the Valid Card Details")
public void user_have_to_enter_the_Valid_Card_Details(io.cucumber.datatable.DataTable M) throws InterruptedException {
	List<Map<String, String>> List = M.asMaps();
Map<String, String> m = List.get(0);
String Ccnum = m.get("CCnumber");
String expdate = m.get("CCexpdate");
String cvv = m.get("CVV");
String pc = m.get("Postalcode");
Paymentdetails p = new Paymentdetails();
WebElement fcreditcardnumber = p.getFcreditcardnumber();
driver.switchTo().frame(fcreditcardnumber);
p.getCreditcardnumber().sendKeys(Ccnum);
driver.switchTo().defaultContent();
WebElement fcCexpdate = p.getFCCexpdate();
driver.switchTo().frame(fcCexpdate);
p.getCCexpdate().sendKeys(expdate);
driver.switchTo().defaultContent();
WebElement fCvv = p.getFCvv();
driver.switchTo().frame(fCvv);
p.getCvv().sendKeys(cvv);
driver.switchTo().defaultContent();
WebElement fpostalcode = p.getFpostalcode();
driver.switchTo().frame(fpostalcode);
p.getPostalcode().sendKeys(pc);
driver.switchTo().defaultContent();
Thread.sleep(2000);



	
	
	
  }

@Then("User have to click the placeOrder button")
public void user_have_to_click_the_placeOrder_button() {
	Paymentdetails p = new Paymentdetails();
	p.getPlaceorder().click();
   
}
















	
	
	
	
   





	
	
	
	
	
	
	
   
}

























