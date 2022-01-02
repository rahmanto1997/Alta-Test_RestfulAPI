package starter.store;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ReplaceBookSteps {
    @Steps
    ReplaceBook ReplaceBook;

    @Given("I am on the put book bookstore page")
    public void i_am_on_the_put_book_bookstore_page() {

    }

    @When("I enter my username and password correctly for put a book")
    public void i_enter_my_username_and_password_correctly_for_put_a_book() {
        ReplaceBook.setBodyReq();
    }

    @When("I login first")
    public void i_login_first() {
        ReplaceBook.hitEndpointLogin();
    }

    @When("I click edit book button")
    public void i_click_edit_book_button() {
        ReplaceBook.hitEndpointPutBook();
    }

    @Then("I suceed to edit a book on my profile")
    public void i_suceed_to_edit_a_book_on_my_profile() {
        ReplaceBook.valdateEndpointPutBook();
    }

    @Then("I check the book")
    public void i_check_the_book() {
        ReplaceBook.hitEndpointGetUser();
    }
}
