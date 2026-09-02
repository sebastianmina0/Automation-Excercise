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

    /**
     * Click contact us button
     */
    public void clickContactUsButton(){

        AdHandlerUtility.safeClick(driver, mainPageUI.contactUs());
    }

    /**
     * Click test cases button
     */
    public void clickTestCasesButton(){

        WebElement btnTestCases = mainPageUI.testCases();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnTestCases);
    }

    /**
     * Click products button
     */
    public void clickProductsButton(){

        WebElement btnProducts = mainPageUI.productsButton();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnProducts);

    }

    /**
     * Enter email in text field
     */
    public void enterSubscriptionEmail(){

        mainPageUI.subscription().sendKeys(TestDataGenerator.newEmail());
    }

    /**
     * Click arrow button
     */
    public void clickSubscriptionArrow(){

        WebElement btnSubscribe = mainPageUI.subscriptionArrow();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnSubscribe);

    }

    /**
     * Click cart button
     */
    public void clickCartbutton(){

        WebElement btnCart = mainPageUI.cartButton();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnCart);

    }

    /**
     * Click view product of Rs500
     */
    public void clickRs500ViewProduct(){

        WebElement btnView = mainPageUI.mainRs500ViewProduct();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnView);

    }

}
