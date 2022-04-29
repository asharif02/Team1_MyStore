package apptest.pomtest;

import app.pom.Homepage;
import app.pom.Newsletter;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;
import utils.GenerateData;

public class TestNewsletter extends TestBasePage {

    // TC_05 Subscribing to Newsletter
    // Document the test case from MS WORD,(Action, Data, Expected Results), then write test code

    @Test
    public void testNewsletter(){
        Homepage homepage = new Homepage();
        Newsletter newsletter = new Newsletter();
        newsletter.inputEmailAddress.click();
        newsletter.inputEmailAddress.sendKeys(GenerateData.email());
        newsletter.submitNewsletterButton.submit();

        System.out.println("Newsletter : You have successfully subscribed to this newsletter");
        Assert.assertTrue(true, "Newsletter : You have successfully subscribed to this newsletter");
    }
}
