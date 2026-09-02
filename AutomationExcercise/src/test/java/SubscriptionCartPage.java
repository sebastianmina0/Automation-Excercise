
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

import page_objects.handler_classes.AdHandlerUtility;
import page_objects.setUp.SetUpEnvironment;

/**
 * This is class is created to verify subscription
 * functionallity in Cart page
 * SubscriptionCartPage
 */
public class SubscriptionCartPage extends SetUpEnvironment {

    @Test
    /**
     * Test Case 11: Verify Subscription in Cart page
     */
    public void verifySubscriptionCartPage(){

        AdHandlerUtility.hideAds(driver);
        //3) Verify that home page is visible succesfully
        wait.until(ExpectedConditions.visibilityOf(mainPageUI.singUp()));

        AdHandlerUtility.hideAds(driver);
        //4) Click 'Cart' button
        mainPageServices.clickCartbutton();

        AdHandlerUtility.hideAds(driver);
        //5) Scroll down to footer
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

        AdHandlerUtility.hideAds(driver);
        //6) Verify text 'SUBSCRIPTION'
        wait.until(ExpectedConditions.visibilityOf(cartUI.cartSubscriptionText()));

        AdHandlerUtility.hideAds(driver);
        //7) Enter email address in input and click arrow button
        cartServices.cartEnterSubscriptionEmail();
        cartServices.cartClickSubscriptionArrow();

        AdHandlerUtility.hideAds(driver);
        //8) Verify success message 'You have been successfully subscribed!' is visible
        wait.until(ExpectedConditions.visibilityOf(cartUI.cartSuccessSubscribe()));

    }

}
