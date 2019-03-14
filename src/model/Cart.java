/**
 * TCSS 305 Winter 2019
 * 
 * Assignment 2
 */

package model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

/**
 * This class that will handle the customer purchase.
 * 
 * @author Chinenye Ezenwoye chinenye@uw.edu
 * 
 * @version 1
 *
 */

public class Cart {
    /**
     * To hold all the items in the cart.
     */
    
    public final Map<Item, Integer> myMap;
    
    /**
     * To give the discount to people with store membership.
     */
    private static final BigDecimal MEMBERSHIP_DIS = new BigDecimal("0.85");
    
    /**
     * To track the total of the total of item.
     */
    private BigDecimal myTotal;
    
    /**
     * To decide either the customer has membership or not.
     */
    private boolean myMembership;
    
    
    /**
     * This will create an empty shopping cart.
     */
    public Cart() {
        myMap = new HashMap<Item, Integer>();
    }
    
    /**
     * This will add items into the cart.
     * 
     * @param theOrder
     */
    public void add(final ItemOrder theOrder) {
        myMap.put(theOrder.getItem(), theOrder.getQuantity());
        
    }
    
    
    /**
     * This will give the Discount if the customer has a 
     * membership in the store then it is true. 
     * If the customer has no membership then 
     * it will return to true.
     * 
     * 
     * @param theMembership
     */


    public void setMembership(final boolean theMembership) {
        myMembership = theMembership;
    }
    
    /**
     * Find the total cost of everything in the
     * cart and return it.
     * 
     * @return BigDecimal value will represent the total in the cart.
     */
    public BigDecimal calculateTotal() {
        
        myTotal = BigDecimal.ZERO;
        for(Item i : myMap.keySet()) {
            if(i.isBulk()) {
                BigDecimal numberOfItem = new BigDecimal(myMap.get(i) 
                                                                / i.getBulkQuantity());
                myTotal = myTotal.add(numberOfItem.multiply(i.getBulkPrice()));
                BigDecimal numbersRegular = new BigDecimal(myMap.get(i) 
                                                                  % i.getBulkQuantity());
                myTotal = myTotal.add(numbersRegular.multiply(i.getPrice()));
            }
            else {
                myTotal = myTotal.add(i.getPrice().multiply(new BigDecimal(myMap.get(i))));
            }
        }
        if (myMembership && myTotal.compareTo(new BigDecimal("20.00")) == 1) {
            myTotal = myTotal.multiply(MEMBERSHIP_DIS);
        }
                
        return myTotal.setScale(2, RoundingMode.HALF_EVEN);
    }
    
    /**
     * Clear the cart for a new one
     */
    
    public void clear() {
        myMap.clear();
    }
    
    
    /**
     * Returns a string that will represents 
     * all of the item in the cart and the quantity.
     * 
     */
    @Override
    public String toString() {
        
        return myMap.toString();
    }

}
