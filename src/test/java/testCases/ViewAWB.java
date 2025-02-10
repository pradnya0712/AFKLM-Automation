package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ViewAWBObjects;

public class ViewAWB extends BaseClass {

	
	@Test
	public void searchAWB() throws IOException, InterruptedException {
		
		KLMDETLogin klmlogin=new KLMDETLogin();
		klmlogin.klmDETLogin();
		
		String screen="View Air Waybill";
		commonMethods.searchMasterScreen(screen);
		Thread.sleep(3000);
		
		ViewAWBObjects viewawb=new ViewAWBObjects(driver);
		String title=commonMethods.getWebPageTitle();
		
		viewawb.airlineprefix(commonMethods.dataFile.getProperty("AirlinePrefix"));
		String serialnumber=commonMethods.EightDigitSerialNum();
		viewawb.serialNumber(serialnumber);
		viewawb.Search();
		
		commonMethods.zoom("50%");
		commonMethods.takeScreenSot(title);
		
		
		String recordStatus=viewawb.getRecordStatus();
		Assert.assertEquals(recordStatus, "1 records found", "No record found.Please check serial number again");
	
		viewawb.selectRecord();
		
		
		viewawb.viewDetailsSection();
		commonMethods.zoom("50%");
		Thread.sleep(1000);
		commonMethods.takeScreenSot(title);
		
		
		viewawb.scrollTowardsTaxDetailsInfo();
		Thread.sleep(1000);
		commonMethods.takeScreenSot(title);
		
		viewawb.scrollTowardsCloseBtn();
		commonMethods.takeScreenSot(title);
	
		
	}
}
