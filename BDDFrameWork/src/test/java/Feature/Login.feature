Feature: Login application

  Scenario: Login app
    Given Open the browser
    When Enter credentials <"Username"> and <"Password">
    Then Home page is displayed
