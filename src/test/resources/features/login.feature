@login
Feature: Users should be able to login

  Background:
    Given the user is on the login page

  @driver @vyt123
  Scenario: Login as a driver
    When the user enters the driver information
    Then the user should be able to login

  Scenario: Login as a SalesManager
    When the user enters the SalesManager information
    Then the user should be able to login

  @store_manager @vyt123
  Scenario: Login as a StoreManager
    When the user enters the StoreManager information
    Then the user should be able to login


  Scenario: Login as a asd
    When the user enter as a asd
    Then the user should be able to login