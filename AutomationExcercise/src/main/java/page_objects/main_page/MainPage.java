package page_objects.main_page;

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

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement homeButton(){

        return getDriver().findElement(By.cssSelector("header[id='header'] li:nth-child(1) a:nth-child(1)"));
    }

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement productsButton(){

        return getDriver().findElement(By.cssSelector("a[href='/products']"));
    }

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement singUp(){

        return getDriver().findElement(By.cssSelector("a[href='/login']"));
    }

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement testCases(){

        return getDriver().findElement(By.cssSelector("header[id='header'] li:nth-child(5) a:nth-child(1)"));
    }

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement apiTesting(){

        return getDriver().findElement(By.cssSelector("header[id='header'] li:nth-child(6) a:nth-child(1)"));
    }

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement videoTutorials(){

        return getDriver().findElement(By.cssSelector("a[href='https://www.youtube.com/c/AutomationExercise']"));
    }

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement contactUs(){
        return getDriver().findElement(By.cssSelector("a[href='/contact_us']"));
    }

    //Carousel Elements

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement rightArrow(){

        return getDriver().findElement(By.cssSelector("a[class='right control-carousel hidden-xs'] i[class='fa fa-angle-right']"));
    }

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement leftArrow(){

        return getDriver().findElement(By.cssSelector("a[class='left control-carousel hidden-xs'] i[class='fa fa-angle-left']"));

    }

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement firstDataTarget(){

        return getDriver().findElement(By.cssSelector("section[id='slider'] li:nth-child(1)"));
    }

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement secondDataTarget(){

        return getDriver().findElement(By.cssSelector("section[id='slider'] li:nth-child(2)"));
    }

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement thirdDataTarget(){

        return getDriver().findElement(By.cssSelector("section[id='slider'] li:nth-child(3)"));
    }

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement testCasesCarousel(){

        return getDriver().findElement(By.cssSelector("div[class='item active'] a[class='test_cases_list'] button[type='button']"));
    }

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement apiTestingCarousel(){

        return getDriver().findElement(By.cssSelector("div[class='item active'] a[class='apis_list'] button[type='button']"));
    }

    //Category box

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement womenButton(){

        return getDriver().findElement(By.cssSelector("body > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > h4:nth-child(1) > a:nth-child(1)"));
    }

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement womenPlusButton(){

        return getDriver().findElement(By.cssSelector("body > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > h4:nth-child(1) > a:nth-child(1) > span:nth-child(1) > i:nth-child(1)"));
    }

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement menButton(){

        return getDriver().findElement(By.cssSelector("body > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > h4:nth-child(1) > a:nth-child(1)"));
    }

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement menPlusButton(){

        return getDriver().findElement(By.cssSelector("body > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > h4:nth-child(1) > a:nth-child(1) > span:nth-child(1) > i:nth-child(1)"));
    }

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement kidsButton(){

        return getDriver().findElement(By.cssSelector("body > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > h4:nth-child(1) > a:nth-child(1)"));
    }

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement kidsPlusButton(){

        return getDriver().findElement(By.cssSelector("body > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > h4:nth-child(1) > a:nth-child(1) > span:nth-child(1) > i:nth-child(1)"));
    }

    //Brands Box

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement poloButton(){

        return getDriver().findElement(By.cssSelector("a[href='/brand_products/Polo']"));
    }

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement hmButton(){

        return getDriver().findElement(By.cssSelector("a[href='/brand_products/H&M']"));
    }

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement madameButton(){

        return getDriver().findElement(By.cssSelector("a[href='/brand_products/Madame']"));
    }

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement mastharbourButton(){

        return getDriver().findElement(By.cssSelector("a[href='/brand_products/Mast & Harbour']"));
    }

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement babyHugButton(){

        return getDriver().findElement(By.cssSelector("a[href='/brand_products/Babyhug']"));
    }

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement allenSollyButton(){

        return getDriver().findElement(By.cssSelector("a[href='/brand_products/Allen Solly Junior']"));
    }

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement kookieKidsButton(){

        return getDriver().findElement(By.cssSelector("a[href='/brand_products/Kookie Kids']"));
    }

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement bibaButton(){

        return getDriver().findElement(By.cssSelector("a[href='/brand_products/Biba']"));
    }

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement featureItems(){

        return getDriver().findElement(By.cssSelector(".features_items"));
    }

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement recommendItems(){

        return getDriver().findElement(By.cssSelector(".recommended_items"));
    }

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement recommendItemsRightArrow(){

        return getDriver().findElement(By.cssSelector("a[class='right recommended-item-control'] i[class='fa fa-angle-right']"));
    }

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement recommendItemsLeftArrow(){

        return getDriver().findElement(By.cssSelector("a[class='left recommended-item-control'] i[class='fa fa-angle-left']"));
    }

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement scrollUp(){

        return getDriver().findElement(By.cssSelector(".fa.fa-angle-up"));
    }

    /**
     * Method that returns a text box element
     * @return Textbox
     */
    public WebElement subscription(){

        return getDriver().findElement(By.cssSelector("#susbscribe_email"));
    }

    /**
     * Method that returns a button element
     * @return Button
     */
    public WebElement subscriptionArrow(){

        return getDriver().findElement(By.cssSelector("#subscribe"));
    }
}
