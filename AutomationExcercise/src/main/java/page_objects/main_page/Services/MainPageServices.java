package page_objects.main_page.Services;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import page_objects.handler_classes.AdHandlerUtility;
import page_objects.main_page.UI.MainPageUI;
import page_objects.test_data.TestDataGenerator;

public class MainPageServices {

    private final WebDriver driver;
    private final MainPageUI mainPageUI;
    private Actions actions;

    /**
     * Constructor
     * @param driver
     */
    public MainPageServices(WebDriver driver) {
    
        this.driver = driver;
        this.mainPageUI = new MainPageUI(driver); 
        this.actions = new Actions(driver);
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

    /**
     * Hoverover overlay Rs500
     */
    public void hoverOverRs500(){

        actions.moveToElement(mainPageUI.mainHoverOverRs500()).perform();

    }

    /**
     * Clicks Add cart button
     */
    public void clickAddCartRs500(){

        mainPageUI.mainAddCartRs500().click();
    }

    /**
     * Clicks Continue Shopping button
     */
    public void clickContinueShopping(){

        mainPageUI.mainContinueShopping().click();
    }

    /**
     * Hoverover overlay Rs400
     */
    public void hoverOverRs400(){

        actions.moveToElement(mainPageUI.mainHoverOverRs400()).perform();
    }

    /**
     * Clicks Add cart button
     */
    public void clickAddCartRs400(){

        mainPageUI.mainAddCartRs400().click();
    }

    /**
     * Clicks View cart link
     */
    public void clickViewCart(){

        mainPageUI.mainViewCart().click();
    }

}
