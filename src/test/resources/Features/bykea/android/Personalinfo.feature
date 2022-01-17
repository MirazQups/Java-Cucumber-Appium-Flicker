Feature: Personal Info

  Background: login test
    Given user click on get started
    Then click on next btn

  @initial
  Scenario: user set personal info
    Given click on profile icon
    Then click on profile three dot icon
    Then click on about
