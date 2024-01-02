Feature: Login Feature

  Scenario: Login with valid credentials.
    Given user on login page
    When user enter the email and password
    And user clicks on the login button


    Scenario: User Goes to the the Dashboard
      Then Check user is loggedin and Dashboard icon is visible
      And User clicks on the checkin
      Then User pick the date and time
      Then Click on recruitment from side menu
      And Enter Details for the vacancy
#      And Select dropdown value
      And Enter email for vacancy
      Then Upload the file into the app
