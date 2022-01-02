package starter.store;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.utils.Endpoint;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class getListBooks {
    Endpoint endpoint = new Endpoint();

    @Step
    public void hitEndpointGetListBook(){
        SerenityRest
                .given()
                .header("Content-Type","application/json")
                .when()
                .get(endpoint.GETALLBOOKS)
                .then()
                .statusCode(200);
    }

    @Step
    public void valdateEndpointGetListBook(){
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/getlistbooks.json"));

    }
}