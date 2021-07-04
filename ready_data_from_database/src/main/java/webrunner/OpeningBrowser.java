package webrunner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningBrowser {

	static WebDriver driver;
	public static WebDriver startBrowser () {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alain Mickey\\Desktop\\ChromeDriver\\Chrome driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.techfios.com/billing/?ng=admin/");
	return driver;
	}


	public static WebDriver tearDown () throws Throwable  {
		Thread.sleep(2000);
	
		driver.quit();
		return driver;
	}
}
