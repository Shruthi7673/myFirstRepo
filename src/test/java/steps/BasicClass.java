package steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import utils.DriverFactory;

public class BasicClass
{
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com");

        WebElement ele=driver.findElement(By.linkText("Electronics"));
        Actions act=new Actions(driver);
        act.moveToElement(ele).perform();
        driver.findElement(By.linkText("Camera & photo")).click();
        driver.findElement(By.linkText("Leica T Mirrorless Digital Camera")).click();
       String s= driver.findElement(By.name("addtocart_16.EnteredQuantity")).getAttribute("value");
        System.out.println(s);
    }
}
