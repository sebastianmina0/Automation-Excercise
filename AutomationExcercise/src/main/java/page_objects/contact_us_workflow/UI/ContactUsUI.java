package page_objects.contact_us_workflow.UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsUI {

    private WebDriver driver;
    
    public ContactUsUI(WebDriver driver){
        this.driver = driver;
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void setDriver(WebDriver driver){
        this.driver = driver;
    }

    public WebElement contactUsPage(){

        return driver.findElement(By.cssSelector("div[id='contact-page'"));
    }

    public WebElement nameTextBox(){

        return driver.findElement(By.cssSelector("input[data-qa='name']"));
    }

    public WebElement emailTextBox(){

        return driver.findElement(By.cssSelector("input[data-qa='email']"));
    }

    public WebElement subjectTextBox(){

        return driver.findElement(By.cssSelector("input[data-qa='subject']"));
    }

    public WebElement messageTextBox(){

        return driver.findElement(By.cssSelector("textarea[data-qa='message']"));
    }

    public WebElement fileButton(){

        return driver.findElement(By.cssSelector("input[type='file']"));
    }

    public WebElement submitButton(){

        return driver.findElement(By.cssSelector("input[data-qa='submit-button']"));
    }

    public WebElement successText(){

        return driver.findElement(By.cssSelector(".status.alert.alert-success"));
    }

    public WebElement homeGreenButton(){

        return driver.findElement(By.cssSelector(".btn.btn-success"));
    }


}
