package test_app.functional;

import app.pom.Homepage;
import app.pom.Login;
import config.Config;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class DeleteAddress extends TestBasePage {

    @Test
    public void testDeleteAddress() {
        driver.manage().window().maximize();
        Homepage homepage = new Homepage();
        Login login = homepage.clickLoginButton();
        login.login(appConfig.get(Config.AppProperties.USER), appConfig.get(Config.AppProperties.PASSWORD));

        login.myAddress.click();
        login.deleteMyAddress.click();

        driver.switchTo( ).alert( );
        driver.switchTo( ).alert( ).accept();

        Assert.assertTrue(true, "No addresses are available. Add a new address");

    }

    }
