package page_objects.products_workflow.UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PoloBrandPageUI {

    private WebDriver driver;

    /**
     * Constructor
     * @param driver
     */
    public PoloBrandPageUI(WebDriver driver){

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
     * Returns a WebElement
     * @return
     */
    public WebElement brandsBox(){

        return driver.findElement(By.cssSelector(".brands_products"));
    }

    /**
     * Returns a WebElement
     * @return
     */
    public WebElement madameButton(){

        return driver.findElement(By.cssSelector("a[href='/brand_products/Madame']"));
    }

}
