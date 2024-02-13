package io.cucumber.skeleton;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlcoholSteps {
    private String dateOfBirth;
    private String currentTime;
    private String result;

    @Given("The customer provides their date of birth as {string}")
    public void theCustomerProvidesTheirDateOfBirthAs(String dob) {
        this.dateOfBirth = dob;
    }

    @And("The current time is within the allowed hours 8am to 8pm")
    public void theCurrentTimeIsWithinTheAllowedHoursAmToPm() {
        this.currentTime = "12:00pm";
    }

    @When("The cashier checks the customer's age")
    public void theCashierChecksTheCustomerSAge() {
        BuyingAlcoholService buyingAlcoholService = new BuyingAlcoholService();
        this.result = buyingAlcoholService.checkAgeAndTime(this.dateOfBirth, this.currentTime);
    }

    @Then("The cashier should inform the customer is {string}")
    public void theCashierShouldInformTheCustomerIfTheyCanBuyAlcoholOrNot(String expectedMessage) {
        assertEquals(expectedMessage, this.result);
    }

    @Given("The current time is outside the allowed hours \\(before 8am or after 8pm)")
    public void the_current_time_is_outside_the_allowed_hours_before_8am_or_after_8pm() {
        this.currentTime = "9:00pm";
    }
}
