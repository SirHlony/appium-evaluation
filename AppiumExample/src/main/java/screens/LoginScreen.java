package screens;

import io.appium.java_client.android.AndroidDriver;
import io.github.ashwith.flutter.FlutterFinder;
import interfaces.ILoginScreen;

public class LoginScreen implements ILoginScreen {
    private final FlutterFinder finder;

    public LoginScreen(AndroidDriver driver) {
        finder = new FlutterFinder(driver);
    }

    public void fillUsernameField(String username) {
        finder.byValueKey("").sendKeys(username);
    }

    public void fillPasswordField(String password) {
        finder.byValueKey("").sendKeys(password);
    }

    public void tapOnLoginButton() {
        finder.byValueKey("").click();
    }
}