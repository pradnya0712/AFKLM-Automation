package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testCases.commonMethods;

public class ViewAWBObjects extends BasePage {

	public ViewAWBObjects(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//*[@id=\"airwayForm_carnumcod\"]")
	private WebElement textBoxAirlinePrefix;

	@FindBy(xpath = "//*[@id='docnum']")
	private WebElement textBoxSerialNum;

	@FindBy(xpath = "//*[@id='airwayForm_type']")
	private WebElement selectDropownType;

	// Buttons
	@FindBy(xpath = "//*[@id=\"airwayForm_searchBtn\"]")
	private WebElement SearchBtn;

	@FindBy(xpath = "//*[@id=\"airwayForm_modifyBtn\"]")
	private WebElement ModifyBtn;

	@FindBy(xpath = "//*[@id=\"airwayForm_deleteAWB\"]")
	private WebElement DeleteBtn;

	@FindBy(xpath = "//*[@id=\"airwayForm_clearBtn\"]")
	private WebElement ClearBtn;

	@FindBy(xpath = "//*[@id=\"TAXDetailsDetailDiv\"]")
	private WebElement TaxDetailsLink;

	// links
	@FindBy(xpath = "//*[@id=\"airwayForm_detailsBtn\"]")
	private WebElement Details;

	@FindBy(xpath = "//*[@id=\"airwayForm_prorationBtn\"]")
	private WebElement Proration;

	@FindBy(xpath = "//*[@id=\"airwayForm_flownBtn\"]")
	private WebElement Flown;

	@FindBy(xpath = "//*[@id=\"airwayForm_sectorBtn\"]")
	private WebElement Sector;

	@FindBy(xpath = "//*[@id=\"airwayForm_ccaBtn\"]")
	private WebElement CCA;

	@FindBy(xpath = "//*[@id=\"airwayForm_ctmBtn\"]")
	private WebElement CTM;

	@FindBy(xpath = "//*[@id=\"airwayForm_ccBillingBtn\"]")
	private WebElement CCBilling;

	@FindBy(xpath = "//*[@id=\"airwayForm_exportbillingDetailsBtn\"]")
	private WebElement ExportBilling;

	// close tab
	@FindBy(xpath = "//*[@class=\"tabClose\"]")
	private WebElement CloseIcon;

	@FindBy(xpath = "//*[@value=\"Close\"]")
	private WebElement CloseTabButton;

	@FindBy(xpath = "//*[@id=\"viewAirwayBillDetail_closeBtn\"]")
	private WebElement CloseBtn;

	// select First Record checkbox
	@FindBy(xpath = "//*[@id=\"listSectionTable_Select_0\"]")
	private WebElement selectFirstCheckBoxrecord;

	@FindBy(xpath = "(//*[contains(text(),\" records found\")])[1]")
	private WebElement recordsPresent;

	public void airlineprefix(String airlineprefix) {
		textBoxAirlinePrefix.sendKeys(airlineprefix);
	}

	public void serialNumber(String serialNumber) {
		textBoxSerialNum.sendKeys(serialNumber);
	}

	public void Search() {
		SearchBtn.click();
	}

	public String getRecordStatus() {

		String getRecordMessage = recordsPresent.getText();
        return getRecordMessage;
	}
	
	public void selectRecord() {
		selectFirstCheckBoxrecord.click();
		
	}
	
	public void clearDetails() {
		ClearBtn.click();
	}
	
	public void viewDetailsSection() {
		Details.click();
	}
	
	public void scrollTowardsTaxDetailsInfo() {
		commonMethods.javascriptScrollOnly(TaxDetailsLink);
	}
	
	public void scrollTowardsCloseBtn() {
		commonMethods.javascriptScrollOnly(CloseBtn);
	}
	
	

}
