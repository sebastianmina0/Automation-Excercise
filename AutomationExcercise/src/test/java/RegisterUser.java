import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

import page_objects.handler_classes.AdHandlerUtility;
import page_objects.setUp.SetUpEnvironment;
import page_objects.test_data.TestDataGenerator;


/**
 * This class is created for register an user in the webpage
 * RegisterUser
 */
public class RegisterUser extends SetUpEnvironment {

    /**
     * Test Case #1 - Register User
     */
    @Test
    public void registerUser() throws InterruptedException{

        AdHandlerUtility.hideAds(driver);
        //3) Verify that home page is visible succesfully
        wait.until(ExpectedConditions.visibilityOf(mainPageUI.singUp()));

        //4) Click on 'Signup / Login' button
        mainPageServices.clickSingUpButton();

        //5)Verify 'New User Signup!' is visible
        wait.until(ExpectedConditions.visibilityOf(signUpLoginPageUI.newUser()));

        //6) Enter name and email address
        signUpLoginPageServices.enterNameAndEmail(TestDataGenerator.newUserName(), TestDataGenerator.newEmail());

        AdHandlerUtility.hideAds(driver);
        //7) Click 'Signup' button
        signUpLoginPageServices.clickSingUpButton();

        AdHandlerUtility.hideAds(driver);
        //8) Verify that 'ENTER ACCOUNT INFORMATION' is visible
        wait.until(ExpectedConditions.visibilityOf(accountInformationUI.accountInformationText()));

        //9) Fill details: Title, Name, Email, Password, Date of birth
        accountInformationServices.fillInformationDetails(TestDataGenerator.newPassword(), TestDataGenerator.newDay(),
        TestDataGenerator.newMonth(), TestDataGenerator.newYear());
        AdHandlerUtility.hideAds(driver);

        //10) Select checkbox 'Sign up for our newsletter!'
        accountInformationServices.clickNewsLetter();

        //11) Select checkbox 'Receive special offers from our partners!'
        accountInformationServices.clickSpecialOffers();
        AdHandlerUtility.hideAds(driver);

        //12) Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        accountInformationServices.fillAddressInformationDetails(TestDataGenerator.newFirstName(), TestDataGenerator.newLastName(),
        TestDataGenerator.newCompany(), TestDataGenerator.newAddress(),TestDataGenerator.newAddress(), TestDataGenerator.newCountry(),
        TestDataGenerator.newState(), TestDataGenerator.newCity(), TestDataGenerator.newZipCode(),
        TestDataGenerator.newMobileNumber());
        
        //13) Click 'Create Account button'
        accountInformationServices.clickCreateAccount();

        //14) Verify that 'ACCOUNT CREATED!' is visible
        wait.until(ExpectedConditions.visibilityOf(accountCreatedUI.accountCreated()));

        //15) Click 'Continue' button
        AdHandlerUtility.hideAds(driver);
        accountCreatedServices.clickContinue();

        AdHandlerUtility.hideAds(driver);
        //16) Verify that 'Logged in as username' is visible
        wait.until(ExpectedConditions.visibilityOf(loggedInPageUI.loggedInAsUser()));

        AdHandlerUtility.hideAds(driver);
        //17) Click 'Delete Account' button
        loggedInPageServices.clickDelete();

        //18) Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        AdHandlerUtility.hideAds(driver);
        wait.until(ExpectedConditions.visibilityOf(accountDeletedUI.accountDeletedText()));

        //Click continue button
        accountDeletedServices.clickContinue();
    }

}
