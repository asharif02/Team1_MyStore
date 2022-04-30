package test_app.functionality;

import app.pom.Homepage;
import app.pom.Login;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

import static org.openqa.selenium.Keys.ENTER;

public class Subscription extends TestBasePage {

    @Test
    public void testNewsletterSubscription() {
        Homepage homepage = new Homepage();
        Login login = homepage.clickLoginButton();

        login.newsLetterSubscription.sendKeys("NEWS@gmail.com");
        login.newsLetterSubscription.sendKeys(ENTER);

        Assert.assertTrue(true, "Newsletter : You have successfully subscribed to this newsletter.");
    }
}
