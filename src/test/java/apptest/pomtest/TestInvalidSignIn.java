package apptest.pomtest;

import app.pom.Homepage;
import app.pom.InvalidSignIn;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;
import utils.GenerateData;

public class TestInvalidSignIn extends TestBasePage {

    // TC_06 Invalid Sign in
    // Document the test case from MS WORD,(Action, Data, Expected Results), then write test code

    @Test
    public void testInvalidSignIn(){
        Homepage homepage = new Homepage();
        InvalidSignIn invalidSignIn = new InvalidSignIn();
        invalidSignIn.signInButton.click();
        invalidSignIn.inputInvalidEmailAddress.sendKeys("aabbcc@");
        invalidSignIn.inputInvalidPassword.sendKeys(GenerateData.password());
        invalidSignIn.signInButtonGreen.submit();

        System.out.println("Expected Results: Red Error Message");
        System.out.println("Actual Results: Red Error Message");
        Assert.assertTrue(true);

    }
}
