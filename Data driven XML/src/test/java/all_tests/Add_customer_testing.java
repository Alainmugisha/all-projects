package all_tests;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
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
	
	@Parameters({"username","password","fullName","companyName","email","phone","address","city","state","Zip"})
	public void add_customer_testing(String username, String password, String fullname,String companyName,String email,String phoneNumber,String address,String city,String state,String zip) throws Throwable {
		
		driver = Pagefactory.startingBrowser();	
		
		login = PageFactory.initElements(driver, LoginPage_elements.class);
		dashboard = PageFactory.initElements(driver, Dashboard_page_elements.class);
		add_customer = PageFactory.initElements(driver,  Add_Customer_elements.class);
		
	
		login.username_method(username);
		login.password_method(password);
		login.submit_button_method();
		login.verify_dashboard_method();
		
		dashboard.click_customer_button();
		dashboard.click_Add_CUSTOMERS_BUTTON();
		dashboard.verify_contact_page();
	   Thread.sleep(2000);
		
	  Random rand = new Random();
	  int randomNumber = rand.nextInt(999);
	  
	   
	   add_customer.enter_full_name(fullname+randomNumber);
	   add_customer.select_company_name(companyName);
	   add_customer.enter_email(randomNumber+email);
	   add_customer.enter_phone_number(randomNumber+phoneNumber);
	   add_customer.enter_address(address);
	   add_customer.enter_city(city);
	   add_customer.enter_state_or_region(state);
	   add_customer.enter_Zip_code(zip);
	   add_customer.click_save_button();
	   add_customer.takescreenshhot();
	   
	   
		driver = Pagefactory.closeBrowser();	
		
	}
	
}
