package starter.register;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.UsernamePWGenerator;
import starter.utils.Endpoint;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class generateToken {
    Endpoint endpoint = new Endpoint();
    JSONObject requestParams;
    String token;

    @Step
    public void setBodyReq(){
        requestParams = new JSONObject();
        requestParams.put("userName","mantosim");
        requestParams.put("password","P@ssw0rd1234");
    }
    @Step
    public void hitEndpointGT(){
        SerenityRest
                .given()
                .header("Content-Type","application/json")
                .body(requestParams.toString())
                .when()
                .post(endpoint.GENERATE)
                .then()
                .statusCode(200);
    }

    @Step
    public void valdateEndpointGT(){
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/generatetoken.json"));


    }
}