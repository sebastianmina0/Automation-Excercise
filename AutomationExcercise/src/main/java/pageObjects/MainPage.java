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

    //Category box

    //Women button and + button
    public WebElement womenButton(){

        return getDriver().findElement(By.cssSelector("body > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > h4:nth-child(1) > a:nth-child(1)"));
    }

    public WebElement womenPlusButton(){

        return getDriver().findElement(By.cssSelector("body > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > h4:nth-child(1) > a:nth-child(1) > span:nth-child(1) > i:nth-child(1)"));
    }

    //Men button and + button
    public WebElement menButton(){

        return getDriver().findElement(By.cssSelector("body > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > h4:nth-child(1) > a:nth-child(1)"));
    }

    public WebElement menPlusButton(){

        return getDriver().findElement(By.cssSelector("body > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > h4:nth-child(1) > a:nth-child(1) > span:nth-child(1) > i:nth-child(1)"));
    }

    //Kids button and + button
    public WebElement kidsButton(){

        return getDriver().findElement(By.cssSelector("body > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > h4:nth-child(1) > a:nth-child(1)"));
    }

    public WebElement kidsPlusButton(){

        return getDriver().findElement(By.cssSelector("body > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > h4:nth-child(1) > a:nth-child(1) > span:nth-child(1) > i:nth-child(1)"));
    }

    //Brands Box

    //Polo Button
    public WebElement poloButton(){

        return getDriver().findElement(By.cssSelector("a[href='/brand_products/Polo']"));
    }

    //H&M Button
    public WebElement hmButton(){

        return getDriver().findElement(By.cssSelector("a[href='/brand_products/H&M']"));
    }

    //Madame Button
    public WebElement madameButton(){

        return getDriver().findElement(By.cssSelector("a[href='/brand_products/Madame']"));
    }

    //Mast & Harbour Button
    public WebElement mastharbourButton(){

        return getDriver().findElement(By.cssSelector("a[href='/brand_products/Mast & Harbour']"));
    }

    //BabyHug Button
    public WebElement babyHugButton(){

        return getDriver().findElement(By.cssSelector("a[href='/brand_products/Babyhug']"));
    }

    //Allen Solly Junior Button
    public WebElement allenSollyButton(){

        return getDriver().findElement(By.cssSelector("a[href='/brand_products/Allen Solly Junior']"));
    }

    //Kookie Kids Button
    public WebElement kookieKidsButton(){

        return getDriver().findElement(By.cssSelector("a[href='/brand_products/Kookie Kids']"));
    }

    //Biba Button
    public WebElement bibaButton(){

        return getDriver().findElement(By.cssSelector("a[href='/brand_products/Biba']"));
    }

    //Features Items Frame
    public WebElement featureItems(){

        return getDriver().findElement(By.cssSelector(".features_items"));
    }

    //Recommended Items Carousel
    public WebElement recommendItems(){

        return getDriver().findElement(By.cssSelector(".recommended_items"));
    }

    //Recommended Items Right Arrow
    public WebElement recommendItemsRightArrow(){

        return getDriver().findElement(By.cssSelector("a[class='right recommended-item-control'] i[class='fa fa-angle-right']"));
    }

    //Recommended Items Left Arrow
    public WebElement recommendItemsLeftArrow(){

        return getDriver().findElement(By.cssSelector("a[class='left recommended-item-control'] i[class='fa fa-angle-left']"));
    }

    //ScrollUp arrow
    public WebElement scrollUp(){

        return getDriver().findElement(By.cssSelector(".fa.fa-angle-up"));
    }

    //Subscription textbox and right arrow
   public WebElement subscription(){

        return getDriver().findElement(By.cssSelector("#susbscribe_email"));
    }

    public WebElement subscriptionArrow(){

        return getDriver().findElement(By.cssSelector("#subscribe"));
    }
   

}
