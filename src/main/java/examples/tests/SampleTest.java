package examples.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {

    @Test
    @Description("Sample test to verify Google title")
    public void testGoogleTitle() {
        openGoogle();
        String title = page.title();
        Assert.assertEquals(title, "Google");
    }

    @Step("Open Google homepage")
    public void openGoogle() {
        page.navigate("https://www.google.com");
    }
}
