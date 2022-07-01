Feature: Functional testing on Orange HRM


  @Smoke
  Scenario: Login to Orange HRM
    Given I am on Orange HRM Login Page
    When I enter valid credentials
    Then I click on login button
    And I navigate to Orange HRM Home Page

  @dryRunTest @ParameterizedDashboard
  Scenario: Login to OrangeHRM with Parameterized message
    Given The user wants to go to OrangeHRM Website
    When Thee user wants to enter username and password
    Then The user wants to click on Login button
    And The user wants to verify that browser landed on "Dashboard"

  @Smoke @TC100
  Scenario: Adding a new employee
    Given The user wants to go to OrangeHRM Website
    When Thee user wants to enter username and password
    Then The user wants to click on Login button
    And The user wants to verify that browser landed on "Dashboard"
    Then The user wants to click on PIM module
    And The user wants to go to Add Employee page
    Then The user wants to  add first name as "ALI"
    Then The user wants to add last name as "Renastech"
    Then The user wants to save personal information
    Then The user should be able to see "Personal Details"

  @Smoke @TC200 @Regression
  Scenario: Adding a new employee in a different format
    Given The user wants to go to OrangeHRM Website
    When Thee user wants to enter username and password
    Then The user wants to click on Login button
    And The user wants to verify that browser landed on "Dashboard"
    Then The user wants to click on PIM module
    Then The user wants to add employee's first and last name as follows
      | FirstName | Ali       |
      | LastName  | Renastech |
    Then The user wants to add login details as follows
      | UserName | Ali Can        |
      | Password | RenasTech!123@ |
      | Status   | Disabled       |
    Then The user wants to save the information
    Then The user should be able to see "Personal Details"


  @TC300 @Regression
  Scenario: Adding a new employee -third way
    Given The user wants to go to OrangeHRM Website
    When Thee user wants to enter username and password
    Then The user wants to click on Login button
    And The user wants to verify that browser landed on "Dashboard"
    Then The user wants to click on PIM module
    Then The user wants to add employee's first and last name as following list
      | Omer1234 | 123BRk |
    Then The user wants to add login details in a list way
      | renastech123 | Renastech2022  | Disabled |
      | ridvan123    | RenasTech!123@ | Disabled |
      | Sezar025     | Sezar123@!     | Disabled |
      | Gulistan963  | RenasTech!123@ | Disabled |
    Then The user wants to save the information
    Then The user should be able to see "Personal Details"

   @Scenario_Outline @Smoke @Regression
  Scenario Outline:Adding new nationality to nationalities page
    Given The user wants to go to OrangeHRM Website
    When Thee user wants to enter username and password
    Then The user wants to click on Login button
    And The user wants to verify that browser landed on "Dashboard"
    And The user wants to go to Admin Page
    Then The user wants to go to Nationalities section
    Then The user wants to click on add new nationality
    Then The user wants to add new nationalities as "<Nationalities>"
     Then The user wants to verify that Nationality is added
    Examples:
      | Nationalities |
      | Aramaic       |
      | Chilean       |
      | Ecuador       |






