  Feature: User Should be abel to Login

  Scenario Outline: User should be able to login with Valid credentials
  
    Given I visit the TutorialNinja Website
    And  I click on MyAccount Option 
    Then I Select the Login Option
    When I Entered username as "<Email>" and Password as "<Password>"
    And  Clicked on Login
    Then User should be able to get inside the TutorialsNinja Website

   Examples: 
      | Email              | Password         | status  |
      | abcg@gmail.com     |    1234567890    | Pass    |
      | vishwa@gmail.com  |     Demo@123      | Fail    |