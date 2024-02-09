Feature: Compute simple interest
  As a user I want to compute simple interest, so I can see my total amount and interest based on year.

  Scenario: User want to know simple interest for 2 years
    Given We know principal 5000, rate 5 percent and time 2 years
    When I ask how much is my interest
    Then the result should be 500

  Scenario: Calculate simple interest with invalid arguments
    Given We know principal -5000, rate -5 percent and time 2 years
    When I ask how much is my interest
    Then an IllegalArgumentException is thrown
