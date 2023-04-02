Feature: Form Authentication

    As a user
    I want to see home page
    So that i can log into the secure area

    Scenario: User successfully login with input right username and password

        Given I am on the-internet home page
        When I go to the form authentication page
        And I input valid username
        And I input valid password
        And I click login button
        Then I am on the secure area page
