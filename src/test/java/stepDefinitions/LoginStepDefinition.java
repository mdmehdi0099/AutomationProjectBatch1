package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
    @Given("The user is on the linkedIn {string} page")
    public void the_user_is_on_the_linked_in_page(String url) {
        System.out.println("The user is on the linkedIn {string} page:"+url);
    }
    @When("The user enters the username {string} and password {string}")
    public void the_user_enters_the_username_and_password(String username, String password) {
        System.out.println("The user enters the username {string} and password {string}:username: "+username+",:password: "+password);
    }
    @And("The user will click on the login button")
    public void the_user_will_click_on_the_login_button() {
        System.out.println("The user will click on the login button");
    }
    @Then("The user should be redirected to the Home Page {string}")
    public void the_user_should_be_redirected_to_the_home_page(String home) {
        System.out.println("The user should be redirected to the Home Page {string} :homeUrl:"+home);
    }

}
