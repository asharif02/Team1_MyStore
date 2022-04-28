package test_app.smoke.transactions;

import app.pom.CasualDresses;
import app.pom.Homepage;
import app.pom.ShoppingCartSummary;
import app.pom.SummerDresses;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class ShoppingCart extends TestBasePage {

    // region Sami's Example Test Case
    @Test
    public void testAddItemToCart() {
        Homepage homepage = new Homepage();
        homepage.hoverOverWomenButton();
        SummerDresses summerDresses = homepage.clickWomenHoverMenuDressesSummerDressesButton();

        summerDresses.setUpperPriceRange(20.00);
        summerDresses.hoverOverFirstItem();
        summerDresses.clickPrintedChiffonDressQuickViewButton();

        int desiredQuantity = 3;
        String size = "M";
        summerDresses.addItemToCart(desiredQuantity, size);

        String expectedMessage = "Product successfully added to your shopping cart";

        Assert.assertEquals(summerDresses.getShoppingCartModalSuccessOrFailMessage(), expectedMessage);
        Assert.assertEquals(summerDresses.getShoppingCartModalQuantityCount(), desiredQuantity);

    }
    // endregion

    @Test
    public void testAddItemToShoppingCart() {
        CasualDresses casualDresses = CasualDresses.navigateToCasualDresses();
        casualDresses.addCasualDressToCart();

        Assert.assertTrue(isElementVisible(casualDresses.greenCheckmark));

    }

    @Test
    public void testRemoveItemFromShoppingCart() throws InterruptedException {
        CasualDresses casualDresses = CasualDresses.navigateToCasualDresses();

        casualDresses.navigateToShoppingCartSummary();
        ShoppingCartSummary shoppingCartSummary = new ShoppingCartSummary();
        shoppingCartSummary.removeItemFromShoppingCart();

        Assert.assertTrue(isElementVisible(shoppingCartSummary.emptyShoppingCartAlertWarning));

    }

    @Test
    public void addMultipleItemsToShoppingCart() {
        Homepage homepage = new Homepage();
        homepage.clickDressesButton();

    }


}
