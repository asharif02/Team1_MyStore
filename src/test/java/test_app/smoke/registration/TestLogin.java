package test_app.smoke.registration;

import app.pom.Login;
import config.Config;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;
import app.pom.Homepage;

public class TestLogin extends TestBasePage {

    @Test
    public void testValidLogin() {
        Homepage homepage = new Homepage();
        Login login = homepage.clickLoginButton();
        login.login(appConfig.get(Config.AppProperties.USER), appConfig.get(Config.AppProperties.PASSWORD));


        Assert.assertTrue(isElementVisible(homepage.accountButton));

    }

}
