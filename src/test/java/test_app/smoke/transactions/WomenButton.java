package test_app.smoke.transactions;

import app.pom.Homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class WomenButton extends TestBasePage {
    @Test
    public void testWomenButton() {
        Homepage homepage=new Homepage();
        homepage.womenButton.click();
        homepage.womenButton.sendKeys("Subcategories");
        homepage.womenButton.sendKeys(Keys.ENTER);


        String actualtext =driver.findElement(By.xpath("//p[@class='subcategory-heading']")).getText();
        String expectedtext ="Subcategories";
        Assert.assertEquals(actualtext,expectedtext);



//testSearchingBar




    }
}
