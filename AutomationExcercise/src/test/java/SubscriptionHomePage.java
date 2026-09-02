
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

import page_objects.handler_classes.AdHandlerUtility;
import page_objects.setUp.SetUpEnvironment;

/**
 * This is class is created to verify subscription
 * functionallity in Cart page
 * SubscriptionHomePage
 */
public class SubscriptionHomePage extends SetUpEnvironment {

    @Test
    
    /**
     * Test Case 10: Verify Subscription in home page
     */
    public void verifySubscription(){

        AdHandlerUtility.hideAds(driver);
        //3) Verify that home page is visible succesfully
        wait.until(ExpectedConditions.visibilityOf(mainPageUI.singUp()));

        AdHandlerUtility.hideAds(driver);
        //4) Scroll down to footer
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

        AdHandlerUtility.hideAds(driver);
        //5) Verify text 'SUBSCRIPTION'
        wait.until(ExpectedConditions.visibilityOf(mainPageUI.subscriptionText()));

        AdHandlerUtility.hideAds(driver);
        //6) Enter email address in input and click arrow button
        mainPageServices.enterSubscriptionEmail();
        mainPageServices.clickSubscriptionArrow();

        AdHandlerUtility.hideAds(driver);
        //7) Verify success message 'You have been successfully subscribed!' is visible
        wait.until(ExpectedConditions.visibilityOf(mainPageUI.successSubscribe()));
    }

}
