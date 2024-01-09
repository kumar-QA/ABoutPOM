package app;

import java.awt.Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	public Menu menu=null;
	public DashboardPage(WebDriver driver){
		PageFactory.initElements(driver, Menu.class);
	}
	
	@FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
	WebElement pagetitle;
	
	@FindBy(xpath = "//i[@class=\"nav-icon fas fa-book\"]")
	WebElement catalog;
	
	@FindBy(xpath = "//a[@href=\"/Admin/Product/List\"]")
	WebElement products;
	
	
	 public String getDashboarPageTitle() {
		return  pagetitle.getText();
		 
	 }
	public void clickOnCatalogLink() {
		catalog.click();
	}
	public void clickOnProductsLink() {
		products.click();
		
	}

}
