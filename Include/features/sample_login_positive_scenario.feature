Feature: Mainteny Login page
 
  Scenario: Verify the Login page with Valid Credentials
    Given I want login to Mainteny Website
    When I enter the valid user name &  password click on the Login button
    Then I will be navigated to Mainteny Dashboard page
