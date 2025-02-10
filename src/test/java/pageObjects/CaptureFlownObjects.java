package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
	
	public void serialNumber(String serialnumber) {
		textBoxSerialNumber.sendKeys(serialnumber);
	}
	
	public void origin(String origin) {
		textBoxOrigin.clear();
		textBoxOrigin.sendKeys(origin);
	}

	public void destination(String destination) {
		textBoxDestination.clear();
		textBoxDestination.sendKeys(destination);
	}
	
	public void numnberOfpiece(String noOfPics) {
		textBoxNumOfPis.sendKeys(noOfPics);
	}
	
	public void grossWeight(String grossweight) {
		textBoxGrossWeight.sendKeys(grossweight);
	}
	
	public void registeratonNumber(String regNo) {
		textBoxAircrafterRegisterationNumber.sendKeys(regNo);
	}

	
	public void saveFlown() {
		SaveBtn.click();;
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
