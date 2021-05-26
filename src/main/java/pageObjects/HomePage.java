package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage
{
    public static WebDriver driver;

    //creating web elements
    @FindBy(linkText="Register")
    public WebElement registerLink;

    @FindBy(linkText="Log in")
    public WebElement loginLink;

    @FindBy(linkText = "Wishlist")
    public WebElement wishlistLink;

    @FindBy(linkText = "Shoppingcart")
    public WebElement shoppingcartLink;

    @FindBy(id = "small-searchterms")
    public WebElement searchTextBox;

    @FindBy(css = ".search-box-button")
    public WebElement searchButton;

    //to access the find by web elements we need to create
    public HomePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    //actions - operations performed using web elements

    public void clickONRegisterLink(){
        registerLink.click();
    }

    public void clickONLoginLink(){
       loginLink.click();
    }

    public void clickONWishlistLink(){
        wishlistLink.click();
    }

    public void clickONShoppingcartLink(){
        shoppingcartLink.click();
    }

    public void enterSearchText(String searchText){
        searchTextBox.sendKeys(searchText);
    }

    public void clickOnSearchButton(){
        searchButton.click();
    }

    public String getPageTitle(){
        return(driver.getTitle());
    }



    public void navigateToUrl(String url)
    {
        driver.navigate().to(url);
    }




}
