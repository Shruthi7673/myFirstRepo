package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompareProductsPage
{
    public static WebDriver driver;

    @FindBy(css = ".clear-list")
    public WebElement clearListButton;

    @FindBy(xpath = "//div[text()='You have no items to compare.']")
    public WebElement noItemsToCompareText;


    //initialization
    public CompareProductsPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //actions
    public WebElement getClearListButton() {
        return clearListButton;
    }

    public WebElement getNoItemsToCompareText() {
        return noItemsToCompareText;
    }
}
