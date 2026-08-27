package page_objects.main_page.Services;

import org.openqa.selenium.WebDriver;

import page_objects.handler_classes.AdHandlerUtility;
import page_objects.main_page.UI.MainPageUI;

public class MainPageServices {

    private final WebDriver driver;
    private final MainPageUI mainPageUI;


    //Services

public MainPageServices(WebDriver driver) {
    
        this.driver = driver;
        this.mainPageUI = new MainPageUI(driver); 
    }
    
    public void clickSingUpButton(){

        AdHandlerUtility.safeClick(driver, mainPageUI.singUp());
    }

}
