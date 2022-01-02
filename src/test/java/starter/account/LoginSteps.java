package starter.account;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginSteps {

    @Steps
    Login login;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
    }

    @When("I enter my username and password correctly")
    public void i_enter_my_username_and_password_correctly() {
        login.setBodyReq();
    }

    @When("I click {string} button")
    public void i_click_button(String string) {
        login.hitEndpoindLogin();
    }

    @Then("I am taken to the timeline")
    public void i_am_taken_to_the_timeline() {
        login.valdateEndpointLogin();
    }

}
