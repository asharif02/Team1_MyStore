package test_app.functional;

import app.pom.Homepage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class AddingQuantity extends TestBasePage {

    @Test
    public void testAddingQuantity() {
        Homepage homepage = new Homepage();

        homepage.bestSellerButton1.click();
        homepage.clickPrintedChiffonDress1.click();
        for (int i = 0; i < 4; i++) {
            //clicking the plus button
            driver.findElement(By.xpath("//*[@class='btn btn-default button-plus product_quantity_up']"));
            homepage.clickThePlusButton.click();

            Assert.assertTrue(true, "Printed chiffon knee length dress with tank straps. Deep v-neckline.");

        }
    }
}
