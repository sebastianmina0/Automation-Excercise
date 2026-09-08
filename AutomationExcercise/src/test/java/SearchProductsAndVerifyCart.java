
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import junit.framework.Assert;
import page_objects.handler_classes.AdHandlerUtility;
import page_objects.setUp.SetUpEnvironment;

public class SearchProductsAndVerifyCart extends SetUpEnvironment {

    @Test

    public void searchProductsAndVerifyCart(){

        AdHandlerUtility.hideAds(driver);
        //3) Click on 'Products' button
        mainPageServices.clickProductsButton();

        //4) Verify user is navigated to ALL PRODUCTS page successfully
        Assert.assertEquals("https://automationexercise.com/products", driver.getCurrentUrl());

        AdHandlerUtility.hideAds(driver);
        //5) Enter product name in search input and click search button
        productsPageServices.enterInfoSearchBox();
        productsPageServices.clickSearcButton();

        AdHandlerUtility.hideAds(driver);
        //6) Verify 'SEARCHED PRODUCTS' is visible
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div > h2"))));

        AdHandlerUtility.hideAds(driver);
        //7) Verify all the products related to search are visible
        List<String> allSearchedProducts = productsPageServices.returnAllProducts();
        List<WebElement> webProducts = driver.findElements(By.cssSelector(".product-image-wrapper"));
        Assert.assertEquals(webProducts.size(), allSearchedProducts.size());
        
        
    }

}
