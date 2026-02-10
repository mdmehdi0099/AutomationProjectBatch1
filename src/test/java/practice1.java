import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {
    public static void main(String[] args) throws InterruptedException {
        //selenium manager

        WebDriver driver=new ChromeDriver();

        driver.get("https://mvnrepository.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.quit();

    }
}
