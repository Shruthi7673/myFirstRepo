package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NikonD5500DSLRPage
{
    public static WebDriver driver;

    @FindBy(xpath = "(//button[text()='Add to cart'])[1]")
    public WebElement nikonBlackAddToCartButton;

    @FindBy(xpath = "(//button[text()='Add to cart'])[1]")
    public WebElement nikonRedAddToCartButton;

    @FindBy(xpath = "//button[text()='Add to compare list']")
    public WebElement nikonAddToCompareListButton;

    @FindBy(xpath = "//button[text()='Email a friend']")
    public WebElement nikonEmailAFriendButton;

    @FindBy(xpath = "(//button[text()='Add to wishlist'])[1]")
    public WebElement nikonBlackAddToWishListButton;

    @FindBy(xpath = "(//button[text()='Add to wishlist'])[1]")
    public WebElement nikonRedAddToWishListButton;

    //initialization
    public NikonD5500DSLRPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //actions
    public void clickOnNikonBlackAddToCartButton(){
        nikonBlackAddToCartButton.click();
    }

    public void clickOnNikonRedAddToCartButton(){
        nikonRedAddToCartButton.click();
    }

    public void clickOnNikonAddToCompareListButton(){
        nikonAddToCompareListButton.click();
    }

    public void clickOnnikonEmailAFriendButton(){
        nikonEmailAFriendButton.click();
    }

    public void clickOnNikonBlackAddToWishListButton(){
        nikonBlackAddToWishListButton.click();
    }

    public void clickOnNikonRedAddToWishListButton(){
        nikonRedAddToWishListButton.click();
    }


}
