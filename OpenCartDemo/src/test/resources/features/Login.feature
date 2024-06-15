Feature: Login Functionality

  @111
  Scenario: Successful login with valid credentials
    Given I navigate to the login page
    When I enter username
    And I enter password
    And I click on the login button
    Then I should see the user dashboard