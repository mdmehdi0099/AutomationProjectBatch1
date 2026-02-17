import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class LinkedInLogin {
    public static void main(String[] args) throws IOException, InterruptedException {
        //chrome driver initialization
        WebDriver driver=new ChromeDriver();
        //go to the linkedIn Url
        String url=GlobalConfig.get("linkedInURL");
        driver.get(url);
        driver.manage().window().maximize();

        Thread.sleep(2000);
        //click on signIn button
        WebElement signIn=driver.findElement(By.xpath("(//a[contains(text(),'Sign in')])[1]"));
        signIn.click();
        Thread.sleep(2000);
        //enter the credential
        ReadExcelFile readExcelFile=new ReadExcelFile();
        String username=readExcelFile.readDataFromExcel(1,0);
        String password=readExcelFile.readDataFromExcel(1,1);

        Thread.sleep(2000);
        WebElement user=driver.findElement(By.xpath("//input[@id='username']"));
        user.sendKeys(username);

        Thread.sleep(2000);
        WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
        pass.sendKeys(password);

        Thread.sleep(2000);
        //click on login btn
        WebElement loginBtn=driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
        loginBtn.click();

        Thread.sleep(5000);
        driver.quit();


    }
}
