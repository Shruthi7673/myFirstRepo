package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.DriverFactory;

public class BillingAddressPage
{
    public static WebDriver driver;

    @FindBy(xpath = "(//button[text()='Continue'])[1]")
    public WebElement continueButton;

    @FindBy(xpath = "//span[text()='First name is required.']")
    public WebElement firstNameRequiredErrorMessage;

    @FindBy(id="BillingNewAddress_FirstName")
    public WebElement firstNmaeTextBox;

    @FindBy(id="BillingNewAddress_LastName")
    public WebElement lastNmaeTextBox;

    @FindBy(id="BillingNewAddress_Email")
    public WebElement emailTextBox;

    @FindBy(id="BillingNewAddress_CountryId")
    public WebElement countryDropDown;

    @FindBy(id="BillingNewAddress_City")
    public WebElement cityTextBox;

    @FindBy(id="BillingNewAddress_Address1")
    public WebElement address1TextBox;

    @FindBy(id="BillingNewAddress_ZipPostalCode")
    public WebElement zipOrPostalextBox;

    @FindBy(id="BillingNewAddress_PhoneNumber")
    public WebElement phoneNumberTextBox;

    @FindBy(xpath = "//option[text()='qweqwe qwqweqwe, dsfgdfgsdfg, dfsdgdsfg sdfgsdfg, Afghanistan']")
    public WebElement billingAddressDropDown;

    @FindBy(css = ".section:nth-of-type(2)")
    public WebElement selectOrWriteAddress;

    //initialization
    public BillingAddressPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    //actions
    public WebElement getContinueButton() {
        return continueButton;
    }

    public WebElement getFirstNameRequiredErrorMessage(){
       return firstNameRequiredErrorMessage;
    }

    public WebElement getFirstNmaeTextBox() {
        return firstNmaeTextBox;
    }

    public WebElement getLastNmaeTextBox() {
        return lastNmaeTextBox;
    }

    public WebElement getEmailTextBox() {
        return emailTextBox;
    }

    public WebElement getCountryDropDown() {
        return countryDropDown;
    }

    public WebElement getCityTextBox() {
        return cityTextBox;
    }

    public WebElement getAddress1TextBox() {
        return address1TextBox;
    }

    public WebElement getZipOrPostalextBox() {
        return zipOrPostalextBox;
    }

    public WebElement getPhoneNumberTextBox() {
        return phoneNumberTextBox;
    }

    public String getAttributeValueOfBillingAddress(){
        String someText=billingAddressDropDown.getAttribute("value");
        return someText;
    }

    public String getAttributeValue(){
        String someText=firstNmaeTextBox.getAttribute("value");
        return someText;
    }


    public String getSelectOrWriteAddress() {
        String classValue=selectOrWriteAddress.getAttribute("class");
        System.out.println(classValue);
        return classValue;
    }




}
