package page_objects.delete_account.Services;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import page_objects.delete_account.UI.AccountDeletedUI;

public class AccountDeletedServices {

    private final WebDriver driver;
    private final AccountDeletedUI accountDeletedUI;

    /**
     * Constructor
     * @param driver
     */
    public AccountDeletedServices(WebDriver driver){
        this.driver = driver;
        this.accountDeletedUI = new AccountDeletedUI(driver);
    }

    /**
     * Method that clicks continue button in Account Deleted page
     */
    public void clickContinue(){

        WebElement btnContinue = accountDeletedUI.continueButton();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnContinue);    
    }


}
