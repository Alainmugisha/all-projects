package all_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dashboard_page_elements {

	WebDriver driver;

	public Dashboard_page_elements(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a")
	WebElement CUSTOMERS_BUTTON;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")
	WebElement Add_CUSTOMERS_BUTTON;

	
	
	public void click_customer_button() {
		CUSTOMERS_BUTTON.click();
	}

	public void click_Add_CUSTOMERS_BUTTON() {
		Add_CUSTOMERS_BUTTON.click();
	}

	public void verify_contact_page() {
		String expectedTitle = "Contacts - iBilling";
		String Actual_title = driver.getTitle();
		String message = "page verification fail";
		Assert.assertEquals(Actual_title, expectedTitle, "message");

	}

}
