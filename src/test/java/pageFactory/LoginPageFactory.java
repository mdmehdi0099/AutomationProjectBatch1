package pageFactory;

import hooks.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory{
    WebDriver driver;
    public LoginPageFactory(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//a[contains(text(),'Sign in')])[1]")
    WebElement signIn;

    public void clickOnSign(){
        signIn.click();
    }
    @FindBy(xpath = "//input[@id='username']")
    WebElement username;

    public void enterUsername(String Username){
        username.sendKeys(Username);
    }

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    public void enterPassword(String Password){
        password.sendKeys(Password);
    }

    @FindBy(xpath = "//button[contains(text(),'Sign in')]")
    WebElement loginBtn;

    public void clickOnLoginBtn(){
        loginBtn.click();
    }





}
