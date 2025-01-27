package org.example;

public class Item {
    private String itemName;
    private int Quantity;
    private int price;

    public Item(String itemName, int quantity, int price) {
        this.itemName = itemName;
        Quantity = quantity;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
    public int getPrice() {
        return price;
    }


}
