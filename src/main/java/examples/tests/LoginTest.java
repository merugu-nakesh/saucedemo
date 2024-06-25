package examples.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        page.fill("#user-name", "standard_user");
        page.fill("#password", "secret_sauce");
        page.click("#login-button");
        Assert.assertTrue(page.isVisible(".inventory_list"), "Login should be successful");
    }

    @Test
    public void testInvalidLogin() {
        page.fill("#user-name", "standard_user");
        page.fill("#password", "wrong_password");
        page.click("#login-button");
        Assert.assertTrue(page.isVisible(".error-message-container"), "Login should fail with incorrect password");
    }
}
