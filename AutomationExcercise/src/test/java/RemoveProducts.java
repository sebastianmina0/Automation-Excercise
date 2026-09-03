
import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

import junit.framework.Assert;
import page_objects.handler_classes.AdHandlerUtility;
import page_objects.setUp.SetUpEnvironment;

public class RemoveProducts extends SetUpEnvironment{

    @Test
    
    public void removeProductsFromCart(){

        //3) Verify that home page is visible successfully
        AdHandlerUtility.hideAds(driver);
        wait.until(ExpectedConditions.visibilityOf(mainPageUI.singUp()));

        //4) Add products to cart
        //Product RS400
        js.executeScript("arguments[0].scrollIntoView(true);", mainPageUI.mainHoverOverRs400());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        mainPageServices.hoverOverRs400();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        mainPageServices.clickAddCartRs400();

        AdHandlerUtility.hideAds(driver);
        mainPageServices.clickContinueShopping();

        //Product RS500
        js.executeScript("arguments[0].scrollIntoView(true);", mainPageUI.mainHoverOverRs500());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        mainPageServices.hoverOverRs500();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        mainPageServices.clickAddCartRs500();

        // 5) Click 'Cart' button
        mainPageServices.clickViewCart();

        //6) Verify that cart page is displayed
        Assert.assertEquals("https://automationexercise.com/view_cart", driver.getCurrentUrl());

        //7) Click 'X' button corresponding to particular product
        cartServices.clickDeleteButtonRs500();

        //8) Verify that product is removed from the cart
        cartServices.itemsDeleted();

    }

}
