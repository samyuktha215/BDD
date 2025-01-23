package org.example;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    Map<String,Item> items;

    public Cart() {
        items = new HashMap<String,Item>();
    }
    public void addItem(String itemName,int quantity,int price) {
        if (items.containsKey(itemName)) {
            Item item = items.get(itemName);
            item.setQuantity(item.getQuantity() + quantity);
        } else {
            items.put(itemName, new Item(itemName, quantity, price));
        }

    }

    public void removeItem(String itemName) {
        items.remove(itemName);
    }

    public Map<String,Integer> getItems() {
        Map<String,Integer>contents=new HashMap<>();
        for(Item item:items.values()) {
            contents.put(item.getItemName(),item.getQuantity());

        }
        return contents;
    }

    public void clearItems() {
        items.clear();
    }

    public int getTotalPrice() {
        int totalprice = 0;
        for(Item item : items.values()) {
            totalprice += item.getQuantity()*item.getPrice();
        }
        return totalprice;
    }

}
