package steps;

import cucumber.api.java.en.When;
import pages.Homepage;
import pages.Login;
import pages.Register;

public class LoginSteps {
    private Register register;
    private Homepage homepage;
    private Login login;

    public LoginSteps() {
        register = new Register();
        homepage = new Homepage();
        login = new Login();
    }

    @When("I log in with new user credentials")
    public void iLogInWithNewUserCredentials() {
//        homepage.openLoginForm();
        String username = register.getDefaultUsername();
        String password = register.getDefaultPassword();
        login.logIn(username, password);
    }
}
