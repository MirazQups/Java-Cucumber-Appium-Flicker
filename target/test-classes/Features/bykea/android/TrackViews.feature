Feature: Track user views

  Background: login test
    Given user click on get started
    Then click on next btn

  @initial
  Scenario: user set personal info
    Given click on profile icon
    Then click on stats
