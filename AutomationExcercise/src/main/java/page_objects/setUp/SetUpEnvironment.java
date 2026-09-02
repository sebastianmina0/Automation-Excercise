package page_objects.setUp;

import java.time.Duration;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import page_objects.cart_workflow.Services.CartServices;
import page_objects.cart_workflow.UI.CartUI;
import page_objects.contact_us_workflow.Services.ContactUsServices;
import page_objects.contact_us_workflow.UI.ContactUsUI;
import page_objects.delete_account.Services.AccountDeletedServices;
import page_objects.delete_account.UI.AccountDeletedUI;
import page_objects.handler_classes.AdHandlerUtility;
import page_objects.login_workflow.Services.LoggedInPageServices;
import page_objects.login_workflow.UI.LoggedInPageUI;
import page_objects.main_page.Services.MainPageServices;
import page_objects.main_page.UI.MainPageUI;
import page_objects.products_workflow.Services.ProductsPageServices;
import page_objects.products_workflow.Services.Rs500Services;
import page_objects.products_workflow.UI.ProductsPageUI;
import page_objects.products_workflow.UI.Rs500UI;
import page_objects.signup_workflow.Services.AccountCreatedServices;
import page_objects.signup_workflow.Services.AccountInformationServices;
import page_objects.signup_workflow.Services.SignUpLoginPageServices;
import page_objects.signup_workflow.UI.AccountCreatedUI;
import page_objects.signup_workflow.UI.AccountInformationUI;
import page_objects.signup_workflow.UI.SignUpLoginPageUI;
import page_objects.test_data.StaticData;
import page_objects.test_data.TestDataGenerator;

/**
 * This class is created to setup all the classes that
 * this project needs to run the tests
 * SetUpEnvironment
 */
public class SetUpEnvironment {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected String url = "https://automationexercise.com";
    protected String projectPath;
    protected String filePath;

    // Page Objects UI
    protected MainPageUI mainPageUI;
    protected SignUpLoginPageUI signUpLoginPageUI;
    protected LoggedInPageUI loggedInPageUI;
    protected AccountDeletedUI accountDeletedUI;
    protected AccountCreatedUI accountCreatedUI;
    protected AccountInformationUI accountInformationUI;
    protected ContactUsUI contactUsUI;
    protected ProductsPageUI productsPageUI;
    protected Rs500UI rs500UI;
    protected CartUI cartUI;

    // Services
    protected MainPageServices mainPageServices;
    protected SignUpLoginPageServices signUpLoginPageServices;
    protected LoggedInPageServices loggedInPageServices;
    protected AccountDeletedServices accountDeletedServices;
    protected AccountInformationServices accountInformationServices;
    protected AccountCreatedServices accountCreatedServices;
    protected ContactUsServices contactUsServices;
    protected ProductsPageServices productsPageServices;
    protected Rs500Services rs500Services;
    protected CartServices cartServices;

    //TestData
    protected TestDataGenerator testDataGenerator;
    protected StaticData staticData;

    @Before
    //1) Launch browser
    //2) Navigate to url
    public void setUpVariables() {

        ChromeOptions options = new AdHandlerUtility().hideChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        mainPageUI = new MainPageUI(driver);
        mainPageUI.setDriver(driver);
        mainPageUI.getDriver().get(url);

        signUpLoginPageUI = new SignUpLoginPageUI(driver);
        signUpLoginPageUI.setDriver(driver);

        loggedInPageUI = new LoggedInPageUI(driver);
        loggedInPageUI.setDriver(driver);

        accountInformationUI = new AccountInformationUI(driver);
        accountInformationUI.setDriver(driver);

        accountCreatedUI = new AccountCreatedUI(driver);
        accountCreatedUI.setDriver(driver);

        accountDeletedUI = new AccountDeletedUI(driver);
        accountDeletedUI.setDriver(driver);

        contactUsUI = new ContactUsUI(driver);
        contactUsUI.setDriver(driver);

        productsPageUI = new ProductsPageUI(driver);
        productsPageUI.setDriver(driver);

        rs500UI = new Rs500UI(driver);
        rs500UI.setDriver(driver);

        cartUI = new CartUI(driver);
        cartUI.setDriver(driver);

        mainPageServices = new MainPageServices(driver);
        signUpLoginPageServices = new SignUpLoginPageServices(driver);
        loggedInPageServices = new LoggedInPageServices(driver);
        accountInformationServices = new AccountInformationServices(driver);
        accountCreatedServices = new AccountCreatedServices(driver);
        accountDeletedServices = new AccountDeletedServices(driver);
        contactUsServices = new ContactUsServices(driver);
        productsPageServices = new ProductsPageServices(driver);
        rs500Services = new Rs500Services(driver);
        cartServices = new CartServices(driver);

        wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        projectPath = System.getProperty("user.dir");
        filePath = projectPath + "/src/main/resources/TestDataFile.txt";

    }

    /**
     * Method that closes the environment
     */
    public void closeEnvironment() {
        if (driver != null) {
            driver.quit();
        }
    }

}
