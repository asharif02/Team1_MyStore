package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Newsletter extends SystemBar {

    // Set the URL
    public static final String URL = "http://automationpractice.com/";
    // TC_05 Subscribing to Newsletter
    // Document the test case,(Action, Data, Expected Results), then write code

    @FindBy(xpath = "//input[@id='newsletter-input']")
    public WebElement inputEmailAddress;

    @FindBy(xpath = "//button[@name='submitNewsletter']")
    public WebElement submitNewsletterButton;

    public Newsletter(){
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver,this);
    }
}
