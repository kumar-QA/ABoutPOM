package app;

import java.awt.Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	
	public Menu menu=null;
	
	public ProductsPage(WebDriver driver){
		PageFactory.initElements(driver, Menu.class);
	}
	@FindBy(xpath="//h1[contains(text(),'Products')]")
	WebElement ProductsPageTitle;
	
	@FindBy(id="SearchProductName")
	WebElement productnameInputFiled;
	
	@FindBy(id="search-products")
	WebElement searchBtn;
	
	
	 public String getProductsPageTitle() {
		return  ProductsPageTitle.getText();
	 }
	  
	 public void productsSearchFunction(String productname) {
		 productnameInputFiled.sendKeys(productname);
		 searchBtn.click();
	 }
	 public void clearinputfiled() {
		 productnameInputFiled.clear();
	 }

	 
	 
}
