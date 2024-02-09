Feature: Buying Alcohol Age Verification

  Scenario: Customer tries to buy alcohol
    Given The customer provides their date of birth as "2004-01-01"
    And The current time is within the allowed hours 8am to 8pm
    When The cashier checks the customer's age
    Then The cashier should inform the customer is "Eligible to buy"

  Scenario: Customer tries to buy alcohol outside allowed hours
    Given The customer provides their date of birth as "1990-05-15"
    And The current time is outside the allowed hours (before 8am or after 8pm)
    When The cashier checks the customer's age
    Then The cashier should inform the customer is "NOT Eligible to buy"
