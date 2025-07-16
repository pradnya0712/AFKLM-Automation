package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testCases.commonMethods;

public class CaptureFlownObjects extends BasePage {

	public CaptureFlownObjects(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy(xpath = "//*[@id=\"appForm_newBtn\"]")
	private WebElement NewBtn;

	@FindBy(xpath = "//*[@id='setupForm_fltnum']")
	private WebElement textBoxFlightNumber;

	@FindBy(xpath = "//*[@id='fltdat']")
	private WebElement textBoxFlightDate;

	@FindBy(xpath = "//*[@id='setupForm_frmarpcod']")
	private WebElement textBoxSectorFrom;

	@FindBy(xpath = "//*[@id='setupForm_tooarpcod']")
	private WebElement textBoxSectorTo;

	@FindBy(xpath = "//*[@id='setupForm_carnumcod1']")
	private WebElement textBoxAirlinePrefix;

	@FindBy(xpath = "//*[@id='docnum']")
	private WebElement textBoxSerialNumber;

	@FindBy(xpath = "//*[@id='setupForm_awborgstn']")
	private WebElement textBoxOrigin;

	@FindBy(xpath = "//*[@id='setupForm_awbdsnstn']")
	private WebElement textBoxDestination;

	@FindBy(xpath = "//*[@for=\"numpcs\"]/../../following-sibling::div/div/input[@id=\"numpcs\"]")
	private WebElement textBoxNumOfPis;
	
	//*[@title="Enter 'Number Of Pieces'"]

	@FindBy(xpath = "//*[@id='grswgt']")
	private WebElement textBoxGrossWeight;

	@FindBy(xpath = "//*[@id='setupForm_actrgnnum']")
	private WebElement textBoxAircrafterRegisterationNumber;

	@FindBy(xpath = "//*[@id='setupForm_saveBtn']")
	private WebElement SaveBtn;

	@FindBy(xpath = "//*[@id='setupForm_saveAndNewBtn']")
	private WebElement SaveandNewBtn;

	@FindBy(xpath = "//*[@id='setupForm_saveAndCloseBtn']")
	private WebElement SaveandCloseBtn;

	@FindBy(xpath = "//*[@id='setupForm_viewBatchBtn']")
	private WebElement viewBatchBtn;

	@FindBy(xpath = "//*[@id='setupForm_closeButton']")
	private WebElement closeBtn;

	@FindBy(xpath = "//*[contains(text(),\" Data is successfully saved.\")]")
	private WebElement getFlownCreateSuccessMessage;
	
	
	@FindBy(xpath="//*[@id=\"closeButton\"]")
	private WebElement closeIconForMessagePopup;
	
	
	@FindBy(xpath = "//*[contains(text(),\"failed in validation, Please see error section.\")]")
	private WebElement ExceptionMessageOnSaveFlown;

	@FindBy(xpath = "//*[contains(text(),\" Data is successfully saved.\")]")
	private WebElement SuccessMessageOnSaveFlown;
	
	public void captureNewFlown() {
		NewBtn.click();
	}
	
	public void flightNumber(String flightnumber) {
		textBoxFlightNumber.sendKeys(flightnumber);
	}
	
	public void flightdate(String flightdate) {
		textBoxFlightDate.sendKeys(flightdate);
	}
	
	public void fromRoute(String fromSector) {
		textBoxSectorFrom.sendKeys(fromSector);
	}
	
	public void toRoute(String tosector) {
		textBoxSectorTo.sendKeys(tosector);
	}
	
	public void airlinePrefix(String airlineprefix) {
		textBoxAirlinePrefix.sendKeys(airlineprefix);
	}
	
	public void serialNumber(String serialnumber) throws InterruptedException {
		textBoxSerialNumber.sendKeys(serialnumber);
		Thread.sleep(1000);
	}
	
	public void origin() {
//		textBoxOrigin.clear();
		textBoxOrigin.click();
//		textBoxOrigin.sendKeys(origin);
	}

	public void destination(String destination) {
		textBoxDestination.clear();
		textBoxDestination.sendKeys(destination);
	}
	
	public void numberOfpiece(String noOfPics) {
		commonMethods.tabOnElement();
	   textBoxNumOfPis.click();
//		textBoxNumOfPis.sendKeys(noOfPics);
		commonMethods.javascriptClickAndSendValue(textBoxNumOfPis, noOfPics);
	}
	
	public void grossWeight(String grossweight) {
		commonMethods.tabOnElement();
		textBoxGrossWeight.click();
//		textBoxGrossWeight.sendKeys(grossweight);
		commonMethods.javascriptClickAndSendValue(textBoxGrossWeight, grossweight);
	}
	
	public void registeratonNumber(String regNo) {
	//	commonMethods.mouseHoverAndSendValue();
		textBoxAircrafterRegisterationNumber.click();
		textBoxAircrafterRegisterationNumber.sendKeys(regNo);
	}

	
	public void saveFlown() {
		SaveBtn.click();
		commonMethods.javascriptScrollOnly(SaveBtn);
	}
	
	public void close() {
	//	closeBtn.click();
		if(closeBtn.isDisplayed()) {
			commonMethods.javascriptClick(closeBtn);
		}
		else {
			closeIconForMessagePopup.click();
			commonMethods.javascriptClick(closeBtn);
		}
		
	}
	
	public void closeMessagePopup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(closeIconForMessagePopup));
		if(closeIconForMessagePopup.isDisplayed()) {
			closeIconForMessagePopup.click();
		}else {
			commonMethods.javascriptClick(closeBtn);
		}
	
	}
	public String getMessageOnFlownSave() {
		String message = "";
	
		try {
			if (ExceptionMessageOnSaveFlown.isDisplayed()) {
				message = ExceptionMessageOnSaveFlown.getText();
			}
		}

		catch (Exception e) {
			if (SuccessMessageOnSaveFlown.isDisplayed()) {
				message = SuccessMessageOnSaveFlown.getText();
			}
		}

		return message;

	}

}
