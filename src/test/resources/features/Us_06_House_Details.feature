@Smoke
@us06
Feature: US06 Confirm that house details pages provide accurate information.



  Scenario: Verify House Details Page
    Given user go to home page
    Then user clicks on search button
    Then user clicks property type dropdown menu
    When user selects the house or apartment checkbox
    Then user clicks the apply button
    And user verify the house price is visible
    And user clicks city center button
    Then user verify top amenities list is visible
