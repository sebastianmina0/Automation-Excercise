package page_objects.contact_us_workflow.Services;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import page_objects.contact_us_workflow.UI.ContactUsUI;
import page_objects.handler_classes.AdHandlerUtility;

public class ContactUsServices {

    private final WebDriver driver;
    private final ContactUsUI contactUsUI;

    public ContactUsServices(WebDriver driver){

        this.driver = driver;
        this.contactUsUI = new ContactUsUI(driver);
    }

    public void enterName(String name){

        contactUsUI.nameTextBox().sendKeys(name);
    }

    public void enterEmail(String email){

        contactUsUI.emailTextBox().sendKeys(email);
    }

    public void enterSubject(String subject){

        contactUsUI.subjectTextBox().sendKeys(subject);
    }

    public void enterMessage(String message){

        contactUsUI.messageTextBox().sendKeys(message);

    }

    public void enterFile(String filePath){

        contactUsUI.fileButton().sendKeys(filePath);
    }

    public void clickSubmitButton(){

        AdHandlerUtility.safeClick(driver, contactUsUI.submitButton());

    }

    public void clickHomeGreenButton(){
        
        WebElement btnHome = contactUsUI.homeGreenButton();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnHome);
    }


}
