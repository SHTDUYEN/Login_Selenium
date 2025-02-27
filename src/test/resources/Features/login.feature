Feature: Feature To Test Login
    Scenario: Check login is Successful
        Given is On Login Page
        When user enter email address and password
        And user click login
        Then we can see homepage