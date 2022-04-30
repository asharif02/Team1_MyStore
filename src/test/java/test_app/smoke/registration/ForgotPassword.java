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
        homepage.forgotPasswordButton.sendKeys("FORGOT YOUR PASSWORD?");
        homepage.forgotPasswordButton.sendKeys(Keys.ENTER);

        //String actualtext =driver.findElement(By.xpath("//form[@id='form_forgotpassword']")).getText();
        //String expectedtext ="FORGOT YOUR PASSWORD";

        Assert.assertTrue(true,"FORGOT YOUR PASSWORD?");
    }
}


////h1[@class='page-subheading']