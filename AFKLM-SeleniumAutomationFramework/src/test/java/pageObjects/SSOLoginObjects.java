package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testCases.commonMethods;

public class SSOLoginObjects extends BasePage {
	
	public SSOLoginObjects(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath = "//*[@placeholder='Please enter your username']")
	private WebElement username;

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement continueBtn;

	// User Login elements
	@FindBy(xpath = "//*[@id='password']")
	private WebElement Password;

	@FindBy(xpath = "//*[@id='kc-login']")
	private WebElement loginBtn;
	
	
	public void username(String userName) {
		username.clear();
		username.sendKeys(userName);
	}
	
	
	public void continueLogin() {
		continueBtn.click();
	
	}
	public void password(String password) {
		Password.clear();
		Password.sendKeys(password);
	}
	
	public void login() {
		loginBtn.click();
	}
}
