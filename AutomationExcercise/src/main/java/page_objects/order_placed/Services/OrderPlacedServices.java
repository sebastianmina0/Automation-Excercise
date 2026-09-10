package page_objects.order_placed.Services;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import page_objects.order_placed.UI.OrderPlacedUI;

public class OrderPlacedServices {

    private final WebDriver driver;
    private final OrderPlacedUI orderPlacedUI;

    /**
     * Constructor
     * @param driver
     */
    public OrderPlacedServices(WebDriver driver){

        this.driver = driver;
        this.orderPlacedUI = new OrderPlacedUI(driver);
    }

    /**
     * Clicks delete account button
     */
    public void clickDeleteAccount(){

        WebElement btnDelete = orderPlacedUI.orderPlacedDeleteButton();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnDelete);
    }

    /**
     * Clicks delete account button
     */
    public void clickDownload(){

        WebElement btnDownload = orderPlacedUI.downloadButton();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnDownload);
    }

    /**
     * This class verifies if a file was downloaded
     * @param downloadPath
     * @param fileName
     * @param timeoutInSeconds
     * @return
     * @throws InterruptedException
     */
    public boolean waitForDownloadToComplete(String downloadPath, String fileName, int timeoutInSeconds) throws InterruptedException {
        File folder = new File(downloadPath);
        int waitTime = 0;
        
        while (waitTime < timeoutInSeconds) {
            File[] listOfFiles = folder.listFiles();
            if (listOfFiles != null) {
                for (File file : listOfFiles) {
                    // Verify that the file is not a temporary Chrome file (.crdownload)
                    if (file.getName().contains(fileName) && !file.getName().endsWith(".crdownload")) {
                        return true;
                    }
                }
            }
            Thread.sleep(1000); // Esperar 1 segundo antes de volver a intentar
            waitTime++;
        }
        return false;
    }


}
