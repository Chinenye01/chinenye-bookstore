/*
 * TCSS 305 Winter 2019
 * Assignment 2
 */

package tests;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import model.Cart;
import model.Item;

/**
 * This contains the tests for the Item class.
 * 
 * @author Chinenye Ezenwoye  chinenye@uw.edu
 * @version 
 */

public class ItemTest {
    
    /**
     * This will be used to tested in this class.
     */
   private Item myItem;
   
   /**
    * This will initialize the item for each test.
    */
   @Before
   public void setUp() {
       myItem = new Item("Ipad", new BigDecimal("349.95"));
   }
   
   /**
    * This will test the method {@link Item#hashCode()}.
    */
   @Test
   public void testHashCode() {
       /**
        * to check for equal hash code values.
        */
       final  Item itemOne = new Item("Ipad", new BigDecimal("349.95"));
       assertEquals(itemOne.hashCode(), myItem.hashCode());
   }
   
   /**
    * Test method {@link Item#getName()}.
    */
   @Test
   public void testGetName() {
       assertEquals("Constructor test failed", "Ipad", myItem.getName());
   }
   
   /**
    * Test method {@link Item#getPrice()}.
    */
   @Test
   public void testGetPrice() {
       
       /**
        * Test for items without bulk quantity.
        */
       assertEquals("Constructor test failed", new BigDecimal("349.95"), myItem.getPrice());
   }
       
   /**
    * Test for item with bulk quantity.
    */
   @Test
   public void testGetBulkQuantity() {
       
       /**
        * test for items without bulk quantity.
        */
       assertEquals("Constructor test failed", 0, myItem.getBulkQuantity());
       
       /**
        * test for items with bulk quantity.
        */
       Item itemTwo = new Item("Java Rules", new BigDecimal("0.95"), 10, new BigDecimal("5.00"));
       assertEquals("Constructor test failed", 10, itemTwo.getBulkQuantity());
   }
   
   /**
    * Test method {@link Item#getBulkPrice()}.
    */
   
   @Test
   public void testGetBulkPrice() {
       /**
        * Test for items without bulk quantity.
        */
       assertEquals("Constructor test item", null, myItem.getBulkPrice());
       
       /**
        * Test for items with bulk quantity.
        */
       Item itemThree = new Item("UW Note Pad", new BigDecimal("4.41"), 6, new BigDecimal("10.04"));
       assertEquals("Constructor test failed", new BigDecimal("10.04"), itemThree.getBulkPrice());
   }
   /**
    * Test method{@link Item#getisBulk()}.
    */
   @Test
   public void testIsBulk() {
       assertEquals("Constructor test failed", false, myItem.isBulk());
   }
   
   /**
    * Test method {@link Item#toString()}.
    */
   @Test
   public void testToString() {
       /**
        * Test for items without bulk
        */
       assertEquals("Ipad, $349.95", myItem.toString());
       
       /**
        * Test for items with Bulk
        */
//       Item itemFour = new Item("'Java Ruler' Bumper Sticker", new BigDecimal("0.99"), 20, 
//                                new BigDecimal("8.95"));
//       assertEquals("'Java Ruler' Bumper Sticker, $0.99 (20 for $8.95)", itemFour.toString());
   }
   
   
   /**
    * Test method {@link Item#equal()}.
    */
   
   @Test
   public void testEqual() {
       /**
        * To check is item in the cart is equal to 
        * return true and if not equal return false.
        */
       assertEquals(myItem, myItem);
       assertNotEquals(myItem, null);
       assertNotEquals(myItem, new Cart());
   }
}
