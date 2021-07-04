package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.Database_reader;
import pages.Login_page_elements;
import webrunner.OpeningBrowser;

public class Login_test {

	WebDriver driver;
	SoftAssert soft = new SoftAssert();
	

	@BeforeMethod
	public void init() {
		driver = OpeningBrowser.startBrowser();
	}
	@Test
	public void login_page() throws Throwable {

		Login_page_elements loginpage = PageFactory.initElements(driver, Login_page_elements.class);



		loginpage.enterUserName(Database_reader.retrieve_data("username"));
		loginpage.enterPassword(Database_reader.retrieve_data("password"));
		

		
		loginpage.clickOnSignInButton();

		System.out.print("\n " + driver.getTitle() + "\n ");

	}

	@AfterMethod
	public void closingBrowser() throws Throwable {
		OpeningBrowser.tearDown();
	}

}
