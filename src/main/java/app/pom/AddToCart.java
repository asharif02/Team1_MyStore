package app.pom;

import app.shared.Products;
import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddToCart extends SystemBar {

    // Set the URL
    public static final String URL = "http://automationpractice.com/";
    // TC_04 Add to Cart
    // Document the test case,(Action, Data, Expected Results), then write code

    @FindBy(xpath = "//input[@id=\"search_query_top\"]")
    public WebElement searchBar;
    @FindBy(xpath = "//button[@name='submit_search']")
    public WebElement searchButton;
    @FindBy(xpath = "//h5[@itemprop='name']//a[@title='Faded Short Sleeve T-shirts']")
    public WebElement fadedSSTShirt;
    @FindBy(xpath = "//p[@id='add_to_cart']//button[@type='submit']")
    public WebElement addToCartButton;

    public AddToCart() {
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver, this);
    }
}
