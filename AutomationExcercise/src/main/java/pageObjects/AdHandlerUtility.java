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

public class AdHandlerUtility {

    // Enfoque preventivo: Ocultar contenedores de anuncios
    public static void hideAds(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "document.querySelectorAll('iframe, ins.adsbygoogle').forEach(el => el.style.display = 'none');";
        try {
            js.executeScript(script);
        } catch (Exception e) {
            System.out.println("No se pudieron ocultar los anuncios por JS.");
        }
    }

    // Enfoque reactivo: Clic seguro
    public static void safeClick(WebDriver driver, WebElement element) {
        try {
            element.click();
        } catch (ElementClickInterceptedException e) {
            System.out.println("Clic interceptado por un anuncio. Intentando cerrarlo...");
            closeAdIframe(driver);
            element.click(); // Reintento de la acción principal
        }
    }

    public ChromeOptions hideChromeOptions(){

        ChromeOptions options = new ChromeOptions();
        // Configurar preferencias para desactivar guardado de direcciones y contraseñas
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("autofill.profile_enabled", false); // Desactiva guardar direcciones
        prefs.put("credentials_enable_service", false); // Desactiva guardar contraseñas
        prefs.put("profile.password_manager_enabled", false);
        
        options.setExperimentalOption("prefs", prefs);
        
        // Opcional: Ocultar barras de herramientas y notificaciones extra
        options.addArguments("--disable-notifications");
        
        // Inicializar el driver con las opciones configuradas
        return options;
    }

    private static void closeAdIframe(WebDriver driver) {
        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
        
        for (WebElement iframe : iframes) {
            try {
                driver.switchTo().frame(iframe);
                // Buscar posibles botones de cierre basados en la estructura típica de Google Ads
                List<WebElement> closeButtons = driver.findElements(By.xpath("//*[contains(translate(text(), 'CLOSE', 'close'), 'close') or @id='dismiss-button']"));
                
                if (!closeButtons.isEmpty() && closeButtons.get(0).isDisplayed()) {
                    closeButtons.get(0).click();
                    driver.switchTo().defaultContent();
                    return; // Salir del ciclo si se logró cerrar
                }
            } catch (Exception ex) {
                // Si el iFrame no contiene el anuncio, ignorar y seguir iterando
            } finally {
                driver.switchTo().defaultContent(); // Siempre volver al contexto principal
            }
        }
    }

}