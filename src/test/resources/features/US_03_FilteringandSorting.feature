@Smoke
@US03
Feature: US03 Verify that users can filter and sort search results effectively.

  Scenario:TC01 Filtering and Sorting

    Given User navigate to "url"
    Then User clicks on Destination home page
    And User clicks search button
    And User clicks on price and choose scroll button and change the price
    And User clicks on Filters
    And User clicks fivestar and Popular filters and choose Free cancellation box
    And User clicks on Guest Rating and choose Excellent
    And User clicks on Property Type and choose Hotel box
    And User review the result according to the selected sorting criteria and confirm accuracy
  