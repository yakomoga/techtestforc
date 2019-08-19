package general;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class GeneralSteps {
    public static final int TIMEOUT_TIME = 5;

    @Before
    public void runBeforeTestMethod() {
        Configuration.browser = "chrome";
        Configuration.startMaximized = false;
        Configuration.headless = false;
    }

    @After
    public void runAfterTestMethod() {
        getWebDriver().quit();
        WebDriverRunner.closeWebDriver();
    }

    public static void waitDataToLoad() {
        try {
            TimeUnit.SECONDS.sleep(TIMEOUT_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}