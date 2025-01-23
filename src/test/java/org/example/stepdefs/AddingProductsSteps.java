package org.example.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.CartManager;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class AddingProductsSteps {

    private CartManager cartManager;


    @Given("an empty shopping cart")
    public void anEmptyShoppingCart() {
        cartManager = new CartManager();
        cartManager.clearCart();
    }

    @When("I add {int} item {string} with a price of {int}")
    public void iAddItemWithAPriceOf(int quantity, String itemName, int price) {
        cartManager.addItem("milk",1,25);
    }

    @Then("the total price should be {int}")
    public void theTotalPriceShouldBe(int expectedPrice) {
        assertEquals(cartManager.getTotalPrice(), expectedPrice);
    }


}
