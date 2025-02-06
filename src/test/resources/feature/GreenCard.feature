Feature: Green card - veg and fruits kart
  Scenario: Costomar will buy grocary
    Given Customar is on the green card page
    When Customar will add to card
    When Customar proceed to checkout
    And Castomar click place order
    Then  Customar select the city
    And Customar finally agree and procced
