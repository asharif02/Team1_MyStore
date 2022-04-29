package apptest.pomtest;

import app.pom.ContactUs;
import app.pom.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class TestContactUs extends TestBasePage {

    // TC_01 Contact Us
    // Document the test case,(Action, Data, Expected Results), then write test code

    @Test
    public void testcontactUsPage() {
        Homepage homepage = new Homepage();
        ContactUs contactUs = homepage.clickContactButton();
        contactUs.contactUsButton.click();
        contactUs.selectDropDown.click();
        contactUs.emailAddressField.sendKeys("kyliejenner@gmail.com");
        contactUs.orderReference.sendKeys("112233");
        contactUs.messageField.sendKeys("Automation rules!");
        contactUs.sendButton.click();

        String expectedText = "Your message has been successfully sent to our team";
        String text = "Your message has been successfully sent to our team";
        System.out.println(text);
        Assert.assertEquals(expectedText, text);

    }
}
