package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testCases.commonMethods;

public class AddAWBObjects extends BasePage {

	public AddAWBObjects(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//*[@id=\"addAirWaybillForm_actcarnumcod\"]")
	private WebElement textBoxAirLinePrefix;

	@FindBy(xpath = "//*[@id=\"docnum\"]")
	private WebElement textBoxSerialNum;

	@FindBy(xpath = "//*[@id=\"issdat\"]")
	private WebElement textBoxIssueDate;

	@FindBy(xpath = "//*[@id=\"addAirWaybillForm_issctycod\"]")
	private WebElement textBoxCityOfSale;

	@FindBy(xpath = "//*[@id=\"addAirWaybillForm_curcod\"]")
	private WebElement textBoxCurrency;

	@FindBy(xpath = "//*[@id=\"addAirWaybillForm_mopfrtchg\"]")
	private WebElement SelectDropDownMOPFrieght;

	@FindBy(xpath = "//*[@id=\"cmdnam\"]")
	private WebElement textBoxCommodityName;

	@FindBy(xpath = "//*[@id=\"addAirWaybillForm_awbtyp\"]")
	private WebElement textBoxAWBType;

	@FindBy(xpath = "//*[@id=\"shpnam\"]")
	private WebElement textBoxShipperName;

	@FindBy(xpath = "//*[@id=\"cnenam\"]")
	private WebElement textBoxConsgineeName;

	@FindBy(xpath = "//*[@id=\"addAirWaybillForm_loccod\"]")
	private WebElement textBoxLocationCode;

	@FindBy(xpath = "//*[@id=\"add_routingEditableTable\"]")
	private WebElement AddRoutingPlusIcon;

	@FindBy(xpath = "//*[@id=\"arpcod_0\"]")
	private WebElement textBoxFromAirport1;

	@FindBy(xpath = "//*[@id=\"toarpcod_0\"]")
	private WebElement textBoxToAirport1;

	@FindBy(xpath = "//*[@id=\"carnumcod_0\"]")
	private WebElement textBoxCarrier1;

	@FindBy(xpath = "//*[@id=\"add_chargeLineEditableTable\"]")
	private WebElement AddChargeLineInfoPlusIcon;

	@FindBy(xpath = "//*[@id=\"numpcs\"]")
	private WebElement textBoxNumOfPiece;

	@FindBy(xpath = "//*[@id=\"untwgtind_0_lb\"]")
	private WebElement SelectUnitOfWeight;

	@FindBy(xpath = "//*[@id=\"grswgt\"]")
	private WebElement textBoxGrossWeight;

	@FindBy(xpath = "//*[@id=\"ratclscod_0\"]")
	private WebElement textBoxRateClass;

	@FindBy(xpath = "//*[@id=\"chgwgt\"]")
	private WebElement textBoxChargeableWeight;

	@FindBy(xpath = "//*[@id=\"ratval\"]")
	private WebElement textBoxRateCharge;

	@FindBy(xpath = "//*[@id=\"chgamt\"]")
	private WebElement clickOnTotalField;

	@FindBy(xpath = "//*[@id=\"dscamt\"]")
	private WebElement textBoxDiscount;

	@FindBy(xpath = "//*[@id=\"OtherCharge_a\"]")
	private WebElement otherChargesLink;

	@FindBy(xpath = "//*[@id=\"add_otherChargeEditableTable\"]")
	private WebElement addNewOtherChargesIcon;

	@FindBy(xpath = "//*[@id=\"addAirWaybillForm_mopothchgJQ\"]")
	private WebElement MOPOtherChargeDropDown;

	@FindBy(xpath = "//*[@id=\"othchgcod_0\"]")
	private WebElement textBoxOtherChargeCode1;

	@FindBy(xpath = "//*[@id=\"othchgcod_1\"]")
	private WebElement textBoxOtherChargeCode2;

	@FindBy(xpath = "//*[@id=\"otherChargeEditableTable-chgAmtOthChg_0\"]/input[@id=\"chgAmtOthChg\"]")
	private WebElement textBoxOtherChargeAmount1;

	@FindBy(xpath = "//*[@id=\"otherChargeEditableTable-chgAmtOthChg_1\"]/input[@id=\"chgAmtOthChg\"]")
	private WebElement textBoxOtherChargeAmount2;

	@FindBy(xpath = "//*[@id=\"addAirWaybillForm_downCommitButton\"]")
	private WebElement SaveBtn;

	@FindBy(xpath = "//*[@id=\"addAirWaybillForm_downCancelBtn\"]")
	private WebElement CancelBtn;

	@FindBy(xpath = "//*[contains(text(),\"AWB- 057 50000090  failed in validation, Please see error section.\")]")
	private WebElement exceptionMessage;

	@FindBy(xpath = "//*[contains(text(),\"AWB - 057 50000090  successfully validated.\")]")
	private WebElement successMessage;

	@FindBy(xpath = "//*[contains(text(),\"successfully validated.\")]")
	private WebElement SuccessMessageOnSaveAWb;

	@FindBy(xpath = "//*[contains(text(),\"failed in validation, Please see error section.\")]")
	private WebElement ExceptionMmessageOnSaveAWb;
	
	@FindBy(xpath="//*[@id=\"closeButton\"]")
	private WebElement closeMessagePopup;

	public void airlinePrefix(String airlineprefix) {
		textBoxAirLinePrefix.sendKeys(airlineprefix);
	}

	public void serialNumber(String serialNumber) {
		textBoxSerialNum.sendKeys(serialNumber);
	}

	public void issueDate(String issuedate) {
		textBoxIssueDate.sendKeys(issuedate);
	}

	public void cityOfSale(String cityOfSale) {
		textBoxCityOfSale.sendKeys(cityOfSale);
	}

	public void MOPFreightChargeDropdown(String MOPFreightChargeCode) {
		SelectDropDownMOPFrieght.click();
		commonMethods.selectDropDown(SelectDropDownMOPFrieght, MOPFreightChargeCode);
	}
	
	public void currency(String currency) {
		textBoxCurrency.sendKeys(currency);
	}

	public void commodity(String commodityName) {
		textBoxCommodityName.sendKeys(commodityName);
	}

	public void shipperName(String shipperName) {
		textBoxShipperName.sendKeys(shipperName);
	}

	public void consignee(String consigneeName) {
		textBoxConsgineeName.sendKeys(consigneeName);
	}

	public void sellingLocation(String sellinglocationcode) {
		textBoxLocationCode.sendKeys(sellinglocationcode);
	}

	public void addNewRouteIcon() throws InterruptedException {
		Thread.sleep(500);
		AddRoutingPlusIcon.click();
	}

	public void FromRoute(String fromRoute) {
		textBoxFromAirport1.sendKeys(fromRoute);
	}

	public void ToRoute(String toRoute) {
		textBoxToAirport1.sendKeys(toRoute);
	}

	public void carrier(String carrier1) throws InterruptedException {
		Thread.sleep(2000);
		commonMethods.javascriptClickAndSendValue(textBoxCarrier1, carrier1);
		// textBoxCarrier1.sendKeys(carrier1);
	}

	public void addChargeLineInfoIcon() throws InterruptedException   {
		Thread.sleep(500);
		commonMethods.javascriptScrollOnly(AddChargeLineInfoPlusIcon);
		AddChargeLineInfoPlusIcon.click();
	}

	public void numberOfPiece(String noOfPiece) throws InterruptedException {
		Thread.sleep(2000);
		textBoxNumOfPiece.clear();
		textBoxNumOfPiece.sendKeys(noOfPiece);
	}

	public void unitOfWeight() {
		SelectUnitOfWeight.click();
	}

	public void grossWeight(String grossWeight) {
		textBoxGrossWeight.clear();
		textBoxGrossWeight.sendKeys(grossWeight);
	}

	public void RateClass(String rateclass) throws InterruptedException {

		textBoxRateClass.sendKeys(rateclass);
		commonMethods.handleUnexpectedAlert();
	}

	public void ChargeableWeight(String chargeableWeight) {
		textBoxChargeableWeight.clear();
		textBoxChargeableWeight.sendKeys(chargeableWeight);
	}

	public void Rate(String Rate) throws InterruptedException {

		Thread.sleep(2000);
	

		for(int i=1;i<=6;i++) {
			textBoxRateCharge.click();
			driver.findElement(By.xpath("//*[@id=\"ratval\"]")).sendKeys(Keys.DELETE);
		}
		
		textBoxRateCharge.sendKeys(Rate);
		
	//	commonMethods.sendValueUsingActionClass(textBoxRateCharge, Rate);
		
	}

	public void totalCharge() {
		clickOnTotalField.click();
	
	}

	public void Discount(String discount) {
		textBoxDiscount.clear();
		textBoxDiscount.sendKeys(discount);
	}
	


	public void expandOtherChargeSection() throws InterruptedException {
		Thread.sleep(500);
		otherChargesLink.click();
	}

	public void addNewOtherChargeIcon() {
		addNewOtherChargesIcon.click();
	}

	public void MOPOtherChargeDropdown(String MOPChargeCode) {
		MOPOtherChargeDropDown.click();
		commonMethods.selectDropDown(MOPOtherChargeDropDown, MOPChargeCode);
	}

	public void otherChargeCode1(String otherChargeCode1) {
		textBoxOtherChargeCode1.sendKeys(otherChargeCode1);
	}

	public void otherChargeAmount1(String chargeAmount1) {
		textBoxOtherChargeAmount1.sendKeys(chargeAmount1);
	}

	public void otherChargeCode2(String otherChargeCode2) {
		textBoxOtherChargeCode2.sendKeys(otherChargeCode2);
	}

	public void otherChargeAmount2(String chargeAmount2) {
		textBoxOtherChargeAmount2.sendKeys(chargeAmount2);
	}

	public void SaveAWB() {
		commonMethods.javascriptScrollOnly(SaveBtn);
		SaveBtn.click();
	
	}
	
	public void closeMessagePopUp() {
		closeMessagePopup.click();
	}
	
	public void cancelBtn() throws IOException {
		commonMethods.javascriptScrollOnly(CancelBtn);
		commonMethods.takeScreenSot(driver.getTitle());
		CancelBtn.click();
	}

	public String getMessageOnAWBSave() {
		String message = "";
	//	commonMethods.applyExplicitWait(ExceptionMmessageOnSaveAWb, SuccessMessageOnSaveAWb);
		try {
			if (ExceptionMmessageOnSaveAWb.isDisplayed()) {
				message = ExceptionMmessageOnSaveAWb.getText();
			}
		}

		catch (Exception e) {
			if (SuccessMessageOnSaveAWb.isDisplayed()) {
				message = SuccessMessageOnSaveAWb.getText();
			}
		}

		return message;

	}

}
