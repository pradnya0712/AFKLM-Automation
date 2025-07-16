package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.ViewAWBObjects;
import utilities.readExcelData;

public class ViewAWB extends BaseClass {

	
	public SoftAssert asert=new SoftAssert();
    public static int rowNum;
    public static int toRowNum;
    
	@Test(groups="regression")
	public void searchAWB() throws IOException, InterruptedException {
		
		KLMDETLogin klmlogin=new KLMDETLogin();
		klmlogin.klmDETLogin();
		
		String screen="View Air Waybill";
		ViewAWBObjects viewawb=new ViewAWBObjects(driver);
		commonMethods.searchMasterScreen(screen);
		rowNum=1; 
		toRowNum=15;
		
	
		for(int i=rowNum;i<=toRowNum;i++) {
		
			Thread.sleep(3000);
			String title=commonMethods.getWebPageTitle();
			viewawb.airlineprefix(readExcelData.getExcelData(i,0));
		//	String serialnumber=commonMethods.EightDigitSerialNum(i);
			viewawb.serialNumber(commonMethods.EightDigitSerialNum(i));
			viewawb.Search();
			commonMethods.zoom("50%");
		
			commonMethods.takeScreenSot(title);
			
			
			String recordStatus=viewawb.getRecordStatus();
	//		System.out.println(recordStatus);
			asert.assertEquals(recordStatus, "1 records found", "No record found.Please check serial number again");
			viewawb.clearDetails();	
		
			
//			viewawb.selectRecord();
//			
//			viewawb.viewDetailsSection();
//			commonMethods.zoom("50%");
//			Thread.sleep(1000);
//			commonMethods.takeScreenSot(title);
//			
//			
//			viewawb.scrollTowardsTaxDetailsInfo();
//			Thread.sleep(2000);
//			commonMethods.takeScreenSot(title);
//			
//			viewawb.scrollTowardsCloseBtn();
//			commonMethods.takeScreenSot(title);
		
		}
		asert.assertAll();
	
	
		
	}
}
