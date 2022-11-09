Feature: Practice page dropdown options

  @wip
  Scenario: User should be able to see all 12 months in months dropdown
    Given User is on the dropdown page of practice tool
    Then user should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |

