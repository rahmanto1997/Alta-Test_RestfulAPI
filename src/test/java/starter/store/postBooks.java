package starter.store;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.utils.Endpoint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;


public class postBooks {
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
    public void hitEndpointPostBook(){
        Map<String,Object> requestJson = new HashMap<>();
        requestJson.put("userId", userId);
        requestJson.put("collectionOfIsbns", new ArrayList<Object>(){
            {
                add(new HashMap<String,Object>(){
                    {
                        put("isbn","9781593277574");
                    }
                });
            }
        });
        SerenityRest
                .given()
                .header("Content-Type","application/json")
                .header("Authorization","Bearer " +token)
                .body(requestJson)
                .when()
                .post(endpoint.POSTBOOKS)
                .then()
                .statusCode(201);
    }


//    @Step
//    public void valdateEndpointGetListBook(){
//        SerenityRest
//                .then()
//                .body(matchesJsonSchemaInClasspath("JSONSchema/postbooks.json"));
//
//    }

}
