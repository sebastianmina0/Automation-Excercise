
import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

import junit.framework.Assert;
import page_objects.handler_classes.AdHandlerUtility;
import page_objects.setUp.SetUpEnvironment;
import page_objects.test_data.StaticData;
import page_objects.test_data.TestDataGenerator;

/**
 * This class is created to verify login workflow and place
 * order workflow
 * LoginBeforeCheckout
 */
public class LoginBeforeCheckout extends SetUpEnvironment {

    @Test
    /**
     * Test Case 16: Place Order: Login before Checkout
     */
    public void loginBeforeCheckout(){

        //3) Verify that home page is visible successfully
        AdHandlerUtility.hideAds(driver);
        wait.until(ExpectedConditions.visibilityOf(mainPageUI.singUp()));

        AdHandlerUtility.hideAds(driver);
        //4) Click 'Signup / Login' button
        mainPageServices.clickSingUpButton();

        AdHandlerUtility.hideAds(driver);
        //5) Fill email, password and click 'Login' button
        signUpLoginPageServices.enterEmailAndPassword(StaticData.correctEmail, StaticData.correctPassword);
        signUpLoginPageServices.clickLoginButton();

        AdHandlerUtility.hideAds(driver);
        //6) Verify 'Logged in as username' at top
        wait.until(ExpectedConditions.visibilityOf(loggedInPageUI.loggedInAsUser()));

        //7) Add products to cart
        
        //Product RS400
        js.executeScript("arguments[0].scrollIntoView(true);", mainPageUI.mainHoverOverRs400());


        mainPageServices.hoverOverRs400();
        mainPageServices.clickAddCartRs400();

        AdHandlerUtility.hideAds(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        mainPageServices.clickContinueShopping();

        //Product RS500
        js.executeScript("arguments[0].scrollIntoView(true);", mainPageUI.mainHoverOverRs500());

        mainPageServices.hoverOverRs500();
        mainPageServices.clickAddCartRs500();

        AdHandlerUtility.hideAds(driver);
        //8) Click 'Cart' button
        loggedInPageServices.clickCart();

        AdHandlerUtility.hideAds(driver);
        //9) Verify that cart page is displayed
        Assert.assertEquals("https://automationexercise.com/view_cart", driver.getCurrentUrl());

        AdHandlerUtility.hideAds(driver);
        //10) Click Proceed To Checkout
        cartServices.clickCheckOutButton();

        //11) Verify Address Details and Review Your Order
        wait.until(ExpectedConditions.visibilityOf(checkoutUI.checkOutInformation()));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        wait.until(ExpectedConditions.visibilityOf(checkoutUI.orderTable()));

        //12) Enter description in comment text area and click 'Place Order'
        checkoutServices.enterMessage(TestDataGenerator.emailMessage());
        checkoutServices.clickPlaceOrder();

        AdHandlerUtility.hideAds(driver);
        //13) Enter payment details: Name on Card, Card Number, CVC, Expiration date
        paymentServices.enterPaymentName(TestDataGenerator.cardName());
        paymentServices.enterPaymentCardNumber(TestDataGenerator.cardNumber());
        paymentServices.enterPaymentCVC(TestDataGenerator.cvc());
        paymentServices.enterExpirationMonth(TestDataGenerator.expirationMonth());
        paymentServices.enterExpirationYear(TestDataGenerator.expirationYear());

        AdHandlerUtility.hideAds(driver);
        //14) Click 'Pay and Confirm Order' button
        paymentServices.clickConfirmOrder();

        //15)Verify success message 'Your order has been placed successfully!'
        //wait.until(ExpectedConditions.visibilityOf(paymentUI.orderSuccessMessage()));

        //16) Click 'Delete Account' button
        orderPlacedServices.clickDeleteAccount();

        //17) Verify 'ACCOUNT DELETED!' and click 'Continue' button
        wait.until(ExpectedConditions.visibilityOf(accountDeletedUI.accountDeletedText()));
        accountDeletedServices.clickContinue();
    }

}
