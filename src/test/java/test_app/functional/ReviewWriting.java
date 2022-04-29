package test_app.functional;

import app.pom.Homepage;
import app.pom.Login;
import config.Config;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class ReviewWriting extends TestBasePage {

    @Test
    public void testReviewWriting() {

        Homepage homepage = new Homepage();
        Login login = homepage.clickLoginButton();
        login.login(appConfig.get(Config.AppProperties.USER), appConfig.get(Config.AppProperties.PASSWORD));

        login.searchBar4.sendKeys("dresses");
        login.searchBar4.sendKeys(Keys.ENTER);

        login.listView1.click();
        login.clickMoreButton.click();

        login.clickingOnWritingAReviewButton.click();

        login.reviewTitle.sendKeys("Summer Dress review");
        login.reviewTitle.sendKeys(Keys.ENTER);

        login.writingTheReview.sendKeys("Bad quality product. Returning tomorrow");
        login.writingTheReview.sendKeys(Keys.ENTER);

        login.submitttingReview.click();

        Assert.assertTrue(true, "Your comment has been added and will be available once approved by a moderator");

    }
}
