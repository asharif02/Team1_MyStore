package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends SystemBar {

    @FindBy(id = "search_query_top")
    public WebElement searchBoxInputField;

    @FindBy(name = "submit_search")
    public WebElement searchSubmitButton;

    @FindBy(css = ".lighter")
    public WebElement actualSearchTerm;

    @FindBy(css = ".alert.alert-warning")
    public WebElement noResultsFoundAlertWarning;



    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    public Homepage searchForClothingItem(String clothingItem) {

        inputSearchTerm(clothingItem);
        clickSearchSubmitButton();

        return new Homepage();

    }

    public String inputSearchTerm(String clothingItem) {
        sendKeysToElement(searchBoxInputField, clothingItem);
        return clothingItem;
    }

    public void clickSearchSubmitButton() {
        safeClickOnElement(searchSubmitButton);
    }

}
