package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testCases.commonMethods;

public class ExportBillingObjects extends BasePage {

	public ExportBillingObjects(WebDriver driver) {
		super(driver);
	
	}
	
	
	@FindBy(xpath="//*[@id=\"exportBillingwListForm_clearBtn\"]")
	private WebElement clearDetails;
	
	@FindBy(xpath="//*[@id=\"docnum\"]")
	private WebElement serialNumberText;
	
	@FindBy(xpath="//*[@id=\"exportBillingwListForm_searchBtn\"]")
	private WebElement searchBtn;
	
	@FindBy(xpath="//*[@id=\"transactionDetail_Select_0\"]")
	private WebElement selectFirstRecord;
	
	@FindBy(xpath="//*[@id=\"exportBillingwListForm_rComputionBtn\"]")
	private WebElement generateRateComputation;
	
	@FindBy(xpath="//*[@id=\"exportBillingwListForm_genratebillRecordBtn\"]")
	private WebElement generateBillingRecord;
	
	@FindBy(xpath="//*[@id=\"closeButton\"]")
	private WebElement closeMesssagePopup;
	
	@FindBy(xpath="//*[@id=\"exportBillingwListForm_cnfrmBillRBtn\"]")
	private WebElement confirmBillingRecord;
	
	@FindBy(xpath="//*[@id=\"transactionDetail_rowId_0\"]/td[5]")
	private WebElement getStartBillingPeriod;
	
	@FindBy(xpath="//*[@id=\"transactionDetail_rowId_0\"]/td[6]")
	private WebElement getEndBillingPeriod;
	
	@FindBy(xpath="//*[@id=\"transactionDetail_rowId_0\"]/td[12]")
	private WebElement getBillingStatus;
	
	@FindBy(xpath="//*[@id=\"transactionDetail_rowId_0\"]/td[25]")
	private WebElement getCountry;
	
		
	@FindBy(xpath="//*[@id=\"transactionDetail_rowId_0\"]/td[20]")
	private WebElement getAgentType;
		
	@FindBy(xpath="//*[@id=\"transactionDetail_rowId_0\"]/td[43]")
	private WebElement scrollRight;
	
	public void clearAllExistinfDetails() {
		clearDetails.click();
	}
	
	public void enterSerialNumber(String serialNumnber) {
		serialNumberText.sendKeys(serialNumnber);
		commonMethods.javascriptScrollOnly(searchBtn);
	}
	
	public void searchRecord() throws InterruptedException {
	//	Thread.sleep(1000);		
		searchBtn.click();
	//	commonMethods.javascriptClick(searchBtn);
//	searchBtn.sendKeys(Keys.ENTER);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"transactionDetail_rowId_0\"]")));
	
	}
	
	public void selectRecord() {
		
		if(!selectFirstRecord.isSelected()) {
			selectFirstRecord.click();
		}
		
	}
	public void computeRateComputation() {
		generateRateComputation.click();
	}
	
	public void generateBilling() {
		generateBillingRecord.click();
	}
	
	public void closePopupBox() {
		closeMesssagePopup.click();
	}
	
	public void confirmBilling() {
		confirmBillingRecord.click();
	}
	
	public  String getStartBillingPeriod() {
		 return getStartBillingPeriod.getText();
	}
	
	public  String getEndBillingPeriod() {
		 return getEndBillingPeriod.getText();
	}
	
	public  String getBillingRecordStatus() {
		 return getBillingStatus.getText();
	}
	
	public String getCountry() {
		return getCountry.getText();
	}
	
	public String getAgentType() {
		return getAgentType.getText();
	}
	public void scrollRight() {
		commonMethods.javascriptRightScroll(scrollRight);
	}
	

}
