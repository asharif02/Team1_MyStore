package test_app.smoke.transactions;

import app.pom.Homepage;
import app.pom.Login;
import app.pom.SummerDresses;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class TestAddToWishlist extends TestBasePage {

    @Test
    public void testAddToWishlist(){
        Homepage homepage = new Homepage();
        Login login = homepage.clickLoginButton();

    }

//    @Test
//    public void testAddToCart()  {
//        Homepage homepage = new Homepage();
//        Login login = homepage.clickLoginButton();
//        login.login(appConfig.get(Config.AppProperties.USER), appConfig.get(Config.AppProperties.PASSWORD));
//
//        login.searchBar2.sendKeys("dresses");
//        login.searchBar2.sendKeys(Keys.ENTER);
//
//        login.itemHover.click();
//        login.addToCart.click();
//
//        Assert.assertTrue(true, "Product successfully added to your shopping cart");
//    }


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
}
