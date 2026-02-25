@Testcase123
#this is the tag name
Feature: Login using valid Credential

Scenario Outline: To login to the application with valid Credentials and verify that the user is able to login successfully

  Given The user is on the linkedIn "<URL>" page
  When The user enters the username "<Username>" and password "<Password>"
  And The user will click on the login button
  Then The user should be redirected to the Home Page "<HomeURL>"

  Examples:
  | URL        |  Username  | Password   |  HomeURL   |
  | abc.com    | abc        | abc        |  home.url  |




