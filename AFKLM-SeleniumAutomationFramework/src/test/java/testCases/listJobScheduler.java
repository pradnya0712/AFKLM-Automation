package testCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.ListJobSchedulerObjects;
import pageObjects.ListJobStatusObjects;
import utilities.readExcelData;

public class listJobScheduler extends BaseClass{
	 public static int rowNum;
	 public static int toRowNum;
		public  SoftAssert asert=new SoftAssert();
	 
	@Test
	public void revenueAccounting() throws InterruptedException, IOException {
		
		KLMDETLogin klmlogin=new KLMDETLogin();
		klmlogin.klmDETLogin();
		
		
		String[] RequiredPromptJobNames= {"R_REVENUE_ACCNT_T","EBC2016_CASS","EBC2016_LOC","CO_AWB_ACCNT_T","IMC2008"};
		String[] NotRequiredPromptJobNames= {"E_AWB_ACCNT_T","E_INV_ACCNT_T","CO_GHA_BILL_ACCNT_T"};
	
		String schedulerscreen="List Job Scheduler";
		
		ListJobSchedulerObjects scheduler=new ListJobSchedulerObjects(driver);

		rowNum=1;
		toRowNum=2;
		
	
		commonMethods.searchMasterScreen(schedulerscreen);
		
	for(int i=rowNum;i<=toRowNum;i++) {
	
		commonMethods.zoom("60%");
		String title=commonMethods.getWebPageTitle();
		scheduler.clearExistingRecord();
		scheduler.jobName(readExcelData.getExcelData(i,27));
		scheduler.selectJobType(readExcelData.getExcelData(i,29));
		scheduler.search();
		
		commonMethods.takeScreenSot(title);
		scheduler.selectJob();
		Thread.sleep(1000);
		
		scheduler.settingicon();
		
		if(commonMethods.arrayContains(RequiredPromptJobNames,readExcelData.getExcelData(i,27))) {
			
			scheduler.clearAllFieldData();
			Thread.sleep(1000);
			commonMethods.takeScreenSot(title);
			scheduler.flightNumber(readExcelData.getExcelData(i,24));
			scheduler.fromPeriod(readExcelData.getExcelData(i,3));
			scheduler.toPeriod(readExcelData.getExcelData(i,3));
			scheduler.fromSector(readExcelData.getExcelData(i,12));
			scheduler.toSector(readExcelData.getExcelData(i,13));
			commonMethods.takeScreenSot(title);
			scheduler.fireQuery();
		}
		
		else if(commonMethods.arrayContains(NotRequiredPromptJobNames,readExcelData.getExcelData(i,27))) {
			commonMethods.takeScreenSot(title);
			Thread.sleep(1000);
			scheduler.fireQuery();
		}
		
		
		commonMethods.zoom("60%");
		Thread.sleep(1000);
		commonMethods.takeScreenSot(title);
		
		String getjobStatus=scheduler.getJobStatus();
		asert.assertEquals(getjobStatus, "SCHEDULED","Job not executed. Please check.");
		
		//call list job status class
	//	ListJobStatus.viewJobStatus();
	//------job statys code;--------///
	String statusscreen="List Job Status";
	
		
		ListJobStatusObjects jobStatus=new ListJobStatusObjects(driver);
		commonMethods.searchMasterScreen(statusscreen);
		commonMethods.zoom("60%");

		jobStatus.clearExistinRecord();
		jobStatus.jobName(readExcelData.getExcelData(i,27));
		jobStatus.search();
		Thread.sleep(70000);
		jobStatus.search();
		commonMethods.zoom("60%");
		jobStatus.selectRecord();
		commonMethods.takeScreenSot(title);
		
		//-	----//
		
		commonMethods.searchMasterScreen(schedulerscreen);
		
	}
	
	scheduler.search();
	
		asert.assertAll();
		
	}
	


}
