
import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

import page_objects.handler_classes.AdHandlerUtility;
import page_objects.setUp.SetUpEnvironment;

/**
 * This class is created to add products in cart and
 * verify information
 * AddProductsInCart
 */
public class AddProductsInCart extends SetUpEnvironment {

    @Test
    /**
     * Test Case 12: Add Products in Cart
     */
    public void addProducts(){

        AdHandlerUtility.hideAds(driver);
        //3) Verify that home page is visible succesfully
        wait.until(ExpectedConditions.visibilityOf(mainPageUI.singUp()));

        AdHandlerUtility.hideAds(driver);
        //4) Click 'Products' button
        mainPageServices.clickProductsButton();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", productsPageUI.viewProductRs500());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        AdHandlerUtility.hideAds(driver);
        //5) Hover over first product and click 'Add to cart'
        productsPageServices.hoverOverRs500Overlay();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        productsPageServices.clickRs500AddToCart();

        AdHandlerUtility.hideAds(driver);
        //6) Click 'Continue Shopping' button
        productsPageServices.clickContinueShopping();

        AdHandlerUtility.hideAds(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        js.executeScript("arguments[0].scrollIntoView(true);", productsPageUI.viewProductRs400());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //7) Hover over second product and click 'Add to cart'
        productsPageServices.hoverOverRs400Overlay();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        productsPageServices.clickRs400AddToCart();

        AdHandlerUtility.hideAds(driver);
        //8) Click 'View Cart' button
        productsPageServices.clickViewCart();

        AdHandlerUtility.hideAds(driver);
        //9) Verify both products are added to Cart
        //10) Verify their prices, quantity and total price
        cartServices.cartInformation();
    }

}
