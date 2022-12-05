package util;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.Reporter;

import java.util.Properties;

public class hooks {
    AppiumDriver driver;
    Properties properties;

    @Before
    public void Before(){
        String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
        properties = configReader.initialize_Properties();
        driver =driverFactory.initialize_Driver(browser);
    }
    @After
    public void After(){
        driver.quit();
    }
}