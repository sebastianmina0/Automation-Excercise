import java.time.Duration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import page_objects.delete_account.AccountDeleted;
import page_objects.handler_classes.AdHandlerUtility;
import page_objects.login_workflow.LoggedInPage;
import page_objects.main_page.MainPage;
import page_objects.signup_workflow.SignUpLoginPage;

/**
 * This class is created to login with an existing user
 * CorrectLogin
 */
public class CorrectLogin {

    private WebDriver driver;
    private SignUpLoginPage signUpLoginPage;
    private LoggedInPage loggedInPage;
    private AccountDeleted accountDeleted;
    private MainPage mainPage;
    private ChromeOptions options;
    private String url;
    private WebDriverWait wait;

    //Login information
    
    private final String email = "user@user.user.user";
    private final String password = "password43271234";


    @Before
    /**
     * 1) Launching browser and getting URL
     * 2) Navigate to url
     */
    public void setUp(){

        options = new AdHandlerUtility().hideChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        url = "https://automationexercise.com";

        mainPage = new MainPage();
        mainPage.setDriver(driver);
        mainPage.getDriver().get(url);

        signUpLoginPage = new SignUpLoginPage();
        signUpLoginPage.setDriver(driver);

        loggedInPage = new LoggedInPage();
        loggedInPage.setDriver(driver);

        accountDeleted = new AccountDeleted();
        accountDeleted.setDriver(driver);
        
    }


    @Test
    public void UserLogin(){

        //3) Verify that home page is visible succesfully
        AdHandlerUtility.hideAds(driver);
        WebElement signUpButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href='/login']")));
        //4) Click on 'Signup / Login' button
        AdHandlerUtility.safeClick(driver, signUpButton);

        //5) Verify 'Login to your account' is visible
        if(signUpLoginPage.loginText().isDisplayed() == true){

            AdHandlerUtility.hideAds(driver);
            //6) Enter correct email address and password
            signUpLoginPage.emailLogin().sendKeys(email);
            signUpLoginPage.passwordLogin().sendKeys(password);
        } else {
            driver.quit();
        }

        //7) Click 'login' button
        AdHandlerUtility.safeClick(driver, signUpLoginPage.loginButton());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        AdHandlerUtility.hideAds(driver);

        //8) Verify that 'Logged in as username' is visible
        if(loggedInPage.loggedInAsUser().isDisplayed() == true){

            //9) Click 'Delete Account' button
            WebElement btnDelete = loggedInPage.deleteAccount();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", btnDelete);

        } else {
            driver.quit();
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        AdHandlerUtility.hideAds(driver);

        //10) Verify that 'ACCOUNT DELETED!' is visible
        Assert.assertEquals(true, accountDeleted.accountDeletedText().isDisplayed());

    }

}