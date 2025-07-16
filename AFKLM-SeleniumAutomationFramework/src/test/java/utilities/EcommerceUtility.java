package utilities;

import java.awt.Desktop;
import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testCases.BaseClass;

public class EcommerceUtility extends BaseClass implements ITestListener {
	public  ExtentReports extent;
	public ExtentTest test;
	String reportName;
	public void onStart(ITestContext context) {
		
		String formattedDate=new SimpleDateFormat("dd.MM.yyyy.hh.mm.ss").format(new Date());
		 reportName="EcommerceAutomationReport_"+formattedDate+"report.html";
		ExtentSparkReporter report = new ExtentSparkReporter(
		System.getProperty("user.dir") + "\\repors\\" + reportName);
		ExtentReports extent = new ExtentReports();
		report.config().setDocumentTitle("Ecommerce Testing");
		report.config().setTheme(Theme.DARK);
		report.config().setReportName("Pradnya Gund");

		extent.attachReporter(report);
		extent.setSystemInfo("Project Name", "Ecommerce Testing");
		extent.setSystemInfo("Operating System", "Windows 11");
		extent.setSystemInfo("Browser", "Edge");
		extent.setSystemInfo("Tester Name", "Pradnya Gund");
	}

	public void onTestStart(ITestResult result) {
      System.out.println("Test Execution started");	
	}

	public void onTestSuccess(ITestResult result) {
        System.out.println("Test case passed");
		test=extent.createTest(result.getName());
		test.log(Status.PASS, result.getName()+"is passed");
		
	}

	public void onTestFailure(ITestResult result) {
      System.out.println("Test case failed");
      test=extent.createTest(result.getName());
      test.log(Status.FAIL, result.getName()+" is failed");
      test.log(Status.FAIL,result.getThrowable().getMessage());
      

	}

	public void onTestSkipped(ITestResult result) {
		 System.out.println("Test case skipped");
	      test=extent.createTest(result.getName());
	      test.log(Status.SKIP, result.getName()+" is skipped");
	      test.log(Status.FAIL,result.getThrowable().getMessage());
	}

	public void onFinish(ITestContext context) {
		 System.out.println("Test case executing completed");
	      extent.flush();
	      
	      String reportPath=System.getProperty("user.dir") + "\\repors\\" + reportName;
	     File file=new File(reportPath);
	      try {
	    	  Desktop.getDesktop().browse(file.toURI());
	      }
	      catch(Exception e) {
	    	  e.printStackTrace();
	      }
	}

	
}
