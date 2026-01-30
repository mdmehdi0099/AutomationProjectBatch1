import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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

        WebDriverManager.chromedriver().setup();
        /*
        WebDriver driver=new ChromeDriver();
        driver.get("https://mvnrepository.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.quit();
         */

        //Download chromeDriver and set system Property
        //System.setProperty("webdriver.chrome.driver","E:\\BackenedAPI\\AutomationProject1\\src\\main\\resources\\chromedriver.exe");

        /*
        //headed: visual Testing
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.linkedin.com/home");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.quit();

         */

        /*
        //headless: Browser runs without showing UI
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--headless=new");

        WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.linkedin.com/home");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.quit();

         */

        /*
        //incognito
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--incognito");

        WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.linkedin.com/home");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.quit();

         */

        /*
        //Full Mode/kiosk
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--kiosk");

        WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.linkedin.com/home");
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.quit();

         */


        //Dynamic xpath
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.linkedin.com/home");
        driver.manage().window().maximize();


        String text1="Join now";
        String xpath1="(//a[contains(text(),'%s')])[2]";
        String xpath=String.format(xpath1,text1);
        System.out.println("Xpath value is : "+xpath);
        //mouse click=.click();
        //text type=.sendkeys("abc");
        driver.findElement(By.xpath(xpath)).click();
        Thread.sleep(4000);
        String url=driver.getCurrentUrl();
        String title=driver.getTitle();
        System.out.println("Title is :"+title);
        if (title.contains("Sign Up | LinkedIn")){
            Thread.sleep(4000);
            driver.findElement(By.xpath("//input[@id='email-or-phone']")).sendKeys("abc@gmail.com");
            System.out.println("email or phone is entered");
        }else{
            Thread.sleep(1000);
            System.out.println("The browser is not redirected to the login page");
        }


        Thread.sleep(3000);

        driver.quit();
















    }
}
