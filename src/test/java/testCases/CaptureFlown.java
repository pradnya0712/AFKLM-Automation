package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CaptureFlownObjects;

public class CaptureFlown extends BaseClass {

	@Test
	public void captureFlown() throws InterruptedException, IOException {
		try {
			KLMDETLogin klmlogin = new KLMDETLogin();
			klmlogin.klmDETLogin();

			String screen = "List Cargo Flown Transactions";
			commonMethods.searchMasterScreen(screen);
			Thread.sleep(3000);
			String title = commonMethods.getWebPageTitle();

			commonMethods.zoom("50%");
			
			CaptureFlownObjects captureflown = new CaptureFlownObjects(driver);
			captureflown.captureNewFlown();
		
			
			captureflown.flightNumber(commonMethods.dataFile.getProperty("flightNumber"));
			captureflown.flightdate(commonMethods.dataFile.getProperty("IssueDate"));
			captureflown.fromRoute(commonMethods.dataFile.getProperty("Origin"));
			captureflown.toRoute(commonMethods.dataFile.getProperty("Destination"));
			captureflown.airlinePrefix(commonMethods.dataFile.getProperty("AirlinePrefix"));
			String serialNumber=commonMethods.EightDigitSerialNum();
			captureflown.serialNumber(serialNumber);
			captureflown.origin(commonMethods.dataFile.getProperty("Origin"));
			captureflown.destination(commonMethods.dataFile.getProperty("Destination"));
			captureflown.numnberOfpiece(commonMethods.dataFile.getProperty("NoOfPieces"));
			captureflown.grossWeight(commonMethods.dataFile.getProperty("GrossWeight"));
			
			commonMethods.zoom("60%");
			captureflown.registeratonNumber(commonMethods.dataFile.getProperty("AircarftRegisterationNum"));
			
			commonMethods.takeScreenSot(title);
			
			captureflown.saveFlown();
			commonMethods.zoom("50%");
			Thread.sleep(1000);
			commonMethods.takeScreenSot(title);
			
			String message=captureflown.getMessageOnFlownSave();
			Assert.assertEquals(message, "Data is successfully saved.", "There is error while capturing flown.Please check.");

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
