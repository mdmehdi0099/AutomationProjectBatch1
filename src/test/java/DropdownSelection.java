import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

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

        //Handling frames in selenium
        driver.switchTo().frame(1);
        driver.switchTo().frame("google_esf");
        WebElement element1=driver.findElement(By.xpath(""));
        driver.switchTo().frame(element1);

        //returning back from frames
        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();

        //Handling windows in selenium
        String windowCurrent=driver.getWindowHandle();//current window
        System.out.println("Current window :"+windowCurrent);

        //get the list of windows
        Set<String> windowsList=driver.getWindowHandles();

        String parentWindow=driver.getWindowHandle();
        for(String window:windowsList){
            System.out.println("Window :"+window);
        }
        driver.switchTo().window("asdffsdf");


        //returning back to the main window
        driver.switchTo().window(parentWindow);



        //javascript executor
        //scroll
        WebElement scrollupto=driver.findElement(By.xpath("//h3[contains(text(),'Business Solutions')]"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",scrollupto);


        //to fetch the content/item stored in the local storage
        JavascriptExecutor js1=(JavascriptExecutor) driver;
        String token= (String) js1.executeScript("return window.localStorage.getItem('token');");
        System.out.println("The value of token stored in the local storage is : "+token);











        driver.quit();



    }
}
