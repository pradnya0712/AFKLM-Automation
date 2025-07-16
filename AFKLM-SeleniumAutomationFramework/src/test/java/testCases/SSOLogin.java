package testCases;

import org.testng.annotations.Test;

import pageObjects.SSOLoginObjects;

public class SSOLogin extends BaseClass{
	
	
	public void ssoLogin() throws InterruptedException {
		SSOLoginObjects ssologin=new SSOLoginObjects(driver);
		ssologin.username(config.getProperty("username"));
		Thread.sleep(2000);
		ssologin.continueLogin();
		ssologin.password(config.getProperty("password"));
		ssologin.login();
	}
	
   
	
	

}
