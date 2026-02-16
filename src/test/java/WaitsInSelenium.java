import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class WaitsInSelenium {
    private static volatile boolean bool1=true;

    public static void main(String[] args) throws InterruptedException {
        boolean bool2;
        Boolean bool3;


        //wait
        //Implicit wait/
        //Implicit wait tells the Selenium WebDriver to poll the DOM for a certain amount of time when
        //trying to find the element before throwing NoSuchElementException.
        //poll=Keep checking the DOM repeatedly at fixed intervals until the element appears or timeout happens.
        // every 500 miliseconds is the polling time
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.linkedin.com/home");
        driver.manage().window().maximize();

        //defining the implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //defining the explicit wait
        //An Explicit wait is a type of wait in selenium webDriver that allows us to wait for a specific condition to occur
        //before continiuting the execution
        //condition
        //certain of time
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(100));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(text(),'Sign In')])[2]")));

        //Fluent wait
        //Duration
        //poll time
        //timeout
        Wait<WebDriver> wait2=new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(100))
                .pollingEvery(Duration.ofSeconds(1));

        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(text(),'Sign In')])[2]")));


        String url = driver.getCurrentUrl();
        String title = driver.getTitle();
        System.out.println("Title is :" + title);
        if (title.contains("Sign Up | LinkedIn")) {
            driver.findElement(By.xpath("//input[@id='email-or-phone']")).sendKeys("abc@gmail.com");
            System.out.println("email or phone is entered");
        } else {

            System.out.println("The browser is not redirected to the login page");
        }

        driver.quit();
    }
}
