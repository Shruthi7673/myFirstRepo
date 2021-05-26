package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NokiaLumia1020Page
{

    public static WebDriver driver;

    @FindBy(linkText = "Add your review")
    public WebElement writeReviewOnNokiaLumiaLink;

    @FindBy(linkText = "Be the first to review this product")
    public WebElement addReviewOnNokiaLumiaLink;

    @FindBy(xpath = "//span[text()=' $349.00 ']")
    public WebElement nokiaLumiaPriceText;

    @FindBy(xpath = "(//button[text()='Add to cart'])[1]")
    public WebElement nokiaLumiaAddToCartButton;

    @FindBy(xpath = "(//button[text()='Add to compare list'])[1]")
    public WebElement nokiaLumia1020AddToCompareListButton;

    @FindBy(css = ".product-no-reviews")
    public WebElement noReviews;

    @FindBy(css = ".product-review-links")
    public WebElement addReview;

    @FindBy(css = ".product-reviews-overview>div:nth-of-type(2)")
    public WebElement testele;

    //initialization
    public NokiaLumia1020Page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //actions
    public WebElement getWriteReviewOnNokiaLumiaLink() {
        return writeReviewOnNokiaLumiaLink;
    }

    public WebElement getAddReviewOnNokiaLumiaLink() {
        return addReviewOnNokiaLumiaLink;
    }

    public WebElement getNokiaLumiaPriceText() {
        return nokiaLumiaPriceText;
    }

    public WebElement getNokiaLumiaAddToCartButton() {
        return nokiaLumiaAddToCartButton;
    }

    public WebElement getNokiaLumia1020AddToCompareListButton() {
        return nokiaLumia1020AddToCompareListButton;
    }

    public String getNoReviews() {
       String noReview=noReviews.getAttribute("class");
       return noReview;
    }

    public String getAddReviews() {
        String getClassValue=addReview.getAttribute("class");
        System.out.println(getClassValue);
        return getClassValue;
    }

    public String getTestele() {
        String getClassValue=testele.getAttribute("class");
        System.out.println(getClassValue);
        return getClassValue;
    }



}
