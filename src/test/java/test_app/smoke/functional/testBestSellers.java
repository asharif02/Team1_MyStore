package test_app.smoke.functional;

import app.pom.Homepage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class testBestSellers extends TestBasePage {
    @Test
    public void testSearch(){
        Homepage homepage = new Homepage();
        homepage.clickBestSellersButton();
        String actualSearchTerm = driver.findElement(By.xpath("//*[@itemprop='name']")).getText();
        String expectedSearch= "Printed Summer Dress";
        Assert.assertEquals("Printed Summer Dress", expectedSearch);

    }
}
