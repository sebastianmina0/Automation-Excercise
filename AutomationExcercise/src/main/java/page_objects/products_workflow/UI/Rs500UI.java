package page_objects.products_workflow.UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Rs500UI {

    private WebDriver driver;

    public Rs500UI (WebDriver driver){

        this.driver = driver;
    }

    public WebDriver getDriver(){

        return driver;
    }

    public void setDriver(WebDriver driver){

        this.driver = driver;
    }

    public WebElement rs500Information(){

        return driver.findElement(By.cssSelector(".product-information"));
    }

}
