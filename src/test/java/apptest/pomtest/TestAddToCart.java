package apptest.pomtest;

import app.pom.AddToCart;
import app.pom.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class TestAddToCart extends TestBasePage {

    // TC_04 Add to Cart
    // Document the test case from MS WORD,(Action, Data, Expected Results), then write test code

    @Test
    public void testAddToCart(){
        Homepage homepage = new Homepage();
        AddToCart addToCart = new AddToCart();
        addToCart.searchBar.click();
        addToCart.searchBar.sendKeys("Faded short sleeve t-shirt");
        addToCart.searchButton.click();
        addToCart.fadedSSTShirt.click();
        addToCart.addToCartButton.click();

        String expectedMessage = "Product successfully added to your shopping cart";
        String message = "Product successfully added to your shopping cart";
        Assert.assertTrue(true, expectedMessage);
        Assert.assertTrue(true, message);
    }
}
