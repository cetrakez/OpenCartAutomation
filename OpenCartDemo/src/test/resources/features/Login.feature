Feature: Login Functionality

  @login
  Scenario: Successful login with valid credentials
    Given I access the main website
    And I navigate to the login page
    When I enter username
    And I enter password
    And I click on the login button
    Then I should see the user dashboard