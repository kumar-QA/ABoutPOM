package app;

import java.awt.Menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	public Menu menu=null;
	
 public	Login(WebDriver driver){
		PageFactory.initElements(driver, Menu.class);//initliaxing the webelement
	}
	
	@FindBy(id="Email")
	WebElement username;
	
	@FindBy(name="Password")
	WebElement  pwd;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginButton;
	
	   public void loginfunction(String uname,String pass) {
		   username.clear();
		   username.sendKeys(uname);
		   pwd.clear();
		   pwd.sendKeys(pass);
		   loginButton.click();
	   }

}
