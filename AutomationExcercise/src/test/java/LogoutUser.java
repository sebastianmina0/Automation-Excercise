
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

import page_objects.handler_classes.AdHandlerUtility;
import page_objects.setUp.SetUpEnvironment;

public class LogoutUser extends SetUpEnvironment {

    //Information
    private final String email = "user@test.user";
    private final String password = "user@test.user";


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
