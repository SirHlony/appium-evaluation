package screens;

import io.appium.java_client.AppiumDriver;
import interfaces.IPlayerHomeScreen;
import io.github.ashwith.flutter.FlutterFinder;

public class PlayerHomeScreen implements IPlayerHomeScreen {
    private final FlutterFinder finder;

    public PlayerHomeScreen(AppiumDriver driver) {
        finder = new FlutterFinder(driver);
    }

    public boolean isDisplayed(String elementText) {
        return finder.byValueKey("").isDisplayed();
    }
}
