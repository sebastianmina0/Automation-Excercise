package page_objects.products_workflow.Services;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import page_objects.products_workflow.UI.ProductsPageUI;
import page_objects.test_data.StaticData;

public class ProductsPageServices {

    private final WebDriver driver;
    private final ProductsPageUI productsPageUI;
    private final Actions actions;
    private By itemsSearched;
    private By addToCartButtons;
    private By continueShoppingButton;
    private By overlays;
    private WebDriverWait wait;

    /**
     * Constructor
     * @param driver
     */
    public ProductsPageServices(WebDriver driver){

        this.driver = driver;
        this.productsPageUI = new ProductsPageUI(driver);
        this.actions = new Actions(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
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

    //RS500 Services
    /**
     * Hover over in Rs500 overlay
     */
    public void hoverOverRs500Overlay(){

        actions.moveToElement(productsPageUI.rs500Overlay()).perform();
    }

    /**
     * Clcicks add cart button
     */
    public void clickRs500AddToCart(){

        WebElement btnAdd = productsPageUI.rs500AddToCart();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnAdd);
    }


    //RS400 Services
    /**
     * Hover over Rs400 overlay
     */
    public void hoverOverRs400Overlay(){

        actions.moveToElement(productsPageUI.rs400Overlay()).perform();
    }

    /**
     * Clicks add to cart button
     */
    public void clickRs400AddToCart(){

        WebElement btnAdd = productsPageUI.rs400AddToCart();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnAdd);
    }

    /**
     * Clicks continue shopping button
     */
    public void clickContinueShopping(){

        WebElement btnContinue = productsPageUI.continueShoppingButton();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnContinue);
    }

    /**
     * Clicks view cart button
     */
    public void clickViewCart(){

        WebElement btnView = productsPageUI.viewCart();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnView);

    }

    public void clickCart(){

        WebElement btnCart = productsPageUI.viewCart();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnCart);
    }

    /**
     * Clicks Men category
     */
    public void clickMenCategory(){

        WebElement btnMen = productsPageUI.menCategory();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnMen);
    }

    /**
     * Clicks Jeans subcategory
     */
    public void clickSubCategoryJeans(){

        WebElement btnJeans = productsPageUI.subCategoryMenJeans();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnJeans);
    }

    /**
     * Uses allSearchedItems private class.
     */
    public void searchedItems(){

        allSearchedItems();
    }

    /**
     * Clicks Polo button
     */
    public void clickPoloButton(){

        WebElement btnPolo = productsPageUI.poloButton();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnPolo);

    }

    /**
     * Method that prints all name of all items found
     */
    private void allSearchedItems(){

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

    public List<String> returnAllProducts(){

        return allProducts();
    }


    /**
     * Method that returns all products
     * @return
     */
    private List<String> allProducts(){

        List<String> allProducts = new ArrayList<>();
        itemsSearched = By.cssSelector(".features_items .col-sm-4");
        List<WebElement> piv = driver.findElements(itemsSearched);

        if(!piv.isEmpty()){

            for(WebElement i: piv){

                WebElement elementName = i.findElement(By.cssSelector(".productinfo p"));
                String productName = elementName.getText();

                allProducts.add(productName);
            }
        }

        return allProducts;

    }

}
