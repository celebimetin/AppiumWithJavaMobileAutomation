package util;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class driverFactory {
    private static AppiumDriver driver;
    private static Properties properties;
    private static DesiredCapabilities capabilities;
    public static AppiumDriver initialize_Driver(String browser){
        properties = configReader.getProperties();
        capabilities = new DesiredCapabilities();
        if (browser.equals("Android")){
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("udid", "");
            capabilities.setCapability("appPackage", "");
            capabilities.setCapability("appActivity","");
        }
        else if (browser.equals("IOS")) {
            capabilities.setCapability("platformName", "IOS");
            capabilities.setCapability("udid", "");
            capabilities.setCapability("appPackage", "");
            capabilities.setCapability("appActivity","");
        }

        try {
            driver = new AppiumDriver(new URL("https://0.0.0.0:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        int impWait = Integer.parseInt(properties.getProperty("impWait"));
        driver.manage().timeouts().implicitlyWait(impWait, TimeUnit.SECONDS);

        return getDriver();
    }
    public static AppiumDriver getDriver(){
        return driver;
    }
}