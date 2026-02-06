import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PageLoadStrategies {

    public static void main(String[] args) throws InterruptedException {




        //Page load Strategy=When webDriver decides navigation is "done"
        /*
        //1)Normal
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.orangehrm.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);


         */
        /*
        //2)Eager
        //page load slowly due the heavy images/analytics/resources
        ChromeOptions optionsEager=new ChromeOptions();
        optionsEager.setPageLoadStrategy(PageLoadStrategy.EAGER);

        WebDriver driver = new ChromeDriver(optionsEager);
        driver.get("https://www.orangehrm.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

         */

        //3)None
        //you want maximum speed and full control
        ChromeOptions optionsNone=new ChromeOptions();
        optionsNone.setPageLoadStrategy(PageLoadStrategy.NONE);

        WebDriver driver=new ChromeDriver(optionsNone);
        driver.get("https://www.orangehrm.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.quit();


    }
}
