import org.openqa.selenium.*;
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


        /*
        driver.findElement(By.xpath("//select[@name='locale']")).click();
        WebElement dropdownElement=driver.findElement(By.xpath("//select[@name='locale']"));

        Select newSelect=new Select(dropdownElement);
        //newSelect.selectByIndex(1);
        newSelect.selectByValue("/es");
        Thread.sleep(3000);

         */


        //select the option by keyboard
        driver.findElement(By.xpath("//select[@name='locale']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@name='locale']")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@name='locale']")).sendKeys(Keys.ENTER);

        Thread.sleep(3000);

        //Handling Alerts in selenium
        //Text,Accept(OK),Deny(cancel)
        Alert alert=driver.switchTo().alert();
        alert.accept();//ok
        alert.dismiss();//cancel


        alert.sendKeys("ok please proceed");//to enter any text in alert

        //get text of alert
        String alertText=alert.getText();
        if (alertText.equalsIgnoreCase("Success")){
            System.out.println("Successfully submitted");
        }else{
            System.out.println("Failure alert message");
        }









        driver.quit();



    }
}
