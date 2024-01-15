
@US07_Booking
Feature: US07 Going to the booking page
  Scenario:Verify the going to booking page successfully


    Given User navigate to "url"
    Then User clicks on Destination home page
    When User enters a destination
    And User enters check in date
    And User enter check out date
    And User clicks on search button
    And User clicks on first view deal button
    And User verifies the booking page in another tab
    And User clicks on booking button
    Then User verify booking information


