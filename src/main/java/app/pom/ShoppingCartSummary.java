package app.pom;

import app.shared.SystemBar;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ShoppingCartSummary extends SystemBar {

    @FindBy(xpath = "//i[@class='icon-trash']")
    public WebElement trashIcon;

    @FindBy(xpath = "//p[@class='alert alert-warning']")
    public WebElement emptyShoppingCartAlertWarning;


    public void clickTrashIcon() {
        clickOnElement(trashIcon);
    }

    public void removeItemFromShoppingCart() {
        clickTrashIcon();
        webDriverWait.until(ExpectedConditions.visibilityOf(emptyShoppingCartAlertWarning));
    }

    public ShoppingCartSummary() {
        PageFactory.initElements(driver, this);
    }

}
