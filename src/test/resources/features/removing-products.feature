Feature: After putting items in the cart
  one can also remove them at the time of
  billing and can reduce the cost of those items.

  Scenario:When I remove an item from the shopping cart the total price should be adjusted.
    Given A cart containing "Milk" (25) and "Bread" (20)
    When I remove "Bread"
    Then The total price should be now 25

