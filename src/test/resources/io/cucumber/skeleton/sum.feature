Feature: My Personal Calculator
  As a user I want to be able to add two number So I can see my sum.

  Scenario: Add two numbers
    Given I have entered 5 and 7 into the calculator
    When I press the add button
    Then the result should be 12 on the screen
    
    Scenario: Subtract two number
      Given I have entered 12 and 10 into the calculator
      When I press subtract button
      Then the result should be 2 on the screen