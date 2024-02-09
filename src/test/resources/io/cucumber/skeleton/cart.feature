Feature: Shopping Cart Functionality

  Background:
    Given the user is on the e-commerce site
    And the user has logged in

  Scenario: Adding items to the shopping cart
    Given the user is on the product page
    When they click on "Add to Cart"
    Then the item should be added to the shopping cart

  Scenario: Removing items from the shopping cart
    Given the user has items in the shopping cart
    When they click on "Remove"
    Then the item should be removed from the shopping cart

  Scenario: Checking out with items in the shopping cart
    Given the user has items in the shopping cart
    When they proceed to checkout
    Then they should be directed to the checkout page

    # But statement for a specific condition
    But the user cannot proceed if the total exceeds $50000
