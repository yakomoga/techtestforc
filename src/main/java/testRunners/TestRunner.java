package testRunners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"/Users/yakomoga/Documents/Projects/Training/techtestforc/src/main/resources/features"},
        tags = {"@likes"},
        snippets = SnippetType.CAMELCASE,
        junit = "--step-notifications",
        glue = {"steps",
                "general"}
)
public class TestRunner {
}
