Feature: Add the new person to the list order of Smart Bear application

  Scenario: User is logged into SmartBear Tester account and on Order page
    Given User is on home page
    When User clicks on order button
    When User selects FamilyAlbum from product dropdown
    When User enters number four to quantity
    When User enters John Wick to costumer name
    When User enters Kinzie Ave to street
    When User enters Chicago to city
    When User enters IL to state
    When User enters number 60056
    When User selects Visa as card type
    When User enters 1111222233334444 to card number
    When User enters twelve to expiration date
    And User clicks process button
    Then User verifies John Wick is in the list



