package starter.store;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class postBooksSteps {
    @Steps
    postBooks postBooks;

    @Given("I am on the login pages bookstore")
    public void i_am_on_the_login_pages_bookstore() {
    }

    @When("I enter my userId and isbn")
    public void i_enter_my_userId_and_isbn() {
        postBooks.setBodyReq();
    }

    @When("I click Post books")
    public void i_click_Post_books() {
        postBooks.hitEndpointLogin();
    }

    @Then("I succes to Post books")
    public void i_succes_to_Post_books() {
//        postBooks.valdateEndpointGetListBook();
    }
}
