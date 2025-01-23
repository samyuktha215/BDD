package org.example;

import java.util.HashMap;
import java.util.Map;

public class CartManager {
    private final Map<String,Integer>shoppingCart;
    private int totalPrice;

    public CartManager() {
        shoppingCart = new HashMap<>();
        totalPrice=0;
    }

    public int getTotalPrice() {
       return totalPrice;
    }

    public void addItem(String item, int quantity,int price) {
        shoppingCart.put(item,quantity*price);
        totalPrice+=quantity*price;
    }

    public Map<String,Integer> getShoppingCartContents() {
        return new HashMap<>(shoppingCart);
    }

    public void clearCart(){
        shoppingCart.clear();
        totalPrice=0;
    }
}
