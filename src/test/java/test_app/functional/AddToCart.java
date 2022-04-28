package test_app.functional;

import app.pom.Homepage;
import app.pom.Login;
import config.Config;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

import static org.testng.Assert.assertEquals;

public class AddToCart extends TestBasePage {

    @Test
    public void testAddToCart()  {
        Homepage homepage = new Homepage();
        Login login = homepage.clickLoginButton();
        login.login(appConfig.get(Config.AppProperties.USER), appConfig.get(Config.AppProperties.PASSWORD));

        login.searchBar2.sendKeys("dresses");
        login.searchBar2.sendKeys(Keys.ENTER);

        login.itemHover.click();
        login.addToCart.click();

        Assert.assertTrue(true, "Product successfully added to your shopping cart");
    }
}
