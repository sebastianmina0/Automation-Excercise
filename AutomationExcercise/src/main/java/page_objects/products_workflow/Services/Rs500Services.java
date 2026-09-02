package page_objects.products_workflow.Services;

import org.openqa.selenium.WebDriver;

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


}
