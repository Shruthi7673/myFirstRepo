package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeicaTMirrorlessDigitalCamPage
{
    public static WebDriver driver;

    @FindBy(xpath = "//span[text()='In stock']")
        public WebElement checkforInStockText;

    @FindBy(xpath = "(//button[text()='Add to cart'])[1]")
    public WebElement leicaTMirrorlessCamAddToCartButton;

    @FindBy(xpath = "(//button[text()='Add to wishlist'])[1]")
    public WebElement leicaTMirrorlessCamAddToWishListButton;

    @FindBy(xpath = "//p[text()='The product has been added to your ']")
    public WebElement addToCartMessage;

    @FindBy(linkText = "shopping cart")
    public WebElement addToShoppingCartMessage;

    @FindBy(xpath="//p[text()='The product has been added to your ']")
    public WebElement wishListMessageText;


    //initialization
    public LeicaTMirrorlessDigitalCamPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement getCheckforInStockText() {
        return checkforInStockText;
    }

    public WebElement getLeicaTMirrorlessCamAddToCartButton() {
        return leicaTMirrorlessCamAddToCartButton;
    }


    public WebElement getLeicaTMirrorlessCamAddToWishListButton() {
        return leicaTMirrorlessCamAddToWishListButton;
    }


    public void getAddToCartMessage() {
        System.out.println(addToCartMessage.getText());
    }

    public void getAddToShoppingCartMessage() {
        System.out.println(addToShoppingCartMessage.getText());
    }

    public WebElement getWishListMessageText() {
        return wishListMessageText;
    }



}
