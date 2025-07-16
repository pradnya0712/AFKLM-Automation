package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testCases.commonMethods;

public class ImportCollectionObjects extends BasePage{

	public ImportCollectionObjects(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"importForm_newBtn\"]")
	private WebElement NewBtn;
	
	@FindBy(xpath="//*[@id=\"collectionForm_stncod\"]")
	private WebElement enterAirport;

	@FindBy(xpath="//*[@id=\"collectionForm_colcod-ref-pop\"]")
	private WebElement collectorSearchIcon;
	
	
	@FindBy(xpath="//*[@id=\"arpcodG_ref\"]")
	private WebElement enterAirportInTheLookUp;
	
	@FindBy(xpath="//*[@id=\"collectionForm_colcod_row_0\"]/td[1]")
	private WebElement selectFirstRecord;
	
	@FindBy(xpath="//*[@id=\"frmdat\"]")
	private WebElement enterFromPeriod;
	
	@FindBy(xpath="//*[@id=\"toodat\"]")
	private WebElement enterToPeriod;
	
	@FindBy(xpath="//*[@id=\"colamt\"]")
	private WebElement enterCashCollection;
	
	@FindBy(xpath="//*[@id=\"bilamt\"]")
	private WebElement enterCustomerBillingAmount;
	
	@FindBy(xpath="//*[@id=\"totawb\"]")
	private WebElement enterNumberOfDoc;
	
	@FindBy(xpath="//*[@id=\"collectionForm_saveBtn\"]")
	private WebElement HeadeSaveBtn;
	
	@FindBy(xpath="//*[@id=\"closeButton\"]")
	private WebElement closePopBox;
	
	@FindBy(xpath="//*[@id=\"collectionForm_addTxnBtn\"]")
	private WebElement AddTxnBtn;
	
	@FindBy(xpath="//*[@id=\"collectionDetailForm_carnumcod\"]")
	private WebElement enterAirlinePrefix;
	
	@FindBy(xpath="//*[@id=\"docnum\"]")
	private WebElement enterSerailNumber;
	
	@FindBy(xpath="//*[@id=\"add_CCEditableTable\"]")
	private WebElement AddIconCCCpollectionDetails;
	
	@FindBy(xpath="//*[@id=\"chgcod_0\"]")
	private WebElement enterChargeCode;
	
	@FindBy(xpath="//*[@id=\"chgamt\"]")
	private WebElement enterChargeAmount;
	
	@FindBy(xpath="//*[@id=\"dbtcus_0\"]")
	private WebElement enterCustomerCode;
	
	@FindBy(xpath="//*[@id=\"collectionDetailForm_saveBtn\"]")
	private WebElement SaveBtn;
	
	@FindBy(xpath="//*[@id=\"importForm_searchBtn\"]")
	private WebElement SearchBtn;
	
	@FindBy(xpath="//*[@id=\"importForm_closeBatchBtn\"]")
	private WebElement closeStatementBtn;
	
	@FindBy(xpath="//*[@id=\"listSectionTable_data\"]/thead/tr/th[27]")
	private WebElement scrollRightInterfaceDate;
	
	public void NewCollection() {
		NewBtn.click();
	}
	
	public void enterAirport(String airport) {
		
		enterAirport.sendKeys(airport);
	}
	
	public void clickOnCollectorSearchIcon() throws InterruptedException {
		Thread.sleep(1500);
		collectorSearchIcon.click();
	}
	
	public void selectFirstCollector(String enterAirport) throws InterruptedException {
		Thread.sleep(1500);
		enterAirportInTheLookUp.sendKeys(enterAirport);
		selectFirstRecord.click();
		
	}
	
	public void enterStartPeriod(String fromPeriod) throws InterruptedException {
	//	enterFromPeriod.sendKeys(fromPeriod);
		Thread.sleep(1000);
		commonMethods.javascriptClickAndSendValue(enterFromPeriod, fromPeriod);
	}
		
	public void enterEndPeriod(String toPeriod) throws InterruptedException {
//		enterToPeriod.sendKeys(toPeriod);
		Thread.sleep(1000);
		commonMethods.javascriptClickAndSendValue(enterToPeriod, toPeriod);
	}
	
	public void enterCashAmount(String cash) {
//		enterCashCollection.sendKeys(cash);
		for(int i=1;i<=6;i++) {
			enterCashCollection.click();
			driver.findElement(By.xpath("//*[@id=\"colamt\"]")).sendKeys(Keys.DELETE);
	}
		enterCashCollection.sendKeys(cash);
	}
	
	public void enterCustomerBillingAmount(String customerAmount) {
	//	enterCustomerBillingAmount.sendKeys(customerAmount);
		for(int i=1;i<=6;i++) {
			enterCustomerBillingAmount.click();
			driver.findElement(By.xpath("//*[@id=\"bilamt\"]")).sendKeys(Keys.DELETE);
			}
		enterCustomerBillingAmount.sendKeys(customerAmount);
	}
	
	public void enterDocumnetCount(String docCount) {
		enterNumberOfDoc.sendKeys(docCount);
	}
	
	public void SaveData() {
	commonMethods.javascriptScrollOnly(HeadeSaveBtn);
		HeadeSaveBtn.click();
	}
	
	public void closePopUpBox() {
		closePopBox.click();
	}
	
	public void addNewTxn() {
		AddTxnBtn.click();
	}
	
	public void enterAirlinePrefix(String airlinePrefux) {
		enterAirlinePrefix.sendKeys(airlinePrefux);
	}
	
	public void enterSerialNumber(String serialNum) {
		enterSerailNumber.sendKeys(serialNum);
	}
	
	public void addCCCollectionDetailsBtn() {
		commonMethods.javascriptScrollOnly(AddIconCCCpollectionDetails);
		AddIconCCCpollectionDetails.click();
	}
	
	public void enterCCOtherCharge(String otherCharge) {
		enterChargeCode.sendKeys(otherCharge);
	}
	
	public void enterChargeAmount(String chargeAmnt) throws InterruptedException {
		//enterCustomerCode.sendKeys(chargeAmnt);
		Thread.sleep(1000);
		commonMethods.javascriptClickAndSendValue(enterCustomerCode, chargeAmnt);
	}
	
	public void enterCustomerCode(String customercode) {
		enterChargeAmount.sendKeys(customercode);
	}
	
	public void SaveTxnDetails() {
	commonMethods.javascriptScrollOnly(SaveBtn);
    SaveBtn.click();
	}

  public void searchRecordBtn() {
	  SearchBtn.click();
  }
  
  public void closeStatementBtn() {
	  closeStatementBtn.click();
  }
  
  public void scrollRightInterfaceDate() {
	  commonMethods.javascriptRightScroll(scrollRightInterfaceDate);
  }
  
}

