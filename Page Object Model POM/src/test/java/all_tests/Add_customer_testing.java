package all_tests;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import all_pages.Add_Customer_elements;
import all_pages.Dashboard_page_elements;
import all_pages.LoginPage_elements;
import util.Pagefactory;

public class Add_customer_testing {
	
	WebDriver driver;
	
	LoginPage_elements login;
	Dashboard_page_elements  dashboard;
	Add_Customer_elements add_customer ;
	 
   @Test
	public void add_customer_testing() throws Throwable {
		
		driver = Pagefactory.startingBrowser();	
		
		login = PageFactory.initElements(driver, LoginPage_elements.class);
		dashboard = PageFactory.initElements(driver, Dashboard_page_elements.class);
		add_customer = PageFactory.initElements(driver,  Add_Customer_elements.class);
		
	
		login.username_method("demo@techfios.com");
		login.password_method("abc123");
		login.submit_button_method();
		login.verify_dashboard_method();
		
		dashboard.click_customer_button();
		dashboard.click_Add_CUSTOMERS_BUTTON();
		dashboard.verify_contact_page();
		
	  Random rand = new Random();
	  int randomNumber = rand.nextInt(999);
	  
	   
	   add_customer.enter_full_name("M.....Alain"+randomNumber);
	   add_customer.select_company_name("Alain.inc");
	   add_customer.enter_email(randomNumber+"alain@techfios.com");
	   add_customer.enter_phone_number(randomNumber+"0987654321");
	   add_customer.enter_address("northdallas");
	   add_customer.enter_city("carrollton");
	   add_customer.enter_state_or_region("Texas");
	   add_customer.enter_Zip_code("00000");
	   add_customer.click_save_button();
	   add_customer.takescreenshhot();
	   
	   
		driver = Pagefactory.closeBrowser();	
		
	}
	
}
