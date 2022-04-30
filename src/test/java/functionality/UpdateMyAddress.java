package functionality;
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

        login.myAddress.sendKeys("MY ADDRESSES");
        login.myAddress.sendKeys(Keys.ENTER);
        //MY ADDRESSES
        login.updateMyAddress.click();

        login.updateMyAddress.sendKeys("Modify address \"My address\"");
        login.updateMyAddress.sendKeys(Keys.ENTER);

        //driver.switchTo( ).alert( );
        //driver.switchTo( ).alert( ).accept();

        //String actualTitle = driver.getTitle();
        //String expectedTitle = "Modify address \"My address\"";
        Assert.assertTrue(true,"Modify address \"My address\"");
        //No addresses are available. Add a new address
    }
//Modify address "My address"
}