Feature: Login Functionality

  Scenario: Successful login with valid credentials
    Given I navigate to the login page
    When I enter username "demo@demo.com"
    And I enter password "demo"
    And I click on the login button
    Then I should see the user dashboard