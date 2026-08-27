package page_objects.signup_workflow.Services;

import org.openqa.selenium.WebDriver;

import page_objects.handler_classes.AdHandlerUtility;
import page_objects.signup_workflow.UI.SignUpLoginPageUI;

public class SignUpLoginPageServices {

    private final WebDriver driver;
    private final SignUpLoginPageUI signUpLoginPageUI;

    public SignUpLoginPageServices(WebDriver driver){
        
        this.driver =driver;
        signUpLoginPageUI = new SignUpLoginPageUI(driver);
    }

    public void enterNameAndEmail(String name, String email) throws InterruptedException{

        signUpLoginPageUI.nameBox().sendKeys(name);
        signUpLoginPageUI.emailBox().sendKeys(email);
    }

    public void enterEmailAndPassword(String email, String password){

        signUpLoginPageUI.emailLogin().sendKeys(email);
        signUpLoginPageUI.passwordLogin().sendKeys(password);
    }

    public void clickSingUpButton(){

        AdHandlerUtility.safeClick(driver, signUpLoginPageUI.signUpButton());
    }

    public void clickLoginButton(){

        AdHandlerUtility.safeClick(driver, signUpLoginPageUI.loginButton());
    }

}
