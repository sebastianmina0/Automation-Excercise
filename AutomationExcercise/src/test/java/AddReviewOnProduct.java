
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import junit.framework.Assert;
import page_objects.handler_classes.AdHandlerUtility;
import page_objects.setUp.SetUpEnvironment;
import page_objects.test_data.TestDataGenerator;

/**
 * This class is created to add a review on a product
 * AddReviewOnProduct
 */
public class AddReviewOnProduct extends SetUpEnvironment {

    @Test
    /**
     * Test Case 21: Add review on product
     */
    public void addReview(){

        AdHandlerUtility.hideAds(driver);
        //3) Click on 'Products' button
        mainPageServices.clickProductsButton();

        AdHandlerUtility.hideAds(driver);
        //4) Verify user is navigated to ALL PRODUCTS page successfully
        Assert.assertEquals("https://automationexercise.com/products", driver.getCurrentUrl());

        AdHandlerUtility.hideAds(driver);
        //5) Click on 'View Product' button (RS500 product)
        productsPageServices.clickRs500ViewProduct();

        AdHandlerUtility.hideAds(driver);
        //6) Verify 'Write Your Review' is visible
        wait.until(ExpectedConditions.visibilityOf(rs500UI.reviewMessage()));

        AdHandlerUtility.hideAds(driver);
        //7) Enter name, email and review
        rs500Services.enterName(TestDataGenerator.newFirstName());
        rs500Services.enterEmail(TestDataGenerator.newEmail());
        rs500Services.enterMessage(TestDataGenerator.emailMessage());

        AdHandlerUtility.hideAds(driver);
        //8) Click 'Submit' button
        rs500Services.clickSubmit();

        String thanks = driver.findElement(By.cssSelector("#review-section > div > div > span")).getText();
        
        //9) Verify success message 'Thank you for your review.'
        Assert.assertEquals("Thank you for your review.", thanks );

        closeEnvironment();
    }



}
