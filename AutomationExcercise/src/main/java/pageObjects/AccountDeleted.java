package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountDeleted {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
    
    //Account Deleted Text
    public WebElement accountDeletedText(){

        return getDriver().findElement(By.xpath("//b[contains(text(),'Account Deleted')]"));
    }

    //Continue button
    public WebElement continueButton(){
        
        return getDriver().findElement(By.cssSelector("a[data-qa='continue-button']"));
    }

}
