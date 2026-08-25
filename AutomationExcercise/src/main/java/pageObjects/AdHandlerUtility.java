package pageObjects;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Class created to handle all Google Ads and Chrome options
 * AdHandlerUtility
 */
public class AdHandlerUtility {

    /**
     * This method hide all iframes in the webpage
     * @param driver
     */
    public static void hideAds(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "document.querySelectorAll('iframe, ins.adsbygoogle').forEach(el => el.style.display = 'none');";
        try {
            js.executeScript(script);
        } catch (Exception e) {
            System.out.println("Cannot hid adds by JS");
        }
    }

    /**
     * This method is a safe click, that uses closeAdIframe private class
     * to close all the adds
     * @param driver
     * @param element
     */
    public static void safeClick(WebDriver driver, WebElement element) {
        try {
            element.click();
        } catch (ElementClickInterceptedException e) {
            System.out.println("Trying close add");
            closeAdIframe(driver);
            element.click();
        }
    }

    /**
     * This method returns all the options that we need to configure
     * in our driver. In this case, we're hidding all the preferences
     * to save addresses and passwords
     * @return options
     */
    public ChromeOptions hideChromeOptions(){

        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("autofill.profile_enabled", false); // Disable save addresses
        prefs.put("credentials_enable_service", false); // Disable save passwords
        prefs.put("profile.password_manager_enabled", false);
        
        options.setExperimentalOption("prefs", prefs);
        
        options.addArguments("--disable-notifications"); //Hide notifications bar
        
        return options;
    }

    /**
     * This private method close all the iframes that webpage has, accessing to them
     * and clicking the close button
     * @param driver
     */
    private static void closeAdIframe(WebDriver driver) {
        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
        
        for (WebElement iframe : iframes) {
            try {
                driver.switchTo().frame(iframe);
                // Look for usual close buttons
                List<WebElement> closeButtons = driver.findElements(By.xpath("//*[contains(translate(text(), 'CLOSE', 'close'), 'close') or @id='dismiss-button']"));
                
                if (!closeButtons.isEmpty() && closeButtons.get(0).isDisplayed()) {
                    closeButtons.get(0).click();
                    driver.switchTo().defaultContent();
                    return; // Salir del ciclo si se logró cerrar
                }
            } catch (Exception ex) {
                
            } finally {
                driver.switchTo().defaultContent();
            }
        }
    }

}