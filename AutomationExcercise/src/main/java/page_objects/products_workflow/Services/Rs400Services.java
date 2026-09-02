package page_objects.products_workflow.Services;

import org.openqa.selenium.WebDriver;

import page_objects.products_workflow.UI.Rs400UI;

public class Rs400Services {

    private final WebDriver driver;
    private final Rs400UI rs400UI;


    public Rs400Services(WebDriver driver){

        this.driver = driver;
        rs400UI = new Rs400UI(driver);
    }

}
