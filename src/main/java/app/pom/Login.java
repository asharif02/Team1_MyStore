package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends SystemBar {

    public static final String URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

    //testcase2 xpath
    @FindBy(xpath = "//i[@class='icon-building']")
    public WebElement myAddress;

    @FindBy(xpath = "//i[@class='icon-remove right']")
    public WebElement deleteMyAddress;

    //testcase3
    @FindBy(xpath = "//input[@class='search_query form-control ac_input']")
    public WebElement searchBar;

    //testcase4
    @FindBy(xpath = "//input[@class='search_query form-control ac_input']")
    public WebElement searchBar2;

    @FindBy(xpath = " //*[@id=\"center_column\"]/ul/li[1]\n")
    public WebElement itemHover;

    @FindBy (xpath = "//*[@id='add_to_cart']/button/span[1]")
    public WebElement addToCart;

    //testcase5
    @FindBy (xpath = "//a[@href=\"http://automationpractice.com/index.php?fc=module&module=blockwishlist&controller=mywishlist\"]")
    public WebElement newWishlist;

    @FindBy (xpath = "//*[@class='inputTxt form-control']")
    public WebElement wishlistName;

    //testcase6
    @FindBy (xpath = "//*[@value='Enter your e-mail']")
    public WebElement subscribingNewsletter;

    //testcase7
    @FindBy(xpath = "//input[@class='search_query form-control ac_input']")
    public WebElement searchBar3;

    @FindBy(xpath = "//*[@class='icon-th-list']")
    public WebElement listView;

    //Testcase10
    @FindBy(xpath = "//input[@class='search_query form-control ac_input']")
    public WebElement searchBar4;

    @FindBy(xpath = "//*[@class='icon-th-list']")
    public WebElement listView1;

    @FindBy (xpath = "//*[@class='button lnk_view btn btn-default']")
    public WebElement clickMoreButton;

    @FindBy (xpath = "//*[@class='open-comment-form']")
    public WebElement clickingOnWritingAReviewButton;

    @FindBy (xpath = "//*[@id='comment_title']")
    public WebElement reviewTitle;

    @FindBy (xpath = "//*[@id=\"content\"]")
    public WebElement writingTheReview;

    @FindBy (xpath = "//*[@id='submitNewMessage']")
    public WebElement submitttingReview;

    //------------------


    @FindBy(id = "email_create")
    public WebElement newEmailAddressInputField;

    @FindBy(id = "SubmitCreate")
    public WebElement createAccountButton;

    @FindBy(id = "email")
    public WebElement registeredEmailAddressInputField;

    @FindBy(xpath = "//div[@class='form-group form-error']")
    public WebElement invalidEmailInputField;

    @FindBy(xpath = "//div[@class='form-group form-ok']")
    public WebElement validEmailInputField;

    @FindBy(id = "passwd")
    public WebElement passwordInputField;

    @FindBy(id = "SubmitLogin")
    public WebElement signInButton;

    @FindBy(xpath = "//div[@id='center_column']/div[@class='alert alert-danger']")
    public WebElement errorMessageBanner;

    @FindBy(xpath = "//div[@id='center_column']//div[@class='alert alert-danger']//li")
    public WebElement errorMessageText;

    public Login() {
        PageFactory.initElements(driver, this);
    }

    // region Create Account
    public CreateAccount createAccount(String emailAddress) {
        inputNewEmailAddress(emailAddress);
        return clickCreateAccountButton();
    }

    public void inputNewEmailAddress(String emailAddress) {
        sendKeysToElement(newEmailAddressInputField, emailAddress);
    }

    public CreateAccount clickCreateAccountButton() {
        clickOnElement(createAccountButton);
        return new CreateAccount();
    }

    // endregion

    // region Login
    public MyAccount login(String emailAddress, String password) {
        inputRegisteredEmailAddress(emailAddress);
        inputPassword(password);
        clickSignInButton();

        return new MyAccount();
    }

    public void inputRegisteredEmailAddress(String emailAddress) {
        sendKeysToElement(registeredEmailAddressInputField, emailAddress);
    }

    public void inputPassword(String password) {
        sendKeysToElement(passwordInputField, password);
    }

    public void clickSignInButton() {
        clickOnElement(signInButton);
    }

    // endregion

}
