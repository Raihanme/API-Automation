package starter.stepdefinition;

import User.Delete;
import User.Get;
import User.Post;
import User.Put;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UserSteps {
    @Steps
    Get get;

    @Steps
    Post post;

    @Steps
    Put put;

    @Steps
    Delete delete;

    @Given("I set GET endpoints")
    public void setGetEndpoints(){
        get.setGetEndpoints();

    }
    @When("I send GET HTTP request")
    public void getHTTPrequest(){
        get.getHTTPrequest();

    }
    @Then("I receive valid data for detail post")
    public void HTTPresponse200(){
        get.HTTPresponse200();

    }

    @And("I receive valid HTTP response code 200")
    public void valiData(){
        get.validData();

    }
    @Given("I set GET endpoints")
    public void setGetEndpoints(){
        get.setGetEndpoints();

    }
    @When("I send GET HTTP request")
    public void getHTTPrequest(){
        get.getHTTPrequest();

    }
    @Then("I receive valid data for detail post")
    public void HTTPresponse200(){
        get.HTTPresponse200();

    }

    @And("I receive valid HTTP response code 200")
    public void valiData(){
        get.validData();

    }

    @Given("I set POST api endpoints")
    public void setPostApiEndpoints(){
        post.setPostApiEndpoint();
    }

    @When("I send POST HTTP request")
    public void sendPostHttpRequest(){
        post.sendPostHTTPRequest();
    }

    @Then("I receive valid HTTP response code 201")
    public void receiveValidHttp201(){
        post.receiveHttpResponseCode201();

    }
    @And("I receive valid data for new post")
    public void validateDataNewUser(){
        post.validateDatanewUser();

    }

    @Given("I set PUT api endpoints")
    public void setPutApiEndpoints(){
        put.setPutApiEndpoints();

    }
    @When("I send PUT HTTP request")
    public void sendPutHttpRequest(){
        put.sendPutHttpRequest();

    }

    @And("I receive valid data for update post byu id")
    public void validateUpdatePost(){
        put.validateUpdateUser();

    }

    @Given("I set DELETE api endpoints")
    public void setDeleteApiEndpoints(){
        delete.setDeleteApiEndpoints();
    }
    @When("I send DELETE HTTP request")
    public void sendDeleteApiEndpoints(){
        delete.sendDeleteHttpRequest();
    }
    @Then("I receive valid HTTP response code 204")
    public void validateHttpResponseCode204(){
        delete.validateHttpResponse204();
    }



}
