package page_objects.signup_workflow.Services;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import page_objects.signup_workflow.UI.AccountCreatedUI;

public class AccountCreatedServices {

    private final WebDriver driver;
    private final AccountCreatedUI accountCreatedUI;

    /**
     * Constructor
     * @param driver
     */
    public AccountCreatedServices(WebDriver driver){

        this.driver = driver;
        accountCreatedUI = new AccountCreatedUI(driver);
    }

    /**
     * Method that clicks continue button
     */
    public void clickContinue(){

        WebElement btnContinue = accountCreatedUI.continueButton();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnContinue);
    }

}
