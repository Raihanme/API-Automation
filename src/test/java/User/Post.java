package User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class Post {

    protected String url = "https://jsonplaceholder.typicode.com/posts";

    @Step("I set POST endpoints")
    public String setPostApiEndpoint(){
        return url + "post/1"; }

    @Step("I send POST HTTP request")
    public void sendPostHTTPRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("id", "101");


        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());
    }

    @Step("I receive valid HTTP response code 201")
    public void receiveHttpResponseCode201(){

        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("I receive valid data for new post")
    public void validateDatanewUser(){
        restAssuredThat(response -> response.body("'name'", equalTo("morpheus")));
        restAssuredThat(response -> response.body("'job'", equalTo("leader")));
    }
}
