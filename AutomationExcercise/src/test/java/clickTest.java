import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.LoginPage;

public class clickTest {

    private WebDriver driver;
    private LoginPage loginPage;

    @Before
    public void setUp() throws InterruptedException {

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url = "https://automationexercise.com";

        loginPage = new LoginPage();
        loginPage.setDriver(driver);
        loginPage.getDriver().get(url);
    }

    @Test
    public void clickLogin() throws InterruptedException{

        Thread.sleep(2000);
        loginPage.singUp().click();
    }

    
}
