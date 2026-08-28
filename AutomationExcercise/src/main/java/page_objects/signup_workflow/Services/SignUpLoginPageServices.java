package page_objects.signup_workflow.Services;

import org.openqa.selenium.WebDriver;

import page_objects.handler_classes.AdHandlerUtility;
import page_objects.signup_workflow.UI.SignUpLoginPageUI;

public class SignUpLoginPageServices {

    private final WebDriver driver;
    private final SignUpLoginPageUI signUpLoginPageUI;

    /**
     * Constructor
     * @param driver
     */
    public SignUpLoginPageServices(WebDriver driver){
        
        this.driver =driver;
        signUpLoginPageUI = new SignUpLoginPageUI(driver);
    }

    /**
     * Method that fills sign up form
     * @param name
     * @param email
     * @throws InterruptedException
     */
    public void enterNameAndEmail(String name, String email) throws InterruptedException{

        signUpLoginPageUI.nameBox().sendKeys(name);
        signUpLoginPageUI.emailBox().sendKeys(email);
    }

    /**
     * Method that fills login form
     * @param email
     * @param password
     */
    public void enterEmailAndPassword(String email, String password){

        signUpLoginPageUI.emailLogin().sendKeys(email);
        signUpLoginPageUI.passwordLogin().sendKeys(password);
    }

    /**
     * Method that clicks sign up button
     */
    public void clickSingUpButton(){

        AdHandlerUtility.safeClick(driver, signUpLoginPageUI.signUpButton());
    }

    /**
     * Method that clicks login button
     */
    public void clickLoginButton(){

        AdHandlerUtility.safeClick(driver, signUpLoginPageUI.loginButton());
    }

}
