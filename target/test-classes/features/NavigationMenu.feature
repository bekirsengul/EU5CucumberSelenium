@navigate
  Feature: Navigation Menu
    Scenario: Navigating Fleet -- Vehicles
      Given the user is on the login page
      When the user enters the SalesManager information
      Then the user should be able to login
      And navigate to fleet menu
      Then click the vehicles menu
      Then the title should be Vehicles

    Scenario: Navigating Marketing -- Campaigns
      Given the user is on the login page
      When the user enters the SalesManager information
      Then the user should be able to login
      And navigate to marketing menu
      Then click the campaigns menu
      Then the title should be Campaigns

    Scenario: Navigating Activities -- Calender Events
      Given the user is on the login page
      When the user enters the SalesManager information
      Then the user should be able to login
      And navigate to activities
      Then click the calender events menu
      Then the title should be Calender Events