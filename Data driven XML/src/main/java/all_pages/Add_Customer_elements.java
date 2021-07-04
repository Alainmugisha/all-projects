package all_pages;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Add_Customer_elements {

	WebDriver driver;

	public Add_Customer_elements(WebDriver driver) {
		this.driver = driver;
	}


	@FindBy(how = How.XPATH, using = "//input[@id=\"account\"]")
	WebElement FULL_NAME_FIELD;

	@FindBy(how = How.XPATH, using = "//select[@id=\"cid\"]")
	WebElement COMPANY_NAME_FIELD;

	@FindBy(how = How.XPATH, using = "//input[@id=\"email\"]")
	WebElement EMAIL_FIELD;

	@FindBy(how = How.XPATH, using = "//input[@id=\"phone\"]")
	WebElement PHONE_FIELD;

	@FindBy(how = How.XPATH, using = "//input[@id=\"address\"]")
	WebElement ADDRESS_FIELD;

	@FindBy(how = How.XPATH, using = "//INPUT[@id=\"city\"]")
	WebElement CITY_FIELD;

	@FindBy(how = How.XPATH, using = "//input[@id=\"state\"]")
	WebElement STATE_REGION_FIELD;

	@FindBy(how = How.XPATH, using = "//input[@id=\"zip\"]")
	WebElement ZIP_code_FIELD;

	@FindBy(how = How.XPATH, using = "//*[@id=\"rform\"]/div[1]/div[1]/div[9]/div/span/span[1]/span")
	WebElement COUNTRY_FIELD;

	@FindBy(how = How.XPATH, using = "//button[@id=\"submit\"]")
	WebElement SAVE_BUTTON;
	


	public void enter_full_name(String fullname) {
		FULL_NAME_FIELD.sendKeys(fullname);
	}

	public void select_company_name(String companyName) {
		Select select = new Select(COMPANY_NAME_FIELD);
		select.selectByVisibleText(companyName);
	}

	public void enter_email(String email) {
		EMAIL_FIELD.sendKeys(email);
	}

	public void enter_phone_number(String phoneNumber) {
		PHONE_FIELD.sendKeys(phoneNumber);
	}

	public void enter_address(String address) {
		ADDRESS_FIELD.sendKeys(address);
	}

	public void enter_city(String city) {
		CITY_FIELD.sendKeys(city);
	}

	public void enter_state_or_region(String state) {
		STATE_REGION_FIELD.sendKeys(state);
	}

	public void enter_Zip_code(String zip) {
		ZIP_code_FIELD.sendKeys(zip);
	}

	public void select_country(String country) {
		Select select = new Select(COUNTRY_FIELD);
		select.selectByVisibleText(country);
	}

	public void click_save_button() {
		SAVE_BUTTON.click();
	}
	
	public void takescreenshhot() throws Throwable {
		Thread.sleep(2000);

		TakesScreenshot ts = ((TakesScreenshot) driver);
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		String label = formatter.format(date);
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);

		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(sourceFile, new File(currentDir + "/screenshots/" + label + ".png"));
	}

}
