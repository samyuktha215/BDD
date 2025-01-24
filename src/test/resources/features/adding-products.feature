Feature:
  As a ecommerce customer after visiting
  any ecommerce website can be able to do online
  shopping by adding the products he wants in the cart.

  Scenario:When I add an item to the shopping cart,the total price should be updated.
    Given an empty shopping cart
    When I add 1 item "Milk" with a price of 25
    Then the total price should be 25


