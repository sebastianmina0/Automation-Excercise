package page_objects.checkout_workflow.UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutUI {

    private WebDriver driver;

    /**
     * Constructor
     * @param driver
     */
    public CheckoutUI(WebDriver driver){

        this.driver = driver;
    }

    /**
     * Get Driver
     * @return
     */
    public WebDriver getDriver(){

        return driver;
    }

    /**
     * Set driver
     * @param driver
     */
    public void setDriver(WebDriver driver){

        this.driver = driver;
    }

    /**
     * Returns a WebElement
     * @return WebElement
     */
    public WebElement checkOutInformation(){

        return driver.findElement(By.cssSelector(".checkout-information"));
    }

    /**
     * Returns a WebElement
     * @return WebElement
     */
    public WebElement orderTable(){

        return driver.findElement(By.cssSelector(".table.table-condensed"));
    }

    /**
     * Returns a WebElement
     * @return WebElement
     */
    public WebElement commentsArea(){

        return driver.findElement(By.cssSelector(".form-control"));
    }

    /**
     * Returns a WebElement
     * @return WebElement
     */
    public WebElement placeOrder(){

        return driver.findElement(By.cssSelector(".btn.btn-default.check_out"));
    }

}
