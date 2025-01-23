package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartManagerTest {

    private CartManager cartManager;

    @BeforeEach
    public void setUp() {
        cartManager=new CartManager();
    }

    @Test
    public void testEmptyShoppingCart() {
        assertEquals(0, cartManager.getTotalPrice());
        assertEquals(0, cartManager.getShoppingCartContents().size());
    }

    @Test
    public void testAddItem() {
        cartManager.addItem("milk", 1, 25);
        assertEquals(25, cartManager.getTotalPrice());
        assertEquals(1, cartManager.getShoppingCartContents().size());
    }

    @Test
    public void testTotalPrice() {
        cartManager.addItem("milk", 1, 25);
        assertEquals(25, cartManager.getTotalPrice(), "total price should be 25");
    }

    @Test
    public void testShoppingCartContents() {
        cartManager.addItem("milk", 1, 25);
        cartManager.addItem("Bread", 1, 20);
        assertEquals(45, cartManager.getTotalPrice(), "total price should be 45");
        assertEquals(2, cartManager.getShoppingCartContents().size());

    }

    @Test
    public void testRemoveItem() {
        cartManager.addItem("milk", 1, 25);
        cartManager.addItem("Bread", 1, 20);
        cartManager.removeItem("Bread");
        assertEquals(25, cartManager.getTotalPrice(), "total price should be 25");
    }
}