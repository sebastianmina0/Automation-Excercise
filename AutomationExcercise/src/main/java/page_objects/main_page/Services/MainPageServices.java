package page_objects.main_page.Services;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import page_objects.handler_classes.AdHandlerUtility;
import page_objects.main_page.UI.MainPageUI;
import page_objects.test_data.TestDataGenerator;

public class MainPageServices {

    private final WebDriver driver;
    private final MainPageUI mainPageUI;

    /**
     * Constructor
     * @param driver
     */
    public MainPageServices(WebDriver driver) {
    
        this.driver = driver;
        this.mainPageUI = new MainPageUI(driver); 
    }
    
    /**
     * Method that clicks SignUp/Login button in Main Page
     */
    public void clickSingUpButton(){

        AdHandlerUtility.safeClick(driver, mainPageUI.singUp());
    }

    public void clickContactUsButton(){

        AdHandlerUtility.safeClick(driver, mainPageUI.contactUs());
    }

    public void clickTestCasesButton(){

        WebElement btnTestCases = mainPageUI.testCases();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnTestCases);
    }

    public void clickProductsButton(){

        WebElement btnProducts = mainPageUI.productsButton();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnProducts);

    }

    public void enterSubscriptionEmail(){

        mainPageUI.subscription().sendKeys(TestDataGenerator.newEmail());
    }

    public void clickSubscriptionArrow(){

        WebElement btnSubscribe = mainPageUI.subscriptionArrow();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnSubscribe);

    }

}
