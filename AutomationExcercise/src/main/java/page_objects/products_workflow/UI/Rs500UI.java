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
    

}
