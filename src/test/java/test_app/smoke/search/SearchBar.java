package test_app.smoke.search;

import app.pom.Homepage;
import app.pom.Login;
import config.Config;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

import static base.BasePage.appConfig;

public class SearchBar extends TestBasePage {

    @Test
    public void testSearchBar() {
        Homepage homepage = new Homepage();
        Login login = homepage.clickLoginButton();
        login.login(appConfig.get(Config.AppProperties.USER), appConfig.get(Config.AppProperties.PASSWORD));

        login.searchBar.sendKeys("dresses");
        login.searchBar.sendKeys(Keys.ENTER);

        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=dresses&submit_search=" );


    }


}
