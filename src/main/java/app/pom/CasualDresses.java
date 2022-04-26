package app.pom;

import app.shared.Products;
import org.openqa.selenium.support.PageFactory;

public class CasualDresses extends Products {


    public CasualDresses() {
        PageFactory.initElements(driver, this);
    }
}
