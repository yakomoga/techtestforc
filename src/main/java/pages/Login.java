package pages;

import general.GeneralSteps;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;

public class Login {
    public static String loginForm = "//div[@class='form-card']";
    private static String loginURL = "https://grup5web.firebaseapp.com/login/login.html";
    private static String loginSuccessfulURL = "https://grup5web.firebaseapp.com/map/map.html";
    private static String loginUsername = "//input[@id='username']";
    private static String loginPassword = "//input[@id='password']";
    private static String loginSubmitButton = "//input[@type='submit']";


    public Login() {
    }

    public String getLoginURL() {
        return loginURL;
    }

    public void logIn(String username, String password) {
        $x(loginUsername).sendKeys(username);
        $x(loginPassword).sendKeys(password);
        $x(loginSubmitButton).click();
        GeneralSteps.waitDataToLoad();
        assert url().contains(loginSuccessfulURL): "Current URL " + url() + "is different from the expected one " + loginSuccessfulURL;
    }


}
