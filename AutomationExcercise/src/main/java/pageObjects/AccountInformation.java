package pageObjects;

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

    //Title checkbox
    public WebElement mrCheckbox(){

        return getDriver().findElement(By.cssSelector("#id_gender1"));
    }

    public WebElement mrsCheckbox(){

        return getDriver().findElement(By.cssSelector("#id_gender2"));
    }

    //Account Information text
    public WebElement accountInformationText(){

        return getDriver().findElement(By.xpath("//b[contains(text(),'Enter Account Information')]"));
    }

    //Account Information
    public WebElement name(){

        return getDriver().findElement(By.cssSelector("#name"));

    }

    public WebElement email(){

        return getDriver().findElement(By.cssSelector("#email"));
    }

    public WebElement password(){

        return getDriver().findElement(By.cssSelector("#password"));
    }

    //Date of birth
    public WebElement day(){

        return getDriver().findElement(By.cssSelector("#days"));
    }

    public WebElement month(){

        return getDriver().findElement(By.cssSelector("#months"));
    }

    public WebElement year(){

        return getDriver().findElement(By.cssSelector("#years"));
    }

    //Sign up for our newsletter checkbox
    public WebElement newsLetter(){

        return getDriver().findElement(By.cssSelector("#newsletter"));
    }

    //Special offers checkbox
    public WebElement specialOffers(){

        return getDriver().findElement(By.cssSelector("#optin"));
    }

    //Address Information

    //First name text box
    public WebElement firstName(){

        return getDriver().findElement(By.cssSelector("#first_name"));
    }

    //Last name text box
    public WebElement lastName(){

        return getDriver().findElement(By.cssSelector("#last_name"));
    }

    //Company text box
    public WebElement company(){

        return getDriver().findElement(By.cssSelector("#company"));
    }

    //Address and Address2 text box
    public WebElement address(){

        return getDriver().findElement(By.cssSelector("#address1"));
    }

    public WebElement address2(){

        return getDriver().findElement(By.cssSelector("#address2"));
    }

    //Country dropdown list
    public WebElement country(){

        return getDriver().findElement(By.cssSelector("#country"));
    }

    //State text box
    public WebElement state(){

        return getDriver().findElement(By.cssSelector("#state"));
    }

    //City text box
    public WebElement city(){

        return getDriver().findElement(By.cssSelector("#city"));
    }

    //Zipcode text box
    public WebElement zipCode(){

        return getDriver().findElement(By.cssSelector("#zipcode"));
    }

    //Mobile Number text box
    public WebElement mobileNumber(){

        return getDriver().findElement(By.cssSelector("#mobile_number"));
    }

    //Create Account button
    public WebElement createAccount(){

        return getDriver().findElement(By.cssSelector("button[data-qa='create-account']"));
    }

}
