
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import junit.framework.Assert;
import page_objects.handler_classes.AdHandlerUtility;
import page_objects.setUp.SetUpEnvironment;
import page_objects.test_data.StaticData;

/**
 * This class is created to add multiple products to cart
 * SearchProductsAndVerifyCart
 */
public class SearchProductsAndVerifyCart extends SetUpEnvironment {

    @Test
    /**
     * Test Case 20: Search Products and Verify Cart After Login
     */
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
        //8) Add those products to cart
        productsPageServices.verifySearchAndAddProducts();

        AdHandlerUtility.hideAds(driver);
        //9) Click 'Cart' button and verify that products are visible in cart
        productsPageServices.clickCart();
        cartServices.cartInformation();

        AdHandlerUtility.hideAds(driver);
        //10) Click 'Signup / Login' button and submit login details
        cartServices.clickSignUpLoginButton();
        signUpLoginPageServices.enterEmailAndPassword(StaticData.correctEmail, StaticData.correctPassword);

        AdHandlerUtility.hideAds(driver);
        //11) Again, go to Cart page
        loggedInPageServices.clickCart();

        //12) Verify that those products are visible in cart after login as well
        cartServices.cartInformation();

        closeEnvironment();
        
    }

}
