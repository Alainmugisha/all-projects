package all_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import all_pages.LoginPage_elements;
import util.Pagefactory;

public class Login_page_testing {
	
	WebDriver driver;	
	
	LoginPage_elements login;
	
@Test	
	
	@Parameters({"username", "password"})
public void login_testing (String username, String password) throws Throwable {
	
	driver = Pagefactory.startingBrowser();	
			
	login = PageFactory.initElements(driver, LoginPage_elements.class);
	
	login.username_method(username);
	login.password_method(password);
	login.submit_button_method();
	login.verify_dashboard_method();
	
	driver = Pagefactory.closeBrowser();
}
		
}
