Feature: User should be able to login to the TutorialsNInja website

  @Smoke
  Scenario:User should able to login with only Valid credentials
    Given I visit to the TutorialsNinja Website
    When I enter the username and password
    And I clicked on login
    Then user should login

  @Regression
  Scenario: User should able to login with only Valid credentials
    Given I visit to the TutorialsNinja Website
    When I enter the username and password
    And I clicked on login
    Then user should login
