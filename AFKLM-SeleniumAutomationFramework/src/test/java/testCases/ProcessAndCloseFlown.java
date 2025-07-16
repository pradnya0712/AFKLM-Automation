package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import pageObjects.ProcessAndCloseFlownObjects;
import pageObjects.ViewFlownObjects;
import utilities.readExcelData;

public class ProcessAndCloseFlown extends BaseClass{

	public SoftAssert asert=new SoftAssert();
	 public static int rowNum;
	   public static int toRowNum;
	    
	@Test
	public void ProcessAndCloseFlown() throws InterruptedException, IOException {
	
			
		
		KLMDETLogin klmlogin = new KLMDETLogin();
		klmlogin.klmDETLogin();
		
		String screen = "List Cargo Flown Transactions";
		commonMethods.searchMasterScreen(screen);
		Thread.sleep(3000);
		String title = commonMethods.getWebPageTitle();

		commonMethods.zoom("50%");
		
		ViewFlownObjects viewflown=new ViewFlownObjects(driver);
		viewflown.ClearExistingSearch();
		
		rowNum=1;
		toRowNum=10;
		for(int i=rowNum;i<=toRowNum;i++) {
			viewflown.fromSector(readExcelData.getExcelData(i,12));
			viewflown.toSector(readExcelData.getExcelData(i,13));
			viewflown.dropdownType(readExcelData.getExcelData(i,26));
			viewflown.serialNumber(commonMethods.EightDigitSerialNum(i));
			viewflown.SearchFlown();
			commonMethods.zoom("60%");
			commonMethods.takeScreenSot(title);
			
			String recordStatus=viewflown.getRecordStatus();
			asert.assertEquals(recordStatus, "1 records found", "No record found.Please check again");
			
		
					
			ProcessAndCloseFlownObjects processcloseflown=new ProcessAndCloseFlownObjects(driver);
			processcloseflown.selectRecord();
			processcloseflown.processFlown();
			String flownProcessmessage=processcloseflown.getMessageOnProcessFlown();
			asert.assertEquals(flownProcessmessage, "Flown batch successfully processed.", "There is issue with flown processing.");
			
			
			commonMethods.takeScreenSot(title);
			processcloseflown.refreshTxn();
			processcloseflown.selectRecord();
			processcloseflown.closeFlown();
			processcloseflown.remarks("Tested");
			commonMethods.takeScreenSot(title);
			processcloseflown.OkBtn();
			
			String flownClosemessage=processcloseflown.getMessageOnCloseFlown();
			asert.assertEquals(flownClosemessage, "Flown batch successfully closed.", "There is issue with flown closing.");
		
			commonMethods.takeScreenSot(title);
			
			processcloseflown.refreshTxn();
			commonMethods.zoom("50%");
			commonMethods.takeScreenSot(title);
			viewflown.ClearExistingSearch();
		}
		asert.assertAll();
	}
}
