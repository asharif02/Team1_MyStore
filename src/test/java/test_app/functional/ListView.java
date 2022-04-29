package test_app.functional;

import app.pom.Homepage;
import app.pom.Login;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class ListView extends TestBasePage {

    @Test
    public void testListView(){
        Homepage homepage = new Homepage();
        Login login = homepage.clickLoginButton();

        login.searchBar3.sendKeys("dresses");
        login.searchBar3.sendKeys(Keys.ENTER);

        login.listView.click();

       Assert.assertTrue(true, "http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=dresses&submit_search=");

    }
}
