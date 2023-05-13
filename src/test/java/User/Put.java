package User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class Put {

    protected String url = "https://jsonplaceholder.typicode.com/posts/1";

    @Step("I set PUT api endpoints")
    public String setPutApiEndpoints(){
        return url + "/id/1";
    }
    @Step("I send PUT HTTP request")
    public void sendPutHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("id","1");


        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).put(setPutApiEndpoints());
    }
    @Step("I receive valid data for update post by id")
    public void validateUpdateUser(){
        restAssuredThat(response -> response.body("'i'", equalTo("1")));

    }
}
