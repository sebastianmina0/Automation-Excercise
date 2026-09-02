package page_objects.products_workflow.Services;

import org.openqa.selenium.WebDriver;

import page_objects.products_workflow.UI.Rs500UI;

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


}
