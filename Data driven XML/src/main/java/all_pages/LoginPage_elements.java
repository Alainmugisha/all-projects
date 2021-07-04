package all_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import util.Pagefactory;

public class LoginPage_elements{
	WebDriver driver;	
	public  LoginPage_elements(WebDriver driver) {
	this.driver = driver;	
		
	}
	
@FindBy (how = How.XPATH, using = "//input[@id=\"username\"]") WebElement USERNAME_FIELD;
@FindBy (how = How.XPATH, using = "//input[@id=\"password\"]") WebElement PASSWORD_FIELD;
@FindBy (how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button") WebElement SUBMIT_BUTTON;
	
public void username_method (String username) {
	
	 USERNAME_FIELD.sendKeys(username);
}
public void password_method (String password) {
	
	PASSWORD_FIELD.sendKeys(password);
}
public void submit_button_method () {
	
	SUBMIT_BUTTON.click();
}

public void verify_dashboard_method () {

String expectedTitle = "Dashboard- iBilling";
String actualTitle = driver.getTitle();
Assert.assertEquals(actualTitle, expectedTitle);
}
}