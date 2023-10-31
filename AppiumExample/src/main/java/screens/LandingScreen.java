package screens;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.github.ashwith.flutter.FlutterFinder;
import interfaces.ILandingScreen;

public class LandingScreen implements ILandingScreen {
    private final FlutterFinder finder;
    private final AndroidDriver driver;

    public LandingScreen(AndroidDriver driver) {
        this.driver = driver;
        finder = new FlutterFinder(driver);
    }

    public LoginScreen tapOnLoginButton() {
        driver.findElement(AppiumBy.accessibilityId("Login")).click();
        return new LoginScreen(driver);
    }

    public void tapOnRegisterButton() {
        finder.byValueKey("").click();
    }

    public void tapOnResetPasswordButton() {
        finder.byValueKey("").click();
    }
}