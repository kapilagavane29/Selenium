Feature: Test Orange HRM login page and Homepage functionality

  Scenario: Test LoginPage Functionality
    Given User is on login page
    When User entered valid username and password
    Then user is on HomePage

  Scenario: test HomePage Functionality
    Then validate user on homepage by using get title
    And validate user on homepage by using get Url
    And validate user on homepage by using Logo
    
  Scenario: Test PIM page functionality
  Given user is on pim page click on add button
  When create a new emplyoee
  Then fillup more personal details
  And search user by using emplyoee id
  Then delete newly created emplyoee id
  
