
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import page_objects.handler_classes.AdHandlerUtility;
import page_objects.setUp.SetUpEnvironment;
import page_objects.test_data.StaticData;

/**
 * This class is created to test and incorrect login workflow
 * IncorrectLogin
 */
public class IncorrectLogin extends SetUpEnvironment{

    @Test
    /**
     * Test Case 3: Login User with incorrect email and password
    */
    public void incorrectLogin(){

        AdHandlerUtility.hideAds(driver);
        //3) Verify that home page is visible succesfully
        wait.until(ExpectedConditions.visibilityOf(mainPageUI.singUp()));   

        //4) Click on 'Signup / Login' button
        mainPageServices.clickSingUpButton();

        //5) Verify 'Login to your account' is visible
        wait.until(ExpectedConditions.visibilityOf(signUpLoginPageUI.loginText()));

        AdHandlerUtility.hideAds(driver);
        //6) Enter incorrect email address and password
        signUpLoginPageServices.enterEmailAndPassword(StaticData.incorrectEmail, StaticData.incorrectPassword);
  
        AdHandlerUtility.hideAds(driver);
        //7) Click login button
        signUpLoginPageServices.clickLoginButton();
        
        //8) Verify error 'Your email or password is incorrect!' is visible
        WebElement errorMessage = signUpLoginPageUI.getDriver().findElement(By.xpath("//p[normalize-space()='Your email or password is incorrect!']"));

        if(errorMessage.isDisplayed() == true){
            System.out.println("Test Case pass, email or password incorrect");
        } else{
            driver.quit();
        }

    }

}
