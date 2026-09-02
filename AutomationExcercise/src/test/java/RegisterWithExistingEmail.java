import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import page_objects.handler_classes.AdHandlerUtility;
import page_objects.setUp.SetUpEnvironment;
import page_objects.test_data.StaticData;

/**
 * This class is created to verify that is not
 * possible to register with an existing email
 * RegisterWithExistingEmail
 */
public class RegisterWithExistingEmail extends SetUpEnvironment {

    @Test
    /**
     * Test Case 5: Register User with existing email
     * @throws InterruptedException
     */
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
        signUpLoginPageServices.enterNameAndEmail(StaticData.name, StaticData.existingEmail);

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
