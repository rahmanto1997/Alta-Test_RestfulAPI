package starter.store;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class deleteAllBookSteps {
    @Steps
    deleteAllBook deleteAllBook;

    @Given("I am on the demoqa page")
    public void i_am_on_the_demoqa_page() {

    }

    @When("I enter my username and password correctly for delete all book")
    public void i_enter_my_username_and_password_correctly_for_delete_all_book() {
        deleteAllBook.setBodyReq();
    }

    @When("I click Login button to delete all book")
    public void i_click_Login_button_to_delete_all_book() {
        deleteAllBook.hitEndpointLogin();
    }

    @Then("I click delete all book button")
    public void i_click_delete_all_book_button() {
        deleteAllBook.hitEndpointDeleteAllBook();
    }

    @Then("I success to delete all my list book")
    public void i_success_to_delete_all_my_list_book() {
        deleteAllBook.hitEndpointGetUser();
    }
}