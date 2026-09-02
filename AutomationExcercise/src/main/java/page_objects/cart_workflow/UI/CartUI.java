package page_objects.cart_workflow.UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartUI {

    private WebDriver driver;

    /**
     * Constructor
     * @param driver
     */
    public CartUI(WebDriver driver){

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
    public void setDriver (WebDriver driver){

        this.driver = driver;
    }

    /**
     * Method that returns a text box element
     * @return Textbox
     */
    public WebElement cartSubscription(){

        return getDriver().findElement(By.cssSelector("#susbscribe_email"));
    }

    /**
     * Returns a text
     * @return Text
     */
    public WebElement cartSubscriptionText(){

        return driver.findElement(By.xpath("//h2[contains(text(),'Subscription')]"));
    }

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement cartSubscriptionArrow(){

        return getDriver().findElement(By.cssSelector("#subscribe"));
    }

    /**
     * Returns a text
     * @return Text
     */
    public WebElement cartSuccessSubscribe(){

        return driver.findElement(By.id("success-subscribe"));
    }

    public WebElement tableOfContents(){

        return driver.findElement(By.cssSelector("table[id='cart_info_table']"));
    }
}
