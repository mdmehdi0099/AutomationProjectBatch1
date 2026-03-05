@amzn01

  Feature:To verify the amzon add cart functionality

  Scenario Outline:To login to the amazon search the product and add it on the cart and Verify the added item on Cart

    Given The user is on the amazon site "<URL>"
    And The user will enter the username "<Username>" and password "<Password>" on the amazon login page
    And The user click on the login button
    And The user will search the item "<item>" on the amazon
    When The user will add the product on cart
    Then The product should be visible on the cart

    Examples:
    | URL                   |Username |Password | item|
    |https://www.amazon.in/ |abc      |abc      |abc  |


