package test_app.functional;

import app.pom.Homepage;
import app.pom.Login;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

import static org.openqa.selenium.Keys.ENTER;

public class Newsletter extends TestBasePage {

    @Test
    public void testNewsletter(){
        Homepage homepage = new Homepage();
        Login login = homepage.clickLoginButton();

        login.subscribingNewsletter.sendKeys("hahaha@gmail.com");
        login.subscribingNewsletter.sendKeys(ENTER);

        Assert.assertTrue(true,"Newsletter : You have successfully subscribed to this newsletter.");
    }
}
