package page_objects.setUp;

import java.time.Duration;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import page_objects.contact_us_workflow.Services.ContactUsServices;
import page_objects.contact_us_workflow.UI.ContactUsUI;
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
import page_objects.test_data.StaticData;
import page_objects.test_data.TestDataGenerator;

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

    // Services
    protected MainPageServices mainPageServices;
    protected SignUpLoginPageServices signUpLoginPageServices;
    protected LoggedInPageServices loggedInPageServices;
    protected AccountDeletedServices accountDeletedServices;
    protected AccountInformationServices accountInformationServices;
    protected AccountCreatedServices accountCreatedServices;
    protected ContactUsServices contactUsServices;

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

        mainPageServices = new MainPageServices(driver);
        signUpLoginPageServices = new SignUpLoginPageServices(driver);
        loggedInPageServices = new LoggedInPageServices(driver);
        accountInformationServices = new AccountInformationServices(driver);
        accountCreatedServices = new AccountCreatedServices(driver);
        accountDeletedServices = new AccountDeletedServices(driver);
        contactUsServices = new ContactUsServices(driver);

        wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        projectPath = System.getProperty("user.dir");
        filePath = projectPath + "/src/main/resources/TestDataFile.txt";

    }
    
    public void closeEnvironment() {
        if (driver != null) {
            driver.quit();
        }
    }

}
