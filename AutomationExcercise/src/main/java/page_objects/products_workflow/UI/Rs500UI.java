package page_objects.products_workflow.UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 * Rs500UI
 */
public class Rs500UI {

    private WebDriver driver;

    /**
     * Constructor
     * @param driver
     */
    public Rs500UI (WebDriver driver){

        this.driver = driver;
    }

    /**
     * Get driver
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
     * Returns a webelement
     * @return WebElement
     */
    public WebElement rs500Information(){

        return driver.findElement(By.cssSelector(".product-information"));
    }

    /**
     * Returns a webelement
     * @return WebElement
     */
    public WebElement rs500Quantity(){

        return driver.findElement(By.cssSelector("input[id='quantity']"));
    }

    /**
     * Returns a webelement
     * @return WebElement
     */
    public WebElement addToCart(){

        return driver.findElement(By.cssSelector(".btn.btn-default.cart"));
    }

    /**
     * Returns a webelement
     * @return WebElement
     */
    public WebElement viewCart(){

        return driver.findElement(By.cssSelector("a[href='/view_cart']"));
        
    }

}
