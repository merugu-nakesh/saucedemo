package examples.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @Test
    public void testAddToCart() {
        page.fill("#user-name", "standard_user");
        page.fill("#password", "secret_sauce");
        page.click("#login-button");

        page.click("text=Add to cart");
        Assert.assertEquals(page.textContent(".shopping_cart_badge"), "1", "Item should be added to cart");
    }

    @Test
    public void testRemoveFromCart() {
        page.fill("#user-name", "standard_user");
        page.fill("#password", "secret_sauce");
        page.click("#login-button");

        page.click("text=Add to cart");
        page.click("text=Remove");
        Assert.assertFalse(page.isVisible(".shopping_cart_badge"), "Item should be removed from cart");
    }
}
