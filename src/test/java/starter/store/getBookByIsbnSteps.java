package starter.store;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class getBookByIsbnSteps {
    @Steps
    getBookByIsbn getBookByIsbn;
    @Given("I am on the  bookstore page")
    public void i_am_on_the_bookstore_page() {
    }

    @When("I enter my username and password correctly for get a book")
    public void i_enter_my_username_and_password_correctly_for_get_a_book() {

    }

    @When("I click Show  button")
    public void i_click_Show_button() {
        getBookByIsbn.hitEndpointGetABook();
    }

    @Then("I got information about the Book")
    public void i_got_information_about_the_Book() {
        getBookByIsbn.valdateEndpointGetABook();
    }
}
