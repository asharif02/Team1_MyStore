package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InvalidSignIn extends SystemBar {

    // Set the URL
    public static final String URL = "http://automationpractice.com/";
    // TC_06 Invalid Sign in
    // Document the test case from MS WORD,(Action, Data, Expected Results), then write code

    @FindBy(xpath = "//a[@class='login']")
    public WebElement signInButton;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement inputInvalidEmailAddress;

    @FindBy(xpath = "//input[@id='passwd']")
    public WebElement inputInvalidPassword;

    @FindBy(xpath = "//button[@id='SubmitLogin']")
    public WebElement signInButtonGreen;

    public InvalidSignIn(){
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver,this);
    }

}
