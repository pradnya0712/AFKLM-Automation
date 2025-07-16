package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testCases.commonMethods;

public class ViewFlownObjects extends BasePage {

	public ViewFlownObjects(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id='fltdatFrom']")
	private WebElement textBoxFlightDateFrom;

	@FindBy(xpath = "//*[@id='fltdatTo']")
	private WebElement textBoxFlightDateTo;

	@FindBy(xpath = "//*[@id='appForm_fltnum']")
	private WebElement textBoxFlightNumber;

	@FindBy(xpath = "//*[@id='appForm_frmarpcod']")
	private WebElement textBoxSectorFrom;

	@FindBy(xpath = "//*[@id='appForm_tooarpcod']")
	private WebElement textBoxSectorTo;

	@FindBy(xpath = "//*[@id='appForm_typcod']")
	private WebElement selectDropDownType;

	@FindBy(xpath = "//*[@id='lstdocnum']")
	private WebElement textBoxSerialNumber;

	// buttons
	@FindBy(xpath = "//*[@id='appForm_onSearchButton']")
	private WebElement SearchBtn;

	@FindBy(xpath = "//*[@id='ListCargoFlown_Select_0']")
	private WebElement selectFirstRecordCheckbox;

	@FindBy(xpath = "//*[@id=\"closeButton\"]")
	private WebElement CloseIconForMessage;

	@FindBy(xpath = "//*[@id='appForm_dlttrn']")
	private WebElement DeleteTxnBtn;

	@FindBy(xpath = "//*[@id='appForm_viewExceptionBtn']")
	private WebElement viewExceptionBtn;

	@FindBy(xpath = "//*[@id='appForm_clearBtn']")
	private WebElement clearBtn;
	
	@FindBy(xpath = "(//*[contains(text(),\" records found\")])[1]")
	private WebElement recordsPresent;

	public void FromFlightDate(String fromflighdate) {
		textBoxFlightDateFrom.sendKeys(fromflighdate);
	}

	public void ToFlightDate(String toflighdate) {
		textBoxFlightDateTo.sendKeys(toflighdate);
	}

	public void flightNumber(String flightnumber) {
		textBoxFlightNumber.sendKeys(flightnumber);
	}
	
	public void fromSector(String fromsector) {
		textBoxSectorFrom.sendKeys(fromsector);
	}
	
	public void toSector(String tosector) {
		textBoxSectorTo.sendKeys(tosector);
	}

	public void dropdownType(String dropdownValue) {
		selectDropDownType.click();
		commonMethods.selectDropDown(selectDropDownType, dropdownValue);
	}

	public void serialNumber(String serialNumber) {
		textBoxSerialNumber.sendKeys(serialNumber);
	}
	
	public void SearchFlown() {
		SearchBtn.click();;
	}
	

	public void ClearExistingSearch() {
		clearBtn.click();;
	}
	
	public String getRecordStatus() {
		String getRecordMessage = recordsPresent.getText();
        return getRecordMessage;
	}
	
}
