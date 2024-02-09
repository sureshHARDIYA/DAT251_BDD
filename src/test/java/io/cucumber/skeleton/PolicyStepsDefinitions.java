package io.cucumber.skeleton;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PolicyStepsDefinitions {
    private String dayOfWeek;
    private String timeOfDay;
    private boolean isPubOpen;

    @Given("the day of the week is {string}")
    public void theDayOfTheWeekIs(String day) {
        dayOfWeek = day;
    }

    @And("the time of day is {string}")
    public void theTimeOfDayIs(String time) {
        timeOfDay = time;
    }

    @When("we ask if the pub is open")
    public void weAskIfThePubIsOpen() {
        isPubOpen = OpeningPolicy.isOpen(dayOfWeek, timeOfDay);
    }

    @Then("the answer is {string}")
    public void theAnswerIs(String expectedAnswer) {
        // Convert the string "Yes" or "No" to a boolean value
        boolean expected = expectedAnswer.equalsIgnoreCase("Yes");

        // Assert that the actual result matches the expected result
        assertEquals(expected, isPubOpen);
    }

    @When("we question if the pub is open")
    public void weQuestionIfThePubIsOpen() {
    }
}
