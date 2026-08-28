package page_objects.login_workflow.Services;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import page_objects.login_workflow.UI.LoggedInPageUI;

public class LoggedInPageServices {

    private final WebDriver driver;
    private final LoggedInPageUI loggedInPageUI;

    /**
     * Constructor
     * @param driver
     */
    public LoggedInPageServices(WebDriver driver){

        this.driver = driver;
        loggedInPageUI = new LoggedInPageUI(driver);
    }

    /**
     * Method that clicks delete button in Main Page when an user
     * is logged
     */
    public void clickDelete(){

        WebElement btnDelete = loggedInPageUI.deleteAccount();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnDelete);
    }


}
