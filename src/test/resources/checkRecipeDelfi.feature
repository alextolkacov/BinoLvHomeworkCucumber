Feature: Delfi recipe test here

  Scenario: First scenario
    Given RUS Delfi home page
    When we submit cookies
    And we are clicking on Food section
    And waiting for page load
    Then selecting recipe by id 1
    And getting recipe name
    Then checking for ingredients
    And clicking on first ingredient
    Then checking for selected recipe name
