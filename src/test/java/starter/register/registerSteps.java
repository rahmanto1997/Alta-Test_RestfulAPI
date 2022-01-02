package starter.register;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class registerSteps {
    @Steps
    register register;
    @Steps
    generateToken generateToken;
    @Given("I am on the register page")
    public void i_am_on_the_register_page() {
    }

    @When("I input my valid username and password")
    public void i_input_my_valid_username_and_password() {
        register.setBodyReq();
    }
    @When("I click register button")
    public void i_click_register_button() {
        register.hitEndpointRegister();
    }

    @Then("I am redirected to the profile")
    public void i_am_redirected_to_the_profile() {
        register.valdateEndpointRegister();
    }

    @When("I entered a registered account")
    public void i_entered_a_registered_account() {
        register.setBodyReqExisted();
    }

    @When("I click register button when account exist")
    public void i_click_register_button_when_account_exist() {
        register.hitEndpointRegisterFailed();
    }

    @Then("I am failed to registered account and show message that user exist")
    public void i_am_failed_to_registered_account_and_show_message_that_user_exist() {
        register.valdateEndpointRegisterFailed();
    }
}