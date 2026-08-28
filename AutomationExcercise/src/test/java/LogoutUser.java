
import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import page_objects.handler_classes.AdHandlerUtility;
import page_objects.login_workflow.Services.LoggedInPageServices;
import page_objects.login_workflow.UI.LoggedInPageUI;
import page_objects.main_page.Services.MainPageServices;
import page_objects.main_page.UI.MainPageUI;
import page_objects.signup_workflow.Services.SignUpLoginPageServices;
import page_objects.signup_workflow.UI.SignUpLoginPageUI;

public class LogoutUser {

    private WebDriver driver;
    private WebDriverWait wait;
    private ChromeOptions options;
    private String url;

    //WebElements
    private MainPageUI mainPageUI;
    private SignUpLoginPageUI signUpLoginPageUI;
    private LoggedInPageUI loggedInPageUI;

    //Services
    private MainPageServices mainPageServices;
    private SignUpLoginPageServices signUpLoginPageServices;
    private LoggedInPageServices loggedInPageServices;

    //Information
    private final String email = "user@test.user";
    private final String password = "user@test.user";

    @Before
    /**
     * 1) Launch browser
     * 2) Navigate to url
     */
    public void setUp(){

        options = new AdHandlerUtility().hideChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        url = "https://automationexercise.com";

        mainPageUI = new MainPageUI(driver);
        mainPageUI.setDriver(driver);
        mainPageUI.getDriver().get(url);

        signUpLoginPageUI = new SignUpLoginPageUI(driver);
        signUpLoginPageUI.setDriver(driver);

        loggedInPageUI = new LoggedInPageUI(driver);
        loggedInPageUI.setDriver(driver);

        mainPageServices = new MainPageServices(driver);
        signUpLoginPageServices = new SignUpLoginPageServices(driver);
        loggedInPageServices = new LoggedInPageServices(driver);

        wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    }

    @Test
    public void logOutUser(){

        //3) Verify that home page is visible successfully
        AdHandlerUtility.hideAds(driver);
        wait.until(ExpectedConditions.visibilityOf(mainPageUI.singUp()));

        //4) Click on 'Signup / Login' button
        AdHandlerUtility.hideAds(driver);
        mainPageServices.clickSingUpButton();

        //5) Verify 'Login to your account' is visible
        AdHandlerUtility.hideAds(driver);
        wait.until(ExpectedConditions.visibilityOf(signUpLoginPageUI.loginText()));

        //6) Enter correct email and password
        AdHandlerUtility.hideAds(driver);
        signUpLoginPageServices.enterEmailAndPassword(email, password);

        //7) Click 'login' button
        AdHandlerUtility.hideAds(driver);
        signUpLoginPageServices.clickLoginButton();

        //8) Verify that 'Logged in as username' is visible
        AdHandlerUtility.hideAds(driver);
        wait.until(ExpectedConditions.visibilityOf(loggedInPageUI.loggedInAsUser()));

        //9) Click 'Logout' button
        AdHandlerUtility.hideAds(driver);
        loggedInPageServices.clickLogout();

        //10) Verify that user is navigated to login Page
        AdHandlerUtility.hideAds(driver);
        wait.until(ExpectedConditions.visibilityOf(signUpLoginPageUI.loginText()));
        System.out.println("Logout correct");

    }



}
