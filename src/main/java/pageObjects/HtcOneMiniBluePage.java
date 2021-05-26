package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HtcOneMiniBluePage
{
    public static WebDriver driver;


    @FindBy(xpath = "//span[text()=' $100.00 ']")
    public WebElement htcOneMiniBluePriceText;

    @FindBy(xpath = "(//button[text()='Add to cart'])[1]")
    public WebElement htcOneMiniBlueAddToCartButton;

    @FindBy(xpath = "(//button[text()='Add to compare list'])[1]")
    public WebElement htcOneMiniBlueAddToCompareListButton;

    @FindBy(xpath = "//p[text()='The product has been added to your ']")
    public WebElement addToCartMessage;

    @FindBy(linkText = "shopping cart")
    public WebElement addToShoppingCartMessage;

    @FindBy(linkText = "product comparison")
    public WebElement addToCompareListMessage;


    //initialization
    public HtcOneMiniBluePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //actions
    public WebElement getHtcOneMiniBluePriceText() {
        return htcOneMiniBluePriceText;
    }

    public WebElement getHtcOneMiniBlueAddToCartButton() {
        return htcOneMiniBlueAddToCartButton;
    }

    public WebElement getHtcOneMiniBlueAddToCompareListButton() {
        return htcOneMiniBlueAddToCompareListButton;
    }

    public void getAddToCartMessage() {
        System.out.println(addToCartMessage.getText());
    }

    public void getAddToShoppingCartMessage() {
        System.out.println(addToShoppingCartMessage.getText());
    }

    public void clickOnShoppingCartMessageText(){
        addToShoppingCartMessage.click();
    }

    public void getaddToCompareListMessage() {
        System.out.println(addToCompareListMessage.getText());
    }

    public void clickOnProductComparisionLink(){
        addToCompareListMessage.click();
    }


}
