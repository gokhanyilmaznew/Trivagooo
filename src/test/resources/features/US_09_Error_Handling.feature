@US09

Feature: US09 Error Handling

  Background:
    Given User navigate to "url"

  @US09_TC001
  Scenario: Submit an invalid search query and validate the error message.

    Given User clicks on search query box
    When User enters invalid data
    Then User should see the error message.


#  @US09_TC002
#  Scenario: Intentionally provide incorrect payment information and check error handling.
#
#    Given User enters destination on the search box
#    When User clicks on Search button
#    And User clicks on View Deal button of the Hotel information box
#    And Website switches to another tab
##    And User selects a room and clicks on Quick Book button
##    And User clicks Continue button on the pop-up message box
##    And User enters invalid card number
##    Then User should see the error message under card number box


