package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import webrunner.OpeningBrowser;

public class Login_page_elements extends OpeningBrowser {
	WebDriver driver;
	SoftAssert soft = new SoftAssert();
	
	public Login_page_elements(WebDriver driver) {
	this.driver = driver;
	}
	// Element library
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement User_Name;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SignIn;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2")
	WebElement Dashboard_page;
	
	
	public void enterUserName(String userName) {
	User_Name.sendKeys(userName);
	}
	public void enterPassword(String password) {
	Password.sendKeys(password);
	}
	
public void Verify_loginpage() {
		
	}

	
	public void clickOnSignInButton() {
	SignIn.click();
	}
	public void Verify_dashboard() {
		
		String actualTitle = driver.getTitle();
		
		String expectedTitle =  Dashboard_page.getText();
		
	soft.assertEquals(actualTitle, expectedTitle);
		
	}

}
