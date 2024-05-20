 @search

Feature: Ebay Search

  @positive
  Scenario: To test Ebay Search filter.
    Given User opens chrome browser and enter EBay website.
    When User selects Arts from the filter dropdown
    And User clicks on Search
    Then All the items related to Arts should be displayed.
   