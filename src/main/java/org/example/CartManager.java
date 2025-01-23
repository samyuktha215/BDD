package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CartManager {
    private Cart cart;

    public CartManager() {
        this.cart = new Cart();
    }

    public int getTotalPrice() {
       return cart.getTotalPrice();
    }

    public void addItem(String item, int quantity,int price) {
        cart.addItem(item,quantity,price);
    }

    public void removeItem(String itemName) {
        cart.removeItem(itemName);
    }

    public Map<String,Integer> getShoppingCartContents() {
        return cart.getItems();
    }

    public void clearShoppingCart() {
        cart.clearItems();
    }



}
