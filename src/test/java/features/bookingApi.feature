Feature: Booking test

  Scenario: Create a new booking and validate its response code and get the booking id.
    Given User creates a booking request
    Then User validates the booking details

  Scenario: Update a new booking and validate.
    Given User creates a booking request
    When User updates the booking details
    Then User validates the booking details

  Scenario: Delete a new booking and validate.
    Given User creates a booking request
    When User updates the booking details
    Then User deletes the booking details

