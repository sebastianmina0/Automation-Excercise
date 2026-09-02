package page_objects.products_workflow.UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPageUI {

    private WebDriver driver;

    public ProductsPageUI(WebDriver driver){

        this.driver = driver;
    }

    public WebDriver getDriver(){

        return driver;
    }

    public void setDriver(WebDriver driver){ 
        this.driver = driver;
    }

    public WebElement viewProductRs500(){

        return driver.findElement(By.cssSelector("a[href='/product_details/1']"));
    }

    public WebElement allProducts(){

        return driver.findElement(By.cssSelector(".features_items"));
    }


}
