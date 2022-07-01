Feature:Insurance Page Scenarios
  # feature describes what is the whole file is about

  Scenario:Get Quote Link
    # Scenario describes the behavior that is expected
    Given I am on Herokuapp Insurance Page
    # Given is what is prerequisite(what is given already)
    When I click on Get Quote button
    # When is what is the action being taken
    Then I navigate to application form
    # Then is the validation point. meaning when I perform specific action , what i am going to accomplish.


  Scenario:Finance Details link
    Given I am on Herokuapp Insurance Page
    When I click on Finance Details
    Then I validate only one option

  Scenario:Let us call you button
    Given I am on Herokuapp Insurance Page
    When I complete the application
    And I click on submit button
    Then I verify Let us call you button
