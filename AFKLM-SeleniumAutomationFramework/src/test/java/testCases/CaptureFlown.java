package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import pageObjects.CaptureFlownObjects;
import utilities.readExcelData;

public class CaptureFlown extends BaseClass {
	public  SoftAssert asert=new SoftAssert();
    public static int rowNum;
    public static int toRowNum;

	@Test(groups="regression")
	public void captureFlown() throws InterruptedException, IOException {
		
			KLMDETLogin klmlogin = new KLMDETLogin();
			klmlogin.klmDETLogin();

		
		rowNum=1;
		toRowNum=10;
		
			String screen = "List Cargo Flown Transactions";
			commonMethods.zoom("50%");
			
			CaptureFlownObjects captureflown = new CaptureFlownObjects(driver);
			
			for(int i=rowNum;i<=toRowNum;i++) {
				commonMethods.searchMasterScreen(screen);
				Thread.sleep(1000);
				String title = commonMethods.getWebPageTitle();
				captureflown.captureNewFlown();
				
				
				captureflown.flightNumber(readExcelData.getExcelData(i,24));
				captureflown.flightdate(readExcelData.getExcelData(i,3));
				
				captureflown.fromRoute(readExcelData.getExcelData(i,12));
				captureflown.toRoute(readExcelData.getExcelData(i,13));
				captureflown.airlinePrefix(readExcelData.getExcelData(i,0));
				String serialNumber=commonMethods.EightDigitSerialNum(i);
				captureflown.serialNumber(serialNumber);
				
				captureflown.origin();
				commonMethods.tabOnElement();
				commonMethods.tabOnElement();
				Thread.sleep(2000);
			
				
//				captureflown.origin(commonMethods.dataFile.getProperty("Origin"));
//				captureflown.destination(commonMethods.dataFile.getProperty("Destination"));
				
				
				captureflown.numberOfpiece(readExcelData.getExcelData(i,15));
				captureflown.grossWeight(readExcelData.getExcelData(i,16));
				captureflown.registeratonNumber(readExcelData.getExcelData(i,25));
				commonMethods.zoom("50%");
				
				
				commonMethods.takeScreenSot(title);
				
				captureflown.saveFlown();
				commonMethods.zoom("50%");
				commonMethods.takeScreenSot(title);
				
				String message=captureflown.getMessageOnFlownSave();
				asert.assertEquals(message, "Data is successfully saved.", "There is error while capturing flown.Please check.");
			//	captureflown.closeMessagePopup();
		    	captureflown.close();
			}
		
			asert.assertAll();
	}

}
