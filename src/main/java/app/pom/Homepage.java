package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends SystemBar {



    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    //Test Case



    //Test case

    @FindBy(xpath = "//a[@title='Women']")
    public WebElement womenButton;


    public void setWomenButton(String item) {
        sendKeysToElement(womenButton, item);

    }

    @FindBy(xpath = "//div[@id='contact-link']")
    public WebElement contactUsButton;


    public void setContactUsButton(String item) {
        sendKeysToElement(contactUsButton, item);
    }

    //Test case 2
    @FindBy(xpath = "//li[@class='active']")
    public WebElement bestSeller;

    @FindBy(xpath = "(//img[@alt='Printed Chiffon Dress'])[2]")
    public WebElement printedChiffonDress;

    @FindBy(id = "[id=add_to_cart]")
    public WebElement addToCartPrintedChiffonDress;


    //@FindBy(xpath = "...")
    //public WebElement addToCartButton;

    @FindBy(xpath = "//a[@class='login']")
    public WebElement signInButton;

    /////
    @FindBy(xpath = "//a[@class='login']")
    public WebElement signInButton2;
    @FindBy(xpath = "//a[@title='Recover your forgotten password']")
    public WebElement forgotPasswordButton;

    public void setForgotPasswordButton(String item) {
        sendKeysToElement(forgotPasswordButton, item);

    }

    @FindBy(xpath = "//button[@class='btn btn-default button-search']")
    public WebElement searchButton;
}
