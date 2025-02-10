package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ListJobSchedulerObjects;

public class listJobScheduler extends BaseClass{
	
	@Test
	public void revenueAccounting() throws InterruptedException, IOException {
		
		KLMDETLogin klmlogin=new KLMDETLogin();
		klmlogin.klmDETLogin();
		
		String screen="List Job Scheduler";
		commonMethods.searchMasterScreen(screen);
		commonMethods.zoom("60%");
		
		ListJobSchedulerObjects scheduler=new ListJobSchedulerObjects(driver);
		String title=commonMethods.getWebPageTitle();
		String jobName="R_REVENUE_ACCNT_F";
		String jobType="ADHOC";
		
		scheduler.clearExistingRecord();
		scheduler.jobName(jobName);
		scheduler.selectJobType(jobType);
		scheduler.search();
		
		commonMethods.takeScreenSot(title);
		scheduler.selectJob();
		Thread.sleep(1000);
		
		scheduler.settingicon();
		scheduler.clearAllFieldData();
		Thread.sleep(1000);
		
		commonMethods.takeScreenSot(title);
		scheduler.flightNumber(commonMethods.dataFile.getProperty("flightNumber"));
		scheduler.fromPeriod(commonMethods.dataFile.getProperty("IssueDate"));
		scheduler.toPeriod(commonMethods.dataFile.getProperty("IssueDate"));
		scheduler.fromSector(commonMethods.dataFile.getProperty("Origin"));
		scheduler.toSector(commonMethods.dataFile.getProperty("Destination"));
		commonMethods.takeScreenSot(title);
		scheduler.fireQuery();
		commonMethods.zoom("60%");
		Thread.sleep(1000);
		commonMethods.takeScreenSot(title);
		
		String jobStatus=scheduler.getJobStatus();
		Assert.assertEquals(jobStatus, "SCHEDULED","Job not executed. Please check.");
		
	}

}
