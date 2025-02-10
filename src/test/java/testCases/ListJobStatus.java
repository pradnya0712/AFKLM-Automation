package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;

import pageObjects.ListJobStatusObjects;

public class ListJobStatus extends BaseClass{

	@Test
	public void viewRevenueAccounitngJobStatus() throws InterruptedException, IOException {
		 
	        
		KLMDETLogin klmlogin=new KLMDETLogin();
		klmlogin.klmDETLogin();
		
		String screen="List Job Status";
		commonMethods.searchMasterScreen(screen);
		commonMethods.zoom("60%");
		
		ListJobStatusObjects jobStatus=new ListJobStatusObjects(driver);
		String title=commonMethods.getWebPageTitle();
		String jobName="R_REVENUE_ACCNT_F";
		String jobType="ADHOC";
		
		jobStatus.clearExistinRecord();
		jobStatus.jobName(jobName);
		jobStatus.search();
		Thread.sleep(60000);
		commonMethods.zoom("60%");
		jobStatus.selectRecord();
		commonMethods.takeScreenSot(title);
	}
}
