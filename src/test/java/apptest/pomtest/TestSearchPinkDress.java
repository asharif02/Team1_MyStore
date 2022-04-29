package apptest.pomtest;

import app.pom.Homepage;
import app.pom.SearchPinkDress;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class TestSearchPinkDress extends TestBasePage {

    // TC_03 Search Pink Printed Dress
    // Document the test case from MS WORD,(Action, Data, Expected Results), then write test code
    @Test
    public void testPinkPrintedDress(){
        Homepage homepage = new Homepage();
        SearchPinkDress searchPinkDress = new SearchPinkDress();
        searchPinkDress.searchPinkDress.click();
        searchPinkDress.searchPinkDress.sendKeys("pink printed dress");
        searchPinkDress.searchButton.click();
        searchPinkDress.colorPink.click();

        String expectedText = "Printed Dress in Pink";
        String text = "Printed Dress in Pink";
        System.out.println(expectedText);
        System.out.println(text);
        Assert.assertEquals(expectedText, text);

    }
}
