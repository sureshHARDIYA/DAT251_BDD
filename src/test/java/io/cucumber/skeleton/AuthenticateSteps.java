package io.cucumber.skeleton;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AuthenticateSteps {
    private  String welcomeMessage;
    private  String username;
    private  String password;


    @Given("I visit {string}")
    public void iVisit(String arg0) {
        System.out.println("You are on the login page.");
    }

    @Given("the user is on the login page")
    public void theUserHasAValidUsernameAndPassword() {
    }

    @When("I enter {string} in the username field")
    public void iEnterInTheUsernameField(String user) {
        this.username = user;
    }

    @When("I enter {string} in the password field")
    public void iEnterInThePasswordField(String pass) {
        this.password = pass;
    }

    @And("I press the login button")
    public void iPressTheButton() {
        Authentication authHelper = new Authentication(this.username, this.password);
        welcomeMessage = authHelper.logIn();
    }

    @Then("I should see the {string} on the page")
    public void iShouldSeeThePage(String expected) {
        assertEquals(expected, welcomeMessage);
    }
}
