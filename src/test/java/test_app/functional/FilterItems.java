package test_app.functional;

import app.pom.Dresses;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class FilterItems extends TestBasePage {

    // filter by size, color and style

    @Test
    public void testFilterItemBySize() {
        Dresses dresses = Dresses.navigateToDresses();
        dresses.selectMediumSizeCheckbox();

        String actualFilter = String.valueOf(dresses.filterConfirmation.getText());

        Assert.assertTrue(actualFilter.contains("M"));

    }

    @Test
    public void testFilterItemByColor() {
        Dresses dresses = Dresses.navigateToDresses();
        dresses.selectOrangeColor();

        String actualFilter = String.valueOf(dresses.filterConfirmation.getText());

        Assert.assertTrue(actualFilter.contains("Orange"));

    }

    @Test
    public void testFilterItemByStyle() {
        Dresses dresses = Dresses.navigateToDresses();
        dresses.selectGirlyStyleOption();

        String actualFilter = String.valueOf(dresses.filterConfirmation.getText());

        Assert.assertTrue(actualFilter.contains("Girly"));

    }
}
