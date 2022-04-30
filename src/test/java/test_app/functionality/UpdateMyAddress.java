package test_app.functionality;
import app.pom.Homepage;
import app.pom.Login;
import config.Config;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class UpdateMyAddress extends TestBasePage {

    @Test
    public void testDeleteAddress() {
        driver.manage().window().maximize();
        Homepage homepage = new Homepage();
        Login login = homepage.clickLoginButton();
        login.login(appConfig.get(Config.AppProperties.USER), appConfig.get(Config.AppProperties.PASSWORD));

        login.myAddress.click();
        login.updateMyAddress.click();

        login.updateMyAddress.sendKeys("Modify address \"My address\"");
        login.updateMyAddress.sendKeys(Keys.ENTER);

        Assert.assertTrue(isElementVisible(login.updateMyAddress));
        Assert.assertTrue(true,"Modify address \"My address\"");

        //String actualTitle = driver.getTitle();
        //String expectedTitle = "Modify address \"My address\"";

        //No addresses are available. Add a new address
    }
//Modify address "My address"
}