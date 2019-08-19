package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Properties;

import static com.codeborne.selenide.Selenide.back;

public class PropertiesSteps {
   // private Register register;
   // private Homepage homepage;
    private Properties properties;

    public PropertiesSteps(){
        properties = new Properties();
    }


    @When("I open the link for province (.*?)")
    public void iOpenTheLink(String province) {
        properties.openProvinceURL(province);
    }

    @When("I filter properties by (.*?)")
    public void iFilterPropertiesBy(String filterValue) {
       properties.filterPropertyBy(filterValue);
    }

    @When("I check {int} property likes")
    public void checkNthPropertyLikes(Integer index) {
        properties.propertyIndex = index;
        properties.initialLikes = properties.getNthPropertyLikes(properties.propertyIndex);
    }

    @When("open {int} property from the list")
    public void openNthProperty(Integer propertyIndex) {
        properties.clickNthProperty(propertyIndex);
    }

    @Then("the most expensive item is opened")
    public void theMostExpensiveItemIsOpened() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("I add a comment")
    public void iAddAComment() {
        properties.initialHeartLikesAmount = properties.getHeartLikes();
        properties.addComment();
    }

    @Then("Likes is increased by one")
    public void likesIsIncreasedByOne() {
        properties.currentHeartLikesAmount = properties.getHeartLikes();
        properties.currentHeartLikesAmount= properties.initialHeartLikesAmount+1;
    }

    @When("I go to the previous page")
    public void iGoToThePreviousPage() {
        back();
    }

    @Then("the item has increased amount of likes")
    public void theItemHasLike() {
        assert properties.getNthPropertyLikes(properties.propertyIndex).equals(properties.initialLikes + 1);
        // Write code here that turns the phrase above into concrete actions
    }
}
