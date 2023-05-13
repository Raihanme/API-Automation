Feature: User

  Scenario: DELETE As admin I have be able to delete existing user
    Given I set DELETE api endpoints
    When I send DELETE HTTP request
    Then I receive valid HTTP response code 204
