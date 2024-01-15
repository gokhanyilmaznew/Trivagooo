@tb_US_01

Feature: US01 Homepage Navigation

  Scenario: Homepage load and  search bar is functional
    Given User goes to "https://www.trivago.com/" page
    Then User should be on "https://www.trivago.com/" page
    Then User select to "Washington D.C." on Where to? button
    And User  clicks checkIn button_tb
    And User clicks to close button on the check in field
    And User clicks to Search button_tb
    And User verify the  search button on the web page









