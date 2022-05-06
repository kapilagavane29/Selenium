Feature: test fb register functionality

  Scenario: create new fb account
    Given user is on register page
    When user enter first name and last name
    And user enter password, user select date of birth
    Then account is succesfully created