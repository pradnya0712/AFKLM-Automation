package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.ViewAWBObjects;
import utilities.readExcelData;

public class ViewAWBWithExcelData extends BaseClass {
	public static int rowNum;
	public static int toRowNum;
	
	
	public SoftAssert asert=new SoftAssert();
	
	@Test(groups="regression")
	public void searchAWB() throws IOException, InterruptedException {
		
		KLMDETLogin klmlogin=new KLMDETLogin();
		klmlogin.klmDETLogin();
		
		String screen="View Air Waybill";
		commonMethods.searchMasterScreen(screen);
		Thread.sleep(3000);
		
		ViewAWBObjects viewawb=new ViewAWBObjects(driver);
		String title=commonMethods.getWebPageTitle();
		
		rowNum=1;
		 toRowNum=10;
		for(int i=rowNum;i<=toRowNum;i++) {
			viewawb.airlineprefix(readExcelData.getExcelData(rowNum,0));
			String serialnumber=commonMethods.EightDigitSerialNum(i);
			viewawb.serialNumber(serialnumber);
			viewawb.Search();
			viewawb.clearDetails();
			commonMethods.zoom("60%");
			commonMethods.takeScreenSot(title);
			
			
			String recordStatus=viewawb.getRecordStatus();
			asert.assertEquals(recordStatus, "1 records found", "No record found.Please check serial number again");
		}
		
		
	
	
		viewawb.selectRecord();
		
		
		viewawb.viewDetailsSection();
		commonMethods.zoom("50%");
		Thread.sleep(1000);
		commonMethods.takeScreenSot(title);
		
		
		viewawb.scrollTowardsTaxDetailsInfo();
		Thread.sleep(2000);
		commonMethods.takeScreenSot(title);
		
		viewawb.scrollTowardsCloseBtn();
		commonMethods.takeScreenSot(title);
	
		
	}
}
