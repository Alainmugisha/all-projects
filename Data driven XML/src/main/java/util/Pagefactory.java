package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Pagefactory {

	static WebDriver driver;

	public static WebDriver startingBrowser() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Alain Mickey\\Desktop\\All Java project____eclipse\\maven projects\\DATA_DRIVEN (for submission)\\data_driven\\Chrome driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://techfios.com/billing/?ng=login/after/dashboard");
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);

		System.out.println("Chrome browser opened succesfully");

		return driver;
	}

	@AfterMethod
	public static WebDriver closeBrowser() throws Throwable {
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		System.out.println("Chrome browser Closed succesfully");
		
		return driver;

	}

}
