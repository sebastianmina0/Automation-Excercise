import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import pageObjects.AccountCreated;
import pageObjects.AccountDeleted;
import pageObjects.AccountInformation;
import pageObjects.AdHandlerUtility;
import pageObjects.LoggedInPage;
import pageObjects.MainPage;
import pageObjects.SignUpLoginPage;

public class RegisterUser {

    private WebDriver driver;
    private ChromeOptions options;
    private MainPage mainPage;
    private SignUpLoginPage signUpLoginPage;
    private AccountInformation accountInformation;
    private AccountCreated accountCreated;
    private LoggedInPage loggedInPage;
    private AccountDeleted accountDeleted;
    private String url;

    //Account information variables
    private final String name = "prueba1";
    private final String email = "prueba@yahoo.com";
    private final String password = "s{fkfjasldsladksaldksadad";
    private final String day = "25";
    private final String month = "9";
    private final String year = "2000";

    //Address information variables
    private final String firstName = "Test1";
    private final String lastName = "Automation";
    private final String company = "AnyCompany";
    private final String address = "Calle 1 # 1 - 1";
    private final String address2 = "Calle 2 # 2 - 2";
    private final String state = "Bogota";
    private final String city = "Bogota";
    private final String zipCode = "1111111";
    private final String mobileNumber = "3334445566";
    

    @Before
    /**
     * 1) Launching browser and getting URL
     * 2) Navigate to url
     */
    public void setUp() {

        options = new AdHandlerUtility().hideChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        url = "https://automationexercise.com";

        mainPage = new MainPage();
        mainPage.setDriver(driver);
        mainPage.getDriver().get(url);

        signUpLoginPage = new SignUpLoginPage();
        signUpLoginPage.setDriver(driver);

        accountInformation = new AccountInformation();
        accountInformation.setDriver(driver);

        accountCreated = new AccountCreated();
        accountCreated.setDriver(driver);

        loggedInPage = new LoggedInPage();
        loggedInPage.setDriver(driver);

        accountDeleted = new AccountDeleted();
        accountDeleted.setDriver(driver);

    }

    /**
     * Register User test case
     */
    @Test
    public void registerUser() throws InterruptedException{

        AdHandlerUtility.hideAds(driver);
        //3) Verify that home page is visible successfully
        if(mainPage.testCasesCarousel().isDisplayed() == true){

            //4)Click on Signup/Login button
            AdHandlerUtility.safeClick(driver, mainPage.singUp());

        } else {
            driver.quit();
        }

        Thread.sleep(2000);
        AdHandlerUtility.hideAds(driver);

        //5)Verify 'New User Signup!' is visible
        if(signUpLoginPage.newUser().isDisplayed() == true){

            //6)Enter name and email address
            signUpLoginPage.nameBox().sendKeys(name);

            signUpLoginPage.emailBox().sendKeys(email);

            //7) Click 'Signup' button
            AdHandlerUtility.safeClick(driver, signUpLoginPage.signUpButton());
            
         }else{
            driver.quit();
        }

        AdHandlerUtility.hideAds(driver);
        //8) Verify that 'ENTER ACCOUNT INFORMATION' is visible
        if(accountInformation.accountInformationText().isDisplayed() == true){

            //9) Fill details: Title, Name, Email, Password, Date of birth
            //Email is not editable field in this form
            //Setting name
            accountInformation.name().clear();
            accountInformation.name().sendKeys(name);

            //Setting password
            accountInformation.password().sendKeys(password);

            //Setting Date of Birth
            Select dayA = new Select(accountInformation.day());
            Select monthA = new Select(accountInformation.month());
            Select yearA = new Select(accountInformation.year());

            //Day
            dayA.selectByValue(day);

            //Month
            monthA.selectByValue(month);

            //Year
            yearA.selectByValue(year);

         }else{
            driver.quit();
        }
        AdHandlerUtility.hideAds(driver);
        //10) Select checkbox 'Sign up for our newsletter!'
        AdHandlerUtility.safeClick(driver, accountInformation.newsLetter());

        //11) Select checkbox 'Receive special offers from our partners!'
        AdHandlerUtility.safeClick(driver, accountInformation.specialOffers());

        //12) Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        accountInformation.firstName().sendKeys(firstName);
        accountInformation.lastName().sendKeys(lastName);
        accountInformation.company().sendKeys(company);
        accountInformation.address().sendKeys(address);
        accountInformation.address2().sendKeys(address2);

        Select country = new Select (accountInformation.country());
        country.selectByValue("Canada");

        accountInformation.state().sendKeys(state);
        accountInformation.city().sendKeys(city);
        accountInformation.zipCode().sendKeys(zipCode);
        accountInformation.mobileNumber().sendKeys(mobileNumber);

        //13) Click 'Create Account button'
        AdHandlerUtility.safeClick(driver, accountInformation.createAccount());

        //14) Verify that 'ACCOUNT CREATED!' is visible
        if(accountCreated.accountCreated().isDisplayed() == true){

            //15) Click 'Continue' button
            AdHandlerUtility.hideAds(driver);
            WebElement btnContinue = accountCreated.continueButton();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", btnContinue);
           
        } else {
            driver.quit();
        }

        AdHandlerUtility.hideAds(driver);
        //16) Verify that 'Logged in as username' is visible
        if(loggedInPage.loggedInAsUser().isDisplayed() == true){

            //17) Click 'Delete Account' button
            AdHandlerUtility.hideAds(driver);
            WebElement btnDelete = loggedInPage.deleteAccount();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", btnDelete);
        } else {
            driver.quit();
        }

        //18) Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        AdHandlerUtility.hideAds(driver);
        if(accountDeleted.accountDeletedText().isDisplayed() == true){

            //Click continue button
            AdHandlerUtility.hideAds(driver);
            WebElement btnContinue = accountDeleted.continueButton();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", btnContinue);    
        }
        driver.quit();      
    }
    
}
