package starter.register;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class generateTokenSteps {
    @Steps
    generateToken generateToken;


    @When("I input username and password base on register account")
    public void i_input_username_and_password_base_on_register_account() {
        generateToken.setBodyReq();
    }

    @When("I click generate button")
    public void i_click_generate_button() {
        generateToken.hitEndpointGT();
    }

    @Then("I got the token")
    public void i_got_the_token() {
        generateToken.valdateEndpointGT();
    }
}
