@sanity
Feature: Validate Login functionality for Guru99 application

  Scenario Outline: Validate Login for Demo Guru 99 with correct credentials
    Given user opens the guru99 demo app
    And user enters the username in uname field as "<username>"
    And user enters the password in pwd field as "<password>"
    When user clicks on the login button
    Then user will be navigated to the homepage of the application
    And user closes the browser

    Examples: 
      | username   | password |
      | mngr665066 | UbusanE  |
