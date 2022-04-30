package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactUs extends SystemBar {

    //public static final String url = "http://automationpractice.com/index.php?";

    @FindBy(xpath = "//*[@title='Contact Us']")
    public WebElement contactUsButton;

    @FindBy(xpath = "//select[@id='id_contact']")
    public WebElement subjectHeadingComboBox;

    @FindBy(id = "//input[@id='email']")
    public WebElement emailAddressInputField;

    @FindBy(id = "//*[@id='id_order']")
    public WebElement orderReferenceNumberField;

    @FindBy(id = "//*[@id='message']")
    public WebElement messageInputField;

    @FindBy(id = "//*[@id='submitMessage']")
    private WebElement sendButton;

    @FindBy(xpath = "//*[@id='center_column']/p")
    public WebElement customerServiceContactUsValidationMessage;

    public ContactUs() {
        //webDriverWait.until(ExpectedConditions.urlContains(url));
        PageFactory.initElements(driver, this);
    }

//    public void contactCustomerService(String subjectHeading, String emailAddress,
//                                       String orderReference, String message){
//        selectSubjectHeading(subjectHeading);
//        inputEmailAddress(emailAddress);
//        inputOrderReference(orderReference);
//        inputMessage(message);
//        clickSendButton();
//    }

    public void selectSubjectHeading(int subjectHeading){
    selectFromDropdownByIndex(subjectHeadingComboBox, subjectHeading);
    }

    public void inputEmailAddress(String emailAddress) {
        sendKeysToElement(emailAddressInputField, emailAddress);
    }

    public void inputOrderReference(String orderReference) {
        sendKeysToElement(orderReferenceNumberField, orderReference);
    }
    public void inputMessage(String message) {
        sendKeysToElement(messageInputField, message);
    }

    public void clickSendButton(){
        clickOnElement(sendButton);
    }
}
