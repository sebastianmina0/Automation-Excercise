package page_objects.delete_account.UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * AccountDeleted
 */
public class AccountDeletedUI {

    private WebDriver driver;

    public AccountDeletedUI(WebDriver driver){
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
    
    /**
     * Method that returns Account Deleted element
     * @return WebElement
     */
    public WebElement accountDeletedText(){

        return getDriver().findElement(By.xpath("//b[contains(text(),'Account Deleted')]"));
    }

    /**
     * Method that returns button element
     * @return Button
     */
    public WebElement continueButton(){
        
        return getDriver().findElement(By.cssSelector("a[data-qa='continue-button']"));
    }

}
