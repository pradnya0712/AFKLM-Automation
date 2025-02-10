package testCases;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class commonMethods extends BaseClass {

	public static Properties dataFile;
	public static JavascriptExecutor js;
	public static Actions actions;

	public static void loadPropertiesFile() throws IOException {
		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\testData\\data.properties");
		dataFile = new Properties();
		dataFile.load(file);
	}

	public static void switchToNewWindow() {

		String mainWindowHandle = driver.getWindowHandle();
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.numberOfWindowsToBe(2));

		for (String windowHandle : driver.getWindowHandles()) {
			if (!windowHandle.equals(mainWindowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}

	}

	public static void acceptPopup() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		boolean isPopUpPresent = false;
		try {
			WebElement popup = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//*[contains(text(),'User already logged in. ')]")));
			isPopUpPresent = popup.isDisplayed();
		} catch (Exception e) {
			isPopUpPresent = false;
		}

		if (isPopUpPresent) {
			System.out.println("Popup is present");
			driver.findElement(By.xpath("//*[@id='sessionConfirmAlertForm_sessionYesButton']")).click();
		} else {
			System.out.println("Popup is not displayed");
		}
	}

	public static void searchMasterScreen(String screenname) {

		driver.findElement(By.xpath("//*[@id='menuSearchAction']")).click();
		driver.findElement(By.xpath("//*[@id='menuSearch']")).sendKeys(screenname);
		driver.findElement(By.xpath("(//*[contains(@title, '" + screenname + "')])[1]")).click();
	}

	public static String EightDigitSerialNum() {

		String getSerialNumber = dataFile.getProperty("SerialNumber");

		int serialNum = Integer.parseInt(getSerialNumber);

		int modValue = Math.floorMod(serialNum, 7);

		String serailNumber = getSerialNumber + modValue;

		return serailNumber;

	}

	public static void zoom(String zoom) {
		js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='" + zoom + "'");
	}

	public static void selectDropDown(WebElement element, String value) {

		Select dropDown = new Select(element);
		dropDown.selectByValue(value);
//		dropDown.selectByContainsVisibleText(value);

	}

	public static void takeScreenSot(String title) throws IOException {

		LocalDate date = LocalDate.now();

		// Replace "-" with "_"
		String d = date.toString().replaceAll("-", "_");

		// Get current time
		LocalTime time = LocalTime.now();

		// Define a formatter for time (12-hour format with AM/PM)
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh_mm_ss_a");

		// Define a formatter for date (using correct pattern for month: MM)
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd_MM_yyyy");

		// Format the date
		String Date = date.format(dateFormatter);
		// System.out.print("Formatted Date: " + Date + "\n");

		// Format the time
		String formattedTime = time.format(timeFormatter);

		// Replace ":" and " " with "_"
		String Time = formattedTime.replaceAll(":", "_").replaceAll(" ", "_");

		// Print the final formatted time
//			System.out.print("Formatted Time: _" + Time);
//			System.out.println();
//			System.out.println(Date + "_" + Time+"_"+title);

		String folderPath = System.getProperty("user.dir") + "\\logs\\" + Date;
		// String screenshotName = "Screenshot_" + Date + "_" + Time + ".png";
		File mainScreenShotFolder = new File(folderPath);
		if (!mainScreenShotFolder.exists()) {
			mainScreenShotFolder.mkdirs(); // Create directories including any missing parent directories
		}

		String subfolderPath = folderPath + "\\" + title;
		File subScreenShotFolder = new File(subfolderPath);
		if (!subScreenShotFolder.exists()) {
			subScreenShotFolder.mkdirs(); // Create the subfolder if it doesn't exist
		}
		// Generate screenshot file name
		String screenshotName = title + " " + formattedTime + ".png";

		// Capture screenshot
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// Save the screenshot in the folder with the generated name
		File destination = new File(subScreenShotFolder, screenshotName);
		FileUtils.copyFile(screenshot, destination);

		System.out.println("Screenshot saved at: " + destination.getAbsolutePath());
	}

	public static String getWebPageTitle() {
		String webageTitle = driver.getTitle();
		return webageTitle;
	}

	public static void javascriptScrollOnly(WebElement element) {

		js = (JavascriptExecutor) driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		js.executeScript("arguments[0].scrollIntoView(true);", element);

	}

	public static void javascriptClick(WebElement element) {
		js = (JavascriptExecutor) driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Wait up to 10 seconds
		wait.until(ExpectedConditions.elementToBeClickable(element));
		js.executeScript("arguments[0].click();", element);

	}

	public static void javascriptClickAndSendValue(WebElement element, String value) {
		js = (JavascriptExecutor) driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Wait up to 10 seconds
		wait.until(ExpectedConditions.elementToBeClickable(element));
		js.executeScript("arguments[0].click();", element);
		js.executeScript("arguments[0].value='" + value + "';", element);

	}

	public static void sendValueUsingActionClass(WebElement element, String value) {
		actions = new Actions(driver);
		actions.moveToElement(element).click() // Click to focus on the input field
				.sendKeys(Keys.CONTROL + "a") // Select all text (for clearing)
				.sendKeys(Keys.BACK_SPACE) // Clear the selected text
				.sendKeys(value) // Send new text
				.build().perform();
	}
	
	public static void applyExplicitWait(WebElement element1,WebElement element2) {
		
		try {
			wait.until(ExpectedConditions.visibilityOf(element1));
			
		}
		 catch(Exception e){
			 wait.until(ExpectedConditions.visibilityOf(element2));
		 }
		
	}

}