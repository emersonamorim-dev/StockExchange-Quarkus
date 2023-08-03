Feature: Stock management
  As a user
  I want to manage stocks
  So that I can keep track of my investments

  Scenario: User adds a new stock
    Given the user has opened the application
    When the user adds a new stock with symbol "AAPL" and price 150
    Then the stock with symbol "AAPL" should be displayed in the list of stocks
