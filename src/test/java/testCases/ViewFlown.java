package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ProcessAndCloseFlownObjects;
import pageObjects.ViewFlownObjects;

public class ViewFlown extends BaseClass{
	
	@Test
	public void viewFlown() throws InterruptedException, IOException {
		try {
			KLMDETLogin klmlogin = new KLMDETLogin();
			klmlogin.klmDETLogin();

			String screen = "List Cargo Flown Transactions";
			commonMethods.searchMasterScreen(screen);
			Thread.sleep(3000);
			String title = commonMethods.getWebPageTitle();

			commonMethods.zoom("50%");
			
			ViewFlownObjects viewflown=new ViewFlownObjects(driver);
			viewflown.ClearExistingSearch();
			viewflown.fromSector(commonMethods.dataFile.getProperty("Origin"));
			viewflown.toSector(commonMethods.dataFile.getProperty("Destination"));
			viewflown.dropdownType(commonMethods.dataFile.getProperty("flownDropdownType"));
			viewflown.serialNumber(commonMethods.EightDigitSerialNum());
			viewflown.SearchFlown();
			commonMethods.zoom("60%");
			commonMethods.takeScreenSot(title);
			
			String recordStatus=viewflown.getRecordStatus();
			Assert.assertEquals(recordStatus, "1 records found", "No record found.Please check again");
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	

}
