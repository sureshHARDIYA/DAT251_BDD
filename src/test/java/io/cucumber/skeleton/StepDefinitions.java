package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {
    private int number1;
    private int number2;
    private int result;

    @Given("I have entered/pressed/clicked {int} and {int} into the calculator")
    public void iHaveEnteredIntoTheCalculator(int num1, int num2) {
        number1 = num1;
        number2 = num2;
    }

    @When("I press the add/plus button")
    public void iPressTheAddButton() {
        result = Calculator.add(number1, number2);
    }

    @Then("the result should be {int} on the screen")
    public void theResultShouldBeOnTheScreen(int sum) {
        assertEquals(sum, result);
    }

//    @When("I press subtract button")
//    public void iPressSubtractButton() {
//        result = Calculator.subtract(number1, number2);
//    }
}
