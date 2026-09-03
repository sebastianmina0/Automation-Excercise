package page_objects.order_placed.Services;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import page_objects.order_placed.UI.OrderPlacedUI;

public class OrderPlacedServices {

    private final WebDriver driver;
    private final OrderPlacedUI orderPlacedUI;

    /**
     * Constructor
     * @param driver
     */
    public OrderPlacedServices(WebDriver driver){

        this.driver = driver;
        this.orderPlacedUI = new OrderPlacedUI(driver);
    }

    /**
     * Clicks delete account button
     */
    public void clickDeleteAccount(){

        WebElement btnDelete = orderPlacedUI.orderPlacedDeleteButton();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnDelete);
    }


}
