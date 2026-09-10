import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import junit.framework.Assert;
import page_objects.handler_classes.AdHandlerUtility;
import page_objects.setUp.SetUpEnvironment;

/**
 * This is class is created to verify how to navigate in Brands
 * ViewCartBrandProducts
 */
public class ViewCartBrandProducts extends SetUpEnvironment {

    @Test
    /**
     * Test Case 19: View & Cart Brand Products
     */
    public void brandProducts(){

        AdHandlerUtility.hideAds(driver);
        //3) Verify that home page is visible succesfully
        wait.until(ExpectedConditions.visibilityOf(mainPageUI.singUp()));

        AdHandlerUtility.hideAds(driver);
        //4) Click on 'Products' button
        mainPageServices.clickProductsButton();

        AdHandlerUtility.hideAds(driver);
        //5) Verify that Brands are visible on left side bar
        wait.until(ExpectedConditions.visibilityOf(productsPageUI.brandsBox()));

        AdHandlerUtility.hideAds(driver);
        //6) Click on any brand name (In this case, Polo)
        productsPageServices.clickPoloButton();

        AdHandlerUtility.hideAds(driver);
        //7) Verify that user is navigated to brand page and brand products are displayed
        Assert.assertEquals("https://automationexercise.com/brand_products/Polo", driver.getCurrentUrl());
        wait.until(ExpectedConditions.visibilityOf(poloBrandPageUI.brandsBox()));

        AdHandlerUtility.hideAds(driver);
        //8) On left side bar, click on any other brand link
        poloBrandPageServices.clickMadameButton();

        //9) Verify that user is navigated to that brand page and can see products
        Assert.assertEquals("https://automationexercise.com/brand_products/Madame", driver.getCurrentUrl());
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("body > section > div > div.row > div.col-sm-9.padding-right > div"))));

        closeEnvironment();
    }

}
