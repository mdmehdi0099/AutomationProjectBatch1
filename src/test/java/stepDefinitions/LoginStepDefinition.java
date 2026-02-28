package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.LoginPageFactory;
import utility.GlobalConfig;


public class LoginStepDefinition {

    //chrome driver initialization
    WebDriver driver;
    LoginPageFactory loginPageFactory;
    @After
    public void tearDown(){
        System.out.println("@After");
        driver.quit();
    }
    @Before
    public void setup(){
        driver=new ChromeDriver();
        loginPageFactory=new LoginPageFactory(driver);
        System.out.println("@Before");
    }

    @Given("The user is on the linkedIn {string} page")
    public void the_user_is_on_the_linked_in_page(String url) throws InterruptedException {
        //go to the linkedIn Url
        //String url= GlobalConfig.get("linkedInURL");
        driver.get(url);
        driver.manage().window().maximize();
        //Thread.sleep(2000);
        //click on signIn button
        loginPageFactory.clickOnSign();
    }
    @When("The user enters the username {string} and password {string}")
    public void the_user_enters_the_username_and_password(String username, String password) throws InterruptedException {
        //Thread.sleep(2000);
        loginPageFactory.enterUsername(username);
        //Thread.sleep(2000);
        loginPageFactory.enterPassword(password);
    }
    @When("The user will click on the login button")
    public void the_user_will_click_on_the_login_button() throws InterruptedException {
        //Thread.sleep(2000);
        //click on login btn
        loginPageFactory.clickOnLoginBtn();
    }
    @Then("The user should be redirected to the Home Page {string}")
    public void the_user_should_be_redirected_to_the_home_page(String string) {
        System.out.println("The user is on the homepage");

    }





}
