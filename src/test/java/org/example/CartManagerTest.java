package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartManagerTest {
    private CartManager cartManager;

    @BeforeEach
    public void setUp() {
        cartManager = new CartManager();
        cartManager.clearCart();
    }

    @Test
    public void testEmptyShoppingCart() {
        assertEquals(0, cartManager.getTotalPrice());
        assertEquals(0,cartManager.getShoppingCartContents().size());
    }

    @Test
    public void testAddItem() {
        cartManager.addItem("milk",1,25);
        assertEquals(25, cartManager.getTotalPrice());
        assertEquals(1, cartManager.getShoppingCartContents().size());
    }

    @Test
    public void testTotalPrice() {
        cartManager.addItem("milk",1,25);
        assertEquals(25, cartManager.getTotalPrice());
    }
}
