package starter.store;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.utils.Endpoint;

public class deleteBook {
    Endpoint endpoint = new Endpoint();
    JSONObject requestParams;
    JSONObject requestJson;
    String token;
    String userId;
    String isbn = "9781449325862";

    @Step
    public void setBodyReq(){
        requestParams = new JSONObject();
        requestParams.put("userName","hilmifuad239");
        requestParams.put("password","Kembalisuci97@");
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
    public void hitEndpointDeleteBook(){
        requestJson = new JSONObject();
        requestJson.put("isbn", isbn);
        requestJson.put("userId", userId);
        SerenityRest
                .given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer "+ token)
                .when()
                .delete(endpoint.DELETEABOOK)
                .then()
                .statusCode(204);
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

}
