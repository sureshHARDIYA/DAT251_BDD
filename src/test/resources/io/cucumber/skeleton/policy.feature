Feature: The pub is open all days from 19 to 23 except Sundays

  Scenario: The pub is open on Monday at 21:00
    Given the day of the week is "Monday"
    And the time of day is "21:00"
    When we ask if the pub is open
    Then the answer is "Yes"

  Scenario: The pub is closed on Saturday at 23:01
    Given the day of the week is "Saturday"
    And the time of day is "23:01"
    When we question if the pub is open
    Then the answer is "No"

  Scenario: The pub is closed on Sunday
    Given the day of the week is "Sunday"
    When we ask if the pub is open
    Then the answer is "No"
