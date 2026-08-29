
import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

import page_objects.handler_classes.AdHandlerUtility;
import page_objects.setUp.SetUpEnvironment;
import page_objects.test_data.TestDataGenerator;

public class ContactUsForm extends SetUpEnvironment {

    @Test
    public void fillContactUsForm(){

        AdHandlerUtility.hideAds(driver);
        //3) Verify that home page is visible succesfully
        wait.until(ExpectedConditions.visibilityOf(mainPageUI.singUp()));

        AdHandlerUtility.hideAds(driver);
        //4) Click on 'Contact Us' button
        mainPageServices.clickContactUsButton();

        AdHandlerUtility.hideAds(driver);
        //5) Verify 'GET IN TOUCH' is visible
        wait.until(ExpectedConditions.visibilityOf(contactUsUI.contactUsPage()));

        AdHandlerUtility.hideAds(driver);
        //6) Enter name, email, subject and message
        contactUsServices.enterName(TestDataGenerator.newFirstName());
        contactUsServices.enterEmail(TestDataGenerator.newEmail());
        contactUsServices.enterSubject(TestDataGenerator.emailSubject());
        contactUsServices.enterMessage(TestDataGenerator.emailMessage());

        AdHandlerUtility.hideAds(driver);
        //7) Upload file
        contactUsServices.enterFile(filePath);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //8) Click 'Submit' button
        contactUsServices.clickSubmitButton();

        //9) Click Ok button
        driver.switchTo().alert().accept();

        //10) Verify success message 'Success! Your details have been submitted successfully.' is visible
        wait.until(ExpectedConditions.visibilityOf(contactUsUI.successText()));

        AdHandlerUtility.hideAds(driver);
        //11) Click 'Home' button and verify that landed to home page successfully
        contactUsServices.clickHomeGreenButton();
        wait.until(ExpectedConditions.visibilityOf(mainPageUI.singUp()));

        closeEnvironment();
    }

}
