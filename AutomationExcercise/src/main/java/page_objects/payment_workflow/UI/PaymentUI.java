package page_objects.payment_workflow.UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentUI {

    private WebDriver driver;

    /**
     * Constructor
     * @param driver
     */
    public PaymentUI(WebDriver driver){

        this.driver = driver;
    }

    /**
     * Get Driver
     * @return
     */
    public WebDriver getDriver(){

        return driver;
    }

    /**
     * Set driver
     * @param driver
     */
    public void setDriver(WebDriver driver){

        this.driver = driver;
    }

    /**
     * Returns a WebElement
     * @return WebElement
     */
    public WebElement paymentName(){

        return driver.findElement(By.cssSelector("input[data-qa='name-on-card']"));
    }

    /**
     * Returns a WebElement
     * @return WebElement
     */
    public WebElement paymentCardNumber(){

        return driver.findElement(By.cssSelector("input[data-qa='card-number']"));
    }

    /**
     * Returns a WebElement
     * @return WebElement
     */
    public WebElement paymentCVC(){

        return driver.findElement(By.cssSelector("input[data-qa='cvc']"));
    }

    /**
     * Returns a WebElement
     * @return WebElement
     */
    public WebElement paymentExpirationMonth(){

        return driver.findElement(By.cssSelector("input[data-qa='expiry-month']"));
    }

    /**
     * Returns a WebElement
     * @return WebElement
     */
    public WebElement paymentExpirationYear(){

        return driver.findElement(By.cssSelector("input[data-qa='expiry-year']"));
    }

    /**
     * Returns a WebElement
     * @return WebElement
     */
    public WebElement confirmOrderButton(){

        return driver.findElement(By.cssSelector("#submit"));
    }

    /**
     * Returns a WebElement
     * @return WebElement
     */
    public WebElement orderSuccessMessage(){

        return driver.findElement(By.cssSelector(".altert-success.alert"));
    }
}
