package org.example.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.CartManager;



public class RemovingProducts {
    private CartManager cartManager;

    @Given("A cart containing {string} \\({int}) and {string} \\({int})")
    public void aCartContainingAnd(String item1, int price1, String item2, int price2) {
        cartManager = new CartManager();
        cartManager.addItem("Milk",1,25);
        cartManager.addItem("Bread",2,20);
    }

    @When("I remove {string}")
    public void iRemove(String item) {
        cartManager.removeItem("Bread");
    }

    @Then("The total price should be now {int}")
    public void theTotalPriceShouldBeNow(int price) {
        cartManager.getTotalPrice();
    }
}
