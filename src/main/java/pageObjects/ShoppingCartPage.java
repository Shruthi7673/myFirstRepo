package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage
{
    public static WebDriver driver;

    @FindBy(id = "termsofservice")
    public WebElement termsOfServiceCheckbox;

    @FindBy(id = "checkout")
    public WebElement checkOutButton;

    //initialization
    public ShoppingCartPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //actions
    public WebElement getTermsOfServiceCheckbox() {
        return termsOfServiceCheckbox;
    }

    public WebElement getCheckOutButton() {
        return checkOutButton;
    }

}
