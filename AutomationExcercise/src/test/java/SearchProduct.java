
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

import junit.framework.Assert;
import page_objects.handler_classes.AdHandlerUtility;
import page_objects.setUp.SetUpEnvironment;

public class SearchProduct extends SetUpEnvironment {


    @Test

    /**
     * Test Case 9: Search Product
     */
    public void searchProduct(){

        AdHandlerUtility.hideAds(driver);
        //3) Verify that home page is visible succesfully
        wait.until(ExpectedConditions.visibilityOf(mainPageUI.singUp()));
        
        AdHandlerUtility.hideAds(driver);
        //4) Click on 'Products' button
        mainPageServices.clickProductsButton();

        AdHandlerUtility.hideAds(driver);
        //5) Verify user navigated to ALL PRODUCTS page successfully
        Assert.assertEquals("https://automationexercise.com/products", driver.getCurrentUrl());

        AdHandlerUtility.hideAds(driver);
        //6) Enter product name in search input and click search button
        productsPageServices.enterInfoSearchBox();
        productsPageServices.clickSearcButton();

        AdHandlerUtility.hideAds(driver);
        //7) Verify 'SEARCHED PRODUCTS' is visible
        wait.until(ExpectedConditions.visibilityOf(productsPageUI.searchedProducts()));

        AdHandlerUtility.hideAds(driver);
        //8) Verify all the products related to search are visible
        productsPageServices.searchedItems();
    }

}
