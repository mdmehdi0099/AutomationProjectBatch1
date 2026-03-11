import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassDay3 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello from day 3");
        //Browser setup
        //chrome
        //firefox
        //edge

        //Webdriver
        //Launch a browser
        //navigate
        //Manages browser actions(back/forward/refresh)
        //find elements
        //Handles windows/tabs, alerts,frames
        //provides access to waits,cookies, etc

        /*
        //Technique 1:
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://automationpracticehub.com/");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(5000);
        String title=driver.getTitle();
        System.out.println("The value of title is :"+title);
        driver.quit();

         */

        //Technique 2:
        WebDriver driver=new ChromeDriver();
        driver.get("https://automationpracticehub.com/");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(5000);

        String title=driver.getTitle();//to get the title
        //to fetch the url
        String url=driver.getCurrentUrl();
        //navigate back
        driver.navigate().back();
        //navigate forward
        driver.navigate().forward();
        //to maximize the window
        driver.manage().window().maximize();


        System.out.println("The value of title is :"+title);
        driver.quit();




    }
}
