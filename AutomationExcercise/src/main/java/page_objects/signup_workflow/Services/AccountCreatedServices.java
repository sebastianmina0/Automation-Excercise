package page_objects.signup_workflow.Services;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import page_objects.signup_workflow.UI.AccountCreatedUI;

public class AccountCreatedServices {

    private final WebDriver driver;
    private final AccountCreatedUI accountCreatedUI;

    public AccountCreatedServices(WebDriver driver){

        this.driver = driver;
        accountCreatedUI = new AccountCreatedUI(driver);
    }

    public void clickContinue(){

        WebElement btnContinue = accountCreatedUI.continueButton();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnContinue);
    }

}
