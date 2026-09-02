package page_objects.products_workflow.Services;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import page_objects.products_workflow.UI.ProductsPageUI;

public class ProductsPageServices {

    private final WebDriver driver;
    private final ProductsPageUI productsPageUI;

    /**
     * Constructor
     * @param driver
     */
    public ProductsPageServices(WebDriver driver){

        this.driver = driver;
        this.productsPageUI = new ProductsPageUI(driver);
    }

    /**
     * Method that clicks in Rs500 View Product button
     */
    public void clickRs500ViewProduct(){

        WebElement btnRs500 = productsPageUI.viewProductRs500();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnRs500);
    }

}
