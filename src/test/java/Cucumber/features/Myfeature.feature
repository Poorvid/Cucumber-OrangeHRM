@tag
Feature: Mercury tours and travels.

  @tag1
  Scenario: Log in
    Given The user is a registered user
    When valid Username & Password is entered
    Then Display success message

  Scenario: Enter details for a Round trip
    When valid trip details are entered
    Then click on continue

  Scenario: Select flight
    When A flight is selected
    Then Click on continue button

  Scenario: Book a flight
    When the passenger details are entered
    Then Click on secure purchase & click on logout
