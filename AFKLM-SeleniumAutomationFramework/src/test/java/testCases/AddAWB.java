package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import pageObjects.AddAWBObjects;
import utilities.readExcelData;

public class AddAWB extends BaseClass{
	
	public SoftAssert asert=new SoftAssert();
	
    public static int rowNum;
    public static int toRowNum;

	@Test(groups="regression")
	public void addAWB() throws InterruptedException, IOException {
		
//		AFDETLogin afdetlogin=new AFDETLogin();
//		afdetlogin.AfDetLogin();
//		
		KLMDETLogin klmlogin=new KLMDETLogin();
		klmlogin.klmDETLogin();
		
		String screen="Add Air Waybill";
	//	commonMethods.searchMasterScreen(screen);
		
		AddAWBObjects addawb=new AddAWBObjects(driver);
		
		
		
		commonMethods.zoom("50%");
		rowNum=9;
		toRowNum=15;
		for(int i=rowNum;i<=toRowNum;i++) {
			commonMethods.searchMasterScreen(screen);
			Thread.sleep(3000);
			commonMethods.zoom("50%");
			String title=commonMethods.getWebPageTitle();
			addawb.airlinePrefix(readExcelData.getExcelData(i,0));
			addawb.serialNumber(readExcelData.getExcelData(i,2));
			addawb.issueDate(readExcelData.getExcelData(i,3));
			addawb.cityOfSale(readExcelData.getExcelData(i,4));
			addawb.MOPFreightChargeDropdown(readExcelData.getExcelData(i,5));
			addawb.currency(readExcelData.getExcelData(i,6));
			addawb.commodity(readExcelData.getExcelData(i,7));
			addawb.shipperName(readExcelData.getExcelData(i,8));
			addawb.consignee(readExcelData.getExcelData(i,9));
			addawb.sellingLocation(readExcelData.getExcelData(i,11));
			
			addawb.addNewRouteIcon();
			Thread.sleep(1000);
			addawb.FromRoute(readExcelData.getExcelData(i,12));
			addawb.ToRoute(readExcelData.getExcelData(i,13));
			addawb.carrier(readExcelData.getExcelData(i,14));
			
			
			commonMethods.takeScreenSot(title);
			
			
			addawb.addChargeLineInfoIcon();
			Thread.sleep(1000);
			addawb.numberOfPiece(readExcelData.getExcelData(i,15));
			addawb.unitOfWeight();
			addawb.grossWeight(readExcelData.getExcelData(i,16));
			addawb.RateClass(readExcelData.getExcelData(i,17));
			Thread.sleep(1000);
			addawb.ChargeableWeight(readExcelData.getExcelData(i,18));
			addawb.Rate(readExcelData.getExcelData(i,19));
		
			addawb.totalCharge();
			addawb.Discount(readExcelData.getExcelData(i,20));
			
			commonMethods.takeScreenSot(title);
			
			addawb.expandOtherChargeSection();
		
			addawb.MOPOtherChargeDropdown(readExcelData.getExcelData(i,21));
			Thread.sleep(1000);
			addawb.addNewOtherChargeIcon();
			addawb.otherChargeCode1(readExcelData.getExcelData(i,22));
			addawb.otherChargeAmount1(readExcelData.getExcelData(i,23));

			
			commonMethods.takeScreenSot(title);
			
			addawb.SaveAWB();
			Thread.sleep(1000);
			commonMethods.takeScreenSot(title);
			
			String message=addawb.getMessageOnAWBSave();
			String commonSuccessMessage=" successfully validated.";
			asert.assertEquals(message ,"AWB - "+readExcelData.getExcelData(rowNum,0)+" "+commonMethods.EightDigitSerialNum(i)+commonSuccessMessage,"AWB having exception.Please check errors");
			addawb.closeMessagePopUp();
			addawb.cancelBtn();
		
		}
		asert.assertAll();
	}
	
}
