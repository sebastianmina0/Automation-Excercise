import org.junit.Test;

import page_objects.handler_classes.AdHandlerUtility;
import page_objects.setUp.SetUpEnvironment;

/**
 * This class is created to add a product from Recommended Items
 * AddToCartFromRecommendedItems
 */
public class AddToCartFromRecommendedItems extends SetUpEnvironment{

    @Test
    /**
     * Test Case 22: Add to cart from Recommended items
     */
    public void addToCart(){

        AdHandlerUtility.hideAds(driver);
        //3) Scroll to bottom of page
        //4) Verify 'RECOMMENDED ITEMS' are visible
        js.executeScript("arguments[0].scrollIntoView(true);", mainPageUI.recommendItems());

        AdHandlerUtility.hideAds(driver);
        //5) Click on 'Add To Cart' on Recommended product
        mainPageServices.clickAddCartRs100();

        AdHandlerUtility.hideAds(driver);
        //6) Click on 'View Cart' button
        js.executeScript("arguments[0].scrollIntoView(true);", mainPageUI.cartButton());
        mainPageServices.clickCartbutton();

        AdHandlerUtility.hideAds(driver);
        //7) Verify that product is displayed in cart page
        driver.navigate().refresh();
        cartServices.cartInformation();
    }

}
