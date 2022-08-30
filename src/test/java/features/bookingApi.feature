Feature: Booking test

  Scenario: Create a new booking and validate its response code and get the booking id.
    Given User creates a booking request
    Then User validates the booking details