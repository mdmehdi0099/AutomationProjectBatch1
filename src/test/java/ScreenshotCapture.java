import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotCapture {

    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.linkedin.com/home");
        Thread.sleep(3000);
        takeSnapshot(driver,"LinkedIn");
        Thread.sleep(2000);
        driver.quit();

    }

    public static String takeSnapshot(WebDriver driver,String filename) throws IOException {
        //create a folder where screenshot is stored if not found
        Path folder= Paths.get(System.getProperty("user.dir")+"/src/test/resources/snapshot");
        Files.createDirectories(folder);

        //TimeStamps for unique file names
        String timeStamp=new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String fullFileName=filename+"_"+timeStamp+".png";

        //capture the screenshot
        File screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        //save to the desired location
        Path destinationFolder=folder.resolve(fullFileName);
        Files.copy(screenshot.toPath(),destinationFolder, StandardCopyOption.REPLACE_EXISTING);

        return destinationFolder.toAbsolutePath().toString();
    }

}
