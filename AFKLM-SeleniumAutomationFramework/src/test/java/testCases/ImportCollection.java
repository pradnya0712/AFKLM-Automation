package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.ImportCollectionObjects;

public class ImportCollection extends BaseClass{
	
	@Test
	public void captureImportCollection() throws InterruptedException, IOException {
	
		KLMDETLogin klmlogin=new KLMDETLogin();
		klmlogin.klmDETLogin();
		
		
		String screen="List Import Collection";
		commonMethods.searchMasterScreen(screen);
		commonMethods.zoom("50%");
		Thread.sleep(1000);
		String title=commonMethods.getWebPageTitle();
		
		ImportCollectionObjects imcObject=new ImportCollectionObjects(driver);
	    imcObject.NewCollection();
		commonMethods.zoom("50%");
		imcObject.enterAirport("AMS");
		imcObject.clickOnCollectorSearchIcon();
		imcObject.selectFirstCollector("AMS");
		imcObject.enterStartPeriod("01/01/2024");
		imcObject.enterEndPeriod("01/01/2024");
		imcObject.enterCashAmount("300");
		imcObject.enterDocumnetCount("1");
		commonMethods.takeScreenSot(title);
		imcObject.SaveData();
		commonMethods.zoom("50%");
		commonMethods.takeScreenSot(title);
		imcObject.closePopUpBox();
		imcObject.addNewTxn();
		imcObject.enterAirlinePrefix("074");
		imcObject.enterSerialNumber("11000566");
		commonMethods.takeScreenSot(title);
		
		imcObject.addCCCollectionDetailsBtn();
		imcObject.enterCCOtherCharge("BI");
		imcObject.enterChargeAmount("300");
		
		//if(cashAmount==NULL){
		
		//imcObject.enterCustomerCode("");
		
		//	}
		
		imcObject.SaveTxnDetails();
		commonMethods.zoom("50%");
		commonMethods.takeScreenSot(title);
		imcObject.closePopUpBox();
	
		
	}

}
