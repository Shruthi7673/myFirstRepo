package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmOrderPage
{
    public static WebDriver driver;

    @FindBy(xpath = "//button[text()='Confirm']")
    public WebElement confirmOrderButton;

    //initialization
    public ConfirmOrderPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //actions
    public WebElement getConfirmorderButton() {
        return confirmOrderButton;
    }
}
