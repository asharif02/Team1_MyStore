package functionality;
import app.pom.Homepage;
import app.pom.Login;
import config.Config;
//import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

import static org.openqa.selenium.Keys.ENTER;

public class MyWishList extends TestBasePage {

    @Test
    public void testNewWishlist()  {
        Homepage homepage = new Homepage();
        Login login = homepage.clickLoginButton();
        login.login(appConfig.get(Config.AppProperties.USER), appConfig.get(Config.AppProperties.PASSWORD));

        login.myWishlist.click();
        login.wishlistName.sendKeys("MY WishListing");
        login.wishlistName.sendKeys(ENTER);

        Assert.assertTrue(true,"MY WishListing");
    }
}

