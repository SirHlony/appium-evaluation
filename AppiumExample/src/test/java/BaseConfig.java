import io.appium.java_client.AppiumClientConfig;
import io.appium.java_client.android.AndroidDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.URI;
import java.time.Duration;

public class BaseConfig {
    AndroidDriver driver;
    private final Logger logger = LogManager.getLogger();

    @BeforeTest
    public void setUp() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("appium:automationName", "UiAutomator2");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);
        desiredCapabilities.setCapability("AndroidMobileCapabilityType.APP_PACKAGE", "com.rank.grosvenor_demo.dev");

        try {
            AppiumClientConfig appiumClientConfig = AppiumClientConfig.defaultConfig()
                    .directConnect(true)
                    .baseUri(URI.create("http://127.0.0.1:8184/"))
                    .readTimeout(Duration.ofMinutes(1));
            driver = new AndroidDriver(appiumClientConfig, desiredCapabilities);
        } catch (Exception e) {
            logger.error(e.getMessage());
            logger.trace(e.getStackTrace());
        }
    }

    @AfterTest
    public void cleanUp() {
        try {
            driver.close();
            driver.quit();
        } catch (Exception e) {
            logger.error(e.getMessage());
            logger.trace(e.getStackTrace());
        }
    }
}
