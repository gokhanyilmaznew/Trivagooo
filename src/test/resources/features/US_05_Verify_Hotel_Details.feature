
Feature: US05 Verify Hotel Detail Buttons

  Scenario: Verify Hotel Detail

    Given Client navigate to "url"
    When Client clicks on Destination and adds proper country
    Then Client clicks on search button
    Then Client clicks on Fairmont Hot Springs Resort hotel
    Then Client clicks on Info button
    Then Client clicks on Photos button
    Then Client clicks on Reviews button
    And Client clicks on Prices button