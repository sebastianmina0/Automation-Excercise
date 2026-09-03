
import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

import junit.framework.Assert;
import page_objects.handler_classes.AdHandlerUtility;
import page_objects.setUp.SetUpEnvironment;
import page_objects.test_data.TestDataGenerator;

/**
 * This class is created to place and order while register a new user
 * PlaceOrderRegisterWhileCheckout
 */
public class PlaceOrderRegisterWhileCheckout extends SetUpEnvironment {

    @Test
    /**
     * Test Case 14: Place Order: Register while Checkout
     * @throws InterruptedException
     */
    public void placeOrderWithRegister() throws InterruptedException{

        //3) Verify that home page is visible successfully
        AdHandlerUtility.hideAds(driver);
        wait.until(ExpectedConditions.visibilityOf(mainPageUI.singUp()));

        AdHandlerUtility.hideAds(driver);
        //4) Add products to cart
        //Product RS400
        js.executeScript("arguments[0].scrollIntoView(true);", mainPageUI.mainHoverOverRs400());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        mainPageServices.hoverOverRs400();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        mainPageServices.clickAddCartRs400();

        AdHandlerUtility.hideAds(driver);
        mainPageServices.clickContinueShopping();

        //Product RS500
        js.executeScript("arguments[0].scrollIntoView(true);", mainPageUI.mainHoverOverRs500());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        mainPageServices.hoverOverRs500();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        mainPageServices.clickAddCartRs500();

        AdHandlerUtility.hideAds(driver);
        
        //5) Click 'Cart' button
        mainPageServices.clickViewCart();

        //driver.navigate().refresh();

        AdHandlerUtility.hideAds(driver);
        //6) Verify that cart page is displayed
        Assert.assertEquals("https://automationexercise.com/view_cart", driver.getCurrentUrl());

        AdHandlerUtility.hideAds(driver);
        //7) Click Proceed To Checkout
        cartServices.clickCheckOutButton();

        AdHandlerUtility.hideAds(driver);
        //8) Click 'Register / Login' button
        cartServices.clickRegisterLogin();

        //9) Fill all details in Signup and create account

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

        //10)Verify that 'ACCOUNT CREATED!' and click 'Continue' button
        wait.until(ExpectedConditions.visibilityOf(accountCreatedUI.accountCreated()));
        AdHandlerUtility.hideAds(driver);
        accountCreatedServices.clickContinue();

        AdHandlerUtility.hideAds(driver);
        //11) Verify that 'Logged in as username' is visible
        wait.until(ExpectedConditions.visibilityOf(loggedInPageUI.loggedInAsUser()));

        AdHandlerUtility.hideAds(driver);
        //12) Click 'Cart' button
        loggedInPageServices.clickCart();

        AdHandlerUtility.hideAds(driver);
        //13) Click 'Proceed To Checkout' button
        cartServices.clickCheckOutButton();

        AdHandlerUtility.hideAds(driver);
        //14) Verify Address Details and Review Your Order
        wait.until(ExpectedConditions.visibilityOf(checkoutUI.checkOutInformation()));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        wait.until(ExpectedConditions.visibilityOf(checkoutUI.orderTable()));

        AdHandlerUtility.hideAds(driver);
        //15) Enter description in comment text area and click 'Place Order'
        checkoutServices.enterMessage(TestDataGenerator.emailMessage());
        checkoutServices.clickPlaceOrder();

        AdHandlerUtility.hideAds(driver);
        //16) Enter payment details: Name on Card, Card Number, CVC, Expiration date
        paymentServices.enterPaymentName(TestDataGenerator.cardName());
        paymentServices.enterPaymentCardNumber(TestDataGenerator.cardNumber());
        paymentServices.enterPaymentCVC(TestDataGenerator.cvc());
        paymentServices.enterExpirationMonth(TestDataGenerator.expirationMonth());
        paymentServices.enterExpirationYear(TestDataGenerator.expirationYear());

        AdHandlerUtility.hideAds(driver);
        //17) Click 'Pay and Confirm Order' button
        paymentServices.clickConfirmOrder();

        AdHandlerUtility.hideAds(driver);
        //18) Verify success message 'Your order has been placed successfully!'
        //wait.until(ExpectedConditions.visibilityOf(paymentUI.orderSuccessMessage()));

        AdHandlerUtility.hideAds(driver);
        //19) Click 'Delete Account' button
        orderPlacedServices.clickDeleteAccount();

        //20) Verify 'ACCOUNT DELETED!' and click 'Continue' button
        wait.until(ExpectedConditions.visibilityOf(accountDeletedUI.accountDeletedText()));
        accountDeletedServices.clickContinue();

    }

}
