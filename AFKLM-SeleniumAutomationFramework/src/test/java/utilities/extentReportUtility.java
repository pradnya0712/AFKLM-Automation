package utilities;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.testing.framework.EmailUtils;

import testCases.commonMethods;

public class extentReportUtility implements ITestListener {
	
	public ExtentSparkReporter sparkReport;//for UI of report
	public ExtentReports extent;//to set common info in report
	public ExtentTest test;// to create entries of testcase in report and update test method status 
	String reportName;

	public void onStart(ITestContext context) {
		
		String timeStamp=new SimpleDateFormat("MM.dd.yyyy_hh.mm.ss").format(new Date());
		 reportName="AFKLM Automation Execution Report__"+timeStamp+".html";
		
		System.out.println("Execution started");
		sparkReport=new ExtentSparkReporter(System.getProperty("user.dir")+"\\reports\\"+reportName);
		sparkReport.config().setDocumentTitle("Automation Execution Report");
		sparkReport.config().setReportName("Functional Testing");
		sparkReport.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReport);
		extent.setSystemInfo("project Info","AFKLM" );
		extent.setSystemInfo("Tester Name", System.getProperty("user.name"));
		extent.setSystemInfo("OS", "Windows 11");
		extent.setSystemInfo("Browser","Edge" );
		//BaseClass.dataFile.getProperty("browser")
	}
	
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test case Execution started");
		
	}

	
	public void onTestSuccess(ITestResult result) {
		System.out.println("test case passed");
		
		test=extent.createTest(result.getName());
		test.log(Status.PASS, result.getName()+":-Test case executed successfully");
		
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("test case failed");
		test=extent.createTest(result.getName());
		test.log(Status.FAIL, result.getName()+"  Test case failed.");
		test.log(Status.FAIL, "Test case failed cause is: "+result.getThrowable().getMessage());
		String imgPath;
		try {
			imgPath = commonMethods.takeScreenSot(result.getName());
			test.addScreenCaptureFromPath(imgPath);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}


	public void onTestSkipped(ITestResult result) {
	
		System.out.println("test case skipped");
		test=extent.createTest(result.getName());
		test.log(Status.SKIP, result.getName()+":- got skipped");
		test.log(Status.FAIL, result.getThrowable().getMessage());
	
	}

	


	public void onFinish(ITestContext context) {
		
		System.out.println("Execution finish");
		extent.flush();
		
		
		//open report
		String reportPath=System.getProperty("user.dir")+"\\reports\\"+reportName;
		File openReport=new File(reportPath);
		try {
			Desktop.getDesktop().browse(openReport.toURI());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
    EmailUtils utilis=new EmailUtils();
   
    try {
    	 Properties prop=new Properties();
    	    FileInputStream emailData=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\emailConfig.properties");
		    prop.load( emailData);
		    System.out.println(prop.getProperty("to"));
		    List<String> attachements=new ArrayList<>();
		    attachements.add(reportPath);
		    
           utilis.sendUsingGmail(prop, "Automation Execution Report","Hi Team,\n please find the attched report for execution of test cases",attachements);
    
    } 
    catch(Exception e) {
    	e.printStackTrace();
    }
    
    

    
    
    
	}

	
}
