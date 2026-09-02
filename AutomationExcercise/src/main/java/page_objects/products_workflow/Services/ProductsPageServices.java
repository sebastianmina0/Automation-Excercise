package page_objects.products_workflow.Services;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import page_objects.products_workflow.UI.ProductsPageUI;
import page_objects.test_data.StaticData;

public class ProductsPageServices {

    private final WebDriver driver;
    private final ProductsPageUI productsPageUI;
    private By itemsSearched;

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

    /**
     * Method that enter "Top" in searchbox
     */
    public void enterInfoSearchBox(){

        productsPageUI.searchTextBox().sendKeys(StaticData.productName);
    } 

    /**
     * Method that clicks search button
     */
    public void clickSearcButton(){

        WebElement btnSearch = productsPageUI.submitSearch();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnSearch);
    }

    /**
     * Method that prints all name of all items found
     */
    public void allSearchedItems(){

        itemsSearched = By.cssSelector(".features_items .col-sm-4");
        List<WebElement> items = driver.findElements(itemsSearched);

        if(!items.isEmpty()){
            for(WebElement i: items){

                WebElement elementName = i.findElement(By.cssSelector(".productinfo p"));
                String productName = elementName.getText();

                System.out.println("Product "+ productName);
            }
        } else{
            System.out.println("No Elements found");
        }

    }

}
