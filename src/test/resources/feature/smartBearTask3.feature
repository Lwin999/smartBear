@all
Feature: SmartBear order Process
  @smartBear
  Scenario: SmartBear order process
    Given User is logged into SmartBear Tester account and on Order page
    When User selects FamilyAlbum from product dropdown
    And User enters "4" to quantity
    And User enters "John Wick" to costumer name
    And User enters "Kinzie Ave" to street
    And User enters "Chicago" to city
    And User enters "IL" to state
    And User enters "60056"
    When User selects "Visa" as card type
    And User enters "1111222233334444" to card number
    And User enters "12/22" to expiration date
    And User clicks process button
    Then User verifies "JohnWick" is in the list

  @smartBear2
  Scenario Outline: : SmartBear order process
    Given User is logged into SmartBear Tester account and on Order page
    When User fills out the form as followedfrom the table below
    And User selects “<product>” from product dropdown
    And User enters “<quantity>”to quantity
    And User enters “<customer name>” to costumer name
    And User enters “<street>” to street
    And User enters “<city>” to city
    And User enters “<state>” to state
    And User enters “<zip>” to zip
    And User selects “<card Type>” as card type
    And User enters “<card number>” to card number
    And User enters “<expiration date>” to expiration date
    When User clicks process button
    Then User verifies “<expectedName>” is in the list
    Examples:
      | product     | quantity | customer name   | street      | city        | state | zip   | card Type | card number  | expiration date | expectedName    |
      | MyMoney     | 1        | Ken Adams       | Kinzie st   | Chicago     | IL    | 60004 | Visa      | 313313133315 | 12/22           | Ken Adams       |
      | FamilyAlbum | 4        | Joey Tribbiani  | State st    | Chicago     | IL    | 60656 | Visa      | 123433533336 | 11/22           | Joey Tribbiani  |
      | ScreenSaver | 5        | Rachel Green    | Michigan st | Chicago     | IL    | 60056 | Visa      | 335333333337 | 10/22           | Rachel Green    |
      | MyMoney     | 5        | Chandler Bing   | Erie st     | Chicago     | IL    | 60666 | Visa      | 433353333338 | 10/22           | Chandler Bing   |
      | FamilyAlbum | 9        | Dr DrakeRamoray | Dale st     | Arl Hgths   | IL    | 60452 | Visa      | 532333335334 | 10/22           | Dr DrakeRamoray |
      | ScreenSaver | 10       | Monica Geller   | Euclid ave  | Arl Hgths   | IL    | 60312 | Visa      | 733533333333 | 10/22           | Monica Geller   |
      | MyMoney     | 3        | Ross Geller     | River rd    | Des Plaines | IL    | 60666 | Visa      | 833435363732 | 10/22           | Ross Geller     |
      | MyMoney     | 1        | Ken Adams       | Kinzie st   | Chicago     | IL    | 60312 | Visa      | 933566666531 | 12/22           | Ken Adams       |





