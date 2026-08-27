package page_objects.signup_workflow.Services;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import page_objects.handler_classes.AdHandlerUtility;
import page_objects.signup_workflow.UI.AccountInformationUI;

public class AccountInformationServices {

    private final WebDriver driver;
    private final AccountInformationUI accountInformationUI;

    public AccountInformationServices(WebDriver driver){

        this.driver = driver;
        accountInformationUI = new AccountInformationUI(driver);
    }

    public void fillInformationDetails(String name, String password, String day, String month, String year){


        accountInformationUI.name().clear();
        accountInformationUI.name().sendKeys(name);

        //Setting password
        accountInformationUI.password().sendKeys(password);

        //Setting Date of Birth
        Select dayA = new Select(accountInformationUI.day());
        Select monthA = new Select(accountInformationUI.month());
        Select yearA = new Select(accountInformationUI.year());

        //Day
        dayA.selectByValue(day);

        //Month
        monthA.selectByValue(month);

        //Year
        yearA.selectByValue(year);
    }

    public void clickNewsLetter(){


        AdHandlerUtility.safeClick(driver, accountInformationUI.newsLetter());
    }

    public void clickSpecialOffers(){


        AdHandlerUtility.safeClick(driver, accountInformationUI.specialOffers());
    }

    public void fillAddressInformationDetails(String firstName, String lastName, String company, String address,
        String address2, String state, String city, String zipCode, String mobileNumber){


        accountInformationUI.firstName().sendKeys(firstName);
        accountInformationUI.lastName().sendKeys(lastName);
        accountInformationUI.company().sendKeys(company);
        accountInformationUI.address().sendKeys(address);
        accountInformationUI.address2().sendKeys(address2);

        Select country = new Select (accountInformationUI.country());
        country.selectByValue("Canada");

        accountInformationUI.state().sendKeys(state);
        accountInformationUI.city().sendKeys(city);
        accountInformationUI.zipCode().sendKeys(zipCode);
        accountInformationUI.mobileNumber().sendKeys(mobileNumber);
    }

    public void clickCreateAccount(){

        AdHandlerUtility.safeClick(driver, accountInformationUI.createAccount());
    }

}
