import interfaces.ILandingScreen;
import interfaces.ILoginScreen;
import interfaces.IPlayerHomeScreen;
import org.testng.annotations.Test;
import screens.LandingScreen;
import screens.PlayerHomeScreen;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginScreenTests extends BaseConfig {
    ILandingScreen landingScreen;
    ILoginScreen loginScreen;
    IPlayerHomeScreen playerHomeScreen;

    @Test
    public void testSuccessfulLogin() {
        landingScreen = new LandingScreen(driver);
        loginScreen = landingScreen.tapOnLoginButton();
        loginScreen.fillUsernameField("Nochopmoney");
        loginScreen.fillPasswordField("Nochopmoney10");
        loginScreen.tapOnLoginButton();

        playerHomeScreen = new PlayerHomeScreen(driver);
        assertTrue(playerHomeScreen.isDisplayed("Games"));
    }
}
