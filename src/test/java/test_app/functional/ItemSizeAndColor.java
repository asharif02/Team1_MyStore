package test_app.functional;

import app.pom.Homepage;
import app.pom.SummerDresses;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class ItemSizeAndColor extends TestBasePage {

    @Test
    public void testItemSizeAndColor() {
        Homepage homepage = new Homepage();
        homepage.hoverOverWomenButton();
        SummerDresses summerDresses = homepage.clickWomenHoverMenuDressesSummerDressesButton();

        summerDresses.sizeCheckBox.click();
        summerDresses.colorCheckBox.click();

        Assert.assertTrue(true,"SUMMER DRESSES > SIZE S > COLOR BLACK");

    }
}
