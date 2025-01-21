package org.example.stepdefs;

import io.cucumber.java.en.Given;
import java.util.HashMap;



public class AddingProductsSteps {
    private  HashMap<Integer,String>shoppingCart;
    private int totalPrice;

    @Given("an empty shopping cart ")
    public void anEmptyShoppingCart() {
        shoppingCart = new HashMap<>();
        totalPrice= 0;
    }
}
