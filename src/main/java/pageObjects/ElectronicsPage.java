package pageObjects;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

public class ElectronicsPage
{

    public static WebDriver driver;

    @FindBy(linkText = "Electronics")
    public  WebElement electronicsLink;

    @FindBy(linkText="Camera & photo")
    public WebElement camaraAndPhotoLink;

    @FindBy(linkText = "Cell phones")
    public WebElement CellPhonesLink;

    @FindBy(linkText = "Others")
    public WebElement OthersLink;

    //initialization
    public ElectronicsPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


   public void clickOnElectronicsLink(){
        electronicsLink.click();
   }

    public void clickOnCamaraAndPhotosLink(){
        camaraAndPhotoLink.click();
    }

    public void clickOnCellPhonesLink(){
        CellPhonesLink.click();
    }

    public void clickOnOthersLink(){
        OthersLink.click();
    }

}
