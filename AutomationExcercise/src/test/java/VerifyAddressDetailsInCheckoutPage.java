
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import junit.framework.Assert;
import page_objects.handler_classes.AdHandlerUtility;
import page_objects.setUp.SetUpEnvironment;
import page_objects.test_data.TestDataGenerator;

/**
 * This class verifies checkout information
 * VerifyAddressDetailsInCheckoutPage
 */
public class VerifyAddressDetailsInCheckoutPage extends SetUpEnvironment {

    private final String firstName = TestDataGenerator.newFirstName();
    private final String lastName = TestDataGenerator.newLastName();
    private final String company = TestDataGenerator.newCompany();
    private final String address = TestDataGenerator.newAddress();
    private final String address2 = TestDataGenerator.newAddress();
    private final String country = TestDataGenerator.newCountry();
    private final String state = TestDataGenerator.newState();
    private final String city = TestDataGenerator.newCity();
    private final String zipCode = TestDataGenerator.newZipCode();
    private final String mobileNumber = TestDataGenerator.newMobileNumber();

    @Test
    /**
     * Test Case 23: Verify address details in checkout page
     * @throws InterruptedException
     */
    public void verifyAddressDetails() throws InterruptedException{

        AdHandlerUtility.hideAds(driver);
        //3) Verify that home page is visible succesfully
        wait.until(ExpectedConditions.visibilityOf(mainPageUI.singUp()));

        //4) Click 'Signup / Login' button
        mainPageServices.clickSingUpButton();

        //5) Fill all details in Signup and create account
        signUpLoginPageServices.enterNameAndEmail(TestDataGenerator.newUserName(), TestDataGenerator.newEmail());

        AdHandlerUtility.hideAds(driver);
        signUpLoginPageServices.clickSingUpButton();

        accountInformationServices.fillInformationDetails(TestDataGenerator.newPassword(), TestDataGenerator.newDay(),
        TestDataGenerator.newMonth(), TestDataGenerator.newYear());
        AdHandlerUtility.hideAds(driver);

        accountInformationServices.fillAddressInformationDetails(firstName, lastName,company, address,address2, country,
        state, city, zipCode,mobileNumber);
        
        accountInformationServices.clickCreateAccount();

        AdHandlerUtility.hideAds(driver);
        //6) Verify 'ACCOUNT CREATED!' and click 'Continue' button
        wait.until(ExpectedConditions.visibilityOf(accountCreatedUI.accountCreated()));
        AdHandlerUtility.hideAds(driver);
        accountCreatedServices.clickContinue();

        AdHandlerUtility.hideAds(driver);
        //7) Verify ' Logged in as username' at top
        wait.until(ExpectedConditions.visibilityOf(loggedInPageUI.loggedInAsUser()));

        AdHandlerUtility.hideAds(driver);
        //8) Add products to cart
        loggedInPageServices.hoverOverRs500();
        loggedInPageServices.clickAddCartRs500();
        loggedInPageServices.clickContinueShopping();

        //9) Click 'Cart' button
        loggedInPageServices.clickCart();

        //10) Verify that cart page is displayed
        Assert.assertEquals("https://automationexercise.com/view_cart", driver.getCurrentUrl());

        //11) Click Proceed To Checkout
        cartServices.clickCheckOutButton();

        //12) Verify that the delivery address is same address filled at the time registration of account

        Assert.assertEquals(". "+firstName+" "+lastName, driver.findElement(By.cssSelector("ul[id='address_delivery'] li[class='address_firstname address_lastname']")).getText());
        Assert.assertEquals(company, driver.findElement(By.cssSelector("ul[id='address_delivery'] li:nth-child(3)")).getText());
        Assert.assertEquals(address, driver.findElement(By.cssSelector("ul[id='address_delivery'] li:nth-child(4)")).getText());
        Assert.assertEquals(address2, driver.findElement(By.cssSelector("ul[id='address_delivery'] li:nth-child(5)")).getText());
        Assert.assertEquals(city + " "+state + " "+zipCode, driver.findElement(By.cssSelector("ul[id='address_delivery'] li[class='address_city address_state_name address_postcode']")).getText());
        Assert.assertEquals(country, driver.findElement(By.cssSelector("ul[id='address_delivery'] li[class='address_country_name']")).getText());
        Assert.assertEquals(mobileNumber, driver.findElement(By.cssSelector("ul[id='address_delivery'] li[class='address_phone']")).getText());

        //13) Verify that the billing address is same address filled at the time registration of account

        Assert.assertEquals(". "+firstName+" "+lastName, driver.findElement(By.cssSelector("ul[id='address_invoice'] li[class='address_firstname address_lastname']")).getText());
        Assert.assertEquals(company, driver.findElement(By.cssSelector("ul[id='address_invoice'] li:nth-child(3)")).getText());
        Assert.assertEquals(address, driver.findElement(By.cssSelector("ul[id='address_invoice'] li:nth-child(4)")).getText());
        Assert.assertEquals(address2, driver.findElement(By.cssSelector("ul[id='address_invoice'] li:nth-child(5)")).getText());
        Assert.assertEquals(city + " "+state + " "+zipCode, driver.findElement(By.cssSelector("ul[id='address_invoice'] li[class='address_city address_state_name address_postcode']")).getText());
        Assert.assertEquals(country, driver.findElement(By.cssSelector("ul[id='address_invoice'] li[class='address_country_name']")).getText());
        Assert.assertEquals(mobileNumber, driver.findElement(By.cssSelector("ul[id='address_invoice'] li[class='address_phone']")).getText());

        closeEnvironment();
    }

}
