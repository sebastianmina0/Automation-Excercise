package page_objects.cart_workflow.Services;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import page_objects.cart_workflow.UI.CartUI;
import page_objects.test_data.TestDataGenerator;

public class CartServices {

    private final WebDriver driver;
    private final CartUI cartUI;

    public CartServices(WebDriver driver){

        this.driver = driver;
        cartUI = new CartUI(driver);
    }

    public void cartEnterSubscriptionEmail(){

        cartUI.cartSubscription().sendKeys(TestDataGenerator.newEmail());
    }

    public void cartClickSubscriptionArrow(){

        WebElement btnSubscribe = cartUI.cartSubscriptionArrow();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnSubscribe);

    }

}
