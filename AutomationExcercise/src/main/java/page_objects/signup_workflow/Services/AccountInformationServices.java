package page_objects.signup_workflow.Services;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import page_objects.handler_classes.AdHandlerUtility;
import page_objects.signup_workflow.UI.AccountInformationUI;

public class AccountInformationServices {

    private final WebDriver driver;
    private final AccountInformationUI accountInformationUI;

    /**
     * Constructor
     * @param driver
     */
    public AccountInformationServices(WebDriver driver){

        this.driver = driver;
        accountInformationUI = new AccountInformationUI(driver);
    }

    /**
     * Method that fills the information in the form
     * @param name
     * @param password
     * @param day
     * @param month
     * @param year
     */
    public void fillInformationDetails(String password, String day, String month, String year){

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

    /**
     * Method that clicks news letter button
     */
    public void clickNewsLetter(){


        AdHandlerUtility.safeClick(driver, accountInformationUI.newsLetter());
    }

    /**
     * Method that clicks Special Offers button
     */
    public void clickSpecialOffers(){


        AdHandlerUtility.safeClick(driver, accountInformationUI.specialOffers());
    }

    /**
     * Method that fills the information in the form
     * @param firstName
     * @param lastName
     * @param company
     * @param address
     * @param address2
     * @param country
     * @param state
     * @param city
     * @param zipCode
     * @param mobileNumber
     */
    public void fillAddressInformationDetails(String firstName, String lastName, String company, String address,
        String address2, String country, String state, String city, String zipCode, String mobileNumber){


        accountInformationUI.firstName().sendKeys(firstName);
        accountInformationUI.lastName().sendKeys(lastName);
        accountInformationUI.company().sendKeys(company);
        accountInformationUI.address().sendKeys(address);
        accountInformationUI.address2().sendKeys(address2);

        Select selectCountry = new Select (accountInformationUI.country());
        selectCountry.selectByValue(country);

        accountInformationUI.state().sendKeys(state);
        accountInformationUI.city().sendKeys(city);
        accountInformationUI.zipCode().sendKeys(zipCode);
        accountInformationUI.mobileNumber().sendKeys(mobileNumber);
    }

    /**
     * Method that clicks create account button
     */
    public void clickCreateAccount(){

        AdHandlerUtility.safeClick(driver, accountInformationUI.createAccount());
    }

}
