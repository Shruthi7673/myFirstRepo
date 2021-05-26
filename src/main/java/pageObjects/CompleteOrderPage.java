package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompleteOrderPage
{
    public static WebDriver driver;

    @FindBy(xpath = "//strong[text()='Your order has been successfully processed!']")
    public WebElement ordermessageText;

    @FindBy(css = ".order-number>strong")
    public WebElement orderNumberText;

    @FindBy(linkText = "Click here for order details.")
    public WebElement clickForOrderDetailsLink;

    //initialization
    public CompleteOrderPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //actions
    public WebElement getOrdermessageText() {
        return ordermessageText;
    }

    public WebElement getOrderNumberText() {
        return orderNumberText;
    }

    public WebElement getClickForOrderDetailsLink() {
        return clickForOrderDetailsLink;
    }

}
