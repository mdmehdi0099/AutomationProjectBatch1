package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageFactory {

    @FindBy(xpath = "(//a[contains(text(),'Sign in')])[1]")
    WebElement signInBtn;

    public void clickOnSignInBtn(){
    signInBtn.click();
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
    WebElement login;
    public void clickLoginBtn(){
    login.click();
    }







}
