package starter.deleteUser;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.utils.Endpoint;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class deleteUser {
    Endpoint endpoint = new Endpoint();
    JSONObject requestParams;
    String token;
    String userId;


    @Step
    public void setBodyReq(){
        requestParams = new JSONObject();
        requestParams.put("userName","mantosimu");
        requestParams.put("password","P@ssw0rd1234");
    }

    @Step
    public void hitEndpointLogin(){
        SerenityRest
                .given()
                .header("Content-Type","application/json")
                .body(requestParams.toString())
                .when()
                .post(endpoint.LOGIN)
                .then()
                .statusCode(200);
        token = SerenityRest
                .then()
                .extract()
                .path("token");
        userId = SerenityRest
                .then()
                .extract()
                .path("userId");
    }
    @Step
    public void hitEndpointDeleteUser(){
        SerenityRest
                .given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer "+ token)
                .when()
                .delete(endpoint.DELETEUSER+userId)
                .then()
                .statusCode(204);
    }


    @Step
    public void valdateEndpointDelete(){
//        SerenityRest
//                .then()
//                .body(matchesJsonSchemaInClasspath("JSONSchema/deleteuser.json"));

    }
}