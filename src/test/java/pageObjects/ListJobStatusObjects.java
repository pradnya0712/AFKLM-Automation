package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ListJobStatusObjects extends BasePage{

	public ListJobStatusObjects(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//*[@id=\"searchSection_clearButtonInfo\"]")
	private WebElement clearBtn;
	
	@FindBy(xpath="//*[@id=\"searchSection_jobName\"]")
	private WebElement textBoxJobName;
	
	@FindBy(xpath="//*[@id=\"Search\"]")
	private WebElement searchBtn;
	
	@FindBy(xpath="//*[@id=\"ListSchedulerStatusListSection_Select_0\"]")
	private WebElement selecFirstRecord;
	
	public void clearExistinRecord() {
		clearBtn.click();
	}
	
	public void jobName(String jobname) {
		textBoxJobName.sendKeys(jobname);
	}

	public void search() {
		searchBtn.click();
	}
	
	public void selectRecord() {
		selecFirstRecord.click();
	}
	
}
