package starter.store;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class deleteBookSteps {
    @Steps
    deleteBook deleteBook;
    @Given("I am on the login bookstore")
    public void i_am_on_the_login_bookstore() {
    }

    @When("I enter my username and password correctly for delete book")
    public void i_enter_my_username_and_password_correctly_for_delete_book() {
        deleteBook.setBodyReq();
    }

    @When("I click Login button to delete book")
    public void i_click_Login_button_to_delete_book() {
        deleteBook.hitEndpointLogin();
    }

    @Then("I click delete book button")
    public void i_click_delete_book_button() {
        deleteBook.hitEndpointDeleteBook();
    }
    @Then("I success to delete a book")
    public void i_success_to_delete_a_book() {
        deleteBook.hitEndpointGetUser();
    }
}
