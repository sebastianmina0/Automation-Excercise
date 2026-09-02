package page_objects.products_workflow.UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 * ProductsPageUI
 */
public class ProductsPageUI {

    private WebDriver driver;

    /**
     * Constructor
     * @param driver
     */
    public ProductsPageUI(WebDriver driver){

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
     * Returns a web element
     * @return WebElement
     */
    public WebElement allProducts(){

        return driver.findElement(By.cssSelector(".features_items"));
    }

    public WebElement searchTextBox(){

        return driver.findElement(By.cssSelector("input[id='search_product']"));
    }

    public WebElement submitSearch(){

        return driver.findElement(By.cssSelector("button[id='submit_search']"));
    }

    public WebElement searchedProducts(){

        return driver.findElement(By.xpath("//h2[contains(text(),'Searched Products')]"));
    }

    public WebElement featureItems(){

        return driver.findElement(By.cssSelector(".feature_items"));
    }

    //RS500 WebElements

    /**
     * Returns a button
     * @return Button
     */
    public WebElement viewProductRs500(){

        return driver.findElement(By.cssSelector("a[href='/product_details/1']"));
    }

    /**
     * Returns a WebElement
     * @return WebElement
     */
    public WebElement rs500Overlay(){

        return driver.findElement(By.xpath("//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[1]//div[2]"));
        
    }

    /**
     * Returns a WebElement
     * @return WebElement
     */
    public WebElement rs500AddToCart(){

        return driver.findElement(By.cssSelector("a[data-product-id='1']"));
    }

    //RS400 WebElements

    /**
     * Returns a WebElement
     * @return WebElement
     */
    public WebElement viewProductRs400(){

        return driver.findElement(By.cssSelector("a[href='/product_details/2']"));
    }

    /**
     * Returns a WebElement
     * @return WebElement
     */
    public WebElement rs400Overlay(){

        return driver.findElement(By.xpath("//div[3]//div[1]//div[1]//div[2]"));
    }

    /**
     * Returns a WebElement
     * @return WebElement
     */
    public WebElement rs400AddToCart(){

        return driver.findElement(By.cssSelector("a[data-product-id='2']"));
    }

    /**
     * Returns a WebElement
     * @return WebElement
     */
    public WebElement continueShoppingButton(){

        return driver.findElement(By.cssSelector(".btn.btn-success.close-modal.btn-block"));
    }

    /**
     * Returns a WebElement
     * @return WebElement
     */
    public WebElement viewCart(){

        return driver.findElement(By.cssSelector("a[href='/view_cart']"));
    }

}
