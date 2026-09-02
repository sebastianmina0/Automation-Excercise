package page_objects.signup_workflow.UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpLoginPageUI {

    private WebDriver driver;

    /**
     * Constructor
     * @param driver
     */
    public SignUpLoginPageUI(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Get driver
     * @return
     */
    public WebDriver getDriver() {
        return driver;
    }

    /**
     * Set driver
     * @param driver
     */
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
    
    //SingUp Form

    /**
     * Method that returns a text box element
     * @return Textbox
     */
    public WebElement newUser(){

        return getDriver().findElement(By.cssSelector("div[class='signup-form'] h2"));
    }

    //Signup frame

    /**
     * Method that returns a text box element
     * @return Textbox
     */
    public WebElement nameBox(){

        return getDriver().findElement(By.cssSelector("input[placeholder='Name']"));
    }

    /**
     * Method that returns a text box element
     * @return Textbox
     */
    public WebElement emailBox(){

        return getDriver().findElement(By.cssSelector("input[data-qa='signup-email']"));
    }

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement signUpButton(){

        return getDriver().findElement(By.cssSelector("button[data-qa='signup-button']"));
    }

    //Login Form

    /**
     * Method that returns a text box element
     * @return Textbox
     */
    public WebElement emailLogin(){

        return getDriver().findElement(By.cssSelector("input[data-qa='login-email'"));
    }

    /**
     * Method that returns a text box element
     * @return Textbox
     */
    public WebElement passwordLogin(){

        return getDriver().findElement(By.cssSelector("input[data-qa='login-password'"));
    }

        /**
     * Method that returns a text
     * @return Text
     */
    public WebElement loginText(){

        return getDriver().findElement(By.xpath("//h2[contains(text(),'Login to your account')]"));
    }

    /**
     * Method that returns a button
     * @return button
     */
    public WebElement loginButton(){

        return getDriver().findElement(By.cssSelector("button[data-qa='login-button']"));
    }

}
