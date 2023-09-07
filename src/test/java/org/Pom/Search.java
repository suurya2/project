package org.Pom;


import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search extends Baseclass {

		public Search() {
			PageFactory.initElements(driver, this);
		}
		@FindBy(id="search")
		WebElement SearchItem;
		@FindBy(xpath="(//button[@type='submit'])[1]")
		WebElement Search;
		@FindBy(xpath="(//a[@class='pjax-link btn-checkbox'])[1]")
		WebElement SelectGender;
		@FindBy(xpath="//a[@data-event='v-neck']")
		WebElement Selectmodel;
		@FindBy(xpath="(//img[@class='img-responsive lazyloaded'])[4]")
		WebElement SelectItem;
		@FindBy(xpath="//a[@class='pjax-link pdp-button-selected']")
		WebElement selectfit;
		@FindBy(xpath="(//a[@class='pjax-link color-link'])[1]")
		WebElement Selectcolour;
		@FindBy(xpath="(//span[@class='product-type'])[5]")
		WebElement Selectsize;
		@FindBy(xpath="//button[@class='productPicker-cart']")
		WebElement Addtocart;
		@FindBy(id="mpCheckout")
		WebElement Checkout;
		public WebElement getSearchItem() {
			return SearchItem;
		}
		public WebElement getSearch() {
			return Search;
		}
		public WebElement getSelectGender() {
			return SelectGender;
		}
		public WebElement getSelectmodel() {
			return Selectmodel;
		}
		public WebElement getSelectItem() {
			return SelectItem;
		}
		public WebElement getSelectfit() {
			return selectfit;
		}
		public WebElement getSelectcolour() {
			return Selectcolour;
		}
		public WebElement getSelectsize() {
			return Selectsize;
		}
		public WebElement getAddtocart() {
			return Addtocart;
		}
		public WebElement getCheckout() {
			return Checkout;
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
