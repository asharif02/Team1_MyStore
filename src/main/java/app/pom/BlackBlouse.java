package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BlackBlouse extends SystemBar {

    // Set the URL
    public static final String URL = "http://automationpractice.com/";
    // TC_02 Find black blouse
    // Document the test case from MS WORD,(Action, Data, Expected Results), then write code

    @FindBy(xpath = "//a[@title='Women']")
    public WebElement womenTab;

    @FindBy(xpath = "//a[@title='Tops']//img[@class='replace-2x']")
    public WebElement topsTab;

    @FindBy(xpath = "//a[@title='Blouses']//img[@class='replace-2x']")
    public WebElement blousesTab;

    @FindBy(xpath = "//a[@title='Blouse']//img[@class=\"replace-2x img-responsive\"]")
    public WebElement blouseDress;

    public BlackBlouse(){
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver, this);

    }
}
