package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EBCassFileGenerationObjects extends BasePage {

	public EBCassFileGenerationObjects(WebDriver driver) {
		super(driver);
	}
	
	
@FindBy(xpath="//*[@id=\"ebcCassForm_cntcod_Search\"]")
private WebElement enterCountry;

@FindBy(xpath="//*[@id=\"bilprdstadat\"]")
private WebElement enterStartBillingPeriod;

@FindBy(xpath="//*[@id=\"bilprdenddat\"]")
private WebElement enterEndBillingPeriod;

@FindBy(xpath="//*[@id=\"ebcCassForm_refreshBtn\"]")
private WebElement SearchBtn;

@FindBy(xpath="//*[@id=\"fieldMappingEditableTable_Select_0\"]")
private WebElement selectRecord;

@FindBy(xpath="//*[@id=\"ebcCassForm_genCASSFile\"]")
private WebElement generateCassFile;

@FindBy(xpath="//*[@id=\"GenerateForm_genOK\"]")
private WebElement OKBtn;

@FindBy(xpath="//*[@id=\"fnldrfind\"]/option[@value=\"F\"]")
private WebElement selectFinalCassFile;

@FindBy(xpath="//*[@id=\"ebcCassForm_acceptBtn\"]")
private WebElement AcceptCassFile;

@FindBy(xpath="(//*[@id=\"closeButton\"])[2]")
private WebElement closeFirstPopup;

@FindBy(xpath="(//*[@type=\"button\"])[29]")
private WebElement closeSecondPopup;


@FindBy(xpath="//*[@id=\"ebcCassForm_clearBtn\"]")
private WebElement clearExistingDetails;

public void enterCountry(String countryCode) {
	enterCountry.sendKeys(countryCode);
}

public void enterStartBillingPeriod(String startBillingPeriod) {
	enterStartBillingPeriod.sendKeys(startBillingPeriod);
}

public void enterEndBillingPeriod(String endBillingPeriod) throws InterruptedException {
	Thread.sleep(1000);
	enterEndBillingPeriod.sendKeys(endBillingPeriod);
}

public void searchRecord() throws InterruptedException {
	SearchBtn.click();
	Thread.sleep(1000);
}

public void selectRecord() {
	selectRecord.click();
}

public void generateCassFileBtn() {
	generateCassFile.click();
}

public void generateDraftCassFile() throws InterruptedException {
	Thread.sleep(1000);
	OKBtn.click();

}

public void generateFinalCassFile() throws InterruptedException {
	selectFinalCassFile.click();
	Thread.sleep(1000);
	OKBtn.click();
}

public void closePopUpBox1() {
	closeFirstPopup.click();}

public void closePopUpBox2() {
	closeSecondPopup.click();
}

public void acceptCassFile() {
	AcceptCassFile.click();
}

public void clearAllExistingDetails() {
	clearExistingDetails.click();
}
}
