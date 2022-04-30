package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends SystemBar {

    public static final String URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
// Test case 1
    @FindBy (xpath = "//a[@href=\"http://automationpractice.com/index.php?fc=module&module=blockwishlist&controller=mywishlist\"]")
    public WebElement myWishlist;

    @FindBy (xpath = "//*[@class='inputTxt form-control']")
    public WebElement wishlistName;
// Test case 2

    @FindBy (xpath = "//*[@value='Enter your e-mail']")
    public WebElement newsLetterSubscription;
//Test case 2
    @FindBy(xpath = "//i[@class='icon-building']")
    public WebElement myAddress;
////i[@class='icon-remove right']
    @FindBy(xpath = "(//a[@class='btn btn-default button button-small'])[2]")
    public WebElement updateMyAddress;

//Test case 3
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
    //////
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
// Test case Add to cart
    @FindBy(xpath = "//input[@class='search_query form-control ac_input']")
    public WebElement searchBarA;

    @FindBy(xpath = " (//img[@alt='Printed Dress'])[1]")
    public WebElement itemHover;

    @FindBy (xpath = "(//a[@class='button ajax_add_to_cart_button btn btn-default'])[2]")
    public WebElement addToCart;
 // Test case

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
