package page_objects.cart_workflow.Services;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import page_objects.cart_workflow.UI.CartUI;
import page_objects.test_data.TestDataGenerator;

public class CartServices {

    private final WebDriver driver;
    private final CartUI cartUI;
    private By items;

    /**
     * Constructor
     * @param driver
     */
    public CartServices(WebDriver driver){

        this.driver = driver;
        cartUI = new CartUI(driver);
    }

    /**
     * Enters a new email in text field
     */
    public void cartEnterSubscriptionEmail(){

        cartUI.cartSubscription().sendKeys(TestDataGenerator.newEmail());
    }

    /**
     * Clicks arrow button
     */
    public void cartClickSubscriptionArrow(){

        WebElement btnSubscribe = cartUI.cartSubscriptionArrow();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnSubscribe);

    }

    /**
     * Verifies how many items are in cart and verifies
     * price, quantity and total per product
     */
    public void verifyProductsInCartAndInfo(){

        items = By.cssSelector("#cart_info_table > tbody > tr");
        List<WebElement> productsInCart = driver.findElements(items);

        System.out.println("Total Products: " + productsInCart.size());

        if(!productsInCart.isEmpty()){
            for(WebElement i: productsInCart){

                WebElement product = i.findElement(By.cssSelector(".cart_description a"));
                String productName = product.getText();

                //Verify product is in cart
                System.out.println("Product in cart " + productName);

                WebElement price = i.findElement(By.cssSelector(".cart_price p "));
                String priceText = price.getText();

                //Verify product price
                System.out.println("Product: "+ productName + " price: " + priceText);

                WebElement quantity = i.findElement(By.cssSelector(".cart_quantity button "));
                String quantityText = quantity.getText();

                //Verify product quantity
                System.out.println("Product: "+ productName + " quantity: " + quantityText);

                WebElement total = i.findElement(By.cssSelector(".cart_total p "));
                String totalText = total.getText();

                //Verify total price
                System.out.println("Product: "+ productName + " total price: " + totalText);
                System.out.println(" ");
            }
        } else {

            System.out.println("No products in cart");
        }
    }

}
