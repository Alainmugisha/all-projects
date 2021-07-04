package all_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import all_pages.Add_Customer_elements;
import all_pages.Dashboard_page_elements;
import all_pages.LoginPage_elements;
import util.Pagefactory;

public class Dashboard_page_testing {
	
	WebDriver driver;
	
	LoginPage_elements login;
	Dashboard_page_elements  dashboard;
	 
   @Test
	public void dashboard_testing() throws Throwable {
		
		driver = Pagefactory.startingBrowser();	
		
		login = PageFactory.initElements(driver, LoginPage_elements.class);
		dashboard = PageFactory.initElements(driver, Dashboard_page_elements.class);
		
		
		login.username_method("demo@techfios.com");
		login.password_method("abc123");
		login.submit_button_method();
		login.verify_dashboard_method();
		
		dashboard.click_customer_button();
		dashboard.click_Add_CUSTOMERS_BUTTON();
		dashboard.verify_contact_page();
		
	    driver = Pagefactory.closeBrowser();	
		
	}
	
}
