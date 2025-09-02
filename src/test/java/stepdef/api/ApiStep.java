package stepdef.api;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.api.ApiPage;

public class ApiStep {
    ApiPage apiPage;

    public ApiStep(){
        this.apiPage = new ApiPage();
    }

    @Given("prepare url for {string}")
    public void prepareUrlFor(String url) {
       apiPage.prepareUrlFor(url);
    }

    @When("hit api get specific user")
    public void hitApiGetSpecificUser() {
        apiPage.hitApiGetSpecificUser();
    }

    @Then("validation status code is equals {int}")
    public void validationStatusCodeIsEquals(int status_code) {
        apiPage.validationStatusCode(status_code);
    }

    @And("validation response body get specific user")
    public void validationResponseBodyGetSpecificUser() {
        apiPage.validationResponseBodyGetSpecificUser();
    }

    @And("validation response json with JsonSchema {string}")
    public void validationResponseJsonWithJSONSchema(String filename) {
        apiPage.validationResponseJsonWithJSONSchema(filename);
    }

    @When("hit api get list tag")
    public void hitApiGetListTag() {
        apiPage.hitApiGetListTag();
    }

    @And("validation response body get list tag")
    public void validationResponseBodyGetListTag() {
        apiPage.validationResponseBodyGetListTag();
    }

    @When("hit api post create new user")
    public void hitApiPostCreateNewUser() {
        apiPage.hitApiPostCreateNewUser();
    }

    @And("validation response body post create new user")
    public void validationResponseBodyPostCreateNewUser() {
        apiPage.validationResponseBodyPostCreateNewUser();
    }

    @And("hit api update data")
    public void hitApiUpdateData() {
        apiPage.hitApiUpdateData();
    }

    @And("validation response body update user")
    public void validationResponseBodyUpdateUser() {
        apiPage.validationResponseBodyUpdateUser();
    }

    @And("hit api delete new user")
    public void hitApiDeleteNewUser() {
        apiPage.hitApiDeleteNewUser();
    }

    @And("validation response body delete user")
    public void validationResponseBodyDeleteUser() {
        apiPage.validationResponseBodyDeleteUser();
    }
}
