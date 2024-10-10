Feature: Hotel Adactin Automation
  Scenario: Select a hotel
    Given Launch "chrome" and enter the url as "https://adactinhotelapp.com/index.php"
    When User login website by enters username as "shyamblaze" and password as "Axess@123"
    Then User views the search hotel page and verifies the URL contains "SearchHotel" text
    When User selects the location as New York
    And User selects the Hotel as Hotel Cornice
    And User selcts the room type as Super Deluxe
    And User select the One room
    And User enter check in date "25/09/2024"
    And User enter check out date "26/09/2024"
    And User selects two adult
    And User selects two children
    And User clicks on search button
    Then User navigate to select hotel page and verifies the URL contains "SelectHotel" text
    When User select the radio button
    When User clicks on continue button
    Then User navigate to Book A Hotel page and verifies the URL contains "BookHotel" text
    And User enters first name as "Samuvel"
    And User enters last name as "S"
    And User enters billing address as "No:27, Arlington, Staten Island, New York"
    And User enters credit card number "8765432112345678"
    And User selects Other as Credit Card Type
    And User selects month and year in expiry date
    And User enters CVV number "444"
    And User click on Book Now button
    Given User takes screenshot of the booking confirmation page
    Then User quit the browser