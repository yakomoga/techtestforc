package pages;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;

public class Register {
    public final String registerFormName = "//input[@id='name']";
    private final String registerFormLastname = "//input[@id='lastname']";
    private final String registerFormDNI = "//input[@id='dni']";
    private final String registerFormBirthdate = "//input[@id='birthdate']";
    private final String registerFormAddress = "//input[@id='address']";
    private final String registerFormCity = "//input[@id='city']";
    private final String registerFormZipcode = "//input[@id='zipcode']";
    private final String registerFormCountry = "//input[@id='country']";
    private final String registerFormPhone = "//input[@id='phone']";
    private final String registerFormEmail = "//input[@id='email']";
    private final String registerFormUsername = "//input[@id='username']";
    private final String registerFormPassword = "//input[@id='password']";
    private final String registerFormVerifyPassword = "//input[@id='verifyPassword']";
    private final String defaultPassword = "QWerty123";
    private final String defaultUsername = "andres.friden";
    private final String registerFormSubmitButton = "//input[@type='submit']";

    private Login login;

    public Register() {
        login = new Login();
    }

    public String getDefaultPassword() {
        return defaultPassword;
    }

    public String getDefaultUsername() {
        return defaultUsername;
    }

    public void registerNewUser() {
        $x(registerFormName).sendKeys("Anders");
        $x(registerFormLastname).sendKeys("Friden");
        $x(registerFormDNI).sendKeys("30065089H");
        $x(registerFormBirthdate).sendKeys("25.03.1973");
        $x(registerFormAddress).sendKeys("Paseig de Gracia 145");
        $x(registerFormCity).sendKeys("Barcelona");
        $x(registerFormZipcode).sendKeys("90210");
        $x(registerFormCountry).sendKeys("España");
        $x(registerFormPhone).sendKeys("234432234");
        $x(registerFormEmail).sendKeys("andres.friden@gmail.com");
        $x(registerFormUsername).sendKeys(defaultUsername);
        $x(registerFormPassword).sendKeys(defaultPassword);
        $x(registerFormVerifyPassword).sendKeys(defaultPassword);
        $x(registerFormSubmitButton).click();
        assert url().equals(login.getLoginURL());
    }
}
