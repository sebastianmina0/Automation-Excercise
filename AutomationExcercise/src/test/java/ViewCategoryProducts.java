
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

import junit.framework.Assert;
import page_objects.handler_classes.AdHandlerUtility;
import page_objects.setUp.SetUpEnvironment;

/**
 * This class is to verify category products
 * ViewCategoryProducts
 */
public class ViewCategoryProducts extends SetUpEnvironment{

    @Test

    /**
     * Test Case 18: View Category Products
     * @throws InterruptedException
     */
    public void categoryProducts() {

        AdHandlerUtility.hideAds(driver);
        //3) Verify that home page is visible succesfully
        wait.until(ExpectedConditions.visibilityOf(mainPageUI.singUp()));

        AdHandlerUtility.hideAds(driver);

        js.executeScript("arguments[0].scrollIntoView(true);", mainPageUI.womenButton());

        //4) Click on 'Women' category
        mainPageServices.clickWomenCategory();

        AdHandlerUtility.hideAds(driver);

        //5) Click on any category link under 'Women' category, for example: Dress
        mainPageServices.clickWomenSubcategoryTops();

        AdHandlerUtility.hideAds(driver);
        //6) Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
        Assert.assertEquals("WOMEN - TOPS PRODUCTS", productsPageUI.womenTopsText().getText());

        AdHandlerUtility.hideAds(driver);
        //7) On left side bar, click on any sub-category link of 'Men' category
        productsPageServices.clickMenCategory();
        productsPageServices.clickSubCategoryJeans();

        AdHandlerUtility.hideAds(driver);
        //8) Verify that user is navigated to that category page
        Assert.assertEquals("https://automationexercise.com/category_products/6", driver.getCurrentUrl());
    }

}
