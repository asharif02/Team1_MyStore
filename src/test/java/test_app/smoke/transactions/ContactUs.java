package test_app.smoke.transactions;

import app.pom.Homepage;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class ContactUs extends TestBasePage {

    @Test
    public void testContactUsButton()  {

        Homepage homepage=new Homepage();
        homepage.contactUsButton.click();
        //homepage.contactUsButton.sendKeys("CUSTOMER SERVICE - CONTACT US");
        //homepage.contactUsButton.sendKeys(Keys.ENTER);


        //String actualtext=driver.findElement(By.xpath("//h1[@class='page-heading bottom-indent']")).getText();
        //String expectedtext="CUSTOMER SERVICE - CONTACT US";
        //Assert.assertEquals(actualtext,expectedtext);


    }

}
////h1[@class='page-heading bottom-indent']
////label[@for='message']