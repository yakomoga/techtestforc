package steps;

import cucumber.api.java.en.When;
import pages.Homepage;
import pages.Register;

public class RegisterSteps {

    private Register register;
    private Homepage homepage;

    public RegisterSteps() {
        register = new Register();
        homepage = new Homepage();
    }

    @When("I register a new user")
    public void iRegisterANewUser() {
        homepage.openHomepage();
        homepage.openRegistrationForm();
        register.registerNewUser();
    }
}
