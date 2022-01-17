Feature: Post Public

  Background: login test
    Given user click on get started
    Then click on next btn

  @initial
  Scenario: user click on public
    Given click on profile icon
    Then click on public