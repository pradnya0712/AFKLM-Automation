package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.ExportBillingObjects;

public class ExportBilling extends BaseClass {
    public static int rowNum;
    public static int toRowNum;
	public static String startBillingPeriod;
	public static String endBillingPeriod;
	public static String country;
	public static String AgentType;
	
	@Test
	public void performExportBilling() throws InterruptedException, IOException {
		
		KLMDETLogin klmlogin = new KLMDETLogin();
		klmlogin.klmDETLogin();
		
		String screen = "Export Billing Worklist";
		commonMethods.zoom("50%");
		commonMethods.searchMasterScreen(screen);
		Thread.sleep(1000);
		commonMethods.zoom("50%");
		
		ExportBillingObjects doExportBilling=new ExportBillingObjects(driver);
		String title=commonMethods.getWebPageTitle();
		
		rowNum=5; 
		toRowNum=5;
		for(int i=rowNum;i<=toRowNum;i++) {
			doExportBilling.clearAllExistinfDetails();
			commonMethods.zoom("50%");
	
			doExportBilling.enterSerialNumber(commonMethods.EightDigitSerialNum(i));
	    	//commonMethods.zoom("50");
		Thread.sleep(1000);
		doExportBilling.searchRecord();
			
		commonMethods.zoom("50%");
		commonMethods.takeScreenSot(title);
		doExportBilling.selectRecord();
		
	        String billingRecordStatus=doExportBilling.getBillingRecordStatus();
	        System.out.println("--->"+billingRecordStatus);
			startBillingPeriod=doExportBilling.getStartBillingPeriod();
			System.out.println(startBillingPeriod);
			endBillingPeriod=doExportBilling.getEndBillingPeriod();
			System.out.println(endBillingPeriod);
			country=doExportBilling.getCountry();
			System.out.println(country);
			AgentType=doExportBilling.getAgentType();
			System.out.println(AgentType);
			
	
			
				if(billingRecordStatus.equalsIgnoreCase("Pending Rate Computation") ) {
					doExportBilling.computeRateComputation();
					commonMethods.takeScreenSot(title);
					doExportBilling.closePopupBox();
					doExportBilling.searchRecord();
					commonMethods.zoom("50%");
					doExportBilling.selectRecord();
					billingRecordStatus=doExportBilling.getBillingRecordStatus();
					System.out.println(billingRecordStatus);
				}
					if(billingRecordStatus.equalsIgnoreCase("Billing Records Not Created") ) {
						doExportBilling.generateBilling();
						commonMethods.takeScreenSot(title);
						doExportBilling.closePopupBox();
						doExportBilling.searchRecord();
						commonMethods.zoom("50%");
						doExportBilling.selectRecord();
						billingRecordStatus=doExportBilling.getBillingRecordStatus();
						System.out.println(billingRecordStatus);
						
					}
					
					if(billingRecordStatus.equalsIgnoreCase("Billing Records Created") ) {
							doExportBilling.confirmBilling();;
							commonMethods.takeScreenSot(title);
							doExportBilling.closePopupBox();
							doExportBilling.searchRecord();
							commonMethods.zoom("50%");
							doExportBilling.selectRecord();
							billingRecordStatus=doExportBilling.getBillingRecordStatus();
							System.out.println(billingRecordStatus);
						}
					
					
						if(billingRecordStatus.equalsIgnoreCase("Confirmed") ) {
							commonMethods.takeScreenSot(title);
							doExportBilling.scrollRight();
							commonMethods.takeScreenSot(title);
							if(AgentType.equalsIgnoreCase("CASS Agent")) {
								EBCassFileGeneration.generateCassFile(country, startBillingPeriod, endBillingPeriod);
								//generate final cass file and accept it
								//go to list job scheduler
							}
							else {
								//go to list job scheduler
							}
						
					}
					
					     
					}
				
			}
			
		


			
		}
		
		
	

