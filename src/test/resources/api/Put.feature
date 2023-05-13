Feature: User

  Scenario: PUT As admin I have be able to update existing user
    Given I set PUT api endpoints
    When I send PUT HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for update post by id
