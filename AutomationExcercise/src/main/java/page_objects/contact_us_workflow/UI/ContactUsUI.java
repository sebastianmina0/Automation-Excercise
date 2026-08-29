package page_objects.contact_us_workflow.UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsUI {

    private WebDriver driver;
    
    /**
     * Constructor
     * @param driver
     */
    public ContactUsUI(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Get driver
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
     * Return web element
     * @return
     */
    public WebElement contactUsPage(){

        return driver.findElement(By.cssSelector("div[id='contact-page'"));
    }

    /**
     * Return web element
     * @return
     */
    public WebElement nameTextBox(){

        return driver.findElement(By.cssSelector("input[data-qa='name']"));
    }

    /**
     * Return web element
     * @return
     */
    public WebElement emailTextBox(){

        return driver.findElement(By.cssSelector("input[data-qa='email']"));
    }

    /**
     * Return web element
     * @return
     */
    public WebElement subjectTextBox(){

        return driver.findElement(By.cssSelector("input[data-qa='subject']"));
    }

    /**
     * Return web element
     * @return
     */
    public WebElement messageTextBox(){

        return driver.findElement(By.cssSelector("textarea[data-qa='message']"));
    }

    /**
     * Return web element
     * @return
     */
    public WebElement fileButton(){

        return driver.findElement(By.cssSelector("input[type='file']"));
    }

    /**
     * Return web element
     * @return
     */
    public WebElement submitButton(){

        return driver.findElement(By.cssSelector("input[data-qa='submit-button']"));
    }

    /**
     * Return web element
     * @return
     */
    public WebElement successText(){

        return driver.findElement(By.cssSelector(".status.alert.alert-success"));
    }

    /**
     * Return web element
     * @return
     */
    public WebElement homeGreenButton(){

        return driver.findElement(By.cssSelector(".btn.btn-success"));
    }


}
