@registration
Feature: Registration

  @likes

  Scenario: Likes by new users are successfully applied
    Given Registration form is opened
    And I register a new user
    And I log in with new user credentials
    When I open the link for province Navarra
    And I filter properties by mostExpensive
    And I check 1 property likes
    And open 1 property from the list
    Then the most expensive item is opened
    When I add a comment
    And Likes is increased by one
    When I go to the previous page
    Then the item has increased amount of likes