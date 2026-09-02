
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

import page_objects.handler_classes.AdHandlerUtility;
import page_objects.setUp.SetUpEnvironment;

/**
 * This class is created to verify products page and
 * Rs500 page
 * VerifyProductsAndProductDetail
 */
public class VerifyProductsAndProductDetail extends SetUpEnvironment{

    @Test

    /**
     * Test Case 8: Verify All Products and product detail page
     */
    public void verifyProductsAndDetails(){

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
        //6) The products list is visible
        wait.until(ExpectedConditions.visibilityOf(productsPageUI.allProducts()));

        AdHandlerUtility.hideAds(driver);
        //7) Click on 'View Product' of first product
        productsPageServices.clickRs500ViewProduct();

        AdHandlerUtility.hideAds(driver);
        //8) User is landed to product detail page
        Assert.assertEquals("https://automationexercise.com/product_details/1", driver.getCurrentUrl());

        //9) Verify that detail is visible: product name, category, price, availability, condition, brand
        wait.until(ExpectedConditions.visibilityOf(rs500UI.rs500Information()));
    }

}
