package pageFactory;

import hooks.BaseClass;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPageFactory{
    WebDriver driver;
    //explicit wait listener
    WebDriverWait wait;

    public LoginPageFactory(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        this.wait=new WebDriverWait(driver,Duration.ofSeconds(300));
    }

    @FindBy(xpath = "(//a[contains(text(),'Sign in')])[1]")
    WebElement signIn;

    public void clickOnSign(){
        wait.until(ExpectedConditions.elementToBeClickable(signIn));
        signIn.click();
    }
    @FindBy(xpath = "//input[@id='username']")
    WebElement username;

    public void enterUsername(String Username){
        wait.until(ExpectedConditions.elementToBeClickable(username));
        username.sendKeys(Username);
    }

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    public void enterPassword(String Password){
        wait.until(ExpectedConditions.elementToBeClickable(password));
        password.sendKeys(Password);
    }

    @FindBy(xpath = "//button[contains(text(),'Sign in')]")
    WebElement loginBtn;

    public void clickOnLoginBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
        loginBtn.click();
    }


}
