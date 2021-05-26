package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Properties;

public class LoginPage
{
    public static WebDriver driver;
    public static Properties prop;

    @FindBy(id="Email")
    public WebElement emailId;

    @FindBy(id="Password")
    public WebElement password;

    @FindBy(xpath ="(//button[//text()='Log in'])[3]")
    public WebElement loginButton;

    //initialization
    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //actions
    public void enterEmailId(String em){
        emailId.sendKeys(em);
    }

    public void enterPassword(String pw){
        password.sendKeys(pw);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public String getPageTitle(){
        return(driver.getTitle());
    }
}
