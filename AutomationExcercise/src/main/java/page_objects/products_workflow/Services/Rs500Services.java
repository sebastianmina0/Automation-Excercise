package page_objects.products_workflow.Services;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import page_objects.products_workflow.UI.Rs500UI;
import page_objects.test_data.StaticData;

public class Rs500Services {

    private final WebDriver driver;
    private final Rs500UI rs500UI;

    /**
     * Constructor
     * @param driver
     */
    public Rs500Services(WebDriver driver){

        this.driver = driver;
        this.rs500UI = new Rs500UI(driver);
    }

    /**
     * Modify quantity
     */
    public void modifyQuantity(){

        rs500UI.rs500Quantity().sendKeys(StaticData.quantity);
    }

    /**
     * Click button
     */
    public void clickAddCart(){

        rs500UI.addToCart().click();
    }

    /**
     * Click button
     */
    public void clickViewCart(){

        rs500UI.viewCart().click();
    }

    /**
     * Enters name
     */
    public void enterName(String name){

        rs500UI.reviewName().sendKeys(name);
    }

    /**
     * Enters email
     */
    public void enterEmail(String email){

        rs500UI.reviewEmail().sendKeys(email);
    }

    /**
     * Enters message
     */
    public void enterMessage(String message){

        rs500UI.reviewMessage().sendKeys(message);
    }

    /**
     * Click submit
     */
    public void clickSubmit(){

        WebElement btnSubmit = rs500UI.submitButton();        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnSubmit);
    }


}
