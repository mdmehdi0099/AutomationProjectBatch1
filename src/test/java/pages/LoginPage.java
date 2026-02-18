package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.GlobalConfig;
import utility.ReadExcelFile;
import utility.TestData;

public class LoginPage {

    @Test(dataProvider = "loginData",dataProviderClass = TestData.class,priority = 5)
    public void linkedInLogin(String username,String password) throws InterruptedException {
        System.out.println("-------***********************------------");
        System.out.println("linkedIn login page");
        System.out.println("username is :"+username);
        System.out.println("password is :"+password);

        //chrome driver initialization
        WebDriver driver=new ChromeDriver();
        //go to the linkedIn Url
        String url= GlobalConfig.get("linkedInURL");
        driver.get(url);
        driver.manage().window().maximize();

        Thread.sleep(2000);
        //click on signIn button
        WebElement signIn=driver.findElement(By.xpath("(//a[contains(text(),'Sign in')])[1]"));
        signIn.click();
        Thread.sleep(2000);
        //enter the credential


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

    @Test(dataProvider = "loginData2",dataProviderClass = TestData.class,priority = 0)
    public void linkedInLogin2(String username) throws InterruptedException {
        System.out.println("-------------------");
        System.out.println("linkedIn login page");
        System.out.println("username is :"+username);
        //System.out.println("password is :"+password);
        System.out.println("priority 0");
        Assert.assertEquals(false,true);
        System.out.println("-------------------");


    }

    @Test(dataProvider = "loginData",dataProviderClass = TestData.class,priority = 1)
    public void linkedInLogin3(String username,String password) throws InterruptedException {
        System.out.println("-------------------");
        System.out.println("linkedIn login page");
        System.out.println("username is :"+username);
        System.out.println("password is :"+password);
        System.out.println("priority 1");
        System.out.println("-------------------");


    }






}
