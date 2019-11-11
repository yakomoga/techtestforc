package pages;

import com.codeborne.selenide.Condition;
import general.GeneralSteps;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class Properties {
    private static String propertiesFilterDropdown = "//select[@id='filter']";
    private static String propertiesFilterDropdownValue = "//select[@id='filter']//option[@value='";
    private static String submitComment = "//input[@type='submit']";
    private static String defaultComment = "default comment";
    private static String heartLikes = "//span[@id='likes']";
    private static String commentField = "//input[@id='comments']";
    private String nthProperty;
    private String nthPropertyLikes;
    public static String propertiesProvinceURL = "https://grup5web.firebaseapp.com/properties/properties.html?region=";
    public static Integer currentLikes;
    public static Integer initialLikes;
    public static Integer propertyIndex;
    public static Integer initialHeartLikesAmount;
    public static Integer currentHeartLikesAmount;

    public void openProvinceURL(String province) {
        open(propertiesProvinceURL + province);
        $x(propertiesFilterDropdown).should(Condition.exist);
    }

    public static void filterPropertyBy(String filterValue) {
        $x(propertiesFilterDropdownValue + filterValue + "']").click();
        GeneralSteps.waitDataToLoad();
    }

    public void clickNthProperty(Integer propertyIndex) {
        nthProperty = "//div[@id='propertiesList']/div[" + propertyIndex + "]";
        $x(nthProperty).click();
    }

    public void addComment() {
        $x(commentField).sendKeys(defaultComment);
        $x(submitComment).click();
    }

    public Integer getHeartLikes() {
        return Integer.parseInt($x(heartLikes).getText());
    }

    public Integer getNthPropertyLikes(Integer index) {
        nthPropertyLikes = "//div[@id='propertiesList']/div[" + propertyIndex + "]//p[contains(@id,'likes')]";
        String amountOfLikes = $x(nthPropertyLikes).getText();
        GeneralSteps.waitDataToLoad();
        System.out.println(amountOfLikes);
        currentLikes = Integer.parseInt(amountOfLikes.replaceAll("[^\\d]", ""));
        return currentLikes;
    }
}
