package app;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestPage {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		Login lp=PageFactory.initElements(driver, Login.class);//creating object
		lp.loginfunction("admin@yourstore.com","admin");
		
		
		DashboardPage dp=PageFactory.initElements(driver, DashboardPage.class);
		System.out.println(dp.getDashboarPageTitle());
		dp.clickOnCatalogLink();
		dp.clickOnProductsLink();
		Thread.sleep(2000);
		
		ProductsPage pp=PageFactory.initElements(driver, ProductsPage.class);
		System.out.println(pp.getProductsPageTitle());
	    pp.productsSearchFunction("Apple MacBook Pro 13-inch");
	    pp.clearinputfiled();
	    Thread.sleep(2000);
	    pp.productsSearchFunction("Lenovo IdeaCentre 600 All-in-One PC");
		
		
	}

}
