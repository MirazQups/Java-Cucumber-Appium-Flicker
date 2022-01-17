Feature: Search

  Background:login test
    Given user click on get started
    Then click on next btn

  @initial
  Scenario Outline: user search anything
    Given click on search btn
    Then enter any book name "<Bookname>"
    Examples:
      |Bookname |
      |biology  |