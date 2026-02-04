import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class DropdownSelection {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@name='locale']")).click();

        WebElement dropdownElement=driver.findElement(By.xpath("//select[@name='locale']"));

        Select newSelect=new Select(dropdownElement);
        newSelect.selectByIndex(1);
        Thread.sleep(3000);
        driver.quit();
    }
}
