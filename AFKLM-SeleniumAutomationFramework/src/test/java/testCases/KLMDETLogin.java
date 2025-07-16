package testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.KLMLoginObjects;
import pageObjects.SSOLoginObjects;

public class KLMDETLogin extends BaseClass{

//	@Test(dataProvider ="logindata")
	//public void klmDETLogin(String username,String password) throws InterruptedException{
	public void klmDETLogin() throws InterruptedException {
		
		SSOLoginObjects ssologin=new SSOLoginObjects(driver);
		ssologin.username(config.getProperty("username"));
		//ssologin.username(username);
		Thread.sleep(2000);
		ssologin.continueLogin();
		
		ssologin.password(config.getProperty("password"));
		//ssologin.password(password);
		ssologin.login();
		
		KLMLoginObjects klmLogin=new KLMLoginObjects(driver);
		klmLogin.KLMDETLogin();
		
		commonMethods.switchToNewWindow();
		commonMethods.acceptPopup();
		
		
		
	}
	
	@DataProvider(name = "logindata")
	public  Object[][] loginData(){
		
		Object[][] data= {
				{"Kalpana","Accelya@123"},
				{"Sakshi","sakshi123"},
				{"pradnyag","Pradnya@123"}
		};
		return data;
	}
	
}
