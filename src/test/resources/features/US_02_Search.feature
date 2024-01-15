
@US02
Feature: US02 Verify that user can use search functionalty by destination and by dates

  Scenario: TC_02_Searching

    Given user goes to "Trivago"
    Then user input "Banf" on where to field
    And user clicks CheckIn button
    And  user selects check in data
    And user clicks apply button for guest
    And user clicks on Search button
    And user preses close button to be able to close the guest windows
    Then verify the  hotels appear on the window


