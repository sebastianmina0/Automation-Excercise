package page_objects.order_placed.UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPlacedUI {

    private WebDriver driver;

    public OrderPlacedUI(WebDriver driver){

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
    public WebElement orderPlacedDeleteButton(){

        return driver.findElement(By.cssSelector("a[href='/delete_account']"));
    }

}
