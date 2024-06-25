package examples.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void testCheckoutForm() {
        page.fill("#user-name", "standard_user");
        page.fill("#password", "secret_sauce");
        page.click("#login-button");

        page.click("text=Add to cart");
        page.click(".shopping_cart_link");
        page.click("#checkout");

        page.fill("#first-name", "John");
        page.fill("#last-name", "Doe");
        page.fill("#postal-code", "12345");
        page.click("#continue");

        Assert.assertTrue(page.isVisible(".summary_info"), "Checkout form should be filled successfully and proceed to summary page");
    }
}
