@Us_04

Feature: US04 hotel details

  Scenario: Verify hotel details
    Given user go to home page
    Then user clicks on search button
    Then user clicks property type dropdown menu
    Then user selects the Hotel checkbox
    Then user clicks the apply button
    And user verify the hotel price is visible
    And user clicks city center button
    Then user verify top amenities list is visible
