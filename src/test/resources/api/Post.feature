Feature: User

    Scenario: POST As admin I have be able to create new user
      Given I set POST api endpoints
      When I send POST HTTP request
      Then I receive valid HTTP response code 201
      And I receive valid data for new post
