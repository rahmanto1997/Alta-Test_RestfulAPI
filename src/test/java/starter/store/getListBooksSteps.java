package starter.store;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class getListBooksSteps {
    @Steps
    getListBooks getListBooks;

    @Given("I am on the login bookstore page")
    public void i_am_on_the_login_bookstore_page() {
    }

    @When("I enter my username and password correctly for get list book")
    public void i_enter_my_username_and_password_correctly_for_get_list_book() {
    }

    @When("I click Show List button")
    public void i_click_Show_List_button() {
        getListBooks.hitEndpointGetListBook();
    }

    @Then("I got list of All Books")
    public void i_got_list_of_All_Books() {
        getListBooks.valdateEndpointGetListBook();
    }
}