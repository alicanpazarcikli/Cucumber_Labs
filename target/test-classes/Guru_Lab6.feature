Feature: Payment Gateway Functional Test

  @Smoke @P10
  Scenario: Verify that user is on Payment Gateway Website
    Given The user is on  Payment Gateway Website
    When  The user wants to purchase an elephant toy
    Then The user wants to verify that "Mother Elephant With Babies Soft Toy" message is displayed

  @Smoke @P20
  Scenario: Toy price verification
    Given The user is on  Payment Gateway Website
    When The user wants to purchase an elephant toy
    Then The user wants to validate toy price tag as "$20.00"
    And The user wants to verify the landing page as “payment-gateway”

  @Regression @P30
  Scenario: Verify that user can buy a product
    Given The user is on  Payment Gateway Website
    When The user wants to purchase "5" elephant toy
    Then The user wants to click on pay now
    Then The user wants to enter Credit Card Number as "12345678901234567"
    And The user wants to enter Expiration Month as "10"
    And The user wants to enter Expiration Year as "2022"
    And The user wants to enter CVVCode as "150"
    Then The user wants to click on pay now
    And The user wants to verify message as "Payment successfull!"

  @Regression @P40
  Scenario Outline: Verify that user can buy multiple products
    Given The user is on  Payment Gateway Website
    When The user wants to buy toys as follow "1"
    Then The user wants to click on pay now
    And The user wants to enter payment info as
      | CardNum | 1234123456785678 |
      | ExpMnth | 06               |
      | ExpYear | 2025             |
      | CVV     | 200              |
    And The user wants to click on pay now
    Then The user wants to verify message as "Payment successfull!"
    Examples:
      | 5 |
      | 8 |
      | 9 |
      | 2 |
      | 4 |






