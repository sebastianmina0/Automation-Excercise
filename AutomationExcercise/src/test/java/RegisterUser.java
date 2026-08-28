import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

import page_objects.handler_classes.AdHandlerUtility;
import page_objects.setUp.SetUpEnvironment;

/**
 * This class is created for register an user in the webpage
 * RegisterUser
 */
public class RegisterUser extends SetUpEnvironment {

    //Account information variables
    private final String name = "prueba1";
    private final String email = "prueba@yahoo.com";
    private final String password = "s{fkfjasldsladksaldksadad";
    private final String day = "25";
    private final String month = "9";
    private final String year = "2000";

    //Address information variables
    private final String firstName = "Test1";
    private final String lastName = "Automation";
    private final String company = "AnyCompany";
    private final String address = "Calle 1 # 1 - 1";
    private final String address2 = "Calle 2 # 2 - 2";
    private final String state = "Bogota";
    private final String city = "Bogota";
    private final String zipCode = "1111111";
    private final String mobileNumber = "3334445566";

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
        signUpLoginPageServices.enterNameAndEmail(name, email);

        AdHandlerUtility.hideAds(driver);
        //7) Click 'Signup' button
        signUpLoginPageServices.clickSingUpButton();

        AdHandlerUtility.hideAds(driver);
        //8) Verify that 'ENTER ACCOUNT INFORMATION' is visible
        wait.until(ExpectedConditions.visibilityOf(accountInformationUI.accountInformationText()));

        //9) Fill details: Title, Name, Email, Password, Date of birth
        accountInformationServices.fillInformationDetails(name, password, day, month, year);
        AdHandlerUtility.hideAds(driver);

        //10) Select checkbox 'Sign up for our newsletter!'
        accountInformationServices.clickNewsLetter();

        //11) Select checkbox 'Receive special offers from our partners!'
        accountInformationServices.clickSpecialOffers();
        AdHandlerUtility.hideAds(driver);

        //12) Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        accountInformationServices.fillAddressInformationDetails(firstName, lastName, company, address, address2, state, city, zipCode, mobileNumber);
        
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
