package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountCreated {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    //Account created text
    public WebElement accountCreated(){

        return getDriver().findElement(By.cssSelector("h2[class='title text-center'] b"));
    }

    //Continue button
    public WebElement continueButton(){

        return getDriver().findElement(By.cssSelector(".btn.btn-primary"));
    }


}
