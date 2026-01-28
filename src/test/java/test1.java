import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
    public static void main(String[] args) throws InterruptedException {
        //selenium manager
        /*
        WebDriver driver=new ChromeDriver();

        driver.get("https://mvnrepository.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.quit();
         */

        //WebDriver Manager
        /*
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.get("https://mvnrepository.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.quit();
         */

        //Download chromeDriver and set system Property
        System.setProperty("webdriver.chrome.driver","E:\\BackenedAPI\\AutomationProject1\\src\\main\\resources\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://mvnrepository.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.quit();





    }
}
