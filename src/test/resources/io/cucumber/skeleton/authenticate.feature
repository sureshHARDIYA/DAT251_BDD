Feature: User Authentication
  As a user
  I want to be able to authenticate myself
  So I can see my orders

  Scenario: User logs in with valid credentials
    Given I visit "/login"
    When I enter "Bob" in the username field
    And I enter "tester" in the password field
    And I press the login button
    Then I should see the "Welcome Bob" on the page

  Scenario: User can not login in with Invalid credentials
    Given I visit "/login"
    When I enter "Wrong" in the username field
    And I enter "tester" in the password field
    And I press the login button
    Then I should see the "Invalid credentials" on the page

