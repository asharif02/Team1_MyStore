package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Homepage extends SystemBar {

//TC_Add to wishlist
    public Homepage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@title='Log in to your customer account']")
    public WebElement signInButton;

    @FindBy(id = "//*[@id='email']")
    public WebElement emailAddressInputField;

    @FindBy(id = "//*[@id='passwd']")
    public WebElement passwordInputField;

    @FindBy(id = "//*[@id='SubmitLogin']/span")
    public WebElement logInButton;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    public WebElement tshirtsBlockTopMenuButton;

    @FindBy(xpath = "//*[@ class='addToWishlist wishlistProd_1']")
    public WebElement addToWishlistButton;

    @FindBy(xpath = "//*[@title='Close']")
    public WebElement AddedToYourWishlistCloseButton;

    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?controller=my-account']//span")
    public WebElement CustomerAccountButton;

    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?fc=module&module=blockwishlist&controller=mywishlist']//span")
    public WebElement myWishlistButton;

    public void clickSignInButton(){
        clickSignInButton();
    }
    public void inputEmailAddress(String emailAddress) {
        sendKeysToElement(emailAddressInputField, emailAddress);
    }
    public void inputPassword(String password) {
        sendKeysToElement(passwordInputField, password);
    }
    public void clickLogInButton() {
        clickLogInButton();
    }
    public void clickTshirtsBlockTopMenuButton(){
        clickTshirtsBlockTopMenuButton();
    }
    public void clickAddToWishlistButton(){
        clickAddToWishlistButton();
    }
    public void AddedToYourWishlistCloseButton(){
        clickAddToWishlistButton();
    }
    public void clickSendButton(){
        clickSendButton();
    }

    public void AddToWishlist() {
        PageFactory.initElements(driver, this); }

//TC_Search
    @FindBy(xpath = "//input[@id='search_query_top']")
    public WebElement searchInputField;

    @FindBy(xpath = "//button[@name='submit_search']")
    public WebElement searchButton;

    @FindBy(xpath = "//span[@class='lighter']")
    public WebElement searchTerm;

    @FindBy(xpath = "//span[@class='heading-counter']")
    public WebElement searchResult;

    public String inputSearchTerm(String searchProduct) {
        sendKeysToElement(searchInputField, searchProduct);
        return searchProduct;
    }
    public void clickSearchButton(){
        clickOnElement(searchButton);
    }
    public void search(String searchProduct){
        inputSearchTerm(searchProduct);
        //clickSearchButton;
        //return new Homepage();
    }
    public void HomePage(){
        PageFactory.initElements(driver, this);
    }
//TC_Best Sellers
    @FindBy(xpath = "//a[@href='#blockbestsellers']")
    WebElement bestSellersButton;

    @FindBy(xpath = "//*[@id='blockbestsellers']//li[4]//div//div[1]//div//a[1]//img")
    WebElement printedSummerDress;

    public void clickBestSellersButton(){
        clickBestSellersButton();
    }

    public void clickPrintedSummerDress(){
        clickPrintedSummerDress();
    }

    public void Homepage(){
        PageFactory.initElements(driver, this);
    }
}
