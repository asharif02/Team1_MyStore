package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactUs extends SystemBar {

    // Set the URL
    public static final String URL = "http://automationpractice.com/";
    // TC_01 Fill out Contact Us form
    // Document the test case from MS WORD,(Action, Data, Expected Results), then write code

    @FindBy(xpath = "//div[@id='contact-link']//a[@href='http://automationpractice.com/index.php?controller=contact']")
    public WebElement contactUsButton;

    @FindBy(xpath = "//select[@id='id_contact']")
    public WebElement selectDropDown;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailAddressField;

    @FindBy(xpath = "//input[@name='id_order']")
    public WebElement orderReference;

    @FindBy(xpath = "//textarea[@id='message']")
    public  WebElement messageField;

    @FindBy(xpath = "//button[@name='submitMessage']")
    public WebElement sendButton;

    public ContactUs() {
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver, this);
    }
}