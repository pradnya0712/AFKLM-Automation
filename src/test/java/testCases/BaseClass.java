package testCases;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public static WebDriver driver;
    public static WebDriverWait wait;
   
     
	@BeforeClass
	public void launchBrowser() throws InterruptedException, IOException {
	
		commonMethods.loadPropertiesFile();
		String browser=commonMethods.dataFile.getProperty("browser");
		System.out.println(browser);

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();

		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();

		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();

		} else {
			System.out.println("Please provide the correct browser name");
			driver.close();

		}
		System.out.println("Browser open successfully");
		driver.manage().window().maximize();
		
	
		launchUrl();

	}

	
	public void launchUrl() throws InterruptedException {
		String url = commonMethods.dataFile.getProperty("url");

		if (url != null && !url.isEmpty()) {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		} else {
			System.out.println("URL is not provided in the properties file.");
		}

	}
	//@AfterClass
	public void closeBrowser() {
		if (driver != null) {
			driver.close();
			System.out.println("Browesr closed successfully.");
		}
	}
}
