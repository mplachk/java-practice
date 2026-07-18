/** A pet shop wants to give a discount to its clients if they buy one or more pets and at least five other items. The discount is equal to 20 percent of the cost of the other items, but not the pets. Use a class Item to describe an item, with any needed methods and a constructor
 * public Item(double price, boolean isPet, int quantity)
 * An invoice holds a collection of Item objects; use an array or array list to store them. In the Invoice class, implement methods
 * public void add(Item anItem)
 * public double getDiscount()
 * Write a program that prompts a cashier to enter each price and quantity, and then a Y for a pet or N for another item. Use a price of –1 as a sentinel. In the loop, call the add method; after the loop, call the getDiscount method and display the returned value.
 */

import java.util.ArrayList;

/**
 * Holds a collection of Items and calculates the discount a customer
 * qualifies for.
 */
public class Invoice {

    private ArrayList<Item> items;

    /** Creates an Invoice with no items. */
    public Invoice() {
        items = new ArrayList<Item>();
    }

    /** Adds an item to the invoice. */
    public void add(Item anItem) {
        items.add(anItem);
    }

    /**
     * Returns the discount: 20% of the cost of non-pet items, but only
     * if the invoice has at least one pet and at least five non-pet
     * items (by total quantity).
     */
    public double getDiscount() {
        boolean hasPet = false;
        int nonPetQuantity = 0;
        double nonPetCost = 0;

        for (Item item : items) {
            if (item.isPet()) {
                hasPet = true;
            } else {
                nonPetQuantity += item.getQuantity();
                nonPetCost += item.getTotalCost();
            }
        }

        if (hasPet && nonPetQuantity >= 5) {
            return 0.20 * nonPetCost;
        }
        return 0;
    }
}
