package page_objects.products_workflow.Services;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import page_objects.products_workflow.UI.PoloBrandPageUI;

public class PoloBrandPageServices {

    private final WebDriver driver;
    private final PoloBrandPageUI poloBrandPageUI;
    
    /**
     * Constructor
     * @param driver
     */
    public PoloBrandPageServices(WebDriver driver){

        this.driver = driver;
        this.poloBrandPageUI = new PoloBrandPageUI(driver);
    }  

    /**
     * Clicks Madame button
     */
    public void clickMadameButton(){

        WebElement btnM = poloBrandPageUI.madameButton();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnM);
    }

}
