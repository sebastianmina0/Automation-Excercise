package pageObjects;

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
    
    //New User Signup text
    public WebElement newUser(){

        return getDriver().findElement(By.cssSelector("div[class='signup-form'] h2"));
    }

    //Signup frame

    //Name Textbox
    public WebElement nameBox(){

        return getDriver().findElement(By.cssSelector("input[placeholder='Name']"));
    }

    //Email Textbox
    public WebElement emailBox(){

        return getDriver().findElement(By.cssSelector("input[data-qa='signup-email']"));
    }

    //Singup Button
    public WebElement signUpButton(){

        return getDriver().findElement(By.cssSelector("button[data-qa='signup-button']"));
    }

}
