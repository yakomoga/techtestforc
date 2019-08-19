package steps;

import cucumber.api.java.en.Given;
import pages.Homepage;

public class HomepageSteps {

    private Homepage homepage;

    public HomepageSteps() {
        homepage = new Homepage();
    }

    @Given("Registration form is opened")
    public void registrationFormIsOpened() {
        homepage.openHomepage();
        homepage.openRegistrationForm();
    }
}