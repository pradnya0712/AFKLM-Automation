package testCases;

import org.testng.annotations.Test;

import pageObjects.KLMLoginObjects;
import pageObjects.SSOLoginObjects;

public class KLMDETLogin extends BaseClass{

	
	public void klmDETLogin() throws InterruptedException {
		
		SSOLoginObjects ssologin=new SSOLoginObjects(driver);
		ssologin.username(commonMethods.dataFile.getProperty("username"));
		Thread.sleep(2000);
		ssologin.continueLogin();
		ssologin.password(commonMethods.dataFile.getProperty("password"));
		ssologin.login();
		
		KLMLoginObjects klmLogin=new KLMLoginObjects(driver);
		klmLogin.KLMDETLogin();
		
		commonMethods.switchToNewWindow();
		commonMethods.acceptPopup();
		
		
		
	}
	
}
