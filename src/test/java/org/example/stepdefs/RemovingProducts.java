package org.example.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.CartManager;

import java.util.HashMap;
import java.util.Map;

public class RemovingProducts {
    private CartManager cartManager;
    private Map<String,Integer> shoppingCart=new HashMap<>();

    @Given("A cart containing {string} \\({int}) and {string} \\({int})")
    public void aCartContainingAnd(String item1, int price1, String item2, int price2) {
        shoppingCart.put(item1,price1);
        shoppingCart.put(item2,price2);
        cartManager.addItem("Milk",1,25);
        cartManager.addItem("Bread",2,20);
    }

    @When("I remove {string}")
    public void iRemove(String item) {
        shoppingCart.remove(item);
    }

    @Then("The total price should be now {int}")
    public void theTotalPriceShouldBeNow(int price) {
        cartManager.getTotalPrice();
    }
}
