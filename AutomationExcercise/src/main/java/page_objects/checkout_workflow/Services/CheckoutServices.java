package page_objects.checkout_workflow.Services;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import page_objects.checkout_workflow.UI.CheckoutUI;

public class CheckoutServices {

    private final WebDriver driver;
    private final CheckoutUI checkoutUI;

    /**
     * Constructor
     * @param driver
     */
    public CheckoutServices(WebDriver driver){

        this.driver = driver;
        this.checkoutUI = new CheckoutUI(driver);
    }

    /**
     * Writes a message in comments area
     */
    public void enterMessage(String message){

        checkoutUI.commentsArea().sendKeys(message);
    }

    /**
     * Clicks Place order button
     */
    public void clickPlaceOrder(){

        WebElement btnOrder = checkoutUI.placeOrder();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnOrder);
    }

}
