package test_app.smoke.transactions;

import app.pom.Homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class AddToCart extends TestBasePage {
    @Test

    public void TestAddToCartButton(){

        Homepage homepage=new Homepage();
        homepage.bestSeller.click();
        boolean selected = homepage.printedChiffonDress.isSelected();
       //homepage.addToCartPrintedChiffonDress.click();



    }
}
