package util;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class elementHelper {
    AppiumDriver driver;
    WebDriverWait webDriverWait;
    Actions action;
    public elementHelper(AppiumDriver driver){
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.action = new Actions(driver);
    }
    public WebElement presenceElement(By key){
        return webDriverWait.until(ExpectedConditions.presenceOfElementLocated(key));
    }
    public WebElement findElement(By key){
        WebElement webElement = presenceElement(key);
        return webElement;
    }
    public void Click(By key){
        findElement(key).click();
    }
    public void sendKeys(By key, String text){
        findElement(key).sendKeys(text);
    }
    public void checkVisible(By key){
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(key));
    }
}