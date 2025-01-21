package org.example.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AddingProductsSteps {
    private  HashMap<Integer,String>shoppingCart;
    private int totalPrice;


    @Given("an empty shopping cart")
    public void anEmptyShoppingCart() {
        shoppingCart = new HashMap<>();
        totalPrice = 0;
    }

    @When("I add {int} item {string} with a price of {int}")
    public void iAddItemWithAPriceOf(int quantity, String itemName, int price) {
        shoppingCart.put( quantity*price, itemName );
        totalPrice += price*quantity;
    }

    @Then("the total price should be {int}")
    public void theTotalPriceShouldBe(int expectedPrice) {
        assertEquals(totalPrice, expectedPrice);
    }


}
