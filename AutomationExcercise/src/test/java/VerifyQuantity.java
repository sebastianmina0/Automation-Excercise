
import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

import page_objects.handler_classes.AdHandlerUtility;
import page_objects.setUp.SetUpEnvironment;

/**
 * This class is created to verify quantity when user
 * adds more than one product
 * VerifyQuantity
 */
public class VerifyQuantity extends SetUpEnvironment {

    @Test
    /**
     * Test Case 13: Verify Product quantity in Cart
     */
    public void verifyQuantity(){

        AdHandlerUtility.hideAds(driver);
        //3) Verify that home page is visible succesfully
        wait.until(ExpectedConditions.visibilityOf(mainPageUI.singUp()));

        AdHandlerUtility.hideAds(driver);
        //4) Click 'View Product' for any product on home page
        mainPageServices.clickRs500ViewProduct();

        AdHandlerUtility.hideAds(driver);
        //5) Verify product detail is opened
        wait.until(ExpectedConditions.visibilityOf(rs500UI.rs500Information()));

        AdHandlerUtility.hideAds(driver);
        //6) Increase quantity to 4
        rs500UI.rs500Quantity().clear();
        rs500Services.modifyQuantity();

        AdHandlerUtility.hideAds(driver);
        //7) Click 'Add to cart' button
        rs500Services.clickAddCart();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        
        AdHandlerUtility.hideAds(driver);
        //8) Click 'View Cart' button
        rs500Services.clickViewCart();
        driver.navigate().refresh();

        AdHandlerUtility.hideAds(driver);
        //9) Verify that product is displayed in cart page with exact quantity
        cartServices.cartInformation();
    }

}
