/*
 * TCSS 305 Winter 2019
 * Assignment 2
 */

package tests;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import model.Item;
import model.ItemOrder;
import org.junit.Before;
import org.junit.Test;

/**
 * This contains the tests for the ItemOrder class.
 * 
 * @author Chinenye Ezenwoye  chinenye@uw.edu
 * @version 
 */
public class ItemOrderTest
{

    /** The ItemOrder that will be used in the tests. */
    private ItemOrder myItemOrder;
    
    /**
     * This is a method to initialize the ItemOrder for each of the tests.
     */
    @Before
    public void setUp()
    {
        myItemOrder = new ItemOrder(new Item("UW Note Pad", new BigDecimal("10.04")), 6);
    }

    /**
     * Test method for {@link ItemOrder#getItem()}.
     */
    @Test
    public void testGetItem()
    {
        assertEquals(new Item("UW Note Pad ", new BigDecimal("10.04")), myItemOrder.getItem());
    }

    /**
     * Test method for {@link ItemOrder#getQuantity()}.
     */
    @Test
    public void testGetQuantity()
    {
        assertEquals(5, myItemOrder.getQuantity());
    }

    /**
     * Test method for {@link ItemOrder#toString()}.
     */
    @Test
    public void testToString()
    {
        assertEquals("UW Note Pad, $10.04, Quantity: 6", myItemOrder.toString());
    }
}
