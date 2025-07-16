package testCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;

import pageObjects.ListJobStatusObjects;
import utilities.readExcelData;

public class ListJobStatus extends BaseClass{
	
	public static int rowNum;
	 public static int toRowNum;

		public  SoftAssert asert=new SoftAssert();
		
	@Test
	public static void viewJobStatus() throws InterruptedException, IOException {
		 
//	        
//		KLMDETLogin klmlogin=new KLMDETLogin();
//		klmlogin.klmDETLogin();
		
		String statusscreen="List Job Status";
	
		
		ListJobStatusObjects jobStatus=new ListJobStatusObjects(driver);

		rowNum=1;
		toRowNum=1;
		

		for(int i=rowNum;i<=toRowNum;i++) {
			commonMethods.searchMasterScreen(statusscreen);
			commonMethods.zoom("60%");
			String title=commonMethods.getWebPageTitle();
			jobStatus.clearExistinRecord();
			jobStatus.jobName(readExcelData.getExcelData(i,27));
			jobStatus.search();
			Thread.sleep(70000);
			jobStatus.search();
			commonMethods.zoom("60%");
			jobStatus.selectRecord();
			commonMethods.takeScreenSot(title);
		
		}
		
			
		
	}
}
