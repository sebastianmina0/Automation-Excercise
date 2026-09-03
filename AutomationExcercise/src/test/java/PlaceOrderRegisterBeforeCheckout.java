
import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

import junit.framework.Assert;
import page_objects.handler_classes.AdHandlerUtility;
import page_objects.setUp.SetUpEnvironment;
import page_objects.test_data.TestDataGenerator;
/**
 * This class is created to first register and
 * then place an order
 * PlaceOrderRegisterBeforeCheckout
 */
public class PlaceOrderRegisterBeforeCheckout extends SetUpEnvironment{

    @Test
    /**
     * Test Case 15: Place Order: Register before Checkout
     * @throws InterruptedException
     */
    public void registerBeforeOrder() throws InterruptedException{

        //3) Verify that home page is visible successfully
        AdHandlerUtility.hideAds(driver);
        wait.until(ExpectedConditions.visibilityOf(mainPageUI.singUp()));

        AdHandlerUtility.hideAds(driver);
        //4) Click 'Signup / Login' button
        mainPageServices.clickSingUpButton();

        //5) Fill all details in Signup and create account

        //Enter name and email address
        signUpLoginPageServices.enterNameAndEmail(TestDataGenerator.newUserName(), TestDataGenerator.newEmail());

        AdHandlerUtility.hideAds(driver);
        //Click 'Signup' button
        signUpLoginPageServices.clickSingUpButton();

        AdHandlerUtility.hideAds(driver);
        //Verify that 'ENTER ACCOUNT INFORMATION' is visible
        wait.until(ExpectedConditions.visibilityOf(accountInformationUI.accountInformationText()));

        //Fill details: Title, Name, Email, Password, Date of birth
        accountInformationServices.fillInformationDetails(TestDataGenerator.newPassword(), TestDataGenerator.newDay(),
        TestDataGenerator.newMonth(), TestDataGenerator.newYear());
        AdHandlerUtility.hideAds(driver);

        //Select checkbox 'Sign up for our newsletter!'
        accountInformationServices.clickNewsLetter();

        //Select checkbox 'Receive special offers from our partners!'
        accountInformationServices.clickSpecialOffers();
        AdHandlerUtility.hideAds(driver);

        //Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        accountInformationServices.fillAddressInformationDetails(TestDataGenerator.newFirstName(), TestDataGenerator.newLastName(),
        TestDataGenerator.newCompany(), TestDataGenerator.newAddress(),TestDataGenerator.newAddress(), TestDataGenerator.newCountry(),
        TestDataGenerator.newState(), TestDataGenerator.newCity(), TestDataGenerator.newZipCode(),
        TestDataGenerator.newMobileNumber());
        
        
        //Click 'Create Account button'
        accountInformationServices.clickCreateAccount();
        
        AdHandlerUtility.hideAds(driver);
        //6)Verify that 'ACCOUNT CREATED!' and click 'Continue' button
        wait.until(ExpectedConditions.visibilityOf(accountCreatedUI.accountCreated()));
        AdHandlerUtility.hideAds(driver);
        accountCreatedServices.clickContinue();

        AdHandlerUtility.hideAds(driver);
        //7) Verify ' Logged in as username' at top
        wait.until(ExpectedConditions.visibilityOf(loggedInPageUI.loggedInAsUser()));

        //8) Add products to cart
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

        //9) Click 'Cart' button
        mainPageServices.clickViewCart();

        AdHandlerUtility.hideAds(driver);
        //10) Verify that cart page is displayed
        Assert.assertEquals("https://automationexercise.com/view_cart", driver.getCurrentUrl());

        AdHandlerUtility.hideAds(driver);
        //11) Click Proceed To Checkout
        cartServices.clickCheckOutButton();

        AdHandlerUtility.hideAds(driver);
        //12) Verify Address Details and Review Your Order
        wait.until(ExpectedConditions.visibilityOf(checkoutUI.checkOutInformation()));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        wait.until(ExpectedConditions.visibilityOf(checkoutUI.orderTable()));

        AdHandlerUtility.hideAds(driver);
        //13) Enter description in comment text area and click 'Place Order'
        checkoutServices.enterMessage(TestDataGenerator.emailMessage());
        checkoutServices.clickPlaceOrder();

        AdHandlerUtility.hideAds(driver);
        //14) Enter payment details: Name on Card, Card Number, CVC, Expiration date
        paymentServices.enterPaymentName(TestDataGenerator.cardName());
        paymentServices.enterPaymentCardNumber(TestDataGenerator.cardNumber());
        paymentServices.enterPaymentCVC(TestDataGenerator.cvc());
        paymentServices.enterExpirationMonth(TestDataGenerator.expirationMonth());
        paymentServices.enterExpirationYear(TestDataGenerator.expirationYear());

        AdHandlerUtility.hideAds(driver);
        //15) Click 'Pay and Confirm Order' button
        paymentServices.clickConfirmOrder();

        //16) Verify success message 'Your order has been placed successfully!'
        //wait.until(ExpectedConditions.visibilityOf(paymentUI.orderSuccessMessage()));

        //17) Click 'Delete Account' button
        orderPlacedServices.clickDeleteAccount();

        //18) Verify 'ACCOUNT DELETED!' and click 'Continue' button
        wait.until(ExpectedConditions.visibilityOf(accountDeletedUI.accountDeletedText()));
        accountDeletedServices.clickContinue();
    }


}
