import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import page_objects.delete_account.Services.AccountDeletedServices;
import page_objects.delete_account.UI.AccountDeletedUI;
import page_objects.handler_classes.AdHandlerUtility;
import page_objects.login_workflow.Services.LoggedInPageServices;
import page_objects.login_workflow.UI.LoggedInPageUI;
import page_objects.main_page.Services.MainPageServices;
import page_objects.main_page.UI.MainPageUI;
import page_objects.signup_workflow.Services.AccountCreatedServices;
import page_objects.signup_workflow.Services.AccountInformationServices;
import page_objects.signup_workflow.Services.SignUpLoginPageServices;
import page_objects.signup_workflow.UI.AccountCreatedUI;
import page_objects.signup_workflow.UI.AccountInformationUI;
import page_objects.signup_workflow.UI.SignUpLoginPageUI;
/**
 * This class is created for register an user in the webpage
 * RegisterUser
 */

public class RegisterUser {

    //WebElement variables
    private WebDriver driver;
    private ChromeOptions options;
    private MainPageUI mainPageUI;
    private SignUpLoginPageUI signUpLoginPageUI;
    private AccountInformationUI accountInformationUI;
    private AccountCreatedUI accountCreatedUI;
    private LoggedInPageUI loggedInPageUI;
    private AccountDeletedUI accountDeletedUI;
    private String url;

    //Services variables
    private MainPageServices mainPageServices;
    private SignUpLoginPageServices signUpLoginPageServices;
    private AccountInformationServices accountInformationServices;
    private AccountCreatedServices accountCreatedServices;
    private LoggedInPageServices loggedInPageServices;
    private AccountDeletedServices accountDeletedServices;

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

    //Wait variable
    private WebDriverWait wait;

    @Before
    /**
     * 1) Launching browser and getting URL
     * 2) Navigate to url
     */
    public void setUp() {

        options = new AdHandlerUtility().hideChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
       
        url = "https://automationexercise.com";

        //Initialize WebElements
        mainPageUI = new MainPageUI(driver);
        mainPageUI.setDriver(driver);
        mainPageUI.getDriver().get(url);

        signUpLoginPageUI = new SignUpLoginPageUI(driver);
        signUpLoginPageUI.setDriver(driver);

        accountInformationUI = new AccountInformationUI(driver);
        accountInformationUI.setDriver(driver);

        accountCreatedUI = new AccountCreatedUI(driver);
        accountCreatedUI.setDriver(driver);

        loggedInPageUI = new LoggedInPageUI(driver);
        loggedInPageUI.setDriver(driver);

        accountDeletedUI = new AccountDeletedUI(driver);
        accountDeletedUI.setDriver(driver);

        //Intialize Services
        mainPageServices = new MainPageServices(driver);
        signUpLoginPageServices = new SignUpLoginPageServices(driver);
        accountInformationServices = new AccountInformationServices(driver);
        accountCreatedServices = new AccountCreatedServices(driver);
        loggedInPageServices = new LoggedInPageServices(driver);
        accountDeletedServices = new AccountDeletedServices(driver);

        wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    }

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
