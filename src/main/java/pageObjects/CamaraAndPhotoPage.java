package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

public class CamaraAndPhotoPage
{

    public static WebDriver driver;

    @FindBy(linkText = "Nikon D5500 DSLR")
    public WebElement nikonD5500dslrLink;

    @FindBy(linkText = "Leica T Mirrorless Digital Camera")
    public WebElement leicaTMirrorlessDigitalCamLink;

    @FindBy(linkText = "Apple iCam")
    public WebElement appleIcamLink;

    @FindBy(xpath = "//span[text()='From $630.00']")
    public WebElement priceTextNikon;

    @FindBy(xpath = "//span[text()='$530.00']")
    public WebElement priceTextLeica;

    @FindBy(xpath = "//span[text()='$1,300.00']")
    public WebElement priceTextApple;

    @FindBy(xpath = "(//button[text()='Add to cart'])[1]")
    public WebElement nikonAddToCartButton;

    @FindBy(xpath = "(//button[text()='Add to cart'])[2]")
    public WebElement leicaAddToCartButton;

    @FindBy(xpath = "(//button[text()='Add to compare list'])[1]")
    public WebElement nikonAddToCompareListButton;

    @FindBy(xpath = "(//button[text()='Add to compare list'])[2]")
    public WebElement leicaAddToCompareListButton;

    @FindBy(xpath = "(//button[text()='Add to compare list'])[3]")
    public WebElement appleICamAddToCompareListButton;

    //initialization
    public CamaraAndPhotoPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //actions
    public WebElement getNikonD5500dslrLink() {
        return nikonD5500dslrLink;
    }

    public WebElement getLeicaTMirrorlessDigitalCamLink() {
        return leicaTMirrorlessDigitalCamLink;
    }

    public WebElement getAppleIcamLink() {
        return appleIcamLink;
    }

    //product - price text
    public WebElement getPriceTextNikon() {
        return priceTextNikon;
    }

    public WebElement getPriceTextLeica() {
        return priceTextLeica;
    }

    public WebElement getPriceTextApple() {
        return priceTextApple;
    }

    //product - add to cart button
    public WebElement getNikonAddToCartButton() {
        return nikonAddToCartButton;
    }

    public WebElement getLeicaAddToCartButton() {
        return leicaAddToCartButton;
    }

    //product - add to compare list button
    public WebElement getNikonAddToCompareListButton() {
        return nikonAddToCompareListButton;
    }

    public WebElement getLeicaAddToCompareListButton() {
        return leicaAddToCompareListButton;
    }

    public WebElement getAppleICamAddToCompareListButton() {
        return appleICamAddToCompareListButton;
    }

}
