
@US_08
Feature: US08 Confirm that user accounts can be managed successfully.

  Scenario:User Account Management

    Given Go to home page
    Then Log in as a user
    Then Click on the log in button
    When Click on the user account button
    And  Click on the account settings box
    Then Update user last name
    Then Click on the user account button to see dropdown
    Then Click on the recently viewed to see before booking
    Then Verify before booking is visible






