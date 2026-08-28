
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
import page_objects.main_page.Services.MainPageServices;
import page_objects.main_page.UI.MainPageUI;
import page_objects.signup_workflow.Services.SignUpLoginPageServices;
import page_objects.signup_workflow.UI.SignUpLoginPageUI;

public class RegisterWithExistingEmail {

    private WebDriver driver;
    private WebDriverWait wait;
    private ChromeOptions options;
    private String url;

    //WebElements
    private MainPageUI mainPageUI;
    private SignUpLoginPageUI signUpLoginPageUI;

    //Services
    private MainPageServices mainPageServices;
    private SignUpLoginPageServices signUpLoginPageServices;

    //Information
    private final String name = "test1";
    private final String email = "user@test.user";

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

        mainPageServices = new MainPageServices(driver);
        signUpLoginPageServices = new SignUpLoginPageServices(driver);

        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @Test
    public void registerWithExistingEmail() throws InterruptedException{

        //3) Verify that home page is visible successfully
        AdHandlerUtility.hideAds(driver);
        wait.until(ExpectedConditions.visibilityOf(mainPageUI.singUp()));

        //4) Click on 'Signup / Login' button
        AdHandlerUtility.hideAds(driver);
        mainPageServices.clickSingUpButton();

        //5) Verify 'New User Signup!' is visible
        AdHandlerUtility.hideAds(driver);
        wait.until(ExpectedConditions.visibilityOf(signUpLoginPageUI.newUser()));

        //6) Enter name and already registered email address
        AdHandlerUtility.hideAds(driver);
        signUpLoginPageServices.enterNameAndEmail(name, email);

        //7) Click 'Signup' button
        AdHandlerUtility.hideAds(driver);
        signUpLoginPageServices.clickSingUpButton();

        //8) Verify error 'Email Address already exist!' is visible
        WebElement errorMessage = signUpLoginPageUI.getDriver().findElement(By.xpath("//p[normalize-space()='Email Address already exist!']"));

        if(errorMessage.isDisplayed() == true){
            System.out.println("Test Case pass, user already exist");
        } else{
            System.out.println("Test Case fail, user already exist");
            driver.quit();
        }
    }

}
