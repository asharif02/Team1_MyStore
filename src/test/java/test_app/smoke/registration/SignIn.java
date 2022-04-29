package test_app.smoke.registration;

import app.pom.Homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class SignIn extends TestBasePage {
    @Test

    public void testSignInButton(){

        Homepage homepage=new Homepage();
        homepage.signInButton.click();
        homepage.signInButton.sendKeys("ALREADY REGISTERED?");
        homepage.signInButton.sendKeys(Keys.ENTER);

        String actualtext =driver.findElement(By.xpath("(//h3[@class='page-subheading'])[2]")).getText();
        String expectedtext ="ALREADY REGISTERED?";
        Assert.assertEquals(actualtext,expectedtext);

    }
}

//(//h3[@class='page-subheading'])[2]