package starter.store;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.utils.Endpoint;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class ReplaceBook {
    Endpoint endpoint = new Endpoint();
    JSONObject requestParams;
    JSONObject requestJson;
    String token;
    String userId;
    String isbn1 = "9781593277574";
    String isbn2 = "9781449325862";

    @Step
    public void setBodyReq(){
        requestParams = new JSONObject();
        requestParams.put("userName","mantosims");
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
    public void hitEndpointPutBook(){
        requestJson = new JSONObject();
        requestJson.put("userId", userId);
        requestJson.put("isbn", isbn2);
        SerenityRest
                .given()
                .header("Content-Type","application/json")
                .header("Authorization","Bearer " +token)
                .body(requestJson)
                .when()
                .put(endpoint.PUTBOOK+isbn1)
                .then()
                .statusCode(200);
    }
    @Step
    public void hitEndpointGetUser(){
        SerenityRest
                .given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer "+ token)
                .when()
                .get(endpoint.GETUSERID+userId)
                .then()
                .statusCode(200);
    }


    @Step
    public void valdateEndpointPutBook(){
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/putbook.json"));

    }
}