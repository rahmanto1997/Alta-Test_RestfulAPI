package starter.deleteUser;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class deleteUserSteps {
    @Steps
    deleteUser deleteUser;

    @Given("I am on the web page")
    public void i_am_on_the_web_page() {
    }

    @When("I enter my username and password correctly for delete")
    public void i_enter_my_username_and_password_correctly_for_delete() {
        deleteUser.setBodyReq();
    }

    @When("I click Login button")
    public void i_click_Login_button() {
        deleteUser.hitEndpointLogin();
    }

    @Then("I click delete button")
    public void i_click_delete_button() {
        deleteUser.hitEndpointDeleteUser();
    }

    @Then("I success to delete my account")
    public void i_success_to_delete_my_account() {
        deleteUser.valdateEndpointDelete();
    }
}