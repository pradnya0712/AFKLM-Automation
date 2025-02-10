package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddAWBObjects;

public class AddAWB extends BaseClass{

	@Test
	public void addAWB() throws InterruptedException, IOException {
		try {
			
		
		KLMDETLogin klmlogin=new KLMDETLogin();
		klmlogin.klmDETLogin();
		
		String screen="Add Air Waybill";
		commonMethods.searchMasterScreen(screen);
		Thread.sleep(3000);
		AddAWBObjects addawb=new AddAWBObjects(driver);
		
		String title=commonMethods.getWebPageTitle();
		
		commonMethods.zoom("50%");
		addawb.airlinePrefix(commonMethods.dataFile.getProperty("AirlinePrefix"));
		addawb.serialNumber(commonMethods.dataFile.getProperty("SerialNumber"));
		addawb.issueDate(commonMethods.dataFile.getProperty("IssueDate"));
		addawb.cityOfSale(commonMethods.dataFile.getProperty("CityOfSale"));
		addawb.currency(commonMethods.dataFile.getProperty("Currency"));
		addawb.commodity(commonMethods.dataFile.getProperty("CommodityName"));
		addawb.shipperName(commonMethods.dataFile.getProperty("ShipperName"));
		addawb.consignee(commonMethods.dataFile.getProperty("ConsigneeName"));
		addawb.sellingLocation(commonMethods.dataFile.getProperty("SellingLocation"));
		
		addawb.addNewRouteIcon();
		Thread.sleep(1000);
		addawb.FromRoute(commonMethods.dataFile.getProperty("Origin"));
		addawb.ToRoute(commonMethods.dataFile.getProperty("Destination"));
		addawb.carrier(commonMethods.dataFile.getProperty("Carrier"));
		
		
		commonMethods.takeScreenSot(title);
		
		
		addawb.addChargeLineInfoIcon();
		Thread.sleep(1000);
		addawb.numberOfPiece(commonMethods.dataFile.getProperty("NoOfPieces"));
		addawb.unitOfWeight();
		addawb.grossWeight(commonMethods.dataFile.getProperty("GrossWeight"));
		addawb.RateClass(commonMethods.dataFile.getProperty("RateClass"));
		addawb.ChargeableWeight(commonMethods.dataFile.getProperty("ChargeableWeight"));
		addawb.Rate(commonMethods.dataFile.getProperty("Rate"));
		addawb.totalCharge();
		addawb.Discount(commonMethods.dataFile.getProperty("Discount"));
		
		commonMethods.takeScreenSot(title);
		
		addawb.expandOtherChargeSection();
		Thread.sleep(1000);
		addawb.addNewOtherChargeIcon();
		addawb.MOPOtherChargeDropdown(commonMethods.dataFile.getProperty("MOPOtherCharge"));
		addawb.otherChargeCode1(commonMethods.dataFile.getProperty("OtherChargeCode1"));
		addawb.otherChargeAmount1(commonMethods.dataFile.getProperty("ChargeAmount1"));
		addawb.addNewOtherChargeIcon();
		addawb.otherChargeCode2(commonMethods.dataFile.getProperty("OtherChargeCode2"));
		addawb.otherChargeAmount2(commonMethods.dataFile.getProperty("ChargeAmount2"));
		
		commonMethods.takeScreenSot(title);
		
		addawb.SaveAWB();
		Thread.sleep(1000);
		commonMethods.takeScreenSot(title);
		
		String message=addawb.getMessageOnAWBSave();
		String commonSuccessMessage=" successfully validated.";
		Assert.assertEquals(message ,"AWB - "+commonMethods.dataFile.getProperty("AirlinePrefix")+" "+commonMethods.EightDigitSerialNum()+commonSuccessMessage,"AWB having exception.Please check errors");
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
