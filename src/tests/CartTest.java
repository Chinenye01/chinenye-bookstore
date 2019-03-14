/*
 * TCSS 305 Winter 2019
 * Assignment 2
 */

package tests;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import model.Item;
import model.ItemOrder;
import model.Cart;
import org.junit.Before;
import org.junit.Test;

/**
 * This contains the tests for the Cart class.
 * 
 * @author Chinenye Ezenwoye chinenye@uw.edu
 * @version January 28, 2019
 */
public class CartTest
{
    /** The ShoppingCart that will be used in the tests. */
    private Cart myCart;

    /**
     * This is a method to initialize the ShoppingCart for each of the tests.
     */
    @Before
    public void setUp()
    {
        myCart = new Cart();
    }

    /**
     * Test method for {@link Cart#calculateTotal()}.
     */
    @Test
    public void testCalculateTotal()
    {
        
      
        /**
         * Test for customer without membership.
         */
        myCart.setMembership(false);
        myCart.add(new ItemOrder(new Item("UW Note Pad", new BigDecimal("10.04")), 6));
        myCart.add(new ItemOrder(new Item("'Java Rules!' buttom", new BigDecimal("5.00")), 10));
        assertEquals(new BigDecimal("35.96"), myCart.calculateTotal());
        
        /**
         * Test for customers with membership.
         */
        myCart.setMembership(true);
        assertEquals(new BigDecimal("15.04"), myCart.calculateTotal());
        
        
        
        /**
         * test for customer with Bulk Quantity without membership.
         */
        myCart.clear();
        myCart.setMembership(true);
        myCart.add(new ItemOrder(new Item("'Java Rules!' buttom", new BigDecimal("0.95"), 10, 
                                                  new BigDecimal("5.00")), 10));
        assertEquals(new BigDecimal("5.00"), myCart.calculateTotal());
        
        /**
         * Test for customer that buy bulk with membership
         */
        myCart.clear();
        myCart.setMembership(false);
        myCart.add(new ItemOrder(new Item("'Java Rules!' button", new BigDecimal("0.95"), 10, 
                                                  new BigDecimal("5.00")), 10));
        assertEquals(new BigDecimal("9.5"), myCart.calculateTotal());
    }
    /**
     * Test method for {@link Cart#toString()}.
     */
    @Test
    public void testToString()
    {
        myCart.add(new ItemOrder(new Item("UW Note Pad", new BigDecimal("10.04")), 6));
        myCart.add(new ItemOrder(new Item("'Java Rules!' buttom", new BigDecimal("5.00")), 10));
        assertEquals("{UW Note Pad, $10.04=6, 'Java Rules!' buttom, $5.00=10}", myCart.toString());
    }

}