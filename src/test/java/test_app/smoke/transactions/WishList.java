package test_app.smoke.transactions;

import app.pom.Dresses;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class WishList extends TestBasePage {

    @Test
    public void testAddItemToWishList() {
        Dresses dresses = Dresses.navigateToDresses();

        dresses.addItemToWishList();

        Assert.assertTrue(isElementVisible(dresses.wishListConfirmation));

    }

}
