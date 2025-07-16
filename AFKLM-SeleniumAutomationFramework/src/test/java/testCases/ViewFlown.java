package testCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import pageObjects.ViewFlownObjects;
import utilities.readExcelData;

public class ViewFlown extends BaseClass{
	public  SoftAssert asert=new SoftAssert();
    public static int rowNum;
    public static int toRowNum;
	
	@Test(groups="regression")
	public void viewFlown() throws InterruptedException, IOException {
	
			KLMDETLogin klmlogin = new KLMDETLogin();
			klmlogin.klmDETLogin();

			rowNum=1;
			toRowNum=10;
			
			String screen = "List Cargo Flown Transactions";
			commonMethods.zoom("50%");
			
			
			ViewFlownObjects viewflown=new ViewFlownObjects(driver);
			
			
			for(int i=rowNum;i<=toRowNum;i++) {
				commonMethods.searchMasterScreen(screen);
				Thread.sleep(3000);
				String title = commonMethods.getWebPageTitle();
				viewflown.ClearExistingSearch();
				viewflown.fromSector(readExcelData.getExcelData(i,12));
				viewflown.toSector(readExcelData.getExcelData(i,13));
				viewflown.dropdownType(readExcelData.getExcelData(i,26));
				viewflown.serialNumber(commonMethods.EightDigitSerialNum(i));
				viewflown.SearchFlown();
				commonMethods.zoom("60%");
				commonMethods.takeScreenSot(title);
				
				String recordStatus=viewflown.getRecordStatus();
				asert.assertEquals(recordStatus, "1 records found", "No record found.Please check again");
				asert.assertAll();
			}
		
		
		
	}
	
	

}
