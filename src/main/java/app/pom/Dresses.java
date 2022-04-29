package app.pom;

import app.shared.SystemBar;
import config.Config;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Dresses extends SystemBar {

    @FindBy(xpath = "//img[@src='http://automationpractice.com/img/p/8/8-home_default.jpg']")
    public WebElement firstDress;

    @FindBy(xpath = "//a[@data-id-product='3']/span")
    public WebElement addToCart1;

    @FindBy(xpath = "//a[@data-id-product='4']/span")
    public WebElement addToCart2;

    @FindBy(xpath = "//a[@data-id-product='5']/span")
    public WebElement addToCart3;

    @FindBy(xpath = "//span[@title='Continue shopping']")
    public WebElement continueShoppingButton;

    @FindBy(xpath = "//img[@src='http://automationpractice.com/img/p/1/0/10-home_default.jpg']")
    public WebElement secondDress;

    @FindBy(xpath = "//img[@src='http://automationpractice.com/img/p/1/2/12-home_default.jpg']")
    public WebElement thirdDress;

    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    public WebElement proceedToCheckoutButton;

    @FindBy(xpath = "//div[@id='uniform-layered_id_attribute_group_2']//input[@id='layered_id_attribute_group_2']")
    public WebElement mediumSizeOption;

    @FindBy(xpath = "//ul[@id='ul_layered_id_attribute_group_3']//input[@id='layered_id_attribute_group_13']")
    public WebElement orangeColorOption;

    @FindBy(xpath = "//div[@id='uniform-layered_id_feature_13']//input[@id='layered_id_feature_13']")
    public WebElement girlyStyleOption;

    @FindBy(xpath = "//div[@id='enabled_filters']//li")
    public WebElement filterConfirmation;


    public static Dresses navigateToDresses() {
        Homepage homepage = new Homepage();
        Login login = homepage.clickLoginButton();

        login.login(appConfig.get(Config.AppProperties.USER), appConfig.get(Config.AppProperties.PASSWORD));
        homepage.clickDressesButton();

        return new Dresses();
    }

    public ShoppingCartSummary addMultipleItemsToCart() {
        hoverFirstDress();
        clickAddToCart1();
        clickContinueShoppingButton();

        hoverSecondDress();
        clickAddToCart2();
        clickContinueShoppingButton();

        hoverThirdDress();
        clickAddToCart3();
        clickProceedToCheckoutButton();

        return new ShoppingCartSummary();

    }

    public void selectGirlyStyleOption() {
        safeClickOnElement(girlyStyleOption);
        webDriverWait.until(ExpectedConditions.visibilityOf(filterConfirmation));
    }

    public void selectOrangeColor() {
        safeClickOnElement(orangeColorOption);
        webDriverWait.until(ExpectedConditions.visibilityOf(filterConfirmation));
    }

    public void selectMediumSizeCheckbox() {
        safeClickOnElement(mediumSizeOption);
        webDriverWait.until(ExpectedConditions.visibilityOf(filterConfirmation));
    }

    public void hoverFirstDress() {
        hoverOverElement(firstDress);
    }

    public void clickAddToCart1() {
        safeClickOnElement(addToCart1);
    }

    public void clickAddToCart2() {
        safeClickOnElement(addToCart2);
    }

    public void clickAddToCart3() {
        safeClickOnElement(addToCart3);
    }

    public void clickContinueShoppingButton() {
        clickOnElement(continueShoppingButton);
    }

    public void hoverSecondDress() {
        hoverOverElement(secondDress);
    }

    public void hoverThirdDress() {
        hoverOverElement(thirdDress);
    }

    public void clickProceedToCheckoutButton() {
        clickOnElement(proceedToCheckoutButton);
    }

    public Dresses() {
        PageFactory.initElements(driver, this);
    }
}
