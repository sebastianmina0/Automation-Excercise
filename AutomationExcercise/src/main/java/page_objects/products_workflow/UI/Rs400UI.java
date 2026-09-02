package page_objects.products_workflow.UI;

import org.openqa.selenium.WebDriver;

public class Rs400UI {

    private WebDriver driver;

    public Rs400UI(WebDriver driver){

        this.driver = driver;
    }

    public WebDriver getDriver(){

        return driver;
    }

    public void setDriver(WebDriver driver){

        this.driver = driver;
    }

}
