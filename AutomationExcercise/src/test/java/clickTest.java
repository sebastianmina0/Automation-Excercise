import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.MainPage;

public class clickTest {

    private WebDriver driver;
    private MainPage mainPage;

    @Before
    /**
     * Setting up the browser and web page
     * @throws InterruptedException
     */
    public void setUp() throws InterruptedException {

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url = "https://automationexercise.com";

        mainPage = new MainPage();
        mainPage.setDriver(driver);
        mainPage.getDriver().get(url);
    }

    /**
     * Pending Create test cases
     */
    @Test
    public void firstTest(){

    }
    
}
