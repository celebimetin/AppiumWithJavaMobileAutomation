package util;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class elementHelper {
    static AppiumDriver driver;
    static WebDriverWait webDriverWait;
    static Actions action;
    public elementHelper(AppiumDriver driver){
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.action = new Actions(driver);
    }
}