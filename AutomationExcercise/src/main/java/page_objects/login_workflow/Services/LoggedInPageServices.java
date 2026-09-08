package page_objects.login_workflow.Services;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import page_objects.login_workflow.UI.LoggedInPageUI;

public class LoggedInPageServices {

    private final WebDriver driver;
    private final LoggedInPageUI loggedInPageUI;
    private final Actions actions;

    /**
     * Constructor
     * @param driver
     */
    public LoggedInPageServices(WebDriver driver){

        this.driver = driver;
        this.loggedInPageUI = new LoggedInPageUI(driver);
        this.actions = new Actions(driver);
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

    /**
     * Method that clicks logout button
     */
    public void clickLogout(){

        WebElement btnLogout = loggedInPageUI.logOut();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnLogout);

    }

    /**
     * Clicks cart button
     */
    public void clickCart(){

        WebElement btnCart = loggedInPageUI.cartButton();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnCart);

    }

    /**
     * Hoverover overlay Rs400
     */
    public void hoverOverRs500(){

        actions.moveToElement(loggedInPageUI.hoverOverRs500()).perform();
    }

    /**
     * Clicks add cart button
     */
    public void clickAddCartRs500(){

        WebElement btnCart = loggedInPageUI.addCartRs500();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnCart);
    }

    /**
     * Clicks Continue Shopping button
     */
    public void clickContinueShopping(){

        WebElement btnShop = loggedInPageUI.continueShopping();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnShop);
    }

}
