package app.pom;

import app.shared.Products;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CasualDresses extends Products {

    @FindBy(xpath = "//img[@src='http://automationpractice.com/img/p/8/8-home_default.jpg']")
    public WebElement hoverOverFirstCasualDressItem;

    @FindBy(xpath = "//h5[@itemprop='name']//a[@title='Printed Dress']")
    public WebElement firstCasualDressItem;

    @FindBy(xpath = "//p[@id='add_to_cart']/button")
    public WebElement addToCartButton;

    @FindBy(xpath = "//i[@class='icon-ok']")
    public WebElement greenCheckmark;

    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    public WebElement proceedToCheckoutButton;

    public static CasualDresses navigateToCasualDresses() {
        Homepage homepage = new Homepage();
        homepage.hoverOverDressesButton();
        homepage.clickDressesHoverMenuCasualDressesButton();

        return new CasualDresses();
    }

    public void addCasualDressToCart() {
        clickFirstCasualDressItem();
        clickAddToCartButton();
    }

    public ShoppingCartSummary navigateToShoppingCartSummary() {
        clickFirstCasualDressItem();
        clickAddToCartButton();
        clickProceedToCheckoutButton();

        return new ShoppingCartSummary();

    }


    public void clickFirstCasualDressItem() {
        safeClickOnElement(firstCasualDressItem);
    }

    public void clickAddToCartButton() {
        safeClickOnElement(addToCartButton);
    }

    public void clickProceedToCheckoutButton() {
        safeClickOnElement(proceedToCheckoutButton);
    }

    public void hoverOverItem() {
        hoverOverElement(hoverOverFirstCasualDressItem);
    }

    public CasualDresses() {
        PageFactory.initElements(driver, this);
    }

}
