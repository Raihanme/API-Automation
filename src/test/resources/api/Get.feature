Feature: User

  Scenario: Get As admin I have be able to get detail user
    Given I set GET endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for detail post
