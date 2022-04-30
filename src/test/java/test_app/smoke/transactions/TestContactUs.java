package test_app.smoke.transactions;

import app.pom.ContactUs;
import app.pom.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class TestContactUs extends TestBasePage {


    @Test
    public void TestContactUsPage() {
        Homepage homepage = new Homepage();
        ContactUs contactUs = homepage.clickContactButton();
        contactUs.contactUsButton.click();
        contactUs.selectDropDown.click();
        contactUs.emailAddressField.sendKeys("rominagad4@gmail.com");
        contactUs.orderReference.sendKeys("Sra2013");
        contactUs.messageField.sendKeys("Wrong Order");
        contactUs.sendButton.click();

        String expectedText = "Your message has been successfully sent to our team";
        String text = "Your message has been successfully sent to our team";
        System.out.println(expectedText);
        System.out.println(text);
        Assert.assertEquals(expectedText, text);

    }
}

