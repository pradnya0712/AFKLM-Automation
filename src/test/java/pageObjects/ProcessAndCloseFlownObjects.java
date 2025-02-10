package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProcessAndCloseFlownObjects extends BasePage {

	public ProcessAndCloseFlownObjects(WebDriver driver) {
		super(driver);
	}
	
	 // Buttons and other web elements
    @FindBy(xpath = "//*[@id='appForm_onSearchButton']")
    private WebElement SearchBtn;

    @FindBy(xpath = "//*[@id='appForm_procBatchBtn']")
    private WebElement processTxnBtn;

    @FindBy(xpath = "//*[@id='appForm_closeBatchBtn']")
    private WebElement closeTxnBtn;

    @FindBy(xpath = "//*[@id='remark']")
    private WebElement textBoxRemark;

    @FindBy(xpath = "//*[@id='dialogForm1_okButton']")
    private WebElement OKBtn;

    @FindBy(xpath = "//*[@id='closeButton']")
    private WebElement CloseIconForMessage;

    @FindBy(xpath = "//*[@id='ListCargoFlown_Select_0']")
    private WebElement selectFirstRecordCheckbox;

    @FindBy(xpath = "//*[contains(text(),\"Flown batch successfully processed.\")]")
    private WebElement getSuccessMessageofFlownProcess;
    
    @FindBy(xpath = "//*[contains(text(),\"Selected record is already processed. Cannot action the same.\")]")
	private WebElement ExceptionMessageOnProcessFlown;

    @FindBy(xpath = "//*[contains(text(),\"Flown batch successfully closed.\")]")
    private WebElement getSuccessMessageofFlownClose;
    
    @FindBy(xpath = "//*[contains(text(),\"Selected transaction is already closed. No action required. \")]")
   	private WebElement ExceptionMessageOnCloseFlown;

    @FindBy(xpath = "//*[@id='appForm_clearBtn']")
    private WebElement clearBtn;
    
    

    
    
    public void selectRecord() {
    	selectFirstRecordCheckbox.click();
    }
    
    public void processFlown() {
    	processTxnBtn.click();
    }
    
    public void refreshTxn() {
    	SearchBtn.click();
    }
    
    public void closeFlown() {
    	closeTxnBtn.click();
    }
    
    public void remarks(String remark) {
    	
    		textBoxRemark.sendKeys(remark);
    	
    	
    }
    
    public void OkBtn() {
    
    		OKBtn.click();
    	
    	
    }
	
    public String getMessageOnProcessFlown() {
		String message = "";
	
		try {
			if (getSuccessMessageofFlownProcess.isDisplayed()) {
				message = getSuccessMessageofFlownProcess.getText();
			}
		}

		catch (Exception e) {
			if (ExceptionMessageOnProcessFlown.isDisplayed()) {
				message = ExceptionMessageOnProcessFlown.getText();
			}
		}

		return message;

	}
    
    public String getMessageOnCloseFlown() {
		String message = "";
	
		try {
			if (getSuccessMessageofFlownClose.isDisplayed()) {
				message = getSuccessMessageofFlownClose.getText();
			}
		}

		catch (Exception e) {
			if (ExceptionMessageOnCloseFlown.isDisplayed()) {
				message = ExceptionMessageOnCloseFlown.getText();
			}
		}

		return message;

	}


}
