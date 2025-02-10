package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KLMLoginObjects extends BasePage{

	
	public KLMLoginObjects(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[text()=\"KLM DET \"]")
	private WebElement KLMDETLink;
	
	
	public void KLMDETLogin() {
		KLMDETLink.click();
	}
}
