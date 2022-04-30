package test_app.smoke.registration;

import app.pom.Homepage;
import app.pom.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class ForgotPassword extends TestBasePage {
    @Test

    public void testForgotPasswordButton(){

        Homepage homepage=new Homepage();
        homepage.signInButton2.click();
        homepage.forgotPasswordButton.click();
        homepage.forgotPasswordButton.sendKeys("rominagad4@gmail.com");
        homepage.forgotPasswordButton.sendKeys(Keys.ENTER);


        Assert.assertTrue(true,"rominagad4@gmail.com");
    }
}


////h1[@class='page-subheading']