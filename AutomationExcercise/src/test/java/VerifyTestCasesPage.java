
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

import page_objects.handler_classes.AdHandlerUtility;
import page_objects.setUp.SetUpEnvironment;

/**
 * This class is created to verify Test Cases page
 * VerifyTestCasesPage
 */
public class VerifyTestCasesPage extends SetUpEnvironment{

    @Test
    /**
     * Test Case 7: Verify Test Cases Page
     */
    public void testCasesPage(){

        AdHandlerUtility.hideAds(driver);
        //3) Verify that home page is visible successfully
        wait.until(ExpectedConditions.visibilityOf(mainPageUI.singUp()));

        AdHandlerUtility.hideAds(driver);
        //4) Click on 'Test Cases' button
        mainPageServices.clickTestCasesButton();

        //5) Verify user is navigated to test cases page successfully
        Assert.assertEquals("https://automationexercise.com/test_cases", driver.getCurrentUrl() );
    }

}
