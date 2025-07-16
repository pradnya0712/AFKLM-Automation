package testCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.Assertion;

public class BaseClass {
	
	public static WebDriver driver;
    public static WebDriverWait wait;
    public static Properties dataFile;
    public static Properties configFile;
    public static  Properties config;
   
    public static Properties loadPropertiesfile(String[] fileNames) throws IOException {
    	dataFile = new Properties();
    	for (String fileName : fileNames) {
            FileInputStream file = new FileInputStream(fileName);
            dataFile.load(file);
           // System.out.println("Loaded file: " + fileName);
        }
        return dataFile;
    }
    
    
     
	@BeforeClass(groups="regression")
    //@BeforeSuite(groups="regression")
	public void launchBrowser() throws InterruptedException, IOException {
	
//		load properties file
//    	FileInputStream file = new FileInputStream(
//				System.getProperty("user.dir") + "\\src\\test\\resources\\data.properties");
//		dataFile = new Properties();
//		dataFile.load(file);
		
//		FileInputStream file1 = new FileInputStream(
//				System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties");
//		configFile = new Properties();
//		configFile.load(file1);
    	
    	
    	String file1=System.getProperty("user.dir") + "\\src\\test\\resources\\data.properties";
    	String file2=System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";
    	String[] configFiles = {file1,file2 };
         config = loadPropertiesfile(configFiles);
		
		String browser=config.getProperty("browser");
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
		String url =config.getProperty("url");

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
