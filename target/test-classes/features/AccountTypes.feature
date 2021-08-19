Feature: Account Types

  Scenario: Driver user
    Given the user is on the login page
    When the user logged in as "driver"
    Then the user navigates to "Activities" "Calendar Events"
    And the title contains "Calendar Events - Activities"
  Scenario: Sales manager user
    Given the user is on the login page
    When the user logged in as "salesmanager"
    Then the user navigates to "Customers" "Accounts"
    And the title contains "Accounts - Customers"
  Scenario: Store manager user
    Given the user is on the login page
    When the user logged in as "storemanager"
    Then the user navigates to "Customers" "Contacts"
    And the title contains "Contacts - Customers"

  Scenario Outline: Login with different accounts "<userType>"
    Given the user is on the login page
    When the user logged in as "<userType>"
    Then the user navigates to "<tab>" "<module>"
    And the title contains "<title>"
    Examples:
      | userType     | tab        | module          | title                       |
      | driver       | Activities | Calendar Events | Calendar Event - Activities |
      | salesmanager | Customers  | Accounts        | Accounts - Customers        |
      | storemanager | Customers  | Contacts        | Contacts - Customers        |
    
