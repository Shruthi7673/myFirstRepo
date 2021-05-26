package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductEmailAfirendPage
{

    public static WebDriver driver;

    @FindBy(id = "FriendEmail")
    public WebElement friendEmailTextBox;

    @FindBy(id = "PersonalMessage")
    public WebElement personalMessageTextBox;

    @FindBy(xpath = "//button[text()='Send email']")
    public WebElement sendEmailButton;

    @FindBy(id="FriendEmail-error")
    public WebElement friendEmailErrorMessage;

    @FindBy(css = ".result:nth-of-type(2)")
    public WebElement messageSentText;


    //initialization
    public ProductEmailAfirendPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //actions
    public WebElement getFriendEmailTextBox() {
        return friendEmailTextBox;
    }

    public WebElement getPersonalMessageTextBox() {
        return personalMessageTextBox;
    }

    public WebElement getSendEmailButton() {
        return sendEmailButton;
    }

    public WebElement getFriendEmailErrorMessage() {
        return friendEmailErrorMessage;
    }


    public WebElement getMessageSentText() {
        return messageSentText;
    }

}
