package starter.store;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.Endpoint;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class getBookByIsbn {
    Endpoint endpoint = new Endpoint();
    String isbn = "9781593275846";

    @Step
    public void hitEndpointGetABook(){
        SerenityRest
                .given()
                .header("Content-Type","application/json")
                .when()
                .get(endpoint.GETABOOKS+isbn)
                .then()
                .statusCode(200);
    }

    @Step
    public void valdateEndpointGetABook(){

    }
}
