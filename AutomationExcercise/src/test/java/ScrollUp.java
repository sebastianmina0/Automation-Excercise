
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import page_objects.handler_classes.AdHandlerUtility;
import page_objects.setUp.SetUpEnvironment;

/**
 * This class verifies scroll up functionality
 * ScrollUp
 */
public class ScrollUp extends SetUpEnvironment{

    @Test 

    /**
     * Test Case 25: Verify Scroll Up using 'Arrow' button and Scroll Down functionality
     */
    public void scrollUpUsingArrow(){

        //3) Verify that home page is visible successfully
        AdHandlerUtility.hideAds(driver);
        wait.until(ExpectedConditions.visibilityOf(mainPageUI.singUp()));

        AdHandlerUtility.hideAds(driver);
        //4) Scroll down page to bottom
        js.executeScript("arguments[0].scrollIntoView(true);", mainPageUI.subscription());

        AdHandlerUtility.hideAds(driver);
        //5) Verify 'SUBSCRIPTION' is visible
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("div[class='single-widget'] h2"))));

        AdHandlerUtility.hideAds(driver);
        //6) Click on arrow at bottom right side to move upward
        mainPageServices.clickScrollUp();

        AdHandlerUtility.hideAds(driver);
        //7) Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("img[alt='Website for automation practice']"))));

        closeEnvironment();
    }

}
