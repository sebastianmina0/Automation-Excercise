package page_objects.login_workflow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpLoginPage {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
    
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

}
