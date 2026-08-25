package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * AccountCreated
 */
public class AccountCreated {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Method that returns Account Created element
     * @return WebElement
     */
    public WebElement accountCreated(){

        return getDriver().findElement(By.xpath("//b[contains(text(),'Account Created')]"));
    }

    /**
     * Method that returns button element
     * @return button
     */
    public WebElement continueButton(){
        
        return getDriver().findElement(By.cssSelector("a[data-qa='continue-button']"));
    }


}
