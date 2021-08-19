Feature: login as different users

  Scenario:  login a driver user
    Given the user is on the login page
    When the user logs in using "user10" and "UserUser123"
    Then the user should be able to login
    And the title contains "Dashboard"

  Scenario: login as a driver
    Given the user is on the login page
    Given the user logged in as "Storemanager"
    Then the user should be able to login
    And the title contains "Dashboard"


  Scenario: Menu Options
    Given the user is on the login page
    When the user logged in as "driver"
    Then the user should see following options
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |

    @wip
  Scenario Outline: login as a "<user>"
    Given the user is on the login page
    When the user logs in using following credentials
      | username  |<user>    |
      | password  | UserUser123 |
      | firstname | <firstname> |
      | lastname  |< lastname>  |
    Then the user should be able to login
    Examples:
      | user           | firstname | lastname |
      | user10         | Toney     | Hegmann  |
      | storemanager85 | Marcella  | Huels    |