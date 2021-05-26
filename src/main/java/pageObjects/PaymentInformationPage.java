package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentInformationPage
{
    public static WebDriver driver;

    @FindBy(xpath = "(//button[text()='Continue'])[5]")
    public WebElement continueButton;


    //initialization
    public PaymentInformationPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //actions
    public WebElement getContinueButton() {
        return continueButton;
    }
}
