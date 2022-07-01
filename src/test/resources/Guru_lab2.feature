Feature: Guru99 Telecom Add Tariff Plan
  @TariffPlan
  Scenario: Verify Add Tariff Plan
    Given I am on Guru99 Telecom Home Page
    When I click on Add Tariff Plan
    Then I add details as follows
      | Monthly Rental| 10|
      | Free Local Minutes| 12|
      | Free International Minutes| 13|
      | Free SMS Pack| 15|
      | Local Per Minutes Charges| 18|
      | International Per Minutes Charges| 25|
      | SMS Per Charges| 28|
    And I click on Submit button
    Then I validate message as 'Congratulation you add Tariff '