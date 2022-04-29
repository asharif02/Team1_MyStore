package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchPinkDress extends SystemBar {

    // Set the URL
    public static final String URL = "http://automationpractice.com/";
    // TC_03 Search Pink Printed Dress
    // Document the test case,(Action, Data, Expected Results), then write code

    @FindBy(xpath = "//input[@id=\"search_query_top\"]")
    public WebElement searchPinkDress;

    @FindBy(xpath = "//button[@name='submit_search']")
    public WebElement searchButton;

    @FindBy(xpath = "//a[@id=\"color_43\"]")
    public WebElement colorPink;


    public SearchPinkDress() {
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver, this);
    }
}
