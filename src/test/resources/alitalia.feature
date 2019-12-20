@tag
Feature: To validate the airline functionality

  @smoke
  Scenario: To check the airline login functionality
    Given launch the url
    When Enter username
    And Enter password
    And click loginbutton
    And user search hotel
    And user book a hotel
    And user Booked Itinerary
    And user click the logout button
    Then user loggedout
   

 
