package page_objects.payment_workflow.Services;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import page_objects.payment_workflow.UI.PaymentUI;

public class PaymentServices {

    private final WebDriver driver;
    private final PaymentUI paymentUI;
    
    /**
     * Constructor
     * @param driver
     */
    public PaymentServices(WebDriver driver){

        this.driver = driver;
        this.paymentUI = new PaymentUI(driver);
    }

    /**
     * Enter name
     * @param name
     */
    public void enterPaymentName(String name){

        paymentUI.paymentName().sendKeys(name);
    }

    /**
     * Enter card number
     * @param cardNumber
     */
    public void enterPaymentCardNumber(String cardNumber){

        paymentUI.paymentCardNumber().sendKeys(cardNumber);
    }

    /**
     * Enter CVC
     * @param cvc
     */
    public void enterPaymentCVC(String cvc){

        paymentUI.paymentCVC().sendKeys(cvc);
    }

    /**
     * Enter expiration month
     * @param month
     */
    public void enterExpirationMonth(String month){

        paymentUI.paymentExpirationMonth().sendKeys(month);
    }

    /**
     * Enter expiration year
     * @param year
     */
    public void enterExpirationYear(String year){

        paymentUI.paymentExpirationYear().sendKeys(year);
    }

    /**
     * Click place order
     */
    public void clickConfirmOrder(){

        WebElement btnConfirm = paymentUI.confirmOrderButton();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnConfirm);
    }

}
