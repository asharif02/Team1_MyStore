package test_app.smoke.transactions;

import app.pom.Homepage;
import org.apache.commons.math3.filter.KalmanFilter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class Search extends TestBasePage{

    @Test

    public void testSearchButton(){

        Homepage homepage=new Homepage();
        homepage.searchButton.click();
        homepage.searchButton.sendKeys("Please enter a search keyword");
        homepage.searchButton.sendKeys(Keys.ENTER);

        String actualtext =driver.findElement(By.xpath("//p[@class='alert alert-warning']")).getText();
        String expectedtext ="Please enter a search keyword";
        Assert.assertEquals(actualtext,expectedtext);

    }

}
