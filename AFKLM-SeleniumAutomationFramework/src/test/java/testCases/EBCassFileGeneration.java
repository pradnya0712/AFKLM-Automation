package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.EBCassFileGenerationObjects;
import utilities.readExcelData;

public class EBCassFileGeneration extends  BaseClass{

	
	@Test
	public static void generateCassFile(String country,String startBillingPeriod,String endBillingPeriod) throws InterruptedException, IOException {
		
//		KLMDETLogin klmlogin = new KLMDETLogin();
//		klmlogin.klmDETLogin();

		String screen="EB CASS File Generation Scheduler";
		commonMethods.searchMasterScreen(screen);
		Thread.sleep(3000);
		String title = commonMethods.getWebPageTitle();

		commonMethods.zoom("50%");
		EBCassFileGenerationObjects cassFile =new EBCassFileGenerationObjects(driver);
		
		cassFile.clearAllExistingDetails();
		cassFile.enterCountry(country);
		cassFile.enterStartBillingPeriod(startBillingPeriod);
		cassFile.enterEndBillingPeriod(endBillingPeriod);
		commonMethods.takeScreenSot(title);
		cassFile.searchRecord();
		commonMethods.zoom("50%");
		commonMethods.takeScreenSot(title);
		cassFile.selectRecord();
		cassFile.generateCassFileBtn();
		commonMethods.takeScreenSot(title);
		cassFile.generateDraftCassFile();
		commonMethods.takeScreenSot(title);
		cassFile.closePopUpBox1();
		cassFile.closePopUpBox2();
		cassFile.searchRecord();
		commonMethods.zoom("50%");
		cassFile.selectRecord();
	
		
		
	}

}
