package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.LoginPageFactory;
import utility.GlobalConfig;
import java.util.logging.Logger;


public class LoginStepDefinition {
    private static final Logger logger= Logger.getLogger(LoginStepDefinition.class.getName());
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


    @Given("The user is on the amazon site {string}")
    public void the_user_is_on_the_amazon_site(String string) {
        //System.out.println("The user is on the amazon site {string}");
        logger.info("The user is on the amazon site");
    }
    @Given("The user will enter the username {string} and password {string} on the amazon login page")
    public void the_user_will_enter_the_username_and_password_on_the_amazon_login_page(String string, String string2) {
        //System.out.println("The user will enter the username {string} and password {string} on the amazon login page");
        logger.info("The user will enter the username  and password  on the amazon login page");
    }
    @Given("The user click on the login button")
    public void the_user_click_on_the_login_button() {
        //System.out.println("The user click on the login button");
        logger.info("The user click on the login button");

    }
    @Given("The user will search the item {string} on the amazon")
    public void the_user_will_search_the_item_on_the_amazon(String string) {
        logger.info("The user will search the item  on the amazon");
    }
    @When("The user will add the product on cart")
    public void the_user_will_add_the_product_on_cart() {
        logger.info("The user will add the product on cart");

    }
    @Then("The product should be visible on the cart")
    public void the_product_should_be_visible_on_the_cart() {
        logger.info("The product should be visible on the cart");
    }






}
