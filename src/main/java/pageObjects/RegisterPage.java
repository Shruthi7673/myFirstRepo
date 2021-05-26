package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage
{
    public static WebDriver driver;


    @FindBy(css="#gender-female")
    public WebElement femaleRadioButton;

    @FindBy(id="gender-male")
    public WebElement maleRadioButton;

    @FindBy(id="FirstName")
    public WebElement firstName;

    @FindBy(id="LastName")
    public WebElement lastName;

    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    public WebElement birthDateDay;

    @FindBy(id="Email")
    public WebElement emailId;

    @FindBy(id="Password")
    public WebElement password;

    @FindBy(id="ConfirmPassword")
    public WebElement confirmPass;

    @FindBy(id="register-button")
    public WebElement registerButton;

    @FindBy(xpath = "//div[text()='Your registration completed']")
    public WebElement registrationSuccessMsg;

    @FindBy(linkText = "Log out")
    public WebElement logoutLink;

    public RegisterPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void clickFemaleradioButton(){
        femaleRadioButton.click();
    }

    public void clickMaleradioButton(){
        maleRadioButton.click();
    }

    public void enterFirstName(String fn){
        firstName.sendKeys(fn);
    }

    public void enterLastName(String ln){
        lastName.sendKeys(ln);
    }

    public void enetrBirthDateDay(String dateDay){
        Select sel=new Select(birthDateDay);
        sel.selectByVisibleText(dateDay);
    }

    public void enterEmailId(String emailReg){
        emailId.sendKeys(emailReg);
    }

    public void enterPassword(String pwd){
        password.sendKeys(pwd);
    }

    public void enterConfirmPassword(String confmpwd){
        confirmPass.sendKeys(confmpwd);
    }

    public void clickRegisterButton(){
        registerButton.click();
    }

    public void waitForRegConfirmMessage(){
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOf(registrationSuccessMsg));
    }

    public String getSuccessfulregistrationMessage(){

        return registrationSuccessMsg.getText();
    }

    public void clickOnLogoutLink(){

        logoutLink.click();
    }



}
