package test_app.smoke.registration;

import app.pom.ContactUs;
import app.pom.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;
import utils.GenerateData;

public class TestContactUs extends TestBasePage {

    @Test
    public void testContactUs(){
        Homepage homepage = new Homepage();
        ContactUs contactUs = homepage.clickContactButton();
        contactUs.selectSubjectHeading(1);
        String emailAddress = GenerateData.email();
        //String emailAddress = "tadefi_01@yahoo.fr";
        contactUs.inputEmailAddress(emailAddress);
        contactUs.inputOrderReference("orderReference");
        contactUs.inputMessage("This is an automation test");
        contactUs.clickSendButton();

        Assert.assertTrue(isElementVisible(contactUs.customerServiceContactUsValidationMessage));

//        String subjectHeading = GenerateData.subjectHeading();
//        String emailAddress = GenerateData.email();
//        String orderReference = GenerateData.orderReference();
//        String message = GenerateData.message();
//
//        contactUs.contactCustomerService(subjectHeading, emailAddress, orderReference, message);
//
//        String validationMessage = getElementText(contactUs.contactUsButton);
//        String splitValidationMessage = validationMessage.split(" ");
//        String actualValidationMessageWordOne = splitValidationMessage[0];
//        String actualValidationMessageWordTwo = splitValidationMessage[1];
//        String actualValidationMessageWordThree = splitValidationMessage[2];
//        String actualValidationMessageWordFour = splitValidationMessage[3];
//        String actualValidationMessageWordFive = splitValidationMessage[4];
//        String actualValidationMessageWordSix = splitValidationMessage[5];
//        String actualValidationMessageWordSeven = splitValidationMessage[6];
//        String actualValidationMessageWordEight = splitValidationMessage[7];
//        String actualValidationMessageWordNine = splitValidationMessage[8];
//
//        Assert.assertTrue(isElementVisible(contactUs.contactUsButton));
//        Assert.assertTrue(actualValidationMessageWordOne.equalsIgnoreCase(actualValidationMessageWordOne));
//        Assert.assertTrue(actualValidationMessageWordTwo.equalsIgnoreCase(actualValidationMessageWordTwo));
//        Assert.assertTrue(actualValidationMessageWordThree.equalsIgnoreCase(actualValidationMessageWordThree));
//        Assert.assertTrue(actualValidationMessageWordFour.equalsIgnoreCase(actualValidationMessageWordFour));
//        Assert.assertTrue(actualValidationMessageWordFive.equalsIgnoreCase(actualValidationMessageWordFive));
//        Assert.assertTrue(actualValidationMessageWordSix.equalsIgnoreCase(actualValidationMessageWordSix));
//        Assert.assertTrue(actualValidationMessageWordSeven.equalsIgnoreCase(actualValidationMessageWordSeven));
//        Assert.assertTrue(actualValidationMessageWordEight.equalsIgnoreCase(actualValidationMessageWordEight));
//        Assert.assertTrue(actualValidationMessageWordNine.equalsIgnoreCase(actualValidationMessageWordNine));
    }
}
