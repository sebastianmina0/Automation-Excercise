import java.time.Duration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import page_objects.delete_account.UI.AccountDeletedUI;
import page_objects.handler_classes.AdHandlerUtility;
import page_objects.login_workflow.Services.LoggedInPageServices;
import page_objects.login_workflow.UI.LoggedInPageUI;
import page_objects.main_page.Services.MainPageServices;
import page_objects.main_page.UI.MainPageUI;
import page_objects.signup_workflow.Services.SignUpLoginPageServices;
import page_objects.signup_workflow.UI.SignUpLoginPageUI;

/**
 * This class is created to login with an existing user
 * CorrectLogin
 */
public class CorrectLogin {

    //WebElement variables
    private WebDriver driver;
    private SignUpLoginPageUI signUpLoginPageUI;
    private LoggedInPageUI loggedInPageUI;
    private AccountDeletedUI accountDeletedUI;
    private MainPageUI mainPageUI;
    private ChromeOptions options;
    private String url;

    //Services variables
    private MainPageServices mainPageServices;
    private SignUpLoginPageServices signUpLoginPageServices;
    private LoggedInPageServices loggedInPageServices;

    //Login information

    private final String email = "user@user.user.use";
    private final String password = "password43271234";

    private WebDriverWait wait;


    @Before
    /**
     * 1) Launching browser and getting URL
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

        accountDeletedUI = new AccountDeletedUI(driver);
        accountDeletedUI.setDriver(driver);

        mainPageServices = new MainPageServices(driver);
        signUpLoginPageServices = new SignUpLoginPageServices(driver);
        loggedInPageServices = new LoggedInPageServices(driver);

        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        
    }

    /**
     * Test Case 2 -  Login User with correct email and password
     */
    @Test
    public void userLogin(){

        AdHandlerUtility.hideAds(driver);
        //3) Verify that home page is visible succesfully
        wait.until(ExpectedConditions.visibilityOf(mainPageUI.singUp()));   

        //4) Click on 'Signup / Login' button
        mainPageServices.clickSingUpButton();

        //5) Verify 'Login to your account' is visible
        wait.until(ExpectedConditions.visibilityOf(signUpLoginPageUI.loginText()));

        //6) Enter correct email address and password
        signUpLoginPageServices.enterEmailAndPassword(email, password);
        
        //7) Click 'login' button
        signUpLoginPageServices.clickLoginButton();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        AdHandlerUtility.hideAds(driver);

        //8) Verify that 'Logged in as username' is visible
        wait.until(ExpectedConditions.visibilityOf(loggedInPageUI.loggedInAsUser()));

        AdHandlerUtility.hideAds(driver);
        //9) Click 'Delete button'
        loggedInPageServices.clickDelete();

        //10) Verify that 'ACCOUNT DELETED!' is visible
        Assert.assertEquals(true, accountDeletedUI.accountDeletedText().isDisplayed());

    }

}