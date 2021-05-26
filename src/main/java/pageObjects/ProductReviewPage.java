package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductReviewPage
{
    public static WebDriver driver;

    @FindBy(id="AddProductReview_Title")
    public WebElement reviewTitleTextBox;

    @FindBy(id="AddProductReview_ReviewText")
    public WebElement reviewTextTextBox;

    @FindBy(xpath = "//button[text()='Submit review']")
    public WebElement submitButton;

    @FindBy(css=".review-title>strong")
    public WebElement existingReview;

    @FindBy(xpath = "//span[text()='Review title is required.']")
    public WebElement reviewTitleRequiredErrorMessage;

    @FindBy(xpath = "//span[text()='Review text is required.']")
    public WebElement reviewTextRequiredErrorMessage;

    //initialization
    public ProductReviewPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //actions
    public WebElement getReviewTitleTextBox() {
        return reviewTitleTextBox;
    }

    public WebElement getReviewTextTextBox() {
        return reviewTextTextBox;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public WebElement getExistingReview() {
        return existingReview;
    }

    public WebElement getReviewTitleRequiredErrorMessage() {
        return reviewTitleRequiredErrorMessage;
    }

    public WebElement getReviewTextRequiredErrorMessage() {
        return reviewTextRequiredErrorMessage;
    }


}
