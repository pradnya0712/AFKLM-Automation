package testCases;

import java.io.IOException;

import org.openqa.selenium.By;

public class AFDETLogin extends BaseClass {

		public static void AfDetLogin() throws InterruptedException, IOException {
			SSOLogin ssoLogin = new SSOLogin();
			ssoLogin.ssoLogin();

			String mainWindowHandle = driver.getWindowHandle();
			driver.findElement(By.xpath("//*[text()=\"AF DET \"]")).click();

			commonMethods.switchToNewWindow();
			commonMethods.acceptPopup();
		}
		
		public static void main(String[] args) throws InterruptedException, IOException {
		//	AfDetLogin();
		}
	}