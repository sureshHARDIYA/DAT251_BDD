package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SimpleInterestDefinitions {
    private double principal;
    private  double time;
    private  double rate;
    private  double answer;
    private Throwable thrownException;


    @Given("We know principal {int}, rate {int} percent and time {int} years")
    public void weKnowPrincipalRatePercentAndTimeYears(int p, int t, int r) {
        this.principal = p;
        this.time = t;
        this.rate = r;
    }

    @When("I ask how much is my interest")
    public void iAskHowMuchIsMyInterest() {
        try {
            SInterest si = new SInterest(this.principal, this.time, this.rate);
            this.answer = si.compute();
        } catch (IllegalArgumentException e) {
            thrownException = e;
        }
    }

    @Then("the result should be {double}")
    public void theResultShouldBe(double result) {
        assertEquals(result, this.answer, 0.001); // Adjust the delta value based on precision
    }


    @Then("an IllegalArgumentException is thrown")
    public void anIllegalArgumentExceptionIsThrown() {
        assertThrows(IllegalArgumentException.class, () -> {
            throw thrownException;
        });
    }
}
