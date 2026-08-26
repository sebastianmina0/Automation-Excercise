
import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import page_objects.handler_classes.AdHandlerUtility;
import page_objects.main_page.MainPage;
import page_objects.signup_workflow.SignUpLoginPage;

/**
 * This class is created to test and incorrect login workflow
 * IncorrectLogin
 */
public class IncorrectLogin {

    private WebDriver driver;
    private MainPage mainPage;
    private SignUpLoginPage signUpLoginPage;
    private ChromeOptions options;
    private String url;
    private WebDriverWait wait;

    //Incorrect Login Information
    private final String email = "sebastianmina654@gmail.com";
    private final String password = "password";


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

    }

    @Test
    public void incorrectLogin(){

        // 3) Verify that home page is visible successfully
        AdHandlerUtility.hideAds(driver);
        WebElement signUpButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href='/login']")));
        //4) Click on 'Signup / Login' button
        AdHandlerUtility.safeClick(driver, signUpButton);

        //5) Verify 'Login to your account' is visible
        if(signUpLoginPage.loginText().isDisplayed() == true){

            AdHandlerUtility.hideAds(driver);
            //6) Enter incorrect email address and password
            signUpLoginPage.emailLogin().sendKeys(email);
            signUpLoginPage.passwordLogin().sendKeys(password);
        } else {
            driver.quit();
        }

        //7) Click login button
        AdHandlerUtility.safeClick(driver, signUpLoginPage.loginButton());
        //8) Verify error 'Your email or password is incorrect!' is visible
        WebElement errorMessage = signUpLoginPage.getDriver().findElement(By.xpath("//p[normalize-space()='Your email or password is incorrect!']"));
        if(errorMessage.isDisplayed() == true){

            System.out.println("Test Case pass, email or password incorrect");
        } else{
            driver.quit();
        }

    }

}
