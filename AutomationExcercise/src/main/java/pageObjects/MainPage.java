package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    //Main Page URL: https://automationexercise.com
    //Header Elements

    //Home Button
    public WebElement homeButton(){

        return getDriver().findElement(By.cssSelector("header[id='header'] li:nth-child(1) a:nth-child(1)"));

    }

    //Products Button
    public WebElement productsButton(){

        return getDriver().findElement(By.cssSelector("a[href='/products']"));
    }

    //SingUp/Login
    public WebElement singUp(){

        return getDriver().findElement(By.cssSelector("a[href='/login']"));
    }

    //TestCases button
    public WebElement testCases(){

        return getDriver().findElement(By.cssSelector("header[id='header'] li:nth-child(5) a:nth-child(1)"));
    }

    //API Testing button
    public WebElement apiTesting(){

        return getDriver().findElement(By.cssSelector("header[id='header'] li:nth-child(6) a:nth-child(1)"));
    }

    //Video Tutorials button
    public WebElement videoTutorials(){

        return getDriver().findElement(By.cssSelector("a[href='https://www.youtube.com/c/AutomationExercise']"));
    }

    //Contact Us button
    public WebElement contactUs(){
        return getDriver().findElement(By.cssSelector("a[href='/contact_us']"));
    }

    //Carousel Elements

    //Right Arrow
    public WebElement rightArrow(){

        return getDriver().findElement(By.cssSelector("a[class='right control-carousel hidden-xs'] i[class='fa fa-angle-right']"));

    }

    //Left arrow
    public WebElement leftArrow(){

        return getDriver().findElement(By.cssSelector("a[class='left control-carousel hidden-xs'] i[class='fa fa-angle-left']"));

    }

    //Data Target 1
    public WebElement firstDataTarget(){

        return getDriver().findElement(By.cssSelector("section[id='slider'] li:nth-child(1)"));
    }

    //Data Target 2
    public WebElement secondDataTarget(){

        return getDriver().findElement(By.cssSelector("section[id='slider'] li:nth-child(2)"));
    }

    //Data Target 3
    public WebElement thirdDataTarget(){

        return getDriver().findElement(By.cssSelector("section[id='slider'] li:nth-child(3)"));
    }

    //Test Cases carousel button
    public WebElement testCasesCarousel(){

        return getDriver().findElement(By.cssSelector("div[class='item active'] a[class='test_cases_list'] button[type='button']"));

    }

    //API Testing carousel button
    public WebElement apiTestingCarousel(){

        return getDriver().findElement(By.cssSelector("div[class='item active'] a[class='apis_list'] button[type='button']"));

    }


   

}
