Feature: WholeFoods shopping functionality
  @funct
  Scenario: 1. shopping as not valid user
    Given as not valid user
    When brows to URL http://www.wholefoods/.com
    And click on store link
    Then go to shopping link