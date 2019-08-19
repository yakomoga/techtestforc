package steps;

import cucumber.api.java.en.When;
import pages.Login;
import pages.Register;

public class LoginSteps {
    private Register register;
    private Login login;

    public LoginSteps() {
        register = new Register();
        login = new Login();
    }

    @When("I log in with new user credentials")
    public void iLogInWithNewUserCredentials() {
        String username = register.getDefaultUsername();
        String password = register.getDefaultPassword();
        login.logIn(username, password);
    }
}
