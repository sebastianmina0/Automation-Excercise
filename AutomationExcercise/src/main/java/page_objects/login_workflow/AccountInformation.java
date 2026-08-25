package page_objects.login_workflow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountInformation {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Method that returns checkbox element
     * @return Checkbox
     */
    public WebElement mrCheckbox(){

        return getDriver().findElement(By.cssSelector("#id_gender1"));
    }

    /**
     * Method that returns checkbox element
     * @return Checkbox
     */
    public WebElement mrsCheckbox(){

        return getDriver().findElement(By.cssSelector("#id_gender2"));
    }

    /**
     * Method that returns Enter Account Information element
     * @return WebElement
     */
    public WebElement accountInformationText(){

        return getDriver().findElement(By.xpath("//b[contains(text(),'Enter Account Information')]"));
    }

    /**
     * Method that returns text box element
     * @return Textbox
     */
    public WebElement name(){

        return getDriver().findElement(By.cssSelector("#name"));

    }

    /**
     * Method that returns text box element
     * @return Textbox
     */
    public WebElement email(){

        return getDriver().findElement(By.cssSelector("#email"));
    }

    /**
     * Method that returns text box element
     * @return Textbox
     */
    public WebElement password(){

        return getDriver().findElement(By.cssSelector("#password"));
    }

    /**
     * Method that returns dropdown
     * @return Dropdown
     */
    public WebElement day(){

        return getDriver().findElement(By.cssSelector("#days"));
    }

    /**
     * Method that returns dropdown
     * @return Dropdown
     */
    public WebElement month(){

        return getDriver().findElement(By.cssSelector("#months"));
    }

    /**
     * Method that returns dropdown
     * @return Dropdown
     */
    public WebElement year(){

        return getDriver().findElement(By.cssSelector("#years"));
    }

    /**
     * Method that returns checkbox element
     * @return Checkbox
     */
    public WebElement newsLetter(){

        return getDriver().findElement(By.cssSelector("#newsletter"));
    }

    /**
     * Method that returns checkbox element
     * @return Checkbox
     */
    public WebElement specialOffers(){

        return getDriver().findElement(By.cssSelector("#optin"));
    }

    //Address Information

    /**
     * Method that returns text box element
     * @return Textbox
     */
    public WebElement firstName(){

        return getDriver().findElement(By.cssSelector("#first_name"));
    }

    /**
     * Method that returns text box element
     * @return Textbox
     */
    public WebElement lastName(){

        return getDriver().findElement(By.cssSelector("#last_name"));
    }

    /**
     * Method that returns text box element
     * @return Textbox
     */
    public WebElement company(){

        return getDriver().findElement(By.cssSelector("#company"));
    }

    /**
     * Method that returns text box element
     * @return Textbox
     */
    public WebElement address(){

        return getDriver().findElement(By.cssSelector("#address1"));
    }

    /**
     * Method that returns text box element
     * @return Textbox
     */
    public WebElement address2(){

        return getDriver().findElement(By.cssSelector("#address2"));
    }

    /**
     * Method that returns dropdown element
     * @return Dropdown
     */
    public WebElement country(){

        return getDriver().findElement(By.cssSelector("#country"));
    }

    /**
     * Method that returns text box element
     * @return Textbox
     */
    public WebElement state(){

        return getDriver().findElement(By.cssSelector("#state"));
    }

    /**
     * Method that returns text box element
     * @return Textbox
     */
    public WebElement city(){

        return getDriver().findElement(By.cssSelector("#city"));
    }

    /**
     * Method that returns text box element
     * @return Textbox
     */
    public WebElement zipCode(){

        return getDriver().findElement(By.cssSelector("#zipcode"));
    }

    /**
     * Method that returns text box element
     * @return Textbox
     */
    public WebElement mobileNumber(){

        return getDriver().findElement(By.cssSelector("#mobile_number"));
    }

    /**
     * Method that returns a button elemetn
     * @return Button
     */
    public WebElement createAccount(){

        return getDriver().findElement(By.cssSelector("button[data-qa='create-account']"));
    }

}
