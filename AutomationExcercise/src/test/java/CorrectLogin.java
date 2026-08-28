import java.time.Duration;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

import page_objects.handler_classes.AdHandlerUtility;
import page_objects.setUp.SetUpEnvironment;


/**
 * This class is created to login with an existing user
 * CorrectLogin
 */
public class CorrectLogin extends SetUpEnvironment{

    //Login information
    private final String email = "user@user.user.use";
    private final String password = "password43271234";

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