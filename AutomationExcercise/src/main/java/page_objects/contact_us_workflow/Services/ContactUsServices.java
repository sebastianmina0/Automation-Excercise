package page_objects.contact_us_workflow.Services;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import page_objects.contact_us_workflow.UI.ContactUsUI;
import page_objects.handler_classes.AdHandlerUtility;

public class ContactUsServices {

    private final WebDriver driver;
    private final ContactUsUI contactUsUI;

    /**
     * Constructor
     * @param driver
     */
    public ContactUsServices(WebDriver driver){

        this.driver = driver;
        this.contactUsUI = new ContactUsUI(driver);
    }

    /**
     * Method that enters name in textbox
     * @param name
     */
    public void enterName(String name){

        contactUsUI.nameTextBox().sendKeys(name);
    }

    /**
     * Method that enters email in textbox
     * @param email
     */
    public void enterEmail(String email){

        contactUsUI.emailTextBox().sendKeys(email);
    }

    /**
     * Method that enters subject in textbox
     * @param subject
     */
    public void enterSubject(String subject){

        contactUsUI.subjectTextBox().sendKeys(subject);
    }

    /**
     * Method that enters message in textbox
     * @param message
     */
    public void enterMessage(String message){

        contactUsUI.messageTextBox().sendKeys(message);

    }

    /**
     * Method that uploads input file
     * @param filePath
     */
    public void enterFile(String filePath){

        contactUsUI.fileButton().sendKeys(filePath);
    }

    /**
     * Method that clicks submit button
     */
    public void clickSubmitButton(){

        AdHandlerUtility.safeClick(driver, contactUsUI.submitButton());

    }

    public void clickHomeGreenButton(){
        
        WebElement btnHome = contactUsUI.homeGreenButton();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnHome);
    }


}
