Feature: Sign Up

  @initial
  Scenario Outline:user sign up
    Given user click on getstarted
    Then click on sign up here
    Then user enter "<FirstName>", "<LastName>", "<Age>", "<EmailAdd>", "<Pass>"
    Then click sign up

    Examples:
    |FirstName | LastName | Age | EmailAdd | Pass |
    |Maraz     | Islam    | 20  |marazislam8@gmail.com | TestCase0101|
