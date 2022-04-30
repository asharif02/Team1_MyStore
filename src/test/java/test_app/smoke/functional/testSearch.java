package test_app.smoke.functional;

import app.pom.Homepage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class testSearch extends TestBasePage {

    @Test
    public void testSearch(){
        Homepage homepage = new Homepage();
        String searchTerm = homepage.inputSearchTerm("Long Dresses");
        homepage.clickSearchButton();
        String actualSearchTerm = driver.findElement(By.xpath("//span[@class='heading-counter']")).getText();
        String expectedSearchTerm = "long dresses";
        Assert.assertEquals("long dresses", expectedSearchTerm);

    }
}
