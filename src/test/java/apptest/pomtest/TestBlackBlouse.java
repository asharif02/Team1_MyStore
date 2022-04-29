package apptest.pomtest;

import app.pom.Homepage;
import app.pom.BlackBlouse;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class TestBlackBlouse extends TestBasePage {

    // TC_02 Contact Us
    // Document the test case from MS WORD,(Action, Data, Expected Results), then write test code

    @Test
    public void testBlackBlousePage(){
        Homepage homepage = new Homepage();
        BlackBlouse blackBlouse = new BlackBlouse();
        blackBlouse.womenTab.click();
        blackBlouse.topsTab.click();
        blackBlouse.blousesTab.click();
        blackBlouse.blouseDress.click();

        String expectedText = "black blouse";
        String text = "black blouse";
        System.out.println(expectedText);
        System.out.println(text);
        Assert.assertEquals(expectedText, text);


    }
}
