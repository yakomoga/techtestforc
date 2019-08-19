package pages;

import com.codeborne.selenide.Condition;
import general.GeneralSteps;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;


public class Homepage {

    private final String centerBox = "//div[@class='center-box']";
    private final String registerButton = "//a[contains(@class,'link-button')]";
    private final String loginButton = "//a[contains(@class,'link-button ion-log-in')]";
    private final String homepageURL = "https://grup5web.firebaseapp.com";

    private Register register;

    public Homepage() {
        register = new Register();
    }

    public void openHomepage() {
        open(homepageURL);
        $x(centerBox).should(Condition.exist);
    }

    public void openRegistrationForm() {
        $x(registerButton).click();
        GeneralSteps.waitDataToLoad();
        $x(register.registerFormName).should(Condition.exist);
    }
}
