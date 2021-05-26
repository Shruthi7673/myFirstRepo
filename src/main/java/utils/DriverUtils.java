package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverUtils
{
    public void navigateToUrl(String url)
    {
        DriverFactory.driver.navigate().to(url);
    }

    public void pageRefresh()
    {
        DriverFactory.driver.navigate().refresh();
    }

    public String getPageTitle()
    {
       return DriverFactory.driver.getTitle();
    }

    //actions
    public void actions(){
        Actions act=new Actions(DriverFactory.driver);
    }

    public void select(WebElement ele){
        Select sel=new Select(ele);
    }

    //waiting conditions
    public void waitForVisibilityOfWebElement(WebElement locator){
        WebDriverWait wait=new WebDriverWait(DriverFactory.driver,40);
        wait.until(ExpectedConditions.visibilityOf(locator));
    }

    public void waitForWebElementToBeClickable(WebElement locator){
        WebDriverWait wait=new WebDriverWait(DriverFactory.driver,40);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void waitForPresenceOFElementLocatedBy(By locator){
        WebDriverWait wait=new WebDriverWait(DriverFactory.driver,40);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }


}
