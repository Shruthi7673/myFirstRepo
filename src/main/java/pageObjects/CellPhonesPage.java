package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonesPage
{
    public static WebDriver driver;
    //product links
    @FindBy(linkText = "HTC One M8 Android L 5.0 Lollipop")
    public WebElement htcOneM8AndroidLLink;

    @FindBy(linkText = "HTC One Mini Blue")
    public WebElement htcOneMiniBlueLink;

    @FindBy(linkText = "Nokia Lumia 1020")
    public WebElement nokiaLumia1020Link;

    //product price
    @FindBy(xpath = "//span[text()='$245.00']")
    public WebElement htcOneM8AndroidLPriceText;

    @FindBy(xpath = "//span[text()='$100.00']")
    public WebElement htcOneMiniBluePriceText;

    @FindBy(xpath = "//span[text()='$349.00']")
    public WebElement nokiaLumia1020PriceText;

    //product add to cart buttons
    @FindBy(xpath = "(//button[text()='Add to cart'])[1]")
    public WebElement htcOneM8AndroidLAddToCartButton;

    @FindBy(xpath = "(//button[text()='Add to cart'])[2]")
    public WebElement htcOneMiniBlueAddToCartButton;

    @FindBy(xpath = "(//button[text()='Add to cart'])[2]")
    public WebElement nokiaLumia1020AddToCartButton;

    //product compare list button
    @FindBy(xpath = "(//button[text()='Add to compare list'])[1]")
    public WebElement htcOneM8AndroidLAddToCompareListButton;

    @FindBy(xpath = "(//button[text()='Add to compare list'])[2]")
    public WebElement htcOneMiniBlueAddToCompareListButton;

    @FindBy(xpath = "(//button[text()='Add to compare list'])[3]")
    public WebElement nokiaLumia1020AddToCompareListButton;

    //product Add to wish list button
    @FindBy(xpath = "(//button[text()='Add to wishlist'])[1]")
    public WebElement htcOneM8AndroidLAddToWishListButton;

    @FindBy(xpath = "(//button[text()='Add to wishlist'])[2]")
    public WebElement htcOneMiniBlueAddToWishListButton;

    @FindBy(xpath = "(//button[text()='Add to wishlist'])[3]")
    public WebElement nokiaLumia1020AddToWishListButton;

    //product ratings
    @FindBy(xpath = "(//div[@class='product-rating-box']//div[@class='rating'])[1]")
    public WebElement htcOneM8AndroidLRatingStars;

    @FindBy(xpath = "(//div[@class='product-rating-box']//div[@class='rating'])[2]")
    public WebElement htcOneMiniBlueRatingStars;

    @FindBy(xpath = "(//div[@class='product-rating-box']//div[@class='rating'])[3]")
    public WebElement nokiaLumia1020RatingStars;

    //initialization
    public CellPhonesPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    //actions on links
    public WebElement getHtcOneM8AndroidLLink() {
        return htcOneM8AndroidLLink;
    }

    public WebElement getHtcOneMiniBlueLink() {
        return htcOneMiniBlueLink;
    }

    public WebElement getNokiaLumia1020Link() {
        return nokiaLumia1020Link;
    }

    //actions on add to cart button
    public WebElement getHtcOneM8AndroidLAddToCartButton() {
        return htcOneM8AndroidLAddToCartButton;
    }

    public WebElement getHtcOneMiniBlueAddToCartButton() {
        return htcOneMiniBlueAddToCartButton;
    }

    public WebElement getNokiaLumia1020AddToCartButton() {
        return nokiaLumia1020AddToCartButton;
    }

    //actions on add to wishlist button
    public WebElement getHtcOneM8AndroidLAddToWishListButton() {
        return htcOneM8AndroidLAddToWishListButton;
    }

    public WebElement getHtcOneMiniBlueAddToWishListButton() {
        return htcOneMiniBlueAddToWishListButton;
    }

    public WebElement getNokiaLumia1020AddToWishListButton() {
        return nokiaLumia1020AddToWishListButton;
    }

    //actions on add to compare list button
    public WebElement getHtcOneM8AndroidLAddToCompareListButton() {
        return htcOneM8AndroidLAddToCompareListButton;
    }

    public WebElement getHtcOneMiniBlueAddToCompareListButton() {
        return htcOneMiniBlueAddToCompareListButton;
    }

    public WebElement getNokiaLumia1020AddToCompareListButton() {
        return nokiaLumia1020AddToCompareListButton;
    }



}
