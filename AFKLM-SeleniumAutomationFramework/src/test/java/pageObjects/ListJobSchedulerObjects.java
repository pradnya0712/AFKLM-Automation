package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testCases.commonMethods;

public class ListJobSchedulerObjects extends BasePage{

	public ListJobSchedulerObjects(WebDriver driver) {
		super(driver);
	}
	

	@FindBy(xpath = "//*[@id=\"searchSection_jobName\"]")
	private WebElement textBoxJobName;

	@FindBy(xpath = "//*[@id=\"jobType\"]")
	private WebElement dropDownJobType;

	@FindBy(xpath = "//*[@id=\"Search\"]")
	private WebElement searchBtn;

	@FindBy(xpath = "//*[@id=\"listSection_Select_0\"]")
	private WebElement selectFirstRecord;

	@FindBy(xpath = "//*[@id=\"fireNow_0\"]")
	private WebElement settingIcon;

	
	//revenue accounting
	
	@FindBy(xpath = "//*[@id=\"jobPrompt3\"]")
	private WebElement textBoxFlightNumber;

	@FindBy(xpath = "//*[@id=\"jobPrompt4\"]")
	private WebElement textBoxFlownFromPeriod;

	@FindBy(xpath = "//*[@id=\"jobPrompt5\"]")
	private WebElement textBoxFlownToPeriod;

	@FindBy(xpath = "//*[@id=\"jobPrompt6\"]")
	private WebElement textBoxFromSector;

	@FindBy(xpath = "//*[@id=\"jobPrompt7\"]")
	private WebElement textBoxToSector;
	
	@FindBy(xpath = "//*[@id=\"jobDetailPromptsJQForm_submitButtonInfo\"]")
	private WebElement fireNowBtn;
	
	@FindBy(xpath = "//*[@id=\"searchSection_clearButtonInfo\"]")
	private WebElement clearBtn;
	
	
	@FindBy(xpath = "(//*[contains(text(),\"SCHEDULED\")])[2]")
	private WebElement jobStatus;
	

	
	
	public void clearExistingRecord() {
		clearBtn.click();
	}
	public void jobName(String jobname) {
		textBoxJobName.clear();
		textBoxJobName.sendKeys(jobname);
		
	}
	public void selectJobType(String jobType) {
		commonMethods.selectDropDown(dropDownJobType, jobType);
	}
	
	public void search() {
		searchBtn.click();
	}
	
	public void selectJob() {
		selectFirstRecord.click();
	}
	
	public void settingicon() {
		settingIcon.click();
		
	}
	
	public void clearAllFieldData() throws InterruptedException {
		Thread.sleep(1000);
		textBoxFlightNumber.clear();
		textBoxFlownFromPeriod.clear();
		textBoxFlownToPeriod.clear();
		textBoxFromSector.clear();
		textBoxToSector.clear();
	}
	
	
	public void flightNumber(String flightnumber) {
		textBoxFlightNumber.sendKeys(flightnumber);
	}
	
	public void fromPeriod(String fromperiod) {
		textBoxFlownFromPeriod.sendKeys(fromperiod);
	}
	
	public void toPeriod(String toperiod) {
		textBoxFlownToPeriod.sendKeys(toperiod);
	}
	
	public void fromSector(String fromsector) {
		textBoxFromSector.sendKeys(fromsector);
	}
	
	public void toSector(String tosector) {
		textBoxToSector.sendKeys(tosector);
	}
	
	public void fireQuery() {
		fireNowBtn.click();
	}
	
	public String getJobStatus() {
		String message=jobStatus.getText();
		return message;
	}
	

	
	

}
